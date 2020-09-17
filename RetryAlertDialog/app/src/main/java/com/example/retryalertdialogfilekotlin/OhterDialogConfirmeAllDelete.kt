package com.example.retryalertdialogfilekotlin

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment

class OhterDialogConfirmeAllDelete : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?):Dialog {

        val build = AlertDialog.Builder(activity)
        val inflater = activity?.layoutInflater

        build.setView(inflater?.inflate(R.layout.delete_file_layout,null))
            .setPositiveButton("Yes I sure",null)
            .setNegativeButton("No I not sure",null)
            .setTitle("This is the all documents ")
        return build.create()
    }
}