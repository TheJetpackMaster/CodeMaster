package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.AchievementScreen
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.CompilerView
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.HomeScreen
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel


fun NavGraphBuilder.bottomNavHost(
    navController: NavController,
    courseViewModel: CourseViewModel
) {
    navigation(
        startDestination = BottomNavRoutes.HomeScreen.route,
        route = BottomNavRoutes.BOTTOM_ROOT.route
    ) {
        composable(BottomNavRoutes.HomeScreen.route) {
            HomeScreen(
                navController = navController,
                courseViewModel = courseViewModel
            )
        }

        composable(BottomNavRoutes.CompilerScreen.route) {
            CompilerView()
        }

        composable(BottomNavRoutes.AchievementsScreen.route) {
            AchievementScreen(navController = navController)
        }
    }
}