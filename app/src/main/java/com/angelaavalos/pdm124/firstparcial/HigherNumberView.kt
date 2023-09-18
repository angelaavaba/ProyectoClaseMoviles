package com.angelaavalos.pdm124.firstparcial

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavController
import androidx.compose.ui.unit.dp
import com.angelaavalos.pdm124.R

@Composable
fun HigherNumberView(navController: NavController, viewModel: HigherNumberViewModel) {
    // Variables para almacenar los valores de entrada de texto
    var txtNumber1 by remember { mutableStateOf("") }
    var txtNumber2 by remember { mutableStateOf("") }
    var txtNumber3 by remember { mutableStateOf("") }

    val higherStatus by viewModel.getHigher().observeAsState(0.0)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = R.string.higher_number),
            color = MaterialTheme.colors.secondary
        )
        TextField(
            value = txtNumber1,
            onValueChange = { newValue ->
                txtNumber1 = newValue
            },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),

            )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = txtNumber2,
            onValueChange = { newValue ->
                txtNumber2 = newValue
            },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),

            )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = txtNumber3,
            onValueChange = { newValue ->
                txtNumber3 = newValue
            },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),

            )
        // Botón para calcular el número mayor
        Button(
            onClick = {
                viewModel.maxOf(txtNumber1.toDouble(),txtNumber2.toDouble(),txtNumber3.toDouble())
                // Actualiza el valor más alto (resultado) del ViewModel
                viewModel.getHigher() },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = stringResource(id = R.string.higher_number))
        }
        Text(text = "${higherStatus}")
    }
}
