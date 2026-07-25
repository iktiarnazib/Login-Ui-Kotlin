package com.iktiarnazib.loginapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.rememberSplineBasedDecay
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.internal.NavContext
import com.iktiarnazib.loginapplication.ui.theme.LoginApplicationTheme
import com.iktiarnazib.loginapplication.auth.RegisterPage
import com.iktiarnazib.loginapplication.auth.LoginScreen
import com.iktiarnazib.loginapplication.auth.RegisterPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginApplicationTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "login"){
                    composable("login") {
                        LoginScreen {
                            navController.navigate("register")
                        }

                    }
                    composable("register") {
                        RegisterPage {
                            navController.navigate("login")
                        }
                    }
                }
            }
        }
    }
}