package com.example.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.hellojetpackcompose.ui.theme.HelloJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Aditya")
        }
    }
}

@Composable
fun Greeting(name: String){
    Text(text = "Hello $name!")
}

@Composable
@Preview
fun previewGreeting(){
    Greeting(name = "Aditya")
}
