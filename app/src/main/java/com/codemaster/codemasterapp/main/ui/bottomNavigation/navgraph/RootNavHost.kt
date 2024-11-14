package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph;

import androidx.compose.runtime.Composable;
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RootNavHost(navController: NavHostController) {
    // Main NavHost (for the entire app)
    NavHost(
        navController = navController, startDestination = "auth",
        route = "root"
    ) {

        authNavHost(navController)
        bottomNavHost(navController)
        mainNavHost(navController)
    }
}
