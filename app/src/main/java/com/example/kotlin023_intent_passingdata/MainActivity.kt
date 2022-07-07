package com.example.kotlin023_intent_passingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Etname = findViewById<EditText>(R.id.EtName)
        val Etemail = findViewById<EditText>(R.id.EtEmail)
        val Etphone = findViewById<EditText>(R.id.EtPhone)
        val Btnsave = findViewById<Button>(R.id.BtnSave)

        Btnsave.setOnClickListener(){
            val name = Etname.text.toString()
            val email = Etemail.text.toString()
            val phone = Etphone.text.toString()

            val intent = Intent(this@MainActivity,FirstActivity::class.java)
            intent.putExtra("NameKey" , name)
            intent.putExtra("EmailKey" , email)
            intent.putExtra("PhoneKey" , phone)
            startActivity(intent)
        }
    }
}