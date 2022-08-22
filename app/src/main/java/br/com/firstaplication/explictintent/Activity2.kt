package br.com.firstaplication.explictintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)

        val result = intent.getStringExtra("Name").toString()
        val finalText = "$result, welcome to activity2"

        tvWelcome.setText(finalText)

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()
        }
    }
}