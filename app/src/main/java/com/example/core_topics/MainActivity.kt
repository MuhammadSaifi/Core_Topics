package com.example.core_topics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(View.OnClickListener{
            val msg=textview1.text.toString()
            val intent= Intent(this,Explicit_Intent::class.java)
            intent.putExtra("key1",msg)
            startActivity(intent)
        })
    }
}
