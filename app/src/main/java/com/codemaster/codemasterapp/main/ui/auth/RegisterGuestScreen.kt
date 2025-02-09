package com.codemaster.codemasterapp.main.ui.auth


import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.codemaster.codemasterapp.main.ui.auth.components.AuthActionButton
import com.codemaster.codemasterapp.main.ui.auth.components.AuthBasicTopBar
import com.codemaster.codemasterapp.main.ui.auth.components.AuthInputField
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.MainViewModel
import com.codemaster.codemasterapp.main.ui.viewModels.UserProfileViewModel
import com.codemaster.codemasterapp.ui.theme.greenishPython
import java.io.ByteArrayOutputStream
import java.io.InputStream



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterGuestScreen(
    userProfileViewModel: UserProfileViewModel,
    mainViewModel: MainViewModel,
    navController: NavController
) {

//    val context = LocalContext.current
//    val sharedPreferences = context.getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)

    Scaffold(
        topBar = {
            AuthBasicTopBar(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF576cd6))
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GuestScreenContent(
                onContinue = { firstName, lastName, imageByteArray ->
                    val fullName = "$firstName $lastName"
                    userProfileViewModel.createOrUpdateGuestProfile(name = fullName, profilePictureUrl = imageByteArray)

                    mainViewModel.setIsSignedUp(true)
                    navController.navigate(BottomNavRoutes.BOTTOM_ROOT.route)

                    // Update isSignedUp in SharedPreferences

//                    sharedPreferences.edit().putBoolean("isSignedUp", true).apply()
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
@Composable
fun GuestScreenContent(
    onContinue: (firstName: String, lastName: String, imageByteArray: ByteArray?) -> Unit
) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var imageUri by remember { mutableStateOf<Uri?>(null) }
    var imageByteArray by remember { mutableStateOf<ByteArray?>(null) }
    var showDialog by remember { mutableStateOf(false) }
    var showError by remember { mutableStateOf(false) }

    val focusManager = LocalFocusManager.current
    val context = LocalContext.current

    // Register the image picker launcher
    val pickImageLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = { uri: Uri? ->
            imageUri = uri
            imageByteArray = uri?.let { uriToByteArray(context, it) }
        }
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 0.dp, start = 18.dp, end = 18.dp, bottom = 24.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.weight(.2f))

        Box(
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
                .background(Color.LightGray.copy(.55f))
                .border(1.dp, greenishPython, CircleShape)
                .clickable {
                    pickImageLauncher.launch("image/*")
                },
            contentAlignment = Alignment.Center,
            content = {
                Icon(
                    imageVector = Icons.Default.Add,
                    tint = Color.Black,
                    contentDescription = "Add Image",
                )

                GlideImage(
                    model = imageUri,
                    contentDescription = "Selected Image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Welcome Back",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Login to continue",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(24.dp))

            // First Name Input
            AuthInputField(
                value = firstName,
                onValueChange = {
                    firstName = it
                    showError = false
                },
                hint = "First Name",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Firstname",
                        tint = Color.Gray
                    )
                },
                keyboardActions = KeyboardActions(
                    onNext = { focusManager.moveFocus(FocusDirection.Next) }
                ),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
            )

            if (showError) {
                Text(
                    text = "First name must be at least 3 characters!",
                    color = Color.Red,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(start = 8.dp, top = 4.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Last Name Input
            AuthInputField(
                value = lastName,
                onValueChange = { lastName = it },
                hint = "Last Name",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Lastname icon",
                        tint = Color.Gray
                    )
                },
                keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus() }),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        // Continue Button
        AuthActionButton(
            text = "Continue",
            onClick = {
                when {
                    firstName.length < 3 -> showError = true
                    imageByteArray == null -> showDialog = true
                    else -> onContinue(firstName, lastName, imageByteArray)
                }
            },
            innerModifier = Modifier.fillMaxWidth(),
            modifier = Modifier.shadow(2.dp, shape = CircleShape)
        )
    }

    // Dialog for missing profile picture
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text(text = "No Profile Picture") },
            text = { Text(text = "Do you want to continue without a profile picture?") },
            confirmButton = {
                TextButton(onClick = {
                    showDialog = false
                    onContinue(firstName, lastName, null)
                }) {
                    Text("Continue")
                }
            },
            dismissButton = {
                TextButton(onClick = { showDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}

//
//fun uriToByteArray(context: Context, uri: Uri, maxWidth: Int = 500, maxHeight: Int = 500, quality: Int = 70): ByteArray? {
//    return try {
//        val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
//        val bitmap = BitmapFactory.decodeStream(inputStream)
//
//        // Resize the bitmap to reduce size
//        val resizedBitmap = Bitmap.createScaledBitmap(bitmap, maxWidth, maxHeight, true)
//
//        val outputStream = ByteArrayOutputStream()
//        resizedBitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream) // Compressing to 70% quality
//
//        val byteArray = outputStream.toByteArray()
//
//        // Log the size in MBs
//        val sizeInMB = byteArray.size.toDouble() / (1024 * 1024) // Convert bytes to MB
//        Log.d("ImageSize", "Compressed Image Size: ${String.format("%.2f", sizeInMB)} MB")
//
//        byteArray
//    } catch (e: Exception) {
//        e.printStackTrace()
//        null
//    }
//}


fun uriToByteArray(context: Context, uri: Uri, maxWidth: Int = 500, maxHeight: Int = 500, quality: Int = 70): ByteArray? {
    return try {
        val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
        val originalBitmap = BitmapFactory.decodeStream(inputStream)

        // Convert original image to ByteArray to get its size
        val originalStream = ByteArrayOutputStream()
        originalBitmap.compress(Bitmap.CompressFormat.JPEG, 100, originalStream)
        val originalByteArray = originalStream.toByteArray()

        // Log original size in MB
        val originalSizeMB = originalByteArray.size.toDouble() / (1024 * 1024)
        Log.d("ImageSize", "Original Image Size: ${String.format("%.2f", originalSizeMB)} MB")

        // Resize the bitmap
        val resizedBitmap = Bitmap.createScaledBitmap(originalBitmap, maxWidth, maxHeight, true)

        // Compress the resized image
        val outputStream = ByteArrayOutputStream()
        resizedBitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream)

        val compressedByteArray = outputStream.toByteArray()

        // Log compressed size in MB
        val compressedSizeMB = compressedByteArray.size.toDouble() / (1024 * 1024)
        Log.d("ImageSize", "Compressed Image Size: ${String.format("%.2f", compressedSizeMB)} MB")

        compressedByteArray
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}



//
//@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
//@Composable
//fun GuestScreenContent(
//    onContinue: (firstName: String, lastName: String, imageByteArray: ByteArray?) -> Unit
//) {
//    var firstName by remember { mutableStateOf("") }
//    var lastName by remember { mutableStateOf("") }
//    var imageUri by remember { mutableStateOf<Uri?>(null) }
//    var imageByteArray by remember { mutableStateOf<ByteArray?>(null) }
//
//
//    val focusManager = LocalFocusManager.current
//    val context = LocalContext.current
//
//    // Register the image picker launcher
//    val pickImageLauncher = rememberLauncherForActivityResult(
//        contract = ActivityResultContracts.GetContent(),
//        onResult = { uri: Uri? ->
//            imageUri = uri
//            imageByteArray = uri?.let { uriToByteArray(context, it) }
//        }
//    )
//
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(top = 0.dp, start = 18.dp, end = 18.dp, bottom = 24.dp)
//            .verticalScroll(rememberScrollState())
//    ) {
//        Spacer(modifier = Modifier.weight(.2f))
//
//        Box(
//            modifier = Modifier
//                .size(180.dp)
//                .clip(CircleShape)
//                .background(Color.LightGray.copy(.55f))
//                .border(1.dp, greenishPython, CircleShape)
//                .clickable {
//                    pickImageLauncher.launch("image/*")
//                },
//            contentAlignment = Alignment.Center,
//            content = {
//                Icon(
//                    imageVector = Icons.Default.Add,
//                    tint = Color.Black,
//                    contentDescription = "Add Image",
//                )
//
//                GlideImage(
//                    model = imageUri,
//                    contentDescription = "Selected Image",
//                    modifier = Modifier.fillMaxSize(),
//                    contentScale = ContentScale.Crop  // Ensures the image is cropped to fit the box
//                )
//            }
//        )
//
//
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//                .padding(top = 24.dp)
//                .fillMaxSize()
//        ) {
//            Spacer(modifier = Modifier.height(4.dp))
//
//            Text(
//                text = "Welcome Back",
//                style = MaterialTheme.typography.headlineMedium.copy(
//                    fontWeight = FontWeight.Bold,
//                    color = Color.White
//                )
//            )
//            Spacer(modifier = Modifier.height(4.dp))
//            Text(
//                text = "Login to continue",
//                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
//                textAlign = TextAlign.Center
//            )
//            Spacer(modifier = Modifier.height(24.dp))
//
//            // First Name Input
//            AuthInputField(
//                value = firstName,
//                onValueChange = { firstName = it },
//                hint = "First Name",
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Person,
//                        contentDescription = "Firstname",
//                        tint = Color.Gray
//                    )
//                },
//                keyboardActions = KeyboardActions(
//                    onNext = { focusManager.moveFocus(focusDirection = FocusDirection.Next) }
//                ),
//                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
//            )
//
//            Spacer(modifier = Modifier.height(12.dp))
//
//            // Last Name Input
//            AuthInputField(
//                value = lastName,
//                onValueChange = { lastName = it },
//                hint = "Last Name",
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Person,
//                        contentDescription = "Lastname icon",
//                        tint = Color.Gray
//                    )
//                },
//                keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus() }),
//                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
//            )
//        }
//
//        Spacer(modifier = Modifier.weight(1f))
//
//        // Continue Button
//        AuthActionButton(
//            text = "Continue",
//            onClick = {
//                onContinue(firstName, lastName, imageByteArray)
//            },
//            innerModifier = Modifier.fillMaxWidth(),
//            modifier = Modifier.shadow(2.dp, shape = CircleShape)
//        )
//    }
//}


//fun uriToByteArray(context: Context, uri: Uri): ByteArray? {
//    return try {
//        val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
//        val bitmap = BitmapFactory.decodeStream(inputStream)
//        val outputStream = ByteArrayOutputStream()
//        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
//        outputStream.toByteArray()
//    } catch (e: Exception) {
//        e.printStackTrace()
//        null
//    }
//}
