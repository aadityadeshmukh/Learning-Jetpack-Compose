package com.example.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    MaterialTheme {
        val Typography = MaterialTheme.typography
        Column(
            modifier = Modifier.padding(16.dp)
        ){
            Image(painter = painterResource(id = R.drawable.oreti),
                contentDescription = null,
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.height(16.dp))

            Text("A day wandering through the sandhills " +
                    "in Shark Fin Cove, and a few of the " +
                    "sights I saw", style = Typography.h6, maxLines = 2, overflow = TextOverflow.Ellipsis)
            Text("Davenport California", style = Typography.body2)
            Text("December, 2021", style = Typography.body2)
        }
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
