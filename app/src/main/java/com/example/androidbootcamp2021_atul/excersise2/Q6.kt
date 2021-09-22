package com.example.androidbootcamp2021_atul.excersise2


// Write a program to create mutable list of Integer. replace the second item in the list with
// new value. Print the list value.

class Q6 {
    val mList = mutableListOf<Int>(2, 4, 7, 12, 18)

    fun replaceSecondItem() {
        mList[2]  = 6
        printList()
    }

    private fun printList() {
        println("Updated content in list: $mList")
    }
}
