package com.codemaster.codemasterapp.main.ui.auth.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AuthBasicTopBar(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .statusBarsPadding()
    ) {
        OutlinedIconButton(
            border = BorderStroke(width = 2.dp, color = Color.White.copy(.8f)),
            modifier = Modifier
                .height(34.dp)
                .width(46.dp)
                .padding(start = 12.dp),
            onClick = {
                onBackClick()
            },
            colors = IconButtonDefaults.outlinedIconButtonColors(
                containerColor = Color.White.copy(.05f),
            )
        ) {

            Icon(
                imageVector = Icons.AutoMirrored.Default.KeyboardArrowLeft,
                contentDescription = "Back",
                tint = Color.White.copy(.8f),
                modifier = Modifier.size(26.dp)
            )
        }
    }
}