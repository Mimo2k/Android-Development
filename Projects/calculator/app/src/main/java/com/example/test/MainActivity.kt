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
        var operator = true



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

            Toast.makeText(this,"7 Clicked",Toast.LENGTH_SHORT).show()
        }

        btn8.setOnClickListener {

            Toast.makeText(this,"8 Clicked",Toast.LENGTH_SHORT).show()
        }

        btn9.setOnClickListener {

            Toast.makeText(this,"9 Clicked",Toast.LENGTH_SHORT).show()
        }

        btnDiv.setOnClickListener {

            Toast.makeText(this,"/ Clicked",Toast.LENGTH_SHORT).show()

        }


        /* Row  2 */

        /* Root id's */
        val btn4 = findViewById<Button>(R.id.btnFour)
        val btn5 = findViewById<Button>(R.id.btnFive)
        val btn6 = findViewById<Button>(R.id.btnSix)
        val btnMul = findViewById<Button>(R.id.btnMultiply)

        /* Click Listener's */

        btn4.setOnClickListener {
            Toast.makeText(this,"4 Clicked",Toast.LENGTH_SHORT).show()
        }

        btn5.setOnClickListener {
            Toast.makeText(this,"5 Clicked",Toast.LENGTH_SHORT).show()
        }

        btn6.setOnClickListener {
            Toast.makeText(this,"6 Clicked",Toast.LENGTH_SHORT).show()
        }

        btnMul.setOnClickListener {
            Toast.makeText(this,"* Clicked",Toast.LENGTH_SHORT).show()
        }


        /* Row  3 */

        /* Root id's */
        val btn1 = findViewById<Button>(R.id.btnOne)
        val btn2 = findViewById<Button>(R.id.btnTwo)
        val btn3 = findViewById<Button>(R.id.btnThree)
        val btnSub = findViewById<Button>(R.id.btnSubtraction)

        /* Click Listener's */

        btn1.setOnClickListener {
            Toast.makeText(this,"1 Clicked",Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this,"2 Clicked",Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            Toast.makeText(this,"3 Clicked",Toast.LENGTH_SHORT).show()
        }

        btnSub.setOnClickListener {
            Toast.makeText(this,"- Clicked",Toast.LENGTH_SHORT).show()
        }


        /* Row  4 */

        /* Root id's */
        val btn0 = findViewById<Button>(R.id.btnZero)
        val btnDot = findViewById<Button>(R.id.btnDot)
        val btnMod = findViewById<Button>(R.id.btnModulus)
        val btnAdd = findViewById<Button>(R.id.btnAddition)

        /* Click Listener's */

        btn0.setOnClickListener {
            Toast.makeText(this,"0 Clicked",Toast.LENGTH_SHORT).show()
        }

        btnDot.setOnClickListener {
            Toast.makeText(this,". Clicked",Toast.LENGTH_SHORT).show()
        }

        btnMod.setOnClickListener {
            Toast.makeText(this,"% Clicked",Toast.LENGTH_SHORT).show()
        }

        btnAdd.setOnClickListener {
            Toast.makeText(this,"+ Clicked",Toast.LENGTH_SHORT).show()
        }

        /* Row  5 */

        /* Root id's */
        val btnClr = findViewById<Button>(R.id.btnClear)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnEqual = findViewById<Button>(R.id.btnEqual)

        /* Click Listener's */

        btnClr.setOnClickListener {
            Toast.makeText(this,"clr Clicked",Toast.LENGTH_SHORT).show()
        }

        btnBack.setOnClickListener {
            Toast.makeText(this,"<- Clicked",Toast.LENGTH_SHORT).show()
        }

        btnEqual.setOnClickListener {
            Toast.makeText(this,"= Clicked",Toast.LENGTH_SHORT).show()

        }





    }
}