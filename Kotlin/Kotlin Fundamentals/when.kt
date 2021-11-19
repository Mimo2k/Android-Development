package com.mimo.kotlinpractice

fun main()
{

    // simple when use for voting system
    val age = 19
    when(age)
    {
        !in 18..120 -> print("You can't Give Vote") // not in the range
        else -> print("You can give vote")
    }
    print("\n")
    // student percentage problem using when
    val percentage = 89
    when(percentage)
    {
        in 90..100 -> print("You will get 1500 $")  // in specify range
        in 80..89  -> print("You will get 1000 $")
        in 70..79  -> print("Scope of improvement present but take 500 $")
        else -> print("go Study") // default case has to be present in all when statements
    }

    print("\n")

    // checking type of variable
    val num: Any = 224
    when(num)
    {
        is Int -> print("Integer")
        is Double -> print("Double")
    }

    // Assigning when to variables

    print("\n")
    val drive = 18
    val checkDrive = when(drive)
    {
        !in 0..17 -> "can Drive"
        else -> "can't Drive"

    }
    print("Person $checkDrive")

}