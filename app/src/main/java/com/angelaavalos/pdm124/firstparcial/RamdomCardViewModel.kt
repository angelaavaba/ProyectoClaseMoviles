package com.angelaavalos.pdm124.firstparcial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.angelaavalos.pdm124.R

class RamdomCardViewModel: ViewModel(){

    // Variable para almacenar el ID de la carta
    var cardId = MutableLiveData(R.drawable.back)
    // Función para obtener el ID de la carta
    fun cardResult(): MutableLiveData<Int> = cardId

    // Función para generar una carta aleatoria
    fun ramdomcard(){
        // Genera un número aleatorio entre 0 y 12
        val rnds = (0..12).random()

        // Asigna el recurso de imagen correspondiente según el número aleatorio
        when(rnds){
            0 -> cardId.postValue(R.drawable.h01)
            1 -> cardId.postValue(R.drawable.h02)
            2 -> cardId.postValue(R.drawable.h03)
            3 -> cardId.postValue(R.drawable.h04)
            4 -> cardId.postValue(R.drawable.h05)
            5 -> cardId.postValue(R.drawable.h06)
            6 -> cardId.postValue(R.drawable.h07)
            7 -> cardId.postValue(R.drawable.h08)
            8 -> cardId.postValue(R.drawable.h09)
            9 -> cardId.postValue(R.drawable.h10)
            10 -> cardId.postValue(R.drawable.hc1j)
            11 -> cardId.postValue(R.drawable.hc2q)
            12 -> cardId.postValue(R.drawable.hc3k)

        }

    }
    // Función para ocultar la carta
    fun hide(){
        cardId.postValue(R.drawable.back)
    }
}