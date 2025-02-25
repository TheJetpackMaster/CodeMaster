package com.codemaster.codemasterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.codemaster.codemasterapp.main.ui.viewModels.NoteViewModel
import com.codemaster.codemasterapp.main.ui.bottomNavigation.MainScreen
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.main.ui.viewModels.MainViewModel
import com.codemaster.codemasterapp.main.ui.viewModels.UserProfileViewModel
import com.codemaster.codemasterapp.ui.theme.CodeMasterTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val courseViewModel: CourseViewModel by viewModels()
        val noteViewModel: NoteViewModel by viewModels()
        val userProfileViewModel : UserProfileViewModel by viewModels()
        val mainViewModel : MainViewModel by viewModels()

        enableEdgeToEdge()

        setContent {
            CodeMasterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val courses = courseViewModel.courses
                    val allLessonStatus = courseViewModel.lessonCompletionStatus.collectAsState()

                    MainScreen(
                        courseViewModel = courseViewModel,
                        noteViewModel = noteViewModel,
                        userProfileViewModel = userProfileViewModel,
                        mainViewModel = mainViewModel,
                        context = this@MainActivity,
                        courses = courses,
                        allLessonsStatus = allLessonStatus
                    )
                }
            }
        }
    }
}