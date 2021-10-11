package com.example.androidbootcamp2021_atul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.androidbootcamp2021_atul.roomdemo.RoomDatabaseBuilder

import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // insertDataInDBUsingSQLite()
        val addDummySqliteDemoBtn:Button = findViewById(R.id.addDummyRoomDataBtn)
        val sqliteDemoBtn:Button = findViewById(R.id.sqliteDemoBtn)
        sqliteDemoBtn.setOnClickListener {
            startActivity(
                Intent(this, DatabaseActivity::class.java).putExtra(
                    MainActivity.BUTTON_CLICKED_KEY,
                    MainActivity.ROOM_DEMO_BTN
                )
            )
        }

        addDummySqliteDemoBtn.setOnClickListener {
            insertDataInDBUsingRoom()
            Toast.makeText(this, "Data added successfully", Toast.LENGTH_LONG).show()
        }
    }

    private fun insertDataInDBUsingRoom() {
        val database = RoomDatabaseBuilder.getInstance(this)

        Executors.newSingleThreadExecutor().execute {
            database.employeeDao().insertEmployeeDetails(
                EmployeeDataClass(
                    name = "Mayank",
                    contact = "9912345678",
                    address = "New Delhi"
                )
            )
            database.employeeDao().insertEmployeeDetails(
                EmployeeDataClass(
                    name = "Rohit",
                    contact = "123456789",
                    address = "Delhi"
                )
            )
            database.employeeDao().insertEmployeeDetails(
                EmployeeDataClass(
                    name = "Sahil",
                    contact = "3264464789",
                    address = "Noida"
                )
            )

        }
    }



//    private fun insertDataInDBUsingSQLite(key: String, value: String) {
//
//        val databaseManager =
//            SQLiteDatabaseManager(this)
//
//        // insert data in DB
//        databaseManager.insertValue(
//            EmployeeDataClass(
//                name = value,
//                contact = key,
//                address = "New Delhi"
//            )
//        )
//    }

    companion object {
        const val BUTTON_CLICKED_KEY = "BUTTON_CLICKED"
        const val SQLITE_DEMO_BTN = "SQLITE_DEMO_BTN"
        const val ROOM_DEMO_BTN = "ROOM_DEMO_BTN"
        const val PERMISSIONS_REQUEST_READ_CONTACTS = 100
    }
}