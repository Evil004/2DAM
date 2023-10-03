package com.example.test

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MenuAbout() {

    var context = LocalContext.current


    var entrys = arrayOf(
        UserDataClass(R.drawable.image1, "María Mata", 2014),
        UserDataClass(R.drawable.image2, "Antonio sanz", 2056),
        UserDataClass(R.drawable.image3, "Carlos Pérez", 5231),
        UserDataClass(R.drawable.image4, "Beatriz Martos", 1892),
        UserDataClass(R.drawable.image5, "Juan", 3256)
    )


    LazyColumn {
        items(entrys) {
            CreateEntry(data = it) {
                Toast.makeText(context, it.name, Toast.LENGTH_LONG).show()
            }
        }
    }
}

@Composable
fun CreateEntry(data: UserDataClass, onClick: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, top = 20.dp)
            .clickable(onClick = onClick),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.width(200.dp),
            painter = painterResource(id = data.image),
            contentDescription = ""
        )
        Column(Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = data.name, fontWeight = FontWeight.Bold)
            Text(text = "Puntos: ${data.points}")
        }
    }
}
