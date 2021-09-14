package com.example.latihan.getImageFromAssets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan.R

class getImageFromAssets: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.get_img_from_assets)

        assets.open("ic_flag.xml")
    }
}