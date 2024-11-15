package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation


fun NavGraphBuilder.mainNavHost(navController: NavController) {
    navigation(
        startDestination = "test",
        route = "main"
    ){
        composable("test"){
//            main(navController)
        }
    }
}