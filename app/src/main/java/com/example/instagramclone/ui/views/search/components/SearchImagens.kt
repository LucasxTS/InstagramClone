package com.example.instagramclone.ui.views.search.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramclone.R

val items = listOf(
    R.drawable.defante,
    R.drawable.caaaalango,
    R.drawable.igao,
    R.drawable.trizpariz,
    R.drawable.zeraofoto,
    R.drawable.defante,
    R.drawable.caaaalango,
    R.drawable.igao,
    R.drawable.trizpariz,
    R.drawable.zeraofoto,
    R.drawable.defante,
    R.drawable.caaaalango,
    R.drawable.igao,
    R.drawable.trizpariz,
    R.drawable.zeraofoto,
    R.drawable.defante,
    R.drawable.caaaalango,
    R.drawable.igao,
    R.drawable.trizpariz,
    R.drawable.zeraofoto,
    R.drawable.defante,
    R.drawable.caaaalango,
    R.drawable.igao,
    R.drawable.trizpariz,
    R.drawable.zeraofoto,
    R.drawable.defante,
    R.drawable.caaaalango,
    R.drawable.igao,
    R.drawable.trizpariz,
    R.drawable.zeraofoto
)

@Composable
fun ImagesSearchFeed(list: List<Int>) {


   LazyVerticalGrid(
       columns = GridCells.Fixed(3),
       contentPadding = PaddingValues(8.dp),
       modifier = Modifier
           .fillMaxWidth()
           .background(Color.Black)
   ) {
    items(items.size) {
        Box(
            modifier = Modifier
                .padding(4.dp)
        ) {
            Image(painter = painterResource(id = list[it]), contentDescription = null)
        }
    }
   }
}


@Preview
@Composable
fun ImageSearchFeedPreview() {
    ImagesSearchFeed(items)
}