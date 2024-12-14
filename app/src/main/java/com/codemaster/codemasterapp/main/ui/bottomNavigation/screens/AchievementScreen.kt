package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import android.util.Log
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

    // List of 100 titles
    val titles = listOf(
        "Achiever", "Prodigy", "Master", "Champion", "Maverick", "Hero", "Legend", "Titan",
        "Conqueror", "Innovator", "Strategist", "Philanthropist", "Expert", "Winner", "Adventurer",
        "Pathfinder", "Explorer", "Creator", "Builder", "Visionary", "Revolutionary", "Pioneer",
        "Goalsetter", "Transformer", "Empowerer", "Inspire", "Mentor", "Influencer", "Leader", "Inventor", "Guru"
    )


    // List of 30 achievement descriptions for the four courses (C, C++, Python, DSA) and their stages (Beginner to Expert)
    val achievementDescriptions = listOf(
        // C Course Achievements
        "Complete 10 quizzes from C Beginner stage",
        "Complete 5 interactive coding challenges from C Beginner stage",
        "Complete 3 lessons from C Beginner course",
        "Complete 20 quizzes from C Intermediate stage",
        "Complete 10 interactive coding challenges from C Intermediate stage",
        "Complete 5 lessons from C Intermediate course",
        "Complete 30 quizzes from C Advanced stage",
        "Complete 15 interactive coding challenges from C Advanced stage",
        "Complete 10 lessons from C Advanced course",

        // C++ Course Achievements
        "Complete 10 quizzes from C++ Beginner stage",
        "Complete 5 interactive coding challenges from C++ Beginner stage",
        "Complete 3 lessons from C++ Beginner course",
        "Complete 20 quizzes from C++ Intermediate stage",
        "Complete 10 interactive coding challenges from C++ Intermediate stage",
        "Complete 5 lessons from C++ Intermediate course",
        "Complete 30 quizzes from C++ Advanced stage",
        "Complete 15 interactive coding challenges from C++ Advanced stage",
        "Complete 10 lessons from C++ Advanced course",

        // Python Course Achievements
        "Complete 10 quizzes from Python Beginner stage",
        "Complete 5 interactive coding challenges from Python Beginner stage",
        "Complete 3 lessons from Python Beginner course",
        "Complete 20 quizzes from Python Intermediate stage",
        "Complete 10 interactive coding challenges from Python Intermediate stage",
        "Complete 5 lessons from Python Intermediate course",
        "Complete 30 quizzes from Python Advanced stage",
        "Complete 15 interactive coding challenges from Python Advanced stage",
        "Complete 10 lessons from Python Advanced course",

        // DSA Course Achievements
        "Complete 10 quizzes from DSA Beginner stage",
        "Complete 5 interactive coding challenges from DSA Beginner stage",
        "Complete 3 lessons from DSA Beginner course",
        "Complete 20 quizzes from DSA Intermediate stage",
        "Complete 10 interactive coding challenges from DSA Intermediate stage",
        "Complete 5 lessons from DSA Intermediate course",
        "Complete 30 quizzes from DSA Advanced stage",
        "Complete 15 interactive coding challenges from DSA Advanced stage",
        "Complete 10 lessons from DSA Advanced course"
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

// Define the required points for each achievement (e.g., 50, 100, 150, etc.)
    val requiredPointsForAchievements = List(30) { (it + 1) * 50 } // 100, 200, 300, ...

    // Calculate points earned for each achievement
    val achievements = List(30) { index ->
        val earnedPointsForAchievement = calculateAchievementPoints(index, courses, allLessonsStatus.value)
        val requiredPoints = requiredPointsForAchievements[index]

        // Calculate the progress for the current achievement
        val achievementProgress = when {
            earnedPointsForAchievement >= requiredPoints -> 1f  // 100% progress if points earned are greater than or equal to required points
            earnedPointsForAchievement > 0 -> earnedPointsForAchievement.toFloat() / requiredPoints.toFloat()  // Progress based on the earned points
            else -> 0f  // No progress if no points are earned
        }

        // Log for debugging
        Log.d("requiredpoints", requiredPoints.toString())
        Log.d("earnedPoints", earnedPointsForAchievement.toString())
        Log.d("progresspoints", achievementProgress.toString())

        // Create the achievement item with dynamic progress
        AchievementItem(
            title = titles[index],
            progressValue = achievementProgress,
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

// Function to calculate points based on achievement type
fun calculateAchievementPoints(achievementIndex: Int, courses: List<Course>, allLessonsStatus: Map<String, LessonStatus>): Int {
    return when (achievementIndex) {
        0 -> { // First achievement: Collect only quiz points
            courses.sumOf { course ->
                course.stages.sumOf { stage ->
                    stage.lessons.sumOf { lesson ->
                        lesson.lessonContents.sumOf { content ->
                            // Check if the lessonContent is a quiz and if it's completed
                            if (content.type == LessonContentType.QUIZ && allLessonsStatus[content.id] == LessonStatus.COMPLETED) {
                                content.points // Collect points if the quiz lessonContent is completed
                            } else {
                                0 // No points if it's not a quiz or it's not completed
                            }
                        }
                    }
                }
            }
        }
        1 -> { // Second achievement: Collect only C++ course points
            courses.sumOf { course ->
                if (course.id == "cpp_course") { // Assuming course name is "C++"
                    course.stages.sumOf { stage ->
                        stage.lessons.sumOf { lesson ->
                            lesson.lessonContents.sumOf { content ->
                                // Add points for C++ lesson contents if completed
                                if (content.type == LessonContentType.INTERACTIVE && allLessonsStatus[content.id] == LessonStatus.COMPLETED) content.points else 0
                            }
                        }
                    }
                } else {
                    0
                }
            }
        }
        // Add more cases for other achievements as needed
        else -> 0 // Default case for achievements that don't match the criteria
    }
}

