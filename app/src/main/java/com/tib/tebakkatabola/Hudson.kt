package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Hudson : AppCompatActivity() {

    //deklarasi button
    lateinit var Hudson1: Button
    lateinit var Hudson2: Button
    lateinit var Hudson3: Button
    lateinit var Hudson4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hudson)

        //Samakan tombol dari xml ke kotlin

        Hudson1=findViewById(R.id.hudson1)
        Hudson2=findViewById(R.id.hudson2)
        Hudson3=findViewById(R.id.hudson3)
        Hudson4=findViewById(R.id.hudson4)

        //Panggil button
        Hudson1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
       Hudson2.setOnClickListener {
           startActivity(Intent(this, Jorginho::class.java))
           Toast.makeText(applicationContext, "Anda Benar", Toast.LENGTH_SHORT).show()
           finish()
       }
       Hudson3.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Hudson4.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
