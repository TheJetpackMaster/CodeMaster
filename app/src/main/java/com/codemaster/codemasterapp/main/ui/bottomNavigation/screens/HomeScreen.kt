package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.components.LanguageCardDesign
import com.codemaster.codemasterapp.ui.theme.bluishJava
import com.codemaster.codemasterapp.ui.theme.bluishPython
import com.codemaster.codemasterapp.ui.theme.greenishPython
import com.codemaster.codemasterapp.ui.theme.magentaCpp
import com.codemaster.codemasterapp.ui.theme.purpleCpp
import com.codemaster.codemasterapp.ui.theme.purpleKt
import com.codemaster.codemasterapp.ui.theme.yellowishJava
import com.codemaster.codemasterapp.ui.theme.yellowishKt

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {


    Scaffold(
        topBar = {
            TopAppBar(
                expandedHeight = 45.dp,
                title = {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.Top
                    ) {
                        Text("CodeMaster", color = Color(0xFFE5E5C2))
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF255A70),

                    ),
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF000000)) // Light background color
                    .padding(paddingValues)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp),
                    ) {
                        Text(text = "Popular courses:")
                    }

                    Spacer(Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)

                    ) {
                        LanguageCardDesign(
                            languageName = "Python",
                            difficulty = "Beginner",
                            lessonCount = 40,
                            completedLessonCount = 30,
                            gradientColors = listOf(bluishPython, greenishPython),
                            languageImage = painterResource(id = R.drawable.pythonlogo),
                            onClick = { /* Handle navigation or other actions */ },
                            modifier = Modifier
                                .weight(1f),
                        )

                        LanguageCardDesign(
                            languageName = "Java",
                            difficulty = "Medium",
                            lessonCount = 40,
                            completedLessonCount = 3,
                            gradientColors = listOf(yellowishJava, bluishJava),
                            languageImage = painterResource(id = R.drawable.java),
                            onClick = { /* Handle navigation or other actions */ },
                            modifier = Modifier
                                .weight(1f)
                        )

                    }

                    Spacer(Modifier.height(6.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(4.dp)

                    ) {
                        LanguageCardDesign(
                            languageName = "Kotlin",
                            difficulty = "Beginner",
                            lessonCount = 40,
                            completedLessonCount = 20,
                            gradientColors = listOf(purpleKt, yellowishKt),
                            languageImage = painterResource(id = R.drawable.kotlin),
                            onClick = { /* Handle navigation or other actions */ },
                            modifier = Modifier
                                .weight(1f),
                        )

                        LanguageCardDesign(
                            languageName = "C++",
                            difficulty = "Expert",
                            lessonCount = 40,
                            completedLessonCount = 30,
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            languageImage = painterResource(id = R.drawable.cpp),
                            onClick = { /* Handle navigation or other actions */ },
                            modifier = Modifier
                                .weight(1f)
                        )

                    }
                }
            }
        }
    )
}

// Data class to represent language information
data class LanguageData(
    val name: String,
    val icon: Painter
)
