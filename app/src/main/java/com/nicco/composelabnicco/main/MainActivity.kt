package com.nicco.composelabnicco.main

/**
 * This is a content from
 * https://www.youtube.com/watch?v=TOflUdgx4pw&list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC&index=13
 * I;m just studying this material
 */
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class NavigationSampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(
            //pra passar argumentos sempre tem que por na rota por causa do deeplink
            route = Screen.Tutorial1Screen.route + "/Passei",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "defaultValue"
                    nullable = true
                }
            )
        ) { entry ->
            Tutorial1Screen(name = entry.arguments?.getString("name"))
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {
    Button(onClick = {
        navController.navigate(Screen.Tutorial1Screen.withArgs("Passei"))
    }) {
        Text("Click me")
    }
}

@Composable
fun Tutorial1Screen(name: String?) {
    Text(text = "Aqui estou")
}

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object Tutorial1Screen : Screen("tutorial1_screen")
    object Tutorial2Screen : Screen("tutorial2_screen")
    object Tutorial3Screen : Screen("tutorial3_screen")
    object Tutorial4Screen : Screen("tutorial4_screen")
    object Tutorial5Screen : Screen("tutorial5_screen")
    object Tutorial6Screen : Screen("tutorial6_screen")
    object Tutorial7Screen : Screen("tutorial7_screen")
    object Tutorial8Screen : Screen("tutorial8_screen")
    object Tutorial9Screen : Screen("tutorial9_screen")
    object Tutorial10Screen : Screen("tutorial10_screen")
    object Tutorial11Screen : Screen("tutorial11_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach {
                append("/${it}")
            }
        }
    }
}