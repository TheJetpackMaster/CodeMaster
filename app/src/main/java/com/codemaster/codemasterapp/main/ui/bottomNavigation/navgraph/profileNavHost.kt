package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
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
import com.codemaster.codemasterapp.main.ui.viewModels.UserProfileViewModel

fun NavGraphBuilder.profileNavHost(
    navController: NavController,
    noteViewModel: NoteViewModel,
    courseViewModel: CourseViewModel,
    userProfileViewModel: UserProfileViewModel
) {
    navigation(
        startDestination = ProfileRoutes.UserProfileScreen.route,
        route = ProfileRoutes.PROFILE_ROOT.route
    ) {
        composable(ProfileRoutes.UserProfileScreen.route,
            enterTransition = {
                scaleIn(
                    initialScale = 0.95f,
                    animationSpec = tween(160)
                ) + fadeIn(animationSpec = tween(100))
            },
            exitTransition = {
                scaleOut(
                    targetScale = .95f,
                    animationSpec = tween(160)
                ) + fadeOut(animationSpec = tween(150))
            },
            popEnterTransition = {
                scaleIn(initialScale = .95f, animationSpec = tween(160)) + fadeIn(
                    animationSpec = tween(100)
                )
            },
            popExitTransition = {
                scaleOut(
                    targetScale = .95f,
                    animationSpec = tween(160)
                ) + fadeOut(animationSpec = tween(150))
            }
        ) {
            UserProfileScreen(
                navController,
                noteViewModel,
                userProfileViewModel)
        }

        composable(ProfileRoutes.SettingsScreen.route,
            enterTransition = {
                scaleIn(
                    initialScale = 0.95f,
                    animationSpec = tween(160)
                ) + fadeIn(animationSpec = tween(100))
            },
            exitTransition = {
                scaleOut(
                    targetScale = .95f,
                    animationSpec = tween(160)
                ) + fadeOut(animationSpec = tween(150))
            },
            popEnterTransition = {
                scaleIn(
                    initialScale = .95f,
                    animationSpec = tween(160)
                ) + fadeIn(animationSpec = tween(100))
            },
            popExitTransition = {
                scaleOut(
                    targetScale = .95f,
                    animationSpec = tween(160)
                ) + fadeOut(animationSpec = tween(150))
            }) {
            SettingScreen(navController)
        }
        composable(ProfileRoutes.NoteScreen.route,
            enterTransition = {
                scaleIn(
                    initialScale = 0.95f,
                    animationSpec = tween(160)
                ) + fadeIn(animationSpec = tween(100))
            },
            exitTransition = {
                scaleOut(
                    targetScale = .95f,
                    animationSpec = tween(160)
                ) + fadeOut(animationSpec = tween(150))
            },
            popEnterTransition = {
                scaleIn(initialScale = .95f, animationSpec = tween(160)) + fadeIn(
                    animationSpec = tween(
                        100
                    )
                )
            },
            popExitTransition = {
                scaleOut(
                    targetScale = .95f,
                    animationSpec = tween(160)
                ) + fadeOut(animationSpec = tween(150))
            }
        ) {
            NoteScreen(navController, noteViewModel, courseViewModel)
        }
    }
}