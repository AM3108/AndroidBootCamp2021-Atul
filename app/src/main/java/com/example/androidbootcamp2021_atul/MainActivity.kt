package com.example.androidbootcamp2021_atul

import com.example.androidbootcamp2021_atul.excersise.*

fun main() {

    // Q1 WAP using Lambda function to calculate the Simple Interest.
    println("Q1")
    //lambda function
    val si = {p: Int, r: Int, t:Int -> (p*r*t)/100}
    println("Simple Interest is ${si(200,7,2)}")

    // Q2 Create a list of Employee which will have name and age as properties. print the name of all employees age >30.
    println("\nQ2")
    println("Employees age greater than 30 are: ")
    val result = employeeList.filter(agePredicate)
//    println(result)
    result.forEach {
        println("Name: ${it.name}, Age: ${it.age}")
    }


}
