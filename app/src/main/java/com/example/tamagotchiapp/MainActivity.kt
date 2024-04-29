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

    private lateinit var pet: Pet // Define your Pet data class

    private lateinit var petImageView: ImageView // Replace with your image view ID (e.g., Main_Image)
    private lateinit var feedButton: Button    // Replace with your button ID (e.g., Feed_Button)
    private lateinit var cleanButton: Button  // Replace with your button ID (e.g., Clean_Button)
    private lateinit var playButton: Button    // Replace with your button ID (e.g., Play_Button)
    private lateinit var hungerText: TextView  // Replace with your text view ID (e.g., hunger_text)
    private lateinit var cleanlinessText: TextView // Replace with your text view ID (e.g., cleanliness_text)
    private lateinit var healthText: TextView  // Replace with your text view ID (e.g., health_text)

    private val imageResources = mapOf(
        "feed" to R.drawable.eating, // Replace with your resource ID for eating image
        "clean" to R.drawable.washing, // Replace with your resource ID for cleaning image
        "play" to R.drawable.health  // Replace with your resource ID for playing image
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize pet data and image views
        pet = Pet("Fluffy", R.drawable.playing, 50, 50, 50) // Replace with your details
        petImageView = findViewById(R.id.Main_Image)  // Replace with your image view ID
        feedButton = findViewById(R.id.Feed_Button)    // Replace with your button ID
        cleanButton = findViewById(R.id.Clean_Button)  // Replace with your button ID
        playButton = findViewById(R.id.Play_Button)    // Replace with your button ID
        hungerText = findViewById(R.id.hunger_text)    // Replace with your text view ID
        cleanlinessText = findViewById(R.id.cleanliness_text) // Replace with your text view ID
        healthText = findViewById(R.id.health_text)    // Replace with your text view ID

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