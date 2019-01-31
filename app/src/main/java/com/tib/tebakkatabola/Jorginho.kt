package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Jorginho : AppCompatActivity() {

    //deklarasi button
    lateinit var Jorginho1: Button
    lateinit var Jorginho2: Button
    lateinit var Jorginho3: Button
    lateinit var Jorginho4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jorginho)

        //Samakan tombol dari xml ke kotlin

        Jorginho1=findViewById(R.id.jorginho1)
        Jorginho2=findViewById(R.id.jorginho2)
        Jorginho3=findViewById(R.id.jorginho3)
        Jorginho4=findViewById(R.id.jorginho4)

        //Panggil button
        Jorginho1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Jorginho2.setOnClickListener {

        }
        Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        Jorginho3.setOnClickListener {
            startActivity(Intent(this, Menuhome::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            super.finish()
        }
        Jorginho4.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
