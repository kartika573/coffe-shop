package com.example.coffeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Find the itemKopiLatte by its ID
        val itemKopiLatte = findViewById<View>(R.id.itemKopiLatte)

        // Set an OnClickListener on itemKopiLatte to navigate to MainActivity3
        itemKopiLatte.setOnClickListener {
            // Create an Intent to start MainActivity3
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}
