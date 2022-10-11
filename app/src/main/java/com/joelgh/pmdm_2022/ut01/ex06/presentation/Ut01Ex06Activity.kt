package com.joelgh.pmdm_2022.ut01.ex06.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.joelgh.pmdm_2022.R
import com.joelgh.pmdm_2022.ut01.ex06.domain.Cat

class Ut01Ex06Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01_ex06)
        setupView()
    }

    private fun setupView(){
        val inputName = findViewById<EditText>(R.id.input_name)
        val inputSurname = findViewById<EditText>(R.id.input_surname)
        val actionSave = findViewById<Button>(R.id.action_save)

        actionSave.setOnClickListener {
            val cat = Cat(
                inputName.text.toString(),
                inputSurname.text.toString()
            )

            Log.d("@dev", "Cat: $cat")
        }
    }
}