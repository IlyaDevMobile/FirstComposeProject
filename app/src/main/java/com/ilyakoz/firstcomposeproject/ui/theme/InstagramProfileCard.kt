package com.ilyakoz.firstcomposeproject.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InstagramProfileCard() {
    Card(
        modifier = Modifier.padding(10.dp),
        backgroundColor = MaterialTheme.colors.background,
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(3.dp, MaterialTheme.colors.onBackground)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),

            horizontalArrangement = Arrangement.SpaceEvenly,


            ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Green)
            )
            TwoBox()
            TwoBox()
            TwoBox()


        }
    }

}

@Composable
private fun TwoBox() {
    Box(
        modifier = Modifier
            .size(80.dp)
            .background(Color.Yellow)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Black)
                    .fillMaxWidth()
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Yellow)
                    .fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun PreviewCardLight() {
    FirstComposeProjectTheme(
        darkTheme = false
    ) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun PreviewCardNight() {
    FirstComposeProjectTheme(
        darkTheme = true
    ) {
        InstagramProfileCard()

    }
}