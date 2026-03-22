package com.example.trivialapp.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable


sealed class Routes: NavKey {
    @Serializable
    data object MenuScreen: Routes() // Objects quan no passem paràmetres
    @Serializable
    data class GameScreen(val dificulty: String): Routes() // Class quan passem paràmetres
    @Serializable
    data class ResultScreen(val score: Int): Routes() // Class quan passem paràmetres
}
