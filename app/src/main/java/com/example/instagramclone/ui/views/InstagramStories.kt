package com.example.instagramclone.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramclone.R
import com.example.instagramclone.models.StoriesModel


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

@Composable
fun instagramStories(storiesList: List<StoriesModel>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(start = 10.dp, end = 10.dp)
    ) {
        items(storiesList) { stories ->
            StorieItem(story = stories)
        }
    }
}

@Composable
fun StorieItem(story: StoriesModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(bottom = 8.dp, end = 6.dp)
    ) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .padding(4.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painter = painterResource(id = story.image),
                contentDescription = null,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
            )

        }
        Text(
            text = story.name,
            style = TextStyle(color = Color.White),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
        )
    }
}


@Preview
@Composable
private fun InstagramStoriesPreview() {
    instagramStories(storiesList = list)
}