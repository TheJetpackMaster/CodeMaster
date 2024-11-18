package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes

sealed class BottomNavRoutes(val route: String) {
    data object BOTTOM_ROOT : BottomNavRoutes(route = "BOTTOM_ROOT")
    data object HomeScreen : BottomNavRoutes(route = "bottomsomescreen")
    data object AchievementsScreen: BottomNavRoutes(route = "bottomachievemementscreen")
    data object ExtraScreen: BottomNavRoutes(route = "extra")

}
