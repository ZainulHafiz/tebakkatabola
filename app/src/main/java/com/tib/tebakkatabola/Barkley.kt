package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Barkley : AppCompatActivity() {

    //deklarasi button
    lateinit var Barkley1: Button
    lateinit var Barkley2: Button
    lateinit var Barkley3: Button
    lateinit var Barkley4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barkley)

        //Samakan tombol dari xml ke kotlin

        Barkley1=findViewById(R.id.barkley1)
        Barkley2=findViewById(R.id.barkley2)
        Barkley3=findViewById(R.id.barkley3)
        Barkley4=findViewById(R.id.barkley4)

        //Panggil button
           Barkley1.setOnClickListener {

                Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
            }
            Barkley2.setOnClickListener {
                startActivity(Intent(this, Hudson::class.java))
                Toast.makeText(applicationContext, "Anda Benar", Toast.LENGTH_SHORT).show()
                finish()
            }
           Barkley3.setOnClickListener {

                Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
            }
            Barkley4.setOnClickListener {

                Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
