package com.nicco.composelabnicco.tutorial2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nicco.composelabnicco.ui.theme.ComposeLabNiccoTheme

class Tutorial2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//        Remove comments to see how it works
//        text1()
//        collunText()
//        rowText()
//            collunPropertiesText()
            Tutorial2View()
        }
    }
}

@Composable
fun text1() {
    Text("My Name")
    Text("My Second Name")
}

@Composable
fun collunText() {
    Column {
        Text("My Name")
        Text("My Second Name")
    }
}

@Composable
fun collunPropertiesText() {
    Column(
        modifier = Modifier
            .background(Color.Red)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Bottom
//        verticalArrangement = Arrangement.SpaceBetween
        verticalArrangement = Arrangement.SpaceEvenly

    ) {
//    Column(horizontalAlignment = Alignment.End) {
//    Column(horizontalAlignment = Alignment.Start) {
        Text(
            "My Name",
            modifier = Modifier
                .background(Color.White),
            color = Color.Black
        )

        Text(
            "My Second Name",
            modifier = Modifier
                .background(Color.White),
            color = Color.Black
        )

        Text(
            "My Last Name",
            modifier = Modifier
                .background(Color.White),
            color = Color.Black
        )
    }
}

@Composable
fun rowText() {
    Row {
        Text("My Name")
        Text("My Second Name")
    }
}

@Composable
fun Tutorial2View() {
    Row(
        modifier = Modifier
            // sometimes preview not work well with this properties
            // so you need to run in a emulator or device to show how works real
//            .fillMaxSize(0.5f)
//            .fillMaxSize()
            .fillMaxHeight(0.7f)
            .width(150.dp)
//            .height(250.dp)
            .background(Color.Blue),
        horizontalArrangement = Arrangement.SpaceAround,
//        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("My Name", color = Color.White, fontSize = 10.sp)
        Text("My Second Name", color = Color.White, fontSize = 10.sp)
        Text("Last Name", color = Color.White, fontSize = 10.sp)
    }
}

@Preview(
    showBackground = true,
    widthDp = 1000,
    heightDp = 480
)

@Composable
fun DefaultPreview() {
    ComposeLabNiccoTheme {
//        Remove comments to see how it works
//        text1()
//        collunText()
//        rowText()
//        collunPropertiesText()
        Tutorial2View()
    }
}