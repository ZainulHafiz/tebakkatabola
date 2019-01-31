package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Belerin : AppCompatActivity() {

    //deklarasi button
    lateinit var Belerin1: Button
    lateinit var Belerin2: Button
    lateinit var Belerin3: Button
    lateinit var Belerin4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belerin)

        //Samakan tombol dari xml ke kotlin

        Belerin1=findViewById(R.id.belerin1)
        Belerin2=findViewById(R.id.belerin2)
        Belerin3=findViewById(R.id.belerin3)
        Belerin4=findViewById(R.id.belerin4)


        //Panggil button
        Belerin1.setOnClickListener {
            startActivity(Intent(this,Lacazzete::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()
        }
        Belerin2.setOnClickListener {

            Toast.makeText(applicationContext, "Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Belerin3.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Belerin4.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
