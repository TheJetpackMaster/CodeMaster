package com.codemaster.codemasterapp.main.ui.learning.lessons.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.ui.theme.bluishPython


@Composable
fun AddNoteDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    noteViewModel: NoteViewModel,
    languageName: String,
    stageName: String,
    lessonNumber: Int,
    subLessonNumber: Float,
    subLessonTittle: String // Passing subLessonTittle as a parameter
) {
    // States for title and description, initialized with subLessonTittle
    var title by remember(showDialog) { mutableStateOf(subLessonTittle) }
    var description by remember(showDialog) { mutableStateOf("") }

    // Fetch sub-lesson data when the dialog is shown
    LaunchedEffect(showDialog) {
        if (showDialog) {
            // Reset description but keep the title as the default value
            description = ""
            noteViewModel.getSubLessonByNames(
                languageName = languageName,
                stageName = stageName,
                lessonNumber = lessonNumber,
                subLessonNumber = subLessonNumber
            ) { subLesson ->
                // Update title and description if the sub-lesson data is fetched
                title = subLesson?.title ?: subLessonTittle // Default to subLessonTittle
                description = subLesson?.description.orEmpty() // Set description
            }
        }
    }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = onDismiss,
            title = {
                Text(
                    text = "Add Note",
                    color = bluishPython, // Updated to bluishPython color
                    style = MaterialTheme.typography.h6
                )
            },
            text = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    // Title TextField with custom styling
                    OutlinedTextField(
                        value = title,
                        onValueChange = { title = it }, // Allow user to change the title
                        label = { Text("Title", color = bluishPython) }, // Updated label color
                        enabled = false,
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = bluishPython, // Updated focused border color
                            unfocusedBorderColor = Color.Gray
                        ),
                    )

                    // Description TextField with custom styling
                    OutlinedTextField(
                        value = description,
                        onValueChange = { description = it },
                        label = {
                            Text(
                                "Description",
                                color = bluishPython
                            )
                        }, // Updated label color
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 24.dp)
                            .heightIn(min = 120.dp), // Ensures enough space for description
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = bluishPython, // Updated focused border color
                            unfocusedBorderColor = Color.Gray
                        ),
                        maxLines = 5,
                        visualTransformation = VisualTransformation.None
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        // Add or update the note via ViewModel
                        noteViewModel.addOrUpdateSubLesson(
                            languageName = languageName,
                            stageName = stageName,
                            lessonNumber = lessonNumber,
                            subLessonNumber = subLessonNumber,
                            title = title,
                            description = description // Save the title and description
                        )
                        onDismiss() // Close dialog
                    },
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(containerColor = bluishPython) // Updated button color
                ) {
                    // Conditionally change button text based on description
                    Text(
                        text = "Add Note",
                        color = Color.White
                    )
                }
            },
            dismissButton = {
                Button(
                    onClick = onDismiss,
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Text("Cancel", color = Color.White)
                }
            },
            modifier = Modifier.padding(16.dp),
        )
    }
}