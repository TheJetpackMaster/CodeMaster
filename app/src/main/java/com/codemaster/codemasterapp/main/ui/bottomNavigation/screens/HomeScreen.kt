package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.HomeScreenCustomTopBar
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.components.ContinueLearningCard
import com.codemaster.codemasterapp.main.ui.components.LanguageCardDesign
import com.codemaster.codemasterapp.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    val scrollState = rememberScrollState()
    Scaffold(
        topBar = {
            HomeScreenCustomTopBar(
                onProfileClick = {
                    navController.navigate(ProfileRoutes.PROFILE_ROOT.route)
                }
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF7F9FC)) // Soft background color for the main area
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
                            style = MaterialTheme.typography.titleMedium,
                            color = Color(0xFF2F3E4C)
                        )
                        /*IconButton(onClick = { /* Handle search */ }) {
                            Icon(
                                imageVector = Icons.Filled.Search,
                                contentDescription = "Search",
                                tint = Color(0xFF2F3E4C),
                                modifier = Modifier.size(24.dp)
                            )
                        }*/
                    }

                    Spacer(Modifier.height(4.dp))

                    // First Row of Language Cards
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        LanguageCardDesign(
                            languageName = "Python",
                            difficulty = "Beginner",
                            lessonCount = 40,
                            completedLessonCount = 30,
                            gradientColors = listOf(bluishPython, greenishPython),
                            languageImage = painterResource(id = R.drawable.pythonlogo),
                            onClick = {
                                navController.navigate(MainRoutes.MAIN_ROOT.route)
                            },
                            modifier = Modifier.weight(1f)
                        )

                        LanguageCardDesign(
                            languageName = "Java",
                            difficulty = "Medium",
                            lessonCount = 40,
                            completedLessonCount = 3,
                            gradientColors = listOf(yellowishJava, bluishJava),
                            languageImage = painterResource(id = R.drawable.java),
                            onClick = {
                                navController.navigate(MainRoutes.MAIN_ROOT.route)
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    Spacer(Modifier.height(16.dp))

                    // Second Row of Language Cards
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        LanguageCardDesign(
                            languageName = "Kotlin",
                            difficulty = "Beginner",
                            lessonCount = 40,
                            completedLessonCount = 20,
                            gradientColors = listOf(purpleKt, yellowishKt),
                            languageImage = painterResource(id = R.drawable.kotlin),
                            onClick = {
                                navController.navigate(MainRoutes.MAIN_ROOT.route)
                            },
                            modifier = Modifier.weight(1f)
                        )

                        LanguageCardDesign(
                            languageName = "C++",
                            difficulty = "Expert",
                            lessonCount = 40,
                            completedLessonCount = 30,
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            languageImage = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate(MainRoutes.MAIN_ROOT.route)
                            },
                            modifier = Modifier.weight(1f)
                        )

                    }


                    Column(modifier = Modifier.padding(bottom = 80.dp)) {
                        Spacer(Modifier.height(18.dp))
                        ContinueLearningCard(
                            completedLessons = 14,
                            totalLessons = 20,
                            levelName = "Introduction",
                            lessonName = "Variables Part 2",
                            progressPercentage = 0.7f,
                            paddingValues =PaddingValues(0.dp),
                            onContinueClick = {
                                navController.navigate(MainRoutes.LessonContentScreen.route)
                            }
                        )
                    }
                }
            }
        }
    )
}

