package com.angelaavalos.pdm124.firstparcial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HigherNumberViewModel: ViewModel(){

    // Variable para almacenar el número más alto
    var higherStatus = MutableLiveData<Double>()
    // Función para obtener el número más alto
    fun getHigher(): MutableLiveData<Double> = higherStatus



    // Función para calcular el número más alto entre tres números dados
    fun maxOf(number1: Double, number2: Double, number3: Double) {
        if (number1 >= number2 && number1 >= number3)
        // Si number1 es el más alto, establece higherStatus en number1
            higherStatus.postValue(number1)
        else if (number2 >= number1 && number2 >= number3)
        // Si number2 es el más alto, establece higherStatus en number2
            higherStatus.postValue(number2)
        else
        // Si ninguno es más alto que los otros dos, establece higherStatus en number3
            higherStatus.postValue(number3)
    }


}