package com.mimo.kotlinpractice

/*
 ***there are generally four types of operator's
 * Arithmetic Operator's
 * Comparison Operator's
 * Assignment Operator's
 * Increment / Decrement operator's
 */

fun main()
{

    /*
     ** Arithmetic operator's:
     * + (Addition)
     * - (Subtraction)
     * / (Division)
     * * (Multiplication)
     * % (Modulus / Reminder)
     */

    val numOne = 10
    val numTwo= 3

    print("Arithmetic Operator's: \n")

    // addition of two Numbers
    print("Addition: ${numOne + numTwo} \n")

    // subtraction of two numbers
    print("Subtraction: ${numOne - numTwo} \n")

    // Division of two numbers
    print("Division: ${numOne / numTwo} \n")

    // Multiplication of two numbers
    print("Multiplication: ${numOne * numTwo} \n")

    // Modulus of two numbers
    print("Modulus: ${numOne % numTwo} \n")

    print("\n")

    /*
      ** Comparison Operator's:
      *  == (Equality operator)
      *  != (Not Equality Operator)
      *  <  (smaller then operator)
      *  >  (greater then operator)
      *  <= (smaller then equality operator)
      *  >= (greater then equality operator)
     */

    print("Comparison Operator's: \n")
    val myNumOne = 3
    val myNumTwo = 6
    var check: Boolean

    // Equality of two numbers
     check = myNumOne == myNumTwo
    print("Both Equal: $check \n")

    // check for Not Equality
    check = myNumOne != myNumTwo
    print("Both Not Equal: $check \n")

    // check for Smaller then
    check = myNumOne < myNumTwo
    print("Smaller: $check \n")

    // check for Greater then
    check = myNumOne > myNumTwo
    print("Greater: $check \n")

    // smaller then equals
    check = myNumOne <= myNumTwo
    print("smaller then or Equals: $check \n")

    // Grater then equals
    check = myNumOne >= myNumTwo
    print("Greater then or Equals: $check \n")


    print("\n")

    /*

    ** Assignment Operator's:
    * += (add and assign)
    * -= (subtract and assign)
    * /= (divide and assign)
    * *= (multiply and assign)
    * %= (modulus and assign)

     */

    var assignNum1 = 20

     print("Assignment Operator's: \n")
    // Add and assign
     assignNum1 += 2
    print("Add : $assignNum1 \n")

    // Subtract and assign
    assignNum1 = 12
    assignNum1 -= 10
    print("Sub : $assignNum1 \n")
    // Divide and assign
    assignNum1 = 10
    assignNum1 /= 2
    print("Div : $assignNum1 \n")

    // Multiply and assign
    assignNum1 = 12
    assignNum1 *= 5
    print("Mul : $assignNum1 \n")

    // Modulus and assign
    assignNum1 = 10
    assignNum1 %= 2
    print("Modulo : $assignNum1 \n")

    print("\n")
    /*
    **Increment or Decrement Operator's
    * ++ (Increment operator)
    * -- (Decrement operator)
     */
    print("Increment or Decrement operator's: \n")

    var num = 21

    print("Pre Fix: \n")

    //Pre Fix Increment/ Decrement instantly
    print("Increment Now: ${++num} \n")
    print("Decrement Now ${--num} \n")

    //Post Fix Increment/ Decrement at next presence
    num = 10
    print("Post Fix: \n")
    print("Increment Later: ${num++} \n")
    print("Decrement Later ${num--} \n")
    print("Decrement Later Result $num \n")


}
