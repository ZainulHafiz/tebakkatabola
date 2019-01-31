package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Iwobi : AppCompatActivity() {

    //deklarasi button
    lateinit var Iwobi1: Button
    lateinit var Iwobi2: Button
    lateinit var Iwobi3: Button
    lateinit var Iwobi4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iwobi)

        //Samakan tombol dari xml ke kotlin

        Iwobi1=findViewById(R.id.iwobi1)
        Iwobi2=findViewById(R.id.iwobi2)
        Iwobi3=findViewById(R.id.iwobi3)
        Iwobi4=findViewById(R.id.iwobi4)

        //Panggil button
        Iwobi1.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Iwobi2.setOnClickListener {

            Toast.makeText(applicationContext, "Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Iwobi3.setOnClickListener {

            Toast.makeText(applicationContext,"Anda Salah", Toast.LENGTH_SHORT).show()
        }
        Iwobi4.setOnClickListener {
            startActivity(Intent(this, Belerin::class.java))
            Toast.makeText(applicationContext,"Anda Benar", Toast.LENGTH_SHORT).show()
            finish()



        }
    }
}
