package com.mimo.kotlinpractice

fun main()
{
    //Integer Type
    print(" integer Type: \n")
    // Byte
    val byteNumber:Byte = 2     // Explicitly specifying the data type to byte
    print("Check how we Specify above value to Byte : ")
    print(byteNumber)
    print("\n")

    // Short
    val shortNumber:Short = 14     // Explicitly specifying the data type to Short
    print("Check how we Specify above value to Short : ")
    print(shortNumber)
    print("\n")

    // Int
    val intNumber:Short = 716     // Explicitly specifying the data type to Int
    print("Check how we Specify above value to Int : ")
    print(intNumber)
    print("\n")

    // Long

    val longNumber:Long = 7162_7162_7152_2134    // Explicitly specifying the data type to Long
    print("Check how we Specify above value to Long : ")
    print(longNumber)
    print("\n")

    print("\n \n")
    // Float Type
    print("Float Type: \n")

    // float
    // to define a a number as float we can't do it just by providing decimal points but we also have to end number with f
    val floatNumber:Float = 21.264f      // Explicitly specifying the data type to Float
    print("Check how we Specify above value to Float : ")
    print(floatNumber)
    print("\n")

    // Double
    val doubleNumber:Double = 4278.1264        // Explicitly specifying the data type to Double
    print("Check how we Specify above value to Double : ")
    print(doubleNumber)
    print("\n")

 /* Note in Kotlin Inference in generally prefer Int Long and Double as Data Type of Number's

-- If a number is small and it doesn't require as many as long then inference will specify it to int
-- For bigger Integer number it will specify it to long

-- for decimal Number or float number more over inference specify it to Double
  */


}