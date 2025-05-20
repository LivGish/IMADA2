package com.example.imada2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)

        val txtBody = findViewById<TextView>(R.id.txtBody)

        txtBody.text = """
            Welcome to the physics flashcard 
            app!
            There are 5 true or false 
            questions based on waves in 
            physics.
            Press 'start' to begin the quiz. 
        """.trimIndent()

        btnStart.setOnClickListener{
            val intent = Intent (this, flashcards::class.java)
            startActivity(intent)

        }

    }
}