package com.proxyrack.control.domain

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkRequest
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import com.proxyrack.control.MainActivity
import com.proxyrack.control.R
import com.proxyrack.control.data.repository.ConnectionRepo
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ConnectionService : Service() {
    private val TAG = "ConnectionService"

    @Inject lateinit var connectionRepo: ConnectionRepo
    private var connectivityManager: ConnectivityManager? = null
    private var networkCallback: ConnectivityManager.NetworkCallback? = null

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
        registerNetworkCallback()
    }

    private fun registerNetworkCallback() {
        try {
            connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
            val builder = NetworkRequest.Builder()
            networkCallback = object : ConnectivityManager.NetworkCallback() {
                override fun onAvailable(network: Network) {
                    Log.d(TAG, "Internet connection restored, triggering auto-reconnect")
                    if (connectionRepo.connectionStatus.value != ConnectionStatus.Connected) {
                        connectionRepo.updateConnectionStatus(ConnectionStatus.Connecting)
                        connect()
                    }
                }

                override fun onLost(network: Network) {
                    Log.d(TAG, "Internet connection lost")
                    connectionRepo.updateConnectionStatus(ConnectionStatus.Disconnected)
                }
            }
            connectivityManager?.registerNetworkCallback(builder.build(), networkCallback!!)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to register network callback", e)
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        connect()
        return START_STICKY
    }

    private fun connect() {}

    override fun onBind(intent: Intent?): IBinder? = null

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(
                "ProxyControlForegroundServiceChannel",
                "Proxy Control Channel",
                NotificationManager.IMPORTANCE_HIGH
            )
            val manager = getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(serviceChannel)
        }
    }
}