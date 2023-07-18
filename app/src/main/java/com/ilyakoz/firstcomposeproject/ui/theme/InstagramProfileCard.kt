package com.ilyakoz.firstcomposeproject.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ilyakoz.firstcomposeproject.R

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
            Image(
                modifier = Modifier.clip(CircleShape),
                contentDescription = null,
                painter = painterResource(id = R.drawable.ic_instagram),
            )
            UserStatistics(title = "Posts", value = "6,970")
            UserStatistics(title = "Followers", value = "436M")
            UserStatistics(title = "Following", value = "76")


        }
    }

}

@Composable
private fun UserStatistics(
    title: String,
    value: String
) {

    Column(
        modifier = Modifier
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(
            text = value,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic,
            fontSize = 24.sp
        )
        Text(
            text = title,
            fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold

        )
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