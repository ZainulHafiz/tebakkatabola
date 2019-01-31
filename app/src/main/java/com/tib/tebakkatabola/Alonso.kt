package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Alonso : AppCompatActivity() {

    //deklarasi button
    lateinit var Alonso1: Button
    lateinit var Alonso2: Button
    lateinit var Alonso3: Button
    lateinit var Alonso4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alonso)

        //Samakan tombol dari xml ke kotlin

        Alonso1=findViewById(R.id.alonso1)
        Alonso2=findViewById(R.id.alonso2)
        Alonso3=findViewById(R.id.alonso3)
        Alonso4=findViewById(R.id.alonso4)

        //Panggil button
        Alonso1.setOnClickListener {
            startActivity(Intent(this, Azpiliqueta::class.java))
            Toast.makeText(applicationContext,"Anda Benar",Toast.LENGTH_SHORT).show()
            finish()
        }
        Alonso2.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah",Toast.LENGTH_SHORT).show()
        }
        Alonso3.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah",Toast.LENGTH_SHORT).show()
        }
        Alonso4.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah",Toast.LENGTH_SHORT).show()
        }




    }
}
