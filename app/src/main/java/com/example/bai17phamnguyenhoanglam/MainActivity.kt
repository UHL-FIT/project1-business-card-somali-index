package com.example.bai17phamnguyenhoanglam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bai17phamnguyenhoanglam.ui.theme.Bai17PhamNguyenHoangLamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Bai17PhamNguyenHoangLamTheme() {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    GiaoDienThiep()
                }
            }
        }
    }
}

@Composable
fun GiaoDienThiep(){

    Scaffold(
        bottomBar = {
            Column(horizontalAlignment =Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.padding(10.dp)
                ){
                    Icon(painter = painterResource(R.drawable.phone)
                        , contentDescription = "phone", modifier = Modifier.height(20.dp).width(20.dp))
                    Text(text = "+84(09)93489456", fontSize = 20.sp)
                }
                Row(
                    modifier = Modifier.padding(10.dp)
                ){
                    Icon(painter = painterResource(R.drawable.share)
                        , contentDescription = "share",modifier = Modifier.height(20.dp).width(20.dp))
                    Text(text = "@CCCB", fontSize = 20.sp)
                }
                Row(
                    modifier = Modifier.padding(10.dp)
                ){
                    Icon(painter = painterResource(R.drawable.mail)
                        , contentDescription = "mail",modifier = Modifier.height(20.dp).width(20.dp))
                    Text(text = "lampham@gmail.com", fontSize = 20.sp)
                }
            }
        }
    ) {
        innerPadding->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
            , verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(innerPadding)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
                , horizontalAlignment = Alignment.CenterHorizontally
                , verticalArrangement = Arrangement.Center
            ) {
                Icon(painter = painterResource(R.drawable.android_logo),
                    contentDescription = "android"
                    , modifier = Modifier.height(75.dp).width(75.dp).background(Color.Green).padding(10.dp)
                )
                Text(text = "Lam Pham", fontSize = 30.sp, modifier = Modifier.padding(10.dp))
                Text(text = "Android Developer",modifier = Modifier.padding(10.dp))

            }

        }

    }



}

@Preview(showBackground = true)
@Composable
fun funPreview() {
    Bai17PhamNguyenHoangLamTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier.fillMaxSize()
        ) {
            GiaoDienThiep()
        }
    }
}