package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation


fun NavGraphBuilder.bottomNavHost(navController: NavController) {
    navigation(
        startDestination = "home",
        route = "bottom"
    ) {
        composable("home") {
           home(navController)
        }
        composable("settings") {
            settings(navController)
        }
    }
}