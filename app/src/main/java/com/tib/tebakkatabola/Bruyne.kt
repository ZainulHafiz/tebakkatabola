package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Bruyne : AppCompatActivity() {

    //deklarasi button
    lateinit var Bruyne1: Button
    lateinit var Bruyne2: Button
    lateinit var Bruyne3: Button
    lateinit var Bruyne4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bruyne)

        //Samakan tombol dari xml ke kotlin

        Bruyne1=findViewById(R.id.bruyne1)
        Bruyne2=findViewById(R.id.bruyne2)
        Bruyne3=findViewById(R.id.bruyne3)
        Bruyne4=findViewById(R.id.bruyne4)

        //Panggil button
        Bruyne1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Bruyne2.setOnClickListener {

            Toast.makeText(applicationContext, "Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Bruyne3.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Bruyne4.setOnClickListener {
            startActivity(Intent(this,Gundogan::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()



        }
    }
}
