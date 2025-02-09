package com.codemaster.codemasterapp.main.ui.userProfileDetails.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.codemaster.codemasterapp.main.ui.viewModels.MainViewModel



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GeneralSettingsScreen(navController: NavController, mainViewModel: MainViewModel) {

    val selectedCompilerOption by mainViewModel.selectedCompilerOption.collectAsState()
    val selectedMiddleButtonOption by mainViewModel.selectedMiddleButtonOption.collectAsState()

    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.padding(start = 24.dp),
                        text = "General Settings",
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
                    2.dp,
                    spotColor = Color.White,
                    ambientColor = Color.White
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0x77123C46)) // Dark background
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Compiler Option Dropdown
            EnumSettingsOption(
                label = "Select Compiler Option",
                options = CompilerOption.entries.toTypedArray(),
                selectedOption = selectedCompilerOption
            ) { selected ->
                mainViewModel.setSelectedCompilerOption(selected) // Save selection
            }

            // Middle Button Option Dropdown
            EnumSettingsOption(
                label = "Select Middle Button Option",
                options = MiddleButtonAction.entries.toTypedArray(),
                selectedOption = selectedMiddleButtonOption
            ) { selected ->
                mainViewModel.setSelectedMiddleButtonOption(selected) // Save selection
            }
        }
    }
}


@Composable
fun <T : Enum<T>> EnumSettingsOption(
    label: String,
    options: Array<T>,
    selectedOption: T,
    onOptionSelected: (T) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Text(
            text = label,
            color = Color.White,
            style = MaterialTheme.typography.bodyMedium
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            OutlinedButton(
                onClick = { expanded = true },
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor =   Color(0xFF344057),
                    contentColor = Color.White),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = selectedOption.name.replace("_", " "),
                    modifier = Modifier.weight(1f),
                    color = Color.White
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Expand",
                    tint = Color.White,
                    modifier = Modifier.rotate(if(expanded) 180f else 0f)
                )
            }
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.background(Color(0xFF1E2D4D))
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(text = option.name.replace("_", " "), color = Color.White) },
                    onClick = {
                        onOptionSelected(option)
                        expanded = false
                    }
                )
            }
        }
    }
}



enum class CompilerOption {
    ONLINE_COMPILER_1, ONLINE_COMPILER_2, ONLINE_COMPILER_3, ONLINE_COMPILER_4, ONLINE_COMPILER_5
}

enum class MiddleButtonAction{
    COMPILER,ALL_COURSES,SETTINGS
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun GeneralSettingsScreen(
//    mainViewModel: MainViewModel,
//    navController: NavController) {
//    var selectedBottomBarOption by remember { mutableStateOf("All Courses") }
//    var selectedMiddleButtonOption by remember { mutableStateOf("Online Compiler 1") }
//
//    val bottomBarOptions = listOf("All Courses", "Online Compiler", "Settings")
//    val onlineCompilerOptions = listOf(
//        "Online Compiler 1", "Online Compiler 2", "Online Compiler 3",
//        "Online Compiler 4", "Online Compiler 5"
//    )
//
//    Scaffold(
//        containerColor = Color.Transparent,
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(
//                        modifier = Modifier.padding(start = 24.dp),
//                        text = "General Settings",
//                        color = Color.White
//                    )
//                },
//                navigationIcon = {
//                    OutlinedIconButton(
//                        onClick = {
//                            if (navController.currentBackStackEntry?.lifecycle?.currentState
//                                == Lifecycle.State.RESUMED
//                            ) {
//                                navController.popBackStack()
//                            }
//                        },
//                        modifier = Modifier
//                            .statusBarsPadding()
//                            .padding(start = 8.dp)
//                            .size(36.dp),
//                        border = BorderStroke(
//                            1.3.dp,
//                            color = Color.LightGray.copy(alpha = 0.4f)
//                        ), // Light border with transparency
//                        colors = IconButtonDefaults.outlinedIconButtonColors(
//                            containerColor = Color.White.copy(.08f),
//                        )
//                    ) {
//                        Icon(
//                            imageVector = Icons.Default.KeyboardArrowLeft,
//                            contentDescription = "",
//                            modifier = Modifier.size(26.dp),
//                            tint = Color.White.copy(alpha = 0.8f) // White icon with some transparency for the glass effect
//                        )
//                    }
//                },
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color(0xFF122A40)
//                ),
//                modifier = Modifier.shadow(4.dp, spotColor = Color.White, ambientColor = Color.White)
//            )
//        }
//    ) { innerPadding ->
//        Spacer(Modifier.height(12.dp))
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color(0x77123C46)) // Dark background
//                .padding(innerPadding)
//                .padding(16.dp),
//            verticalArrangement = Arrangement.spacedBy(20.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            SettingsOption("Select Bottom Bar Middle Action", bottomBarOptions, selectedBottomBarOption) {
//                selectedBottomBarOption = it
//            }
//
//            SettingsOption("Select Different Online Compiler", onlineCompilerOptions, selectedMiddleButtonOption) {
//                selectedMiddleButtonOption = it
//            }
//        }
//    }
//}
//
//@Composable
//fun SettingsOption(
//    label: String,
//    options: List<String>,
//    selectedOption: String,
//    onOptionSelected: (String) -> Unit
//) {
//    var expanded by remember { mutableStateOf(false) }
//
//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.spacedBy(6.dp)
//    ) {
//        Text(
//            text = label,
//            color = Color.White,
//            style = MaterialTheme.typography.bodyMedium
//        )
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color(0xFF1E2D4D), RoundedCornerShape(8.dp))
//        ) {
//            OutlinedButton(
//                onClick = { expanded = true },
//                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
//                shape = RoundedCornerShape(8.dp),
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text(
//                    text = selectedOption,
//                    modifier = Modifier.weight(1f),
//                    color = Color.White
//                )
//                Icon(
//                    imageVector = Icons.Default.KeyboardArrowDown,
//                    contentDescription = "Expand",
//                    tint = Color.White
//                )
//            }
//        }
//
//        DropdownMenu(
//            expanded = expanded,
//            onDismissRequest = { expanded = false },
//            modifier = Modifier.background(Color(0xFF1E2D4D))
//        ) {
//            options.forEach { option ->
//                DropdownMenuItem(
//                    text = { Text(text = option, color = Color.White) },
//                    onClick = {
//                        onOptionSelected(option)
//                        expanded = false
//                    }
//                )
//            }
//        }
//    }
//}
