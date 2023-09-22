package com.example.test

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuNewPlayer() {

    var nombre by rememberSaveable { mutableStateOf("") }
    var apellido by rememberSaveable { mutableStateOf("") }
    var nickname by rememberSaveable { mutableStateOf("") }
    var telefono by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }

    var nameError by rememberSaveable { mutableStateOf(false) }
    val nameMessage = if (nameError) stringResource(id = R.string.name_error) else "* Obligario"
    var nicknameError by rememberSaveable { mutableStateOf(false) }
    val nicknameMessage =
        if (nicknameError) stringResource(id = R.string.nickname_error) else "* Obligario"

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

                TextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = colorScheme.tertiary,
                    containerColor = colorScheme.primaryContainer
                ),
                    shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp),
                    value = nombre,
                    onValueChange = { nombre = it },
                    label = { Text(text = stringResource(R.string.name)) })


                Text(
                    modifier = Modifier.height(30.dp),
                    text = nameMessage,
                    color = if (nameError) colorScheme.tertiary else colorScheme.onSurface
                )

                TextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = colorScheme.tertiary,
                    containerColor = colorScheme.primaryContainer
                ),
                    shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp),
                    value = apellido,
                    onValueChange = { apellido = it },
                    label = { Text(text = stringResource(R.string.surname)) })
                Spacer(modifier = Modifier.height(20.dp))


                TextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = colorScheme.tertiary,
                    containerColor = colorScheme.primaryContainer
                ),
                    shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp),
                    value = nickname,
                    onValueChange = { nickname = it },
                    label = { Text(text = stringResource(R.string.nickname)) })
                Text(
                    modifier = Modifier.height(30.dp),
                    text = nicknameMessage,
                    color = if (nicknameError) colorScheme.tertiary else colorScheme.onSurface
                )


            }
        }


        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.height(100.dp),
                painter = painterResource(R.drawable.android), contentDescription = ""
            )
            Button(
                onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                    containerColor = colorScheme.tertiary
                )
            ) {
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


            TextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = colorScheme.tertiary,
                containerColor = colorScheme.primaryContainer
            ),
                shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp),
                value = telefono,
                onValueChange = { telefono = it },
                label = { Text(text = stringResource(R.string.phone)) })

        }

        Row(
        ) {
            Image(
                modifier = Modifier.height(70.dp),
                painter = painterResource(id = R.drawable.email),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(20.dp))


            TextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = colorScheme.tertiary,
                containerColor = colorScheme.primaryContainer
            ),
                shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp),
                value = email,
                onValueChange = { email = it },
                label = { Text(text = stringResource(R.string.email)) })

        }

        Button(onClick = {

            nameError = nombre.isBlank()
            nicknameError = nickname.isBlank()

        }) {
            Text(text = stringResource(id = R.string.send))
        }
    }
}

