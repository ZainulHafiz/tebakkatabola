package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Dalot : AppCompatActivity() {

    //deklarasi button
    lateinit var Dalot1: Button
    lateinit var Dalot2: Button
    lateinit var Dalot3: Button
    lateinit var Dalot4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dalot)

        //Samakan tombol dari xml ke kotlin

        Dalot1=findViewById(R.id.dalot1)
        Dalot2=findViewById(R.id.dalot2)
        Dalot3=findViewById(R.id.dalot3)
        Dalot4=findViewById(R.id.dalot4)

        //Panggil button
        Dalot1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Dalot2.setOnClickListener {

            Toast.makeText(applicationContext, "Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Dalot3.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Dalot4.setOnClickListener {
            startActivity(Intent(this,Degea::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()


        }
    }
}
