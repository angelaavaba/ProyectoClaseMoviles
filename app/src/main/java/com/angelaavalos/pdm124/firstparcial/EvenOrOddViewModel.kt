package com.angelaavalos.pdm124.firstparcial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.angelaavalos.pdm124.R

class EvenOrOddViewModel: ViewModel() {
    // Variable para almacenar el estado (par o impar)
    var evenOrOddStatus = MutableLiveData(0)
    // Variable para controlar la animación
    var evenOroddAnimation = MutableLiveData(false)
    // Función para obtener el estado
    fun getResultStatus(): MutableLiveData<Int> = evenOrOddStatus

    fun calculateEvenOrOdd(number: Int){
        if (number % 2 == 0) {
            // Si el número es par, establece el estado en "R.string.even"
            evenOrOddStatus.postValue(R.string.even)
            // Activa la animación
            evenOroddAnimation.postValue(true)
        }else if(number % 2 == 1){
            // Si el número es impar, establece el estado en "R.string.odd"
            evenOrOddStatus.postValue(R.string.odd)
            // Desactiva la animación
            evenOroddAnimation.postValue(false)
        }


        }

    }


