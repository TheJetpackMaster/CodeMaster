package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes

sealed class MainRoutes(val route: String) {
    data object MAIN_ROOT : MainRoutes(route = "MAIN_ROOT")
    data object LevelSelectionScreen : MainRoutes(route = "levelselectionscreen")
    data object LessonListScreen : MainRoutes(route = "lessonlistscreen")
    data object LessonContentScreen : MainRoutes(route = "lessoncntentscreen")

}
