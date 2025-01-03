package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.components.AchievementCard
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.components.AchievementScreenCustomTopBar
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Brush
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.components.LanguageProgressCard
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementScreen(
    navController: NavController,
    courseViewModel: CourseViewModel,
    courses: List<Course>,
    allLessonsStatus: State<Map<String, LessonStatus>>
) {
    val scrollState = rememberScrollState()
    var currentTab by remember { mutableStateOf(0) }
    val pagerState = rememberPagerState(pageCount = { 2 })
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            AchievementScreenCustomTopBar(
                onTabSelected = { selectedIndex ->
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(selectedIndex) // Animate to selected tab
                    }
                },
                pagerState = pagerState // Pass the pagerState as well
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                // .padding(bottom = 80.dp),
                //  .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HorizontalPager(
                    state = pagerState,
                ) { page ->
                    when (page) {
                        0 -> AchievementsContent(
                            courses = courses,
                            allLessonsStatus = allLessonsStatus
                        )
                        1 -> ProgressContent(courseViewModel = courseViewModel)
                    }
                }
            }

        }

    }
}

@Composable
fun AchievementsContent(
    courses: List<Course>,
    allLessonsStatus: State<Map<String, LessonStatus>>
) {

    val titles = listOf(
        "First Step",               // For completing the first lesson or quiz
        "Syntax Seeker",            // For completing a few basic coding challenges
        "Logic Explorer",           // For solving logic-based challenges
        "Challenge Conqueror",      // For taking on advanced challenges
        "Quiz Master",              // For acing multiple quizzes
        "Code Navigator",           // For completing a significant number of lessons
        "Debugging Genius",         // For solving debugging challenges
        "Algorithm Ace",            // For mastering algorithms
        "Pathfinder",               // For exploring all beginner-level lessons
        "Trailblazer",              // For completing intermediate-level lessons
        "Code Virtuoso",            // For completing advanced lessons
        "Strategist",               // For planning and solving complex problems
        "Innovator",                // For creating unique solutions in coding challenges
        "Mastermind",               // For achieving a high score in all lessons
        "Visionary",                // For completing all stages of the app
//        "Heroic Learner",           // For helping others in a community feature (if applicable)
//        "Ultimate Champion",        // For completing 100% of the app
//        "Explorer",                 // For exploring various features of the app
//        "Legend",                   // For reaching a major milestone in points
//        "Trail Master",             // For staying consistent in learning
//        "Coding Maverick",          // For breaking into new coding territories
//        "Learning Titan",           // For earning a significant number of points
//        "Knowledge Seeker",         // For continuously learning without breaks
//        "Achievement Hunter",       // For unlocking 10 achievements
//        "Epic Achiever",            // For unlocking 20 achievements
//        "Infinity Learner",         // For completing the app multiple times
//        "Code Whisperer",           // For achieving perfect scores in coding challenges
//        "Quiz Wizard",              // For scoring 100% in quizzes
//        "Perfectionist",            // For achieving perfection in lessons
//        "Ultimate Guru"             // For being an all-around champion in the app
    )

// List of achievement descriptions with the new ones
    val achievementDescriptions = listOf(
        // First Step: Complete the first lesson or quiz
       "Complete the first lesson or quiz from any course.",

        // Syntax Seeker: Complete at least 10 interactive lessons from C, 5 from C++, and 5 from DSA
        "Complete at least 10 interactive lessons from C, 5 from C++, and 5 from DSA.",

        // Logic Explorer: Solve at least 10 interactive logic-based challenges from any course
        "Solve at least 10 interactive logic-based challenges from any course.",

        // Challenge Conqueror: Complete at least 5 quizzes from each stage in C
        "Complete at least 5 quizzes from each stage in C.",

        // Quiz Master: Complete at least 20 quizzes (advanced quizzes) across C, C++, and DSA
        "Complete at least 20 quizzes (advanced quizzes) across C, C++, and DSA.",

        // Code Navigator: Complete at least 15 lessons from C, 15 from C++, and 10 from DSA
        "Complete at least 15 lessons from C, 15 from C++, and 10 from DSA.",

        // Learning Master: Complete at least 10 non-interactive lessons across C, C++, and DSA
        "Complete at least 10 non-interactive lessons across C, C++, and DSA.",

        // Explorer of Stages: Complete 5 lessons from each stage (Beginner, Intermediate, Advanced) in C
        "Complete 5 lessons from each stage (Beginner, Intermediate, Advanced) in C.",

        // Master of Completion: Complete 10 lessons from C, 10 from C++, and 10 from DSA
        "Complete 10 lessons from C, 10 from C++, and 10 from DSA.",

        // Multi-Stage Champion: Complete 5 lessons from each stage (Beginner, Intermediate, Advanced) across C, C++, and DSA
        "Complete 5 lessons from each stage (Beginner, Intermediate, Advanced) across C, C++, and DSA.",

        // Quiz Overlord: Complete at least 40 quizzes across all courses
        "Complete at least 40 quizzes across all courses.",

        // Code Virtuoso: Complete at least 20 advanced lessons from C, C++, and DSA
        "Complete at least 20 advanced lessons from C, C++, and DSA.",

        // Path Finder: Complete 10 lessons from C and 10 lessons from C++ (any stage)
        "Complete 10 lessons from C and 10 lessons from C++ (any stage).",

        // Stage Conqueror: Complete 5 lessons from each stage (Beginner, Intermediate, Advanced) across C and C++
        "Complete 5 lessons from each stage (Beginner, Intermediate, Advanced) across C and C++.",

        // Final Mastery: Complete all lessons from C, C++, and DSA (any stage)
        "Complete all lessons from C, C++, and DSA (any stage)."
    )


    // List of animation resource IDs (Assume you have different animation files)
    val animationResources = listOf(
        R.drawable.achiever, R.drawable.prodigy,
        R.drawable.master, R.drawable.champion,
        R.drawable.maverick, R.drawable.hero,
        R.drawable.legend, R.drawable.titan,
        R.drawable.conqueror, R.drawable.innovator,

        R.drawable.strategist, R.drawable.philanthropist,
        R.drawable.expert, R.drawable.winner,
        R.drawable.adventurer, R.drawable.pathfinder,
        R.drawable.explorer, R.drawable.creator,
        R.drawable.builder, R.drawable.visionary,

        R.drawable.revolutionary, R.drawable.pioneer,
        R.drawable.goalsetter, R.drawable.transformer,
        R.drawable.empowerer, R.drawable.inspire,
        R.drawable.mentor, R.drawable.influencer,
        R.drawable.leader, R.drawable.inventor,


        )

    // Calculate points earned for each achievement
    val achievements = List(15) { index ->
        val achievementProgress = calculateAchievementProgress(index, courses, allLessonsStatus.value)

        // Create the achievement item with dynamic progress
        AchievementItem(
            title = titles[index],
            progressValue = achievementProgress/100f,
            animationResource = animationResources[index],
            achievementDetails = achievementDescriptions[index]
        )
    }


    // AchievementCard bg colors
    val achievementCardColor = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF002F6C), // Deep ocean blue at the top
            Color(0xFF1565C0)  // Brighter blue at the bottom
        )
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        // Dynamically create rows based on the list of achievements
        items(achievements.chunked(2)) { achievementRow ->
            Row(modifier = Modifier.fillMaxWidth()) {
                achievementRow.forEach { achievement ->
                    AchievementCard(
                        title = achievement.title,
                        progressValue = achievement.progressValue,
                        ImageResource = achievement.animationResource,
                        modifier = Modifier.weight(1f),
                        cardGradientColor = achievementCardColor,
                        achievementDetails = achievement.achievementDetails

                    )
                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}

// Data class to represent each achievement
data class AchievementItem(
    val title: String,
    val progressValue: Float,
    val animationResource: Int,
    val achievementDetails:String = ""
)

@Composable
fun ProgressContent(
    courseViewModel: CourseViewModel
) {
    val allCompletedLessons = courseViewModel.lessonCompletionStatus.collectAsState()
    val courses = courseViewModel.courses



    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        // First Row
        item {
            Row {
                // Find the course and stage from the list
                val course = courses.find { it.id == "c_course" }

                // Get all stages
                val allStages = course?.stages ?: listOf()

                // Calculate completed sub-lessons for each stage and lesson
                val completedSubLessons = allStages.sumOf { stage ->
                    // For each stage, sum the completed sub-lessons across all lessons in that stage
                    stage.lessons.sumOf { lesson ->
                        // Count the number of sub-lessons marked as COMPLETED in each lesson
                        lesson.lessonContents.count { content ->
                            allCompletedLessons.value[content.id] == LessonStatus.COMPLETED
                        }
                    }
                }

                // Count all sub-lessons across all stages and lessons
                val totalSubLessons = allStages.sumOf { stage ->
                    // For each stage, sum the total sub-lessons across all lessons in that stage
                    stage.lessons.sumOf { lesson ->
                        // Count all sub-lessons in each lesson
                        lesson.lessonContents.size
                    }
                }

                LanguageProgressCard(
                    title = "C",
                    progressValue = getCourseProgress(
                        courseId = "c_course",
                        courses = courses,
                        allCompletedLessons = allCompletedLessons.value
                    ),
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.cpp,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 0.dp
                )
                LanguageProgressCard(
                    title = "C++",
                    progressValue = getCourseProgress(
                        courseId = "cpp_course",
                        courses = courses,
                        allCompletedLessons = allCompletedLessons.value
                    ),
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.cpp,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 0.dp
                )
            }
        }

        // Second Row
        item {
            Row() {
                LanguageProgressCard(
                    title = "Python",
                    progressValue =  getCourseProgress(
                        courseId = "python_course",
                        courses = courses,
                        allCompletedLessons = allCompletedLessons.value
                    ),
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.pythonlogo,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 24.dp
                )
                LanguageProgressCard(
                    title = "Java",
                    progressValue =  getCourseProgress(
                        courseId = "java_course",
                        courses = courses,
                        allCompletedLessons = allCompletedLessons.value
                    ),
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.java,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 24.dp
                )
            }
        }

        // Third Row
        item {
            Row() {
                LanguageProgressCard(
                    title = "DSA",
                    progressValue =  getCourseProgress(
                        courseId = "DSA_course",
                        courses = courses,
                        allCompletedLessons = allCompletedLessons.value
                    ),
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.cpp,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 0.dp
                )
                LanguageProgressCard(
                    title = "Kotlin",
                    progressValue =  getCourseProgress(
                        courseId = "kotlin_course",
                        courses = courses,
                        allCompletedLessons = allCompletedLessons.value
                    ),
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.kotlin,
                    modifier = Modifier.weight(1f),


                    //Test
                    decorativeImagePadding = 34.dp
                )
            }
        }

        item {
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}


fun getCourseProgress(
    courseId: String,
    courses: List<Course>,
    allCompletedLessons: Map<String, LessonStatus>
): Float {
    // Find the course by ID
    val course = courses.find { it.id == courseId }

    // If the course is found, proceed; otherwise, return 0 as progress
    if (course != null) {
        // Get all stages from the course
        val allStages = course.stages

        // Calculate completed sub-lessons for each stage and lesson
        val completedSubLessons = allStages.sumOf { stage ->
            // For each stage, sum the completed sub-lessons across all lessons in that stage
            stage.lessons.sumOf { lesson ->
                // Count the number of sub-lessons marked as COMPLETED in each lesson
                lesson.lessonContents.count { content ->
                    allCompletedLessons[content.id] == LessonStatus.COMPLETED
                }
            }
        }

        // Count all sub-lessons across all stages and lessons
        val totalSubLessons = allStages.sumOf { stage ->
            // For each stage, sum the total sub-lessons across all lessons in that stage
            stage.lessons.sumOf { lesson ->
                // Count all sub-lessons in each lesson
                lesson.lessonContents.size
            }
        }

        // Return progress as a float (percentage of completed sub-lessons)
        return if (totalSubLessons > 0) {
            (completedSubLessons.toFloat()) / totalSubLessons.toFloat()
        } else {
            0f
        }
    } else {
        // If course is not found, return 0 as progress
        return 0f
    }
}

// For achievement completion
fun calculateAchievementProgress(achievementIndex: Int, courses: List<Course>, allLessonsStatus: Map<String, LessonStatus>): Int {
    val totalRequired: Int
    val totalCompleted: Int

    when (achievementIndex) {
        0 -> { // First Step: Complete the first lesson or quiz
            totalRequired = 1
            totalCompleted = if (courses.any { course ->
                    course.stages.any { stage ->
                        stage.lessons.any { lesson ->
                            lesson.lessonContents.any { content ->
                                (content.type == LessonContentType.QUIZ || content.type == LessonContentType.INTERACTIVE) &&
                                        allLessonsStatus[content.id] == LessonStatus.COMPLETED
                            }
                        }
                    }
                }) 1 else 0
        }
        1 -> { // Syntax Seeker: Complete 10 interactive lessons from C, 5 from C++, and 5 from DSA
            totalRequired = 20
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        (course.name == "C" && lesson.lessonContents.any { content ->
                            content.type == LessonContentType.INTERACTIVE && allLessonsStatus[content.id] == LessonStatus.COMPLETED
                        }) ||
                                (course.name == "C++" && lesson.lessonContents.any { content ->
                                    content.type == LessonContentType.INTERACTIVE && allLessonsStatus[content.id] == LessonStatus.COMPLETED
                                }) ||
                                (course.name == "DSA | C++" && lesson.lessonContents.any { content ->
                                    content.type == LessonContentType.INTERACTIVE && allLessonsStatus[content.id] == LessonStatus.COMPLETED
                                })
                    }
                }
            }
        }
        2 -> { // Logic Explorer: Solve 10 interactive lessons that require logic-based thinking across C, C++, and DSA
            totalRequired = 10
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        lesson.lessonContents.any { content ->
                            content.type == LessonContentType.INTERACTIVE && allLessonsStatus[content.id] == LessonStatus.COMPLETED
                        }
                    }
                }
            }
        }
        3 -> { // Challenge Conqueror: Complete 5 quizzes from each stage in C
            totalRequired = 15
            totalCompleted = courses.sumOf { course ->
                if (course.name == "C") {
                    course.stages.sumOf { stage ->
                        stage.lessons.count { lesson ->
                            lesson.lessonContents.any { content ->
                                content.type == LessonContentType.QUIZ && allLessonsStatus[content.id] == LessonStatus.COMPLETED
                            }
                        }
                    }
                } else 0
            }
        }
        4 -> { // Quiz Master: Complete at least 20 quizzes (advanced quizzes) from C, C++, and DSA
            totalRequired = 20
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        lesson.lessonContents.any { content ->
                            content.type == LessonContentType.QUIZ && allLessonsStatus[content.id] == LessonStatus.COMPLETED
                        }
                    }
                }
            }
        }
        5 -> { // Code Navigator: Complete 15 lessons from C, 15 from C++, and 10 from DSA
            totalRequired = 40
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        (course.name == "C" && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED) ||
                                (course.name == "C++" && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED) ||
                                (course.name == "DSA | C++" && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED)
                    }
                }
            }
        }
        6 -> { // Learning Master: Complete 10 non-interactive lessons across C, C++, and DSA
            totalRequired = 10
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        lesson.lessonContents.any { content ->
                            content.type == LessonContentType.NON_INTERACTIVE && allLessonsStatus[content.id] == LessonStatus.COMPLETED
                        }
                    }
                }
            }
        }
        7 -> { // Explorer of Stages: Complete 5 lessons from each stage (Beginner, Intermediate, Advanced) in C
            totalRequired = 15
            totalCompleted = courses.sumOf { course ->
                if (course.name == "C") {
                    course.stages.sumOf { stage ->
                        stage.lessons.count { lesson ->
                            (stage.title == "Beginner" || stage.title == "Intermediate" || stage.title == "Advanced") && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED
                        }
                    }
                } else 0
            }
        }
        8 -> { // Master of Completion: Complete 10 lessons from C, 10 from C++, and 10 from DSA
            totalRequired = 30
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        (course.name == "C" && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED) ||
                                (course.name == "C++" && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED) ||
                                (course.name == "DSA | C++" && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED)
                    }
                }
            }
        }
        9 -> { // Multi-Stage Champion: Complete 5 lessons from each stage (Beginner, Intermediate, Advanced) across C, C++, and DSA
            totalRequired = 15
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        (stage.title == "Beginner" || stage.title == "Intermediate" || stage.title == "Advanced") && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED
                    }
                }
            }
        }
        10 -> { // Quiz Overlord: Complete 40 quizzes across all courses
            totalRequired = 40
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        lesson.lessonContents.any { content ->
                            content.type == LessonContentType.QUIZ && allLessonsStatus[content.id] == LessonStatus.COMPLETED
                        }
                    }
                }
            }
        }
        11 -> { // Code Virtuoso: Complete 20 advanced lessons from C, C++, and DSA
            totalRequired = 20
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        stage.title == "Advanced" && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED
                    }
                }
            }
        }
        12 -> { // Path Finder: Complete 10 lessons from C and 10 lessons from C++ (any stage)
            totalRequired = 20
            totalCompleted = courses.sumOf { course ->
                if (course.name == "C" || course.name == "C++") {
                    course.stages.sumOf { stage ->
                        stage.lessons.count { lesson ->
                            allLessonsStatus[lesson.id] == LessonStatus.COMPLETED
                        }
                    }
                } else 0
            }
        }
        13 -> { // Stage Conqueror: Complete 5 lessons from each stage (Beginner, Intermediate, Advanced) across C and C++
            totalRequired = 15
            totalCompleted = courses.sumOf { course ->
                if (course.name == "C" || course.name == "C++") {
                    course.stages.sumOf { stage ->
                        stage.lessons.count { lesson ->
                            (stage.title == "Beginner" || stage.title == "Intermediate" || stage.title == "Advanced") && allLessonsStatus[lesson.id] == LessonStatus.COMPLETED
                        }
                    }
                } else 0
            }
        }
        14 -> { // Final Mastery: Complete all lessons from C, C++, and DSA (any stage)
            totalRequired = 100
            totalCompleted = courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.count { lesson ->
                        allLessonsStatus[lesson.id] == LessonStatus.COMPLETED
                    }
                }
            }
        }
        else -> {
            totalRequired = 0
            totalCompleted = 0
        }
    }

    // Calculate percentage
    return if (totalRequired == 0) 0 else (totalCompleted * 100) / totalRequired
}

