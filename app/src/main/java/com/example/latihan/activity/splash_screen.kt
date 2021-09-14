package com.example.latihan.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.latihan.R
import kotlinx.android.synthetic.main.activity_splash_screen.*

class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        iv_notes.alpha = 0f

        iv_notes.animate().setDuration(2000).alpha(1f).withEndAction{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}