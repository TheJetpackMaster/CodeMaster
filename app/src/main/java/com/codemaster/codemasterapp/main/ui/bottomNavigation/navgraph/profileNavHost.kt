package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.SettingScreen
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.UserProfileScreen
import com.codemaster.codemasterapp.main.ui.learning.lessons.LanguageLevelScreen
import com.codemaster.codemasterapp.main.ui.learning.selection.LevelSelectionScreen

fun NavGraphBuilder.profileNavHost(navController: NavController) {
    navigation(
        startDestination = "Setting",
        route = "profile"
    ) {
        composable("UserProfile") {
            UserProfileScreen(navController)
        }

        composable("Setting") {
            SettingScreen(navController)
        }

    }
}