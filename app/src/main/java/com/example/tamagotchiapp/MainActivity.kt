package com.example.tamagotchiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

data class Pet(
    val name: String,
    val imageId: Int, // Resource ID of the pet's happy image
    var hunger: Int, // Hunger level (0-100)
    var cleanliness: Int, // Cleanliness level (0-100)
    var health: Int // Health level (0-100)
)

class MainActivity : AppCompatActivity() {

    private lateinit var pet: Pet

    private lateinit var petImageView: ImageView
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var hungerText: TextView
    private lateinit var cleanlinessText: TextView
    private lateinit var healthText: TextView

    private val imageResources = mapOf(
        "feed" to R.drawable.eating,
        "clean" to R.drawable.washing,
        "play" to R.drawable.health
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize pet data and image views
        pet = Pet("Fluffy", R.drawable.playing, 50, 50, 50)
        petImageView = findViewById(R.id.Main_Image)
        feedButton = findViewById(R.id.Feed_Button)
        cleanButton = findViewById(R.id.Clean_Button)
        playButton = findViewById(R.id.Play_Button)
        hungerText = findViewById(R.id.hunger_text)
        cleanlinessText = findViewById(R.id.cleanliness_text)
        healthText = findViewById(R.id.health_text)

        // Button click listeners
        feedButton.setOnClickListener {
            updatePet("feed")
        }

        cleanButton.setOnClickListener {
            updatePet("clean")
        }

        playButton.setOnClickListener {
            updatePet("play")
        }

        updateTextViews() // Update text views initially
    }

    private fun updatePet(action: String) {
        when (action) {
            "feed" -> pet.hunger++
            "clean" -> pet.cleanliness++
            "play" -> pet.health++
        }
        updatePetImage(action)
        updateTextViews()
    }

    private fun updatePetImage(action: String) {
        petImageView.setImageResource(imageResources[action]!!) // Update image based on action
    }

    private fun updateTextViews() {
        hungerText.text = "Hunger: ${pet.hunger}"
        cleanlinessText.text = "Cleanliness: ${pet.cleanliness}"
        healthText.text = "Health: ${pet.health}"

        }
        }