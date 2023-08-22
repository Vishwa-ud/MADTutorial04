package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigate: Button = findViewById(R.id.button)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val btnSendData: Button = findViewById(R.id.button)
        val editTextName:EditText = findViewById(R.id.editTextName)
        btnSendData.setOnClickListener {

            val name = editTextName.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER_NAME", name)
            startActivity(intent)
        }

        val btnOpenWeb: Button = findViewById(R.id.btnOpenWeb)
        btnOpenWeb.setOnClickListener {
            val webpage = Uri.parse("http://www.google.com")
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
        val btnDialPhone: Button = findViewById(R.id.btnDialPhone)
        btnDialPhone.setOnClickListener {
            val phoneUri = Uri.parse("tel:1234567890")
            val intent = Intent(Intent.ACTION_DIAL, phoneUri)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }



    }

}