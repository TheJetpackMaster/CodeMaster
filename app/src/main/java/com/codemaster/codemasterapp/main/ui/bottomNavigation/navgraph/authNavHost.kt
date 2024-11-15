package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.authNavHost(navController: NavController) {
    navigation(
        startDestination = "login",
        route = "auth"
    ){
        composable("login") {

        }

    }
}