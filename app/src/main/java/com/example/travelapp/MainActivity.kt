package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ListView
import com.example.travelapp.adapters.ItineraryListAdapter
import com.example.travelapp.itineraries.StaticData
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    val itineraryList = StaticData().itineraryList
    lateinit var listViewItinerary: ListView
    lateinit var createButton: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createButton = findViewById(R.id.createButton)
        listViewItinerary = findViewById(R.id.list_item)

        setupButtons()
        setupItineraryListView()
    }

    fun setupItineraryListView() {
        val arrayAdapter: ItineraryListAdapter = ItineraryListAdapter(this, itineraryList)
        listViewItinerary.isClickable = true
        listViewItinerary.adapter = arrayAdapter

        listViewItinerary.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, ItineraryActivity::class.java)
            intent.putExtra("itinerary", itineraryList[position] as Serializable)
            startActivity(intent)
        }
    }

    fun setupButtons() {
        createButton.setOnClickListener{
            val intent = Intent(this, AddItineraryActivity::class.java)
            startActivity(intent)
        }
    }

}