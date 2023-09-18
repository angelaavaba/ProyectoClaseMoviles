package com.angelaavalos.pdm124

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.angelaavalos.pdm124.firstparcial.FirstPartialTestViewModel

@Composable
fun FirstPartialView(navController: NavController, viewModel: FirstPartialTestViewModel) {
    Column(
        modifier = Modifier.fillMaxSize()

    ) {
        Text(text = stringResource(id = R.string.first_partial),
            color = MaterialTheme.colors.secondary
        )
        Button(
            onClick = { navController.navigate(route = "padelscore") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        ) {
            Text(text = stringResource(id = R.string.padel_score))
        }
        Button(onClick = { navController.navigate(route = "evenorodd")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))
        {
            Text(text = stringResource(id = R.string.even_or_odd))
        }
        Button(onClick = { navController.navigate(route = "randomcard")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))
        {
            Text(text = stringResource(id = R.string.random_card))
        }
        Button(onClick = { navController.navigate(route = "highernumber")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))
        {
            Text(text = stringResource(id = R.string.higher_number))
        }
        Button(onClick = { navController.navigate(route = "nailsalon")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))
        {
            Text(text = stringResource(id = R.string.nail_salon))
        }
        Button(onClick = { navController.navigate(route = "firstpartialtest")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))
        {
            Text(text = stringResource(id = R.string.firstpartialtest))
        }

      
    }
}