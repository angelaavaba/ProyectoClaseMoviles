package com.angelaavalos.pdm124.firstparcial

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun SalonView(navController: NavController, viewModel: SalonViewModel) {

    val nailCountResult by viewModel.getNailsCount().observeAsState(0)
    val pedicureCountResult by viewModel.getPedicureCount().observeAsState(0)
    val pedicureNailCountResult by viewModel.getNailsPedicureCount().observeAsState(0)
    val totalCostResult by viewModel.getTotalCost().observeAsState(0)


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = com.angelaavalos.pdm124.R.drawable.nail),
                    contentDescription = "",
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .clickable { viewModel.incrementNails() }
                )
                Text(text = "${nailCountResult}")
            }

            Spacer(modifier = Modifier.width(30.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = com.angelaavalos.pdm124.R.drawable.pedicure),
                    contentDescription = "",
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .clickable { viewModel.incrementPedicure() }
                )
                Text(text = "${pedicureCountResult}")
            }

            Spacer(modifier = Modifier.width(30.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = com.angelaavalos.pdm124.R.drawable.pedicurenail),
                    contentDescription = "",
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .clickable { viewModel.incrementNailsPedicure() }
                )
                Text(text = "${pedicureNailCountResult}")
            }
        }
            Text(text = "Total: $totalCostResult",
                modifier = Modifier.padding(top = 16.dp),
                style = TextStyle(fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)
            )
    }
}