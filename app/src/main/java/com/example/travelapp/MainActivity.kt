package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val createButton = findViewById<ImageButton>(R.id.createButton)
            createButton.setOnClickListener{
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)



            }




    }
}