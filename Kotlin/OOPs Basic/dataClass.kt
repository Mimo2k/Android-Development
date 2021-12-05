package com.example.classes

fun main()
{
  val std1 = StudentData(1,"Mimo",'A') // initializing std1 object of type StudentData class
  val std2 = StudentData(2,"Rahul",'B')
  println("Student 1 = $std1")    // printing std1 object values
  println("Student 2 = $std2")    // printing std2 object values
  println(std1==std2) // checking whether both having same parameters
  val student1Details = std1.copy(roll = 3)  //copying std1 details and also updating few components
  println(student1Details)
  println(student1Details.component1()) // first component which is  roll will get printed
  val(roll,name,section) = student1Details // storing each component under different variable names
  println(" Roll = $roll\n Name = $name\n Section = $section")
}

data class StudentData(val roll:Int, val name:String, val section:Char)  // data class

