package com.xe.demo4.myapplication4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class A4Activity : AppCompatActivity() {
    var TAG: String = "A4Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a4)
        Log.d(TAG,"-----------------onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"-----------------onStart")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG,"-----------------onNewIntent")
    }

    fun startA3Activity(v: View) {
        val clazz2 = A3Activity::class.java
        val it: Intent = Intent(this,clazz2)
        startActivity(it)
    }

    fun startA4Activity(v: View) {
        val clazz2 = A4Activity::class.java
        val it: Intent = Intent(this,clazz2)
        startActivity(it)
    }
}
