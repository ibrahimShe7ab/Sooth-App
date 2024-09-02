 package com.example.my
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
 import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
 import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun FavoretCollection(modifier: Modifier = Modifier) {
   LazyHorizontalGrid (
        rows = GridCells.Fixed(2), // Two columns
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(120.dp)
    ) {
        items(favList) { favData ->
            FavoretView(favData = favData)
        }
    }
}

val favList = listOf(
    R.drawable.fc1_short_mantras to R.string.fc1_short_mantras,
    R.drawable.fc2_nature_meditations to R.string.fc2_nature_meditations,
    R.drawable.fc3_stress_and_anxiety to R.string.fc3_stress_and_anxiety,
    R.drawable.fc4_self_massage to R.string.fc4_self_massage,
    R.drawable.fc5_overwhelmed to R.string.fc5_overwhelmed,
    R.drawable.fc6_nightly_wind_down to R.string.fc6_nightly_wind_down,
).map { FavoretCollectionDataClass(it.first, it.second) }



@Composable
fun FavoretView(favData: FavoretCollectionDataClass) {
    Surface(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(0.dp) // Adjust padding between items
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(0.dp)
                .fillMaxWidth() // Adjust the width to fit within grid items
        ) {
            Image(
                painter = painterResource(id = favData.img),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(40.dp).clip(CircleShape)
            )
            Text(
                text = stringResource(id = favData.text),
                modifier = Modifier.padding(start =10.dp) // Adjust padding to fit content
            )
        }
    }
}


data class FavoretCollectionDataClass(
    @DrawableRes val img: Int,
    @StringRes val text: Int
)