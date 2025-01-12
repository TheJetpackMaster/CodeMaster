package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes

sealed class AuthRoutes(val route: String) {
    data object OnboardingScreen : AuthRoutes(route = "onboardingscreen")
    data object AUTH_ROOT : AuthRoutes(route = "AUTH_ROOT")
    data object PreRegistrationScreen : AuthRoutes(route = "preregistrationscreen")
    data object SignUpScreen : AuthRoutes(route = "signupscreen")
    data object LoginScreen : AuthRoutes(route = "loginscreen")
    data object GuestScreen : AuthRoutes(route = "guestscreen")
    data object ResetPasswordScreen : AuthRoutes(route = "resetpassword")
}
