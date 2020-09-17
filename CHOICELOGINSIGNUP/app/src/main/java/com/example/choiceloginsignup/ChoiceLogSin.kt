package com.example.choiceloginsignup

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class ChoiceLogSin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice_ls)

        val textChoiceLogin = findViewById<View>(R.id.textChoiceLogin)

        val textChoiceSignUp = findViewById<View>(R.id.textChoiceSignUp)

        textChoiceLogin.setOnClickListener {
            val loginIntent = Intent(this, Login::class.java)
            startActivity(loginIntent)
        }
        textChoiceSignUp.setOnClickListener {
            val signupIntent = Intent(this, Signup::class.java)
            startActivity(signupIntent)
        }

    }
}