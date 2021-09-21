package com.example.androidbootcamp2021_atul.excersise1

fun numOfCharOccurences() {
    val str = "AABAC"
    val pattern1 = "A"
    val pattern2 = "B"


    val count1 = countMatches(str, pattern1)
    val count2 = countMatches(str, pattern2)

    println("\nNumber of A characters are: ${count1}")
    println("Number of B characters are: ${count2}")
}

fun countMatches(string: String, pattern: String): Int {
    return string.split(pattern)
        .dropLastWhile { it.isEmpty() }
        .toTypedArray().size -1
}