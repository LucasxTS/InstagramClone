package com.example.instagramclone.ui.views.home.homecomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramclone.R
import com.example.instagramclone.models.FeedModel

val feed = listOf(
    FeedModel("Igão", R.drawable.igao, "A vida é bela meu pit", R.drawable.igaopodpah),
    FeedModel("Igão", R.drawable.igao, "A vida é bela meu pit", R.drawable.igaopodpah),
    FeedModel("Igão", R.drawable.igao, "A vida é bela meu pit", R.drawable.igaopodpah),
    FeedModel("Igão", R.drawable.igao, "A vida é bela meu pit", R.drawable.igaopodpah),
    FeedModel("Igão", R.drawable.igao, "A vida é bela meu pit", R.drawable.igaopodpah)
)

@Composable
fun InstagramFeed(feedList: List<FeedModel>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
    ) {
        items(feedList) { feedPost ->
            FeedItem(publication = feedPost)
        }
    }
}

@Composable
fun FeedItem(publication: FeedModel) {
    Column(

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.Black)
                .padding(4.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(publication.profileImage),
                contentDescription = null,
                Modifier
                    .clip(CircleShape)
                    .size(24.dp)
            )
            Text(
                text = publication.user,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 4.dp)
            )

            Spacer(
                modifier = Modifier
                    .weight(1f)
            )

            Image(
                painter = painterResource(id = R.drawable.baseline_more_vert_24),
                contentDescription = null
            )
        }
        Image(
            painter = painterResource(publication.feedImage),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(4.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
            )

            Spacer(modifier = Modifier.size(4.dp))

            Image(
                painter = painterResource(id = R.drawable.commenticon2),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .size(24.dp)
            )

            Spacer(modifier = Modifier.size(4.dp))

            Image(
                painter = painterResource(id = R.drawable.sendicon),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .size(20.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = R.drawable.instagramsave),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .size(24.dp)
            )
        }
        Row(
            modifier = Modifier
                .background(Color.Black)
                .padding(4.dp)
                .fillMaxWidth()
        ) {
            Text(
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 16.sp,
                text = publication.user
            )
            Spacer(modifier = Modifier.padding(start = 3.dp))
            Text(
                text = publication.description,
                color = Color.White,
                fontSize = 16.sp
            )
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun InstagramFeedPreview() {
    InstagramFeed(feed)
}