package com.nicco.composelabnicco.main

/**
 * This is a content from
 * https://www.youtube.com/watch?v=TOflUdgx4pw&list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC&index=13
 * I;m just studying this material
 */
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.nicco.composelabnicco.tutorial1.Tutorial1View
import com.nicco.composelabnicco.tutorial10.Tutorial10View
import com.nicco.composelabnicco.tutorial11.Tutorial11View
import com.nicco.composelabnicco.tutorial2.Tutorial2View
import com.nicco.composelabnicco.tutorial3.Tutorial3View
import com.nicco.composelabnicco.tutorial4.Tutorial4View
import com.nicco.composelabnicco.tutorial5.Tutorial5View
import com.nicco.composelabnicco.tutorial6.Tutorial6View
import com.nicco.composelabnicco.tutorial7.Tutorial7View
import com.nicco.composelabnicco.tutorial8.Tutorial8View
import com.nicco.composelabnicco.tutorial9.Tutorial9View

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
            route = Screen.Tutorial1Screen.route,
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "defaultValue"
                    nullable = true
                }
            )
        ) {
            Tutorial1View()
        }
        composable(route = Screen.Tutorial2Screen.route) {
            Tutorial2View()
        }
        composable(route = Screen.Tutorial3Screen.route) {
            Tutorial3View()
        }
        composable(route = Screen.Tutorial4Screen.route) {
            Tutorial4View()
        }
        composable(route = Screen.Tutorial5Screen.route) {
            Tutorial5View()
        }
        composable(route = Screen.Tutorial6Screen.route) {
            Tutorial6View()
        }
        composable(route = Screen.Tutorial7Screen.route) {
            Tutorial7View()
        }
        composable(route = Screen.Tutorial8Screen.route) {
            Tutorial8View()
        }
        composable(route = Screen.Tutorial9Screen.route) {
            Tutorial9View()
        }
        composable(route = Screen.Tutorial10Screen.route) {
            Tutorial10View()
        }
        composable(route = Screen.Tutorial10Screen.route) {
            Tutorial10View()
        }
        composable(route = Screen.Tutorial11Screen.route) {
            Tutorial11View()
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {
    val tutorial1 = Screen.Tutorial1Screen.route
    val tutorial2 = Screen.Tutorial2Screen.route
    val tutorial3 = Screen.Tutorial3Screen.route
    val tutorial4 = Screen.Tutorial4Screen.route
    val tutorial5 = Screen.Tutorial5Screen.route
    val tutorial6 = Screen.Tutorial6Screen.route
    val tutorial7 = Screen.Tutorial7Screen.route
    val tutorial8 = Screen.Tutorial8Screen.route
    val tutorial9 = Screen.Tutorial9Screen.route
    val tutorial10 = Screen.Tutorial10Screen.route
    val tutorial11 = Screen.Tutorial11Screen.route

    val list = listOf(
        tutorial1,
        tutorial2,
        tutorial3,
        tutorial4,
        tutorial5,
        tutorial6,
        tutorial7,
        tutorial8,
        tutorial9,
        tutorial10,
        tutorial11
    )

    LazyColumn {
        itemsIndexed(list) { index, text ->
            Button(onClick = {
                navController.navigate(list[index])
            }, Modifier.padding(20.dp)) {
                Text("Click me $text")
            }
        }
    }
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