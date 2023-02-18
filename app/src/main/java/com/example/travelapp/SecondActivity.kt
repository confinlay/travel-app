package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
            val createsecondButton = findViewById<ImageButton>(R.id.createSecondButton)
            createsecondButton.setOnClickListener{
                val intent = Intent(this, CreateItem::class.java)
                startActivity(intent)
            }
    }
}