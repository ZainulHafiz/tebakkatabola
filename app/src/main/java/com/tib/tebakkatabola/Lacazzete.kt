package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lacazzete.*

class Lacazzete : AppCompatActivity() {

    //deklarasi button
    lateinit var Lacazzete1: Button
    lateinit var Lacazzete2: Button
    lateinit var Lacazzete3: Button
    lateinit var Lacazzete4: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lacazzete)
        //Samakan tombol dari xml ke kotlin

        Lacazzete1=findViewById(R.id.lacazzete1)
        Lacazzete2=findViewById(R.id.lacazzete2)
        Lacazzete3=findViewById(R.id.lacazzete3)
        Lacazzete4=findViewById(R.id.lacazzete4)

        //Panggil button
       Lacazzete1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Lacazzete2.setOnClickListener {

            Toast.makeText(applicationContext, "Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Lacazzete3.setOnClickListener {
            startActivity(Intent(this,Ramsey::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()
        }
        lacazzete4.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
