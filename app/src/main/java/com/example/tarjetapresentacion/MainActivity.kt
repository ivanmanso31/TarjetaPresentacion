package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(getString(R.string.jos_cebolla),
                        getString(R.string.clown_app),
                        getString(R.string._123456789),
                        getString(R.string.jose_email),
                        getString(R.string.jose_cb) )
                }
            }
        }
    }
}

@Composable
fun GreetingText(name: String, title: String, number: String, email: String, media: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.cumple)
    val imagePhone = painterResource(R.drawable.phone)
    val imageMedia = painterResource(R.drawable.media)
    val imageMail = painterResource(R.drawable.email)

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = modifier
                    .padding(
                        bottom = 30.dp
                    )
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .size(200.dp, 200.dp)
                        .align(CenterHorizontally)
                )
                Text(
                    text = name,
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(CenterHorizontally)
                )
                Text(
                    text = title,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(CenterHorizontally)
                )
            }
    Column(

        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
            .padding(
                bottom = 20.dp,
                start = 105.dp
                )

    ) {
        Row(
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painter = imagePhone,
                contentDescription = null,
                modifier = modifier
                    .size(30.dp, 30.dp)
                    .align(CenterVertically)
            )
            Text(
                text = number,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(CenterVertically)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painter = imageMedia,
                contentDescription = null,
                modifier = modifier
                    .size(30.dp, 30.dp)
                    .align(CenterVertically)
            )
            Text(
                text = media,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(CenterVertically)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painter = imageMail,
                contentDescription = null,
                modifier = modifier
                    .size(30.dp, 30.dp)
                    .align(CenterVertically)
            )
            Text(
                text = email,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(CenterVertically)
            )
        }
    }





}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    TarjetaPresentacionTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            GreetingText("José Cebolla",  "Clown App", "  123456789", "  jose@email", "  #jose_cb" )
        }
    }
}