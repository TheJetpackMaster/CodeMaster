package com.codemaster.codemasterapp.main.ui.learning.selection


import android.util.Log
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.res.painterResource
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.viewModelScope
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.data.LearningProgress
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.components.ContinueLearningCard
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelSelectionScreen(
    navController: NavController,
    courseViewModel: CourseViewModel,
    noteViewModel: NoteViewModel,
    allLessonsStatus: State<Map<String, LessonStatus>>
) {

    val cardGradientColors1 = listOf(
//        Color(0xFF245FA4),
//        Color(0xFF5FD5BB)
        Color(0xFF175D67), // Cyan
        Color(0xFF009688)  // Teal
    )

    val selectedCourse by courseViewModel.selectedCourse.collectAsState()
    val progress = remember { mutableStateOf<LearningProgress?>(null) }




    LaunchedEffect(Unit) {
        progress.value = courseViewModel.loadLastSavedProgressForLanguage(selectedCourse!!.id)
    }


    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            VibrantTopBarWithLottie(
                onBackClick = {
                    if (navController.currentBackStackEntry?.lifecycle?.currentState
                        == Lifecycle.State.RESUMED
                    ) {
                        navController.popBackStack()
                    }
                }
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .verticalScroll(state = rememberScrollState()),
            ) {
                Column(
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    // Title Text
                    Text(
                        text = "Select your learning stage:",
                        style = MaterialTheme.typography.titleMedium,
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(
                            start = 10.dp,
                            bottom = 4.dp
                        )
                    )



                    selectedCourse?.stages?.chunked(2)?.forEach { stagePair ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp),
                            horizontalArrangement = Arrangement.spacedBy(10.dp) // Increased spacing between cards
                        ) {
                            // For each pair of stages, create two cards
                            stagePair.forEachIndexed {index, stage ->
                                // Calculate the completed lessons for the current stage
                                val completedLessons = stage.lessons.count { lesson ->
                                    allLessonsStatus.value[lesson.id] == LessonStatus.COMPLETED
                                }

                                LevelSelectionCardDesign(
                                    gradientColors = cardGradientColors1,
                                    stageName = stage.title, // Stage name dynamically
                                    lessonCount = stage.lessons.size, // Lesson count dynamically
                                    completedLessonCount = completedLessons, // Completed lessons
                                    icon = painterResource(id = R.drawable.cpp), // This could be dynamic based on language
                                    onClick = {
                                        // Navigate to lesson list, passing the selected stage
                                        courseViewModel.selectStage(stage)
                                        if (navController.currentBackStackEntry?.lifecycle?.currentState
                                            == Lifecycle.State.RESUMED
                                        ) {
                                            navController.navigate(MainRoutes.LessonListScreen.route)
                                        }
                                    },
                                    modifier = Modifier.weight(.5f) // Distribute the space equally
                                )
                            }
                        }
                        Spacer(Modifier.height(14.dp)) // Space between rows
                    }


                    Spacer(Modifier.height(18.dp))

                    Log.d("LevelSelectionScreen", "Progress: $progress")

                    // Saved Lesson Status
                    val allLessonsStatus = courseViewModel.lessonCompletionStatus.collectAsState()
                    val courses = courseViewModel.courses


                    progress.value?.let { (courseId, stageId, lessonId, subLessonId, subLessonName, stageName, subLessonIndex) ->
                        // Find the course and stage from the list
                        val course = courses.find { it.id == courseId }
                        val stage = course?.stages?.find { it.id == stageId }

                        // Optionally, find the lesson and sub-lesson using lessonId and subLessonId if needed
                        val lesson = stage?.lessons?.find { it.id == lessonId }


                        // Completed Sub-Lessons (Lesson Contents)
                        val completedSubLessons = stage!!.lessons.sumOf { lesson ->
                            lesson.lessonContents.count { content -> allLessonsStatus.value[content.id] == LessonStatus.COMPLETED }

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
                            when (course.language) {
                                "C" -> R.drawable.clang
                                "C++" -> R.drawable.cpp
                                else -> {
                                    R.drawable.kotlin
                                }
                            },
                            gradientColors = listOf(
                                Color(0xFF82E9FF), // Light Blue
                                Color(0xFF00B4DB)  // Cyan Blue
                            ),
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

//
//                    ContinueLearningCard(
//                        completedLessons = 14,
//                        totalLessons = 20,
//                        levelName = "Introduction",
//                        lessonName = "Variables Part 2",
//                        progressPercentage = 0.7f,
//                        paddingValues = PaddingValues(horizontal = 8.dp),
//                        onContinueClick = {
//                            navController.navigate(MainRoutes.LessonContentScreen.route)
//                        },
//                        gradientColors = listOf(
//                            Color(0xFF82E9FF), // Light Blue
//                            Color(0xFF00B4DB)  // Cyan Blue
//                        ),
//                        levelTextColor = Color(0xFF0B3D2E), // Darker green to match the level card text color
//                        lessonTextColor = Color(0xFF558776), // Muted greenish tone to harmonize with level text color
//                        progressBarColor = Color(0xFF007B93), // Muted Cyan for progress bar to match gradient colors
//                        progressBarTrackColor = Color(0xFFC4E4F3), // Light cyan for track, ensuring consistency with the progress bar
//                        buttonBackgroundColor = Color(0xFF007B93), // Button color matches the progress bar color for a cohesive look
//                        buttonTextColor = Color.White, // White button text for high contrast
//                        buttonText = "Resume",
//                        buttonTextSize = 12.sp,
//                        buttonHeight = 38.dp,
//                        // If you want an animated border color for the button:
//                        animatedButtonBorderColor1 = Color(0xFF007B93), // Darker blue for animated border
//                        animatedButtonBorderColor2 = Color(0xFF00B4DB)  // Lighter cyan for animated border transition
//                    )
                }
            }
        }
    )
}

@Composable
fun VibrantTopBarWithLottie(
    onBackClick: () -> Unit
) {

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

        OutlinedIconButton(
            onClick = {
                onBackClick()
            },
            modifier = Modifier
                .statusBarsPadding()
                .padding(start = 12.dp, top = 13.dp)
                .size(36.dp),
            border = BorderStroke(
                1.3.dp,
                color = Color.LightGray.copy(alpha = 0.5f)
            ), // Light border with transparency
            colors = IconButtonDefaults.outlinedIconButtonColors(
                containerColor = Color.White.copy(.08f),
                contentColor = Color.White.copy(alpha = 0.9f)
            )
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = "",
                modifier = Modifier.size(26.dp),
                tint = Color.White.copy(alpha = 0.8f) // White icon with some transparency for the glass effect
            )
        }

    }
}


//
//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LevelSelectionScreen(navController: NavController) {
//
//    val cardGradientColors1 = listOf(
////        Color(0xFF245FA4),
////        Color(0xFF5FD5BB)
//        Color(0xFF175D67), // Cyan
//        Color(0xFF009688)  // Teal
//    )
//
//
//    Scaffold(
//        containerColor = Color.Transparent,
//        topBar = {
//            VibrantTopBarWithLottie(
//                onBackClick = {
//                    navController.popBackStack()
//                }
//            )
//        },
//        content = { paddingValues ->
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
////                    .background(Color(0xFFF7F9FC))
////                    .background(Color.Transparent)
//                    .padding(paddingValues)
//                    .verticalScroll(state = rememberScrollState()),
//            ) {
//                Column(
//                    modifier = Modifier.padding(top = 16.dp)
//                ) {
//                    // Title Text
//                    Text(
//                        text = "Select your learning stage:",
//                        style = MaterialTheme.typography.titleMedium,
//                        color = Color(0xFFFFFFFF),
//                        modifier = Modifier.padding(
//                            start = 10.dp,
//                            bottom = 4.dp
//                        )
//                    )
//
//                    // Row for Easy, Medium cards
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(horizontal = 8.dp),
//                        horizontalArrangement = Arrangement.spacedBy(10.dp) // Increased spacing between cards
//                    ) {
//                        LevelSelectionCardDesign(
//                            gradientColors = cardGradientColors1,
//                            stageName = "Introduction",
//                            lessonCount = 20,
//                            completedLessonCount = 12,
//                            icon = painterResource(id = R.drawable.cpp),
//                            onClick = {
//                                navController.navigate(MainRoutes.LessonListScreen.route)
//                            },
//                            modifier = Modifier.weight(1f)
//                        )
//
//                        LevelSelectionCardDesign(
//                            gradientColors = cardGradientColors1,
//                            stageName = "Beginner",
//                            lessonCount = 20,
//                            completedLessonCount = 0,
//                            icon = painterResource(id = R.drawable.cpp),
//                            onClick = {
//                                navController.navigate(MainRoutes.LessonListScreen.route)
//                            },
//                            modifier = Modifier.weight(1f)
//                        )
//                    }
//
//                    Spacer(Modifier.height(14.dp))
//
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(horizontal = 8.dp),
//                        horizontalArrangement = Arrangement.spacedBy(10.dp) // Increased spacing between cards
//                    ) {
//                        LevelSelectionCardDesign(
//                            gradientColors = cardGradientColors1,
//                            stageName = "Intermediate",
//                            lessonCount = 20,
//                            completedLessonCount = 0,
//                            icon = painterResource(id = R.drawable.cpp),
//                            onClick = {
//                                navController.navigate(MainRoutes.LessonListScreen.route)
//                            },
//                            modifier = Modifier.weight(1f)
//                        )
//
//                        LevelSelectionCardDesign(
//                            gradientColors = cardGradientColors1,
//                            stageName = "Advanced",
//                            lessonCount = 20,
//                            completedLessonCount = 0,
//                            icon = painterResource(id = R.drawable.cpp),
//                            onClick = {
//                                navController.navigate(MainRoutes.LessonListScreen.route)
//                            },
//                            modifier = Modifier.weight(1f)
//                        )
//                    }
//
//                    Spacer(Modifier.height(18.dp))
//
//
//                    ContinueLearningCard(
//                        completedLessons = 14,
//                        totalLessons = 20,
//                        levelName = "Introduction",
//                        lessonName = "Variables Part 2",
//                        progressPercentage = 0.7f,
//                        paddingValues = PaddingValues(horizontal = 8.dp),
//                        onContinueClick = {
//                            navController.navigate(MainRoutes.LessonContentScreen.route)
//                        },
//                        gradientColors = listOf(
//                            Color(0xFF82E9FF), // Light Blue
//                            Color(0xFF00B4DB)  // Cyan Blue
//                        ),
//                        levelTextColor = Color(0xFF0B3D2E), // Darker green to match the level card text color
//                        lessonTextColor = Color(0xFF558776), // Muted greenish tone to harmonize with level text color
//                        progressBarColor = Color(0xFF007B93), // Muted Cyan for progress bar to match gradient colors
//                        progressBarTrackColor = Color(0xFFC4E4F3), // Light cyan for track, ensuring consistency with the progress bar
//                        buttonBackgroundColor = Color(0xFF007B93), // Button color matches the progress bar color for a cohesive look
//                        buttonTextColor = Color.White, // White button text for high contrast
//                        buttonText = "Resume",
//                        buttonTextSize = 12.sp,
//                        buttonHeight = 38.dp,
//                        // If you want an animated border color for the button:
//                        animatedButtonBorderColor1 = Color(0xFF007B93), // Darker blue for animated border
//                        animatedButtonBorderColor2 = Color(0xFF00B4DB)  // Lighter cyan for animated border transition
//                    )
//                }
//            }
//        }
//    )
//}
//
//@Composable
//fun VibrantTopBarWithLottie(
//    onBackClick:()->Unit
//) {
//
//    val composition = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.codinglotie))
//
//    // Animate the Lottie composition with looping enabled
//    val progress = animateLottieCompositionAsState(
//        composition = composition.value,
//        iterations = LottieConstants.IterateForever
//    )
//
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(180.dp)
//            .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
//            .background(
//                Brush.linearGradient(
//                    colors = listOf(
//                        Color(0xFF1B3C5D),   // Dark teal
//                        Color(0xFF0089CF),   // Electric blue
//                        Color(0xFF22E57B)    // Vibrant green
//                    ),
//                    start = Offset(0f, 0f),
//                    end = Offset(1000f, 1000f)
//                )
//            )
//    ) {
//        // Layer 1: Soft radial overlay for lighting
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(
//                    Brush.radialGradient(
//                        colors = listOf(
//                            Color(0x33FFFFFF), // Soft white glow
//                            Color.Transparent
//                        ),
//                        center = Offset(400f, 100f),
//                        radius = 700f
//                    )
//                )
//        )
//
//        // Layer 2: Textured diagonal lines
//        Canvas(modifier = Modifier.fillMaxSize()) {
//            for (i in 0..10) {
//                drawLine(
//                    color = Color(0x22FFFFFF), // Faint diagonal texture
//                    start = Offset(0f, size.height * i / 10),
//                    end = Offset(size.width, size.height * (i + 0.5f) / 10),
//                    strokeWidth = 1.5f
//                )
//            }
//        }
//
//        // Layer 3: Vibrant gradient circles for futuristic accents
//        Canvas(modifier = Modifier.fillMaxSize()) {
//            drawCircle(
//                color = Color(0x88F5A623), // Warm golden hue
//                radius = 120f,
//                center = Offset(size.width * 0.4f, size.height * 0.3f)
//            )
//            drawCircle(
//                color = Color(0x55FF57B2), // Magenta-pink glow
//                radius = 180f,
//                center = Offset(size.width * 0.7f, size.height * 0.8f)
//            )
//        }
//
//        // Layer 4: Lottie animation
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .statusBarsPadding(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            LottieAnimation(
//                composition = composition.value,
//                progress = { progress.value },
//                modifier = Modifier
//                    .scale(3.3f)
//                    .align(Alignment.CenterHorizontally)
//            )
//        }
//
//        OutlinedIconButton(
//            onClick = {
//                onBackClick()
//            },
//            modifier = Modifier
//                .statusBarsPadding()
//                .padding(start = 12.dp, top = 13.dp)
//                .size(36.dp),
//            border = BorderStroke(1.3.dp, color = Color.LightGray.copy(alpha = 0.5f)), // Light border with transparency
//            colors = IconButtonDefaults.outlinedIconButtonColors(
//                containerColor = Color.White.copy(.08f),
//                contentColor = Color.White.copy(alpha = 0.9f)
//            )
//        ) {
//            Icon(
//                imageVector = Icons.Default.KeyboardArrowLeft,
//                contentDescription = "",
//                modifier = Modifier.size(26.dp),
//                tint = Color.White.copy(alpha = 0.8f) // White icon with some transparency for the glass effect
//            )
//        }
//
//    }
//}

