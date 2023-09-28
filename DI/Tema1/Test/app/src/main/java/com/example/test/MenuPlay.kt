package com.example.test

import android.widget.Toast
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalStdlibApi::class)
@Composable

fun MenuPlay() {
    var context = LocalContext.current

    var entrys by rememberSaveable {
        mutableStateOf(
            arrayOf(
                CheckInfo("No Man's Sky", true, R.drawable.nomanssky),
                CheckInfo("Dragon Fly", false, R.drawable.dragonfly),
                CheckInfo("Ninja Jump", false, R.drawable.descarga),
                CheckInfo("Hill Climb Racing", false, R.drawable.hillclimb)

            )
        )
    }

    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {

        for (entry in entrys) {
            createGameEntry(entry)
        }

    }


    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {
        FloatingActionButton(
            modifier = Modifier.padding(10.dp),
            onClick = {
                var message = "Seleccionados: "


                val selectedTitles = entrys.filter { it.checked }.map { it.title }

                message = when (selectedTitles.size) {
                    0 -> "No se ha seleccionado nada"
                    1 -> message + selectedTitles.first()

                    else -> {
                        for (i in 0..<selectedTitles.size - 1) {
                            message += "${selectedTitles[i]}, "
                        }


                            message.slice(indices = 0..<message.length - 2) + " y ${selectedTitles.last()}"
                    }
                }



                Toast.makeText(context, message, Toast.LENGTH_LONG).show()
            },
        ) {
            Icon(Icons.Filled.Check, "")
        }
    }
}


@Composable
fun createGameEntry(checkInfo: CheckInfo) {

    var checkedState by remember {
        mutableStateOf(checkInfo.checked)
    }

    Spacer(modifier = Modifier.height(height = 20.dp))

    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Image(
            modifier = Modifier
                .width(80.dp)
                .height(80.dp),
            painter = painterResource(id = checkInfo.image),
            contentDescription = ""
        )
        // When clicked change checked to true
        Checkbox(checked = checkedState, onCheckedChange = {
            checkedState = it;
            checkInfo.checked = it
        })
        Text(text = checkInfo.title)
    }
}