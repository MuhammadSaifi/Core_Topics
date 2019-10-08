package com.example.core_topics

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert_dialoge.*

class AlertDialoge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialoge)
        val button = findViewById<Button>(R.id.button)

       button.setOnClickListener{
           val alert=AlertDialog.Builder(this)
           alert.setTitle("Do you want to save it!")
           alert.setPositiveButton("Yes"){dialogInterface,which ->
                textView.text="You Select Save"
           }
           alert.setNegativeButton("No"){
               dialogInterface, which ->
               textView.text="You Select No"
           }
           alert.setNeutralButton("Cancel"){
               dialogInterface, which ->
               textView.text="You select Cancel"
           }
           alert.setIcon(android.R.drawable.ic_dialog_alert)

           alert.setMessage("Please Select option")
           alert.create()
           alert.setCancelable(false)
           alert.show()

       }
    }
}
