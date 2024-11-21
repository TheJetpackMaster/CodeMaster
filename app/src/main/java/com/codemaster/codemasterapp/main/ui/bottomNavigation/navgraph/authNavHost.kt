package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.auth.LoginScreen
import com.codemaster.codemasterapp.main.ui.auth.PreRegistrationScreen
import com.codemaster.codemasterapp.main.ui.auth.ResetPasswordScreen
import com.codemaster.codemasterapp.main.ui.auth.SignUpScreen
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.AuthRoutes

fun NavGraphBuilder.authNavHost(navController: NavController) {
    navigation(
        startDestination = AuthRoutes.SignUpScreen.route,
        route = AuthRoutes.AUTH_ROOT.route
    ){
        composable(AuthRoutes.PreRegistrationScreen.route) {
            PreRegistrationScreen(navController)
        }
        composable(AuthRoutes.LoginScreen.route) {
            LoginScreen(navController)
        }
        composable(AuthRoutes.SignUpScreen.route) {
            SignUpScreen(navController)
        }
        composable(AuthRoutes.ResetPasswordScreen.route) {
            ResetPasswordScreen(navController)
        }
    }
}