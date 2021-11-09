package com.example.androidbootcamp2021_atul.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidbootcamp2021_atul.PersonDataClass

@Database(entities = [PersonDataClass::class], version = 2)
abstract class AppDatabase: RoomDatabase() {
    abstract fun personDao() : PersonDao
}