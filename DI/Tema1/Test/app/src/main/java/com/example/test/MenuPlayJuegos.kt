package com.example.test

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.test.ui.theme.CaskaydiaCoveNerdFont
import com.example.test.ui.theme.Gray90
import com.example.test.ui.theme.White


@Composable
fun MenuPlayJuegos(navController: NavHostController) {

    val configuration = LocalConfiguration.current

    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            HorizontalScreen(navController = navController)
        }

        else -> {
            VerticalScreen(navController = navController)

        }
    }

}

@Composable
fun VerticalScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        
        Image(painter = painterResource(R.drawable.logo), contentDescription = "")
        
        Text(
            text = stringResource(id = R.string.title),
            modifier = modifier,
            color = Gray90,
            fontSize = 50.sp,
            fontFamily = CaskaydiaCoveNerdFont
        )

        Spacer(modifier = modifier.height(50.dp))

        Button(
            modifier = modifier.width(220.dp),
            onClick = { navController.navigate("Play") },
        ) {

            Text(
                text = stringResource(id = R.string.play), color = White, fontSize = 20.sp
            )

        }
        Button(
            modifier = modifier.width(220.dp),
            onClick = {
                navController.navigate("NewPlayer")
            },
        ) {
            Text(
                text = stringResource(id = R.string.new_player),
                color = White,
                fontSize = 20.sp,
            )

        }
        Button(
            modifier = modifier.width(220.dp),
            onClick = {navController.navigate("Preferences")},
        ) {
            Text(
                text = stringResource(id = R.string.preferences), color = White, fontSize = 20.sp
            )

        }
        Button(
            modifier = modifier.width(220.dp),
            onClick = { navController.navigate("About") },
        ) {
            Text(
                text = stringResource(id = R.string.about), color = White, fontSize = 20.sp
            )

        }
    }
}


@Composable
fun HorizontalScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(R.drawable.logo), modifier = Modifier.height(120.dp), contentDescription = "")

        Text(
            text = stringResource(id = R.string.title),
            modifier = modifier,
            color = Gray90,
            fontSize = 50.sp,
            fontFamily = CaskaydiaCoveNerdFont
        )


        Row {
            Button(
                modifier = modifier.width(220.dp),
                onClick = { navController.navigate("Play") },
            ) {

                Text(
                    text = stringResource(id = R.string.play), color = White, fontSize = 20.sp
                )

            }
            Spacer(modifier = modifier.width(20.dp))
            Button(
                modifier = modifier.width(220.dp),
                onClick = {
                          navController.navigate("NewPlayer")
                },
            ) {
                Text(
                    text = stringResource(id = R.string.new_player),
                    color = White,
                    fontSize = 20.sp,
                )

            }
        }

        Spacer(modifier = modifier.height(20.dp))

        Row {
            Button(
                modifier = modifier.width(220.dp),
                onClick = {navController.navigate("Preferences")},
            ) {
                Text(
                    text = stringResource(id = R.string.preferences),
                    color = White,
                    fontSize = 20.sp
                )

            }
            Spacer(modifier = modifier.width(20.dp))

            Button(
                modifier = modifier.width(220.dp),
                onClick = { navController.navigate("About") },
            ) {
                Text(
                    text = stringResource(id = R.string.about), color = White, fontSize = 20.sp
                )

            }
        }


    }
}