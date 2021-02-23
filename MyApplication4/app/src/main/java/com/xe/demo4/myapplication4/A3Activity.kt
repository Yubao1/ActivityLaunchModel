package com.xe.demo4.myapplication4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class A3Activity : AppCompatActivity() {
    var mTv: TextView? = null
    var mS: String? = null
    var TAG: String = "A3Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a3)
        mTv = findViewById(R.id.tv)
        mS = "这是第" + Constants.num + "个名叫a3的Activity"
        Constants.num++
        mTv!!.setText(mS)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG,"-----------------onNewIntent")
    }

    fun onClick(v: View) {
        val clazz2 = A4Activity::class.java
        val it: Intent = Intent(this,clazz2)
        startActivity(it)
    }
}
