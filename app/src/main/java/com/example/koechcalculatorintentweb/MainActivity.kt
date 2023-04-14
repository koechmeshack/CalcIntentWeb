package com.example.koechcalculatorintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttoncal:Button
    lateinit var buttonintent:Button
    lateinit var buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncal=findViewById(R.id.Btn_Cal)
        buttonintent=findViewById(R.id.Btn_Intent)
        buttonweb=findViewById(R.id.Btn_Web)
        buttoncal.setOnClickListener {
            var intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
        buttonintent.setOnClickListener {
            var intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
        buttonweb.setOnClickListener {
            var intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
    }
}