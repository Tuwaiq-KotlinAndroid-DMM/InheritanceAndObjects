package com.kotlin.inheritance.car

class Toyota : Car("Toyota", "Yaris", 2020) {
    override fun drive(){
        println("We are driving $brand now")
    }
    override fun speed(maxSpeed: Int){
        println("$model Max Speed is: " + maxSpeed)
    }
}