package com.nicco.composelabnicco.tutorial1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nicco.composelabnicco.ui.theme.ComposeLabNiccoTheme

class Tutorial1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial1View()
        }
    }
}

@Composable
fun Tutorial1View(){
    ComposeLabNiccoTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Greeting("Android")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(
    showBackground = true,
    widthDp = 600,
    heightDp = 480
)
@Composable
fun DefaultPreview() {
    ComposeLabNiccoTheme {
        Greeting("Android")
    }
}