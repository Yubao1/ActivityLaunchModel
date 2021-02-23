package com.xe.demo4.myapplication4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class A2Activity : AppCompatActivity() {
    var mTv: TextView? = null
    var mS: String? = null
    var TAG: String = "A2Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a2)
        mS = "这是第" + Constants.num + "个名叫a2的Activity"
        Constants.num++
        mTv = findViewById(R.id.tv)
        mTv!!.setText(mS)
        Log.d(TAG,"-------------onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"-------------onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"-------------onResume")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG,"-------------onNewIntent")
    }
    fun onClick(v: View) {
        val clazz2 = A2Activity::class.java
        val it: Intent = Intent(this,clazz2)
        startActivity(it)
    }
}
