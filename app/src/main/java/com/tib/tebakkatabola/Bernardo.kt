package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Bernardo : AppCompatActivity() {
    //deklarasi button
    lateinit var Bernardo1: Button
    lateinit var Bernardo2: Button
    lateinit var Bernardo3: Button
    lateinit var Bernardo4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bernardo)

        //Samakan tombol dari xml ke kotlin

        Bernardo1=findViewById(R.id.bernardo1)
        Bernardo2=findViewById(R.id.bernardo2)
        Bernardo3=findViewById(R.id.bernardo3)
        Bernardo4=findViewById(R.id.bernardo4)

        //Panggil button
        Bernardo1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Bernardo2.setOnClickListener {

        Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Bernardo3.setOnClickListener {
            startActivity(Intent(this,Bruyne::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()
        }
        Bernardo4.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
