package com.example.androidbootcamp2021_atul

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toolbar
import org.w3c.dom.Text

class RestaurantDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_details)

        // Custom Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.title = "Restaurants"
        toolbar.setTitleTextColor(Color.WHITE)
        setActionBar(toolbar)
    }
}