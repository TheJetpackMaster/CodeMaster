package com.codemaster.codemasterapp.main.ui.userProfileDetails

import android.net.Uri
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.ui.auth.uriToByteArray
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.UserProfileViewModel


val profileSectionGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF557A95), // Muted steel blue (top)
        Color(0xFF436D8D), // Rich blue-gray (middle)
        Color(0xFF2A4F6D)  // Dark slate blue (bottom)
    )
)


val statsCardGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF3C5866), // Medium slate blue-gray (top)
        Color(0xFF2F4554)  // Deep blue-gray (bottom)
    )
)

val waveGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF2A4F6D), // Dark blue (top)
        Color(0xFF3C5866)  // Medium blue-gray (bottom)
    )
)

val freeCoursesGradientColors = Brush.horizontalGradient(
    listOf(
        Color(0xFFFFB7A5), // Soft coral (gentle and inviting)
        Color(0xFFFF6F61)  // Warm reddish-pink (vibrant but not harsh)
    )
)


val liveSupportButtonColors = Brush.horizontalGradient(
    colors = listOf(
        Color(0xFF64B5F6), // Soft sky blue (lighter and calming)
        Color(0xFF1565C0)  // Deep blue (provides contrast and vibrancy)
    )
)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserProfileScreen(
    navController: NavController,
    noteViewModel: NoteViewModel,
    userProfileViewModel: UserProfileViewModel
) {
    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            TopAppBar(
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

                title = {
                    Text(
                        modifier = Modifier.padding(start = 24.dp),
                        text = "Profile",
                        color = Color.White
                    )

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0x990F263D) // Desired dark gradient tone
                ),
                modifier = Modifier.shadow(
                    .5.dp,
                    ambientColor = Color.White,
                    spotColor = Color.White
                ),
                actions = {
                    IconButton(
                        onClick = {
                            if (navController.currentBackStackEntry?.lifecycle?.currentState
                                == Lifecycle.State.RESUMED
                            ) {
                                navController.navigate(ProfileRoutes.SettingsScreen.route)
                            }
                        },
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .size(32.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color.White.copy(.08f))
                    ) {
                        Icon(imageVector = Icons.Default.Settings,
                            contentDescription = "",
                            tint = Color.White.copy(.8f))
                    }
                }
            )
        }
    ) { innerpadding ->

        //Main Content Section
        Column(
            modifier = Modifier
                .padding(innerpadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(Modifier.height(14.dp))

            //User Profile Section
            UserProfileSection(
                userProfileViewModel = userProfileViewModel
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Highlight Free Courses Section
            Box(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp) // Added vertical padding
                    .fillMaxWidth()
                    .height(72.dp) // Slightly taller for breathing room
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(14.dp)
                    ) // Subtle shadow for depth
                    .background(
                        brush = freeCoursesGradientColors,
                        shape = RoundedCornerShape(14.dp) // Slightly more rounded
                    )
                    .padding(12.dp), // Increased padding
                contentAlignment = Alignment.Center
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(0.7f) // Adjusted width allocation
                    ) {
                        Text(
                            text = "All Courses Are Free",
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = Color.Black, // Black for contrast
                                fontWeight = FontWeight.Bold // Slightly bolder
                            )
                        )
                        Spacer(modifier = Modifier.height(4.dp)) // Added spacing
                        Text(
                            text = "Learn without limits. Start exploring!",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = Color(0xFF4F4F4F) // Subtle gray for readability
                            ),
                            maxLines = 2,
                        )
                    }

                    Spacer(Modifier.weight(1f))

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color(0xFF1A7306)) // Vibrant green for CTA
                            .padding(horizontal = 8.dp, vertical = 6.dp), // Compact padding
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Explore Now!",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold // Better emphasis
                        )
                    }
                }
            }

//            Spacer(modifier = Modifier.height(16.dp))
//
//            // Stats Section
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(horizontal = 16.dp),
//                horizontalArrangement = Arrangement.spacedBy(8.dp)
//            ) {
//                StatsCard(
//                    iconRes = R.drawable.person, // Replace with correct icons
//                    value = "0",
//                    label = "Gems",
//                    modifier = Modifier.weight(1f)
//                )
//                StatsCard(
//                    iconRes = R.drawable.person, // Replace with correct icons
//                    value = "0",
//                    label = "Social Index",
//                    modifier = Modifier.weight(1f)
//                )
//            }
//
//            Spacer(modifier = Modifier.height(12.dp))
//
//            // Stats Section
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(horizontal = 16.dp),
//                horizontalArrangement = Arrangement.spacedBy(8.dp)
//            ) {
//
//                StatsCard(
//                    iconRes = R.drawable.person, // Replace with correct icons
//                    value = "0",
//                    label = "Days Streak",
//                    modifier = Modifier.weight(1f)
//                )
//                StatsCard(
//                    iconRes = R.drawable.person, // Replace with correct icons
//                    value = "0%",
//                    label = "Accuracy",
//                    modifier = Modifier.weight(1f)
//                )
//
//            }

            Spacer(modifier = Modifier.height(16.dp))


            // Live Support Button
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
                    .shadow(elevation = 3.dp, shape = RoundedCornerShape(12.dp))
                    .background(
                        liveSupportButtonColors,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .clickable { /* Handle click */ }
                    .padding(vertical = 14.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Live Support",
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
                    .shadow(elevation = 3.dp, shape = RoundedCornerShape(12.dp))
                    .background(
                        liveSupportButtonColors,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .clickable { navController.navigate(ProfileRoutes.NoteScreen.route) }
                    .padding(vertical = 14.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Notes",
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}


@Composable
fun SavedNoteCard(tittle: String, description: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = tittle,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = description,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun UserProfileSection(userProfileViewModel: UserProfileViewModel) {

    val guestProfile = userProfileViewModel.guestProfile.collectAsState()
    val onEditMode = remember{ mutableStateOf(false) }


    val context = LocalContext.current


    //Update Profile data
    val newName = remember { mutableStateOf(guestProfile.value?.username ?: "") }
    val newImage = remember { mutableStateOf(guestProfile.value?.profilePicture) }
    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            newImage.value = uriToByteArray(context,it)
        }
    }

    Box(
        modifier = Modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth()
            .height(200.dp)
            .shadow(3.dp, shape = RoundedCornerShape(16.dp))
            .background(
                brush = profileSectionGradient,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        // Background with gradient and wave
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(16.dp)) // Clip for rounded corners
        ) {
            val width = size.width
            val height = size.height

            // Wave path
            val wavePath = Path().apply {
                moveTo(0f, height * .65f)
                cubicTo(
                    width * 0.25f, height * .1f,
                    width * 0.75f, height * 0.85f,
                    width, height * 0.6f
                )
                lineTo(width, height)
                lineTo(0f, height)
                close()
            }

            drawPath(
                path = wavePath,
                brush = waveGradient
            )
        }

        // Edit Icon (Top-right corner)
        Icon(
            painter = painterResource(R.drawable.editicon),
            contentDescription = "Edit Profile",
            tint = Color.White,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(44.dp)
                .padding(12.dp)
                .clickable(onClick = {
                    onEditMode.value = !onEditMode.value
                }
                )
        )

        // Profile content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            // Profile Picture with dashed border
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF2A2A2A)) // Dark background for avatar
            ) {
                Canvas(modifier = Modifier.matchParentSize()) {
                    drawCircle(
                        color = Color(0xFFFFD700), // Golden border
                        style = Stroke(
                            width = 3.dp.toPx(),
                            pathEffect = PathEffect.dashPathEffect(floatArrayOf(12f, 6f))
                        ),
                    )
                }

                Log.d("image", guestProfile.value?.profilePicture.toString())

                GlideImage(
                    model = guestProfile.value?.profilePicture,
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(6.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.FillBounds
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Username
            Text(
                text = guestProfile.value?.username.toString(),
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            )

            // Followers and Following
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Guest Account",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Color.Gray
                )
            )
        }
    }


    // Edit Profile Dialog
    if (onEditMode.value) {
        AlertDialog(
            onDismissRequest = { onEditMode.value = false },
            title = { Text(text = "Edit Profile") },
            text = {
                Column {
                    // Profile Picture Picker
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF2A2A2A))
                            .clickable { imagePickerLauncher.launch("image/*") }
                    ) {
                        if (newImage.value != null) {
                            GlideImage(
                                model = newImage.value,
                                contentDescription = "New Profile Picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                        } else {
                            Text(
                                text = "Pick Image",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Name Input Field
                    OutlinedTextField(
                        value = newName.value,
                        onValueChange = { newName.value = it },
                        label = { Text("Name") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        userProfileViewModel.updateGuestProfile(
                            name = newName.value,
                            profilePictureUrl = newImage.value
                        )
                        onEditMode.value = false
                    }
                ) {
                    Text("Save")
                }
            },
            dismissButton = {
                Button(onClick = { onEditMode.value = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}


//
//@Composable
//fun StatsCard(
//    iconRes: Int, value: String, label: String,
//    modifier: Modifier = Modifier
//) {
//
//
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = modifier
//            .height(100.dp)
//            .shadow(elevation = 3.dp, shape = RoundedCornerShape(8.dp))
//            .background(
//                brush = statsCardGradient,
//                shape = RoundedCornerShape(8.dp)
//            )
//            .padding(12.dp)
//
//    ) {
//        Icon(
//            painter = painterResource(iconRes),
//            contentDescription = label,
//            tint = Color.White,
//            modifier = Modifier.size(28.dp)
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//        Text(
//            text = value,
//            style = MaterialTheme.typography.titleMedium.copy(
//                color = Color.White,
//                fontWeight = FontWeight.Bold
//            )
//        )
//        Spacer(modifier = Modifier.height(4.dp))
//        Text(
//            text = label,
//            style = MaterialTheme.typography.bodySmall.copy(color = Color.Gray)
//        )
//    }
//}
//
