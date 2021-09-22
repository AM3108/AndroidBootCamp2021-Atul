package com.example.androidbootcamp2021_atul

import com.example.androidbootcamp2021_atul.excersise2.*

fun main() {
    // Q1 Write a program to print your Firstname, LastName & age using init block,companion object.
    println("Q1")
    // Making Object of class
    val ob1 = Q1()
    // calling method
    ob1.printInitDetails()

    // printing details from Companion object
    println("\nValue initialised from companion object")
    println("First name: ${Q1.fname}")
    println("Last name: ${Q1.lname}")
    println("Age: ${Q1.age}")

    // Q2 Write a single program for following operation using overloading
    // A) Adding 2 integer number
    // B) Adding 2 double
    // D) multiplying 2 int
    // E) concate 2 string
    // F) Concate 3 String
    println("\nQ2")
    val ob2 = Q2()
    ob2.addInteger(127, 345)
    ob2.addDouble(23.6, 8.9)
    ob2.multiplyInt(25, 8)
    ob2.concatString("TO ", "THE ")
    ob2.concatThreeStrings("TO ", "THE ", "NEW ")

    // Q3 Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide
    // there specific details like rateofinterest etc,print details of every bank.
    println("\nQ3")
    val ob3 = NB()
    ob3.getBankDetails()
    val ob4 = PNB()
    ob4.getBankDetails()
    val ob5 = ICICI()
    ob5.getBankDetails()

    // Q4 Create Kotlin classes having suitable attributes for Library management system.Use OOPs concepts
    // in your design.Also try to use interfaces and abstract classes.
    println("\nQ4")
    val ob6 = Q4()
    val ob7 = Q4()
    ob6.addBook("Intro to Android", 1, "Atul")
    ob7.addBook("Intro to Flutter", 2, "Pawan")
    ob6.getBookDetails()
    ob7.getBookDetails()

    // Q5 Write a function which take marks as an argument and return the the grade as follows:
    //marks between 50 to 60 , return “Good”
    //marks between 60 to 70, return “Very Good”
    //marks between 70 to  80, return “Excellent”
    //marks between  80 to 100, return “Rockstar”
    println("\nQ5")
    val ob8 = Q5()
    println("Your grade: ${ob8.getGradeDetails(80)}")

    // Q6 Write a program to create mutable list of Integer. replace the second item in the list with
    // new value. Print the list value.
    println("\nQ6")
    val ob9 = Q6()
    println("Original content in list: ${ob9.mList}")
    ob9.replaceSecondItem()

    // Q7 Write a program to create mutable map. print all the value and key of map.
    println("\nQ7")
    val ob10 = Q7()
    ob10.makeAndPrintMap()

    // Q8 Write a program to create HasSet. print all the value.
    println("\nQ8")
    val ob11 = Q8()
    ob11.printHashSet()
}