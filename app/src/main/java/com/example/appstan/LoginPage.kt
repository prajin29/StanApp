package com.example.appstan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.appstan.ui.theme.AppStanTheme



class LoginPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppStanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                }
            }
        }
    }
}

@Composable
fun Login(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color.White)
    ) {

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-265).dp,
                    y = (-96).dp)
                .requiredWidth(width = 1000.dp)
                .requiredHeight(height = 1097.dp)
                .background(color = Color(0xffd6a1db)))
        Text(
            text = "Login Page",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 0.94.em,
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.5.dp,
                    y = 106.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Image(
            painter = painterResource(id = R.drawable.log),
            contentDescription = "log 1",
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.5.dp,
                    y = (-59).dp)
                .requiredWidth(width = 257.dp)
                .requiredHeight(height = 224.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.dp,
                    y = 143.dp)
                .requiredWidth(width = 314.dp)
                .requiredHeight(height = 46.dp)
                .clip(shape = RoundedCornerShape(10.dp)))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 0.dp,
                    y = 250.dp)
                .requiredWidth(width = 314.dp)
                .requiredHeight(height = 46.dp)
                .clip(shape = RoundedCornerShape(10.dp)))
        Text(
            text = "Enter Email or Phone",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 3.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .offset(x = 23.dp,
                    y = 105.dp)
                .requiredWidth(width = 102.dp)
                .requiredHeight(height = 30.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Create Password",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 3.em,
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .offset(x = 23.dp,
                    y = 212.dp)
                .requiredWidth(width = 82.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Button(
            onClick = { },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff610c9f)),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 1.dp,
                    y = 325.5.dp)
                .requiredWidth(width = 200.dp)
                .requiredHeight(height = 43.dp)){ }
        Text(
            text = "Login",
            color = Color.White,
            textAlign = TextAlign.Center,
            lineHeight = 0.9.em,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 1.5.dp,
                    y = 324.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))



    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun LoginPreview() {
    Login(Modifier)
}