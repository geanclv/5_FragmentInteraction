package com.geancarloleiva.a5_fragmentinteraction.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.geancarloleiva.a5_fragmentinteraction.R
import com.geancarloleiva.a5_fragmentinteraction.ui.FirstFragment
import com.geancarloleiva.a5_fragmentinteraction.ui.SecondFragment
import com.geancarloleiva.a5_fragmentinteraction.ui.ThirdFragment

class OperationsActivity : AppCompatActivity() {

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
}