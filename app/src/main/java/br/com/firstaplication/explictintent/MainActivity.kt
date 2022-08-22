package br.com.firstaplication.explictintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import br.com.firstaplication.explictintent.Activity3 as Activity31

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName = findViewById<EditText>(R.id.etName)
        val btnAcitivy2 = findViewById<Button>(R.id.btnActivity2)
        val btnAcitivy3 = findViewById<Button>(R.id.btnActivity3)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val ACTIVITY2 = br.com.firstaplication.explictintent.Activity2::class.java
        val ACTIVITY3 = br.com.firstaplication.explictintent.Activity3::class.java
        val context = this
        btnAcitivy2.setOnClickListener {
            if (etName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please type your name", Toast.LENGTH_SHORT).show()
            }else {
                val text : String = etName.text.toString().trim()
                val intent : Intent = Intent(context, ACTIVITY2)
                intent.putExtra("Name", text)
                startActivity(intent)
            }
        }

    }
}