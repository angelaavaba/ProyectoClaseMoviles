package com.angelaavalos.pdm124.firstparcial


import android.widget.Toast
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstPartialTestViewModel {

    // Variables para almacenar la producción total, producción actual, porcentaje y estado de la pantalla roja
    var totalProduction = MutableLiveData(0)
    var actualProduction = MutableLiveData(0)
    var percent = MutableLiveData(0.0)
    var redscreen = MutableLiveData(false)

    // Inicializa los valores de producción total y producción actual en 0
    init {
        totalProduction.value = 0
        actualProduction.value = 0
    }

    // Función para actualizar la producción total
    fun updateTotalProduction(total: Int) {
        totalProduction.value = total
    }

    // Función para agregar producción actual y calcular el porcentaje
    fun addActualProduction(lot: Int) {
        // Obtiene el valor actual de producción
        val currentProduction = actualProduction.value ?:0
        // Suma el valor del lote al valor actual
        actualProduction.value = currentProduction + lot
        // Calcula el porcentaje de producción
        calculatePercentage()
    }

    // Función para calcular el porcentaje de producción y actualizar la pantalla roja según ciertos criterios
    fun calculatePercentage() {
        val total = totalProduction.value ?: 1
        // Obtiene el valor total de producción o establece 1 como valor predeterminado si es nulo o 0
        val actual = actualProduction.value ?: 0
        // Calcula el porcentaje como (producción actual / producción total) * 100
        val percentage = (actual.toDouble() / total.toDouble()) * 100
        // Actualiza el valor del porcentaje en el LiveData
        percent.value = percentage
        // Actualiza el estado de la pantalla roja si el porcentaje es mayor o igual al 70%
        redscreen.value = percentage >= 70.0
    }

}











