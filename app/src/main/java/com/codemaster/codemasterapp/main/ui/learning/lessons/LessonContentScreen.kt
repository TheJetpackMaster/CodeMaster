package com.codemaster.codemasterapp.main.ui.learning.lessons


import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Build
import android.util.Log
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.ui.theme.bluishPython
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.EmptyCoroutineContext.get


@Composable
fun LessonContentScreen(
    navController: NavController,
    courseViewModel: CourseViewModel, // Your ViewModel that holds the selectedLesson
    noteViewModel: NoteViewModel
) {

    val context = LocalContext.current
    val window = context.findActivity().window

    // Hide the status bar
    DisposableEffect(Unit) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            // API 30 and above
            val controller = window.insetsController
            controller?.hide(WindowInsets.Type.statusBars())
            controller?.systemBarsBehavior =
                WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        } else {
            // Below API 30
            @Suppress("DEPRECATION")
            window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_FULLSCREEN or
                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    )
        }

        onDispose {
            // Restore the status bar when leaving the screen
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                window.insetsController?.show(WindowInsets.Type.statusBars())
            } else {
                @Suppress("DEPRECATION")
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
            }
        }
    }

    //SelectedSubLesson
    val selectedSubLesson by courseViewModel.selectedSubLessonIndex.collectAsState()

    // Collect lesson content and pager state from ViewModel
    val selectedLesson by courseViewModel.selectedLesson.collectAsState()
    val lessons =
        selectedLesson?.lessonContents ?: emptyList()  // Get lesson contents from selectedLesson
    val pagerState =
        rememberPagerState(initialPage = selectedSubLesson, pageCount = { lessons.size })
    val coroutineScope = rememberCoroutineScope()


    Log.d("selectedSub", selectedSubLesson.toString())

    LaunchedEffect(Unit) {
        courseViewModel.selectSubLessonIndex(0)
    }

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
            .padding(top = 24.dp)
    ) {
        // Title and Progress Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = selectedLesson?.subLessons?.getOrNull(pagerState.currentPage)?.title
                    ?: "Default Title",
                style = TextStyle(
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            )
        }

        val progress = (pagerState.currentPage + 1).toFloat() / lessons.size

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "${pagerState.currentPage + 1} / ${lessons.size}",
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
                tint = if (pagerState.currentPage < (lessons.size - 1)) Color.White else Color.Yellow
            )
        }

        Spacer(Modifier.height(16.dp))


        // Lesson Content Part
        Box(
            modifier = Modifier
                .fillMaxSize()

        ) {
            // Gradient Background
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF2D3040), // Deep blue-gray
                                Color(0xFF4A4E69)  // Soft purple-gray
                            ),
                            start = Offset(0f, 0f),
                            end = Offset(0f, 400f) // Adjust gradient direction
                        )
                    )
            )


            // Subtle Overlay with Stars
            Canvas(
                modifier = Modifier
                    .fillMaxSize()
                    .blur(8.dp) // Add subtle blur to soften edges
            ) {
                val width = size.width
                val height = size.height
                val starColor = Color(0xFFFFFFFF) // Soft white with transparency

                for (i in 1..30) { // Add random small stars
                    val x = (0..width.toInt()).random().toFloat()
                    val y = (0..height.toInt()).random().toFloat()
                    drawCircle(
                        color = starColor,
                        radius = (2..6).random().toFloat(),
                        center = Offset(x, y)
                    )
                }
            }


            Column(
                modifier = Modifier
                    .fillMaxSize()

            ) {
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier
                        .weight(1f)
                        .pointerInput(Unit) {
                            detectHorizontalDragGestures { _, dragAmount ->
                                // If swipe is to the right (backward swipe)
                                if (dragAmount > 0) {
                                    // Allow backward swipe only if we're not at the first page
                                    if (pagerState.currentPage > 0) {
                                        // Allow swipe backward
                                        coroutineScope.launch {
                                            pagerState.animateScrollToPage(pagerState.currentPage - 1)
                                        }

                                    } else {
                                        // If already at the first page, prevent further backward swipe
                                        coroutineScope.launch {
                                            pagerState.animateScrollToPage(pagerState.currentPage)
                                        }
                                    }
                                }

                                // If swipe is to the left (forward swipe)
                                else if (dragAmount < 0) {

                                }
                            }
                        },
                    userScrollEnabled = false
                ) { page ->
                    LessonContentView(
                        lessonContent = lessons[pagerState.currentPage],  // Pass the current lesson content
                        onNext = {
                            courseViewModel.markSubLessonAsCompleted(
                                selectedLesson?.subLessons[pagerState.currentPage]?.id ?: "",
                                selectedLesson?.id ?: ""
                            )
                            courseViewModel.updateLessonCompletionStatus()


                            if (pagerState.currentPage < lessons.size - 1) {
                                coroutineScope.launch {
                                    pagerState.animateScrollToPage(pagerState.currentPage + 1)
                                }
                            }
                        },
                        pagerState = pagerState,
                        coroutineScope = coroutineScope,
                        lessons = lessons,
                        onFinish = {
                            navController.popBackStack()
                        }
                    )
                }

            }
        }
    }
}


@Composable
fun LessonContentView(
    lessonContent: LessonContent,
    onNext: () -> Unit,
    pagerState: PagerState,
    coroutineScope: CoroutineScope,
    lessons: List<LessonContent>,
    onFinish: () -> Unit,

    ) {


    //Feedback for Interactive answer
    val isAnswerGiven = remember { mutableStateOf(false) }
    val isInteractiveTypeLesson =
        remember { mutableStateOf(lessonContent.type == LessonContentType.INTERACTIVE) }
    val answerFeedbackText = remember { mutableStateOf("") }

    LaunchedEffect(lessonContent.type == LessonContentType.INTERACTIVE) {
        Log.d("contentType", lessonContent.type.toString())
        isInteractiveTypeLesson.value = lessonContent.type == LessonContentType.INTERACTIVE
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        // Show the lesson title at the top
        Text(
            text = lessonContent.title,
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            ),
            modifier = Modifier.padding(bottom = 16.dp) // Space below the title
        )

        lessonContent.contentBlocks.forEach { contentBlock ->
            when (contentBlock) {
                is ContentBlock.Text -> {
                    Text(
                        text = contentBlock.text,
                        style = TextStyle(fontSize = 16.sp, color = Color.White),
                        lineHeight = 24.sp
                    )
                }

                is ContentBlock.Image -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(contentBlock.imageRes),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }

                is ContentBlock.Code -> {
                    // Split the code into individual lines
                    val codeLines = contentBlock.code.split("\n")

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Black, shape = RoundedCornerShape(8.dp))
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(min = 100.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            // Column for Line Numbers
                            Column(
                                modifier = Modifier
                                    .padding(end = 8.dp)
                                    .fillMaxHeight(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                // Render each line number
                                codeLines.forEachIndexed { index, _ ->
                                    Text(
                                        text = "${index + 1}",
                                        style = TextStyle(fontSize = 16.sp, color = Color.Gray)
                                    )
                                    Spacer(modifier = Modifier.height(4.dp)) // Ensure spacing between numbers
                                }
                            }

                            // Full Vertical Divider between line numbers and code
                            Box(
                                modifier = Modifier
                                    .width(12.dp) // Adjust width of the divider
                                    .fillMaxHeight() // Ensure divider fills the height of the Row

                            )

                            // Column for Code
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxHeight()
                            ) {
                                // Render each line of code
                                codeLines.forEach { line ->
                                    Text(
                                        text = line,
                                        style = TextStyle(fontSize = 16.sp, color = Color.Green)
                                    )
                                }
                            }
                        }
                    }
                }


                is ContentBlock.InteractiveCodeBlock -> {
//                    val userAnswer = remember { mutableStateOf("") }
//                    val feedback = remember { mutableStateOf("") }
//                    val codeWithAnswer = remember { mutableStateOf(contentBlock.incompleteCode) }
//                    val isAnswerCorrect = remember { mutableStateOf(false) }
//                    // State to track the selected answer and available options
//                    val buttonState = remember { mutableStateMapOf<String, String>() }
                    InteractiveCodeBlockView(
                        contentBlock = contentBlock,
                        isAnswerGiven = isAnswerGiven,
                        answerFeedbackText = answerFeedbackText,

                        )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))


        //Continue Button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(46.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                modifier = Modifier
                    .fillMaxSize(),
                onClick = {
                    onNext()
                    if (pagerState.currentPage < lessons.size - 1) {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    } else {
                        onFinish()
                    }

                    isAnswerGiven.value = false
                    answerFeedbackText.value = ""

                },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = bluishPython,
                    disabledContainerColor = Color(0xFF414559)
                ),
                enabled = shouldEnableContinueButton(
                    isInteractive = isInteractiveTypeLesson.value,
                    answerFeedbackText = answerFeedbackText.value,
                    isAnswerGiven = isAnswerGiven.value
                )
            ) {
                Text(
                    text = if (pagerState.currentPage < lessons.size - 1) "Continue" else "Finish",
                    style = TextStyle(fontSize = 16.sp, color = Color.White)
                )
            }
        }
    }
}


@Composable
fun InteractiveCodeBlockView(
    contentBlock: ContentBlock.InteractiveCodeBlock,
    isAnswerGiven: MutableState<Boolean>,
    answerFeedbackText: MutableState<String>

) {

    // Track the incomplete code and user answer state
    var codeWithAnswer by remember { mutableStateOf(contentBlock.incompleteCode) }
    var userAnswer by remember { mutableStateOf(contentBlock.userAnswer ?: "") }
    var feedback by remember { mutableStateOf("") }


    var isAnswerCorrect by remember { mutableStateOf(false) }
    val buttonState = remember {
        mutableStateMapOf<String, String>().apply {
            contentBlock.options.forEach { put(it, it) } // Initialize with all options
        }
    }


    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Question Text
        Text(
            text = contentBlock.question,
            style = TextStyle(fontSize = 16.sp, color = Color.White),
            lineHeight = 24.sp
        )

        // Code Block Display
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black, shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text(
                text = codeWithAnswer.replace(
                    "___",
                    userAnswer.takeIf { it.isNotEmpty() } ?: "___ (Select Option)"
                ),
                style = TextStyle(fontSize = 16.sp, color = Color.White)
            )
        }


        // Action Buttons (Clear, Reverse, Play)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left: Clear and Reverse Buttons
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {

                //Reverse Button
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .clickable(onClick = {
                            userAnswer = ""
                            codeWithAnswer = contentBlock.incompleteCode
                            feedback = ""
                            buttonState.clear()
                            contentBlock.options.forEach { buttonState[it] = it }
                            isAnswerGiven.value = false
                            answerFeedbackText.value = ""

                        })
                        .background(Color(0xFF2D3040).copy(alpha = 0.3f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Refresh,
                        contentDescription = "Clear",
                        tint = Color.White
                    )
                }

                // Clear Button
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .clickable(onClick = {
                            // Add logic for reversing actions if needed
                            feedback = "Undo not implemented yet!"
                        })
                        .background(Color(0xFF2D3040).copy(alpha = 0.3f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = "Reverse",
                        tint = Color.White
                    )
                }
            }

            // Right: Play Button
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .clickable(onClick = {
                        if (userAnswer.isNotEmpty()) {
                            isAnswerCorrect = userAnswer == contentBlock.correctAnswer
                            feedback = if (isAnswerCorrect) "Correct!" else "Try Again!"
                            answerFeedbackText.value = if (isAnswerCorrect) "T" else "F"
                            isAnswerGiven.value = true
                        }
                    })
                    .background(Color(0xFF66116E).copy(alpha = 0.3f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Play",
                    tint = Color.White
                )
            }
        }

        Spacer(Modifier.height(6.dp))

        // Option Buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            contentBlock.options.forEach { option ->
                Button(
                    onClick = {
                        // Reset the previous button
                        if (userAnswer.isNotEmpty()) {
                            buttonState[userAnswer] = userAnswer
                        }

                        // Update the selected answer
                        userAnswer = option
                        codeWithAnswer = contentBlock.incompleteCode.replace("___", option)
                        buttonState[option] = "" // Mark this button as selected
                        isAnswerGiven.value = false // Reset feedback until confirmed

                    },
                    enabled = buttonState.getOrElse(option) { option }
                        .isNotEmpty() && !isAnswerGiven.value,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF2D3040),
                        disabledContainerColor = Color(0xFF242734)
                    ),
                    shape = RoundedCornerShape(8.dp),
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                ) {
                    Text(
                        text = buttonState.getOrElse(option) { option },
                        style = TextStyle(fontSize = 14.sp, color = Color.White)
                    )
                }
            }
        }


        // Feedback Text
        if (isAnswerGiven.value) {
            Text(
                text = feedback,
                style = TextStyle(
                    fontSize = 18.sp,
                    color = if (isAnswerCorrect) Color.Green else Color.Red
                ),
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}

// Helper Function to Determine Button State
fun shouldEnableContinueButton(
    isInteractive: Boolean,
    answerFeedbackText: String,
    isAnswerGiven: Boolean
): Boolean {
    return if (isInteractive) {
        answerFeedbackText == "T" && isAnswerGiven // Enable only if correct answer is given
    } else {
        true // Always enable for non-interactive questions
    }
}

fun Context.findActivity(): Activity {
    return (this as? Activity) ?: throw IllegalStateException("Context is not an Activity")
}


//
//@SuppressLint("NewApi")
//@Composable
//fun LessonContentScreen() {
//    val context = LocalContext.current
//    val window = context.findActivity().window
//
//    // Hide the status bar
//    DisposableEffect(Unit) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//            // API 30 and above
//            val controller = window.insetsController
//            controller?.hide(WindowInsets.Type.statusBars())
//            controller?.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
//        } else {
//            // Below API 30
//            @Suppress("DEPRECATION")
//            window.decorView.systemUiVisibility = (
//                    View.SYSTEM_UI_FLAG_FULLSCREEN or
//                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                    )
//        }
//
//        onDispose {
//            // Restore the status bar when leaving the screen
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//                window.insetsController?.show(WindowInsets.Type.statusBars())
//            } else {
//                @Suppress("DEPRECATION")
//                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
//            }
//        }
//    }
//
//
//    var lessons by remember {
//        mutableStateOf(getLessonContents().toMutableList())
//    }
//
//
//    val pagerState = rememberPagerState(
//        initialPage = 0,
//        pageCount = { lessons.size }
//    )
//
//
//    val coroutineScope = rememberCoroutineScope()
////
////    val isCurrentLessonCompleted = lessons[if(pagerState.currentPage>0) pagerState.currentPage-1 else pagerState.currentPage].isCompleted
////    Log.d("completedLesson",isCurrentLessonCompleted.toString())
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                Brush.linearGradient(
//                    colors = listOf(
//                        Color(0xFF1D1B25),
//                        Color(0xFF1D2836),
//                    ),
//                    start = Offset(0f, 0f),
//                    end = Offset(0f, 400f)
//                )
//            )
//            .padding(top = 24.dp)
//    ) {
//        // Title and Progress Bar
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Text(
//                text = "Variables Basics",
//                style = TextStyle(
//                    fontSize = 26.sp,
//                    fontWeight = FontWeight.Medium,
//                    color = Color.White
//                )
//            )
//        }
//
//        val progress = (pagerState.currentPage + 1).toFloat() / lessons.size
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 12.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "${pagerState.currentPage + 1} / ${lessons.size}",
//                style = TextStyle(
//                    fontSize = 18.sp,
//                    fontWeight = FontWeight.Medium,
//                    color = Color.White
//                )
//            )
//
//            Box(
//                modifier = Modifier
//                    .padding(start = 14.dp, end = 24.dp)
//                    .weight(1f)
//                    .height(10.dp),
//                contentAlignment = Alignment.Center
//            ) {
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .clip(RoundedCornerShape(20.dp))
//                        .background(Color.White.copy(.8f))
//                        .align(Alignment.CenterStart)
//                )
//
//                Box(
//                    modifier = Modifier
//                        .fillMaxHeight()
//                        .fillMaxWidth(progress)
//                        .clip(RoundedCornerShape(20.dp))
//                        .background(Color(0xFF2FA20C))
//                        .align(Alignment.CenterStart)
//                )
//            }
//
//            Icon(
//                imageVector = Icons.Default.Star,
//                contentDescription = "",
//                tint = if (pagerState.currentPage < (lessons.size - 1)) Color.White else Color.Yellow
//            )
//        }
//
//        Spacer(Modifier.height(16.dp))
//
//
//        // Lesson Content Part
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//
//        ) {
//            // Gradient Background
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(
//                        Brush.linearGradient(
//                            colors = listOf(
//                                Color(0xFF2D3040), // Deep blue-gray
//                                Color(0xFF4A4E69)  // Soft purple-gray
//                            ),
//                            start = Offset(0f, 0f),
//                            end = Offset(0f, 400f) // Adjust gradient direction
//                        )
//                    )
//            )
//
//
//            // Subtle Overlay with Stars
//            Canvas(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .blur(8.dp) // Add subtle blur to soften edges
//            ) {
//                val width = size.width
//                val height = size.height
//                val starColor = Color(0xFFFFFFFF) // Soft white with transparency
//
//                for (i in 1..30) { // Add random small stars
//                    val x = (0..width.toInt()).random().toFloat()
//                    val y = (0..height.toInt()).random().toFloat()
//                    drawCircle(
//                        color = starColor,
//                        radius = (2..6).random().toFloat(),
//                        center = Offset(x, y)
//                    )
//                }
//            }
//
//
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//
//            ) {
//                HorizontalPager(
//                    state = pagerState,
//                    modifier = Modifier
//                        .weight(1f)
//                        .pointerInput(Unit) {
//                            detectHorizontalDragGestures { _, dragAmount ->
//                                // If swipe is to the right (backward swipe)
//                                if (dragAmount > 0) {
//                                    // Allow backward swipe only if we're not at the first page
//                                    if (pagerState.currentPage > 0) {
//                                        // Allow swipe backward
//                                        coroutineScope.launch {
//                                            pagerState.animateScrollToPage(pagerState.currentPage - 1)
//                                        }
//
//                                    } else {
//                                        // If already at the first page, prevent further backward swipe
//                                        coroutineScope.launch {
//                                            pagerState.animateScrollToPage(pagerState.currentPage)
//                                        }
//                                    }
//                                }
//
//                                // If swipe is to the left (forward swipe)
//                                else if (dragAmount < 0) {
//
//                                }
//                            }
//                        },
//                    userScrollEnabled = false
//                ) { page ->
//                    LessonContentView(
//                        lessonContent = lessons[page],
//                        onNext = {
//                            coroutineScope.launch {
//                                pagerState.animateScrollToPage(page + 1)
//                            }
//                        },
//                        onLessonCompleted = { completedLesson ->
//                            lessons[page] = completedLesson.copy(isCompleted = true)
//                        },
//                        pagerState = pagerState,
//                        coroutineScope = coroutineScope,
//                        lessons = lessons,
//
//                    )
//                }
//
//            }
//        }
//    }
//}
//
//
//fun Context.findActivity(): Activity {
//    return (this as? Activity) ?: throw IllegalStateException("Context is not an Activity")
//}
//
//
//@Composable
//fun LessonContentView(
//    lessonContent: LessonContent,
//    onNext: () -> Unit,
//    pagerState: PagerState,
//    coroutineScope: CoroutineScope,
//    lessons: List<LessonContent>,
//    onLessonCompleted: (LessonContent) -> Unit,
//
//) {
//
//    //Feedback for Interactive answer
//    val isAnswerGiven = remember { mutableStateOf(false) }
//    val isInteractiveTypeLesson =
//        remember { mutableStateOf(lessonContent.type == LessonContentType.INTERACTIVE) }
//    val answerFeedbackText = remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//            .verticalScroll(rememberScrollState()),
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//
//        // Show the lesson title at the top
//        Text(
//            text = lessonContent.title,
//            style = TextStyle(
//                fontSize = 22.sp,
//                fontWeight = FontWeight.Medium,
//                color = Color.White
//            ),
//            modifier = Modifier.padding(bottom = 16.dp) // Space below the title
//        )
//
//        lessonContent.contentBlocks.forEach { contentBlock ->
//            when (contentBlock) {
//                is ContentBlock.Text -> {
//                    Text(
//                        text = contentBlock.text,
//                        style = TextStyle(fontSize = 16.sp, color = Color.White),
//                        lineHeight = 24.sp
//                    )
//                }
//
//                is ContentBlock.Image -> {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(150.dp),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Image(
//                            painter = painterResource(contentBlock.imageRes),
//                            contentDescription = null,
//                            modifier = Modifier.fillMaxWidth()
//                        )
//                    }
//                }
//
//                is ContentBlock.Code -> {
//                    // Split the code into individual lines
//                    val codeLines = contentBlock.code.split("\n")
//
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .background(Color.Black, shape = RoundedCornerShape(8.dp))
//                            .padding(16.dp)
//                    ) {
//                        Row(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .heightIn(min = 100.dp),
//                            verticalAlignment = Alignment.Top
//                        ) {
//                            // Column for Line Numbers
//                            Column(
//                                modifier = Modifier
//                                    .padding(end = 8.dp)
//                                    .fillMaxHeight(),
//                                horizontalAlignment = Alignment.CenterHorizontally
//                            ) {
//                                // Render each line number
//                                codeLines.forEachIndexed { index, _ ->
//                                    Text(
//                                        text = "${index + 1}",
//                                        style = TextStyle(fontSize = 16.sp, color = Color.Gray)
//                                    )
//                                    Spacer(modifier = Modifier.height(4.dp)) // Ensure spacing between numbers
//                                }
//                            }
//
//                            // Full Vertical Divider between line numbers and code
//                            Box(
//                                modifier = Modifier
//                                    .width(12.dp) // Adjust width of the divider
//                                    .fillMaxHeight() // Ensure divider fills the height of the Row
//
//                            )
//
//                            // Column for Code
//                            Column(
//                                modifier = Modifier
//                                    .weight(1f)
//                                    .fillMaxHeight()
//                            ) {
//                                // Render each line of code
//                                codeLines.forEach { line ->
//                                    Text(
//                                        text = line,
//                                        style = TextStyle(fontSize = 16.sp, color = Color.Green)
//                                    )
//                                }
//                            }
//                        }
//                    }
//                }
//
//
//                is ContentBlock.InteractiveCodeBlock -> {
////                    val userAnswer = remember { mutableStateOf("") }
////                    val feedback = remember { mutableStateOf("") }
////                    val codeWithAnswer = remember { mutableStateOf(contentBlock.incompleteCode) }
////                    val isAnswerCorrect = remember { mutableStateOf(false) }
////                    // State to track the selected answer and available options
////                    val buttonState = remember { mutableStateMapOf<String, String>() }
//                    InteractiveCodeBlockView(
//                        contentBlock = contentBlock,
//                        isAnswerGiven = isAnswerGiven,
//                        answerFeedbackText = answerFeedbackText,
//
//                    )
//                }
//            }
//        }
//
//        Spacer(modifier = Modifier.weight(1f))
//
//
//        //Continue Button
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//                .height(46.dp),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Button(
//                modifier = Modifier
//                    .fillMaxSize(),
//                onClick = {
//                    if (pagerState.currentPage < lessons.size - 1) {
//                        coroutineScope.launch {
//                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
//                        }
//                    };
//                    isAnswerGiven.value = false
//                    answerFeedbackText.value = ""
//                    onLessonCompleted(
//                        lessonContent
//                    )
//
//                },
//                shape = RoundedCornerShape(8.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = bluishPython,
//                    disabledContainerColor = Color(0xFF414559)
//                ),
//                enabled = shouldEnableContinueButton(
//                    isInteractive = isInteractiveTypeLesson.value,
//                    answerFeedbackText = answerFeedbackText.value,
//                    isAnswerGiven = isAnswerGiven.value
//                )
//            ) {
//                Text(
//                    text = if (pagerState.currentPage < lessons.size - 1) "Continue" else "Finish",
//                    style = TextStyle(fontSize = 16.sp, color = Color.White)
//                )
//            }
//        }
//    }
//}
//
//// Helper Function to Determine Button State
//fun shouldEnableContinueButton(
//    isInteractive: Boolean,
//    answerFeedbackText: String,
//    isAnswerGiven: Boolean
//): Boolean {
//    return if (isInteractive) {
//        answerFeedbackText == "T" && isAnswerGiven // Enable only if correct answer is given
//    } else {
//        true // Always enable for non-interactive questions
//    }
//}
//
//
//@Composable
//fun InteractiveCodeBlockView(
//    contentBlock: ContentBlock.InteractiveCodeBlock,
//    isAnswerGiven: MutableState<Boolean>,
//    answerFeedbackText: MutableState<String>,
//
//) {
//
//    // Track the incomplete code and user answer state
//    var codeWithAnswer by remember { mutableStateOf(contentBlock.incompleteCode) }
//    var userAnswer by remember { mutableStateOf(contentBlock.userAnswer ?: "") }
//    var feedback by remember { mutableStateOf("") }
//
//
//
//    var isAnswerCorrect by remember { mutableStateOf(false) }
//    val buttonState = remember {
//        mutableStateMapOf<String, String>().apply {
//            contentBlock.options.forEach { put(it, it) } // Initialize with all options
//        }
//    }
//
//
//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.spacedBy(10.dp)
//    ) {
//        // Question Text
//        Text(
//            text = contentBlock.question,
//            style = TextStyle(fontSize = 16.sp, color = Color.White),
//            lineHeight = 24.sp
//        )
//
//        // Code Block Display
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.Black, shape = RoundedCornerShape(8.dp))
//                .padding(16.dp)
//        ) {
//            Text(
//                text = codeWithAnswer.replace(
//                    "___",
//                    userAnswer.takeIf { it.isNotEmpty() } ?: "___ (Select Option)"
//                ),
//                style = TextStyle(fontSize = 16.sp, color = Color.White)
//            )
//        }
//
//
//        // Action Buttons (Clear, Reverse, Play)
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            // Left: Clear and Reverse Buttons
//            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
//
//                //Reverse Button
//                Box(
//                    modifier = Modifier
//                        .size(32.dp)
//                        .clip(RoundedCornerShape(12.dp))
//                        .clickable(onClick = {
//                            userAnswer = ""
//                            codeWithAnswer = contentBlock.incompleteCode
//                            feedback = ""
//                            buttonState.clear()
//                            contentBlock.options.forEach { buttonState[it] = it }
//                            isAnswerGiven.value = false
//                            answerFeedbackText.value = ""
//
//                        })
//                        .background(Color(0xFF2D3040).copy(alpha = 0.3f)),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Refresh,
//                        contentDescription = "Clear",
//                        tint = Color.White
//                    )
//                }
//
//                // Clear Button
//                Box(
//                    modifier = Modifier
//                        .size(32.dp)
//                        .clip(RoundedCornerShape(12.dp))
//                        .clickable(onClick = {
//                            // Add logic for reversing actions if needed
//                            feedback = "Undo not implemented yet!"
//                        })
//                        .background(Color(0xFF2D3040).copy(alpha = 0.3f)),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Clear,
//                        contentDescription = "Reverse",
//                        tint = Color.White
//                    )
//                }
//            }
//
//            // Right: Play Button
//            Box(
//                modifier = Modifier
//                    .size(36.dp)
//                    .clip(RoundedCornerShape(12.dp))
//                    .clickable(onClick = {
//                        if (userAnswer.isNotEmpty()) {
//                            isAnswerCorrect = userAnswer == contentBlock.correctAnswer
//                            feedback = if (isAnswerCorrect) "Correct!" else "Try Again!"
//                            answerFeedbackText.value = if (isAnswerCorrect) "T" else "F"
//                            isAnswerGiven.value = true
//                        }
//                    })
//                    .background(Color(0xFF66116E).copy(alpha = 0.3f)),
//                contentAlignment = Alignment.Center
//            ) {
//                Icon(
//                    imageVector = Icons.Default.PlayArrow,
//                    contentDescription = "Play",
//                    tint = Color.White
//                )
//            }
//        }
//
//        Spacer(Modifier.height(6.dp))
//
//        // Option Buttons
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.spacedBy(8.dp)
//        ) {
//            contentBlock.options.forEach { option ->
//                Button(
//                    onClick = {
//                        // Reset the previous button
//                        if (userAnswer.isNotEmpty()) {
//                            buttonState[userAnswer] = userAnswer
//                        }
//
//                        // Update the selected answer
//                        userAnswer = option
//                        codeWithAnswer = contentBlock.incompleteCode.replace("___", option)
//                        buttonState[option] = "" // Mark this button as selected
//                        isAnswerGiven.value = false // Reset feedback until confirmed
//
//                    },
//                    enabled = buttonState.getOrElse(option) { option }
//                        .isNotEmpty() && !isAnswerGiven.value,
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = Color(0xFF2D3040),
//                        disabledContainerColor = Color(0xFF242734)
//                    ),
//                    shape = RoundedCornerShape(8.dp),
//                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
//                    modifier = Modifier
//                        .weight(1f)
//                        .fillMaxWidth(),
//                ) {
//                    Text(
//                        text = buttonState.getOrElse(option) { option },
//                        style = TextStyle(fontSize = 14.sp, color = Color.White)
//                    )
//                }
//            }
//        }
//
//
//        // Feedback Text
//        if (isAnswerGiven.value) {
//            Text(
//                text = feedback,
//                style = TextStyle(
//                    fontSize = 18.sp,
//                    color = if (isAnswerCorrect) Color.Green else Color.Red
//                ),
//                modifier = Modifier.padding(top = 16.dp)
//            )
//        }
//    }
//}
//
//
//
//sealed class ContentBlock {
//    data class Text(val text: String) : ContentBlock()
//    data class Image(val imageRes: Int) : ContentBlock()
//    data class Code(val code: String) : ContentBlock()
//    data class InteractiveCodeBlock(
//        val question: String,
//        val options: List<String>,
//        val correctAnswer: String,
//        val incompleteCode: String,
//        var userAnswer: String? = null
//    ) : ContentBlock()
//}
//
//data class LessonContent(
//    val title: String,
//    val contentBlocks: List<ContentBlock>,
//    val type: LessonContentType,
//    var isCompleted: Boolean = false
//)
//
//enum class LessonContentType {
//    INTERACTIVE,
//    NON_INTERACTIVE
//}


//@Composable
//fun LessonContentScreen() {
//
//    val lessons: List<LessonContent> = listOf(
//        // Lesson 1: Introduction to Variables
//        LessonContent(
//            title = "1: What are Variables?",
//            contentBlocks = listOf(
//                ContentBlock.Text(
//                    text = "In C, a variable is a place to store data that your program can use and manipulate. Each variable has a specific data type."
//                ),
//                ContentBlock.Image(
//                    imageRes = R.drawable.coding
//                ),
//                ContentBlock.Text(
//                    text = "For example, an `int` type is used to store whole numbers."
//                ),
//                ContentBlock.Text(
//                    text = "Here's how you declare a simple variable in C:"
//                ),
//                ContentBlock.Code(
//                    code = "#include <stdio.h>\n\nint main() {\n    int a;\n    return 0;\n}"
//                ),
//                ContentBlock.Text(
//                    text = "In this example, we have declared a variable `a` of type `int`."
//                )
//            )
//        ),
//
//        // Lesson 2: Initializing Variables
//        LessonContent(
//            title = "2: Initializing Variables",
//            contentBlocks = listOf(
//                ContentBlock.Text(
//                    text = "Once a variable is declared, we can assign it a value. This process is called initialization."
//                ),
//                ContentBlock.Image(
//                    imageRes = R.drawable.coding
//                ),
//                ContentBlock.Text(
//                    text = "For example, here’s how you can initialize an integer variable `a` to the value 10:"
//                ),
//
//                ContentBlock.Code(
//                    code = "#include <stdio.h>\n\nint main() {\n    int a = 10;\n    return 0;\n}"
//                ),
//                ContentBlock.Text(
//                    text = "In this code, we have initialized the variable `a` with the value 10."
//                )
//            )
//        ),
//
//        // Lesson 3: Using Variables in Operations
//        LessonContent(
//            title = "3: Using Variables in Operations",
//            contentBlocks = listOf(
//                ContentBlock.Text(
//                    text = "Once a variable is initialized, you can use it in various operations."
//                ),
//                ContentBlock.Text(
//                    text = "For example, adding two integers together can be done as follows:"
//                ),
//                ContentBlock.Code(
//                    code = "#include <stdio.h>\n\nint main() {\n    int a = 10, b = 5;\n    int sum = a + b;\n    printf(\"Sum: %d\\n\", sum);\n    return 0;\n}"
//                ),
//                ContentBlock.Text(
//                    text = "In this code, we declare two variables `a` and `b`, initialize them with values, and store their sum in another variable `sum`."
//                )
//            )
//        ),
//
//        // Lesson 4: Data Types and Variable Types
//        LessonContent(
//            title = "4: Understanding Data Types",
//            contentBlocks = listOf(
//                ContentBlock.Text(
//                    text = "Every variable in C has a data type. The most common data types are:"
//                ),
//                ContentBlock.Text(
//                    text = "- `int`: For storing integers (whole numbers)."
//                ),
//                ContentBlock.Text(
//                    text = "- `float`: For storing numbers with decimal points."
//                ),
//                ContentBlock.Text(
//                    text = "- `char`: For storing single characters."
//                ),
//                ContentBlock.Text(
//                    text = "Here’s an example of using different types of variables:"
//                ),
//                ContentBlock.Code(
//                    code = "#include <stdio.h>\n\nint main() {\n    int a = 10;\n    float b = 5.75;\n    char c = 'A';\n    printf(\"a: %d, b: %.2f, c: %c\\n\", a, b, c);\n    return 0;\n}"
//                ),
//                ContentBlock.Text(
//                    text = "In this code, we declare variables of types `int`, `float`, and `char` and print their values."
//                )
//            )
//        ),
//
//        // Lesson 5: Constants
//        LessonContent(
//            title = "5: Constants",
//            contentBlocks = listOf(
//                ContentBlock.Text(
//                    text = "Constants are similar to variables, but their values cannot be changed after they are set."
//                ),
//                ContentBlock.Text(
//                    text = "To define constants, we use the `#define` directive. For example:"
//                ),
//                ContentBlock.Code(
//                    code = "#include <stdio.h>\n\n#define PI 3.14\n\nint main() {\n    printf(\"Value of PI: %.2f\\n\", PI);\n    return 0;\n}"
//                ),
//                ContentBlock.Text(
//                    text = "In this code, `PI` is defined as a constant with a value of `3.14`. Constants are useful for values that do not change throughout the program."
//                )
//            )
//        ),
//
//        // After several lessons, ask a question
//        LessonContent(
//            title = "Interactive Question: Understanding Variables",
//            contentBlocks = listOf(
//                ContentBlock.Image(
//                    imageRes = R.drawable.coding
//                ),
//                ContentBlock.InteractiveCodeBlock(
//                    question = "Based on what you learned, complete the code to declare and initialize a variable `x` with the value 5:",
//                    options = listOf(
//                        "int x = 5;",
//                        "int 5 = x;",
//                        "x = 5 int;"
//                    ),
//                    correctAnswer = "int x = 5;",
//                    incompleteCode = "#include <stdio.h>\n\nint main() {\n    ___\n    return 0;\n}"
//                )
//            )
//        )
//    )
//
//
//    val pagerState = rememberPagerState(
//        initialPage = 0,
//        pageCount = { lessons.size }
//    )
//
//    val coroutineScope = rememberCoroutineScope()
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                Brush.linearGradient(
//                    colors = listOf(
//                        Color(0xFF1D1B25),
//                        Color(0xFF1D2836),
//
//                        ),
//                    start = Offset(0f, 0f),
//                    end = Offset(0f, 400f)
//                )
//            )
//            .padding(top = 24.dp)
//    ) {
//        // Title and Progress Bar
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Text(
//                text = "Variables Basics",
//                style = MaterialTheme.typography.headlineSmall.copy(color = Color.White)
//            )
//        }
//
//        val progress = (pagerState.currentPage + 1).toFloat() / lessons.size
//
//        // Outer Box to hold the progress bar and the label
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 12.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "${pagerState.currentPage + 1} / ${lessons.size}",
//                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White)
//            )
//
//            Box(
//                modifier = Modifier
//                    .padding(start = 14.dp, end = 24.dp)
//                    .weight(1f)
//                    .height(10.dp),
//                contentAlignment = Alignment.Center
//            ) {
//                // Background (inactive) part of the progress bar
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .clip(RoundedCornerShape(20.dp))
//                        .background(Color.White.copy(.8f))
//                        .align(Alignment.CenterStart)
//                )
//
//                // Active progress part
//                Box(
//                    modifier = Modifier
//                        .fillMaxHeight()
//                        .fillMaxWidth(progress)
//                        .clip(RoundedCornerShape(20.dp))
//                        .background(Color(0xFF2FA20C)) // Custom color for progress
//                        .align(Alignment.CenterStart)
//                )
//            }
//
//            Icon(
//                imageVector = Icons.Default.Star,
//                contentDescription = "",
//                tint = if(pagerState.currentPage < (lessons.size-1)) Color.White else Color.Yellow
//            )
//        }
//
//        Spacer(Modifier.height(16.dp))
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color.DarkGray)
//
//        ) {
//            // Lesson Content
//            HorizontalPager(
//                state = pagerState,
//                modifier = Modifier.weight(1f),
//                userScrollEnabled = false
//            ) { page ->
//                LessonContentView(
//                    lessonContent = lessons[page],
//                    onNext = {
//                        coroutineScope.launch {
//                            pagerState.animateScrollToPage(page + 1)
//                        }
//                    }
//                )
//            }
//
//            // Bottom Navigation Buttons
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                if (pagerState.currentPage > 0) {
//                    Button(
//                        onClick = {
//                            coroutineScope.launch {
//                                pagerState.animateScrollToPage(pagerState.currentPage - 1)
//                            }
//                        }
//                    ) {
//                        Text("Previous")
//                    }
//                }
//
//                Button(
//                    onClick = {
//                        if (pagerState.currentPage < lessons.size - 1) {
//                            coroutineScope.launch {
//                                pagerState.animateScrollToPage(pagerState.currentPage + 1)
//                            }
//                        }
//                    }
//                ) {
//                    Text(text = if (pagerState.currentPage < lessons.size - 1) "Next" else "Finish")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun LessonContentView(
//    lessonContent: LessonContent,
//    onNext: () -> Unit
//) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//            .verticalScroll(rememberScrollState()),
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//
//    ) {
//        lessonContent.contentBlocks.forEach { contentBlock ->
//            when (contentBlock) {
//                is ContentBlock.Text -> {
//                    Text(
//                        text = contentBlock.text,
//                        style = MaterialTheme.typography.bodyMedium,
//                        color = Color.White
//                    )
//                }
//
//                is ContentBlock.Image -> {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(100.dp),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Image(
//                            painter = painterResource(contentBlock.imageRes),
//                            contentDescription = null,
//                            modifier = Modifier.fillMaxWidth()
//                        )
//                    }
//                }
//
//                is ContentBlock.Code -> {
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .background(Color.Black, shape = RoundedCornerShape(8.dp))
//                            .padding(16.dp)
//                    ) {
//                        Text(
//                            text = contentBlock.code,
//                            style = MaterialTheme.typography.bodyMedium.copy(color = Color.Green)
//                        )
//                    }
//                }
//
//                is ContentBlock.InteractiveCodeBlock -> {
//                    InteractiveCodeBlockView(contentBlock, onNext)
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun InteractiveCodeBlockView(
//    contentBlock: ContentBlock.InteractiveCodeBlock,
//    onNext: () -> Unit
//) {
//    var userAnswer by remember { mutableStateOf("") }
//    var feedback by remember { mutableStateOf("") }
//    var codeWithAnswer by remember { mutableStateOf(contentBlock.incompleteCode) }
//    var isAnswerCorrect by remember { mutableStateOf(false) } // Track if the answer is correct
//
//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        Text(
//            text = contentBlock.question,
//            style = MaterialTheme.typography.bodyMedium,
//            color = Color.White
//        )
//
//        // Display incomplete code in a CodeBlock
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.Black, shape = RoundedCornerShape(8.dp))
//                .padding(16.dp)
//        ) {
//            Text(
//                text = codeWithAnswer.replace("___", "___ (Select Option)"),
//                style = MaterialTheme.typography.bodyMedium,
//                color = Color.White
//            )
//        }
//
//        // Display options in a row
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.spacedBy(8.dp) // Space between buttons
//        ) {
//            contentBlock.options.forEach { option ->
//                Button(
//                    onClick = {
//                        // Update the code with the selected answer
//                        codeWithAnswer = contentBlock.incompleteCode.replace("___", option)
//                        userAnswer = option
//
//                        // Check if the selected answer is correct
//                        isAnswerCorrect = userAnswer == contentBlock.correctAnswer
//
//                        // Provide feedback based on the answer
//                        feedback = if (isAnswerCorrect) {
//                            "Correct!"
//                        } else {
//                            "Try Again!"
//                        }
//                    },
//                    modifier = Modifier.weight(1f) // Make buttons fill the row
//                ) {
//                    Text(option)
//                }
//            }
//        }
//
//        // Show feedback only after the user selects an answer
//        if (userAnswer.isNotEmpty()) {
//            Text(
//                text = feedback,
//                color = if (isAnswerCorrect) Color.Green else Color.Red,
//                style = MaterialTheme.typography.bodyMedium
//            )
//        }
//    }
//}


//@Composable
//fun LessonContentScreen() {
//
//    val lessons: List<LessonContent> = listOf(
//        LessonContent(
//            title = "Lesson 1: Show Results",
//            contentBlocks = listOf(
//                ContentBlock.Text(
//                    text = "When you use a software, website, or app, you expect it to do something and show you results."
//                ),
//                ContentBlock.Image(
//                    imageRes = R.drawable.coding // Replace with your actual drawable resource
//                ),
//                ContentBlock.Code(
//                    code = "print(\"Hello, World!\")"
//                ),
//            )
//        ),
//        LessonContent(
//            title = "Lesson 2: Variables",
//            contentBlocks = listOf(
//                ContentBlock.Text(
//                    text = "Variables allow you to store and manage data in your program. For example:"
//                ),
//                ContentBlock.Image(
//                    imageRes = R.drawable.coding // Replace with your actual drawable resource
//                ),
////                ContentBlock.Code(
////                    code = "x = 10\ny = 20\nprint(x + y)"
////                ),
//                ContentBlock.InteractiveCodeBlock(
//                    question = "What should `y` be to make `x + y = 30`?",
//                    options = listOf("10", "20", "30"),
//                    correctAnswer = "20"
//                )
//            )
//        ),
//        // Add more lessons as required
//    )
//
//    val pagerState = rememberPagerState(
//        initialPage = 0,
//        pageCount = { lessons.size }
//    )
//
//    val coroutineScope = rememberCoroutineScope()
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.DarkGray)
//            .statusBarsPadding()
//    ) {
//        // Title and Progress Bar
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Text(
//                text = lessons[pagerState.currentPage].title,
//                style = MaterialTheme.typography.headlineLarge.copy(color = Color.White)
//            )
//            Text(
//                text = "${pagerState.currentPage + 1} / ${lessons.size}",
//                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White)
//            )
//        }
//
//        // Progress Bar
//        LinearProgressIndicator(
//            progress = (pagerState.currentPage + 1).toFloat() / lessons.size,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 16.dp)
//        )
//
//        // Lesson Content
//        HorizontalPager(
//            state = pagerState,
//            modifier = Modifier.weight(1f),
//            userScrollEnabled = false
//        ) { page ->
//            LessonContentView(
//                lessonContent = lessons[page],
//                onNext = {
//                    coroutineScope.launch {
//                        pagerState.animateScrollToPage(page + 1)
//                    }
//                }
//            )
//        }
//
//        // Bottom Navigation Buttons
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            if (pagerState.currentPage > 0) {
//                Button(
//                    onClick = {
//                        coroutineScope.launch {
//                            pagerState.animateScrollToPage(pagerState.currentPage - 1)
//                        }
//                    }
//                ) {
//                    Text("Previous")
//                }
//            }
//
//            Button(
//                onClick = {
//                    if (pagerState.currentPage < lessons.size - 1) {
//                        coroutineScope.launch {
//                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
//                        }
//                    }
//                }
//            ) {
//                Text("Next")
//            }
//        }
//    }
//}
//
//@Composable
//fun LessonContentView(
//    lessonContent: LessonContent,
//    onNext: () -> Unit
//) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        lessonContent.contentBlocks.forEach { contentBlock ->
//            when (contentBlock) {
//                is ContentBlock.Text -> {
//                    Text(
//                        text = contentBlock.text,
//                        style = MaterialTheme.typography.bodyMedium,
//                        color = Color.White
//                    )
//                }
//
//                is ContentBlock.Image -> {
//                    Image(
//                        painter = painterResource(contentBlock.imageRes),
//                        contentDescription = null,
//                        modifier = Modifier.fillMaxWidth()
//                    )
//                }
//
//                is ContentBlock.Code -> {
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .background(Color.Black, shape = RoundedCornerShape(8.dp))
//                            .padding(16.dp)
//                    ) {
//                        Text(
//                            text = contentBlock.code,
//                            style = MaterialTheme.typography.bodyMedium.copy(color = Color.Green)
//                        )
//                    }
//                }
//
//                is ContentBlock.InteractiveCodeBlock -> {
//                    InteractiveCodeBlockView(contentBlock, onNext)
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun InteractiveCodeBlockView(
//    contentBlock: ContentBlock.InteractiveCodeBlock,
//    onNext: () -> Unit
//) {
//    var userAnswer by remember { mutableStateOf("") }
//    var feedback by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        Text(
//            text = contentBlock.question,
//            style = MaterialTheme.typography.bodyMedium,
//            color = Color.White
//        )
//
//        // Display options in a row
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.spacedBy(8.dp) // Space between buttons
//        ) {
//            contentBlock.options.forEach { option ->
//                Button(
//                    onClick = {
//                        userAnswer = option
//                        if (userAnswer == contentBlock.correctAnswer) {
//                            feedback = "Correct!"
//                        } else {
//                            feedback = "Try Again!"
//                        }
//                    },
//                    modifier = Modifier.weight(1f) // Make buttons fill the row
//                ) {
//                    Text(option)
//                }
//            }
//        }
//
//        // Show feedback
//        Text(
//            text = feedback,
//            color = if (feedback == "Correct!") Color.Green else Color.Red,
//            style = MaterialTheme.typography.bodyMedium
//        )
//
//        // Try Again / Reveal Buttons
//        if (feedback == "Try Again!") {
//            Button(onClick = { feedback = "" }) {
//                Text("Try Again")
//            }
//        } else if (feedback == "Correct!") {
//            Button(onClick = onNext) {
//                Text("Next Lesson")
//            }
//        }
//    }
//}
//
//// Data Classes for Lessons
//data class LessonContent(
//    val title: String,
//    val contentBlocks: List<ContentBlock>
//)
//
//sealed class ContentBlock {
//    data class Text(val text: String) : ContentBlock()
//    data class Image(@DrawableRes val imageRes: Int) : ContentBlock()
//    data class Code(val code: String) : ContentBlock()
//    data class InteractiveCodeBlock(
//        val question: String,
//        val options: List<String>,
//        val correctAnswer: String
//    ) : ContentBlock()
//}
//

