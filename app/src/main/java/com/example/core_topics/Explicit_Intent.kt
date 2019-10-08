package com.example.core_topics

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explicit__intent.*

class Explicit_Intent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit__intent)
        val Bundle:Bundle?=intent.extras
        val rec=Bundle?.get("key1")
        textView2.text=rec.toString()
        button2.setOnClickListener(){
            //intent = Intent(this,MainActivity::class.java)
            //startActivity(intent)
            // implicit intent
            val intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("03044436009"))
            startActivity(Intent.createChooser(intent,"Share"))
        }

    }
}
