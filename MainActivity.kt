package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.assignment1.R.id.btnClear
import com.example.assignment1.R.id.btnHistory
import com.example.assignment1.R.id.edtAge
import com.example.assignment1.R.id.txtShowRes

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring views
        val edtAge = findViewById<EditText>(edtAge)
        val btnHistory = findViewById<Button>(btnHistory)
        val btnClear = findViewById<Button>(btnClear)
        val txtShowRes = findViewById<TextView>(txtShowRes)

    btnHistory?.setOnClickListener {
        val age = edtAge.text.toString().toIntOrNull()
        if (age != null){
            val result = when(age){
                in 0..12 -> "None"
                in 13..19 -> "No Figure"
                in 20..29 -> "Mac Miller"
                in 30.. 39 -> "Bruce Lee"
                in 40..49 -> "Elvis Presley"
                in 50..59 -> "Michael Jackson"
                in 60..69 -> "Louis Armstrong"
                in 70..79 -> "Louis Vuitton"
                in 80..89 -> "Gautama Buddha"
                in 90..100 -> "Nelson Mandela"
                else -> ""

            }
            txtShowRes.text = "Age: $age\n${
                when(result){
                    "None" -> "There are no existing notable figures who are in your age range."
                    "No Figure" -> "There are no famous figures at this age range."
                    "Mac Miller" -> "You are in the same range as Mac Miller , she died at the age of 26."
                    "Bruce Lee" -> "Same range as Bruce Lee , who died at the age of 32."
                    "Elvis Presley" -> "Same range as Elvis Presley , who died at the age of 42."
                    "Michael Jackson" -> "Same range as Michael Jackson , who died at the age of 53."
                    "Louis Armstrong" -> "Same range as Louis Armstrong , who died at the age of 69."
                    "Louis Vuitton" -> "Same range as Louis Vuitton, who died at the age of 70."
                    "Gautama Buddha" -> "Same range as Gautama Buddha, who died at the age of 80."
                    "Nelson Mandela" -> "Same range as Nelson Mandela, who died at the age of 95."
                    else -> "Enter appropriate age."

                }
            }"
         }else run {
        "Please enter a valid age.".also { txtShowRes.text = it }
    }
        }
        btnClear.setOnClickListener {
            edtAge.text.clear()
            "".also { txtShowRes.text = it }

        }

    }
}