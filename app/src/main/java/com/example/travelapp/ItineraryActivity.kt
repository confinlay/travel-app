package com.example.travelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.travelapp.itineraries.Itinerary

class ItineraryActivity : AppCompatActivity() {
    lateinit var textViewTitle : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itinerary)

        val itinerary: Itinerary = intent.getSerializableExtra("itinerary") as Itinerary

        textViewTitle = findViewById(R.id.textView_title)
        textViewTitle.text = itinerary.name
    }
}