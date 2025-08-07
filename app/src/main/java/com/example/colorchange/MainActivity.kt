package com.example.colorchange

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.colorchange.ui.theme.ColorChangeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColorChangeTheme {
                ColorChangeApp()
            }
        }
    }
}

@Composable
fun ColorChangeText(modifier: Modifier = Modifier) {
    var bgColor by remember { mutableStateOf(Color.Transparent) }
    Column(modifier = modifier.background(color = bgColor),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Ishar Singh",
            modifier = Modifier.padding(top = 128.dp),
            style = MaterialTheme.typography.displayLarge
        )
        Spacer(modifier = modifier.weight(1f))
        Button(onClick = {bgColor = Color.Red},
            shape = MaterialTheme.shapes.small,
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .padding(vertical = 8.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)) {
            Text(
                text = "RED",
                style = MaterialTheme.typography.displaySmall
            )
        }
        Button(onClick = {bgColor = Color.Green},
            shape = MaterialTheme.shapes.small,
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .padding(vertical = 8.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green)) {
            Text(
                text = "GREEN",
                color = Color.Black,
                style = MaterialTheme.typography.displaySmall
            )
        }
        Button(onClick = {bgColor = Color.Blue},
            shape = MaterialTheme.shapes.small,
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .padding(vertical = 8.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)) {
            Text(
                text = "BLUE",
                style = MaterialTheme.typography.displaySmall
            )
        }
        Spacer(modifier = modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun ColorChangeApp() {
    ColorChangeTheme {
        ColorChangeText(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center))
    }
}