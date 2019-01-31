package com.tib.tebakkatabola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menuhome : AppCompatActivity() {

    //inisialisasi button
    lateinit var United: Button
    lateinit var Celsi: Button
    lateinit var Arsenal: Button
    lateinit var City: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuhome)

        // Samakan tombol button
        United= findViewById(R.id.united)
        Celsi= findViewById(R.id.celsi)
        Arsenal= findViewById(R.id.arsenal)
        City= findViewById(R.id.city)


        United.setOnClickListener {
            startActivity(Intent(this,Dalot::class.java))
        }

        Celsi.setOnClickListener {
            startActivity(Intent(this,Alonso::class.java))
        }

        City.setOnClickListener {
            startActivity(Intent(this,Bernardo::class.java))
        }

        Arsenal.setOnClickListener {
            startActivity(Intent(this,Iwobi::class.java))
        }


    }
}
