package com.example.myapp

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.myapp.navigation.AppNavigation
import com.example.myapp.ui.theme.AppTheme

/** Root composable — the same UI runs on Android (MainActivity) and iOS (MainViewController). */
@Composable
fun App() {
    AppTheme {
        Surface {
            AppNavigation()
        }
    }
}
