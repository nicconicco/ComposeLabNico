package com.nicco.composelabnicco

/**
 * This is a content from
 * https://www.youtube.com/watch?v=TOflUdgx4pw&list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC&index=13
 * I;m just studying this material
 */
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class StandartTemplateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun FunctionExample(
) {

}

@Preview(
    showBackground = true,
    widthDp = 600,
    heightDp = 480
)
@Composable
fun DefaultPreview() {

}