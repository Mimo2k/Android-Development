package com.example.classes

fun main()
{
     val num1 = 20
    val num2 = 10
     val myObj = Sum(num1,num2)     // myObj here is object of class Sum
    myObj.printSum()               // calling printSum method directly
}

class Sum constructor(a:Int, b:Int) // constructor is used to initialize the object of a class
{
   private var num1:Int?=null    //  private is access specifier which will not allow main function
   private var num2:Int?=null   //  change value's of num1 and num2 variable
     init {                    // init block is known as initializer block basically used to initialize
         this.num1 = a         // values
         this.num2 = b        // this is generally used to specify var or val declared in this class
     }

 fun printSum()    // this is a method
 {
     println("Sum = ${num1!! + num2!!}")      // !! not null assertion operator
 }
}
