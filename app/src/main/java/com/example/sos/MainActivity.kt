//package com.example.emsmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sos.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SoSmessage.setText("Oh no i had an accident, Click the infor button to find out more!")
        val btnInfoChangeText = findViewById(R.id.button) as Button

        val sosMessage = findViewById(R.id.SoSmessage) as TextView
        btnInfoChangeText.setOnClickListener {
            sosMessage.text = "Yeah i have a bad fever!!"
        }
    }
}
