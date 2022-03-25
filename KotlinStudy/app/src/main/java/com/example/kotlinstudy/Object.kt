package com.example.kotlinstudy

//Singleton Pattern
object CarFact
{
    val cars = mutableListOf<Car>()

    fun makeCar(hp : Int) : Car {
        val car = Car(hp)
        cars.add(car)
        return car
    }
}

data class Car(val hp : Int)

fun main()
{
    val car = CarFact.makeCar(10)
    val car2 = CarFact.makeCar(200)

    println(car)
    println(car2)
    println(CarFact.cars.size.toString())
}