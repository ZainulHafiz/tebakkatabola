package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Degea : AppCompatActivity() {

    //deklarasi button
    lateinit var Degea1: Button
    lateinit var Degea2: Button
    lateinit var Degea3: Button
    lateinit var Degea4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_degea)

        //Samakan tombol dari xml ke kotlin

        Degea1=findViewById(R.id.degea1)
        Degea2=findViewById(R.id.degea2)
        Degea3=findViewById(R.id.degea3)
        Degea4=findViewById(R.id.degea4)

        //Panggil button
        Degea1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Degea2.setOnClickListener {

            startActivity(Intent(this, Marcus::class.java))
            Toast.makeText(applicationContext, "Anda Benar", Toast.LENGTH_SHORT).show()
            finish()
        }
        Degea3.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Degea4.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
