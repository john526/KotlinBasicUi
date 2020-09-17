package com.example.otherui

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.util.Log


class ConfirmedDeletedDialogFragment: DialogFragment(){

    val TAG = ConfirmedDeletedDialogFragment::class.java.simpleName

    var listener:OnChoiceConfirmeDelete? = null

    interface OnChoiceConfirmeDelete{
        fun onClickConfirmed()
        fun onClickNoConfirmed()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val buildAlertDialog = AlertDialog.Builder(activity)



        buildAlertDialog.setMessage("Do you want to delete all information on this phone")
            .setPositiveButton("Yes we want",object:DialogInterface.OnClickListener{

                override fun onClick(dialog: DialogInterface?, id: Int) {
                    Log.i(TAG,"Yes delete confirmed")
                    listener?.onClickConfirmed()
                }
            })
            .setNegativeButton("No No",DialogInterface.OnClickListener{dialog,id->
                Log.i(TAG,"No no")
                listener?.onClickNoConfirmed()
            })

        return buildAlertDialog.create()
    }
}