package com.codemaster.codemasterapp.main.ui.learning.selection

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                    .background(color = Color(0xFF100F0F))
                    .padding(paddingValues),
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp) // Increase vertical space between elements
                ) {
                    // Title Text
                    Text(
                        text = "Select your learning stage:",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            horizontal = 16.dp,
                            vertical = 8.dp
                        ) // Extra padding for spacing
                    )

                    // Row for Easy, Medium cards
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp) // Increased spacing between cards
                    ) {
                        LevelSelectionCardDesign(
                            stageName = "Introduction",
                            lessonCount = 20,
                            completedLessonCount = 12,
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate("courseScreen/easy")
                            },
                            modifier = Modifier.weight(1f)
                        )

                        LevelSelectionCardDesign(
                            stageName = "Beginner",
                            lessonCount = 20,
                            completedLessonCount = 0,
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate("courseScreen/medium")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp) // Increased spacing between cards
                    ) {
                        LevelSelectionCardDesign(
                            stageName = "Intermediate",
                            lessonCount = 20,
                            completedLessonCount = 0,
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate("courseScreen/hard")
                            },
                            modifier = Modifier.weight(1f)
                        )

                        LevelSelectionCardDesign(
                            stageName = "Advanced",
                            lessonCount = 20,
                            completedLessonCount = 0,
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate("courseScreen/expert")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }
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
            .height(200.dp)
            .clip(RoundedCornerShape(bottomStart = 18.dp, bottomEnd = 18.dp))
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF255A70),   // Deep teal
                        Color(0xFF00A8E8),   // Bright cyan
                        Color(0xFF29C290)    // Neon orange
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
                            Color(0x33FFFFFF), // Translucent white
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
                    .scale(3f)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}


// SelectionCard

/*@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectionScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "CodeMaster",
                        color = Color(0xFFE5E5C2),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF255A70)
                ),
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF000000))
                    .padding(paddingValues)
            ) {
                Column(
                    horizontalAlignment = Alignment.Start, // Align items to start horizontally
                    //verticalArrangement = Arrangement.spacedBy(24.dp),
                    modifier = Modifier.fillMaxSize() // Ensure Column takes full size and aligns from top-left
                ) {
                    // Title and Divider
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp)
                            .padding(horizontal = 16.dp)
                    ) {
                        Text(
                            text = "Select Your Level:",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "select according to your knowledge:",
                            color = Color.White.copy(alpha = 0.5f),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }


                    // Cards Row (First Row with Easy and Medium)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp) // Adjusted spacing
                    ) {
                        // Easy card
                        SelectionCard(
                            stageName = "Easy",
                            gradientColors = listOf(
                                Color(0xFF0A2540),
                                Color(0xFF1D3557)
                            ), // Green gradient
                            icon = painterResource(id = R.drawable.cpp), // Replace with actual icon
                            onClick = {
                                //navController.navigate("courseScreen/easy")
                            },
                            modifier = Modifier.weight(1f)
                        )

                        // Medium card
                        SelectionCard(
                            stageName = "Medium",
                            gradientColors = listOf(
                                Color(0xFF0A2540),
                                Color(0xFF1D3557)
                            ), // Orange-Red gradient
                            icon = painterResource(id = R.drawable.cpp), // Replace with actual icon
                            onClick = {
                                //navController.navigate("courseScreen/medium")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    // Cards Row (Second Row with Hard and Expert)
                    /*Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp) // Adjusted spacing
                    ) {
                        // Hard card
                        SelectionCard(
                            stageName = "Hard",
                            gradientColors = listOf(
                                Color(0xFF0A2540),
                                Color(0xFF1D3557)
                            ), // Teal gradient

                            icon = painterResource(id = R.drawable.cpp), // Replace with actual icon
                            onClick = {
                                navController.navigate("courseScreen/hard")
                            },
                            modifier = Modifier.weight(1f)
                        )

                        // Expert card
                        SelectionCard(
                            stageName = "Expert",
                            gradientColors = listOf(Color(0xFF0A2540), Color(0xFF1D3557)),
                            icon = painterResource(id = R.drawable.cpp), // Replace with actual icon
                            onClick = {
                                navController.navigate("courseScreen/expert")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }*/

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp) // Adjusted spacing
                    ) {
                        // Hard card
                        SelectionCardDesign(
                            stageName = "Expert",
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            icon = painterResource(id = R.drawable.cpp),  // Use an appropriate icon for Expert
                            onClick = {
                                //navController.navigate("courseScreen/expert")
                            },
                            modifier = Modifier.weight(1f).padding(horizontal = 8.dp)
                        )

                        // Expert card
                        SelectionCardDesign(
                            stageName = "Expert",
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            icon = painterResource(id = R.drawable.cpp),  // Use an appropriate icon for Expert
                            onClick = {
                                //navController.navigate("courseScreen/expert")
                            },
                            modifier = Modifier.weight(1f).padding(horizontal = 8.dp)
                        )
                    }
                }
            }
        }
    )
}*/


// animated cards
/*@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectionScreen(navController: NavController) {
    val expandedCard = remember { mutableStateOf<String?>(null) } // Tracks the expanded card

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "CodeMaster",
                        color = Color(0xFFE5E5C2),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF202020))
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.linearGradient(
                            colors = listOf(Color(0xFF1A237E), Color(0xFF311B92), Color(0xFF4A148C))
                        )
                    )
                    .padding(paddingValues)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Title
                    Text(
                        text = "Choose Your Path",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = "Tap on a card to learn more!",
                        color = Color.White.copy(alpha = 0.7f),
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    // Level Cards
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        items(listOf("Easy", "Medium", "Hard", "Expert")) { level ->
                            GradientLevelCard(
                                levelName = level,
                                isExpanded = expandedCard.value == level,
                                gradientColors = getGradientColorsForLevel(level),
                                icon = painterResource(id = getIconForLevel(level)),
                                onClick = {
                                    expandedCard.value = if (expandedCard.value == level) null else level
                                },
                                onNavigate = {
                                    navController.navigate("courseScreen/$level")
                                }
                            )
                        }
                    }
                }
            }
        }
    )
}

@Composable
fun GradientLevelCard(
    levelName: String,
    isExpanded: Boolean,
    gradientColors: List<Color>,
    icon: Painter,
    onClick: () -> Unit,
    onNavigate: () -> Unit
) {
    val cardHeight = animateDpAsState(targetValue = if (isExpanded) 200.dp else 120.dp)
    val descriptionAlpha = animateFloatAsState(targetValue = if (isExpanded) 1f else 0f)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(cardHeight.value)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.linearGradient(gradientColors))
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = icon,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(48.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = levelName,
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

                // Expanded Content
                if (isExpanded) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "This level is suitable for $levelName learners. Dive in to test your skills!",
                        color = Color.White.copy(alpha = descriptionAlpha.value),
                        fontSize = 14.sp,
                        modifier = Modifier.alpha(descriptionAlpha.value)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = onNavigate) {
                        Text(text = "Start $levelName")
                    }
                }
            }
        }
    }
}

fun getGradientColorsForLevel(level: String): List<Color> {
    return when (level) {
        "Easy" -> listOf(Color(0xFF81C784), Color(0xFF388E3C), Color(0xFF1B5E20))
        "Medium" -> listOf(Color(0xFFFFD54F), Color(0xFFF9A825), Color(0xFFF57F17))
        "Hard" -> listOf(Color(0xFFE57373), Color(0xFFD32F2F), Color(0xFFB71C1C))
        "Expert" -> listOf(Color(0xFF64B5F6), Color(0xFF1976D2), Color(0xFF0D47A1))
        else -> listOf(Color.Gray, Color.DarkGray)
    }
}

fun getIconForLevel(level: String): Int {
    return when (level) {
        "Easy" -> R.drawable.cpp // Replace with appropriate resource
        "Medium" -> R.drawable.cpp // Replace with appropriate resource
        "Hard" -> R.drawable.cpp // Replace with appropriate resource
        "Expert" -> R.drawable.cpp // Replace with appropriate resource
        else -> R.drawable.cpp // Fallback resource
    }
}*/

