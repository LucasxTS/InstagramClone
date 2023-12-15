package com.example.instagramclone.ui.views.home.homecomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramclone.R


@Composable
fun instagramHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            style = TextStyle(fontSize = 24.sp),
            text = "Instagram",
            color = Color.White,
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterVertically)
        )

        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.heart),
            contentDescription = "imageView",
            modifier = Modifier
                .size(32.dp)
        )

        Spacer(modifier = Modifier
            .size(18.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.icon_dm),
            contentDescription = "imageView",
            modifier = Modifier
                .size(32.dp)
        )
    }
}

@Preview
@Composable
private fun HeaderPreview() {
    instagramHeader()
}