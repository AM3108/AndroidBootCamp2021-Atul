package com.example.androidbootcamp2021.roomdemo

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidbootcamp2021_atul.EmployeeDataClass
import com.example.androidbootcamp2021_atul.roomdemo.RoomEmployeeDoa

// Entity means a row
@Database(entities = [EmployeeDataClass::class], version = 1)
abstract class AppRoomDatabase : RoomDatabase() {
    abstract fun employeeDao(): RoomEmployeeDoa
}
