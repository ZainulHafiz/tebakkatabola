package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Xaka : AppCompatActivity() {

    //deklarasi button
    lateinit var Xaka1: Button
    lateinit var Xaka2: Button
    lateinit var Xaka3: Button
    lateinit var Xaka4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xaka)

        Xaka1=findViewById(R.id.xaka1)
        Xaka2=findViewById(R.id.xaka2)
        Xaka3=findViewById(R.id.xaka3)
        Xaka4=findViewById(R.id.xaka4)

        //Panggil button
        Xaka1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Xaka2.setOnClickListener {
            startActivity(Intent(this,Menuhome::class.java))

        Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            super.finish()
        }
        Xaka3.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
       Xaka4.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }

    }
}
