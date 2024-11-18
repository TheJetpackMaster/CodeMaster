package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.auth.LoginScreen
import com.codemaster.codemasterapp.main.ui.auth.PreRegistrationScreen
import com.codemaster.codemasterapp.main.ui.auth.ResetPasswordScreen
import com.codemaster.codemasterapp.main.ui.auth.SignUpScreen

fun NavGraphBuilder.authNavHost(navController: NavController) {
    navigation(
        startDestination = "ResetPassword",
        route = "auth"
    ){
        composable("PreRegistration") {
            PreRegistrationScreen(navController)
        }
        composable("login") {
            LoginScreen(navController)
        }
        composable("SignUp") {
            SignUpScreen(navController)
        }
        composable("ResetPassword") {
            ResetPasswordScreen(navController)
        }

    }
}