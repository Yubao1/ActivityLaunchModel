package com.xe.demo4.myapplication4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class A6Activity : AppCompatActivity() {
    val TAG: String = "A6Activity"
    var mTv: TextView? = null
    var mS: String? = null
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG,"----------------onNewIntent")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a6)
        mTv = findViewById(R.id.tv)
        mS = "这是第" + Constants.num3 + "个名叫a6的Activity"
        Constants.num3++
        mTv!!.setText(mS)
    }
    fun startA5Activity(v: View) {
        val clazz2 = A5Activity::class.java
        val it: Intent = Intent(this,clazz2)
        startActivity(it)
    }
    fun startA6Activity(v: View) {
        val clazz2 = A6Activity::class.java
        val it: Intent = Intent(this,clazz2)
        startActivity(it)
    }
}
