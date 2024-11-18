package com.codemaster.codemasterapp.main.ui.learning.lessons

import android.widget.Toast
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import com.codemaster.codemasterapp.main.ui.components.LanguageLevelBasicLotieCard
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.ui.theme.bluishPython

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageLevelScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    // Add state to track selected language and level
    var selectedLanguage by remember { mutableStateOf("C Language") }
    var selectedLevel by remember { mutableStateOf("Basic") }

    //Lesson or Description
    var selectedTab by remember {
        mutableStateOf(LessonOrDescription.LESSON)
    }

    val courseTitle = when {
        selectedLanguage == "C Language" && selectedLevel == "Basic" -> "C Programming for Beginners"
        else -> "Default Course Title"
    }


    val expandedLessons = remember { mutableStateOf(mapOf<Int, Boolean>()) }

    Scaffold(
        topBar = {
            TopAppBar(
                windowInsets = WindowInsets(top = 30.dp, bottom = 0.dp),
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "C - Basic Concepts",
                            color = Color.Black.copy(.6f),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Gray.copy(.1f),
                ),
                navigationIcon = {
                    IconButton(
                        onClick = { /* Navigate back */ },
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.KeyboardArrowLeft,
                            contentDescription = "Go Back",
                            tint = Color.Black.copy(.6f),
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF7F9FC))
                .padding(top = paddingValues.calculateTopPadding())
                .navigationBarsPadding()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Spacer(Modifier.height(4.dp))
                // Display Course Overview Card
                LanguageLevelBasicLotieCard()

                Spacer(modifier = Modifier.height(12.dp))

                Column(modifier = Modifier.padding(horizontal = 14.dp)) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // "28 lessons" Text with gray color
                        Text(
                            "28 lessons",
                            color = Color.Gray,
                            fontSize = 13.sp
                        )

                        Spacer(Modifier.width(8.dp))

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Rating Star",
                            tint = Color(0xFFF6AD42),
                            modifier = Modifier.size(18.dp)
                        )
                        Text(
                            text = "4.9", color = Color.Gray,
                            fontSize = 14.sp,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }

                    Spacer(Modifier.height(4.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Text(
                            text = "Lessons",
                            color = if (selectedTab == LessonOrDescription.LESSON) Color.Blue else Color.Gray,
                            fontSize = 16.sp,
                            modifier = Modifier
                                .clip(CircleShape)
                                .clickable(onClick = {
                                    selectedTab = LessonOrDescription.LESSON
                                })
                                .padding(4.dp)
                        )

                        Text(
                            text = "Description",
                            color = if (selectedTab == LessonOrDescription.DESCRIPTION) Color.Blue else Color.Gray,
                            fontSize = 16.sp,
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
                        LessonOrDescription.LESSON -> {
                            LazyColumn {
                                itemsIndexed(getLessons()) { index, lesson ->
                                    // Handling section expansion
                                    val isExpanded = expandedLessons.value[index] ?: false

                                    // Check if it's the last item in the list
                                    val isLastLesson = index == getLessons().size - 1

                                    Column {
                                        LessonItem(
                                            title = lesson.title,
                                            description = lesson.description,
                                            status = lesson.status,
                                            onLessonClicked = {
                                                // Toggle expansion of this lesson's sub-lessons
                                                expandedLessons.value =
                                                    expandedLessons.value.toMutableMap().apply {
                                                        put(index, !isExpanded)
                                                    }
                                            },
                                            isExpanded = isExpanded,
                                            isLastLesson = isLastLesson // Pass the check here
                                        )

                                        if (isExpanded) {
                                            // Display sub-lessons if the lesson is expanded
                                            lesson.subLessons.forEachIndexed { subIndex, subLesson ->
                                                // Check if it's the last sub-lesson in the list
                                                val isLastSubLesson =
                                                    subIndex == lesson.subLessons.size - 1

                                                SubLessonItem(
                                                    subLesson = subLesson,
                                                    onSubLessonComplete = {
                                                        // Handle sub-lesson completion
                                                        if (subLesson.status == LessonStatus.LOCKED) {
                                                            subLesson.status = LessonStatus.ACTIVE
                                                        } else if (subLesson.status == LessonStatus.ACTIVE) {
                                                            subLesson.status =
                                                                LessonStatus.COMPLETED
                                                        }
                                                    },
                                                    isLastSubLesson = isLastSubLesson // Pass the isLastSubLesson check here
                                                )
                                            }
                                        }
                                    }
                                }
                            }

                        }

                        LessonOrDescription.DESCRIPTION -> {
                            val currentCourseLevelDesc = getCourseDescription()
                            CourseDescriptionScreen(
                                course = currentCourseLevelDesc
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SubLessonItem(
    subLesson: SubLesson,
    onSubLessonComplete: () -> Unit,
    isLastSubLesson: Boolean
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp) // Indentation for sub-lessons
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .size(26.dp)
                    .background(
                        when (subLesson.status) {
                            LessonStatus.ACTIVE -> Color.Green.copy(alpha = 0.6f)
                            LessonStatus.COMPLETED -> bluishPython.copy(alpha = 0.6f)
                            else -> Color.Gray.copy(alpha = 0.6f)
                        },
                        shape = CircleShape
                    )
                    .border(
                        width = 2.dp,
                        color = when (subLesson.status) {
                            LessonStatus.ACTIVE -> Color.Green
                            LessonStatus.COMPLETED -> bluishPython
                            else -> Color.Gray
                        },
                        shape = CircleShape
                    )
            ) {
                Icon(
                    imageVector = when (subLesson.status) {
                        LessonStatus.ACTIVE -> Icons.Default.PlayArrow
                        LessonStatus.COMPLETED -> Icons.Default.Check
                        LessonStatus.LOCKED -> Icons.Default.Lock
                    },
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(16.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = subLesson.title,
                    style = MaterialTheme.typography.bodyMedium,
                    color = when (subLesson.status) {
                        LessonStatus.ACTIVE -> Color.Black
                        LessonStatus.COMPLETED -> bluishPython
                        else -> Color.Gray
                    },
                    maxLines = 1
                )
                Text(
                    text = subLesson.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = when (subLesson.status) {
                        LessonStatus.ACTIVE, LessonStatus.COMPLETED -> Color.Gray
                        else -> Color.LightGray
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
                start = 34.dp
            )
        ) {
            for (i in 1..3) {
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
    onLessonClicked: () -> Unit, // Callback for expanding the lesson
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
            .clickable(enabled = status != LessonStatus.LOCKED) {
                Toast
                    .makeText(context, "Lesson: $title", Toast.LENGTH_SHORT)
                    .show()
            }
            .padding(horizontal = 8.dp)
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

                            else -> Brush.linearGradient(listOf(Color.LightGray, Color.LightGray))
                        },
                        shape = CircleShape
                    )
                    .border(
                        width = if (status == LessonStatus.ACTIVE) glowAnimation.value.dp else 1.dp,
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
                    tint = if (status == LessonStatus.LOCKED) Color.Gray else Color.White,
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
                        LessonStatus.ACTIVE -> Color.Black
                        LessonStatus.COMPLETED -> bluishPython
                        else -> Color.Gray
                    },
                    maxLines = 1
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodySmall,
                    color = when (status) {
                        LessonStatus.ACTIVE, LessonStatus.COMPLETED -> Color.Gray
                        else -> Color.LightGray
                    },
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            // Expand Arrow (Right Arrow)
            IconButton(onClick = { onLessonClicked() }) {
                Icon(
                    imageVector = if (isExpanded) Icons.Default.KeyboardArrowDown else Icons.AutoMirrored.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = when (status) {
                        LessonStatus.ACTIVE -> Color.Black
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
                start = 22.dp
            )
        ) {
            for (i in 1..3) {
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
fun CourseDescriptionScreen(course: Course) {
    Column(
        modifier = Modifier
            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = course.title,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = course.description,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "Other Information",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        Text(
            text = course.otherInfo,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Gray
        )

        Spacer(Modifier.height(12.dp))
    }
}


data class Lesson(
    val title: String,
    val description: String,
    var status: LessonStatus = LessonStatus.LOCKED,
    val subLessons: List<SubLesson> = emptyList() // Sub-lessons for each main lesson
)

enum class LessonStatus {
    COMPLETED, ACTIVE, LOCKED
}

data class SubLesson(
    val title: String,
    val description: String,
    var status: LessonStatus = LessonStatus.LOCKED // Can be LOCKED, ACTIVE, or COMPLETED
)

enum class LessonOrDescription {
    LESSON, DESCRIPTION
}

data class Course(
    val title: String,
    val description: String, // Detailed description of the course or level
    val otherInfo: String // Any other information you'd like to add (e.g., prerequisites, duration, etc.)
)


fun getLessons(): List<Lesson> {
    return listOf(
        Lesson(
            "Introduction to Programming Languages",
            "An overview of what programming languages are, why we need them, and the history of programming languages.",
            status = LessonStatus.COMPLETED,
            subLessons = listOf(
                SubLesson(
                    "Sub-lesson 1: What is a Programming Language?",
                    "Understanding the purpose and types of programming languages.",
                    LessonStatus.COMPLETED
                ),
                SubLesson(
                    "Sub-lesson 2: Evolution of Programming Languages",
                    "A brief history of programming languages and their development over time.",
                    LessonStatus.COMPLETED
                ),
                SubLesson(
                    "Sub-lesson 3: Importance of C",
                    "Why C is considered one of the most important programming languages.",
                    LessonStatus.COMPLETED
                )
            )
        ),
        Lesson(
            "Introduction to C Programming",
            "An introduction to the C programming language, its origins, and its widespread usage.",
            status = LessonStatus.COMPLETED,
            subLessons = listOf(
                SubLesson(
                    "Sub-lesson 1: What is C?",
                    "An introduction to the C language, its features, and characteristics.",
                    LessonStatus.COMPLETED
                ),
                SubLesson(
                    "Sub-lesson 2: Setting Up C Environment",
                    "Instructions for installing a C compiler and setting up the development environment.",
                    LessonStatus.COMPLETED
                ),
                SubLesson(
                    "Sub-lesson 3: Hello World Program",
                    "How to write and run your first simple program in C.",
                    LessonStatus.COMPLETED
                )
            )
        ),
        Lesson(
            "Basic Syntax of C",
            "Understanding the syntax rules for writing C programs, including structure, functions, and statements.",
            status = LessonStatus.ACTIVE,
            subLessons = listOf(
                SubLesson(
                    "Sub-lesson 1: Structure of a C Program",
                    "Overview of a basic C program structure, including main() function, headers, and statements.",
                    LessonStatus.COMPLETED
                ),
                SubLesson(
                    "Sub-lesson 2: C Keywords",
                    "An introduction to reserved keywords in C and their usage.",
                    LessonStatus.ACTIVE
                ),
                SubLesson(
                    "Sub-lesson 3: Writing Your First C Program",
                    "Step-by-step guidance to write, compile, and execute a simple C program.",
                    LessonStatus.LOCKED
                )
            )
        ),
        Lesson(
            "Variables and Data Types",
            "Learn about variables, constants, and data types used in C programming.",
            status = LessonStatus.LOCKED,
            subLessons = listOf(
                SubLesson(
                    "Sub-lesson 1: Variables in C",
                    "How to declare and use variables to store data in C.",
                    LessonStatus.LOCKED
                ),
                SubLesson(
                    "Sub-lesson 2: Constants in C",
                    "Understanding constants and how they are used in C programs.",
                    LessonStatus.LOCKED
                ),
                SubLesson(
                    "Sub-lesson 3: Data Types",
                    "Introduction to different data types in C like int, char, float, and double.",
                    LessonStatus.LOCKED
                )
            )
        ),
        Lesson(
            "Operators in C",
            "Understanding the different types of operators used in C for performing calculations and comparisons.",
            status = LessonStatus.LOCKED,
            subLessons = listOf(
                SubLesson(
                    "Sub-lesson 1: Arithmetic Operators",
                    "Learn the basic arithmetic operators used in C for addition, subtraction, multiplication, etc.",
                    LessonStatus.LOCKED
                ),
                SubLesson(
                    "Sub-lesson 2: Relational and Logical Operators",
                    "Introduction to relational and logical operators in C.",
                    LessonStatus.LOCKED
                ),
                SubLesson(
                    "Sub-lesson 3: Assignment and Increment/Decrement Operators",
                    "Using assignment, increment, and decrement operators in C.",
                    LessonStatus.LOCKED
                )
            )
        ),
        Lesson(
            "Control Flow: Conditional Statements",
            "Understanding how to control the flow of a C program using conditional statements.",
            status = LessonStatus.LOCKED,
            subLessons = listOf(
                SubLesson(
                    "Sub-lesson 1: The If Statement",
                    "How to use the if statement to perform conditional checks in C.",
                    LessonStatus.LOCKED
                ),
                SubLesson(
                    "Sub-lesson 2: The If-Else Statement",
                    "Learn how to use if-else for branching logic.",
                    LessonStatus.LOCKED
                ),
                SubLesson(
                    "Sub-lesson 3: The Switch Statement",
                    "Introduction to using the switch statement for multi-way branching.",
                    LessonStatus.LOCKED
                )
            )
        ),
        Lesson(
            "Loops in C",
            "Learn how to use loops in C for repeating actions in a program.",
            status = LessonStatus.LOCKED,
            subLessons = listOf(
                SubLesson(
                    "Sub-lesson 1: The For Loop",
                    "How to use a for loop for iteration in C.",
                    LessonStatus.LOCKED
                ),
                SubLesson(
                    "Sub-lesson 2: The While Loop",
                    "Using the while loop for repeating code while a condition is true.",
                    LessonStatus.LOCKED
                ),
                SubLesson(
                    "Sub-lesson 3: The Do-While Loop",
                    "Understanding the do-while loop and when to use it.",
                    LessonStatus.LOCKED
                )
            )
        )
    )
}

fun getCourseDescription(): Course {
    return Course(
        title = "Basic Concepts of C Programming",
        description = """
            This course introduces you to the fundamental concepts of the C programming language. 
            It covers everything from setting up a development environment to understanding syntax, 
            variables, operators, control flow, and more. Each lesson will introduce key aspects 
            of the C language with examples and exercises.
        """.trimIndent(),
        otherInfo = "Lessons: 28 hours\nPrerequisites: Basic understanding of programming concepts"
    )
}


fun getLessonsForLanguageAndLevel(language: String, level: String): List<Lesson> {
    return when {
        language == "C Language" && level == "Basic" -> listOf(

            // Add more lessons
        )

        language == "Java" && level == "Intermediate" -> listOf(

            // Add more lessons
        )

        else -> emptyList() // Default case
    }
}

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
