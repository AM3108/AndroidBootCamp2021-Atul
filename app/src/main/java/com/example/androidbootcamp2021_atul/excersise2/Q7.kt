package com.example.androidbootcamp2021_atul.excersise2

// Write a program to create mutable map. print all the value and key of map.

class Q7 {
    fun makeAndPrintMap() {
        val mMap = mutableMapOf(Pair(1, "hello"), Pair(2, "world"), Pair(3, "map"))
        for (item in mMap) {
            println("Key: ${item.key}, Value: ${item.value}")
        }
    }
}