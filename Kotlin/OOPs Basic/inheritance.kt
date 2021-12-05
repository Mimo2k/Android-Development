package com.example.classes
/*
Inheritance is the property of Oops which allow us to inherit property and function of
parent class inside child class. Existence of multi level inheritance is also possible
in kotlin
 */

/* By default in kotlin everything is final which doesn't allow the class for inheritance
 or a function and variable or value to override so we have to make it open */
open class Car(brandName:String,modelName:String)
{
    open var range: Int = 0 //used open to make this property available for overriding
     var brand:String = brandName
     var model: String = modelName

   open fun details()
    {
        println("Brand Name = $brand")
        println("Model Name = $model")
        println("Range = $range")
    }
    open fun type()
    {
        println("The car is non Ev Type")
    }
}
class EvCar(brandName:String, modelName:String, evRange: Int)
    :Car(brandName,modelName)  // EvCar class extends from Car class or inherit from Car class
{
    override var range:Int = evRange // overriding the range in car class
    fun myRange()
    {
        println("Ev CAR Range = $range")
    }

    override fun type() {    // overriding the type function in parent class
        println("The car is Ev Type")
    }
}

fun main()
{
    val car = Car("Tata","Harrier")
    val ev = EvCar("Tesla","Model S",100)
    car.details()
    car.type()
    ev.details()  // calling details function which is actually not present in EvCar class
    ev.myRange()
    ev.type()
}