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



    }
}