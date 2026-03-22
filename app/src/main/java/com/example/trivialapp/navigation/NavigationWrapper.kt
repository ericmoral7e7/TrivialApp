package com.example.trivialapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.trivialapp.screen.MenuScreen
import com.example.trivialapp.screen.GameScreen
import com.example.trivialapp.screen.ResultScreen

@Composable
fun NavigationWrapper() {
    val backStack = rememberNavBackStack(Routes.MenuScreen)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.MenuScreen> {
                MenuScreen { difficulty -> backStack.add(Routes.GameScreen(difficulty)) }
            }

            entry<Routes.GameScreen> { key ->
                GameScreen(difficulty = key.dificulty) { score ->
                    backStack.add(Routes.ResultScreen(score))
                }
            }

            entry<Routes.ResultScreen> { key ->
                ResultScreen(score = key.score) {
                    backStack.clear()
                    backStack.add(Routes.MenuScreen)
                }
            }
        }
    )
}