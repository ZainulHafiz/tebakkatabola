package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_matic.*

class Matic : AppCompatActivity() {

    //deklarasi button
    lateinit var Matic1: Button
    lateinit var Matic2: Button
    lateinit var Matic3: Button
    lateinit var Matic4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matic)

        //Samakan tombol dari xml ke kotlin

        Matic1=findViewById(R.id.matic1)
        Matic2=findViewById(R.id.matic2)
        Matic3=findViewById(R.id.matic3)
        Matic4=findViewById(R.id.matic4)

        //Panggil button
        Matic1.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        matic2.setOnClickListener {
            startActivity(Intent(this,Pogba::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()
        }

        Matic3.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Matic4.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
