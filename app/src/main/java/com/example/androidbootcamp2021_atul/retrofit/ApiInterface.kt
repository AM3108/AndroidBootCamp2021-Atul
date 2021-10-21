package com.example.androidbootcamp2021_atul.retrofit

import com.example.androidbootcamp2021_atul.model.DataItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/posts")
    fun getData( @Query("id") id: Int): Call<List<DataItem>>
//    @GET("/posts/{id}")
//    fun getData( @Path("id") id: Int): Call<List<DataItem>>
}