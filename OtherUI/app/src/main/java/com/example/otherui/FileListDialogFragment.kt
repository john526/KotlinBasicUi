package com.example.otherui

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment

class FileListDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(activity)

        val inflater = activity?.layoutInflater

        builder.setView(inflater?.inflate(R.layout.dialog_file_list,null))
            .setPositiveButton("Delete",null)
            .setNegativeButton("Cancel",null)
            .setTitle("file deleted")


        return builder.create()
    }
}