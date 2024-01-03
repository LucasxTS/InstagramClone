package com.example.instagramclone.ui.views.search.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar() {
    val cornerRadius = 16.dp
    val shape: Shape = androidx.compose.foundation.shape.RoundedCornerShape(cornerRadius)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(6.dp)
            .clip(shape)
    ) {
        Icon(imageVector = Icons.Default.Search,
            contentDescription = null,
            modifier = Modifier
                .padding(4.dp)
        )
        Text(
            text = "Pesquisar",
            color = Color.Gray,
            modifier = Modifier
                .padding(4.dp)
        )
    }
}

@Preview
@Composable
fun SearchBarPreview() {
    SearchBar()
}