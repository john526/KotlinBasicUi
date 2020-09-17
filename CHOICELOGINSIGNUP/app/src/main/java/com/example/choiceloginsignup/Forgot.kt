package com.example.choiceloginsignup

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class Forgot:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        val buttonForgot = findViewById<View>(R.id.buttonForgot).setOnClickListener {
            val buttonForgotIntent = Intent(this, NewPassword::class.java)
            startActivity(buttonForgotIntent)
        }
    }
}