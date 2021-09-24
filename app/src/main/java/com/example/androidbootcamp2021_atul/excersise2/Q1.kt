package com.example.androidbootcamp2021_atul.excersise2

class Q1 {

    // Companion object make it public static
    // So we can access it just as using ClassName.propertyName
    companion object {
        const val fname = "Pawan"
        const val lname = "Shadija"
        const val age = 25

    }

    var fname: String? = null
    var lname: String? = null
    var age: String? = null

    // init will initialise values
    init {
        fname = "Atul"
        lname = "Mishra"
        age = "25"

    }

    // init will initialise details
    // then we will print it
    fun printInitDetails() {
        fname = "Atul"
        println("Value initialised from init block")
        println("First name: $fname")
        println("Last name: $lname")
        println("Age: $age")
    }

}