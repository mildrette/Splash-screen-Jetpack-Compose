package com.example.splashscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.splashscreen.ui.theme.SplashScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            SplashScreenTheme {
                Welcome()


//               Box(modifier = Modifier.fillMaxSize(),
//                   contentAlignment = Alignment.Center) {
//Greeting("Welcome to this App")
//                }
            }
        }
    }
}
