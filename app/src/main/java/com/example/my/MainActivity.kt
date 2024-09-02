package com.example.my

 import android.os.Bundle
 import androidx.activity.ComponentActivity
 import androidx.activity.compose.setContent
 import androidx.activity.enableEdgeToEdge
 import androidx.compose.foundation.layout.Column
 import androidx.compose.foundation.layout.fillMaxSize
 import androidx.compose.foundation.layout.fillMaxWidth
 import androidx.compose.runtime.Composable
 import androidx.compose.ui.Modifier
 import com.example.my.HomeSection.HomeSection
 import com.example.my.navigationSection.NavigationSection
 import com.example.my.searchBar.MySearchBar
 import com.example.my.ui.theme.MyTheme

class MainActivity : ComponentActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTheme {
                HomeScreen(modifier = Modifier.fillMaxSize())


        }}}}



@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
 Column( ) {

    MySearchBar()
    HomeSection(
        modifier = Modifier.fillMaxWidth(),
        content = { AlignBodyElement() },
        title = R.string.align_your_body
    )
    HomeSection(
        modifier = Modifier.fillMaxWidth(),
        content = { FavoretCollection() },
        title = R.string.favorite_collections
    )
    NavigationSection()
} }












