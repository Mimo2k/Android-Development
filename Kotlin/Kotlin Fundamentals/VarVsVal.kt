package com.mimo.kotlinpractice

// program to show difference between var and val

fun main()
{
    val num1 = 2   // val stands for value which indicates its property of un-mutable
    var num2 = 3   // var stands for variable which indicates its property of mutable

    // num1 = 3 // it is not possible as num 1 is of val type
    num2 = 2  // its is possible as num2 is of var type

    print(num1)
    print("\n")
    print(num2)

}