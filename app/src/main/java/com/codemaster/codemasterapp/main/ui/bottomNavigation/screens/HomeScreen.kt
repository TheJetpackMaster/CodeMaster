package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.components.HomeScreenCustomTopBar
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.components.ContinueLearningCard
import com.codemaster.codemasterapp.main.ui.components.LanguageCardDesign
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.ui.theme.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    courseViewModel: CourseViewModel
) {
    val scrollState = rememberScrollState()
    val completedLessonCount = remember { mutableStateOf(0) }




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


                val courses = courseViewModel.courses

                // First Row of Language Cards
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    courses.take(2).forEach { course ->
                        completedLessonCount.value = course.stages.sumOf { stage ->
                            stage.lessons.count { lesson -> lesson.status == LessonStatus.COMPLETED }
                        }
                        LanguageCardDesign(
                            languageName = course.language,
                            difficulty = "Beginner",
                            lessonCount = course.stages.sumOf { it.lessons.size },
                            completedLessonCount = completedLessonCount.value,
                            gradientColors = when (course.language) {
                                "C" -> listOf(purpleKt, yellowishKt)
                                "C++" -> listOf(purpleCpp, magentaCpp)
                                else -> listOf(purpleKt, yellowishKt)
                            },
                            languageImage = when (course.language) {
                                "C" -> painterResource(id = R.drawable.cpp)
                                "C++" -> painterResource(id = R.drawable.cpp)
                                else -> painterResource(id = R.drawable.kotlin)
                            },
                            onClick = {
                                courseViewModel.selectLanguage(course)
                                if (navController.currentBackStackEntry?.lifecycle?.currentState
                                    == Lifecycle.State.RESUMED
                                ) {
                                    navController.navigate(MainRoutes.MAIN_ROOT.route)
                                }
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

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

                }

                Spacer(Modifier.height(16.dp))

                // Second Row of Language Cards
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    courses.drop(2).take(2).forEach { course ->
                        LanguageCardDesign(
                            languageName = course.language,
                            difficulty = "Beginner",
                            lessonCount = course.stages.sumOf { it.lessons.size },
                            completedLessonCount = 30,
                            gradientColors = listOf(bluishPython, greenishPython),
                            languageImage = painterResource(id = R.drawable.pythonlogo),
                            onClick = {
                                courseViewModel.selectLanguage(course)
                                navController.navigate(MainRoutes.MAIN_ROOT.route)
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

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
                }


                //Continue
                Column(modifier = Modifier.padding(bottom = 80.dp)) {
                    // Progress
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 14.dp),
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
                        completedLessons = 14,
                        totalLessons = 20,
                        levelName = "Introduction",
                        lessonName = "Variables Part 2",
                        progressPercentage = 0.7f,
                        paddingValues = PaddingValues(0.dp),
                        onContinueClick = {
                            navController.navigate(MainRoutes.LessonContentScreen.route)
                        }
                    )
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
