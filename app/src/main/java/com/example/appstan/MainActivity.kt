package com.example.appstan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.appstan.ui.theme.AppStanTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppStanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Entrance()

                }
            }
        }
    }
}

@Composable
fun Entrance(modifier: Modifier = Modifier) {
    val context = LocalContext.current
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
            text = "Sign  Up ",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 0.9.em,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 622.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Login",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 0.9.em,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.5.dp, y = 675.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
                .clickable {
                    val intent = Intent(context, LoginPage::class.java)
                    context.startActivity(intent)
                }
        )


        Text(
            text = "Precision at your \nFingertips",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 0.94.em,
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.5.dp,
                    y = 165.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Image(
            painter = painterResource(id = R.drawable.cuate),
            contentDescription = "cuate 1",
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = 4.5.dp,
                    y = 0.dp)
                .requiredWidth(width = 257.dp)
                .requiredHeight(height = 224.dp))
    }
}


@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun EntrancePreview() {
    Entrance(Modifier)
}