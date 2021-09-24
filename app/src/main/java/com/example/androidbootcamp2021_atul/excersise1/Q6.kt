package com.example.androidbootcamp2021_atul.excersise1

fun checkNonPair() {
    val str = "ATULTTNM"
    var i = 0
    println("Non pair elements are: ")
    while (i < str.length-1) {
        if (str[i] != str[i+1]) {
            print(str[i] + " ")
            i++
        }
        else
            i += 2
    }
    if (str[str.length-1] != str[str.length-2])
        print(str[str.length-1])
}
