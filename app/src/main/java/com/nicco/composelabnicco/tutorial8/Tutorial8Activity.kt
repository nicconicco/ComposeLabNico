package com.nicco.composelabnicco.tutorial8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Tutorial8Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListSecondWayToDo()
        }
    }

    @Composable
    private fun ListSecondWayToDo() {
        LazyColumn {
            itemsIndexed(listOf("this", "is", "my", "list")) { index, text ->
                Text(
                    text = "Item $index - $text",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp)
                )
            }
        }
    }

    @Composable
    fun ListFirstWayToDo() {
        LazyColumn {
            items(5000) {
                Text(
                    text = "Item $it",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp)
                )
            }
        }
    }

    @Composable
    fun ColumnScrollable(
    ) {
        val rememberScrollState = rememberScrollState()

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState)
        ) {
            for (i in 1..50) {
                Text(
                    text = "Item $i",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp)
                )
            }
        }
    }

    @Preview(
        showBackground = true,
        widthDp = 600,
        heightDp = 480
    )
    @Composable
    fun DefaultPreview() {
//        listFirstWayToDo()
//        ColumnScrollable()
    }
}