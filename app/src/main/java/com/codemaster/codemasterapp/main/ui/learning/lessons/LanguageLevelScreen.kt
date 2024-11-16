package com.codemaster.codemasterapp.main.ui.learning.lessons

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.HomeScreenCustomTopBar
import com.codemaster.codemasterapp.main.ui.components.ContinueLearningCard
import com.codemaster.codemasterapp.main.ui.components.LanguageCardDesign
import com.codemaster.codemasterapp.main.ui.components.LanguageLevelOverviewCard
import com.codemaster.codemasterapp.ui.theme.bluishJava
import com.codemaster.codemasterapp.ui.theme.bluishPython
import com.codemaster.codemasterapp.ui.theme.greenishPython
import com.codemaster.codemasterapp.ui.theme.magentaCpp
import com.codemaster.codemasterapp.ui.theme.purpleCpp
import com.codemaster.codemasterapp.ui.theme.purpleKt
import com.codemaster.codemasterapp.ui.theme.yellowishJava
import com.codemaster.codemasterapp.ui.theme.yellowishKt
import androidx.compose.runtime.*
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageLevelScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    // Add state to track selected language and level
    var selectedLanguage by remember { mutableStateOf("C Language") }
    var selectedLevel by remember { mutableStateOf("Basic") }

    // Define the course details dynamically based on the selected language and level
    val courseTitle = when {
        selectedLanguage == "C Language" && selectedLevel == "Basic" -> "C Programming for Beginners"
        else -> "Default Course Title" // Add more conditions as necessary
    }
    val lessons = when {
        selectedLanguage == "C Language" && selectedLevel == "Basic" -> listOf(
            Lesson("Introduction to C", "Overview of the C programming language, its history, and applications."),
            Lesson("Basic Syntax and Data Types", "Understanding basic syntax, variables, constants, and data types like int, char, float, etc."),
            Lesson("Operators", "Learn about arithmetic, relational, logical, and assignment operators."),
            Lesson("Control Flow Statements", "Introduction to if-else, switch, and looping statements (for, while, do-while)."),
            Lesson("Functions", "How to define, call, and return values in functions. Introduction to recursion."),
            Lesson("Arrays and Strings", "Learn to use arrays for storing multiple values and how to handle strings in C."),
            Lesson("Pointers", "Understanding pointers, memory addresses, and their relationship with arrays and functions."),
            Lesson("Memory Management", "Introduction to dynamic memory allocation using malloc, calloc, realloc, and free."),
            Lesson("Structures and Unions", "Learn about structures and unions to group different data types together."),
            Lesson("Preprocessor Directives", "Using preprocessor directives like #define, #include, and conditional compilation."),
            Lesson("Error Handling", "Introduction to basic error handling mechanisms and functions like perror() and strerror()."),
            Lesson("Debugging and Optimization", "How to debug C programs using tools like gdb and optimize them for performance."),
            Lesson("Introduction to C Libraries", "An overview of commonly used C libraries and how to include them in programs.")
        )
        else -> listOf() // Add default lessons here if needed
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Back Arrow Icon
                        IconButton(onClick = { /* Navigate to Profile Screen */ }) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = "Go Back",
                                tint = Color.Black,
                                modifier = Modifier.size(24.dp)
                            )
                        }

                        // Centered Text
                        Text(
                            text = "Course Overview",
                            color = Color.Black,
                            style = MaterialTheme.typography.titleLarge
                        )

                    }

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent,
                ),
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF7F9FC)) // Soft background color for the main area
                    .padding(paddingValues)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(scrollState)
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    //horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Course Overview Card
                    LanguageLevelOverviewCard()

                    Spacer(modifier = Modifier.height(16.dp))

                    // Dynamic Course Title
                    Text(
                        text = courseTitle,
                        style = MaterialTheme.typography.headlineSmall,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(4.dp))

                    // Course Details
                    Row() {
                        Text(
                            text = "28 lessons",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Rating",
                            tint = Color(0xFFFFD700),
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = "4.9",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Gray
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))

                    // Tabs Section (Lessons Tab)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = "Lessons",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color(0xFF007BFF),
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(
                            text = "Description",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Gray
                        )
                    }
                    Divider(color = Color.Gray, thickness = 1.dp)

                    // Dynamic Lessons based on selected course
                    lessons.forEach { lesson ->
                        LessonItem(lesson.title, lesson.description)
                    }
                }
            }
        }
    )
}

data class Lesson(val title: String, val description: String)

@Composable
fun LessonItem(
    title: String,
    description: String,
) {
    val context = LocalContext.current
    val showToast: (String) -> Unit = { lessonTitle ->
        Toast.makeText(context, "Lesson: $lessonTitle", Toast.LENGTH_SHORT).show()
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(vertical = 4.dp)
            .clickable {
                showToast(title)
            },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .weight(1f) // Use weight to allow space for the arrow
                .padding(end = 16.dp), // Space between the text and the button
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { /* Your action here */ },
                modifier = Modifier
                    .size(32.dp) // Adjust the button size
                    .shadow(1.dp, shape = CircleShape)
                    .background(Color.White, shape = CircleShape) // Background with circle shape
                    .padding(6.dp) // Optional padding inside the circle to ensure icon fits well
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Navigate to Lesson",
                    tint = Color.Black // Icon color (White) inside the dark background
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = title, style = MaterialTheme.typography.bodyMedium, color = Color.Black)
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray,
                    maxLines = 1, // Limit to a single line
                    overflow = TextOverflow.Ellipsis // Add ellipsis when text overflows
                )
            }
        }

        // Ensure the arrow is aligned properly and styled
        IconButton(
            onClick = { /* Your action here */ },
            modifier = Modifier
                .size(32.dp) // Adjust the button size
                .padding(6.dp) // Optional padding inside the circle to ensure icon fits well
        ) {
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Navigate to Lesson",
                tint = Color.Black // Icon color (White) inside the dark background
            )
        }
    }
}