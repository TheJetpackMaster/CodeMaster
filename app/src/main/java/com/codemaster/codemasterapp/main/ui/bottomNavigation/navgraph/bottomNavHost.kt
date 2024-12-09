package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
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
        composable(BottomNavRoutes.HomeScreen.route,
            popEnterTransition = {
                fadeIn(animationSpec = tween(250))
            },
            popExitTransition = {
                fadeOut(animationSpec = tween(250))
            },
            enterTransition = {
                fadeIn(animationSpec = tween(250))
            },
            exitTransition = {
                fadeOut(animationSpec = tween(250))
            }
        ) {

            HomeScreen(
                navController = navController,
                courseViewModel = courseViewModel
            )
        }

        composable(BottomNavRoutes.CompilerScreen.route,
            popEnterTransition = {
                fadeIn(animationSpec = tween(250))
            },
            popExitTransition = {
                fadeOut(animationSpec = tween(250))
            },
            enterTransition = {
                fadeIn(animationSpec = tween(250))
            },
            exitTransition = {
                fadeOut(animationSpec = tween(250))
            }
        ) {
            CompilerView()
        }

        composable(BottomNavRoutes.AchievementsScreen.route,
            popEnterTransition = {
                fadeIn(animationSpec = tween(250))
            },
            popExitTransition = {
                fadeOut(animationSpec = tween(250))
            },
            enterTransition = {
                fadeIn(animationSpec = tween(250))
            },
            exitTransition = {
                fadeOut(animationSpec = tween(250))
            }
        ) {
            AchievementScreen(navController = navController)
        }
    }
}