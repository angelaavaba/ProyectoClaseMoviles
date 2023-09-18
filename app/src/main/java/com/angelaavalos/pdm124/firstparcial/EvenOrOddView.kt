package com.angelaavalos.pdm124

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.angelaavalos.pdm124.firstparcial.EvenOrOddViewModel
import com.angelaavalos.pdm124.ui.theme.utils.ComposeLottieAnimation
import com.angelaavalos.pdm124.ui.theme.utils.ComposeLottieAnimation1

@Composable
fun EvenorOddView(navController: NavController, viewModel: EvenOrOddViewModel) {

    // Esta variable va a almacenar el valor de la caja de texto
    var txtNumber by remember { mutableStateOf("") }
    val evenOrOddStatus by viewModel.getResultStatus().observeAsState("")


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        // Animación basada en el valor de la propiedad evenOroddAnimation del ViewModel
        if (viewModel.evenOroddAnimation.value == true){
            ComposeLottieAnimation(modifier = Modifier.height(200.dp).width(200.dp))
        }else{
            ComposeLottieAnimation1(modifier = Modifier.height(200.dp).width(200.dp))
        }
        Text(
            text = stringResource(id = R.string.even_or_odd),
            color = MaterialTheme.colors.secondary
        )
        TextField(
            value = txtNumber,
            onValueChange = {
                txtNumber = it
                if (txtNumber != "") {
                    // Calcula si el número es par o impar
                    viewModel.calculateEvenOrOdd(txtNumber.toInt())
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Text(text = "${evenOrOddStatus}")


    }
}