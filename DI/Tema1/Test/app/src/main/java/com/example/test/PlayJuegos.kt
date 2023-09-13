package com.example.test

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.ui.theme.Gray90
import com.example.test.ui.theme.White

@Composable
fun PlayJuegos(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.title),
        modifier = modifier,
        color = Gray90,
        fontSize = 50.sp
    )

    Spacer(modifier = modifier.height(50.dp))

    Button(
        modifier = modifier.width(220.dp),
        onClick = { /*TODO*/ },
        ){

        Text(
            text = stringResource(id = R.string.play),
            color = White,
            fontSize = 20.sp
        )

    }
    Button(
        modifier = modifier.width(220.dp),
        onClick = { /*TODO*/ },
    ) {
        Text(
            text = stringResource(id = R.string.new_player),
            color = White,
            fontSize = 20.sp,
        )

    }
    Button(
        modifier = modifier.width(220.dp),
        onClick = { /*TODO*/ },
    ) {
        Text(
            text = stringResource(id = R.string.preferences),
            color = White,
            fontSize = 20.sp
        )

    }
    Button(
        modifier = modifier.width(220.dp),
        onClick = { /*TODO*/ },
    ) {
        Text(
            text = stringResource(id = R.string.about),
            color = White,
            fontSize = 20.sp
        )

    }

}