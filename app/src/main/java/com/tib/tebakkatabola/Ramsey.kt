package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lacazzete.*

class Ramsey : AppCompatActivity() {

    //deklarasi button
    lateinit var Ramsey1: Button
    lateinit var Ramsey2: Button
    lateinit var Ramsey3: Button
    lateinit var Ramsey4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ramsey)

        Ramsey1=findViewById(R.id.ramsey1)
        Ramsey2=findViewById(R.id.ramsey2)
        Ramsey3=findViewById(R.id.ramsey3)
        Ramsey4=findViewById(R.id.ramsey4)

        //Panggil button
        Ramsey1.setOnClickListener {
            startActivity(Intent(this,Xaka::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()
        }
        Ramsey2.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }

        Ramsey3.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Ramsey4.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }

    }
}
