package com.example.androidbootcamp2021_atul



// This data class is being used for both
// SQLite and Androidx Room


data class EmployeeDataClass(
    var id: Int = 0,
    var name: String? = null,
    var contact: String? = null,
    var address: String? = null
)