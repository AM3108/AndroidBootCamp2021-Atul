package com.example.androidbootcamp2021_atul

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person_table")
data class PersonDataClass(
    @PrimaryKey(autoGenerate = true)
    val personId: Int?,
    @ColumnInfo(name = "person_name")
    val personName: String?,
    @ColumnInfo(name = "person_contact")
    val personContact: String?,
    @ColumnInfo(name = "person_address")
    val personAddress: String?
)