package com.proxyrack.control.domain

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.content.ContextCompat

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        if (intent?.action == Intent.ACTION_BOOT_COMPLETED ||
            intent?.action == "android.intent.action.QUICKBOOT_POWERON" ||
            intent?.action == "com.htc.intent.action.QUICKBOOT_POWERON") {
            Log.d("BootReceiver", "Boot completed, starting ConnectionService")
            val serviceIntent = Intent(context, ConnectionService::class.java)
            ContextCompat.startForegroundService(context, serviceIntent)
        }
    }
}
