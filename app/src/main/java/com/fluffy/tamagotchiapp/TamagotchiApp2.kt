package com.fluffy.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TamagotchiApp2 : AppCompatActivity() {
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var hungerTextView: TextView
    private lateinit var cleanlinessTextView: TextView
    private lateinit var happinessTextView: TextView
    private lateinit var imageViewToothless: ImageView
    private var hunger = 0
    private var cleanliness = 0
    private var happiness = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tamagotchi_app2)

        imageViewToothless = findViewById(R.id.imageViewToothless)

        hungerTextView = findViewById(R.id.hungerTextView)
        cleanlinessTextView = findViewById(R.id.cleanlinessTextView)
        happinessTextView = findViewById(R.id.happinessTextView)
        feedButton = findViewById(R.id.feedButton)
        cleanButton = findViewById(R.id.cleanButton)
        playButton = findViewById(R.id.playButton)

        feedButton.setOnClickListener {
            imageViewToothless.setImageResource(R.drawable.hunger)
            increaseStatus(hungerTextView, "Hunger", 10)
        }

        cleanButton.setOnClickListener {
            imageViewToothless.setImageResource(R.drawable.clean)
            increaseStatus(cleanlinessTextView, "Cleanliness", 10)
        }

        playButton.setOnClickListener {
            imageViewToothless.setImageResource(R.drawable.happiness)
            increaseStatus(happinessTextView, "Happiness", 10)
        }
    }

    private fun increaseStatus(textView: TextView, statusName: String, increment: Int) {
        var statusValue = 0
        when (statusName) {
            "Hunger" -> {
                hunger += increment
                statusValue = hunger
            }
            "Cleanliness" -> {
                cleanliness += increment
                statusValue = cleanliness
            }
            "Happiness" -> {
                happiness += increment
                statusValue = happiness
            }
        }
        if (statusValue >= 100) {
            textView.text = "$statusName: Max"
        } else {
            textView.text = "$statusName: $statusValue"
        }
    }
}
