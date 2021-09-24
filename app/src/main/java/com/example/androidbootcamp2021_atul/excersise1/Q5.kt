package com.example.androidbootcamp2021_atul.excersise1

fun findCommonElements() {
    val arr1 = arrayOf(1, 2, 3, 2)
    val arr2 = arrayOf(3, 1, 2, 5)

    println("Common elements are: ")
    for (i in arr1) {
        var commonElement = -1
        for (j in arr2) {
            if (i == j)
                commonElement = i
        }
        if (commonElement > -1)
            print("$commonElement ")
    }
}
