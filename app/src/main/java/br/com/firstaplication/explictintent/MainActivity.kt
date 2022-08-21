package br.com.firstaplication.explictintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName = findViewById<EditText>(R.id.etName)
        val btnAcitivy2 = findViewById<Button>(R.id.btnActivity2)
        val btnAcitivy3 = findViewById<Button>(R.id.btnActivity3)
        val tvResult = findViewById<TextView>(R.id.tvResult)


        btnAcitivy2.setOnClickListener {
            if (etName.text.toList().isEmpty()) {
                Toast.makeText(this, "Please type your name", Toast.LENGTH_SHORT).show()
            }else {
                val intent : Intent = Intent()
            }
        }

    }
}