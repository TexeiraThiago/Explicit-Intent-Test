package br.com.firstaplication.explictintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val etSurname = findViewById<EditText>(R.id.etSurname)
        val btnSurname = findViewById<Button>(R.id.btnSubmit)

        btnSurname.setOnClickListener {

        }
    }
}