//package com.example.latihan.activity.adapter
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.viewpager.widget.PagerAdapter
//import com.example.latihan.R
//import kotlin.coroutines.coroutineContext
//
//class walkthrough_adapter(context: Context): PagerAdapter() {
//    val imgArray = intArrayOf(R.id.video)
//
//    override fun getCount(): Int {
//        TODO("Not yet implemented")
//    }
//
//    override fun isViewFromObject(view: View, `object`: Any): Boolean {
//        return view == `object`
//    }
//
//    override fun instantiateItem(container: ViewGroup, position: Int): Any {
//        val view: View = LayoutInflater.from(coroutineContext).inflate(slide_wal)
//
//        return super.instantiateItem(container, position)
//    }
//
//    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
//        val view: View = `object` as View
//        container.removeView(view)
//    }
//}