package com.example.lektion_3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoggedInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)
        val displayUsername: TextView =findViewById(R.id.textView_displayUsername)//text view

        displayUsername.text=intent.getStringExtra("key_username")//load data

        val btnNavigate2: Button =findViewById(R.id.btn_aboutUs)//button

        btnNavigate2.setOnClickListener {   val intentNavigate2=
            Intent(this,AboutActivity::class.java)

            startActivity(intentNavigate2)
        }


    }

}