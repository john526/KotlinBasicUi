package com.example.otherui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.show_dialog_button)

        button.setOnClickListener{
            Log.i("MainActivity","Click on show dialog button")


            val fragment = ConfirmedDeletedDialogFragment()
            fragment.listener = object:ConfirmedDeletedDialogFragment.OnChoiceConfirmeDelete{
                override fun onClickConfirmed() {
                    Log.i("MainActivity","onClickConfirmed()")
                    val fileListDialogFragment = FileListDialogFragment()
                    fileListDialogFragment.show(supportFragmentManager,"fileList")
                }

                override fun onClickNoConfirmed() {
                    Log.i("MainActivity","onClickNoConfirmed()")
                }

            }
            fragment.show(supportFragmentManager,"confirmedelete")

        }
    }
}
