package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.testingapplication.ItineraryListAdapter
import com.example.travelapp.itineraries.Itinerary
//import com.example.travelapp.itineraries.StaticData
import com.example.travelapp.itineraries.Step
import com.example.travelapp.MainActivity.Companion.itineraryList
import java.io.Serializable

class SecondActivity : AppCompatActivity(){
    //val itineraryList = StaticData.itineraryList

    /*
    companion object{
        val stepList = SecondActivity().StepList
    }
    */

    //lateinit var listViewStep: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val createsecondButton = findViewById<ImageButton>(R.id.createSecondButton)
        createsecondButton.setOnClickListener{
            val intent = Intent(this, CreateItem::class.java)
            startActivity(intent)
        }

        // Step List // DOES NOT CURRENTLY WORK
        /*
        val StepList: ArrayList<Step> = ArrayList()
        listViewStep = findViewById(R.id.StepList)
        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, StepList)
        listViewStep.isClickable = false
        listViewStep.adapter = arrayAdapter
        */

        /*
        * listViewStep.setOnItemClickListener { parent, view, position, id ->
        *    val intent = Intent(this, ItineraryActivity::class.java)
        *    intent.putExtra("itinerary", itineraryList[position] as Serializable)
        *    startActivity(intent)
        *}
        */


        // Submit button
        val createitsubmit = findViewById<Button>(R.id.itsubmit)
        createitsubmit.setOnClickListener{
            val Itin_Title = findViewById<EditText>(R.id.Itin_Title)
            val newItinerary = Itinerary(Itin_Title.text.toString())
            // statement to replace blank names, not needed but *aesthetics*
            if (newItinerary.name == "") newItinerary. name = "Itinerary"
            newItinerary.steps.add(Step("Trinity College", "College Green, Dublin 2", 0f, "Nice place to visit"))
            //StaticData().itineraryList.add(newItinerary)
            //newItinerary.steps.add
            itineraryList.add(newItinerary)


            // Return to previous page
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}

