package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.learning.selection.LevelSelectionScreen


fun NavGraphBuilder.mainNavHost(navController: NavController) {
    navigation(
        startDestination = "StageSelection",
        route = "main"
    ){
        composable("StageSelection"){
            LevelSelectionScreen(navController)
        }
    }
}