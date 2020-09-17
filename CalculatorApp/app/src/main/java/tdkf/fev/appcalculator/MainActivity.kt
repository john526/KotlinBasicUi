package tdkf.fev.appcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberEvent(view: View){

        if(isNewOp==true){
            etShowNumber.setText("")
        }
        isNewOp =false
        val buSelect = view as Button
        var buClickValue:String = etShowNumber.text.toString()

        when(buSelect.id){

            bu0.id ->{
                buClickValue += "0"
            }
            bu1.id->{
                buClickValue += "1"
            }
            bu2.id->{
                buClickValue += "2"
            }
            bu3.id->{
                buClickValue += "3"
            }
            bu4.id->{
                buClickValue += "4"
            }
            bu5.id->{
                buClickValue += "5"
            }
            bu6.id->{
                buClickValue += "6"
            }
            bu7.id->{
                buClickValue += "7"
            }
            bu8.id->{
                buClickValue += "8"
            }
            bu9.id->{
                buClickValue += "9"
            }
            buDot.id->{
                //TODO : prevent adding morve than dot
                buClickValue += "."
            }
            buttonPlusMinues.id->{
                buClickValue = "-" + buClickValue
            }
        }
        etShowNumber.setText(buClickValue)
    }

    var op ="*"
    var olderNumber =""
    var isNewOp = true

    fun buOpEevent(view: View){
        val buSelect = view as Button

        when(buSelect.id){

            buDiv.id->{
                op="/"

            }
            buSub.id->{
                op="-"
            }
            buMul.id->{
                op="*"
            }
            buSum.id->{
                op="+"
            }
        }
        olderNumber = etShowNumber.text.toString()
        isNewOp=true
    }

    fun buEqual(view: View) {

        var newNumber= etShowNumber.text.toString()
        var finalNumber:Double?=null

        when(op){

            "*"->{
                finalNumber = olderNumber.toDouble() * newNumber.toDouble()
            }
            "+"->{
                finalNumber = olderNumber.toDouble() + newNumber.toDouble()
            }
            "/"->{
                finalNumber = olderNumber.toDouble() / newNumber.toDouble()
            }
            "-"->{
                finalNumber = olderNumber.toDouble() - newNumber.toDouble()
            }
        }
        etShowNumber.setText(finalNumber.toString())
        isNewOp=true
    }

    fun buPercentEvent(view: View){
        var number:Double = etShowNumber.text.toString().toDouble()
        etShowNumber.setText(number.toString())
    }
    fun buClean(view: View){
        etShowNumber.setText("0")
        isNewOp=true
    }
}