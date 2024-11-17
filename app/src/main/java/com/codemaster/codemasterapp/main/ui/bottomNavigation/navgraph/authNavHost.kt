package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.auth.LoginScreen
import com.codemaster.codemasterapp.main.ui.auth.PreRegistrationScreen

fun NavGraphBuilder.authNavHost(navController: NavController) {
    navigation(
        startDestination = "login",
        route = "auth"
    ){
        composable("PreRegistration") {
            PreRegistrationScreen(navController)
        }
        composable("login") {
            LoginScreen(navController)
        }

    }
}