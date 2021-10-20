package com.example.androidbootcamp2021_atul.thread

import android.content.Context
import android.util.Log
import android.widget.Toast
import java.lang.Exception

class Thread1: Thread() {

    val TAG = "thread1"

    override fun run() {
        for(i in 1..4) {
            try {
                Thread.sleep(500)
            } catch (e: Exception) {
                println(e)
            }
            Log.i(TAG, "value$i")
        }
        }


}