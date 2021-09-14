package com.example.latihan.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import com.example.latihan.FirstFragment
import com.example.latihan.R
import com.example.latihan.activity.lifecycle.MyObserver
//import com.example.latihan.activity.lifecycle.MyObserver
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var myObserver: MyObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myObserver = MyObserver(this, lifecycle)
        lifecycle.addObserver(myObserver)
        buttonPressed()
        btnNext()
    }

    private fun buttonPressed() {
        button1.setOnClickListener {
            if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
                Toast.makeText(applicationContext, "you can watch your movies...", Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun btnNext() {
        button2.setOnClickListener {
            if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
                startActivity(Intent (this,activity_to_fragment::class.java))
//                val fm = supportFragmentManager.beginTransaction()
//                fm.replace(R.id.fl_fragment,FirstFragment())
//                fm.addToBackStack("MainActivity")
//                fm.commit()
            }
        }
    }
}