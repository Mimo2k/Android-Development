package com.mimo.kotlinpractice

fun main()
{
    val myString = "Cat"

    // string template
    print("I love $myString")   // $ is used to append strings and known as string template in kotlin

    print("\n")

    // using string interpolation to print length of string
    print("Length: ${myString.length}")

}

/*
 Note:
 * string interpolation is generally used when we want to print an equation directly within the print
   statement without using an extra variable or printing string length and more without using an extra
   variable
 */