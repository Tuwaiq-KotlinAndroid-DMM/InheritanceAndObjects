package com.kotlin.inheritance.car

open class Car(var brand: String, var model: String, var year: Int) {

    // Class functions
   open fun drive(){
        println("Vrooooommmm")
    }

    open fun speed(maxSpeed:Int){
        println("Max Speed is: " + maxSpeed)
    }
}