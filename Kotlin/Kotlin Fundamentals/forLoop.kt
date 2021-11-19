package com.mimo.kotlinpractice

fun main()
{

    // way 1
    println("Printing hello two times:")
    for(i in 1 until 3)
    {
        println("hello")
    }

    // way 2
    println("Going up from 1 to 2:")
    for (i in 1..2)      // 1 to 2 is range as soon as 3 will arrive loop will break
    {
        println("$i")
    }

    // going downward in range
    println("Going down from 2 to 1:")
    for(i in 2 downTo 1)
    {
        println("$i")
    }

    // program to print all even number from 2 to
    println("all even Numbers from 2 to 20 using step: ")
    for(i in 2 until 21 step 2)  // step 2 will make the iteration jump over 2 places each time
    {
        println("$i")
    }

}

// in for loop the range is also specified in the loop condition block