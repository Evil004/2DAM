package com.example.test

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun ScreenPreferences() {
    var estadoRadio by rememberSaveable { mutableStateOf("") }
    var context = LocalContext.current

    var selection by rememberSaveable { mutableStateOf(5f) }

    Column(modifier = Modifier.fillMaxSize()) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Seleccione una opcion")

        }
        Spacer(modifier = Modifier.height(20.dp))
        RadioButtons(name = estadoRadio, onItemSelected = {
            estadoRadio = it
        })

        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
            CreateSlider(selection) { selection = it }

        }

    }


    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {
        FloatingActionButton(
            modifier = Modifier.padding(10.dp),
            onClick = {
                var text =
                    "Has seleccionado $estadoRadio juego y le has dado una nota de $selection"
                if (estadoRadio.isBlank()) {
                    text = "No has seleccionado ningun juego"
                }
                Toast.makeText(context, text, Toast.LENGTH_LONG).show()
            },
        ) {
            Icon(Icons.Filled.Check, "")
        }
    }


}

@Composable
private fun CreateSlider(selection: Float, onValueChange: (Float) -> Unit) {

    val range = 0f..10f
    val steps = 9;
    Slider(
        modifier = Modifier.width(350.dp),
        value = selection,
        onValueChange = onValueChange,
        valueRange = range,
        steps = steps
    )
}

@Composable
fun RadioButtons(name: String, onItemSelected: (String) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(selected = name == "Angry Birds", onClick = { onItemSelected("Angry Birds") })
        Text(text = "Angry Birds")
    }
    Row(verticalAlignment = Alignment.CenterVertically) {

        RadioButton(selected = name == "Dragon Fly", onClick = { onItemSelected("Dragon Fly") })
        Text(text = "Dragon Fly")
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = name == "Hill Climb Racing",
            onClick = { onItemSelected("Hill Climb Racing") })
        Text(text = "Hill Climb Racing")
    }

    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = name == "Jetpack Joyride",
            onClick = { onItemSelected("Jetpack Joyride") })
        Text(text = "Jetpack Joyride")
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = name == "Subway Surfers",
            onClick = { onItemSelected("Subway Surfers") })
        Text(text = "Subway Surfers")
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(selected = name == "Temple Run", onClick = { onItemSelected("Temple Run") })
        Text(text = "Temple Run")
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = name == "The Simpsons Tapped Out",
            onClick = { onItemSelected("The Simpsons Tapped Out") })
        Text(text = "The Simpsons Tapped Out")
    }


}