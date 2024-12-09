package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph


import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.learning.lessons.LessonListScreen
import com.codemaster.codemasterapp.main.ui.learning.lessons.LessonContentScreen
import com.codemaster.codemasterapp.main.ui.learning.selection.LevelSelectionScreen
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel


fun NavGraphBuilder.mainNavHost(
    navController: NavController,
    courseViewModel: CourseViewModel,
    noteViewModel: NoteViewModel
) {
    navigation(
        startDestination = MainRoutes.LevelSelectionScreen.route,
        route = MainRoutes.MAIN_ROOT.route
    )
    {

        composable(MainRoutes.LevelSelectionScreen.route,
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
            LevelSelectionScreen(
                navController = navController,
                courseViewModel = courseViewModel,
                noteViewModel = noteViewModel
            )
        }

        composable(MainRoutes.LessonListScreen.route,
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
            LessonListScreen(
                navController = navController,
                courseViewModel = courseViewModel,
                noteViewModel = noteViewModel
            )
        }

        composable(MainRoutes.LessonContentScreen.route,
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
            LessonContentScreen(
                navController = navController,
                courseViewModel = courseViewModel,
                noteViewModel = noteViewModel,
            )
        }
    }
}