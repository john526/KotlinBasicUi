package com.example.choiceloginsignup

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class Login: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLogin = findViewById<View>(R.id.buttonLogin).setOnClickListener {
            val buttonLoginIntent = Intent(this,Ui::class.java)
            startActivity(buttonLoginIntent)
        }

        val buttonMainSignUp = findViewById<View>(R.id.buttonMainSignUp).setOnClickListener {
            val signupIntent = Intent(this, Signup::class.java)
            startActivity(signupIntent)
        }

        val buttonMainForgotPassword = findViewById<View>(R.id.buttonMainForgotPassword).setOnClickListener {
            val forgotIntent = Intent(this, Forgot::class.java)
            startActivity(forgotIntent)
        }
    }


}