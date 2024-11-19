package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.learning.lessons.LessonListScreen
import com.codemaster.codemasterapp.main.ui.learning.lessons.LessonContentScreen
import com.codemaster.codemasterapp.main.ui.learning.selection.LevelSelectionScreen


fun NavGraphBuilder.mainNavHost(navController: NavController) {
    navigation(
        startDestination = MainRoutes.LessonListScreen.route,
        route = MainRoutes.MAIN_ROOT.route
    ){
        composable(MainRoutes.LevelSelectionScreen.route){
            LevelSelectionScreen(navController)
        }
        composable(MainRoutes.LessonListScreen.route){
            LessonListScreen(navController)
        }
        
        composable(MainRoutes.LessonContentScreen.route){
            LessonContentScreen()
        }
    }
}