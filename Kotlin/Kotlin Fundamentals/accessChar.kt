package com.mimo.kotlinpractice

fun main()
{
    val myString = "Mimo"
    print(myString[0])  // accessing M from Mimo string
    print("\n")
    print(myString[1]) // accessing i from Mimo string
}

/*
  ** String Note
  * allocation of string memory start from address 0 so in Mimo string
    at 0 location it is M, at location 1 it is i and at location 2 it is m
  * you can access any character from string using  string_name[location]
  * string initialization is done using double inverted Commas like " Mimo "
 */