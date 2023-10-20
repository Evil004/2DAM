package com.oscar.elsol

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun MainMenu(snackbarHostState: SnackbarHostState, scope: CoroutineScope) {
    var cards = arrayOf(
        CardObject("Corona solar", R.drawable.corona_solar),
        CardObject("Erupcion Solar", R.drawable.erupcionsolar),
        CardObject("Espiculas", R.drawable.espiculas),
        CardObject("Filamentos", R.drawable.filamentos),
        CardObject("Magnetosfera", R.drawable.magnetosfera),
        CardObject("Mancha Solar", R.drawable.manchasolar)
    )

    LazyVerticalGrid(columns = GridCells.Fixed(2), content = {
        items(cards) { card ->
            GenerateCard(card = card, snackbarHostState = snackbarHostState, scope = scope)
        }
    })
}

@Composable
fun GenerateCard(card: CardObject, snackbarHostState: SnackbarHostState, scope: CoroutineScope) {

    var extended by remember {
        mutableStateOf(false);
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .background(MaterialTheme.colorScheme.background)
            .clickable {
                scope.launch {
                    snackbarHostState.showSnackbar(card.name)
                }
            },

        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .height(150.dp),
                painter = painterResource(id = card.img),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(modifier = Modifier.padding(start = 5.dp), text = card.name)
                IconButton(onClick = { extended = true }) {
                    Icon(Icons.Filled.MoreVert, contentDescription = "")
                }
            }

            DropdownMenu(expanded = extended, onDismissRequest = { extended = false }) {
                DropdownMenuItem(leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.ExitToApp, contentDescription =
                        "Copiar"
                    )
                }, text = {

                    Text(text = "Copiar")
                }, onClick = { extended.not() })


                DropdownMenuItem(leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Delete, contentDescription =
                        "Eliminar"
                    )
                }, text = {

                    Text(text = "Eliminar")
                }, onClick = { /*TODO*/ })
            }
        }


    }
}