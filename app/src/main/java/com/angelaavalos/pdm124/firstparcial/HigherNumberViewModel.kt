package com.angelaavalos.pdm124.firstparcial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HigherNumberViewModel: ViewModel(){

    var higherStatus = MutableLiveData<Double>()
    fun getHigher(): MutableLiveData<Double> = higherStatus



    fun maxOf(number1: Double, number2: Double, number3: Double) {
        if (number1 >= number2 && number1 >= number3)
            higherStatus.postValue(number1)
        else if (number2 >= number1 && number2 >= number3)
            higherStatus.postValue(number2)
        else
            higherStatus.postValue(number3)
    }


}