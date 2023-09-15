package com.example.test

import android.widget.EditText
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuNewPlayer() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Spacer(modifier = Modifier.height(13.dp))

        Row(
        ) {
            Image(
                modifier = Modifier.height(70.dp),
                painter = painterResource(id = R.drawable.account),
                contentDescription = ""
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column {

                TextField(value = "", onValueChange = {}, label = { Text(text = "Nombre") })
                Spacer(modifier = Modifier.height(20.dp))

                TextField(value = "", onValueChange = {}, label = { Text(text = "Apellidos") })
                Spacer(modifier = Modifier.height(20.dp))

                TextField(value = "", onValueChange = {}, label = { Text(text = "Nickname") })
                Spacer(modifier = Modifier.height(20.dp))


            }
        }


        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.height(100.dp),
                painter = painterResource(R.drawable.android), contentDescription = ""
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Change")
            }
        }

        Spacer(modifier = Modifier.height(25.dp))

        Row(
        ) {
            Image(
                modifier = Modifier.height(70.dp),
                painter = painterResource(id = R.drawable.camera),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(20.dp))


            TextField(value = "", onValueChange = {}, label = { Text(text = "Teléfono") })

        }

        Row(
        ) {
            Image(
                modifier = Modifier.height(70.dp),
                painter = painterResource(id = R.drawable.email),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(20.dp))


            TextField(value = "", onValueChange = {}, label = { Text(text = "Email") })

        }
    }
}