package com.codemaster.codemasterapp.main.ui.userProfileDetails.settings

import android.R.attr.enabled
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
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
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.SettingsRoutes
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.SnackbarHostState
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import com.codemaster.codemasterapp.ui.theme.Pink80
import kotlinx.coroutines.launch
import com.codemaster.codemasterapp.R

//val screenBackgroundGradient = Brush.verticalGradient(
//    colors = listOf(
//        Color(0x55101820), // Very Dark Blue
//        Color(0x550F263D), // Slightly Brighter Blue
//        Color(0x5515476E)  // Cool Medium Blue
//    )
//)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingScreen(
    courseViewModel: CourseViewModel,
    navController: NavController) {


    val scrollState = rememberScrollState()
    var showDialog by remember{mutableStateOf(false)}

    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()


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
                        text = "Settings",
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
                )

            )
        }
    ) { paddingValues ->


        Column(
            modifier = Modifier
                .fillMaxSize()
//                .background(screenBackgroundGradient) // Apply gradient background
                .padding(paddingValues)
                .verticalScroll(scrollState)
                .padding(horizontal = 12.dp) // Reduced horizontal padding for tighter layout
        ) {

            // Account Section
            SectionCard(title = "Account") {
                SettingItem(icon = R.drawable.usercirle, label = "Sign In") {
                    coroutineScope.launch {
                        showToast(context,"Not implemented yet!")
                    }
                }
            }

            // General Section
            SectionCard(title = "General Section") {
                SettingItem(icon = R.drawable.generalsettings, label = "General Settings") {
                    navController.navigate(SettingsRoutes.GeneralSettings.route)
                }
                SettingItem(icon = R.drawable.appupdate, label = "App Updates") {
                    navController.navigate(SettingsRoutes.AppUpdateScreen.route)
                }

                SettingItem(icon = R.drawable.resetall, label = "Reset all my progress") {
                    showDialog = true
                }
            }

            // About Section
            SectionCard(title = "About") {
                SettingItem(icon = R.drawable.aboutinfo, label = "About CodeMaster") {
                    navController.navigate(SettingsRoutes.AboutCodeMasterScreen.route)
                }
                SettingItem(icon = R.drawable.aboutus, label = "About Us") {
                    navController.navigate(SettingsRoutes.AboutUsScreen.route)
                }
                SettingItem(icon = R.drawable.community, label = "Community") {
                    val whatsappGroupLink = "https://chat.whatsapp.com/EbhTZmO3VYJCSSl77CdU6H"
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(whatsappGroupLink))
                    context.startActivity(intent)
                }
                SettingItem(icon = R.drawable.feedback, label = "Give us feedback") {
                    val intent = Intent(Intent.ACTION_SENDTO).apply {
                        data = Uri.parse("mailto:kpdevelopers613@gmail.com") // Change to your email
                        putExtra(Intent.EXTRA_SUBJECT, "App Feedback")
                        putExtra(Intent.EXTRA_TEXT, "Write your feedback here...")
                    }
                    context.startActivity(intent)
                }

                SettingItem(icon = R.drawable.otherapps, label = "Other Apps") {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://kpcreativelabs.web.app/")) // Replace with your actual URL
                    context.startActivity(intent)
                }

//                SettingItem(icon = Icons.Default.Info, label = "Report issues") {}
//                SettingItem(icon = Icons.Default.Info, label = "Privacy policy") {}
//                SettingItem(icon = Icons.Default.Info, label = "Terms of use") {}
//                SettingItem(icon = Icons.Default.Info, label = "Credits") {}
//                SettingItem(icon = Icons.Default.Info, label = "Release log") {}
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }


    // Show the reset progress dialog
    if (showDialog) {
        ResetProgressDialog(
            onDismiss = { showDialog = false },
            onConfirm = {
                showDialog = false
                courseViewModel.clearAllCourseProgress()
                Toast.makeText(context,"All progress reset successfully", Toast.LENGTH_SHORT).show()

            }
        )
    }
}

@Composable
fun SectionCard(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
    ) {
        // Section title
        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Color(0xFF80A4C0), // Muted blue-gray for a modern look
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(start = 8.dp, bottom = 6.dp) // Consistent spacing
        )

        // Card for the section
        Card(
            shape = RoundedCornerShape(12.dp), // Slightly rounded for a modern feel
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF1A3149) // Rich dark blue for card background
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp), // Subtle shadow for depth
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 0.dp, vertical = 8.dp) // Comfortable padding inside card
            ) {
                content()
            }
        }
    }
}


@Composable
fun SettingItem(
    icon: Int,
    label: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 6.dp)
            .padding(horizontal = 10.dp), // Reduced vertical padding for tighter layout
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Icon with circle background
        Box(
            modifier = Modifier
                .size(36.dp) // Slightly smaller for compact design
                .background(
                    color = Color(0xFF15476E), // Blue tone matching background
                    shape = CircleShape
                )
                .padding(6.dp), // Compact padding
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(20.dp) // Smaller icon size
            )
        }

        Spacer(modifier = Modifier.width(12.dp)) // Closer spacing between icon and text

        // Label text
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge.copy(color = Color.White), // White text for contrast
            modifier = Modifier.weight(1f)
        )

        // Arrow icon at the end
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "Arrow",
            tint = Color(0xFFB0BEC5), // Light gray arrow color
            modifier = Modifier.size(20.dp)
        )
    }
}





@Composable
fun ResetProgressDialog(onDismiss: () -> Unit, onConfirm: () -> Unit) {
    var inputText by remember { mutableStateOf("") }
    val confirmText = "CONFIRM"

    val focusManager = LocalFocusManager.current


    AlertDialog(
        containerColor = Color.Transparent,
        onDismissRequest = { onDismiss() },
        title = {
            Text(
                text = "Reset all courses progress?",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Bold
                ),
                color = Color.White
            )
        },
        text = {
            Column {
                Text(
                    buildAnnotatedString {
                        append("Are you sure you want to reset all your course progress and start over? ")
                        append("This will erase all completed lessons progress.\n\n")

                        pushStyle(SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red))
                        append("Write \"$confirmText\" to reset.")
                        pop()
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.LightGray
                )

                Spacer(Modifier.height(12.dp))

                BasicTextField(
                    value = inputText,
                    onValueChange = { inputText = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .background(Color.LightGray.copy(alpha = 0.3f), MaterialTheme.shapes.small)
                        .border(.5.dp,Color.White,RoundedCornerShape(12.dp))
                        .padding(8.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Text
                    ),
                    keyboardActions = KeyboardActions(onDone = {
                        focusManager.clearFocus()
                    })
                )
            }



        },
        confirmButton = {
            Button(
                colors = ButtonDefaults.textButtonColors(containerColor = Color(0x55464649)),
                onClick = {
                    if (inputText.equals(confirmText, ignoreCase = true)) {
                        onConfirm()
                    }
                },
                enabled = inputText.equals(confirmText, ignoreCase = true)
            ) {
                Text(
                    text = "OK",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Medium
                    ),
                    color =  if (inputText.equals(confirmText, ignoreCase = true)) (Color(0xFFDD2C00)) else (Color(
                        0xFF8D4B3A
                    )) , // Bright red for confirmation
                )
            }
        },
        dismissButton = {
            Button(
                colors = ButtonDefaults.textButtonColors(containerColor = Color(0x55464649)),
                onClick = {
                    onDismiss()
                }
            ) {
                Text(
                    text = "Cancel",
                    color = Pink80,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Medium
                    )
                )
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFF1A233A), shape = RoundedCornerShape(12.dp))
    )
}

private var toast: Toast? = null

fun showToast(context: Context, message: String) {
    toast?.cancel() // Cancel previous toast if exists
    toast = Toast.makeText(context, message, Toast.LENGTH_SHORT).apply { show() }
}

