package com.example.imada2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class flashcards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flashcards)

        //declare variables to be used in the code
        val txtHeading = findViewById<TextView>(R.id.txtHeading)

        //declare variables to be used in the code
        val txtBody = findViewById<TextView>(R.id.txtBody)

        //declare variables to be used in the code
        val btnTrue = findViewById<Button>(R.id.btnTrue)

        //declare variables to be used in the code
        val btnFalse = findViewById<Button>(R.id.btnFalse)

        //declare variables to be used in the code
        val btnNext = findViewById<Button>(R.id.btnNext)

        //declare an array to be used in the code; This code was adapted from W3 Schools (2025): https://www.w3schools.com/kotlin/kotlin_arrays.php
        val headings = arrayOf("Question 1", "Question 2", "Question 3", "Question 4", "Question 5")

        //declare an array to be used in the code; This code was adapted from W3 Schools (2025): https://www.w3schools.com/kotlin/kotlin_arrays.php
        val questions = arrayOf(
            """Minimum displacement occurs at compressions and 
                |rarefractions in a longitudinal wave.""".trimMargin(),
            """Increasing the frequency of a string 
                |increases the speed of waves along it.""".trimMargin(),
            """Rotating a polarising filter will block 
                |all light from passing through it.""".trimMargin(),
            """Coherence is when two waves have the 
                |same wavelength, frequency and amplitude.""".trimMargin(),
            """Nodes are points of maximum displacement on 
                |a standing wave.""".trimMargin())

        //declare an array to be used in the code; This code was adapted from W3 Schools (2025): https://www.w3schools.com/kotlin/kotlin_arrays.php
        val answers = arrayOf(true, false, false, true, false)

        //declare loop control variables to allow to while loop to run
        var counter = 0

        //declare a variable to keep track of the amount of questions that the user gets right.
        var score = 0

        //displays the text in green when the app is run; This code was adapted from Geeks for Geeks (2025): https://www.geeksforgeeks.org/textview-in-kotlin/
        txtBody.text = """
            Your physics topic is: wave theory.
            Press 'start quiz' to begin. 
        """.trimIndent()


            //starts the quiz once the button is clicked; This code was adapted from W3 Schools (2025): https://www.w3schools.com/kotlin/kotlin_conditions.php
            btnNext.setOnClickListener {
                //Displays the heading from the array depending on the counter position
                txtHeading.text = "${headings[counter]}"

                //Displays the question from the array depending on the counter position
                txtBody.text = "${questions[counter]}"

                //changes the text of the button one the quiz is started
                btnNext.text = "Next"

                //tells the user if their answer is right or wrong depending on which button they pressed
                btnTrue.setOnClickListener {
                    //runs an if statement to check the answer; This code was adapted from W3 Schools (2025): https://www.w3schools.com/kotlin/kotlin_conditions.php
                    if (answers[counter] == true) {
                        txtBody.text = "Correct!"

                        //adds 1 to the score counter if the answer is correct
                        score += 1
                    } else {
                        txtBody.text = "Incorrect!"
                    }
                }
                //runs an if statement to check the answer; This code was adapted from W3 Schools (2025): https://www.w3schools.com/kotlin/kotlin_conditions.php
                btnFalse.setOnClickListener {
                    if (answers[counter] == false) {
                        txtBody.text = "Correct!"

                        //adds 1 to the score counter if the answer is correct
                        score += 1
                    } else {
                        txtBody.text = "Incorrect!"
                    }
                }
                counter += 1

            }


        //changes the function of the next button once all of the questions have been answered; This code was adapted from W3 Schools (2025): https://www.w3schools.com/kotlin/kotlin_conditions.php
        if (counter >= 5) {

            //switches to the summary page once the button is clicked; This code was adapted from a Stack Overflow post by "Zer0" (2014): https://stackoverflow.com/questions/10036157/how-to-navigate-from-one-page-to-another-on-androidtotal3-pages
            btnNext.setOnClickListener{
                val intent = Intent(this, Summary::class.java)

                startActivity(intent)
            }
        }


    }
}

// Title: Kotlin Arrays
// Author: W3 Schools
// Date: 21 May 2025
// Version: 1.0
// Available: https://www.w3schools.com/kotlin/kotlin_arrays.php

// Title: TextView in Kotlin
// Author: Geeks for Geeks
// Date: 24 February 2025
// Version: 1.0
// Available: https://www.geeksforgeeks.org/textview-in-kotlin/

// Title: Kotlin If ... Else
// Author: W3 Schools
// Date: 21 May 2025
// Version: 1.0
// Available: https://www.w3schools.com/kotlin/kotlin_conditions.php

// Title: Button in Android
// Author: Geeks for Geeks
// Date: 23 January 2025
// Version: 1.0
// Available: https://www.geeksforgeeks.org/button-in-kotlin/

// Title: How to navigate from one page to another on android? (Total:3 pages)
// Author: StackOverflow
// Date: 22 June 2014
// Version: 1.0
// Available: https://stackoverflow.com/questions/10036157/how-to-navigate-from-one-page-to-another-on-androidtotal3-pages