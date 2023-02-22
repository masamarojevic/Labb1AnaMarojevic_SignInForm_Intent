package com.example.lektion_3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        val btnNavigate: Button =findViewById(R.id.btn_navigate)//button component

        val inputUsername: EditText =findViewById(R.id.editText_username)//input username component

        val inputPassword: EditText=findViewById(R.id.inpt_password)//input password component

        val usernameArray = arrayOf("Ana")//array for username
        val passworArray = arrayOf("pass")//array for password




        //button on click
        btnNavigate.setOnClickListener {

            //navigation
            val intentNavigate=

                Intent(this,LoggedInActivity::class.java).apply { putExtra("key_username",inputUsername.text.toString()) }

            val username = inputUsername.text.toString()//saves the username

            val passwordUser = inputPassword.text.toString()//saves the password

            //if statement to check if username and passwords input contain the correct value
            if(usernameArray.contains(username) && passworArray.contains(passwordUser)){

                startActivity(intentNavigate)
            }
            else {

                Toast.makeText(this,"Not correct username or password, try again!",Toast.LENGTH_LONG).show()

            }








        }
    }
}