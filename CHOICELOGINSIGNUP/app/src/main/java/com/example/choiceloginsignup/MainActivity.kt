package com.example.choiceloginsignup

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textMain = findViewById<View>(R.id.textWelcome)

        textMain.setOnClickListener {
            val intentForwardChoice = Intent(this, ChoiceLogSin::class.java)
            startActivity(intentForwardChoice)
        }
    }


}
