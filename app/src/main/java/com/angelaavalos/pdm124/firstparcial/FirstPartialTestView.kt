package com.angelaavalos.pdm124.firstparcial

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.angelaavalos.pdm124.R


@Composable
fun FirstPartialTestView(navController: NavController, viewModel: FirstPartialTestViewModel) {
    var totalproduct by remember { mutableStateOf("") }
    var actualproduct by remember { mutableStateOf("") }
    var actualProductionValue by remember { mutableStateOf(0) }
    // Obtener el porcentaje de producción del ViewModel
    val percentProductState = viewModel.percent.observeAsState(0.0)
    // Obtener el estado de redScreen del ViewModel
    val redScreen by viewModel.redscreen.observeAsState(false)

    // Obtener el contexto actual de Compose para el pocentaje
    val context = LocalContext.current

    // Diseño de la columna principal
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(if (redScreen) Color.Red else Color.Transparent),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.width(16.dp))
        Image(
            painter = painterResource(id = R.drawable.manzanas),
            contentDescription = "Imagen",
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
        )
        // Sección de producción total
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = stringResource(id = R.string.totalproduction))
                Spacer(modifier = Modifier.width(16.dp))
                TextField(
                    value = totalproduct,
                    onValueChange = { totalproduct = it },
                    modifier = Modifier.width(200.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.width(16.dp))
                // Imagen de manzana que multiplica *80
                Image(
                    painter = painterResource(id = R.drawable.manzana),
                    contentDescription = "",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {
                            val total = totalproduct.toIntOrNull() ?: 0
                            val result = total * 80
                            val message = "$result Manzanas en total"
                            showToast1(context, message)
                        }

                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))

        // Sección de producción actual (similar a la sección de producción total)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = stringResource(id = R.string.actualproduction))
                Spacer(modifier = Modifier.width(16.dp))
                TextField(
                    value = actualproduct,
                    onValueChange = { actualproduct = it },
                    modifier = Modifier.width(200.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    painter = painterResource(id = R.drawable.manzana),
                    contentDescription = "",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {
                            val total = actualproduct.toIntOrNull() ?: 0
                            val result = total * 80
                            val message = "$result Manzanas en total"
                            showToast(context, message)
                        }

                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))

        // Botones de suma para agregar valores a la producción actual
        Row(
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = {
                viewModel.addActualProduction(5)
                val newValue = actualProductionValue + 5
                actualProductionValue = newValue
                actualproduct = newValue.toString()
            }) {
                Text(text = "+5")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Button(onClick = {
                viewModel.addActualProduction(15)
                val newValue = actualProductionValue + 15
                actualProductionValue = newValue
                actualproduct = newValue.toString()
            }) {
                Text(text = "+15")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Button(onClick = {
                viewModel.addActualProduction(30)
                val newValue = actualProductionValue + 30
                actualProductionValue = newValue
                actualproduct = newValue.toString()
            }) {
                Text(text = "+30")
            }
            Spacer(modifier = Modifier.width(12.dp))
            Button(onClick = {
                viewModel.addActualProduction(50)
                val newValue = actualProductionValue + 50
                actualProductionValue = newValue
                actualproduct = newValue.toString()
            }) {
                Text(text = "+50")
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        // Mostrar el porcentaje de producción
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = stringResource(id = R.string.percentage))
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "${percentProductState.value}%")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botón para calcular el porcentaje
        Button(
            onClick = {
                val total = totalproduct.toIntOrNull() ?: 0
                val actual = actualproduct.toIntOrNull() ?: 0
                if (total > 0) {
                    viewModel.updateTotalProduction(total)
                    viewModel.actualProduction.value = actual
                    viewModel.calculatePercentage()
                }
            }
        ) {
            Text(
                text = stringResource(id = R.string.calculatepercentage)
            )
        }


    }

}

// Función para mostrar un toast corto
fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

// Función para mostrar un toast largo
fun showToast1(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}

