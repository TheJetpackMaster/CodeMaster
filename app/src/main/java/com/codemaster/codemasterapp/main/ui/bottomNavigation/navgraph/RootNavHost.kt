package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph;

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.codemaster.codemasterapp.main.ui.viewModels.NoteViewModel
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.SplashRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.main.ui.viewModels.MainViewModel
import com.codemaster.codemasterapp.main.ui.viewModels.UserProfileViewModel

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun RootNavHost(
    navController: NavHostController,
    courseViewModel: CourseViewModel,
    noteViewModel: NoteViewModel,
    userProfileViewModel: UserProfileViewModel,
    mainViewModel: MainViewModel,
    courses: List<Course> = emptyList<Course>(),
    allLessonsStatus: State<Map<String, LessonStatus>>,
    context: Context
) {

    //Is First Time
    val isFirstTime = mainViewModel.isFirstTime.collectAsState()

    // Main NavHost (for the entire app)
    NavHost(
        navController = navController,
        startDestination =
//        SplashRoutes.SplashRoot.route
        BottomNavRoutes.BOTTOM_ROOT.route
        ,
        route = "ROOT"
    ) {
        splashNavHost(
            mainViewModel = mainViewModel,
            navController = navController
        )

        authNavHost(
            userProfileViewModel,
            mainViewModel,
            navController,
            isFirstTime = isFirstTime.value
        )
        bottomNavHost(
            navController = navController,
            courseViewModel = courseViewModel,
            userProfileViewModel = userProfileViewModel,
            mainViewModel = mainViewModel,
            courses = courses,
            allLessonsStatus = allLessonsStatus,
            context =  context
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
            userProfileViewModel = userProfileViewModel,
            mainViewModel = mainViewModel
        )
    }
}
