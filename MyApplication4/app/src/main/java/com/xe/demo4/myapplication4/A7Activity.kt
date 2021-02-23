package com.xe.demo4.myapplication4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class A7Activity : AppCompatActivity() {
    val TAG: String = "A7Activity"
    var mTv: TextView? = null
    var mS: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a7)
        mTv = findViewById(R.id.tv)
        mS = "这是第" + Constants.num4 + "个名叫a7的Activity"
        Constants.num4++
        mTv!!.setText(mS)
    }
    fun startA5Activity(v: View) {
        val clazz2 = A5Activity::class.java
        val it: Intent = Intent(this,clazz2)
        startActivity(it)
    }
    fun startA7Activity(v: View) {
        val clazz2 = A7Activity::class.java
        val it: Intent = Intent(this,clazz2)
        startActivity(it)
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG,"----------------onNewIntent")
    }
}
