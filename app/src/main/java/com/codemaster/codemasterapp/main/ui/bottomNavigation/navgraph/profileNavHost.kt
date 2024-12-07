package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.userProfileDetails.NoteScreen
import com.codemaster.codemasterapp.main.ui.userProfileDetails.SettingScreen
import com.codemaster.codemasterapp.main.ui.userProfileDetails.UserProfileScreen
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel

fun NavGraphBuilder.profileNavHost(
    navController: NavController,
    noteViewModel: NoteViewModel,
    courseViewModel: CourseViewModel
) {
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
        composable(ProfileRoutes.NoteScreen.route) {
            NoteScreen(navController, noteViewModel,courseViewModel)
        }
    }
}