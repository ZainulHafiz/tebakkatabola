package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Gundogan : AppCompatActivity() {

    //deklarasi button
    lateinit var Gundogan1: Button
    lateinit var Gundogan2 : Button
    lateinit var Gundogan3: Button
    lateinit var Gundogan4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gundogan)

        //Samakan tombol dari xml ke kotlin

        Gundogan1=findViewById(R.id.gundogan1)
        Gundogan2=findViewById(R.id.gundogan2)
        Gundogan3=findViewById(R.id.gundogan3)
        Gundogan4=findViewById(R.id.gundogan4)

        //Panggil button
        Gundogan1.setOnClickListener {
            startActivity(Intent(this,Laporte::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()
        }
        Gundogan2.setOnClickListener {

            Toast.makeText(applicationContext, "Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Gundogan3.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
       Gundogan4.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
