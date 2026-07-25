package com.iktiarnazib.loginapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.iktiarnazib.loginapplication.ui.theme.LoginApplicationTheme
import com.iktiarnazib.loginapplication.auth.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginApplicationTheme {
                LoginScreen()
            }
        }
    }
}