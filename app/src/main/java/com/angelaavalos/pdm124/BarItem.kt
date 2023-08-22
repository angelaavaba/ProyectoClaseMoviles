package com.angelaavalos.pdm124

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Esta es una clase de datos para los elementos del BarItem
 */

data class BarItem (
    val title: String,
    val image: ImageVector,
    val route: String
    )
