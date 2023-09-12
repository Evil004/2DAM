package com.example.test

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.ui.theme.DeepPurple40
import com.example.test.ui.theme.Orange90

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.title),
        modifier = modifier,
        color = DeepPurple40,
        fontSize = 70.sp
    )

    Button(
        modifier = modifier.width(220.dp),
        onClick = { /*TODO*/ },
    ) {
        Text(
            text = stringResource(id = R.string.play),
            color = Orange90,
            fontSize = 30.sp
        )

    }
    Button(
        modifier = modifier,
        onClick = { /*TODO*/ },
    ) {
        Text(
            text = stringResource(id = R.string.new_player),
            color = Orange90,
            fontSize = 30.sp
        )

    }
    Button(
        modifier = modifier,
        onClick = { /*TODO*/ },
    ) {
        Text(
            text = stringResource(id = R.string.preferences),
            color = Orange90,
            fontSize = 30.sp
        )

    }
    Button(
        modifier = modifier,
        onClick = { /*TODO*/ },
    ) {
        Text(
            text = stringResource(id = R.string.about),
            color = Orange90,
            fontSize = 30.sp
        )

    }

}