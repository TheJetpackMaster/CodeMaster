package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.auth.LoginScreen
import com.codemaster.codemasterapp.main.ui.auth.PreRegistrationScreen
import com.codemaster.codemasterapp.main.ui.auth.RegisterGuestScreen
import com.codemaster.codemasterapp.main.ui.auth.ResetPasswordScreen
import com.codemaster.codemasterapp.main.ui.auth.SignUpScreen
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.AuthRoutes
import com.codemaster.codemasterapp.main.ui.onboarding.OnBoardingScreen

fun NavGraphBuilder.authNavHost(navController: NavController) {
    navigation(
        startDestination = AuthRoutes.OnboardingScreen.route,
        route = AuthRoutes.AUTH_ROOT.route
    ){
        composable(AuthRoutes.OnboardingScreen.route){
            OnBoardingScreen(navController)
        }

        composable(AuthRoutes.PreRegistrationScreen.route) {
            PreRegistrationScreen(navController)
        }
        composable(AuthRoutes.LoginScreen.route) {
            LoginScreen(navController)
        }
        composable(AuthRoutes.SignUpScreen.route) {
            SignUpScreen(navController)
        }

        composable(AuthRoutes.GuestScreen.route){
            RegisterGuestScreen(navController = navController)
        }

        composable(AuthRoutes.ResetPasswordScreen.route) {
            ResetPasswordScreen(navController)
        }
    }
}