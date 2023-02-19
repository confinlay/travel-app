package com.example.travelapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ListView
import com.example.travelapp.adapters.ItineraryListAdapter
import com.example.travelapp.itineraries.StaticData
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    companion object {
        val itineraryList = StaticData().itineraryList
    }

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
            intent.putExtra("itinerary_index", position)
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