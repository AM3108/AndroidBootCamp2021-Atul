package com.example.androidbootcamp2021_atul.roomdemo

import androidx.room.*
import com.example.androidbootcamp2021_atul.EmployeeDataClass

// @annotation_name are inbuilt annontations
// of Androidx Room

@Dao
interface RoomEmployeeDoa {

    @Query("SELECT * FROM emp_table")
    fun getAllEmployeeDetails(): List<EmployeeDataClass>

    @Insert
    fun insertEmployeeDetails(employee: EmployeeDataClass)

    @Update
    fun updateEmployeeDetails(employee: EmployeeDataClass)

    @Delete
    fun deleteEmployeeDetails(employee: EmployeeDataClass)
}
