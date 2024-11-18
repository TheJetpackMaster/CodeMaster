package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.AchievementScreen
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.HomeScreen


fun NavGraphBuilder.bottomNavHost(navController: NavController) {
    navigation(
        startDestination = BottomNavRoutes.HomeScreen.route,
        route = BottomNavRoutes.BOTTOM_ROOT.route
    ) {
        composable(BottomNavRoutes.HomeScreen.route) {
            HomeScreen(navController)
        }

        composable(BottomNavRoutes.AchievementsScreen.route) {
            AchievementScreen(navController)
        }
    }
}