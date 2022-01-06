package com.example.kotlinpractice

fun main(){

    //   way's of Declaration and initializing of Int type array
    val myArray1:IntArray = intArrayOf(1, 2, 3, 4, 5)  //way 1 defining explicitly
    val myArray2 = intArrayOf(1, 2, 3, 4, 5) // way2 using Inference
    val myArray3 = arrayOf(1, 2, 3, 4, 5) //way 3 using Inference


    val myArray = arrayOf(1, 2, 3, 4, 5) //way 3 using Inference
    println(myArray) // will print address of the array

    /* to print each element we have to use either contentToString()
    or for loop
     */
    println(myArray.contentToString()) // this will convert all the elements of the array to string
    for(element in myArray){
        print("$element ")
    }
    print("\n")

    /* changing array elements.
       note: * array elements can be changed using index
             * index of an array starts with 0 and goes to lengthOfArray-1
     */
    println("Before Changing element at index 0: ${myArray[0]}")
    myArray[0] = 10
    println("After Changing element at index 0: ${myArray[0]}")

    // Storing objects of class is also possible

    val objArray = arrayOf(Fruits("Apple",100.00),Fruits("Grapes",130.50) )

    println("object Array = ${objArray.contentToString()}") //printing the data class object

    // iterating over objArray and printing each fruit name
    for(i in objArray.indices){
        println("Fruit at $i is ${objArray[i].name}")
    }

   /* using arrayOf method actually we can store multiple data types inside single array
      like a list
    */
    val store = arrayOf("Mimo", "Tapan", 1, 2, Fruits("banana", 5.5))

    println(" using array of to store different data type's in single array:\n" +
            store.contentToString()
    )
}

data class Fruits(val name:String,val price:Double) //data class

