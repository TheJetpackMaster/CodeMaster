package com.codemaster.codemasterapp.main.ui.userProfileDetails

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.data.NoteSubLesson
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel

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
                SubLessonCard(subLesson = subLesson)
            }
        }
    }
}

@Composable
fun SubLessonCard(subLesson: NoteSubLesson) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp)
        ) {
            Text(
                text = subLesson.title,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF101820)
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = subLesson.description,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color.Gray
                ),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
