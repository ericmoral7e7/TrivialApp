package com.example.trivialapp.screen

import androidx.lifecycle.ViewModel
import com.example.trivialapp.data.Pregunta
import com.example.trivialapp.domain.PreguntasProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel(difficulty: Int) : ViewModel() {
    private val provider = PreguntasProvider()

    private var preguntasDeLaPartida: List<Pregunta> = emptyList()
    val preguntasTotales = 10

    private val _preguntaActual = MutableStateFlow<Pregunta?>(null)
    val preguntaActual: StateFlow<Pregunta?> = _preguntaActual.asStateFlow()

    private val _opcionesMezcladas = MutableStateFlow<List<String>>(emptyList())
    val opcionesMezcladas: StateFlow<List<String>> = _opcionesMezcladas.asStateFlow()

    val _ronda = MutableStateFlow(1)
    val ronda: StateFlow<Int> = _ronda.asStateFlow()

    private val _puntuacion = MutableStateFlow(0)
    val puntuacion: StateFlow<Int> = _puntuacion.asStateFlow()

    private val _juegoTerminado = MutableStateFlow(false)
    val juegoTerminado: StateFlow<Boolean> = _juegoTerminado.asStateFlow()

    init {
        iniciarPartida(dificultad = difficulty)
    }

    fun iniciarPartida(dificultad: Int) {
        preguntasDeLaPartida = provider.getPreguntasParaPartida(dificultad, preguntasTotales)
        _puntuacion.value = 0
        _ronda.value = 1
        _juegoTerminado.value = false

        cargarPreguntaEnPantalla()
    }

    private fun cargarPreguntaEnPantalla() {
        val indice = _ronda.value - 1

        // Comprobamos que no nos hayamos pasado del límite de preguntas
        if (indice < preguntasTotales) {
            val nuevaPregunta = preguntasDeLaPartida[indice]
            _preguntaActual.value = nuevaPregunta
            // Barajamos las opciones para que la correcta no sea siempre la primera
            _opcionesMezcladas.value = nuevaPregunta.options.shuffled()
        } else {
            // Si nos pasamos, el juego termina
            _juegoTerminado.value = true
        }
    }

    fun comprobarRespuesta(respuestaSeleccionada: String) {
        val pregunta = _preguntaActual.value
        if (pregunta != null) {
            val respuestaCorrecta = pregunta.options[0] // Sabemos que en Data la 0 es la buena

            if (respuestaSeleccionada == respuestaCorrecta) {
                _puntuacion.value += 1
            }

            _ronda.value += 1
            cargarPreguntaEnPantalla()
        }
    }

    fun reset() {
        _juegoTerminado.value = false
    }
}
//
//private val provider = PreguntasProvider()
//
//private var preguntasDeLaPartida: List<Pregunta> = emptyList()
//val preguntasTotales = 10
//
//private val _preguntaActual = MutableStateFlow<Pregunta?>(null)
//val preguntaActual: StateFlow<Pregunta?> = _preguntaActual.asStateFlow()
//
//private val _opcionesMezcladas = MutableStateFlow<List<String>>(emptyList())
//val opcionesMezcladas: StateFlow<List<String>> = _opcionesMezcladas.asStateFlow()
//
//val _ronda = MutableStateFlow(1)
//val ronda: StateFlow<Int> = _ronda.asStateFlow()
//
//private val _puntuacion = MutableStateFlow(0)
//val puntuacion: StateFlow<Int> = _puntuacion.asStateFlow()
//
//private val _juegoTerminado = MutableStateFlow(false)
//val juegoTerminado: StateFlow<Boolean> = _juegoTerminado.asStateFlow()