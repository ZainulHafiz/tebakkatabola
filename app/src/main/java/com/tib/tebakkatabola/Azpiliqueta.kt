package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Azpiliqueta : AppCompatActivity() {

    //deklarasi button
    lateinit var Azpiliqueta1: Button
    lateinit var Azpiliqueta2: Button
    lateinit var Azpiliqueta3: Button
    lateinit var Azpiliqueta4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azpiliqueta)

        //Samakan tombol dari xml ke kotlin

        Azpiliqueta1=findViewById(R.id.azpiliqueta1)
        Azpiliqueta2=findViewById(R.id.azpiliqueta2)
        Azpiliqueta3=findViewById(R.id.azpiliqueta3)
        Azpiliqueta4=findViewById(R.id.azpiliqueta4)

        //Panggil button
        //Panggil button
        Azpiliqueta1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
       Azpiliqueta2.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
       Azpiliqueta3.setOnClickListener {
           startActivity(Intent(this, Barkley::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
           finish()
        }
       Azpiliqueta4.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }

    }
}
