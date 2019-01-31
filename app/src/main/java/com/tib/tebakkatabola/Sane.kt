package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sane.*

class Sane : AppCompatActivity() {

    //deklarasi button
    lateinit var Sane1: Button
    lateinit var Sane2: Button
    lateinit var Sane3: Button
    lateinit var Sane4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sane)

        //Samakan tombol dari xml ke kotlin

        Sane1=findViewById(R.id.sane1)
        Sane2=findViewById(R.id.sane2)
        Sane3=findViewById(R.id.sane3)
        Sane4=findViewById(R.id.sane4)

        //Panggil button
        Sane1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Sane2.setOnClickListener {

            Toast.makeText(applicationContext, "Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Sane3.setOnClickListener {
            startActivity(Intent(this,Menuhome::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            super.finish()
        }
        sane4.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
