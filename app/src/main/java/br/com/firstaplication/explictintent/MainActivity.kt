package br.com.firstaplication.explictintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val btnActivity2 = findViewById<Button>(R.id.btnActivity2)
        val btnActivity3 = findViewById<Button>(R.id.btnActivity3)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val ACTIVITY2 = Activity2::class.java
        val ACTIVITY3 = Activity3::class.java
        val context = this

        btnActivity2.setOnClickListener {
            if (etName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please type your name", Toast.LENGTH_SHORT).show()
            }else {
                val text : String = etName.text.toString().trim()
                val intent = Intent(context, ACTIVITY2)
                intent.putExtra("Name", text)
                startActivity(intent)
                etName.setText("")
            }
        }

        val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {result: ActivityResult ->

            if (result.resultCode == RESULT_OK){
                val intent = result.data

                val text = intent?.getStringExtra("Surname") ?: "no data received"
                tvResult.text = text

//                if (intent != null) {
//                    val text = intent.getStringExtra("Surname")
//                    tvResult.setText(text)
//                } else {
//                    val textNull = "no text received"
//                    tvResult.setText(textNull)
//                }

            }

            if (result.resultCode == RESULT_CANCELED) {
                val cancelText = "The Activity was closed and no data was send"
                tvResult.text = cancelText
            }

            tvResult.visibility = View.VISIBLE
            etName.setText("")
            etName.focusable
        }

        btnActivity3.setOnClickListener {
            val intent = Intent(context, ACTIVITY3)
            startForResult.launch(intent)
        }

    }
}