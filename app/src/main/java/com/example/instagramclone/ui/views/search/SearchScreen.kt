package com.example.instagramclone.ui.views.search

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.instagramclone.ui.views.search.components.ImagesSearchFeed
import com.example.instagramclone.ui.views.search.components.SearchBar
import com.example.instagramclone.ui.views.search.components.items


@Composable
fun SearchScreen(navController: NavController) {
    Column {
        SearchBar()
        ImagesSearchFeed(list = items)
    }

}

@Preview
@Composable
fun SearchPreview() {
    SearchScreen(navController = rememberNavController())
}