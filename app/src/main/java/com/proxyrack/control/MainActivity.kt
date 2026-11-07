package com.proxyrack.control

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.TextButton
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.flow.MutableStateFlow

class MainActivity : ComponentActivity() {
    val termsDialogShowing = MutableStateFlow<Boolean>(true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val showTermsDialog by termsDialogShowing.collectAsState()
            if (showTermsDialog) {
                AlertDialog(
                    onDismissRequest = { finishAffinity() },
                    confirmButton = {
                        TextButton(onClick = { termsDialogShowing.value = false }) {
                            Text("I Agree & Accept")
                        }
                    },
                    dismissButton = {
                        TextButton(onClick = { finishAffinity() }) {
                            Text("Decline & Exit")
                        }
                    },
                    title = { Text("Terms of Service & User Agreement") },
                    text = { Text("Please accept terms to enable background proxy services.") }
                )
            }
        }
    }
}