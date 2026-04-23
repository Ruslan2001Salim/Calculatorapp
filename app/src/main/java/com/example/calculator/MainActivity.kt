package com.example.calculator
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edit1 = findViewById<EditText>(R.id.editText1)
        val edit2 = findViewById<EditText>(R.id.editText2)
        val btn = findViewById<Button>(R.id.buttonAdd)
        val res = findViewById<TextView>(R.id.textViewResult)
        btn.setOnClickListener {
            val a = edit1.text.toString().toDoubleOrNull() ?: 0.0
            val b = edit2.text.toString().toDoubleOrNull() ?: 0.0
            res.text = "Result: ${a + b}"
        }
    }
}
