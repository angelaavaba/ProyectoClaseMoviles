package com.angelaavalos.pdm124

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController

@Composable
fun EvenorOddView(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = stringResource(id = R.string.even_or_odd),
            color = MaterialTheme.colors.secondary
        )
    }
}