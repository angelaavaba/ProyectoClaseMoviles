package com.angelaavalos.pdm124.firstparcial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.angelaavalos.pdm124.R

@Composable
fun RandomCardView(navController: NavController, viewModel: RamdomCardViewModel){
    // Observa el ID de la carta actual obtenido del ViewModel
    val cardId by viewModel.cardResult().observeAsState(R.drawable.back)
    
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    
    ) {
        Image(painter = painterResource(id = cardId),
            contentDescription = "",
            modifier = Modifier
                .height(450.dp)
                .width(450.dp)

        )
        Row {
            // Botón para ocultar la carta
            Button(onClick = {viewModel.hide()}, modifier = Modifier.padding(8.dp)) {
                Text(text = stringResource(id = R.string.hide))
            }

            // Botón para generar una carta aleatoria
            Button(onClick = {viewModel.ramdomcard()},modifier = Modifier.padding(8.dp)) {
                Text(text = stringResource(id = R.string.random))
            }
        }



    }
    
    
}