package com.ilyakoz.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
fun UserInfoPreview(){
    UserInfo(name ="Ilya", age = 12)
}

@Composable
fun UserInfo(name:String, age: Int){
    Column {
        repeat (10){
            Text(text = "Привет $name, тебе $age лет")
        }
    }


}

//@Preview
//@Composable
//fun TenUserInfo(){
//    for (i in 1..10){
//        UserInfo(name = "ilya", age = 12)
//    }
//}
//
//@Preview
//@Composable
//fun ColumnUserInfo(){
//    Column {
//        TenUserInfo()
//    }
//}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello, $name!")
//}
