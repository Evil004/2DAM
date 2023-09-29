package com.example.test

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.SelectableChipColors
import androidx.compose.material3.Slider
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import java.lang.Math.ceil
import java.lang.Math.floor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenPreferences() {
    var estadoRadio by rememberSaveable { mutableStateOf("") }
    var context = LocalContext.current

    var selection by rememberSaveable { mutableStateOf(5f) }
    var estadoChip by rememberSaveable { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Seleccione una opcion")

        }
        Spacer(modifier = Modifier.height(20.dp))
        RadioButtons(name = estadoRadio, onItemSelected = {
            estadoRadio = it
        })

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            CreateSlider(selection) { selection = it }

        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            RatingBar(onClick = { selection = it.toFloat() }, rating = selection.toDouble())

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), horizontalArrangement = Arrangement.Center
        ) {

            FilterChip(
                onClick = {
                    estadoChip = "XBOX"; Toast.makeText(
                    context,
                    "Has seleccionado: $estadoChip",
                    Toast.LENGTH_LONG
                ).show()
                },
                label = { Text("XBOX") },
                selected = estadoChip == "XBOX",
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = colorScheme.primary,
                    labelColor = colorScheme.onPrimary
                ),
                leadingIcon = if (estadoChip == "XBOX") {
                    {
                        Icon(
                            imageVector = Icons.Filled.Done,
                            contentDescription = "Done icon",
                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                        )
                    }
                } else {
                    null
                },
            )
            Spacer(modifier = Modifier.width(10.dp))

            FilterChip(
                onClick = {
                    estadoChip = "PC"; Toast.makeText(
                    context,
                    "Has seleccionado: $estadoChip",
                    Toast.LENGTH_LONG
                ).show()
                },
                label = { Text("PC") },
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = colorScheme.primary,
                    labelColor = colorScheme.onPrimary
                ),
                selected = estadoChip == "PC",
                leadingIcon = if (estadoChip == "PC") {
                    {
                        Icon(
                            imageVector = Icons.Filled.Done,
                            contentDescription = "Done icon",
                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                        )
                    }
                } else {
                    null
                },
            )
            Spacer(modifier = Modifier.width(10.dp))

            FilterChip(
                onClick = {
                    estadoChip = "PS5"; Toast.makeText(
                    context,
                    "Has seleccionado: $estadoChip",
                    Toast.LENGTH_LONG
                ).show()
                },
                label = { Text("PS5") },
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = colorScheme.primary,
                    labelColor = colorScheme.onPrimary
                ),
                selected = estadoChip == "PS5",
                leadingIcon = if (estadoChip == "PS5") {
                    {
                        Icon(
                            imageVector = Icons.Filled.Done,
                            contentDescription = "Done icon",
                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                        )
                    }
                } else {
                    null
                },
            )
            Spacer(modifier = Modifier.width(10.dp))

            FilterChip(
                onClick = {
                    estadoChip = "Switch"; Toast.makeText(
                    context,
                    "Has seleccionado: $estadoChip",
                    Toast.LENGTH_LONG
                ).show()
                },
                label = { Text("Switch") },
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = colorScheme.primary,
                    labelColor = colorScheme.onPrimary
                ),
                selected = estadoChip == "Switch",
                leadingIcon = if (estadoChip == "Switch") {
                    {
                        Icon(
                            imageVector = Icons.Filled.Done,
                            contentDescription = "Done icon",
                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                        )
                    }
                } else {
                    null
                },
            )
        }


    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {

        Column (modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

            SmallFloatingActionButton(

                onClick = {
                    var text =
                        "Has seleccionado $estadoRadio juego y le has dado una nota de $selection"
                    if (estadoRadio.isBlank()) {
                        text = "No has seleccionado ningun juego"
                    }
                    Toast.makeText(context, text, Toast.LENGTH_LONG).show()
                },
                containerColor = colorScheme.primary

            ) {
                Icon(Icons.Filled.Star, "")

            }

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

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {

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

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Double = 5.0,
    stars: Int = 10,
    starsColor: Color = Color.Yellow,
    notSelectedStarsColor: Color = Color.Gray,
    onClick: (Int) -> Unit
) {
    val filledStars = floor(rating).toInt()
    val unfilledStars = (stars - ceil(floor(rating))).toInt()
    Row(modifier = modifier) {

        repeat(filledStars) {
            Icon(imageVector = Icons.Outlined.Star,
                contentDescription = null,
                tint = starsColor,
                modifier = Modifier.clickable { onClick(((it + 1).toInt())) })


        }

        repeat(unfilledStars) {
            Icon(
                imageVector = Icons.Outlined.Star,
                contentDescription = null,
                tint = notSelectedStarsColor,
                modifier = Modifier.clickable { onClick(((it + rating + 1).toInt())) }
            )
        }
    }
}