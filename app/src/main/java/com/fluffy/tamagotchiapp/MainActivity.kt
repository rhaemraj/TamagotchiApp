package com.fluffy.tamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var enterButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        enterButton = findViewById(R.id.enterButton)

        enterButton.setOnClickListener {
            var intent = Intent(this, TamagotchiApp2::class.java)
            startActivity(intent)
        }
    }
}