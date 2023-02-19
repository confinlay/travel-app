package com.example.travelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

// when you press the step in the itinerary should display this activity:
class StepView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step_view)

        // want to find the itinerary activity and pull the information from that itinerary object
        // to fill in the fields. Tring to add to the TextView string
        val name = findViewById<TextView>(R.id.name) as TextView
        name.text = "Name string from Itinerary Activity object"

        val address = findViewById<TextView>(R.id.address) as TextView
        address.text = "Address string from Itinerary Activity object"

        val price = findViewById<TextView>(R.id.price) as TextView
        price.text = "Price string from Itinerary Activity object"

        val description = findViewById<TextView>(R.id.description) as TextView
        description.text = "Description string from Itinerary Activity object"

    }
}