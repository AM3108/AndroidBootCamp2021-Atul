package com.example.androidbootcamp2021_atul.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.androidbootcamp2021_atul.PersonDataClass

@Dao
interface PersonDao {
    @Query("SELECT * FROM person_table")
    fun getAllPersonsDetails(): LiveData<List<PersonDataClass>>

    @Insert
    fun insertPersonDetails(person: PersonDataClass)
}