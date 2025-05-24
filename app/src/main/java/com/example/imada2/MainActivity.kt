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

        //declare variables to be used in the code
        val btnStart = findViewById<Button>(R.id.btnStart)

        //declare variables to be used in the code
        val txtBody = findViewById<TextView>(R.id.txtBody)

        //displays the text in green when the app is run; This code was adapted from Geeks for Geeks (2025): https://www.geeksforgeeks.org/textview-in-kotlin/
        txtBody.text = """
            Welcome to the physics flashcard 
            app!
            There are 5 true or false 
            questions based on a 
            physics topic.
            Press 'start' to move to the flashcard page. 
        """.trimIndent()

        //switches to the flashcard page when the button is clicked; This code was adapted from a Stack Overflow response by "Zer0" (2014): https://stackoverflow.com/questions/10036157/how-to-navigate-from-one-page-to-another-on-androidtotal3-pages
        btnStart.setOnClickListener{
            val intent = Intent (this, flashcards::class.java)
            startActivity(intent)

        }

    }
}

// Title: TextView in Kotlin
// Author: Geeks for Geeks
// Date: 24 February 2025
// Version: 1.0
// Available: https://www.geeksforgeeks.org/textview-in-kotlin/

// Title: How to navigate from one page to another on android? (Total:3 pages)
// Author: Zer0 on StackOverflow
// Date: 22 June 2014
// Version: 1.0
// Available: https://stackoverflow.com/questions/10036157/how-to-navigate-from-one-page-to-another-on-androidtotal3-pages

