package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes


sealed class ProfileRoutes(val route: String) {
    data object PROFILE_ROOT : ProfileRoutes(route = "PROFILE_ROOT")
    data object UserProfileScreen : ProfileRoutes(route = "userprofilescreen")
    data object SettingsScreen : ProfileRoutes(route = "settingsscreen")
}
