package com.example.coffeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startedButton: Button = findViewById(R.id.startButton)
        startedButton.setOnClickListener {
            // Create an Intent to start MainActivity2
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
