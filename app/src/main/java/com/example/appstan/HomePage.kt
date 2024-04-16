package com.example.appstan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.appstan.ui.theme.AppStanTheme


class HomePage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppStanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeWithBottomNavBar()
                }
            }
        }
    }
}
@Composable
fun HomeWithBottomNavBar() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HomeContent()
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigationBar()
    }
}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xfff1eaff))
    ) {
        Text(
            text = "Hi Ajay.. ",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 0.92.em,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .offset(
                    x = 0.dp,
                    y = (-294).dp
                )
                .requiredWidth(width = 150.dp))
        Text(
            text = "Please hold the Device",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 0.92.em,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .offset(
                    x = 0.dp,
                    y = (-229).dp
                )
                .requiredWidth(width = 296.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(
                    x = 1.5.dp,
                    y = (-51).dp
                )
                .requiredWidth(width = 329.dp)
                .requiredHeight(height = 248.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .background(color = Color(0xffd6a1db).copy(alpha = 0.45f)))
        Text(
            text = "SYS\nmmHg",
            color = Color.Black,
            style = TextStyle(
            ),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(
                    x = (-126).dp,
                    y = (-74).dp
                )
                .requiredWidth(width = 34.dp)
                .requiredHeight(height = 48.dp))
        Text(
            text = "DIA\nmmHg",
            color = Color.Black,
            style = TextStyle(
            ),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(
                    x = (-126).dp,
                    y = 11.dp
                )
                .requiredWidth(width = 34.dp)
                .requiredHeight(height = 48.dp))
        Text(
            text = "Blood Pressure",
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 238.5.dp
                ))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 18.dp,
                    y = 493.dp
                )
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 157.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .background(color = Color(0xffd6a1db).copy(alpha = 0.45f)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 186.dp,
                    y = 493.dp
                )
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 157.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .background(color = Color(0xffd6a1db).copy(alpha = 0.45f)))
        Text(
            text = "mg/dL",
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(
                    x = (-44).dp,
                    y = 211.dp
                )
                .requiredWidth(width = 64.dp)
                .requiredHeight(height = 16.dp))
        Text(
            text = "bpm",
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(
                    x = 126.5.dp,
                    y = 214.dp
                )
                .requiredWidth(width = 41.dp)
                .requiredHeight(height = 18.dp))
        Text(
            text = "Sugar Level",
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(
                    x = (-82).dp,
                    y = 114.5.dp
                ))
        Text(
            text = "Heart Rate",
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(
                    x = 94.5.dp,
                    y = 114.5.dp
                ))
        Image(
            painter = painterResource(id = R.drawable.doc),
            contentDescription = "image 3",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 266.dp,
                    y = (-9).dp
                )
                .requiredWidth(width = 166.dp)
                .requiredHeight(height = 160.dp))
    }
}
@Composable
fun BottomNavigationBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(color = Color.White),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        BottomNavItem(icon = Icons.Default.Home)
        BottomNavItem(icon = Icons.Default.Menu)
        BottomNavItem(icon = Icons.Default.Settings)
        BottomNavItem(icon = Icons.Default.Person)
    }
}

@Composable
fun BottomNavItem(icon: ImageVector) {
    IconButton(onClick = {}) {
        Icon(
            imageVector = icon,
            contentDescription = null
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun HomePreview() {
    HomeWithBottomNavBar()
}


