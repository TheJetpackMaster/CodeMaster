package com.codemaster.codemasterapp.main.ui.learning.lessons


import android.app.Activity
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.viewModels.NoteViewModel
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.LearningProgress
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage
import com.codemaster.codemasterapp.main.ui.learning.lessons.components.AddNoteDialog
import com.codemaster.codemasterapp.main.ui.learning.lessons.components.DraggableFloatingButton
import com.codemaster.codemasterapp.main.ui.learning.lessons.components.LessonContentView
import com.codemaster.codemasterapp.main.ui.learning.lessons.components.ManageStatusBar
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun LessonContentScreen(
    navController: NavController,
    courseViewModel: CourseViewModel, // Your ViewModel that holds the selectedLesson
    noteViewModel: NoteViewModel,
    courses:List<Course> = emptyList<Course>(),
    allLessonsStatus: State<Map<String, LessonStatus>>
) {

    // UI State
    val context = LocalContext.current
    val window = context.findActivity().window
    var showAddNoteDialog by remember { mutableStateOf(false) }
    var showPointsDialog = remember { mutableStateOf(false) }

    // ViewModel States
    val selectedLesson by courseViewModel.selectedLesson.collectAsState()
    val selectedSubLessonIndex by courseViewModel.selectedSubLessonIndex.collectAsState()
    val selectedLessonIndex by courseViewModel.selectedLessonIndex.collectAsState()
    val selectedCourse by courseViewModel.selectedCourse.collectAsState()
    val selectedStage by courseViewModel.selectedStage.collectAsState()

    // All Sub lessons
    val subLessons = selectedLesson?.lessonContents ?: emptyList()

    // Pager State
    val pagerState =
        rememberPagerState(initialPage = selectedSubLessonIndex, pageCount = { subLessons.size })
    val coroutineScope = rememberCoroutineScope()

    // Current SubLesson or LessonContent
    val currentSubLesson = remember { mutableStateOf(subLessons.getOrNull(pagerState.currentPage)) }


    // Lessons status
    var currentLessonStatus by remember {
        mutableStateOf(selectedLesson?.let { lesson ->
            allLessonsStatus.value[lesson.id]
        } ?: LessonStatus.LOCKED)
    }

    // Calculated States
    val isPointsAssigned = currentSubLesson.value?.points != 0
    val isPointsCollected =
        allLessonsStatus.value[currentSubLesson.value?.id] == LessonStatus.COMPLETED


    // Hide the status bar
    ManageStatusBar(window) {
        saveProgress(
            courseViewModel,
            selectedCourse,
            selectedStage,
            selectedLesson,
            subLessons,
            pagerState
        )
    }

    LaunchedEffect(pagerState.currentPage) {
        currentSubLesson.value = selectedLesson?.lessonContents[pagerState.currentPage]
        currentLessonStatus = selectedLesson?.let { lesson ->
            allLessonsStatus.value[lesson.id]
        } ?: LessonStatus.LOCKED
    }

    Box {
        LessonContentColumn(
            selectedLesson = selectedLesson,
            pagerState = pagerState,
            subLessons = subLessons,
            coroutineScope = coroutineScope,
            courseViewModel = courseViewModel,
            navController = navController,
            isPointsAssigned = isPointsAssigned,
            isPointsCollected = isPointsCollected,
            showPointsDialog = showPointsDialog,
            lessonStatus = currentLessonStatus,
            subLessonStatus = currentSubLesson.value?.let { subLesson ->
                allLessonsStatus.value[subLesson.id]
            } ?: LessonStatus.LOCKED
        )

        DraggableFloatingButton { isClicked ->
            showAddNoteDialog = isClicked
        }

        AddNoteDialog(
            showDialog = showAddNoteDialog,
            onDismiss = { showAddNoteDialog = false },
            noteViewModel = noteViewModel,
            noteId = currentSubLesson.value?.id ?: "",
            title = currentSubLesson.value?.title ?: "",
        )

        ShowPointsDialog(showPointsDialog = showPointsDialog)
    }
}


fun saveProgress(
    courseViewModel: CourseViewModel,
    selectedCourse: Course?,
    selectedStage: Stage?,
    selectedLesson: Lesson?,
    subLessons: List<LessonContent>,
    pagerState: PagerState
) {
    courseViewModel.saveProgress(
        progress = LearningProgress(
            courseId = selectedCourse!!.id,
            stageId = selectedStage!!.id,
            lessonId = selectedLesson!!.id,
            subLessonId = subLessons[pagerState.currentPage].id,
            subLessonName = subLessons[pagerState.currentPage].title,
            stageName = selectedStage.title,
            subLessonIndex = pagerState.currentPage
        )
    )
}

@Composable
fun LessonContentColumn(
    selectedLesson: Lesson?,
    pagerState: PagerState,
    subLessons: List<LessonContent>,
    coroutineScope: CoroutineScope,
    courseViewModel: CourseViewModel,
    navController: NavController,
    isPointsAssigned: Boolean,
    isPointsCollected: Boolean,
    showPointsDialog: MutableState<Boolean>,
    lessonStatus: LessonStatus,
    subLessonStatus: LessonStatus
) {
    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF1D1B25),
                            Color(0xFF1D2836),
                        ),
                        start = Offset(0f, 0f),
                        end = Offset(0f, 400f)
                    )
                )

        ) {
            Column(
                modifier = Modifier
                    .background(Color(0xFF2C2641))
                    .padding(horizontal = 4.dp, vertical = 8.dp)
            ) {
                LessonTitle(selectedLesson)
                LessonProgressBar(
                    pagerState,
                    subLessons,
                    lessonStatus
                )
            }

            Spacer(Modifier.height(16.dp))

            LessonPager(
                pagerState = pagerState,
                subLessons = subLessons,
                coroutineScope = coroutineScope,
                courseViewModel = courseViewModel,
                navController = navController,
                isPointsAssigned = isPointsAssigned,
                isPointsCollected = isPointsCollected,
                showPointsDialog = showPointsDialog,
                selectedLesson = selectedLesson!!,
                subLessonStatus = subLessonStatus
            )
        }
    }
}

@Composable
fun LessonTitle(selectedLesson: Lesson?) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 14.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = selectedLesson?.title ?: "Default Title",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )
        )
    }
}

@Composable
fun LessonProgressBar(
    pagerState:
    PagerState,
    subLessons: List<LessonContent>,
    lessonStatus: LessonStatus
) {
    val progress = (pagerState.currentPage + 1).toFloat() / subLessons.size

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "${pagerState.currentPage + 1} / ${subLessons.size}",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )
        )

        Box(
            modifier = Modifier
                .padding(start = 14.dp, end = 24.dp)
                .weight(1f)
                .height(10.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White.copy(.8f))
                    .align(Alignment.CenterStart)
            )

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(progress)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF2FA20C))
                    .align(Alignment.CenterStart)
            )
        }

        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "",
            tint = if (lessonStatus == LessonStatus.COMPLETED || pagerState.currentPage < (subLessons.size - 1)) Color.Yellow else Color.White
        )
    }
}

@Composable
fun ShowPointsDialog(showPointsDialog: MutableState<Boolean>) {
    if (showPointsDialog.value) {
        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.rewarddiamondlotie))
        androidx.compose.material.AlertDialog(
            backgroundColor = Color.Transparent,
            onDismissRequest = {
                showPointsDialog.value = false
            },
            buttons = {
                Button(
                    onClick = { showPointsDialog.value = false },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Close")
                }
            },
            text = {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    LottieAnimation(
                        composition = composition,
                        progress = animateLottieCompositionAsState(composition).progress
                    )
                }
            }
        )
    }
}

@Composable
fun LessonPager(
    pagerState: PagerState,
    subLessons: List<LessonContent>,
    coroutineScope: CoroutineScope,
    courseViewModel: CourseViewModel,
    navController: NavController,
    isPointsAssigned: Boolean,
    isPointsCollected: Boolean,
    showPointsDialog: MutableState<Boolean>,
    selectedLesson: Lesson,
    subLessonStatus: LessonStatus
) {
    val swipeThreshold = 300f
    var cumulativeDrag by remember { mutableStateOf(0f) }

    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                detectHorizontalDragGestures(
                    onDragEnd = {
                        if (cumulativeDrag > swipeThreshold && pagerState.currentPage > 0) {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(pagerState.currentPage - 1)
                            }
                        }
                        cumulativeDrag = 0f
                    },
                    onHorizontalDrag = { _, dragAmount ->
                        if (dragAmount > 0) cumulativeDrag += dragAmount
                    }
                )
            },
        userScrollEnabled = false
    ) { page ->

        LessonContentView(
            lessonContent = subLessons[page],
            pagerState = pagerState,
            coroutineScope = coroutineScope,
            subLessons = subLessons,
            isAnswerGiven = remember { mutableStateOf(false) },
            answerFeedbackText = remember { mutableStateOf("") },
            subLessonStatus = subLessonStatus,
            onNext = {
                if (isPointsAssigned && !isPointsCollected) {
                    showPointsDialog.value = true
                } else {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(page + 1)
                    }
                }
                courseViewModel.markSubLessonAsCompleted(
                    subLessons[page].id, selectedLesson.id
                )
            },
            onFinish = {
                if (isPointsAssigned && !isPointsCollected) {
                    showPointsDialog.value = true
                } else {
                    navController.popBackStack()
                }
                courseViewModel.addOrUpdateLessonStatus(
                    selectedLesson.id, LessonStatus.COMPLETED
                )
            }
        )
    }
}


//
//@Composable
//fun LessonContentScreen(
//    navController: NavController,
//    courseViewModel: CourseViewModel, // Your ViewModel that holds the selectedLesson
//    noteViewModel: NoteViewModel,
//) {
//
//    // UI State
//    val context = LocalContext.current
//    val window = context.findActivity().window
//    var showAddNoteDialog by remember { mutableStateOf(false) }
//    var showPointsDialog = remember { mutableStateOf(false) }
//
//
//    // ViewModel States
//    val selectedLesson by courseViewModel.selectedLesson.collectAsState()
//    val selectedSubLessonIndex by courseViewModel.selectedSubLessonIndex.collectAsState()
//    val selectedLessonIndex by courseViewModel.selectedLessonIndex.collectAsState()
//    val selectedCourse by courseViewModel.selectedCourse.collectAsState()
//    val selectedStage by courseViewModel.selectedStage.collectAsState()
//
//
//    // All Sub lessons
//    val subLessons = selectedLesson?.lessonContents ?: emptyList()
//
//    // Pager State
//    val pagerState =
//        rememberPagerState(initialPage = selectedSubLessonIndex, pageCount = { subLessons.size })
//    val coroutineScope = rememberCoroutineScope()
//
//    // Navigation Identifiers
//    val lessonNumber = selectedLessonIndex + 1
//    val currentSubLesson = remember { mutableStateOf(subLessons.getOrNull(pagerState.currentPage)) }
//    val combinedLessonIndex = lessonNumber + (pagerState.currentPage + 1) / 10f
//
//    // Lessons status
//    val allLessonStatus = courseViewModel.lessonCompletionStatus.collectAsState()
//
//    // Calculated States
//    val isPointsAssigned = currentSubLesson.value?.points != 0
//    val isPointsCollected =
//        allLessonStatus.value[currentSubLesson.value?.id] == LessonStatus.COMPLETED
//
//
//    // Other properties for identifying the sub-lesson
//    val languageName = selectedCourse?.language ?: ""
//    val stageName = selectedStage?.title ?: ""
//
//
//    // Hide the status bar
//    ManageStatusBar(window) {
//        // Save progress when leaving screen
//        courseViewModel.saveProgress(
//            progress = LearningProgress(
//                courseId = selectedCourse!!.id,
//                stageId = selectedStage!!.id,
//                lessonId = selectedLesson!!.id,
//                subLessonId = subLessons[pagerState.currentPage].id,
//                subLessonName = subLessons[pagerState.currentPage].title,
//                stageName = selectedStage!!.title,
//                subLessonIndex = pagerState.currentPage
//            )
//        )
//    }
//
//    LaunchedEffect(pagerState.currentPage) {
//        currentSubLesson.value = selectedLesson?.lessonContents[pagerState.currentPage]
//    }
//
//
//    Box {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(
//                    Brush.linearGradient(
//                        colors = listOf(
//                            Color(0xFF1D1B25),
//                            Color(0xFF1D2836),
//                        ),
//                        start = Offset(0f, 0f),
//                        end = Offset(0f, 400f)
//                    )
//                )
//                .padding(top = 24.dp)
//        ) {
//            // Title and Progress Bar
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                Text(
//                    text = selectedLesson?.title
//                        ?: "Default Title",
//                    style = TextStyle(
//                        fontSize = 26.sp,
//                        fontWeight = FontWeight.Medium,
//                        color = Color.White
//                    )
//                )
//            }
//
//            val progress = (pagerState.currentPage + 1).toFloat() / subLessons.size
//
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(horizontal = 12.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(
//                    text = "${pagerState.currentPage + 1} / ${subLessons.size}",
//                    style = TextStyle(
//                        fontSize = 18.sp,
//                        fontWeight = FontWeight.Medium,
//                        color = Color.White
//                    )
//                )
//
//                Box(
//                    modifier = Modifier
//                        .padding(start = 14.dp, end = 24.dp)
//                        .weight(1f)
//                        .height(10.dp),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Box(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .clip(RoundedCornerShape(20.dp))
//                            .background(Color.White.copy(.8f))
//                            .align(Alignment.CenterStart)
//                    )
//
//                    Box(
//                        modifier = Modifier
//                            .fillMaxHeight()
//                            .fillMaxWidth(progress)
//                            .clip(RoundedCornerShape(20.dp))
//                            .background(Color(0xFF2FA20C))
//                            .align(Alignment.CenterStart)
//                    )
//                }
//
//                Icon(
//                    imageVector = Icons.Default.Star,
//                    contentDescription = "",
//                    tint = if (pagerState.currentPage < (subLessons.size - 1)) Color.White else Color.Yellow
//                )
//            }
//
//            Spacer(Modifier.height(16.dp))
//
//
//            // Lesson Content Part
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//            ) {
//                // Gradient Background
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(
//                            Brush.linearGradient(
//                                colors = listOf(
//                                    Color(0xFF2D3040), // Deep blue-gray
//                                    Color(0xFF4A4E69)  // Soft purple-gray
//                                ),
//                                start = Offset(0f, 0f),
//                                end = Offset(0f, 400f) // Adjust gradient direction
//                            )
//                        )
//                )
//
//
//                // Subtle Overlay with Stars
//                Canvas(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .blur(8.dp) // Add subtle blur to soften edges
//                ) {
//                    val width = size.width
//                    val height = size.height
//                    val starColor = Color(0xFFFFFFFF) // Soft white with transparency
//
//                    for (i in 1..30) { // Add random small stars
//                        val x = (0..width.toInt()).random().toFloat()
//                        val y = (0..height.toInt()).random().toFloat()
//                        drawCircle(
//                            color = starColor,
//                            radius = (2..6).random().toFloat(),
//                            center = Offset(x, y)
//                        )
//                    }
//                }
//
//
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//
//                ) {
//
//                    val swipeThreshold = 300f // The distance required to swipe to the previous page
//                    var cumulativeDrag by remember { mutableStateOf(0f) }
//
//                    HorizontalPager(
//                        state = pagerState,
//                        modifier = Modifier
//                            .weight(1f)
//                            .pointerInput(Unit) {
//                                detectHorizontalDragGestures(
//                                    onDragEnd = {
//                                        // Allow only backward navigation
//                                        if (cumulativeDrag > swipeThreshold && pagerState.currentPage > 0) {
//                                            // Swipe to the previous page
//                                            coroutineScope.launch {
//                                                pagerState.animateScrollToPage(pagerState.currentPage - 1)
//                                            }
//                                        }
//                                        // Reset the drag amount
//                                        cumulativeDrag = 0f
//                                    },
//                                    onHorizontalDrag = { _, dragAmount ->
//                                        // Accumulate drag amount only for left-to-right swipes
//                                        if (dragAmount > 0) {
//                                            cumulativeDrag += dragAmount
//                                        }
//                                    }
//                                )
//                            },
//                        userScrollEnabled = false // Disable default scrolling behavior
//                    ) { page ->
//
//                        //Feedback for Interactive answer
//                        val isAnswerGiven = remember { mutableStateOf(false) }
//                        val answerFeedbackText = remember { mutableStateOf("") }
//
//                        LessonContentView(
//                            lessonContent = subLessons[pagerState.currentPage],  // Pass the current lesson content
//                            pagerState = pagerState,
//                            coroutineScope = coroutineScope,
//                            lessons = subLessons,
//                            isAnswerGiven = isAnswerGiven,
//                            answerFeedbackText = answerFeedbackText,
//                            onNext = {
//                                if (isPointsAssigned && !isPointsCollected) {
//                                    showPointsDialog.value = true
//                                } else {
//                                    coroutineScope.launch {
//                                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
//                                    }
//                                }
//
//                                courseViewModel.markSubLessonAsCompleted(
//                                    selectedLesson?.lessonContents[pagerState.currentPage]?.id
//                                        ?: "",
//                                    selectedLesson?.id ?: ""
//                                )
//
//
//                            },
//                            onFinish = {
//                                Log.d("Points", isPointsAssigned.toString())
//                                Log.d("Points", isPointsCollected.toString())
//                                if (isPointsAssigned && !isPointsCollected) {
//                                    showPointsDialog.value = true
//                                } else {
//                                    navController.popBackStack()
//
//                                    isAnswerGiven.value = false
//                                    answerFeedbackText.value = ""
//                                }
//
//                                // Handle finish action
//                                courseViewModel.addOrUpdateLessonStatus(
//                                    selectedLesson!!.id,
//                                    LessonStatus.COMPLETED
//                                )
//
//                            }
//                        )
//                    }
//                }
//
//            }
//        }
//        // add note button
//        DraggableFloatingButton { isClicked ->
//            showAddNoteDialog = isClicked
//        }
//
//        AddNoteDialog(
//            showDialog = showAddNoteDialog,
//            onDismiss = { showAddNoteDialog = false },
//            noteViewModel = noteViewModel,
//            languageName = languageName,
//            stageName = stageName,
//            lessonNumber = lessonNumber,
//            subLessonNumber = combinedLessonIndex,
//            subLessonTittle = subLessons[pagerState.currentPage].title
//        )
//
//        // Show the Lottie dialog when collecting points
//        if (showPointsDialog.value) {
//
//            val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.rewarddiamondlotie))
//            // Dialog with Lottie Animation
//            androidx.compose.material.AlertDialog(
//                backgroundColor = Color.Transparent,
//                onDismissRequest = {
//                    showPointsDialog.value = false
//                }, // Dismiss when tapped outside
//                buttons = {
//                    // Button for dismissing the dialog (e.g., to simulate collection completion)
//                    Button(
//                        onClick = { showPointsDialog.value = false },
//                        modifier = Modifier.fillMaxWidth()
//                    ) {
//                        Text(text = "Close")
//                    }
//                },
//                text = {
//                    // Lottie Animation
//                    Box(
//                        contentAlignment = Alignment.Center,
//                        modifier = Modifier.fillMaxSize()
//                    ) {
//                        LottieAnimation(
//                            composition = composition,
//                            progress = animateLottieCompositionAsState(composition).progress
//                        )
//                    }
//                }
//            )
//        }
//    }
//}


// Extension to draw an underline below the Box
fun Modifier.drawUnderline(): Modifier = this.then(
    Modifier.drawBehind {
        val strokeWidth = 2.dp.toPx()
        val y = size.height
        drawLine(
            color = Color.White,
            start = Offset(0f, y),
            end = Offset(size.width, y),
            strokeWidth = strokeWidth
        )
    }
)


// Helper Function to Determine Button State
fun shouldEnableContinueButton(
    isInteractive: Boolean,
    answerFeedbackText: String,
    isAnswerGiven: Boolean,
    subLessonStatus: LessonStatus
): Boolean {
    return if (isInteractive) {
        (answerFeedbackText == "T" && isAnswerGiven) || subLessonStatus == LessonStatus.COMPLETED
    } else {
        true // Always enable for non-interactive questions
    }
}

fun Context.findActivity(): Activity {
    return (this as? Activity) ?: throw IllegalStateException("Context is not an Activity")
}

