package com.example.retryalertdialogfilekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.button_dialog_choice)

        button.setOnClickListener {
            val fragment = FlieKotlinAlertDialogFragment()

            fragment.listener = object:FlieKotlinAlertDialogFragment.onDecidedFun{

                override fun onClickOk() {
                    val fragmentOther = OhterDialogConfirmeAllDelete()
                    fragmentOther.show(supportFragmentManager,"MainActivity")
                }

                override fun onClickCancel() {

                }
            }

            fragment.show(supportFragmentManager,"DialogConfirmedDeleted")

        }
    }
}
