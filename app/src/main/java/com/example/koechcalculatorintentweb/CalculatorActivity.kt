package com.example.koechcalculatorintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Tv_answer: TextView
    lateinit var Edt_firstnnumber: EditText
    lateinit var Edt_secondnumber: EditText
    lateinit var buttonadd: Button
    lateinit var buttonsub: Button
    lateinit var buttonmultiply: Button
    lateinit var buttondivision: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Tv_answer = findViewById(R.id.txt_Answer)
        Edt_firstnnumber = findViewById(R.id.edt_Fnum)
        Edt_secondnumber = findViewById(R.id.edt_Fnum2)
        buttonadd = findViewById(R.id.Btn_Add)
        buttonsub = findViewById(R.id.Btn_Minus)
        buttondivision = findViewById(R.id.Btn_division)
        buttonmultiply = findViewById(R.id.Btn_multiplication)

        buttonadd.setOnClickListener {
            var myfirstnumber = Edt_firstnnumber.text.toString()
            var mysecondnumber = Edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                Tv_answer.text = "please input all the inputs"
        }else{
            var answer=myfirstnumber.toDouble() + mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
        }

        }
        buttonsub.setOnClickListener {
            var myfirstnumber = Edt_firstnnumber.text.toString()
            var mysecondnumber = Edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                Tv_answer.text = "please input all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
        buttondivision.setOnClickListener {
            var myfirstnumber = Edt_firstnnumber.text.toString()
            var mysecondnumber = Edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                Tv_answer.text = "please input all the inputs"
            }else {
                var answer = myfirstnumber.toDouble() / mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
        buttonmultiply.setOnClickListener {
            var myfirstnumber = Edt_firstnnumber.text.toString()
            var mysecondnumber = Edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                Tv_answer.text = "please input all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() * mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
    }
}