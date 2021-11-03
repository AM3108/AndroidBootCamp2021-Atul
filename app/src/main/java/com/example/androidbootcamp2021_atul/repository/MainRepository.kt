package com.example.androidbootcamp2021_atul.repository

import com.example.androidbootcamp2021_atul.retrofit.RetrofitService


class MainRepository constructor(private val retrofitService: RetrofitService) {

    suspend fun getAllData() = retrofitService.getAllData()

}