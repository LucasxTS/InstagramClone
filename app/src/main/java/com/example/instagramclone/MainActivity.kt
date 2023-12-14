package com.example.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
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
import com.example.instagramclone.models.StoriesModel
import com.example.instagramclone.ui.theme.InstagramCloneTheme
import com.example.instagramclone.ui.views.instagramHeader
import com.example.instagramclone.ui.views.instagramStories

class MainActivity : ComponentActivity() {

    val list = listOf(
        StoriesModel("Igao", R.drawable.igao),
        StoriesModel("Thiago", R.drawable.mitico),
        StoriesModel("Triz", R.drawable.triz),
        StoriesModel("Caaalango", R.drawable.caaaalango),
        StoriesModel("Zerão", R.drawable.zerao),
        StoriesModel("Defante", R.drawable.defante),
        StoriesModel("Igao", R.drawable.igao),
        StoriesModel("Thiago", R.drawable.mitico),
        StoriesModel("Triz", R.drawable.triz),
        StoriesModel("Caaalango", R.drawable.caaaalango),
        StoriesModel("Zerão", R.drawable.zerao),
        StoriesModel("Defante", R.drawable.defante),

        )
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        instagramHeader()
                        instagramStories(storiesList = list)
                    }

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstagramCloneTheme {

    }
}