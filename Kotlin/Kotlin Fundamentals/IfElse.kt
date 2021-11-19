package com.mimo.kotlinpractice

fun main()
{

    // Simple If-Else
    // problem: program to check weather a person can give vote or not
    val age = 21
    if (age>=18)
    {
        print("Can give Vote")
    }
    else      // this only get executed if if statement condition is wrong
    {
        print("Can not give Vote")
    }

    print("\n")


    // If - Elseif - Else
    // problem: percentage Problem for Students

    val percent = 80

    if(percent>=90)
    {
        print("You won 1500 $")
    }
    else if(percent>=80)
    {
        print("You Won 1000 $")
    }
    else if(percent>=70)
    {
        print("Scope of improvement present but take 500 $")
    }
    else // Default case
    {
        print("Go Study")
    }
}

/*
    * line by line checking is done for both if any statement condition get true rest condition
      will not get executed.
    * else is the default case for all else - if and if statement's
       */