 package com.example.my.navigationSection
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.example.my.R

 @Composable
fun NavigationSection(modifier: Modifier = Modifier) {
    var selectedItem by remember { mutableStateOf("Home") }

    Scaffold(
        bottomBar = {
            MyNavBar(
                selectedItem = selectedItem,
                onItemSelected = { item ->
                    selectedItem = item
                }
            )
        }
    ) { innerPadding ->
        // Your screen content goes here. The `innerPadding` can be used to avoid overlapping with the bottom bar.
        // For example:
        // Column(modifier = Modifier.padding(innerPadding)) {
        //     Text(text = "Selected item: $selectedItem")
        // }
    }
}

@Composable
fun MyNavBar(
    selectedItem: String,
    onItemSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        val items = listOf(
            NavigationSectionData(Icons.Filled.Home, stringResource(id = R.string.bottom_navigation_home)),
            NavigationSectionData(Icons.Filled.AccountCircle,  stringResource(id = R.string.bottom_navigation_profile))
        )

        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = item.title == selectedItem,
                onClick = { onItemSelected(item.title) }
            )
        }
    }
}

data class NavigationSectionData(val icon: ImageVector, val title: String)













