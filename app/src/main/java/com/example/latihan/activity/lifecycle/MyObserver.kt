package com.example.latihan.activity.lifecycle

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver (private val ctx: Context,private val lifecycle: Lifecycle): LifecycleObserver {
    val TAG = "MyObServer"
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.i(TAG,"Lifecycle.Event.ON_CREATE")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.i(TAG,"Lifecycle.Event.ON_START")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Toast.makeText(ctx,"Retreaving data...", Toast.LENGTH_LONG).show()
        Log.i(TAG,"Lifecycle.Event.ON_RESUME")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.i(TAG,"Lifecycle.Event.ON_PAUSE")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Toast.makeText(ctx,"Preparing to exit the app...", Toast.LENGTH_LONG).show()
        Log.i(TAG,"Lifecycle.Event.ON_STOP")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.i(TAG,"Lifecycle.Event.ON_DESTROY")
    }
}