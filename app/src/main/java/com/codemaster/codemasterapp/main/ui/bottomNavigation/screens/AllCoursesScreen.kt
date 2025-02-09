package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.codemaster.codemasterapp.main.ui.components.LanguageCardDesign
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.ui.theme.purpleKt
import com.codemaster.codemasterapp.ui.theme.yellowishKt
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.userProfileDetails.settings.showToast
import com.codemaster.codemasterapp.ui.theme.bluishJava
import com.codemaster.codemasterapp.ui.theme.bluishPython
import com.codemaster.codemasterapp.ui.theme.greenishPython
import com.codemaster.codemasterapp.ui.theme.magentaCpp
import com.codemaster.codemasterapp.ui.theme.purpleCpp
import com.codemaster.codemasterapp.ui.theme.yellowishJava
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllCourses(
    courseViewModel: CourseViewModel,
    allLessonsStatus: State<Map<String, LessonStatus>>,
    navController: NavController
) {

    val context = LocalContext.current

    val courses = courseViewModel.courses


    // Get last saved stage name
    val coroutineScope = rememberCoroutineScope()
    val stageNames = remember { mutableStateOf<Map<String, String?>>(emptyMap()) }


    // Fetch stage names when the composable is loaded
    LaunchedEffect(courses) {
        coroutineScope.launch {
            val courseIds = courses.map { it.id } // Assuming `id` is the course ID
            stageNames.value = courseViewModel.loadStageNamesForCourses(courseIds)
        }
    }

    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            TopAppBar(
                navigationIcon = {

                    OutlinedIconButton(
                        onClick = {
                            if (navController.currentBackStackEntry?.lifecycle?.currentState
                                == Lifecycle.State.RESUMED
                            ) {
                                navController.popBackStack()
                            }
                        },
                        modifier = Modifier
                            .statusBarsPadding()
                            .padding(start = 8.dp)
                            .size(36.dp),
                        border = BorderStroke(
                            1.3.dp,
                            color = Color.LightGray.copy(alpha = 0.4f)
                        ), // Light border with transparency
                        colors = IconButtonDefaults.outlinedIconButtonColors(
                            containerColor = Color.White.copy(.08f),
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "",
                            modifier = Modifier.size(26.dp),
                            tint = Color.White.copy(alpha = 0.8f) // White icon with some transparency for the glass effect
                        )
                    }
                },

                title = {
                    Text(
                        modifier = Modifier.padding(start = 24.dp),
                        text = "All Courses",
                        color = Color.White
                    )

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0x990F263D) // Desired dark gradient tone
                ),
                modifier = Modifier.shadow(
                    .5.dp,
                    ambientColor = Color.White,
                    spotColor = Color.White
                )

            )
        }
    ){ innerPadding->
        LazyColumn(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ){

            items(courses){course ->
                // Directly calculate the completed lessons for the current course
                val completedLessons = course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        allLessonsStatus.value[lesson.id] == LessonStatus.COMPLETED
                    }
                }

                val isComingSoon = when (course.name) {
                    "C" -> false
                    "C++" -> false
                    "Python" -> true
                    "DSA | C++" -> false
                    else -> false
                }

                // Fetch the stage name (difficulty) for the current course
                val difficulty = stageNames.value[course.id] ?: "Beginner"


                LanguageCardDesign(
                    languageName = course.name,
                    difficulty = difficulty,
                    lessonCount = course.stages.sumOf { it.lessons.size },
                    completedLessonCount = completedLessons,
                    gradientColors = when (course.name) {
                        "C" -> listOf(purpleKt, yellowishKt)
                        "C++" -> listOf(purpleCpp, magentaCpp)
                        "Python" -> listOf(bluishPython, greenishPython)
                        "DSA | C++" -> listOf(yellowishJava, bluishJava)
                        else -> listOf(purpleKt, yellowishKt)
                    },
                    languageImage = when (course.name) {
                        "C" -> painterResource(id = R.drawable.clang)
                        "C++" -> painterResource(id = R.drawable.cpp)
                        "Python" -> painterResource(id = R.drawable.pythonlogo)
                        "DSA | C++" -> painterResource(id = R.drawable.cpp)
                        else -> painterResource(id = R.drawable.kotlin)
                    },
                    comingSoon = when (course.name) {
                        "C" -> false
                        "C++" -> false
                        "Python" -> true
                        "DSA | C++" -> false
                        else -> false
                    },
                    onClick = {
                        courseViewModel.selectLanguage(course)
                        if (isComingSoon) {
                            showToast(context = context,"Course Coming Soon...")
                        } else {
                            if (navController.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED) {
                                navController.navigate(MainRoutes.MAIN_ROOT.route)
                            }
                        }
                    },
                    modifier = Modifier
                )
            }
        }
    }
}