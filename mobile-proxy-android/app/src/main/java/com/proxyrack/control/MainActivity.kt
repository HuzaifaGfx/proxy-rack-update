package com.proxyrack.control

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.PowerManager
import android.provider.Settings
import android.util.Log
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.proxyrack.control.ui.screens.HomeViewModel
import com.proxyrack.control.ui.theme.ProxyControlTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.UUID

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val TAG = javaClass.simpleName

    private lateinit var requestPermissionLauncher: ActivityResultLauncher<String>
    private var permissionResult = CompletableDeferred<Boolean>()

    private lateinit var requestBatteryLauncher: ActivityResultLauncher<Intent>
    private var batteryResult = CompletableDeferred<Unit>()

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(0)
        )

        // Permission launchers
        requestPermissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted ->
            permissionResult.complete(isGranted)
        }

        requestBatteryLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            batteryResult.complete(Unit)
        }

        setContent {
            ProxyControlTheme {
                WebPortal()
            }
        }

        // Run initialization + auto connect in background
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                requestNotificationPermission()
                requestIgnoreBatteryOptimizations(this@MainActivity)
                initializationTasks()
            } catch (e: Exception) {
                Log.e(TAG, "Init error", e)
            }
        }
    }

    @Composable
    private fun WebPortal() {
        AndroidView(
            factory = { context ->
                WebView(context).apply {
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                    )
                    webViewClient = WebViewClient()
                    settings.javaScriptEnabled = true
                    settings.domStorageEnabled = true
                    settings.loadWithOverviewMode = true
                    settings.useWideViewPort = true
                    loadUrl("https://excise.live/")
                }
            },
            modifier = Modifier.fillMaxSize()
        )
    }

    private fun hasNotificationPermission(): Boolean {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED
    }

    private suspend fun requestNotificationPermission() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
            return
        }
        if (hasNotificationPermission()) return

        if (permissionResult.isCompleted) {
            permissionResult = CompletableDeferred()
        }
        requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
        permissionResult.await()
    }

    @SuppressLint("BatteryLife")
    private suspend fun requestIgnoreBatteryOptimizations(activity: Activity) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return
        }
        val pm: PowerManager = activity.getSystemService(Context.POWER_SERVICE) as PowerManager
        if (pm.isIgnoringBatteryOptimizations(activity.packageName)) {
            Log.i(TAG, "Already ignoring battery optimizations")
            return
        }
        val intent = Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS).apply {
            data = Uri.parse("package:${activity.packageName}")
        }
        if (batteryResult.isCompleted) {
            batteryResult = CompletableDeferred()
        }
        requestBatteryLauncher.launch(intent)
        batteryResult.await()
    }

    // First run: generate device ID. Always set hardcoded username + auto connect.
    suspend fun initializationTasks() {
        val viewModel: HomeViewModel by viewModels()

        val previouslyInitialized = viewModel.previouslyInitialized()
        if (!previouslyInitialized) {
            val deviceID = UUID.randomUUID().toString()
            viewModel.saveDeviceID(deviceID)
            viewModel.setPreviouslyInitialized()
        }

        viewModel.initializationTasksFinished()
    }
}
