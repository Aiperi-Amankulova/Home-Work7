 package com.example.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRose = findViewById<Button>(R.id.BtnRose)
        val btnCactus = findViewById<Button>(R.id.BtnCactus)
        val btnOAK = findViewById<Button>(R.id.BtnOak)

        val rose = Roze()
        val cactus = Cactus()
        val oak = Oak()

        btnRose.setOnClickListener {
            rose.makeAction()

            Toast.makeText(applicationContext, "Роза растет", Toast.LENGTH_LONG ).show()

        }

        btnCactus.setOnClickListener {
            cactus.makeAction()

            Toast.makeText(applicationContext, "Кактус растет ", Toast.LENGTH_LONG ).show()

        }



        btnOAK.setOnClickListener{
            oak.makeAction()

            Toast.makeText(applicationContext, "Дуб растет", Toast.LENGTH_LONG ).show()

        }
    }
}