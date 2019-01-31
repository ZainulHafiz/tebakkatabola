package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sane.*

class Pogba : AppCompatActivity() {

    //deklarasi button
    lateinit var Pogba1: Button
    lateinit var Pogba2: Button
    lateinit var Pogba3: Button
    lateinit var Pogba4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pogba)

        //Samakan tombol dari xml ke kotlin

        Pogba1=findViewById(R.id.pogba1)
        Pogba2=findViewById(R.id.pogba2)
        Pogba3=findViewById(R.id.pogba3)
        Pogba4=findViewById(R.id.pogba4)

        //Panggil button
        Pogba1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Pogba2.setOnClickListener {

            Toast.makeText(applicationContext, "Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Pogba3.setOnClickListener {
            startActivity(Intent(this,Menuhome::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            super.finish()
        }
        Pogba4.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
