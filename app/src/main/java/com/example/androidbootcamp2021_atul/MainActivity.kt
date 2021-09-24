package com.example.androidbootcamp2021_atul

import com.example.androidbootcamp2021_atul.excersise.*

fun main() {
    // Q1 WAP to create singleton class.
    println("\nQ1\nUsing singleton class")
    println("The sum of three values are: ${Q1.addThreeInt(2, 3, 5)}")

    // Q2 WAP to create sealed Base class and 3 subclasses of Base class, write a function which will have
    // base class object as an argument and it will return name of the subclass based argument type.
    println("\nQ2")
    val ob3 = A()
    val ob4 = B()
    val ob5 = C()
    ob3.getClass(ob3)
    ob3.getClass(ob4)
    ob3.getClass(ob5)

    // Q3 WAP to create extension function.
    println("\nQ3")
    val ob6 = ext()
    println("Using extension function:")
    ob6.printDetails()

}