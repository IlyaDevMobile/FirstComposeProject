package com.ilyakoz.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ilyakoz.firstcomposeproject.ui.theme.FirstComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@Preview
@Composable
fun InstagramCard(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(1f)
                .background(Color.Blue)

                
        ) {

        }

    }
}

//@Preview
//@Composable
//fun TimesTable() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//    ) {
//        for (i in 1..9) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .weight(1f)
//            ) {
//                for (j in 1..9) {
//                    var color = if ((i+j) % 2 == 0){
//                        Color.Gray
//                    } else{
//                        Color.Red
//
//                    }
//                    Box(
//                        modifier = Modifier
//                            .fillMaxHeight()
//                            .border(width = 1.dp, color = Color.Black)
//                            .weight(1f)
//                            .background(color),
//                        contentAlignment = Alignment.Center
//                    ) {
//
//                        Text(text = "${i * j}")
//
//
//                    }
//                }
//            }
//        }
//
//    }
//
//
//}
