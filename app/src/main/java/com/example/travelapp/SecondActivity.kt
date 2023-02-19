package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.travelapp.itineraries.Itinerary
//import com.example.travelapp.itineraries.StaticData
import com.example.travelapp.itineraries.Step
import com.example.travelapp.MainActivity.Companion.itineraryList

class SecondActivity : AppCompatActivity(){
    //val itineraryList = StaticData.itineraryList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
            val createsecondButton = findViewById<ImageButton>(R.id.createSecondButton)
            createsecondButton.setOnClickListener{
                val intent = Intent(this, CreateItem::class.java)
                startActivity(intent)
            }
            val createitsubmit = findViewById<Button>(R.id.itsubmit)
            createitsubmit.setOnClickListener{
                val Itin_Title = findViewById<EditText>(R.id.Itin_Title)
                val newItinerary = Itinerary(Itin_Title.text.toString())
                // statement to replace blank names, not needed but *aesthetics*
                if (newItinerary.name == "") newItinerary. name = "Itinerary"
                newItinerary.steps.add(Step("Trinity College", "College Green, Dublin 2", 0f, "Nice place to visit"))
                //StaticData().itineraryList.add(newItinerary)
                itineraryList.add(newItinerary)


                // Return to previous page
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

    }
}

