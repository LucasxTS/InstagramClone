package com.example.instagramclone.ui.views.search.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramclone.R

@Composable
fun ImagesSearchFeed() {
    val items = listOf(
        R.drawable.defante,
        R.drawable.caaaalango,
        R.drawable.igao,
        R.drawable.trizpariz
    )

   LazyVerticalGrid(
       columns = GridCells.Fixed(3),
       contentPadding = PaddingValues(8.dp),
       modifier = Modifier
           .fillMaxSize()
   ) {
    items(items.size) {
        Box(
            modifier = Modifier
                .padding(2.dp)
                .size(200.dp)
        ) {
            Image(painter = painterResource(id = it), contentDescription = null)
        }
    }
   }
}


@Preview
@Composable
fun ImageSearchFeedPreview() {
    ImagesSearchFeed()
}