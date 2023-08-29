package com.angelaavalos.pdm124.navigation

/**
 * Lista de rutas a las cuales se puede navegar dentro de la aplicación
 */

sealed class NavRoutes (val route: String){
    object firstpartial : NavRoutes("firstpartial")
    object secondpartial : NavRoutes("secondpartial")
    object thirdpartial : NavRoutes("thirdpartial")
    object padelscore : NavRoutes("padelscore")
    object evenorodd : NavRoutes("evenorodd")
}