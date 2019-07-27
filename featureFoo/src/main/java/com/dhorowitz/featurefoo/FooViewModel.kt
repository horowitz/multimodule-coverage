package com.dhorowitz.featurefoo

class FooViewModel(private val something: String){

    fun doSomething(){
        if(something.isBlank()){
            print("Can't do anything")
        } else {
            print("Doing something")
        }
    }
}