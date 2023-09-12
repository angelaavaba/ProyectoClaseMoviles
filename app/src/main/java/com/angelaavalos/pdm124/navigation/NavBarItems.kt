package com.angelaavalos.pdm124.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.angelaavalos.pdm124.R

object NavBarItems {
    val  NavBarItems = listOf(
        BarItem(
            title = R.string.first_partial,
            image = Icons.Filled.Cookie,
            route = "firstpartial"
        ),
        BarItem(
            title = R.string.second_partial,
            image = Icons.Filled.Person,
            route = "secondpartial"
        ),
        BarItem(
            title = R.string.third_partial,
            image = Icons.Filled.Star,
            route = "thirdpartial"
        )

    )
}