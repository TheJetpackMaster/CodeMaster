package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph;

import androidx.compose.runtime.Composable;
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.AuthRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel

@Composable
fun RootNavHost(
    navController: NavHostController,
    courseViewModel: CourseViewModel,
    noteViewModel: NoteViewModel,
) {

    // Main NavHost (for the entire app)
    NavHost(
        navController = navController, startDestination = ProfileRoutes.PROFILE_ROOT.route,
        route = "ROOT"
    ) {
        authNavHost(navController)
        bottomNavHost(
            navController = navController,
            courseViewModel = courseViewModel
        )
        mainNavHost(
            navController = navController,
            courseViewModel = courseViewModel,
            noteViewModel = noteViewModel
        )
        profileNavHost(
            navController = navController,
            noteViewModel = noteViewModel,
            courseViewModel
        )
    }
}
