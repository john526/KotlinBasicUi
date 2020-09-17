package com.example.retryalertdialogfilekotlin

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.util.Log

class FlieKotlinAlertDialogFragment : DialogFragment() {

    val TAG = FlieKotlinAlertDialogFragment::class.java.simpleName

    var listener:onDecidedFun?=null

    interface onDecidedFun{
        fun onClickOk()
        fun onClickCancel()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(activity)

        builder.setMessage("Are sure to delete all information of this phone ?")
            .setPositiveButton("Yes I sure",object: DialogInterface.OnClickListener{

                override fun onClick(dialog: DialogInterface?, id: Int) {
                    Log.i(TAG, " Ok")
                    listener?.onClickOk()
                }
            })
            .setNegativeButton("No I not sure", DialogInterface.OnClickListener{dialog,id->
                Log.i(TAG,"No")
                listener?.onClickCancel()
            })
        return builder.create()
    }
}