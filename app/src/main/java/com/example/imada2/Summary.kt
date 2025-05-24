package com.example.imada2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Summary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_summary)

        //declare variables to be used in the code
        val btnExit = findViewById<Button>(R.id.btnExit)

        //declare variables to be used in the code
        val txtBody = findViewById<TextView>(R.id.txtBody)

        //declare variables to be used in the code
        val btnReview = findViewById<Button>(R.id.btnReview)

        //retrieve a variable from a different screen; This code was adapted from StackOverflow response by Ally (2010): https://stackoverflow.com/questions/2347152/in-android-how-do-i-get-variables-data-from-one-screen-to-another
        var score = intent.getIntExtra("score", 0)

        //gives the user feedback based on their final score
        if (score >= 3) {
            txtBody.text = "Your score was $score / 5. Great job!"
        } else {
            txtBody.text = "Your score was $score / 5. Keep practising!"
        }

        btnReview.setOnClickListener {
            txtBody.text = """
                Q1. true.
                Q2. false.
                Q3. false. 
                Q4. true.
                Q5. false.
            """.trimIndent()
        }

        btnExit.setOnClickListener {
            //closes the app when the button is clicked; This code was adapted from a a Stack Overflow response by "James_Duh" (2018): https://stackoverflow.com/questions/51831820/how-to-close-android-application-in-kotlin
            finishAffinity()
        }
    }
}

// Title: In Android: How do I get variables/data from one screen to another?
// Author: Ally on StackOverflow
// Date: 27 February 2010
// Version: 1.0
// Available: https://stackoverflow.com/questions/2347152/in-android-how-do-i-get-variables-data-from-one-screen-to-another

// Title: How to close Android application in Kotlin
// Author: James_Duh on StackOverflow
// Date: 14 August 2018
// Version: 1.0
// Available: https://stackoverflow.com/questions/51831820/how-to-close-android-application-in-kotlin