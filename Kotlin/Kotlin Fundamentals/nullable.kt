package com.mimo.kotlinpractice

import java.util.*

fun main(){
// Nullable were introduced in kotlin to reduce NullPointException
// Kotlin supports nullability as part of its type System.
// That means You have the ability to declare whether
// a variable can hold a null value or not.
// By supporting nullability in the type system,
// the compiler can detect
// possible NullPointerException errors at compile time
// and reduce the possibility of having them thrown at runtime.


    var name: String = "Mimo"
// name = null // Compilation Error

    var nullableName: String? = "Mimo"
    nullableName = null // Works

    /*
    Here name can not be null
    val len = name.length
    val upper = name.toLowerCase()



    // but the same methods won't work on nullable types
    val len2 = nullableName.length // Compilation Error
    val upper2 = nullableName.LowerCase()  // Compilation Error

// So how can we solve this? We could do a null check before hand

    val nullableName2: String? = "Mimo"

     */

    // Kotlin provides a Safe call operator, ?.
// It allows you to combine a null-check and
// a method call in a single expression.
    val nullableName2: String? = "Mimo"

    nullableName2?.lowercase()



    // we can use methods on a nullable variable like this
    val nullableName3: String? = null

    println(nullableName3?.lowercase()) // prints null
    println(nullableName3?.length) // prints null

    // You can perform a chain safe calls:
    //val wifeAge: String? = user?.wife?.age
    // we will look into it in our oops section of the repo

    // In order to perform an operation only if the
// variable is not null, we can use the safe call
// operator with let -

    val nullableName4: String? = null

    nullableName4?.let { println(it.lowercase()) }
    nullableName4?.let { println(it.length) }
// Prints nothing because there nullableName is null
// and we used let to prevent anything from being performed



    // What if we would like to enter a default value?
// Then we can use the elvis operator ?:
    val name2 = nullableName4 ?: "Guest"
/*

    Not null assertion : !! Operator
    The !! operator converts a nullable type to a
    non-null type, and throws a NullPointerException
    if the nullable type holds a null value.
    This is risky, and you should only use it if
    you are 100% certain, that there will be a value in
    the variable.
    val nullableName5: String? = null
    nullableName5!!.toLowerCase() // Results in NullPointerException
    */
}



