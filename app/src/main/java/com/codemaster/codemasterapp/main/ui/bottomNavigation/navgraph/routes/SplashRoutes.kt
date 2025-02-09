package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes

sealed class SplashRoutes(val route: String){
    data object SplashRoot: SplashRoutes(route = "SPLASH_ROOT")
    data object SplashScreen : SplashRoutes(route = "splashscreen")
}

