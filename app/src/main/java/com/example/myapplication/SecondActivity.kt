package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.secondacivity)


        val textViewGreeting: TextView = findViewById(R.id.textView)

        val intent = intent
        val name = intent.getStringExtra("USER_NAME")
        textViewGreeting.text = "Hello, $name!"

    }


}
