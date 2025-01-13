package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph;

import android.content.Context
import android.util.Log
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.ui.platform.LocalContext
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
import com.codemaster.codemasterapp.main.ui.viewModels.UserProfileViewModel

@Composable
fun RootNavHost(
    navController: NavHostController,
    courseViewModel: CourseViewModel,
    noteViewModel: NoteViewModel,
    userProfileViewModel: UserProfileViewModel,
    courses: List<Course> = emptyList<Course>(),
    allLessonsStatus: State<Map<String, LessonStatus>>
) {

    val context = LocalContext.current
    val sharedPreferences = context.getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
    val isSignedUp = sharedPreferences.getBoolean("isSignedUp", false)
    Log.d("RootNavHost", "isSignedUp: $isSignedUp")

    // Main NavHost (for the entire app)
    NavHost(
        navController = navController,
        startDestination = if (isSignedUp) BottomNavRoutes.BOTTOM_ROOT.route else AuthRoutes.AUTH_ROOT.route,
        route = "ROOT"
    ) {
        authNavHost(
            userProfileViewModel,
            navController
        )
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
            courseViewModel = courseViewModel,
            userProfileViewModel = userProfileViewModel
        )
    }
}
