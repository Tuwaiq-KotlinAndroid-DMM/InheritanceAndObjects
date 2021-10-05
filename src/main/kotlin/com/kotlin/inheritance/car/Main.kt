package com.kotlin.inheritance.car

fun main() {
    val mustang = Car("Ford", "Mustang", 1969)
    mustang.drive()
    mustang.speed(200)

    var civic = Honda()
    civic.drive()
    civic.speed(500)

    var yaris = Toyota()
    yaris.drive()
    yaris.speed(800)

}