package com.geancarloleiva.a5_fragmentinteraction.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.geancarloleiva.a5_fragmentinteraction.R
import com.geancarloleiva.a5_fragmentinteraction.interfaces.Operations
import com.geancarloleiva.a5_fragmentinteraction.ui.FirstFragment
import com.geancarloleiva.a5_fragmentinteraction.ui.SecondFragment
import com.geancarloleiva.a5_fragmentinteraction.ui.ThirdFragment

class OperationsActivity : AppCompatActivity(), Operations {

    val firstFragment = FirstFragment()
    val secondFragment = SecondFragment()
    val thirdFragment = ThirdFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operations)

        supportFragmentManager.beginTransaction().add(R.id.frmOperations, firstFragment).commit()
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btnFirst -> supportFragmentManager.beginTransaction()
                .replace(R.id.frmOperations, firstFragment).commit()
            R.id.btnSecond -> supportFragmentManager.beginTransaction()
                .replace(R.id.frmOperations, secondFragment).commit()
            R.id.btnThird -> supportFragmentManager.beginTransaction()
                .replace(R.id.frmOperations, thirdFragment).commit()
        }
    }

    override fun changeBtnText(textBtn1: String, textBtn2: String, textBtn3: String) {
        val btn1: Button = findViewById(R.id.btnFirst)
        val btn2: Button = findViewById(R.id.btnSecond)
        val btn3: Button = findViewById(R.id.btnThird)

        btn1.text = textBtn1
        btn2.text = textBtn2
        btn3.text = textBtn3
    }

    fun changeBtnTextDirectly(textBtn1: String, textBtn2: String, textBtn3: String) {
        val btn1: Button = findViewById(R.id.btnFirst)
        val btn2: Button = findViewById(R.id.btnSecond)
        val btn3: Button = findViewById(R.id.btnThird)

        btn1.text = textBtn1
        btn2.text = textBtn2
        btn3.text = textBtn3
    }
}