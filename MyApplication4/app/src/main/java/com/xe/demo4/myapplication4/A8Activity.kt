package com.xe.demo4.myapplication4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class A8Activity : AppCompatActivity() {
    val TAG: String = "A8Activity"
    var isFirstResume: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a8)
    }

    override fun onResume() {
        super.onResume()
        if (isFirstResume) {
            isFirstResume = false
            Handler().postDelayed(Runnable {
                run {
                    val clazz2 = A9Activity::class.java
                    val it: Intent = Intent(this, clazz2)
                    startActivity(it)
                }
            }, 2000);
        }
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG,"----------------onNewIntent")
    }
}
