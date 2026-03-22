package com.example.trivialapp.screen

import androidx.lifecycle.ViewModel
import com.example.trivialapp.data.Pregunta
import com.example.trivialapp.domain.PreguntasProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel : ViewModel() {
    private val provider = PreguntasProvider()

    private var preguntasDeLaPartida: List<Pregunta> = emptyList()
    val preguntasTotales = 10

    //Variables

    //PreguntaActual
    private val _preguntaActual = MutableStateFlow<Pregunta?>(null)
    val preguntaActual: StateFlow<Pregunta?> = _preguntaActual.asStateFlow()

    // En qué número de pregunta estamos (1 de 10)
    private val _numPregunta = MutableStateFlow(1)
    val numPregunta: StateFlow<Int> = _numPregunta.asStateFlow()

    // Cuántas ha acertado
    private val _puntuacion = MutableStateFlow(0)
    val puntuacion: StateFlow<Int> = _puntuacion.asStateFlow()

    // Si el juego ha terminado (para cambiar de pantalla)
    private val _juegoTerminado = MutableStateFlow(false)
    val juegoTerminado: StateFlow<Boolean> = _juegoTerminado.asStateFlow()

    init {
        // Por defecto empezamos una partida en dificultad fácil (1)
        iniciarPartida(dificultad = 1)
    }

    fun iniciarPartida(dificultad: Int) {
        preguntasDeLaPartida = provider.getPreguntasParaPartida(dificultad, preguntasTotales)
        _puntuacion.value = 0
        _numPregunta.value = 1
        _juegoTerminado.value = false
        _preguntaActual.value = preguntasDeLaPartida[_numPregunta.value - 1]
    }

    fun siguientePregunta() {
        _numPregunta.value += 1
        _preguntaActual.value = preguntasDeLaPartida[_numPregunta.value - 1]
    }
}