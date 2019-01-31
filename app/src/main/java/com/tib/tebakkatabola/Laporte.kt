package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Laporte : AppCompatActivity() {

    //deklarasi button
    lateinit var Laporte1: Button
    lateinit var Laporte2: Button
    lateinit var Laporte3: Button
    lateinit var Laporte4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laporte)

        //Samakan tombol dari xml ke kotlin

       Laporte1=findViewById(R.id.laporte1)
        Laporte2=findViewById(R.id.laporte2)
        Laporte3=findViewById(R.id.laporte3)
        Laporte4=findViewById(R.id.laporte4)

        //Panggil button
        Laporte1.setOnClickListener {
            startActivity(Intent(this,Sane::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()
        }
        Laporte2.setOnClickListener {

            Toast.makeText(applicationContext, "Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Laporte3.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Laporte4.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
