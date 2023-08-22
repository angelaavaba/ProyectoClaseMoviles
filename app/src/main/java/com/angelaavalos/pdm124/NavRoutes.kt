package com.angelaavalos.pdm124

/**
 * Lista de rutas a las cuales se puede navegar dentro de la aplicación
 */

sealed class NavRoutes (val route: String){
    object firstpartial : NavRoutes("firstpartial")
    object secondpartial : NavRoutes("secondpartial")
    object thirdpartial : NavRoutes("thirdpartial")
}