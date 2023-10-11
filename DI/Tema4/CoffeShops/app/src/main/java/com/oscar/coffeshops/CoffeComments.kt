package com.oscar.coffeshops

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun CoffeComments(coffeShop: String?) {

    val coffeShopName:String = coffeShop!!;

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
            "Un oasis de tranquilidad en medio del ajetreo de la ciudad."
        )
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = coffeShopName, fontSize = 40.sp, fontFamily = dancingScript)

        LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Fixed(2), content = {
            items(comments) {
                GenerateComment(it)
            }
        })
    }
}

@Composable

fun GenerateComment(comment: String) {

    Card(
        modifier = Modifier.padding(10.dp),
        elevation= CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondary
        )
    ) {
        Text(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxSize(), text = comment, textAlign = TextAlign.Center
        )

    }
}