package com.mimo.countingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickMe = findViewById<Button>(R.id.button)
        val myText = findViewById<TextView>(R.id.textView)
        var noOfClick = 0;
        var myString = ""
        clickMe.setOnClickListener {
            noOfClick += 1;
            myString = "Total Count $noOfClick"
            myText.text = myString
            Toast.makeText(this,myString,Toast.LENGTH_SHORT).show()




        }
    }
}