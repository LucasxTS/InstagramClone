package com.example.instagramclone.ui.views.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.instagramclone.R
import com.example.instagramclone.models.StoriesModel
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

@Composable
fun HomeScreen(navController: NavController) {
    Column {
        instagramHeader()
        instagramStories(storiesList = list)

    }
}