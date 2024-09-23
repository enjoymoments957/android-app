package com.example.momentsIndia.pages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.graphics.ImageBitmap
import com.example.momentsIndia.R

data class CompanyInfo(
    val imageBitmap: ImageBitmap,
    val companyName: String
)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val info = CompanyInfo(ImageBitmap.imageResource(R.drawable.moments), "Moments India")
                    LoadingPage(info)
                }
                }
            }
        }
    }

@Composable
fun LoadingPage(info: CompanyInfo) {
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        Image(bitmap = info.imageBitmap, contentDescription = "Artist image")
        Text(info.companyName)
    }
}