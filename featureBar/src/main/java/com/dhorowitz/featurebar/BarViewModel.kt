package com.dhorowitz.featurebar

class BarViewModel(private val condition: Boolean) {
    fun doingSomethingOnBar(){
        if (condition){
            print("some condition")
        } else {
            print("another condition")
        }
    }
}