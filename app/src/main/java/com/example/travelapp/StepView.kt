package com.example.travelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.travelapp.itineraries.Itinerary
import com.example.travelapp.itineraries.Step

// when you press the step in the itinerary should display this activity:
class StepView : AppCompatActivity() {
    lateinit var back_arrow: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step_view)

        val itineraryIndex: Int = intent.getIntExtra("itinerary_index", 0)
        val stepIndex: Int = intent.getIntExtra("step_index", 0)
        val step: Step = MainActivity.itineraryList[itineraryIndex].steps[stepIndex]

        back_arrow = findViewById(R.id.back_arrow_display_step)

        // want to find the itinerary activity and pull the information from that itinerary object
        // to fill in the fields. Tring to add to the TextView string
        val name = findViewById<TextView>(R.id.textView_title_step_display) as TextView
        name.text = step.name

        val address = findViewById<TextView>(R.id.address) as TextView
        address.text = "Address : " + step.address

        val price = findViewById<TextView>(R.id.price) as TextView
        price.text = "Price : ${step.price} €"

        val description = findViewById<TextView>(R.id.description) as TextView
        description.text = "Description : " + step.description


        back_arrow.setOnClickListener {
            finish()
        }
    }
}