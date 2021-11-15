package com.mimo.kotlinpractice

/* program to show all data types of Number

 Integer Data Types:
    Integer data types are of 4 Types
        Byte  (8 bit)
        Short (16 bit)
        Int   (32 bit)
        long  (64 bit)

   Floating Data Types:
      Floating data type are of 2 types
         Float    (32 bit)
         Double   (64 bit)

        */
 fun main()
{
    // Kotlin has an amazing feature Inference it can find type just from the context

    // Integer Type
    val intNum = 22   // by default it will be taken as int as of Inference preference
    print("Integer Example: ")
    print(intNum)
    print("\n")   // \n is used to jump over to next line
    // Floating Type
    val doubleNum = 12.22  // by default it will be taken as double as of Inference prefer double
    print("Double Example: ")
    print(doubleNum)


 }


