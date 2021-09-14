package com.example.latihan.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.latihan.FirstFragment
import com.example.latihan.R
import kotlinx.android.synthetic.main.activity_to_fragment.*

class activity_to_fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_fragment)

        loadData()

//        send_button.setOnClickListener{
//            val dataText = data_picker.text.toString()
//            val dataPasser = FirstFragment.newInstance(dataText)
//            val myFragment = supportFragmentManager.beginTransaction()
//            myFragment.replace(R.id.fl_atf,dataPasser)
//            myFragment.commit()
//
//        }
        send_button2.setOnClickListener {
            saveData()
        }
    }

    private fun saveData() {
        val insertedText = data_picker2.text.toString()
        tv_text.text = insertedText
        val sharedPreferences = getSharedPreferences("sharedPrefs",Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.apply {
            putString("STRING_KEY",insertedText)
        }.apply()

        Toast.makeText(this,"Data Saved", Toast.LENGTH_LONG).show()

    }
    private fun loadData(){
        val sharedPreferences = getSharedPreferences("sharedPrefs",Context.MODE_PRIVATE)
        val savedString = sharedPreferences.getString("STRING_KEY",null)

        tv_text.text = savedString
    }
}