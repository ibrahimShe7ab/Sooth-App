package com.example.my

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AlignBodyElement(modifier: Modifier=Modifier

) {
    LazyRow(
        modifier = Modifier
    ) {
        items(bodyItems) { bodyData ->
            BodyView(bodyData = bodyData)
        }
    }
}

val bodyItems = listOf(
    R.drawable.ab4_tabata to R.string.ab4_tabata,
    R.drawable.ab3_stretching to R.string.ab3_stretching,
    R.drawable.ab2_quick_yoga to R.string.ab2_quick_yoga,
    R.drawable.ab2_quick_yoga to R.string.ab2_quick_yoga,
    R.drawable.ab5_hiit to R.string.ab5_hiit,

    R.drawable.ab6_pre_natal_yoga to R.string.ab6_pre_natal_yoga
).map { BodyData(it.first, it.second) }

@Composable
fun BodyView(
    bodyData: BodyData,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = bodyData.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(id = bodyData.name),
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
            style = MaterialTheme.typography.displaySmall,
            fontSize = 18.sp
        )
    }
}

data class BodyData(
    @DrawableRes val img: Int,
    @StringRes val name: Int
)
