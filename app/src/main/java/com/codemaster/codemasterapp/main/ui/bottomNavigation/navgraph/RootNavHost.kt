package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.LessonStatus
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
    courses:List<Course> = emptyList<Course>(),
    allLessonsStatus: State<Map<String, LessonStatus>>
) {

    // Main NavHost (for the entire app)
    NavHost(
        navController = navController, startDestination = AuthRoutes.AUTH_ROOT.route,
        route = "ROOT"
    ) {
        authNavHost(navController)
        bottomNavHost(
            navController = navController,
            courseViewModel = courseViewModel,
            courses = courses,
            allLessonsStatus = allLessonsStatus
        )
        mainNavHost(
            navController = navController,
            courseViewModel = courseViewModel,
            noteViewModel = noteViewModel,
            courses = courses,
            allLessonsStatus = allLessonsStatus
        )
        profileNavHost(
            navController = navController,
            noteViewModel = noteViewModel,
            courseViewModel
        )
    }
}
