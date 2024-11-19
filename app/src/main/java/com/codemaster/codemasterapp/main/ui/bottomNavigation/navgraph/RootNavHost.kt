package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph;

import androidx.compose.runtime.Composable;
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.AuthRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes

@Composable
fun RootNavHost(navController: NavHostController) {
    // Main NavHost (for the entire app)
    NavHost(
        navController = navController, startDestination = BottomNavRoutes.BOTTOM_ROOT.route,
        route = "ROOT"
    ) {
        authNavHost(navController)
        bottomNavHost(navController)
        mainNavHost(navController)
        profileNavHost(navController)
    }
}
