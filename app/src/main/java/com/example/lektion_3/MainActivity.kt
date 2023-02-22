package com.example.lektion_3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstBtn:ImageButton=findViewById(R.id.btn_Start)//button

         firstBtn.setOnClickListener {
           val firstNavigate=Intent(this,SignInActivity::class.java)

           startActivity(firstNavigate)
       }




    }
}

