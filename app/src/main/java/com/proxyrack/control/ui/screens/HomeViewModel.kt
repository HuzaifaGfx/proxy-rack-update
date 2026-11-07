package com.proxyrack.control.ui.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import com.proxyrack.control.data.repository.ConnectionRepo
import com.proxyrack.control.domain.ConnectionServiceLauncher
import com.proxyrack.control.domain.ConnectionStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val connServiceLauncher: ConnectionServiceLauncher,
    private val connectionRepo: ConnectionRepo,
) : ViewModel() {

    suspend fun initializationTasksFinished() {
        if (connectionRepo.connectionStatus.value == ConnectionStatus.Disconnected) {
            connectionRepo.addLogMessage("Auto-connecting to mobile proxy...")
            connectionRepo.updateConnectionStatus(ConnectionStatus.Connecting)
            connect()
        }
    }

    private fun connect() {
        connServiceLauncher.connect()
    }
}