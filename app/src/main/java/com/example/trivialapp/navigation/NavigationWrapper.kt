package com.example.trivialapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.trivialapp.screen.Pantalla1Screen
import com.example.trivialapp.screen.Pantalla2Screen
import com.example.trivialapp.screen.Pantalla3Screen

@Composable
fun NavigationWrapper(){
    val backStack = rememberNavBackStack(Routes.Pantalla1)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.Pantalla1> {
                Pantalla1Screen { backStack.add(Routes.Pantalla2) }
            }
            entry<Routes.Pantalla2> {
                Pantalla2Screen { name -> backStack.add(Routes.Pantalla3(name)) }
            }
            entry<Routes.Pantalla3> { key->
                Pantalla3Screen(key.name) {
                    backStack.clear()
                    backStack.add(Routes.Pantalla1)
                }
            }
        }
    )
}