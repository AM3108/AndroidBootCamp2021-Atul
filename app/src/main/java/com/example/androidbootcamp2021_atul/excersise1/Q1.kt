package com.example.androidbootcamp2021_atul.excersise1

fun replaceSubString() {
    val str1 = "Hello Atul"

    println("Original string: $str1")
    println("Replaced string: ${str1.replace("Hello", "Welcome", true)}\n")
}