package com.tib.tebakkatabola

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    //deklarasi button
    lateinit var Playy: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Samakan tombol dari xml ke kotlin

        Playy=findViewById(R.id.play)


        //Panggil button
        Playy.setOnClickListener {
            startActivity(Intent(this, Menuhome::class.java))
        }


    }
}
