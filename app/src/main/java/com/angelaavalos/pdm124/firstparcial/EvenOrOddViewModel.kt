package com.angelaavalos.pdm124.firstparcial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EvenOrOddViewModel: ViewModel() {

    var evenOrOddStatus = MutableLiveData("")
    var evenOroddAnimation = MutableLiveData(false)
    fun getResultStatus(): MutableLiveData<String> = evenOrOddStatus

    fun calculateEvenOrOdd(number: Int){
        if (number % 2 == 0) {
            evenOrOddStatus.postValue("El numero es par")
            evenOroddAnimation.postValue(true)
        }else if(number % 2 == 1){
            evenOrOddStatus.postValue("El numero es impar")
            evenOroddAnimation.postValue(false)
        }else{
            evenOrOddStatus.postValue("El numero es 0")
        }


        }

    }


