package com.example.androidbootcamp2021_atul.excersise

sealed class Q3 {


    fun getClass(base: Q3) {
        println("This is called from object of ${base.javaClass}")
    }
}

class A: Q3(){
}

class B: Q3(){
}

class C: Q3(){
}