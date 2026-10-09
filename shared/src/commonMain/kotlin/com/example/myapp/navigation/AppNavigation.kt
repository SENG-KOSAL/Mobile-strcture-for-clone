package com.example.myapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapp.ui.detail.DetailScreen
import com.example.myapp.ui.home.HomeScreen

object Routes {
    const val HOME = "home"
    const val DETAIL = "detail"
}

@Composable
fun AppNavigation() {
    val nav = rememberNavController()
    NavHost(nav, startDestination = Routes.HOME) {
        composable(Routes.HOME) {
            HomeScreen(onOpenDetail = { nav.navigate(Routes.DETAIL) })
        }
        composable(Routes.DETAIL) {
            DetailScreen(onBack = { nav.popBackStack() })
        }
    }
}
