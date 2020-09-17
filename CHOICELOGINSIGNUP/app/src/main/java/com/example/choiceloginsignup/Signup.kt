package com.example.choiceloginsignup

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val buttonSignup = findViewById<View>(R.id.buttonSignup).setOnClickListener {
            val buttonSignupIntent = Intent(this,Login::class.java)
            startActivity(buttonSignupIntent)
        }
    }
}