package com.angelaavalos.pdm124

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

object NavBarItems {
    val  NavBarItems = listOf(
        BarItem(
            title = "Primer Parcial",
            image = Icons.Filled.Cookie,
            route = "firstpartial"
        ),
        BarItem(
            title = "Segundo Parcial",
            image = Icons.Filled.Person,
            route = "secondpartial"
        ),
        BarItem(
            title = "Tercer Parcial",
            image = Icons.Filled.Star,
            route = "thirdpartial"
        )
    )
}