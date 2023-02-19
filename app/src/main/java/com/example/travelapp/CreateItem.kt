package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.example.testingapplication.ItineraryListAdapter
import com.example.travelapp.itineraries.StaticData
import com.example.travelapp.itineraries.Step
import java.io.Serializable
import com.example.travelapp.MainActivity.Companion.itineraryList

class CreateItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_item)
        val submitButton = findViewById<Button>(R.id.submit_button)

        submitButton.setOnClickListener{
            val name = findViewById<EditText>(R.id.item_title).text.toString()
            val address = findViewById<EditText>(R.id.item_location).text.toString()
            val description = findViewById<EditText>(R.id.item_description).text.toString()
            val cost = findViewById<EditText>(R.id.item_cost).text.toString().toFloat()
            itineraryList[0].steps.add(Step(name, address, cost, description))
            println(itineraryList[0].steps[4].name)
            finish()
        }
        }
    }
