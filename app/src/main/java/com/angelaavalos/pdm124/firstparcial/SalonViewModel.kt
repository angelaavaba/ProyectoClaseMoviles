package com.angelaavalos.pdm124.firstparcial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SalonViewModel : ViewModel() {
    private val pedicureCount = MutableLiveData(0)
    private val nailsCount = MutableLiveData(0)
    private val nailsPedicureCount = MutableLiveData(0)

    // LiveData para el resultado final
    private val totalCost = MutableLiveData(0)

    fun getPedicureCount(): LiveData<Int> = pedicureCount
    fun getNailsCount(): LiveData<Int> = nailsCount
    fun getNailsPedicureCount(): LiveData<Int> = nailsPedicureCount
    fun getTotalCost(): LiveData<Int> = totalCost

    fun incrementPedicure() {
        val currentCount = pedicureCount.value ?: 0
        pedicureCount.value = currentCount + 1
        calculateTotalCost()
    }

    fun incrementNails() {
        val currentCount = nailsCount.value ?: 0
        nailsCount.value = currentCount + 1
        calculateTotalCost()
    }

    fun incrementNailsPedicure() {
        val currentCount = nailsPedicureCount.value ?: 0
        nailsPedicureCount.value = currentCount + 1
        calculateTotalCost()
    }

    private fun calculateTotalCost() {
        val pedicureCost = (pedicureCount.value ?: 0) * 350
        val nailsCost = (nailsCount.value ?: 0) * 450
        val nailsPedicureCost = (nailsPedicureCount.value ?: 0) * 900

        // Sumar los costos individuales para obtener el total
        val total = pedicureCost + nailsCost + nailsPedicureCost
        totalCost.value = total
    }
}
