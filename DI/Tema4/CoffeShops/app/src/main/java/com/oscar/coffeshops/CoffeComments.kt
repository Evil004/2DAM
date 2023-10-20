package com.oscar.coffeshops

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun CoffeComments(coffeShop: String?) {

    val coffeShopName: String = coffeShop!!;

    val comments =
        arrayOf(
            "¡Excelente café y ambiente acogedor!",
            "El servicio es rápido y amigable.",
            "Las bebidas son deliciosas, especialmente el latte.",
            "Siempre es un placer venir aquí a trabajar.",
            "El pastel de zanahoria es mi favorito, ¡altamente recomendado!",
            "Un lugar perfecto para reunirse con amigos y relajarse.",
            "La música de fondo crea una atmósfera relajante.",
            "El personal siempre está dispuesto a ayudar.",
            "Me encanta la decoración, es muy acogedora.",
            "Un oasis de tranquilidad en medio del ajetreo de la ciudad.",
            "El café aquí es simplemente increíble, nunca puedo tener suficiente.",
            "El personal es amable y siempre te recibe con una sonrisa.",
            "Los pasteles recién horneados son irresistibles.",
            "Una joya escondida en la ciudad, definitivamente regresaré.",
            "Las opciones de desayuno son deliciosas y variadas.",
            "Un lugar tranquilo para disfrutar de un buen libro.",
            "Me siento como en casa cada vez que vengo aquí.",
            "El aroma del café recién hecho llena el lugar.",
            "Un rincón perfecto para la conversación y la reflexión.",
            "Este lugar hace que mis mañanas sean mucho mejores."
        )

    Column(modifier = Modifier.fillMaxSize().background(color = colorScheme.secondary), horizontalAlignment = Alignment.CenterHorizontally,) {

        val corutinesScope = rememberCoroutineScope()

        Text(text = coffeShopName, fontSize = 40.sp, fontFamily = dancingScript)

        val rvState = rememberLazyStaggeredGridState()

        LazyVerticalStaggeredGrid(
            state = rvState,
            modifier = Modifier.weight(1f),
            columns = StaggeredGridCells.Fixed(2),
            content = {
                items(comments) {
                    GenerateComment(it)
                }
            })

        val showButton by remember {
            derivedStateOf {
                rvState.firstVisibleItemIndex > 0
            }
        }
        if (showButton) {
            Button(onClick = {
                corutinesScope.launch {
                    rvState.animateScrollToItem(0)
                }
            }) {
                Text(text = "Añadir comentario")
            }
        }

    }
}

@Composable

fun GenerateComment(comment: String) {

    Card(
        modifier = Modifier.padding(10.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorScheme.primary
        )
    ) {
        Text(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxSize(), text = comment, textAlign = TextAlign.Center
        )

    }
}