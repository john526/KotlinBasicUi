package tdkf.fev.findage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*buttonText.setOnClickListener {
            val yearOfBirth:Int = editAge.text.toString().toInt()

            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = 2020 - yearOfBirth
            viewAge.text = "Your age in this Year is : ${myAge.toString()}"
        }*/



    }

    fun buTextEvent(view: View) {
        buttonText.setOnClickListener {

            val yearOfBirth:Int = editAge.text.toString().toInt()

            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val currentAge = currentYear - yearOfBirth
            viewAge.text = "Your actual age in this year is : ${currentAge.toString()}"

        }
    }
}