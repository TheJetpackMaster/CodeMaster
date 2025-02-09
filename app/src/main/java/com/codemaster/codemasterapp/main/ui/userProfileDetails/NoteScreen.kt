package com.codemaster.codemasterapp.main.ui.userProfileDetails

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.ColorUtils
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.codemaster.codemasterapp.main.ui.viewModels.NoteViewModel
import com.codemaster.codemasterapp.main.data.Note
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
    navController: NavController,
    noteViewModel: NoteViewModel,
    courseViewModel: CourseViewModel
) {
    val subLessons = remember { mutableStateOf<List<Note>>(emptyList()) }
    // State for dialog visibility
    var showNoteEditDialog by remember { mutableStateOf(false) }
    var showNoteDeleteDialog by remember { mutableStateOf(false) }
    var selectedSubLesson by remember { mutableStateOf<Note?>(null) }

    LaunchedEffect(Unit) {
        noteViewModel.allNotes.collect { result ->
            subLessons.value = result
        }
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0x77123C46)) // Dark background
    ) {
        TopAppBar(
            title = {
                Text(
                    modifier = Modifier.padding(start = 24.dp),
                    text = "Saved Notes",
                    color = Color.White,
                    style = MaterialTheme.typography.titleLarge
                )
            },
            navigationIcon = {
                OutlinedIconButton(
                    onClick = {
                        if (navController.currentBackStackEntry?.lifecycle?.currentState
                            == Lifecycle.State.RESUMED
                        ) {
                            navController.popBackStack()
                        }
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
                        tint = Color.White.copy(alpha = 0.8f) // White icon with some transparency for the glass effect
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF122A40)
            ),
            modifier = Modifier.shadow(
                4.dp,
                spotColor = Color.White,
                ambientColor = Color.White
            )
        )


        HorizontalDivider(thickness = 1.dp, color = Color.LightGray.copy(.2f))

        // LazyColumn with cards for each sub-lesson
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(subLessons.value) { subLesson ->
                // SubLessonItem with onDeleteClick and onEditClick
                NoteItem(
                    onDeleteClick = {
                        selectedSubLesson = subLesson
                        showNoteDeleteDialog = true
                    },
                    onEditClick = {
                        selectedSubLesson = subLesson
                        showNoteEditDialog = true
                    },
                    deleteIcon = R.drawable.delete,
                    editIcon = R.drawable.edit,
                    bgColor = Color(0xFF375A7F),
                    subLesson = subLesson
                )
            }
        }

        // Update Dialog
        if (showNoteEditDialog) {
            AlertDialog(
                backgroundColor = Color(0xFF215D94),
                onDismissRequest = { showNoteEditDialog = false },
                title = {
                    Text(
                        "Update SubLesson",
                        style = MaterialTheme.typography.titleMedium,
                        color = Color.White
                    )
                },
                text = {
                    Column {
                        // Text fields to update the title and description
                        TextField(
                            colors = TextFieldDefaults.textFieldColors(
                                focusedLabelColor = Color.White,
                                unfocusedLabelColor = Color.White
                            ),
                            value = selectedSubLesson?.title ?: "",
                            onValueChange = { newTitle ->
                                selectedSubLesson = selectedSubLesson?.copy(title = newTitle)
                            },
                            label = { Text("Title", color = Color.LightGray) }
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        TextField(
                            colors = TextFieldDefaults.textFieldColors(
                                focusedLabelColor = Color.White,
                                unfocusedLabelColor = Color.White,
                            ),
                            value = selectedSubLesson?.description ?: "",
                            onValueChange = { newDescription ->
                                selectedSubLesson =
                                    selectedSubLesson?.copy(description = newDescription)
                            },
                            label = {
                                Text(
                                    "Description",
                                    color = Color.LightGray
                                )
                            }
                        )
                    }
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            selectedSubLesson?.let { subLesson ->
                                // Construct a Note object from the selectedSubLesson
                                val noteToUpdate = Note(
                                    id = subLesson.id, // Use subLesson's ID for existing notes
                                    title = subLesson.title
                                        ?: "", // Use a default empty string if null
                                    description = subLesson.description
                                        ?: "" // Use a default empty string if null
                                )

                                // Call the ViewModel's addOrUpdateNote function
                                noteViewModel.addOrUpdateNote(noteToUpdate) { noteId ->
                                    if (noteId.isNotEmpty()) {
                                        //Log.d("UpdateNote", "Note updated successfully with ID: $noteId")
                                    } else {
                                        //Log.e("UpdateNote", "Failed to update the note.")
                                    }
                                }
                            }
                            showNoteEditDialog = false // Close the edit dialog
                        }
                    ) {
                        Text("Update",color = Color(0xEF00FAE0))
                    }

                },
                dismissButton = {
                    TextButton(onClick = { showNoteEditDialog = false }) {
                        Text("Cancel",color = Color(0xEFF1EBED))
                    }
                }
            )
        }

        // Delete Dialog
        if (showNoteDeleteDialog) {
            AlertDialog(
                backgroundColor = Color(0xFF215D94),
                onDismissRequest = { showNoteDeleteDialog = false },
                title = {
                    Text(
                        "Delete SubLesson?", color = Color.White,
                        style = MaterialTheme.typography.titleMedium,
                    )
                },
                text = {
                    Text(
                        "Are you sure you want to delete this sub-lesson?",
                        color = Color.LightGray
                    )
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            selectedSubLesson?.let { subLesson ->
                                val noteToDelete = Note(
                                    id = subLesson.id,
                                    title = subLesson.title,
                                    description = subLesson.description
                                )
                                noteViewModel.deleteNote(noteToDelete) { success ->
                                    if (success) {
                                        //Log.d("DeleteNote", "Note successfully deleted.")
                                    } else {
                                        //Log.e("DeleteNote", "Failed to delete note.")
                                    }
                                }
                            }
                            showNoteDeleteDialog = false
                        }
                    ) {
                        Text("Delete",color = Color(0xEF00FAE0))
                    }

                },
                dismissButton = {
                    TextButton(onClick = { showNoteDeleteDialog = false }) {
                        Text("Cancel",color = Color(0xEFF1EBED))
                    }
                }
            )
        }
    }
}


@Composable
fun NoteItem(
    modifier: Modifier = Modifier,
    cornerRadius: Dp = 10.dp,
    cutCornerSize: Dp = 30.dp,
    onDeleteClick: (Boolean) -> Unit,
    onEditClick: (Boolean) -> Unit,
    deleteIcon: Int,
    editIcon: Int,
    bgColor: Color,
    subLesson: Note
) {
    Box(
        modifier = modifier
    ) {
        Canvas(
            modifier = Modifier.matchParentSize()
        ) {
            val clipPath = Path().apply {
                lineTo(size.width - cutCornerSize.toPx(), 0f)
                lineTo(size.width, cutCornerSize.toPx())
                lineTo(size.width, size.height)
                lineTo(0f, size.height)
                close()
            }

            clipPath(clipPath) {
                drawRoundRect(
                    color = Color(bgColor.toArgb()),
                    size = size,
                    cornerRadius = CornerRadius(cornerRadius.toPx())
                )

                drawRoundRect(
                    color = Color(
                        (ColorUtils.blendARGB(bgColor.toArgb(), 0x000000, 0.3f))
                    ),
                    topLeft = Offset(size.width - cutCornerSize.toPx(), -100f),
                    size = Size(cutCornerSize.toPx() + 100f, cutCornerSize.toPx() + 100f),
                    cornerRadius = CornerRadius(cornerRadius.toPx()),

                    )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
                .padding(end = 75.dp)
        ) {
            Text(
                text = subLesson.title, style = MaterialTheme.typography.headlineSmall,
                color = Color.White,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = subLesson.description, style = MaterialTheme.typography.bodyMedium,
                color = Color.White,
                maxLines = 10,
                overflow = TextOverflow.Ellipsis
            )
        }
        Row(
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            IconButton(
                modifier = Modifier.size(37.dp),
                onClick = { onEditClick(true) }
            )
            {
                Icon(
                    painter = painterResource(id = editIcon),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            }
            IconButton(
                modifier = Modifier.size(37.dp),
                onClick = { onDeleteClick(true) }
            )
            {
                Icon(
                    painter = painterResource(id = deleteIcon),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            }
//            IconButton(
//                modifier = Modifier.size(37.dp),
//                onClick = onCompleteClick
//            )
//            {
//                Icon(
//                    painter = painterResource(id = checkIcon),
//                    contentDescription = null,
//                    tint = checkColor
//                )
//            }
        }
    }
}


