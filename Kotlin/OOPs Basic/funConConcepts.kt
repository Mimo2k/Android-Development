package com.example.basic

fun main()
{
  val num1:Int = 20
  val num2:Int = 30
  val number3:Int = 10
  val name:String = "Mimo"
    var sum: MyClass = MyClass(num1,num2,number3)
    sum = MyClass(num1,num2,name)

    sum.printNum()
    println("Main Function Accessing: ")
    println("Number 3 Accessed: ${sum.num3}")



}
class MyClass constructor(number1:Int,number2:Int)
{
 var num1: Int? = null
 var num2: Int? = null
 var num3: Int? = null

    init {
        this.num1=number1
        this.num2=number2
       println("Sum of $number1 and $number2 = ${number1+number2}")
   }

    fun printNum()
    {
        println("My Numbers: ")
        println("Number 1 = $num1")
        println("Number 2 = $num2")
        println("Number 3 = $num3")
        num3=2


    }
    constructor(number1: Int,number2: Int,number3:Int)
            :this(number1,number2){
        println("Sum of $number1, $number2 and $number3 = ${number1+number2+number3}")
        this.num3=number3

    }
    constructor(number1: Int,number2: Int,name: String)
            :this(number1,number2)
    {
                println("$name\'s  having 2 Number's $number1,$number2")
            }
}