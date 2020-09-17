package com.example.choiceloginsignup

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class NewPassword:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_new)

        val buttonNewPassword = findViewById<View>(R.id.buttonNewPassword).setOnClickListener {
            val buttonNewPasswordIntent = Intent(this,Login::class.java)
            startActivity(buttonNewPasswordIntent)
        }
    }
}