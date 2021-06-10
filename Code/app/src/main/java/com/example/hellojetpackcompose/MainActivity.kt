package com.example.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
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
            NewsStory()
        }
    }

}

@Composable
fun NewsStory() {
    Column{
        Text("A day in Shark fin cove")
        Text("Davenport California")
        Text("December, 2021")
    }
}

@Composable
@Preview
fun defaultPreview(){
    NewsStory()
}

/*
@Composable
fun Greeting(name: String){
    Text(text = "Hello $name!")
}

@Composable
@Preview
fun previewGreeting(){
    Greeting(name = "Aditya")
}
*/
