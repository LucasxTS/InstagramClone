package com.example.instagramclone.ui.views.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.instagramclone.R
import com.example.instagramclone.models.FeedModel
import com.example.instagramclone.models.StoriesModel
import com.example.instagramclone.ui.views.home.homecomponents.InstagramFeed
import com.example.instagramclone.ui.views.home.homecomponents.instagramHeader
import com.example.instagramclone.ui.views.home.homecomponents.instagramStories

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

val feed = listOf(
    FeedModel("Igão", R.drawable.igao, "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum", R.drawable.igaopodpah),
    FeedModel("Triz", R.drawable.triz, "A vida é bela meu pit", R.drawable.trizpariz),
    FeedModel("Calango", R.drawable.caaaalango, "A vida é bela meu pit", R.drawable.calangocanal),
    FeedModel("Mitico", R.drawable.mitico, "A vida é bela meu pit", R.drawable.miticofoto),
    FeedModel("Zerao", R.drawable.zerao, "A vida é bela meu pit", R.drawable.zeraofoto)
)


@Composable
fun HomeScreen(navController: NavController) {
    Column {
        instagramHeader()
        instagramStories(storiesList = list)
        InstagramFeed(feedList = feed)
    }
}