package br.com.firstaplication.explictintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val etSurname = findViewById<EditText>(R.id.etSurname)
        val btnSurname = findViewById<Button>(R.id.btnSubmit)
        val btnCancel = findViewById<Button>(R.id.btnCancel)

        btnSurname.setOnClickListener {
            if (etSurname.text.toString().isEmpty()){
                Toast.makeText(this, "Please type your Surname", Toast.LENGTH_SHORT).show()
            }else {
                val surName = etSurname.text.toString().trim()
                val intent = Intent()
                intent.putExtra("Surname", surName)
                setResult(RESULT_OK,intent)
                this.finish()
            }
        }

        btnCancel.setOnClickListener {
            setResult(RESULT_CANCELED)
            this.finish()
        }
    }
}