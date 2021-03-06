package com.darkbeast0106.elsomobilapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnBevitel: Button
    private lateinit var etNev: EditText
    private lateinit var textHello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        btnBevitel.setOnClickListener {
            val nev = etNev.text
            val koszones = "Hello $nev"
            textHello.text = koszones
        }
    }

    private fun init() {
        btnBevitel = findViewById(R.id.btn_bevitel)
        etNev = findViewById(R.id.et_nev)
        textHello = findViewById(R.id.text_hello)
    }
}