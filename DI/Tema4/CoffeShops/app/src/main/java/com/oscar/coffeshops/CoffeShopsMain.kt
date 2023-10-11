package com.oscar.coffeshops

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun CoffeShopsMain(navController: NavHostController) {
    val cards = arrayOf(
        CoffeShop("Antico Caffè Greco", "St. Italy, Rome", R.drawable.images1),
        CoffeShop("Coffe Room", "St. Germany, Berlin", R.drawable.images2),
        CoffeShop("Coffe Ibiza", "St. Colon, Madrid", R.drawable.images3),
        CoffeShop("L'Express", "St. Picadilly Circus, London", R.drawable.images4)
    )
    LazyColumn {
        items(cards) {
            GenerateCard(entry = it, navController)
        }
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun GenerateCard(entry: CoffeShop, navController: NavHostController) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp).clickable { navController.navigate("Comments/${entry.name}") }, shape = MaterialTheme.shapes.medium,
        elevation= CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorScheme.secondary
        )
    ) {
        Column(Modifier.fillMaxSize()) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .height(200.dp),
                painter = painterResource(id = entry.img),
                contentDescription = "",
                contentScale = ContentScale.FillWidth
            )

            Text(
                modifier = Modifier.padding(start = 10.dp),
                text = entry.name,
                fontFamily = dancingScript,
                fontSize = 35.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            RatingBar(onClick = {}, stars = 5, rating = 0.0, modifier = Modifier.padding(10.dp))

            Spacer(
                modifier = Modifier
                    .height(30.dp)
                    .padding(start = 10.dp)
            )

            Text(text = entry.address, modifier = Modifier.padding(start = 10.dp), fontSize = 20.sp)

            Divider(Modifier.padding(top = 10.dp))

            Text(
                text = "Reserve", modifier = Modifier
                    .padding(10.dp)
                    .padding(start = 10.dp)
                    .clickable { }, fontWeight = FontWeight.Bold, fontSize = 20.sp,
                color = colorScheme.tertiary
            )
        }

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
    val filledStars = Math.floor(rating).toInt()
    val unfilledStars = (stars - Math.ceil(Math.floor(rating))).toInt()
    Row(modifier = modifier) {

        repeat(filledStars) {
            Icon(imageVector = Icons.Outlined.Star,
                contentDescription = null,
                tint = starsColor,
                modifier = Modifier
                    .clickable { onClick(((it + 1).toInt())) }
            )
            Spacer(modifier = Modifier.width(20.dp))


        }

        repeat(unfilledStars) {
            Icon(
                imageVector = Icons.Outlined.Star,
                contentDescription = null,
                tint = notSelectedStarsColor,
                modifier = Modifier
                    .clickable { onClick(((it + rating + 1).toInt())) }
            )
            Spacer(modifier = Modifier.width(20.dp))
        }
    }
}