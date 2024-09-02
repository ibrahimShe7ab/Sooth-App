//package com.example.my.searchBar
//
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.heightIn
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
// import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.unit.dp
//import com.example.my.R
//
//
//@Composable
//fun MySearchBar( ) {
//    var text by remember { mutableStateOf(TextFieldValue("")) }
//    TextField(modifier = Modifier.padding(13.dp).fillMaxWidth().heightIn(56.dp),
//        value = text,
//        onValueChange = { newText ->
//            text = newText
//        },
//
//        leadingIcon = { Icon(imageVector = Icons.Default.Search,"") },
//        placeholder = { Text(text = stringResource(R.string.placeholder_search)) },
//
//        )
//}
//


package com.example.my.searchBar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.my.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySearchBar() {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    TextField(
        modifier = Modifier
            .padding(vertical = 50.dp, horizontal = 15.dp)
            .fillMaxWidth()
            .heightIn(56.dp),

        value = text,
        onValueChange = { newText ->
            text = newText
        },
        leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
        placeholder = { Text(text = stringResource(R.string.placeholder_search)) },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White, // Set the background color to white
            focusedIndicatorColor = Color.Transparent, // Hide the indicator when focused
            unfocusedIndicatorColor = Color.Transparent // Hide the indicator when unfocused
        )
    )
}
