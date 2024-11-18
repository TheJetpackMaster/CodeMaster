package com.codemaster.codemasterapp.main.ui.learning.selection


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.components.LevelSelectionCardDesign
import com.airbnb.lottie.compose.rememberLottieComposition
import com.airbnb.lottie.compose.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.components.ContinueLearningCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelSelectionScreen(navController: NavController) {
    Scaffold(
        topBar = {
            VibrantTopBarWithLottie()
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF7F9FC))
//                    .background(Color.Transparent)
                    .padding(paddingValues)
                    .verticalScroll(state = rememberScrollState()),
            ) {
                Column(
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    // Title Text
                    Text(
                        text = "Select your learning stage:",
                        color = Color(0xFF2F3E4C),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.padding(
                            start = 8.dp,
                            bottom = 4.dp
                        ) // Extra padding for spacing
                    )

                    // Row for Easy, Medium cards
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp) // Increased spacing between cards
                    ) {
                        LevelSelectionCardDesign(
                            stageName = "Introduction",
                            lessonCount = 20,
                            completedLessonCount = 12,
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate(MainRoutes.LessonListScreen.route)
                            },
                            modifier = Modifier.weight(1f)
                        )

                        LevelSelectionCardDesign(
                            stageName = "Beginner",
                            lessonCount = 20,
                            completedLessonCount = 0,
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate(MainRoutes.LessonListScreen.route)
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    Spacer(Modifier.height(14.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp) // Increased spacing between cards
                    ) {
                        LevelSelectionCardDesign(
                            stageName = "Intermediate",
                            lessonCount = 20,
                            completedLessonCount = 0,
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate(MainRoutes.LessonListScreen.route)
                            },
                            modifier = Modifier.weight(1f)
                        )

                        LevelSelectionCardDesign(
                            stageName = "Advanced",
                            lessonCount = 20,
                            completedLessonCount = 0,
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate(MainRoutes.LessonListScreen.route)
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    Spacer(Modifier.height(18.dp))


                    ContinueLearningCard(
                        completedLessons = 14,
                        totalLessons = 20,
                        levelName = "Introduction",
                        lessonName = "Variables Part 2",
                        progressPercentage = 0.7f,
                        paddingValues = PaddingValues(horizontal = 8.dp),
                        onContinueClick = {
                            navController.navigate(MainRoutes.LessonContentScreen.route)
                        }
                    )

                }
            }
        }
    )
}

@Composable
fun VibrantTopBarWithLottie() {
    // Remember Lottie composition
    val composition = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.codinglotie))

    // Animate the Lottie composition with looping enabled
    val progress = animateLottieCompositionAsState(
        composition = composition.value,
        iterations = LottieConstants.IterateForever
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF1B3C5D),   // Dark teal
                        Color(0xFF0089CF),   // Electric blue
                        Color(0xFF22E57B)    // Vibrant green
                    ),
                    start = Offset(0f, 0f),
                    end = Offset(1000f, 1000f)
                )
            )
    ) {
        // Layer 1: Soft radial overlay for lighting
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            Color(0x33FFFFFF), // Soft white glow
                            Color.Transparent
                        ),
                        center = Offset(400f, 100f),
                        radius = 700f
                    )
                )
        )

        // Layer 2: Textured diagonal lines
        Canvas(modifier = Modifier.fillMaxSize()) {
            for (i in 0..10) {
                drawLine(
                    color = Color(0x22FFFFFF), // Faint diagonal texture
                    start = Offset(0f, size.height * i / 10),
                    end = Offset(size.width, size.height * (i + 0.5f) / 10),
                    strokeWidth = 1.5f
                )
            }
        }

        // Layer 3: Vibrant gradient circles for futuristic accents
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawCircle(
                color = Color(0x88F5A623), // Warm golden hue
                radius = 120f,
                center = Offset(size.width * 0.4f, size.height * 0.3f)
            )
            drawCircle(
                color = Color(0x55FF57B2), // Magenta-pink glow
                radius = 180f,
                center = Offset(size.width * 0.7f, size.height * 0.8f)
            )
        }

        // Layer 4: Lottie animation
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LottieAnimation(
                composition = composition.value,
                progress = { progress.value },
                modifier = Modifier
                    .scale(3.3f)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}

