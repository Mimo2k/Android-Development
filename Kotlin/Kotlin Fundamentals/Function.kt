package com.mimo.kotlinpractice

fun main()
{

    // addition function
    val numOne = 2
    val numTwo = 10
    val result = sum(numOne,numTwo)   // calling sum and  passing two arguments numOne and numTwo
    println(" Sum of $numOne and $numTwo is $result")
}

// function for addition
// below a and b are known as parameters
fun sum(a:Int, b:Int):Int{          // fun is used to create function named as sum
    return (a+b)                    // this value will be return to sum function call in main
// here  a amd b are specified of type int
    // function is specified to int which indicate the return type is of Integer type
}

/* we will see more often methods and not function how ever both are same
   the main differance is that method is a function which is called inside a class
   classes will be discussed in object oriented section of the repo
 */
