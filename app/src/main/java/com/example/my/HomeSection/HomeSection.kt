package com.example.my.HomeSection

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeSection(modifier: Modifier = Modifier,
                content :@Composable () ->Unit,
                @StringRes title:Int,
                ) {

    Column { Text(text = stringResource(id= title).uppercase(),
        Modifier.paddingFromBaseline(top = 40.dp, bottom = 10.dp).padding(10.dp))
     content()
    }

}