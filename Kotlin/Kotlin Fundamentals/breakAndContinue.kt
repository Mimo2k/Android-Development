package com.mimo.kotlinpractice

fun main()
{

    // break statement
    for(i in 1 until 10 )
    {
        if(12%i==0)
        {
            println("12 was divisible by $i")
            break   // break statement break's the for loop so rest iteration never get executed
        }
    }

    // continue statement

    // from in range 1..10 don't print the numbers which are divisible by 2
    println("All number not divisible by 2 in 1..10 range")
    for (i in 1 until 11)
    {
        if(i%2==0)
        {
            continue // continue statement can be used to jump over an iteration
        }
        else
        {
            println("$i")
        }
    }
}