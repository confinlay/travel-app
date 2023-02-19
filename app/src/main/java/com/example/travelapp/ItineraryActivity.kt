package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.example.travelapp.adapters.ItineraryListAdapter
import com.example.travelapp.adapters.StepListAdapter
import com.example.travelapp.itineraries.Itinerary
import java.io.Serializable

class ItineraryActivity : AppCompatActivity() {
    lateinit var textViewTitle : TextView
    lateinit var listViewSteps: ListView
    lateinit var addButton: ImageView
    lateinit var backArrow: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itinerary)

        // get extras
        val itinerary: Itinerary = intent.getSerializableExtra("itinerary") as Itinerary

        textViewTitle = findViewById(R.id.textView_title)
        listViewSteps = findViewById(R.id.listView_steps)
        addButton = findViewById(R.id.button_add_step)
        backArrow = findViewById(R.id.back_arrow_itinerary_activity)


        textViewTitle.text = itinerary.name
        setupListView(itinerary)
        setupButtons()
    }

    fun setupListView(itinerary: Itinerary) {
        val arrayAdapter = StepListAdapter(this, itinerary.steps)
        listViewSteps.isClickable = true
        listViewSteps.adapter = arrayAdapter

        listViewSteps.setOnItemClickListener { parent, view, position, id ->
//            val intent = Intent(this, ItineraryActivity::class.java)
//            intent.putExtra("step", itinerary.steps[position] as Serializable)
//            startActivity(intent)
        }
    }

    fun setupButtons() {
        addButton.setOnClickListener {
            val intent = Intent(this, CreateItem::class.java)
            startActivity(intent)
        }

        backArrow.setOnClickListener {
            finish()
        }
    }
}