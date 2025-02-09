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
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.SplashRoutes
import com.codemaster.codemasterapp.main.ui.onboarding.OnBoardingScreen
import com.codemaster.codemasterapp.main.ui.splash.SplashScreen
import com.codemaster.codemasterapp.main.ui.viewModels.MainViewModel
import com.codemaster.codemasterapp.main.ui.viewModels.UserProfileViewModel

fun NavGraphBuilder.splashNavHost(
    mainViewModel: MainViewModel,
    navController: NavController) {
    navigation(
        startDestination = SplashRoutes.SplashScreen.route,
        route = SplashRoutes.SplashRoot.route
    ){
        composable(SplashRoutes.SplashScreen.route){
            SplashScreen(
                mainViewModel = mainViewModel,
                navController = navController)
        }
    }
}