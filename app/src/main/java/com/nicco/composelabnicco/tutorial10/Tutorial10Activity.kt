package com.nicco.composelabnicco.tutorial10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

class Tutorial10Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial10View()
        }
    }
}

@Composable
fun Tutorial10View(){
    val scaffoldState = rememberScaffoldState()
    Scaffold(scaffoldState = scaffoldState) {
        var counter by remember {
            mutableStateOf(0)
        }

        if(counter % 5 == 0 && counter > 0) {
            LaunchedEffect(key1 = scaffoldState.snackbarHostState) {
                scaffoldState.snackbarHostState.showSnackbar("Hello")
            }
        }

        Button(onClick = { counter++ }) {
            Text("click me $counter")
        }
    }
}

@Composable
fun MyExampleFunction(
    backPressedDisptacher: OnBackPressedDispatcher
) {

    val callback = remember {
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // do something
            }
        }
    }

    DisposableEffect(key1 = backPressedDisptacher) {
        backPressedDisptacher.addCallback(callback)
        onDispose {
            callback.remove()
        }
    }

    Button(onClick = { /*TODO*/ }) {
        Text("Click me")
    }
}

@Preview(
    showBackground = true,
    widthDp = 600,
    heightDp = 480
)
@Composable
fun DefaultPreview() {

}