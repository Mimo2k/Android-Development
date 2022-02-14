package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* ArrayList */

        val myArrayList = ArrayList<String>()
        var myString:String = ""
        var mainString:String = ""
        var operator = true
        var dot = false



        /* TextView */
        // Input
        val input = findViewById<TextView>(R.id.tvInput)
        //Output
        val output = findViewById<TextView>(R.id.tvOutput)

        /* Row  1 */

        /* Root id's */
        val btn7 = findViewById<Button>(R.id.btnSeven)
        val btn8 = findViewById<Button>(R.id.btnEight)
        val btn9 = findViewById<Button>(R.id.btnNine)
        val btnDiv = findViewById<Button>(R.id.btnDivision)

        /* Click Listener's */

        btn7.setOnClickListener {

            myString += "7"
            operator = false
            input.text = myString
        }

        btn8.setOnClickListener {
            myString += "8"
            operator = false
            input.text = myString
        }

        btn9.setOnClickListener {
            myString += "9"
            operator = false
            input.text = myString

        }

        btnDiv.setOnClickListener {
           if(!operator) {
              myString += "/"
               input.text = myString
               operator = true
               dot = false
           }
            else{
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
           }

        }


        /* Row  2 */

        /* Root id's */
        val btn4 = findViewById<Button>(R.id.btnFour)
        val btn5 = findViewById<Button>(R.id.btnFive)
        val btn6 = findViewById<Button>(R.id.btnSix)
        val btnMul = findViewById<Button>(R.id.btnMultiply)

        /* Click Listener's */

        btn4.setOnClickListener {
            myString += "4"
            operator = false
            input.text = myString
        }

        btn5.setOnClickListener {
            myString += "5"
            operator = false
            input.text = myString
        }

        btn6.setOnClickListener {
            myString += "6"
            operator = false
            input.text = myString
        }

        btnMul.setOnClickListener {
            if(!operator) {
                myString += "*"
                input.text = myString
                operator = true
                dot = false
            }
            else{
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }


        /* Row  3 */

        /* Root id's */
        val btn1 = findViewById<Button>(R.id.btnOne)
        val btn2 = findViewById<Button>(R.id.btnTwo)
        val btn3 = findViewById<Button>(R.id.btnThree)
        val btnSub = findViewById<Button>(R.id.btnSubtraction)

        /* Click Listener's */

        btn1.setOnClickListener {
            myString += "1"
            operator = false
            input.text = myString
        }

        btn2.setOnClickListener {
            myString += "2"
            operator = false
            input.text = myString
        }

        btn3.setOnClickListener {
            myString += "3"
            operator = false
            input.text = myString
        }

        btnSub.setOnClickListener {
            if(!operator) {
                myString += "-"
                input.text = myString
                operator = true
                dot = false
            }
            else{
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }


        /* Row  4 */

        /* Root id's */
        val btn0 = findViewById<Button>(R.id.btnZero)
        val btnDot = findViewById<Button>(R.id.btnDot)
        val btnMod = findViewById<Button>(R.id.btnModulus)
        val btnAdd = findViewById<Button>(R.id.btnAddition)

        /* Click Listener's */

        btn0.setOnClickListener {
            myString += "0"
            operator = false
            input.text = myString
        }

        btnDot.setOnClickListener {
            if(!dot){
                myString += "."
                dot = true
                input.text = myString

            }else{
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        btnMod.setOnClickListener {
            if(!operator) {
                myString += "%"
                input.text = myString
                operator = true
                dot = false
            }
            else{
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        btnAdd.setOnClickListener {
            if(!operator) {
                myString += "+"
                input.text = myString
                operator = true
                dot = false
            }
            else{
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        /* Row  5 */

        /* Root id's */
        val btnClr = findViewById<Button>(R.id.btnClear)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnEqual = findViewById<Button>(R.id.btnEqual)

        /* Click Listener's */

        btnClr.setOnClickListener {
            myString = ""
            input.text = myString
            output.text = myString
            operator = true
            dot = false
        }

        btnBack.setOnClickListener {
            myString = myString.dropLast(1)
            input.text = myString
        }

        btnEqual.setOnClickListener {
            if(!operator) {
               val exp = ExpressionBuilder(myString).build()
                val res = exp.evaluate()
                output.text = res.toString()
                myString = res.toString()
                operator = false

            }
            else{
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }

        }





    }
}