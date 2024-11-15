package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.HomeScreen


fun NavGraphBuilder.bottomNavHost(navController: NavController) {
    navigation(
        startDestination = "home",
        route = "bottom"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("settings") {
            settings(navController)
        }
    }
}