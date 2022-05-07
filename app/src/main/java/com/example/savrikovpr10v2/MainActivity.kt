package com.example.savrikovpr10v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoOver = findViewById<Button>(R.id.GoOver);

        btnGoOver.setOnClickListener {

        }
    }
}