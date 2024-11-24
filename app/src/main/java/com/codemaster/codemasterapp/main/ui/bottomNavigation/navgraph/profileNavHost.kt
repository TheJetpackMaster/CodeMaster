package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.userProfileDetails.SettingScreen
import com.codemaster.codemasterapp.main.ui.userProfileDetails.UserProfileScreen

fun NavGraphBuilder.profileNavHost(navController: NavController, noteViewModel: NoteViewModel) {
    navigation(
        startDestination = ProfileRoutes.UserProfileScreen.route,
        route = ProfileRoutes.PROFILE_ROOT.route
    ) {
        composable(ProfileRoutes.UserProfileScreen.route) {
            UserProfileScreen(navController, noteViewModel)
        }

        composable(ProfileRoutes.SettingsScreen.route) {
            SettingScreen(navController)
        }
    }
}