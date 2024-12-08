package com.codemaster.codemasterapp.main.ui.learning.lessons

import android.widget.Toast
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.main.ui.components.LessonListScreenBasicLotieCard
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.MainRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.ui.theme.bluishPython


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonListScreen(
    navController: NavController,
    courseViewModel: CourseViewModel,
    noteViewModel: NoteViewModel
) {
    val scrollState = rememberScrollState()


    val lessonCompletionStatus by courseViewModel.lessonCompletionStatus.collectAsState()

    //Lesson or Description
    var selectedTab by remember {
        mutableStateOf(LessonOrDescription.LESSON)
    }

    val expandedLessons = remember { mutableStateOf(mapOf<Int, Boolean>()) }

    //Current stage
    // Fetch the selected stage using the stageId
    val selectedLanguage by courseViewModel.selectedCourse.collectAsState()
    val selectedStage by courseViewModel.selectedStage.collectAsState()
    val currentStageAllLessons = remember{mutableStateOf(0)}

    //context
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        currentStageAllLessons.value = selectedStage!!.lessons.sumOf { it.lessonContents.size }
    }

    Scaffold(
        containerColor = Color.Transparent,
        topBar = {

            val topBarGradient = Brush.verticalGradient(
                colors = listOf(
                    Color(0x661D3A53), // A deep, dark blue-gray
                    Color(0x662A4F6D), // A muted, medium blue
                    Color(0x6635597D)  // A slightly lighter, yet still muted, cool blue
                )
            )
            TopAppBar(
                navigationIcon = {

                    OutlinedIconButton(
                        onClick = {
                            navController.popBackStack()
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
                            tint = Color.White.copy(alpha = 0.8f)
                        )
                    }
                },

                title = {
                    Text(
                        modifier = Modifier.padding(start = 24.dp),
                        text = "${selectedLanguage?.language} - ${selectedStage?.title}",
                        color = Color.White
                    )

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent // Desired dark gradient tone
                ),
                modifier = Modifier
                    .shadow(.5.dp, ambientColor = Color.White, spotColor = Color.White)
                    .background(topBarGradient)

            )
        }
    ) { paddingValues ->

        val screenBackgroundGradient = Brush.verticalGradient(
            colors = listOf(
                Color(0x44101820), // Very Dark Blue
                Color(0x440F263D), // Slightly Brighter Blue
                Color(0x4415476E)  // Cool Medium Blue
            )
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    screenBackgroundGradient
                )
                .padding(top = paddingValues.calculateTopPadding())
                .navigationBarsPadding()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Spacer(Modifier.height(6.dp))
                // Display Course Overview Card
                LessonListScreenBasicLotieCard()

                Spacer(modifier = Modifier.height(12.dp))

                Column(

                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // "28 lessons" Text with gray color
                        Text(
                            text = "${currentStageAllLessons.value} lessons",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = Color.Gray,
                            )
                        )

                        Spacer(Modifier.width(8.dp))

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Rating Star",
                            tint = Color(0xFFF6AD42),
                            modifier = Modifier.size(18.dp)
                        )
                        Text(
                            text = "4.9",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = Color.Gray,
                            ),
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }

                    Spacer(Modifier.height(4.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {

                        val selectedTabColor = Color(0xFFEAC645)

                        Text(
                            text = "Lessons",
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = if (selectedTab == LessonOrDescription.LESSON) selectedTabColor else Color.Gray,
                                fontWeight = if (selectedTab == LessonOrDescription.LESSON) FontWeight.Medium else FontWeight.Normal,
                            ),
                            modifier = Modifier
                                .clip(CircleShape)
                                .clickable(onClick = {
                                    selectedTab = LessonOrDescription.LESSON
                                })
                                .padding(4.dp),
                        )

                        Text(
                            text = "Description",
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = if (selectedTab == LessonOrDescription.DESCRIPTION) selectedTabColor else Color.Gray,
                                fontWeight = if (selectedTab == LessonOrDescription.DESCRIPTION) FontWeight.Medium else FontWeight.Normal,
                            ),
                            modifier = Modifier
                                .clip(CircleShape)
                                .clickable(onClick = {
                                    selectedTab = LessonOrDescription.DESCRIPTION
                                })
                                .padding(4.dp)

                        )
                    }


                    HorizontalDivider(
                        color = Color.LightGray,
                        thickness = 1.dp,
                        modifier = Modifier.padding(bottom = 2.dp, top = 2.dp)
                    )


                    //Main Content for description or lessons
                    when (selectedTab) {
                        // Inside the Composable function
                        LessonOrDescription.LESSON -> {
                            // Ensure the selected stage is not null
                            selectedStage?.let { stage ->
                                // Collect the lesson completion status from the ViewModel
                                val lessonCompletionStatus =
                                    courseViewModel.lessonCompletionStatus.collectAsState()

                                // Use the stage's lessons
                                LazyColumn {
                                    item {
                                        Spacer(Modifier.height(8.dp))
                                    }

                                    itemsIndexed(stage.lessons) { index, lesson ->
                                        // Observe if the lesson is completed or not
                                        val lessonStatus =
                                            lessonCompletionStatus.value[lesson.id] ?: lesson.status

                                        // Handling section expansion
                                        val isExpanded = expandedLessons.value[index] ?: false

                                        // Check if it's the last item in the list
                                        val isLastLesson = index == stage.lessons.size - 1

                                        Column {
                                            LessonItem(
                                                title = lesson.title,
                                                description = "${lesson.lessonContents.size} Lessons",
                                                status = lessonStatus,
                                                onArrowClick = {
                                                    // Toggle expansion of this lesson's sub-lessons
                                                    expandedLessons.value =
                                                        expandedLessons.value.toMutableMap().apply {
                                                            put(index, !isExpanded)
                                                        }
                                                },
                                                onLessonClick = {
                                                    if (lessonStatus != LessonStatus.LOCKED) {
                                                        courseViewModel.selectLesson(lesson)
                                                        courseViewModel.selectLessonIndex(index = index)
                                                        navController.navigate(MainRoutes.LessonContentScreen.route)
                                                    } else {
                                                        Toast
                                                            .makeText(
                                                                context,
                                                                "complete previous lesson first",
                                                                Toast.LENGTH_SHORT
                                                            )
                                                            .show()
                                                    }
                                                },
                                                isExpanded = isExpanded,
                                                isLastLesson = isLastLesson
                                            )
                                            Spacer(Modifier.height(if (isExpanded) 12.dp else 0.dp))

                                            if (isExpanded) {
                                                // Display sub-lessons if the lesson is expanded
                                                lesson.lessonContents.forEachIndexed { subIndex, subLesson ->
                                                    // Check if the sub-lesson is completed
                                                    val subLessonStatus =
                                                        lessonCompletionStatus.value[subLesson.id]
                                                            ?: subLesson.status

                                                    // Check if it's the last sub-lesson in the list
                                                    val isLastSubLesson =
                                                        subIndex == lesson.lessonContents.size - 1

                                                    SubLessonItem(
                                                        subLesson = subLesson,
                                                        onSubLessonComplete = {
                                                            // Handle sub-lesson completion
                                                            if (subLesson.status == LessonStatus.LOCKED) {
                                                                subLesson.status =
                                                                    LessonStatus.ACTIVE
                                                            } else if (subLesson.status == LessonStatus.ACTIVE) {
                                                                subLesson.status =
                                                                    LessonStatus.COMPLETED
                                                            }
                                                        },
                                                        isLastSubLesson = isLastSubLesson,
                                                        status = subLessonStatus,
                                                        onLessonClick = {
                                                            if (subLessonStatus != LessonStatus.LOCKED) {
                                                                courseViewModel.selectLesson(lesson)
                                                                courseViewModel.selectSubLessonIndex(
                                                                    subIndex
                                                                )
                                                                navController.navigate(MainRoutes.LessonContentScreen.route)
                                                            } else {
                                                                Toast
                                                                    .makeText(
                                                                        context,
                                                                        "complete previous lesson first",
                                                                        Toast.LENGTH_SHORT
                                                                    )
                                                                    .show()
                                                            }
                                                        }
                                                    )
                                                }
                                            }

                                            Spacer(Modifier.height(if (isExpanded) 12.dp else 0.dp))
                                        }
                                    }

                                    item {
                                        Spacer(Modifier.height(8.dp))
                                    }
                                }
                            }
                        }


                        LessonOrDescription.DESCRIPTION -> {

                            CourseDescriptionScreen()

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SubLessonItem(
    subLesson: LessonContent,
    onSubLessonComplete: () -> Unit,
    isLastSubLesson: Boolean,
    onLessonClick: () -> Unit,
    status: LessonStatus
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 38.dp) // Indentation for sub-lessons
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .clickable(
                    onClick = {
                        onLessonClick()
                    }
                )
        ) {
            Box(
                modifier = Modifier
                    .size(26.dp)
                    .background(
                        when (status) {
                            LessonStatus.ACTIVE -> Color.Green.copy(alpha = 0.6f)
                            LessonStatus.COMPLETED -> bluishPython.copy(alpha = 0.6f)
                            else -> Color.Gray.copy(alpha = 0.6f)
                        },
                        shape = CircleShape
                    )
                    .border(
                        width = 2.dp,
                        color = when (status) {
                            LessonStatus.ACTIVE -> Color.Green
                            LessonStatus.COMPLETED -> bluishPython
                            else -> Color.Gray
                        },
                        shape = CircleShape
                    )
            ) {
                Icon(
                    imageVector = when (status) {
                        LessonStatus.ACTIVE -> Icons.Default.PlayArrow
                        LessonStatus.COMPLETED -> Icons.Default.Check
                        LessonStatus.LOCKED -> Icons.Default.Lock
                    },
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(14.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = subLesson.title,
                    style = MaterialTheme.typography.bodyMedium,
                    color = when (status) {
                        LessonStatus.ACTIVE -> Color.White
                        LessonStatus.COMPLETED -> bluishPython
                        else -> Color(0xFFC5BFBF)
                    },
                    maxLines = 1
                )
                Text(
                    text = subLesson.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = when (status) {
                        LessonStatus.ACTIVE,
                        LessonStatus.COMPLETED -> Color.Gray

                        else -> Color.Gray
                    },
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }

    // Only display dots if it's not the last lesson
    if (!isLastSubLesson) {
        Column(
            modifier = Modifier.padding(
                start = 49.dp
            )
        ) {
            for (i in 1..4) {
                Spacer(
                    modifier = Modifier
                        .size(3.dp)
                        .clip(CircleShape)
                        .background(bluishPython)
                )
                Spacer(Modifier.height(2.dp))
            }
        }
    }
}

@Composable
fun LessonItem(
    title: String,
    description: String,
    status: LessonStatus,
    onArrowClick: () -> Unit, // Callback for expanding the lesson,
    onLessonClick: () -> Unit,
    isExpanded: Boolean,
    isLastLesson: Boolean // Add a flag to check if it's the last lesson
) {
    val glowAnimation = remember { Animatable(0f) }
    val context = LocalContext.current

    LaunchedEffect(status == LessonStatus.ACTIVE) {
        if (status == LessonStatus.ACTIVE) {
            glowAnimation.animateTo(
                targetValue = 4f,
                animationSpec = infiniteRepeatable(
                    animation = tween(durationMillis = 1000, easing = LinearEasing),
                    repeatMode = RepeatMode.Reverse
                )
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                onClick = {
                    onLessonClick()
                })
            .padding(horizontal = 14.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            // Status Icon (Check, Play, or Lock)
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(
                        when (status) {
                            LessonStatus.ACTIVE -> Brush.radialGradient(
                                colors = listOf(Color.Green.copy(alpha = 0.3f), Color.Transparent),
                                radius = 100f
                            )

                            else -> Brush.linearGradient(listOf(Color.Gray, Color.LightGray))
                        },
                        shape = CircleShape
                    )
                    .border(
                        width = if (status == LessonStatus.ACTIVE) glowAnimation.value.dp else 1.dp,
                        color = when (status) {
                            LessonStatus.ACTIVE -> Color.Green
                            LessonStatus.COMPLETED -> Color.White.copy(.6f)
                            else -> Color.White.copy(.6f)
                        },
                        shape = CircleShape
                    )
            ) {
                Icon(
                    imageVector = when (status) {
                        LessonStatus.ACTIVE -> Icons.Default.PlayArrow
                        LessonStatus.COMPLETED -> Icons.Default.Check
                        LessonStatus.LOCKED -> Icons.Default.Lock
                    },
                    contentDescription = null,
                    tint = when (status) {
                        LessonStatus.ACTIVE -> Color.White
                        LessonStatus.COMPLETED -> Color.Black.copy(.6f)
                        LessonStatus.LOCKED -> Color.Black.copy(.6f)
                    },
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(18.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Lesson Text
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodyLarge,
                    color = when (status) {
                        LessonStatus.ACTIVE -> Color.White
                        LessonStatus.COMPLETED -> bluishPython
                        else -> Color(0xFFC5BFBF)
                    },
                    maxLines = 1
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = when (status) {
                        LessonStatus.ACTIVE,
                        LessonStatus.COMPLETED -> Color.Gray

                        else -> Color.Gray
                    },
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            // Expand Arrow (Right Arrow)
            IconButton(onClick = { onArrowClick() }) {
                Icon(
                    imageVector = if (isExpanded) Icons.Default.KeyboardArrowDown else Icons.AutoMirrored.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = when (status) {
                        LessonStatus.ACTIVE -> Color.White
                        LessonStatus.COMPLETED -> bluishPython
                        else -> Color.Gray
                    }
                )
            }
        }
    }

    // Only display dots if it's not the last lesson
    if (!isLastLesson && !isExpanded) {
        Column(
            modifier = Modifier.padding(
                start = 28.dp
            )
        ) {
            for (i in 1..4) {
                Spacer(
                    modifier = Modifier
                        .size(3.dp)
                        .clip(CircleShape)
                        .background(bluishPython)
                )
                Spacer(Modifier.height(2.dp))
            }
        }
    }
}

@Composable
fun CourseDescriptionScreen() {
//    LazyColumn {
//        items(courseDesc) { courseItem ->
//            Column(modifier = Modifier.padding(horizontal = 6.dp)) {
//
//                val customText = buildAnnotatedString {
//                    withStyle(
//                        style = SpanStyle(
//                            color = Color.LightGray,
//                            fontSize = 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    ) {
//                        append(courseItem.title)
//                    }
//                    withStyle(
//                        style = SpanStyle(
//                            color = Color.Gray,
//                            fontSize = 14.sp,
//                            fontWeight = FontWeight.Normal
//                        )
//                    ) {
//                        append(courseItem.description)
//                    }
//                }
//                Text(
//                    lineHeight = 20.sp,
//                    text = customText,
//                    style = MaterialTheme.typography.headlineLarge,
//                    fontWeight = FontWeight.Bold
//                )
//            }
//            Spacer(Modifier.height(8.dp))
//        }
//    }
}

//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LessonListScreen(navController: NavController) {
//    val scrollState = rememberScrollState()
//
//    // Add state to track selected language and level
//    var selectedLanguage by remember { mutableStateOf("C Language") }
//    var selectedLevel by remember { mutableStateOf("Basic") }
//
//    //Lesson or Description
//    var selectedTab by remember {
//        mutableStateOf(LessonOrDescription.LESSON)
//    }
//
//    val courseTitle = when {
//        selectedLanguage == "C Language" && selectedLevel == "Basic" -> "C Programming for Beginners"
//        else -> "Default Course Title"
//    }
//
//
//    val expandedLessons = remember { mutableStateOf(mapOf<Int, Boolean>()) }
//
//    Scaffold(
//        containerColor = Color.Transparent,
//        topBar = {
//
//            val topBarGradient = Brush.verticalGradient(
//                colors = listOf(
//                    Color(0x661D3A53), // A deep, dark blue-gray
//                    Color(0x662A4F6D), // A muted, medium blue
//                    Color(0x6635597D)  // A slightly lighter, yet still muted, cool blue
//                )
//            )
//            TopAppBar(
//                navigationIcon = {
//
//                    OutlinedIconButton(
//                        onClick = {
//                            navController.popBackStack()
//                        },
//                        modifier = Modifier
//                            .statusBarsPadding()
//                            .padding(start = 8.dp)
//                            .size(36.dp),
//                        border = BorderStroke(1.3.dp, color = Color.LightGray.copy(alpha = 0.4f)), // Light border with transparency
//                        colors = IconButtonDefaults.outlinedIconButtonColors(
//                            containerColor = Color.White.copy(.08f),
//                        )
//                    ) {
//                        Icon(
//                            imageVector = Icons.Default.KeyboardArrowLeft,
//                            contentDescription = "",
//                            modifier = Modifier.size(26.dp),
//                            tint = Color.White.copy(alpha = 0.8f)
//                        )
//                    }
//                },
//
//                title = {
//                    Text(
//                        modifier = Modifier.padding(start = 24.dp),
//                        text = "C - Beginner",
//                        color = Color.White
//                    )
//
//                },
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color.Transparent // Desired dark gradient tone
//                ),
//                modifier = Modifier
//                    .shadow(.5.dp, ambientColor = Color.White, spotColor = Color.White)
//                    .background(topBarGradient)
//
//            )
//        }
//    ) { paddingValues ->
//
//        val screenBackgroundGradient = Brush.verticalGradient(
//            colors = listOf(
//                Color(0x44101820), // Very Dark Blue
//                Color(0x440F263D), // Slightly Brighter Blue
//                Color(0x4415476E)  // Cool Medium Blue
//            )
//        )
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(
//                    screenBackgroundGradient
//                )
//                .padding(top = paddingValues.calculateTopPadding())
//                .navigationBarsPadding()
//        ) {
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//            ) {
//                Spacer(Modifier.height(6.dp))
//                // Display Course Overview Card
//                LessonListScreenBasicLotieCard()
//
//                Spacer(modifier = Modifier.height(12.dp))
//
//                Column(
//
//                ) {
//
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(horizontal = 14.dp),
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        // "28 lessons" Text with gray color
//                        Text(
//                            text = "28 lessons",
//                            style = MaterialTheme.typography.bodyMedium.copy(
//                                color = Color.Gray,
//                            )
//                        )
//
//                        Spacer(Modifier.width(8.dp))
//
//                        Icon(
//                            imageVector = Icons.Default.Star,
//                            contentDescription = "Rating Star",
//                            tint = Color(0xFFF6AD42),
//                            modifier = Modifier.size(18.dp)
//                        )
//                        Text(
//                            text = "4.9",
//                            style = MaterialTheme.typography.bodyMedium.copy(
//                                color = Color.Gray,
//                            ),
//                            modifier = Modifier.padding(top = 4.dp)
//                        )
//                    }
//
//                    Spacer(Modifier.height(4.dp))
//
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(horizontal = 14.dp),
//                        horizontalArrangement = Arrangement.spacedBy(12.dp)
//                    ) {
//
//                        val selectedTabColor = Color(0xFFEAC645)
//
//                        Text(
//                            text = "Lessons",
//                            style = MaterialTheme.typography.titleMedium.copy(
//                                color = if (selectedTab == LessonOrDescription.LESSON) selectedTabColor else Color.Gray,
//                                fontWeight = if (selectedTab == LessonOrDescription.LESSON) FontWeight.Medium else FontWeight.Normal,
//                            ),
//                            modifier = Modifier
//                                .clip(CircleShape)
//                                .clickable(onClick = {
//                                    selectedTab = LessonOrDescription.LESSON
//                                })
//                                .padding(4.dp),
//                        )
//
//                        Text(
//                            text = "Description",
//                            style = MaterialTheme.typography.titleMedium.copy(
//                                color = if (selectedTab == LessonOrDescription.DESCRIPTION) selectedTabColor else Color.Gray,
//                                fontWeight = if (selectedTab == LessonOrDescription.DESCRIPTION) FontWeight.Medium else FontWeight.Normal,
//                            ),
//                            modifier = Modifier
//                                .clip(CircleShape)
//                                .clickable(onClick = {
//                                    selectedTab = LessonOrDescription.DESCRIPTION
//                                })
//                                .padding(4.dp)
//
//                        )
//                    }
//
//
//                    HorizontalDivider(
//                        color = Color.LightGray,
//                        thickness = 1.dp,
//                        modifier = Modifier.padding(bottom = 2.dp, top = 2.dp)
//                    )
//
//
//                    //Main Content for description or lessons
//                    when (selectedTab) {
//                        LessonOrDescription.LESSON -> {
//                            LazyColumn {
//
//                                item{
//                                    Spacer(Modifier.height( 8.dp))
//                                }
//
//
//                                itemsIndexed(getLessons()) { index, lesson ->
//                                    // Handling section expansion
//                                    val isExpanded = expandedLessons.value[index] ?: false
//
//                                    // Check if it's the last item in the list
//                                    val isLastLesson = index == getLessons().size - 1
//
//                                    Column {
//                                        LessonItem(
//                                            title = lesson.title,
//                                            description = "${lesson.count} Lessons",
//                                            status = lesson.status,
//                                            onArrowClick = {
//                                                // Toggle expansion of this lesson's sub-lessons
//                                                expandedLessons.value =
//                                                    expandedLessons.value.toMutableMap().apply {
//                                                        put(index, !isExpanded)
//                                                    }
//                                            },
//                                            onLessonClick = {
//                                                navController.navigate(MainRoutes.LessonContentScreen.route)
//                                            },
//                                            isExpanded = isExpanded,
//                                            isLastLesson = isLastLesson // Pass the check here
//                                        )
//                                        Spacer(Modifier.height(if (isExpanded) 12.dp else 0.dp))
//
//                                        if (isExpanded) {
//                                            // Display sub-lessons if the lesson is expanded
//                                            lesson.subLessons.forEachIndexed { subIndex, subLesson ->
//                                                // Check if it's the last sub-lesson in the list
//                                                val isLastSubLesson =
//                                                    subIndex == lesson.subLessons.size - 1
//
//                                                SubLessonItem(
//                                                    subLesson = subLesson,
//                                                    onSubLessonComplete = {
//                                                        // Handle sub-lesson completion
//                                                        if (subLesson.status == LessonStatus.LOCKED) {
//                                                            subLesson.status = LessonStatus.ACTIVE
//                                                        } else if (subLesson.status == LessonStatus.ACTIVE) {
//                                                            subLesson.status =
//                                                                LessonStatus.COMPLETED
//                                                        }
//                                                    },
//                                                    isLastSubLesson = isLastSubLesson // Pass the isLastSubLesson check here
//                                                )
//                                            }
//                                        }
//
//                                        Spacer(Modifier.height(if (isExpanded) 12.dp else 0.dp))
//                                    }
//                                }
//
//                                item{
//                                    Spacer(Modifier.height( 8.dp))
//                                }
//                            }
//
//                        }
//
//                        LessonOrDescription.DESCRIPTION -> {
//                            val currentCourseLevelDesc = getCourseDescription()
//                            CourseDescriptionScreen(
//                                course = currentCourseLevelDesc
//                            )
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun SubLessonItem(
//    subLesson: SubLesson,
//    onSubLessonComplete: () -> Unit,
//    isLastSubLesson: Boolean
//) {
//
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(start = 38.dp) // Indentation for sub-lessons
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Box(
//                modifier = Modifier
//                    .size(26.dp)
//                    .background(
//                        when (subLesson.status) {
//                            LessonStatus.ACTIVE -> Color.Green.copy(alpha = 0.6f)
//                            LessonStatus.COMPLETED -> bluishPython.copy(alpha = 0.6f)
//                            else -> Color.Gray.copy(alpha = 0.6f)
//                        },
//                        shape = CircleShape
//                    )
//                    .border(
//                        width = 2.dp,
//                        color = when (subLesson.status) {
//                            LessonStatus.ACTIVE -> Color.Green
//                            LessonStatus.COMPLETED -> bluishPython
//                            else -> Color.Gray
//                        },
//                        shape = CircleShape
//                    )
//            ) {
//                Icon(
//                    imageVector = when (subLesson.status) {
//                        LessonStatus.ACTIVE -> Icons.Default.PlayArrow
//                        LessonStatus.COMPLETED -> Icons.Default.Check
//                        LessonStatus.LOCKED -> Icons.Default.Lock
//                    },
//                    contentDescription = null,
//                    tint = Color.White,
//                    modifier = Modifier
//                        .align(Alignment.Center)
//                        .size(14.dp)
//                )
//            }
//
//            Spacer(modifier = Modifier.width(16.dp))
//
//            Column(modifier = Modifier.weight(1f)) {
//                Text(
//                    text = subLesson.title,
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = when (subLesson.status) {
//                        LessonStatus.ACTIVE -> Color.White
//                        LessonStatus.COMPLETED -> bluishPython
//                        else -> Color(0xFFC5BFBF)
//                    },
//                    maxLines = 1
//                )
//                Text(
//                    text = subLesson.description,
//                    style = MaterialTheme.typography.bodySmall,
//                    color = when (subLesson.status) {
//                        LessonStatus.ACTIVE,
//                        LessonStatus.COMPLETED -> Color.Gray
//
//                        else -> Color.Gray
//                    },
//                    maxLines = 1,
//                    overflow = TextOverflow.Ellipsis
//                )
//            }
//        }
//    }
//
//    // Only display dots if it's not the last lesson
//    if (!isLastSubLesson) {
//        Column(
//            modifier = Modifier.padding(
//                start = 49.dp
//            )
//        ) {
//            for (i in 1..4) {
//                Spacer(
//                    modifier = Modifier
//                        .size(3.dp)
//                        .clip(CircleShape)
//                        .background(bluishPython)
//                )
//                Spacer(Modifier.height(2.dp))
//            }
//        }
//    }
//}
//
//@Composable
//fun LessonItem(
//    title: String,
//    description: String,
//    status: LessonStatus,
//    onArrowClick: () -> Unit, // Callback for expanding the lesson,
//    onLessonClick: () -> Unit,
//    isExpanded: Boolean,
//    isLastLesson: Boolean // Add a flag to check if it's the last lesson
//) {
//    val glowAnimation = remember { Animatable(0f) }
//    val context = LocalContext.current
//
//    LaunchedEffect(status == LessonStatus.ACTIVE) {
//        if (status == LessonStatus.ACTIVE) {
//            glowAnimation.animateTo(
//                targetValue = 4f,
//                animationSpec = infiniteRepeatable(
//                    animation = tween(durationMillis = 1000, easing = LinearEasing),
//                    repeatMode = RepeatMode.Reverse
//                )
//            )
//        }
//    }
//
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .clickable(enabled = status != LessonStatus.LOCKED,
//                onClick = {
//                    onLessonClick()
//                    Toast
//                        .makeText(context, "Lesson: $title", Toast.LENGTH_SHORT)
//                        .show()
//                })
//            .padding(horizontal = 14.dp),
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            // Status Icon (Check, Play, or Lock)
//            Box(
//                modifier = Modifier
//                    .size(32.dp)
//                    .background(
//                        when (status) {
//                            LessonStatus.ACTIVE -> Brush.radialGradient(
//                                colors = listOf(Color.Green.copy(alpha = 0.3f), Color.Transparent),
//                                radius = 100f
//                            )
//
//                            else -> Brush.linearGradient(listOf(Color.Gray, Color.LightGray))
//                        },
//                        shape = CircleShape
//                    )
//                    .border(
//                        width = if (status == LessonStatus.ACTIVE) glowAnimation.value.dp else 1.dp,
//                        color = when (status) {
//                            LessonStatus.ACTIVE -> Color.Green
//                            LessonStatus.COMPLETED -> Color.White.copy(.6f)
//                            else -> Color.White.copy(.6f)
//                        },
//                        shape = CircleShape
//                    )
//            ) {
//                Icon(
//                    imageVector = when (status) {
//                        LessonStatus.ACTIVE -> Icons.Default.PlayArrow
//                        LessonStatus.COMPLETED -> Icons.Default.Check
//                        LessonStatus.LOCKED -> Icons.Default.Lock
//                    },
//                    contentDescription = null,
//                    tint = when (status) {
//                        LessonStatus.ACTIVE -> Color.White
//                        LessonStatus.COMPLETED -> Color.Black.copy(.6f)
//                        LessonStatus.LOCKED -> Color.Black.copy(.6f)
//                    },
//                    modifier = Modifier
//                        .align(Alignment.Center)
//                        .size(18.dp)
//                )
//            }
//
//            Spacer(modifier = Modifier.width(16.dp))
//
//            // Lesson Text
//            Column(modifier = Modifier.weight(1f)) {
//                Text(
//                    text = title,
//                    style = MaterialTheme.typography.bodyLarge,
//                    color = when (status) {
//                        LessonStatus.ACTIVE -> Color.White
//                        LessonStatus.COMPLETED -> bluishPython
//                        else -> Color(0xFFC5BFBF)
//                    },
//                    maxLines = 1
//                )
//                Text(
//                    text = description,
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = when (status) {
//                        LessonStatus.ACTIVE,
//                        LessonStatus.COMPLETED -> Color.Gray
//
//                        else -> Color.Gray
//                    },
//                    maxLines = 1,
//                    overflow = TextOverflow.Ellipsis
//                )
//            }
//
//            // Expand Arrow (Right Arrow)
//            IconButton(onClick = { onArrowClick() }) {
//                Icon(
//                    imageVector = if (isExpanded) Icons.Default.KeyboardArrowDown else Icons.AutoMirrored.Default.KeyboardArrowRight,
//                    contentDescription = null,
//                    tint = when (status) {
//                        LessonStatus.ACTIVE -> Color.White
//                        LessonStatus.COMPLETED -> bluishPython
//                        else -> Color.Gray
//                    }
//                )
//            }
//        }
//    }
//
//    // Only display dots if it's not the last lesson
//    if (!isLastLesson && !isExpanded) {
//        Column(
//            modifier = Modifier.padding(
//                start = 28.dp
//            )
//        ) {
//            for (i in 1..4) {
//                Spacer(
//                    modifier = Modifier
//                        .size(3.dp)
//                        .clip(CircleShape)
//                        .background(bluishPython)
//                )
//                Spacer(Modifier.height(2.dp))
//            }
//        }
//    }
//}
//
//@Composable
//fun CourseDescriptionScreen(course: List<Course>) {
//    LazyColumn {
//        items(course) { courseItem ->
//            Column(modifier = Modifier.padding(horizontal = 6.dp)) {
//
//                val customText = buildAnnotatedString {
//                    withStyle(
//                        style = SpanStyle(
//                            color = Color.LightGray,
//                            fontSize = 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    ) {
//                        append(courseItem.title)
//                    }
//                    withStyle(
//                        style = SpanStyle(
//                            color = Color.Gray,
//                            fontSize = 14.sp,
//                            fontWeight = FontWeight.Normal
//                        )
//                    ) {
//                        append(courseItem.description)
//                    }
//                }
//                Text(
//                    lineHeight = 20.sp,
//                    text = customText,
//                    style = MaterialTheme.typography.headlineLarge,
//                    fontWeight = FontWeight.Bold
//                )
//            }
//            Spacer(Modifier.height(8.dp))
//        }
//    }
//}
//
//data class Lesson(
//    val title: String,
//    val count: Int,
//    var status: LessonStatus = LessonStatus.LOCKED,
//    val subLessons: List<SubLesson> = emptyList() // Sub-lessons for each main lesson
//)
//
//enum class LessonStatus {
//    COMPLETED, ACTIVE, LOCKED
//}
//
//data class SubLesson(
//    val title: String,
//    val description: String,
//    var status: LessonStatus = LessonStatus.LOCKED // Can be LOCKED, ACTIVE, or COMPLETED
//)

enum class LessonOrDescription {
    LESSON, DESCRIPTION
}

//
//data class Course(
//    val title: String,
//    val description: String, // Detailed description of the course or level
//    val otherInfo: String // Any other information you'd like to add (e.g., prerequisites, duration, etc.)
//)
//

//
//fun getCourseDescription(): List<Course> {
//    return listOf(
//        Course(
//            title = "Introduction to Programming: ",
//            description = "Here we will learn the basics of programming, including syntax, control flow, and more.",
//            otherInfo = "Lessons: 28 hours\nPrerequisites: Basic understanding of programming concepts"
//        ),
//        Course(
//            title = "Introduction to C Programming: ",
//            description = "Introduction to C: This section will provide an overview of C programming, covering its features and history.",
//            otherInfo = "Lessons: 28 hours\nPrerequisites: Basic understanding of programming concepts"
//        ),
//        Course(
//            title = "Variables and Data Types: ",
//            description = "Understanding Variables and Data Types: This lesson covers the basics of variables, constants, and different data types in C.",
//            otherInfo = "Lessons: 24 hours\nPrerequisites: Basic knowledge of C syntax"
//        ),
//        Course(
//            title = "Control Flow in C: ",
//            description = "Mastering Control Flow: Learn how to use conditional statements and loops to control the flow of your programs.",
//            otherInfo = "Lessons: 20 hours\nPrerequisites: Basic understanding of programming concepts"
//        ),
//        Course(
//            title = "Functions in C Programming:",
//            description = "Functions in C: This section teaches how to write and use functions in C for modular programming.",
//            otherInfo = "Lessons: 22 hours\nPrerequisites: Basic understanding of C"
//        ),
//        Course(
//            title = "Advanced C Programming: ",
//            description = "Advanced Topics in C: Dive into advanced C concepts like pointers, memory management, and file handling.",
//            otherInfo = "Lessons: 30 hours\nPrerequisites: Intermediate knowledge of C programming"
//        )
//    )
//}
//
//
//fun getLessonsForLanguageAndLevel(language: String, level: String): List<Lesson> {
//    return when {
//        language == "C Language" && level == "Basic" -> listOf(
//
//            // Add more lessons
//        )
//
//        language == "Java" && level == "Intermediate" -> listOf(
//
//            // Add more lessons
//        )
//
//        else -> emptyList() // Default case
//    }
//}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LanguageLevelScreen(navController: NavController) {
//    val scrollState = rememberScrollState()
//
//    // Add state to track selected language and level
//    var selectedLanguage by remember { mutableStateOf("C Language") }
//    var selectedLevel by remember { mutableStateOf("Basic") }
//
//    val courseTitle = when {
//        selectedLanguage == "C Language" && selectedLevel == "Basic" -> "C Programming for Beginners"
//        else -> "Default Course Title"
//    }
//
//    val lessons = when {
//        selectedLanguage == "C Language" && selectedLevel == "Basic" -> listOf(
//            Lesson(
//                "Introduction to C",
//                "Overview of the C programming language, its history, and applications.",
//                status = LessonStatus.COMPLETED // Marked as completed
//            ),
//            Lesson(
//                "Basic Syntax and Data Types",
//                "Understanding basic syntax, variables, constants, and data types like int, char, float, etc.",
//                status = LessonStatus.ACTIVE // Marked as completed
//            ),
//            Lesson(
//                "Operators",
//                "Learn about arithmetic, relational, logical, and assignment operators.",
//                status = LessonStatus.LOCKED // Marked as in-progress
//            ),
//            Lesson(
//                "Control Flow Statements",
//                "Introduction to if-else, switch, and looping statements (for, while, do-while).",
//                status = LessonStatus.LOCKED // Locked lesson
//            ),
//            Lesson(
//                "Functions",
//                "How to define, call, and return values in functions. Introduction to recursion.",
//                status = LessonStatus.LOCKED
//            ),
//            Lesson(
//                "Functions",
//                "How to define, call, and return values in functions. Introduction to recursion.",
//                status = LessonStatus.LOCKED
//            ),
//            Lesson(
//                "Functions",
//                "How to define, call, and return values in functions. Introduction to recursion.",
//                status = LessonStatus.LOCKED
//            ),
//            Lesson(
//                "Functions",
//                "How to define, call, and return values in functions. Introduction to recursion.",
//                status = LessonStatus.LOCKED
//            ),
//            Lesson(
//                "Functions",
//                "How to define, call, and return values in functions. Introduction to recursion.",
//                status = LessonStatus.LOCKED
//            ),
//            Lesson(
//                "Functions",
//                "How to define, call, and return values in functions. Introduction to recursion.",
//                status = LessonStatus.LOCKED
//            ),
//            // Add more lessons as needed
//        )
//        else -> listOf() // Default empty list if no conditions match
//    }
//
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//
//                title = {
//                    Row(
//                        modifier = Modifier
//                            .fillMaxSize(),
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//
//                        Text(
//                            text = "Course Overview",
//                            color = Color.Black,
//                            style = MaterialTheme.typography.titleLarge
//                        )
//
//                    }
//
//                },
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color.Transparent,
//                ),
//                navigationIcon = {
//                    // Back Arrow Icon
//                    IconButton(onClick = { /* Navigate to Profile Screen */ }) {
//                        Icon(
//                            imageVector = Icons.Filled.ArrowBack,
//                            contentDescription = "Go Back",
//                            tint = Color.Black,
//                            modifier = Modifier.size(24.dp)
//                        )
//                    }
//                }
//            )
//        }
//    ) { paddingValues ->
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color(0xFFF7F9FC)) // Soft background color for the main area
//                .padding(top = paddingValues.calculateTopPadding())
//        ) {
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 8.dp),
//                //horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                // Course Overview Card
//                LanguageLevelBasicLotieCard()
//
//                Spacer(modifier = Modifier.height(12.dp))
//
//                Column(
//                    modifier = Modifier.padding(horizontal = 14.dp)
//                ) {
//                    // Dynamic Course Title
//                    Text(
//                        text = courseTitle,
//                        style = MaterialTheme.typography.headlineSmall,
//                        color = Color.Black
//                    )
//                    Spacer(modifier = Modifier.height(4.dp))
//
//                    // Course Details
//                    Row {
//                        Text(
//                            text = "28 lessons",
//                            style = MaterialTheme.typography.bodyMedium,
//                            color = Color.Gray
//                        )
//                        Spacer(modifier = Modifier.width(8.dp))
//                        Icon(
//                            imageVector = Icons.Default.Star,
//                            contentDescription = "Rating",
//                            tint = Color(0xFFFFD700),
//                            modifier = Modifier.size(16.dp)
//                        )
//                        Text(
//                            text = "4.9",
//                            style = MaterialTheme.typography.bodyMedium,
//                            color = Color.Gray
//                        )
//                    }
//                    Spacer(modifier = Modifier.height(16.dp))
//
//                    // Tabs Section (Lessons Tab)
//                    Row(
//                        modifier = Modifier.fillMaxWidth(),
//                        horizontalArrangement = Arrangement.Start
//                    ) {
//                        Text(
//                            text = "Lessons",
//                            style = MaterialTheme.typography.bodyLarge,
//                            color = Color(0xFF007BFF),
//                            modifier = Modifier.padding(bottom = 4.dp)
//                        )
//                        Spacer(modifier = Modifier.width(16.dp))
//                        Text(
//                            text = "Description",
//                            style = MaterialTheme.typography.bodyLarge,
//                            color = Color.Gray
//                        )
//                    }
//                    HorizontalDivider(color = Color.Gray, thickness = 1.dp)
//
//                    // Dynamic Lessons based on selected course
//                    LazyColumn {
//                        items(lessons) {lesson ->
//                            LessonItem(
//                                title = lesson.title,
//                                description = lesson.description,
//                                status = lesson.status
//                            )
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
