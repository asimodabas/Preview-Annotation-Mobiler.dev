package com.asimodabas.previewannotationmedium

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.asimodabas.previewannotationmedium.ui.theme.PreviewAnnotationMediumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Preview(
    showSystemUi = true,
    name = "My Priview",
    showBackground = true,
    widthDp = 125,
    backgroundColor = 0xFFFFFF8D,
    heightDp = 50,
    group = "Profile"
)
@Composable
fun DefaultPreview() {
    Text(text = "Hello World!")
}

@Preview(
    showSystemUi = true,
    name = "My Second Preview",
    showBackground = true,
    widthDp = 125,
    backgroundColor = 0xFF2196F3,
    heightDp = 50,
    group = "Home"
)
@Composable
fun SecondPreview() {
    Text(text = "Hello Android!")
}