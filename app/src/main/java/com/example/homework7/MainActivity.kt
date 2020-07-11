 package com.example.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val BtnRose = findViewById<Button>(R.id.BtnRose)
        val BtnCactus = findViewById<Button>(R.id.BtnCactus)
        val BtnOAK = findViewById<Button>(R.id.BtnOak)

        val rose = RozeActivity()
        val cactus = CactusActivity()
        val oak = Oak()

        BtnRose.setOnClickListener {
            rose.makeAction()

            Toast.makeText(applicationContext, "Роза растет", Toast.LENGTH_LONG ).show()

        }

        BtnCactus.setOnClickListener {
            cactus.makeAction()

            Toast.makeText(applicationContext, "Кактус растет ", Toast.LENGTH_LONG ).show()

        }



        BtnOAK.setOnClickListener{
            oak.makeAction()

            Toast.makeText(applicationContext, "Дуб растет", Toast.LENGTH_LONG ).show()

        }
    }
}