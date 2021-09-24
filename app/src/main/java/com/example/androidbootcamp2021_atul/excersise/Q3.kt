package com.example.androidbootcamp2021_atul.excersise

// WAP to create extension function.

class ext {
    val num1: Int = 10

    val str1 = "Kotlin"
    val str2 = "World!"

    // Extension function
    // Adding functionality to existing
    // Int class
    fun Int.addition(num2: Int): Int {
        return this+num2
    }

    // Extension function
    // Adding functionality to existing
    // String class
    fun String.concatenation(s: String, s1: String): String {
        return this + s + s1
    }

    fun printDetails() {
        println("Addition of 5 and 10: " + 5.addition(num1))
        println("Concatenating string Hello Kotlin World!: " + "Hello".concatenation(str1, str2) + "\n\n")

    }
}