package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.learning.lessons.LessonListScreen
import com.codemaster.codemasterapp.main.ui.learning.lessons.LessonContentScreen
import com.codemaster.codemasterapp.main.ui.learning.selection.LevelSelectionScreen
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel


fun NavGraphBuilder.mainNavHost(
    navController: NavController,
    courseViewModel: CourseViewModel
) {
    navigation(
        startDestination = MainRoutes.LevelSelectionScreen.route,
        route = MainRoutes.MAIN_ROOT.route
    ) {
        composable(MainRoutes.LevelSelectionScreen.route) {
            LevelSelectionScreen(
                navController = navController,
                courseViewModel = courseViewModel
            )
        }
        composable(MainRoutes.LessonListScreen.route) {
            LessonListScreen(
                navController = navController,
                courseViewModel = courseViewModel
            )
        }

        composable(MainRoutes.LessonContentScreen.route) {
            LessonContentScreen(
                navController = navController,
                courseViewModel = courseViewModel
            )
        }
    }
}