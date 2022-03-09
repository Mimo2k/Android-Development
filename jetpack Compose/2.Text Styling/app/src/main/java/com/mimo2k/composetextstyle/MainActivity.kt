package com.mimo2k.composetextstyle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mimo2k.composetextstyle.ui.theme.ComposeTextStyleTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.ubuntu_light, FontWeight.Light), // assigning root id to Font fun
            Font(R.font.ubuntu_medium, FontWeight.Medium),
            Font(R.font.ubuntu_bold, FontWeight.Bold),
            Font(R.font.ubuntu_regular, FontWeight.Normal)
        )
        setContent {
            Box(modifier = Modifier
                .fillMaxSize() // will occupy entire screen
                .background(Color(0xff101010))) // hexadecimal color
             {
                Text(
                    // text = "Jetpack Compose", // text

                    // annotated String
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                 color = Color.Red,
                                fontSize = 50.sp
                            )
                        ){
                            append("J")
                        }
                        append("etpack ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 50.sp
                            )
                        ){
                            append("C")
                        }
                        append("ompose")


                    },
                    color = Color.White, // color of text
                    fontSize = 30.sp, //font size of text
                    fontFamily = fontFamily, // assigning font
                    fontWeight = FontWeight.Bold, // default weight
                    textAlign = TextAlign.Center,  // aligning text
                    fontStyle = FontStyle.Italic, // text Style
                    // textDecoration = TextDecoration.Underline // underline
                )
            }
        }
    }
}
