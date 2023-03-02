package com.example.test.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val button = findViewById<Button>(R.id.letsgobutton)
        
        button.setOnClickListener {
            Toast.makeText(applicationContext, "WELCOME", Toast.LENGTH_SHORT).show()
            intent= Intent(applicationContext,secondActivity::class.java)
            startActivity(intent)
        }
    }
}