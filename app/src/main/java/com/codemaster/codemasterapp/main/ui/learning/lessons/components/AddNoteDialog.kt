package com.codemaster.codemasterapp.main.ui.learning.lessons.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.dp
import com.codemaster.codemasterapp.main.ui.viewModels.NoteViewModel
import com.codemaster.codemasterapp.main.data.Note


@Composable
fun AddNoteDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    noteViewModel: NoteViewModel,
    noteId: String?, // Nullable to distinguish between new and existing notes
    title: String // Passed title that will be locked
) {
    // State for description only, as title is locked
    var description by remember(showDialog) { mutableStateOf("") }

    // Fetch note data if editing an existing note
    LaunchedEffect(showDialog, noteId) {
        if (showDialog && noteId != null) {
            noteViewModel.getNoteById(noteId) { note ->
                description = note?.description ?: ""
            }
        }
    }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = onDismiss,
            title = {
                Text(
                    text = if (noteId == null) "Add Note" else "Edit Note"
                )
            },
            text = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    // Title TextField (locked, uneditable)
                    OutlinedTextField(
                        value = title,
                        onValueChange = {}, // No-op since title is locked
                        label = { Text("Title") },
                        enabled = false, // Disables editing
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        colors = OutlinedTextFieldDefaults.colors()
                    )

                    // Description TextField
                    OutlinedTextField(
                        value = description,
                        onValueChange = { description = it },
                        label = { Text("Description") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                            .heightIn(min = 120.dp),
                        maxLines = 5
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        // Save or update the note
                        val newNote = Note(
                            id = noteId!!,
                            title = title, // Title is locked
                            description = description
                        )
                        noteViewModel.addOrUpdateNote(newNote) { resultId ->
                            if (resultId.isNotEmpty()) {
                                // Log success if needed
                            } else {
                                // Log error if needed
                            }
                        }
                        onDismiss() // Close dialog
                    }
                ) {
                    Text(if (noteId == null) "Add Note" else "Update Note")
                }
            },
            dismissButton = {
                Button(
                    onClick = onDismiss
                ) {
                    Text("Cancel")
                }
            },
            modifier = Modifier.padding(16.dp),
        )
    }
}
