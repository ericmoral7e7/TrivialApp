package com.example.trivialapp.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.trivialapp.data.Pregunta

@Composable
fun GameScreen(difficulty: Int, navigateToResultScreen: (score: Int) -> Unit) {

    val gameViewModel = viewModel<GameViewModel>(factory = GameViewModelFactory(difficulty))

    val pregunta: Pregunta? by gameViewModel.preguntaActual.collectAsStateWithLifecycle()
    val ronda: Int by gameViewModel.ronda.collectAsStateWithLifecycle()
    val puntuacion: Int by gameViewModel.puntuacion.collectAsStateWithLifecycle()
    val opciones: List<String> by gameViewModel.opcionesMezcladas.collectAsStateWithLifecycle()
    val juegoTerminado: Boolean by gameViewModel.juegoTerminado.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        gameViewModel.iniciarPartida(difficulty)
    }

    LaunchedEffect(juegoTerminado) {
        if (juegoTerminado) {
            navigateToResultScreen(puntuacion)
            gameViewModel.reset()
        }
    }

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Dificulty: $difficulty", fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "$ronda / 10", fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Score: $puntuacion", fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(60.dp))

        Text(
            text = pregunta!!.text, fontSize = 24.sp,
            textDecoration = TextDecoration.Underline, fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(60.dp))

        opciones.forEach { textoOpcion ->
            Button(onClick = {
                gameViewModel.comprobarRespuesta(textoOpcion)
            }) {
                Text(text = textoOpcion)
            }
        }
    }
}