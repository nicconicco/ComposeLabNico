package com.nicco.composelabnicco.tutorial6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlin.random.Random

class Tutorial6Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial6View()
        }
    }
}

@Composable
fun Tutorial6View(){
    Column(
        Modifier.fillMaxSize()
    ) {
        val color = remember {
            mutableStateOf(Color.Yellow)
        }

        ColorBox(
            Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            color.value = it
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(color.value)
        ) {

        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {
    Box(
        modifier =
        modifier
            .background(Color.Red)
            .clickable {
                updateColor(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                )
            })
}

@Preview(
    showBackground = true,
    widthDp = 600,
    heightDp = 480
)
@Composable
fun DefaultPreview() {
    Column(
        Modifier.fillMaxSize()
    ) {
        val color = remember {
            mutableStateOf(Color.Yellow)
        }

        ColorBox(
            Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            color.value = it
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(color.value)
        ) {

        }
    }
}