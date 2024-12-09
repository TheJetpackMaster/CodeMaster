package com.codemaster.codemasterapp.main.ui.userProfileDetails

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
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.ColorUtils
import androidx.navigation.NavController
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.data.NoteSubLesson
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.R

@Composable
fun NoteScreen(
    navController: NavController,
    noteViewModel: NoteViewModel,
    courseViewModel: CourseViewModel
) {
    val subLessons = remember { mutableStateOf<List<NoteSubLesson>>(emptyList()) }

    LaunchedEffect(Unit) {
        noteViewModel.getAllSubLessons { result ->
            subLessons.value = result
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        // Top Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF101820).copy(.5f))
                .padding(bottom = 16.dp)
                .padding(horizontal = 12.dp)
                .statusBarsPadding(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Profile",
                style = MaterialTheme.typography.titleLarge.copy(
                    color = Color.White.copy(.7f),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .clickable(onClick = {
                        navController.navigate(ProfileRoutes.SettingsScreen.route)
                    })
                    .background(Color.LightGray.copy(.2f))
                    .padding(6.dp)

            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "",
                    tint = Color.White.copy(.7f)
                )

                Text(
                    "Settings",
                    color = Color.White.copy(.7f),
                    fontWeight = FontWeight.Medium
                )
            }
        }
        HorizontalDivider(thickness = 1.dp, color = Color.LightGray.copy(.2f))

        // LazyColumn with cards for each sub-lesson
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(subLessons.value) { subLesson ->
//                SubLessonCard(subLesson = subLesson)
                NoteItem(
                    onDeleteClick = {
                        // Handle delete action
                        println("Delete clicked")
                    },
                    onEditClick = {
                        // Handle edit action
                        println("Edit clicked")
                    },
                    onCompleteClick = {
                        // Handle complete action
                        println("Complete clicked")
                    },
                    checkColor = Color.Green,
                    editColor = Color.Blue,
                    title = "Sample Note",
                    description = "This is a sample description for the note.",
                    deleteIcon = R.drawable.editicon,
                    checkIcon = R.drawable.editicon,
                    editIcon = R.drawable.editicon,
                    editButtonEnabled = true,
                    bgColor = Color(0xFF375A7F).copy(1f),
                    subLesson = subLesson
                    )
            }
        }
    }
}

//@Composable
//fun SubLessonCard(subLesson: NoteSubLesson) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        elevation = 4.dp,
//        shape = RoundedCornerShape(12.dp)
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.White)
//                .padding(16.dp)
//        ) {
//            Text(
//                text = subLesson.title,
//                style = MaterialTheme.typography.titleMedium.copy(
//                    fontWeight = FontWeight.Bold,
//                    color = Color(0xFF101820)
//                ),
//                maxLines = 1,
//                overflow = TextOverflow.Ellipsis
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = subLesson.description,
//                style = MaterialTheme.typography.bodyMedium.copy(
//                    color = Color.Gray
//                ),
//                maxLines = 3,
//                overflow = TextOverflow.Ellipsis
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            NoteItem(
//                onDeleteClick = {
//                    // Handle delete action
//                    println("Delete clicked")
//                },
//                onEditClick = {
//                    // Handle edit action
//                    println("Edit clicked")
//                },
//                onCompleteClick = {
//                    // Handle complete action
//                    println("Complete clicked")
//                },
//                checkColor = Color.Green,
//                editColor = Color.Blue,
//                title = "Sample Note",
//                description = "This is a sample description for the note.",
//                deleteIcon = R.drawable.editicon,
//                checkIcon = R.drawable.editicon,
//                editIcon = R.drawable.editicon,
//                editButtonEnabled = true,
//                bgColor = Color(0xFF6200EE),
//
//            )
//
//        }
//    }
//}

@Composable
fun NoteItem(
    modifier: Modifier = Modifier,
    cornerRadius: Dp = 10.dp,
    cutCornerSize: Dp = 30.dp,
    onDeleteClick: () -> Unit,
    onEditClick:()->Unit,
    onCompleteClick:()->Unit,
    checkColor:Color,
    editColor:Color,
    title: String,
    description: String,
    deleteIcon: Int,
    checkIcon: Int,
    editIcon: Int,
    editButtonEnabled:Boolean,
    bgColor: Color,
    subLesson: NoteSubLesson
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
//            IconButton(
//                modifier = Modifier.size(37.dp),
//                onClick = onEditClick,
//                enabled = editButtonEnabled
//            )
//            {
//                Icon(
//                    painter = painterResource(id = editIcon),
//                    contentDescription = null,
//                    tint = editColor
//                )
//            }
            IconButton(
                modifier = Modifier.size(37.dp),
                onClick = onDeleteClick
            )
            {
                Icon(
                    painter = painterResource(id = deleteIcon),
                    contentDescription = null,
                    tint = Color.Unspecified
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

