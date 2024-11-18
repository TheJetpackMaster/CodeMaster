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
                    modifier = Modifier.padding(vertical = 18.dp)
                ) {
                    // Title Text
                    Text(
                        text = "Select your learning stage:",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(
                            start = 18.dp,
                            end = 16.dp,
                            bottom = 8.dp
                        ) // Extra padding for spacing
                    )

                    // Row for Easy, Medium cards
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp),
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
                            .padding(horizontal = 12.dp),
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
                        paddingValues = PaddingValues(horizontal = 14.dp),
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
        iterations = LottieConstants.IterateForever // Loop infinitely
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .clip(RoundedCornerShape(bottomStart = 18.dp, bottomEnd = 18.dp))
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF255A70),   // Deep teal
                        Color(0xFF00A8E8),   // Bright cyan
                        Color(0xFF3DC493)    // Neon orange
                    ),
                    start = Offset(0f, 0f),
                    end = Offset(500f, 500f)
                )
            )
    ) {
        // Layer 1: Secondary overlay gradient for depth
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            Color(0x5BBB7373), // Translucent white
                            Color.Transparent
                        ),
                        center = Offset(200f, 100f), // Center the highlight
                        radius = 400f
                    )
                )
        )

        // Layer 2: Diagonal lines for texture
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawLine(
                color = Color(0x99FFFFFF), // Semi-transparent white
                start = Offset(0f, size.height * 0.25f),
                end = Offset(size.width, size.height * 0.75f),
                strokeWidth = 2f
            )
            drawLine(
                color = Color(0x33FFFFFF),
                start = Offset(0f, size.height * 0.75f),
                end = Offset(size.width, size.height * 0.25f),
                strokeWidth = 2f
            )
        }

        // Layer 3: Vibrant gradient circles for a futuristic glow
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawCircle(
                color = Color(0x55D5AA1B), // Gold, semi-transparent
                radius = 100f,
                center = Offset(size.width * 0.3f, size.height * 0.5f)
            )
            drawCircle(
                color = Color(0x44FF1493), // Hot pink, semi-transparent
                radius = 150f,
                center = Offset(size.width * 0.7f, size.height * 0.7f)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Lottie Animation
            LottieAnimation(
                composition = composition.value,
                progress = { progress.value },
                modifier = Modifier
                    .fillMaxSize()
                    .scale(3.3f)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}
