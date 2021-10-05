package com.kotlin.inheritance.car

class Honda : Car("Honda", "Civic", 2000) {
    override fun drive(){
        println("Vrooooommmm " + model)
    }

   override fun speed(maxSpeed:Int){
        println("Cvic Speed is: " + maxSpeed +  "Model" + model)
    }
}