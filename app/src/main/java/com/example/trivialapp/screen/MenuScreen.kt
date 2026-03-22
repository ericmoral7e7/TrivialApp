package com.example.trivialapp.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuScreen(navigateToPlayScreen: (difficulty: String) -> Unit) {
    var difficulty by remember { mutableStateOf("easy") }

    Column(
        Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Awesome App", fontSize = 24.sp,
            textDecoration = TextDecoration.Underline, fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(60.dp))

        //Image

        TextField(
            value = difficulty, label = { Text("Dificultad") },
            onValueChange = { difficulty = it })

        Button(onClick = { navigateToPlayScreen(difficulty) }) {
            Text(text = "New Game")
        }
    }
}
