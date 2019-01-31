package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Marcus : AppCompatActivity() {

    //deklarasi button
    lateinit var Marcus1: Button
    lateinit var Marcus2: Button
    lateinit var Marcus3: Button
    lateinit var Marcus4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marcus)

        //Samakan tombol dari xml ke kotlin

        Marcus1=findViewById(R.id.marcus1)
        Marcus2=findViewById(R.id.marcus2)
        Marcus3=findViewById(R.id.marcus3)
        Marcus4=findViewById(R.id.marcus4)

        //Panggil button
        Marcus1.setOnClickListener {
            startActivity(Intent(this,Matic::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()
        }
       Marcus2.setOnClickListener {
           Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }

        Marcus3.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Marcus4.setOnClickListener {
            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()



        }
    }
}
