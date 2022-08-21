package br.com.firstaplication.explictintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
    }
}