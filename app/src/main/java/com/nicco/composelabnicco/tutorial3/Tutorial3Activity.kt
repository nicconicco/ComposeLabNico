package com.nicco.composelabnicco.tutorial3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Tutorial3Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial3View()
        }
    }
}

@Composable
fun Tutorial3View() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5f)
            .fillMaxWidth(0.9f)
            .padding(top = 50.dp)
            .border(5.dp, Color.Blue)
            .padding(5.dp)
            .border(5.dp, Color.Red)
            .padding(5.dp)
            .border(5.dp, Color.Cyan)
    ) {
        Text(

            "Hello",
            modifier = Modifier
                .offset(20.dp, 15.dp)
                .border(5.dp, Color.Yellow)
                .padding(5.dp)
                .offset(20.dp, 20.dp)
                .border(5.dp, Color.Blue)
                .padding(5.dp)
        )
        Spacer(modifier = Modifier.height(35.dp))
        Text(
            "World",
            modifier = Modifier
                .offset(5.dp, 20.dp)
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 600,
    heightDp = 480
)
@Composable
fun DefaultPreview() {
    Tutorial3View()
}