package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.components.HomeScreenCustomTopBar
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.components.ContinueLearningCard
import com.codemaster.codemasterapp.main.ui.components.LanguageCardDesign
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.ui.theme.*
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    courseViewModel: CourseViewModel,
    courses: List<Course> = emptyList<Course>(),
    allLessonsStatus: State<Map<String, LessonStatus>>
) {
    val scrollState = rememberScrollState()
    val completedLessonCount = remember { mutableStateOf(0) }
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


    LaunchedEffect(Unit) {
        courseViewModel.loadLastSavedProgress()
    }

    Log.d("home", "home")
    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            HomeScreenCustomTopBar(
                onProfileClick = {
                    if (navController.currentBackStackEntry?.lifecycle?.currentState
                        == Lifecycle.State.RESUMED
                    ) {
                        navController.navigate(ProfileRoutes.PROFILE_ROOT.route)
                    }
                }
            )
        }
    ) { paddingValues ->


        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(scrollState)
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                // Title + Search Icon
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Popular courses",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color(0xFFFFFFFF),
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(
                            start = 2.dp,
                            bottom = 2.dp
                        )
                    )
                }

                Spacer(Modifier.height(4.dp))

                // Row of Language Cards
                courses.chunked(2).forEach { pair ->
                    // Language cards
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        pair.forEachIndexed { index, course ->

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

                                    } else {
                                        if (navController.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED) {
                                            navController.navigate(MainRoutes.MAIN_ROOT.route)
                                        }
                                    }
                                },
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }

                    Spacer(Modifier.height(8.dp)) // Space between rows
                }


//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.spacedBy(10.dp)
//                ) {
//                    courses.take(2).forEachIndexed { index, course ->
//                        val completedLessons = completedLessonCounts.getOrNull(index) ?: 0
//
//                        LanguageCardDesign(
//                            languageName = course.language,
//                            difficulty = "Beginner",
//                            lessonCount = course.stages.sumOf { it.lessons.size },
//                            completedLessonCount = completedLessons,
//                            gradientColors = when (course.language) {
//                                "C" -> listOf(purpleKt, yellowishKt)
//                                "C++" -> listOf(purpleCpp, magentaCpp)
//                                else -> listOf(purpleKt, yellowishKt)
//                            },
//                            languageImage = when (course.language) {
//                                "C" -> painterResource(id = R.drawable.cpp)
//                                "C++" -> painterResource(id = R.drawable.cpp)
//                                else -> painterResource(id = R.drawable.kotlin)
//                            },
//                            onClick = {
//                                courseViewModel.selectLanguage(course)
//                                if (navController.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED) {
//                                    navController.navigate(MainRoutes.MAIN_ROOT.route)
//                                }
//                            },
//                            modifier = Modifier.weight(1f)
//                        )
//                    }
//                }
//
//                Spacer(Modifier.height(16.dp))
//
//                // Second Row of Language Cards
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.spacedBy(10.dp)
//                ) {
//                    courses.drop(2).take(2).forEachIndexed { index, course ->
//                        val completedLessons = completedLessonCounts.getOrNull(index + 2) ?: 0
//
//                        LanguageCardDesign(
//                            languageName = course.language,
//                            difficulty = "Beginner",
//                            lessonCount = course.stages.sumOf { it.lessons.size },
//                            completedLessonCount = completedLessons,
//                            gradientColors = when (course.language) {
//                                "Python" -> listOf(bluishPython, greenishPython)
//                                else -> listOf(purpleKt, yellowishKt)
//                            },
//                            languageImage = when (course.language) {
//                                "Python" -> painterResource(id = R.drawable.pythonlogo)
//                                else -> painterResource(id = R.drawable.kotlin)
//                            },
//                            onClick = {
//                                courseViewModel.selectLanguage(course)
//                                navController.navigate(MainRoutes.MAIN_ROOT.route)
//                            },
//                            modifier = Modifier.weight(1f)
//                        )
//                    }
//                    LanguageCardDesign(
//                        languageName = "Java",
//                        difficulty = "Medium",
//                        lessonCount = 40,
//                        completedLessonCount = 3,
//                        gradientColors = listOf(yellowishJava, bluishJava),
//                        languageImage = painterResource(id = R.drawable.java),
//                        onClick = {
//                            navController.navigate(MainRoutes.MAIN_ROOT.route)
//                        },
//                        modifier = Modifier.weight(1f)
//                    )


                //Continue
                Column(modifier = Modifier.padding(bottom = 80.dp)) {

                    val lastSavedProgress = courseViewModel.lastSavedProgress.collectAsState()


                    lastSavedProgress.value?.let { (courseId, stageId, lessonId, subLessonId, subLessonName, stageName, subLessonIndex) ->
                        // Find the course and stage from the list
                        val course = courses.find { it.id == courseId }
                        val stage = course?.stages?.find { it.id == stageId }

                        // Optionally, find the lesson and sub-lesson using lessonId and subLessonId if needed
                        val lesson = stage?.lessons?.find { it.id == lessonId }


                        // Completed Sub-Lessons (Lesson Contents)
                        val completedSubLessons = stage!!.lessons.sumOf { lesson ->
                            lesson.lessonContents.count { content -> allLessonsStatus.value[content.id] == LessonStatus.COMPLETED }

                        }

                        // Progress
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Continue where you left:",
                                style = MaterialTheme.typography.bodyLarge,
                                color = Color(0xFFFFFFFF),
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(
                                    start = 4.dp,
                                    bottom = 6.dp
                                )
                            )
                        }


                        ContinueLearningCard(
                            completedLessons = completedSubLessons,
                            totalLessons = stage.lessons.sumOf { it.lessonContents.size },
                            levelName = stageName,
                            lessonName = subLessonName,
                            progressPercentage = (completedSubLessons.toFloat()
                                .toFloat() / (stage.lessons.sumOf { it.lessonContents.size }).toFloat()),
                            paddingValues = PaddingValues(0.dp),
                            decorativeLogo =
                            when (course.name) {
                                "C" -> R.drawable.clang
                                "C++" -> R.drawable.cpp
                                else -> {
                                    R.drawable.kotlin
                                }
                            },
                            onContinueClick = {
                                courseViewModel.selectLanguage(course)
                                courseViewModel.selectStage(stage)
                                courseViewModel.selectLesson(lesson!!)
                                courseViewModel.selectSubLessonIndex(subLessonIndex)


                                // Add two more screens to the back stack and navigate to the final screen
                                navController.navigate(MainRoutes.LevelSelectionScreen.route) {
                                    // Add the StageSelectionScreen to the back stack
                                    launchSingleTop =
                                        true  // Ensures that this screen is added to the stack only once
                                    popUpTo(MainRoutes.LevelSelectionScreen.route) {
                                        inclusive = false
                                    }
                                }

                                navController.navigate(MainRoutes.LessonListScreen.route) {
                                    // Add the LessonListScreen to the back stack
                                    launchSingleTop = true
                                    popUpTo(MainRoutes.LessonListScreen.route) { inclusive = false }
                                }

                                // Finally, navigate to the LessonContentScreen
                                navController.navigate(MainRoutes.LessonContentScreen.route) {
                                    // This will ensure we don't end up with duplicates in the back stack
                                    popUpTo(MainRoutes.LessonContentScreen.route) {
                                        inclusive = false
                                    }
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}


//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreen(navController: NavController) {
//    val scrollState = rememberScrollState()
//    Scaffold(
//        containerColor = Color.Transparent,
//        topBar = {
//            HomeScreenCustomTopBar(
//                onProfileClick = {
//                    navController.navigate(ProfileRoutes.PROFILE_ROOT.route)
//                }
//            )
//        }
//    ) { paddingValues ->
//
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues)
//
//        ) {
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .verticalScroll(scrollState)
//                    .padding(horizontal = 8.dp, vertical = 8.dp),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//
//                // Title + Search Icon
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 8.dp),
//                    horizontalArrangement = Arrangement.SpaceBetween,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Text(
//                        text = "Popular courses",
//                        style = MaterialTheme.typography.bodyLarge,
//                        color = Color(0xFFFFFFFF),
//                        fontWeight = FontWeight.SemiBold,
//                        modifier = Modifier.padding(
//                            start = 2.dp,
//                            bottom = 2.dp
//                        )
//                    )
//                }
//
//                Spacer(Modifier.height(4.dp))
//
//                // First Row of Language Cards
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.spacedBy(10.dp)
//                ) {
//                    LanguageCardDesign(
//                        languageName = "Python",
//                        difficulty = "Beginner",
//                        lessonCount = 40,
//                        completedLessonCount = 30,
//                        gradientColors = listOf(bluishPython, greenishPython),
//                        languageImage = painterResource(id = R.drawable.pythonlogo),
//                        onClick = {
//                            navController.navigate(MainRoutes.MAIN_ROOT.route)
//                        },
//                        modifier = Modifier.weight(1f)
//                    )
//
//                    LanguageCardDesign(
//                        languageName = "Java",
//                        difficulty = "Medium",
//                        lessonCount = 40,
//                        completedLessonCount = 3,
//                        gradientColors = listOf(yellowishJava, bluishJava),
//                        languageImage = painterResource(id = R.drawable.java),
//                        onClick = {
//                            navController.navigate(MainRoutes.MAIN_ROOT.route)
//                        },
//                        modifier = Modifier.weight(1f)
//                    )
//                }
//
//                Spacer(Modifier.height(16.dp))
//
//                // Second Row of Language Cards
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.spacedBy(10.dp)
//                ) {
//                    LanguageCardDesign(
//                        languageName = "Kotlin",
//                        difficulty = "Beginner",
//                        lessonCount = 40,
//                        completedLessonCount = 20,
//                        gradientColors = listOf(purpleKt, yellowishKt),
//                        languageImage = painterResource(id = R.drawable.kotlin),
//                        onClick = {
//                            navController.navigate(MainRoutes.MAIN_ROOT.route)
//                        },
//                        modifier = Modifier.weight(1f)
//                    )
//
//                    LanguageCardDesign(
//                        languageName = "C++",
//                        difficulty = "Expert",
//                        lessonCount = 40,
//                        completedLessonCount = 30,
//                        gradientColors = listOf(purpleCpp, magentaCpp),
//                        languageImage = painterResource(id = R.drawable.cpp),
//                        onClick = {
//                            navController.navigate(MainRoutes.MAIN_ROOT.route)
//                        },
//                        modifier = Modifier.weight(1f)
//                    )
//
//                }
//
//
//                //Continue
//                Column(modifier = Modifier.padding(bottom = 80.dp)) {
//                    // Progress
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(top = 14.dp),
//                        horizontalArrangement = Arrangement.SpaceBetween,
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        Text(
//                            text = "Continue where you left:",
//                            style = MaterialTheme.typography.bodyLarge,
//                            color = Color(0xFFFFFFFF),
//                            fontWeight = FontWeight.Medium,
//                            modifier = Modifier.padding(
//                                start = 4.dp,
//                                bottom = 6.dp
//                            )
//                        )
//                    }
//                    ContinueLearningCard(
//                        completedLessons = 14,
//                        totalLessons = 20,
//                        levelName = "Introduction",
//                        lessonName = "Variables Part 2",
//                        progressPercentage = 0.7f,
//                        paddingValues = PaddingValues(0.dp),
//                        onContinueClick = {
//                            navController.navigate(MainRoutes.LessonContentScreen.route)
//                        }
//                    )
//                }
//            }
//        }
//    }
//}
//
