package com.angelaavalos.pdm124.firstparcial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EvenOrOddViewModel: ViewModel() {

    var evenOrOddStatus = MutableLiveData<String>()
    fun getResultStatus(): MutableLiveData<String> = evenOrOddStatus

    fun calculateEvenOrOdd(number: Int){
        if (number % 2 == 0) {
            evenOrOddStatus.postValue("El numero es par")
        }else if(number % 2 == 0){
            evenOrOddStatus.postValue("El numero es impar")
        }else{
            evenOrOddStatus.postValue("El numero es 0")
        }


        }

    }


