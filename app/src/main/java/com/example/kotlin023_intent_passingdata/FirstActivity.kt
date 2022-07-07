package com.example.kotlin023_intent_passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val intent = intent
        val name = intent.getStringExtra("NameKey")
        val email = intent.getStringExtra("EmailKey")
        val phone = intent.getStringExtra("PhoneKey")

        val Tvresult = findViewById<TextView>(R.id.TvResult)
        Tvresult.text = "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone

    }
}