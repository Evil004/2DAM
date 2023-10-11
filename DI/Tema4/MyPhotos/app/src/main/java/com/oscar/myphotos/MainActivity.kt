package com.oscar.myphotos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.oscar.myphotos.ui.theme.MyPhotosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPhotosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main("Android")
                }
            }
        }
    }
}

@Composable
fun Main(name: String, modifier: Modifier = Modifier) {

    var images = arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,

    )

    var selectedImage: Int? by remember {mutableStateOf(null)}

    Column (Modifier.fillMaxSize()) {
        LazyRow(content = {
            items(images){ image ->
                Image(painter = painterResource(id = image), contentDescription = "",
                    modifier = Modifier.clickable { selectedImage = image  })
            }
        })

        Row (Modifier.fillMaxSize().padding(10.dp)) {
            selectedImage?.let { painterResource(id = it) }?.let { Image(modifier = Modifier.fillMaxSize(), painter = it, contentDescription = "") }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyPhotosTheme {
        Main("Android")
    }
}