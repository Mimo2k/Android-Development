package com.example.coffe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bill = findViewById<TextView>(R.id.bill)
        val order = findViewById<Button>(R.id.order)
        val quantity = findViewById<EditText>(R.id.quantity)
        order.setOnClickListener {
           var num = 0.00f
             num = quantity.text.toString().toFloat()
            var totalPrice = 0.00f
            var gst = 0.00f
            totalPrice = num * 20
            gst = (0.18 * totalPrice).toFloat()
            val orderBook = "****** Bill ******\n quantity: $num\n Base price: $totalPrice\n Gst: $gst\n Total price: ${totalPrice+gst}"
            bill.text = orderBook
            Toast.makeText(this,"Order placed with total price ${totalPrice+gst}",Toast.LENGTH_SHORT).show()
        }

    }
}