package com.example.muhd_syamil_quiz2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var resultView: TextView
    private lateinit var textA: EditText
    private lateinit var textB: EditText
    private lateinit var textC: EditText
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultView = findViewById(R.id.resultView)
        textA = findViewById(R.id.textA)
        textB = findViewById(R.id.textB)
        textC = findViewById(R.id.textC)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)

        button1.setOnClickListener {
            val a = textA.text.toString().toIntOrNull() ?: 0
            val b = textB.text.toString().toIntOrNull() ?: 0
            val c = textC.text.toString().toIntOrNull() ?: 0
            val result = a + b + c
            resultView.text = result.toString()
        }

        button2.setOnClickListener {
            val a = textA.text.toString().toIntOrNull() ?: 0
            val b = textB.text.toString().toIntOrNull() ?: 0
            val c = textC.text.toString().toIntOrNull() ?: 0
            val result = a - b + c
            resultView.text = result.toString()
        }

        button3.setOnClickListener {
            val a = textA.text.toString().toIntOrNull() ?: 0
            val b = textB.text.toString().toIntOrNull() ?: 0
            val c = textC.text.toString().toIntOrNull() ?: 0
            val result = a * b - c
            resultView.text = result.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("textA", textA.text.toString())
        outState.putString("textB", textB.text.toString())
        outState.putString("textC", textC.text.toString())
        outState.putString("result", resultView.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textA.setText(savedInstanceState.getString("textA"))
        textB.setText(savedInstanceState.getString("textB"))
        textC.setText(savedInstanceState.getString("textC"))
        resultView.text = savedInstanceState.getString("result")
    }
}