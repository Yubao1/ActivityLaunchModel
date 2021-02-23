package com.xe.demo4.myapplication4

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by 86188 on 2021/2/20.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startStandardModel(v: View?) {
        val clazz2 = A1Activity::class.java
        val it:Intent = Intent(this,clazz2)
        startActivity(it)
    }

    fun startSingleTopModel(v: View) {
        val clazz2 = A3Activity::class.java
        val it:Intent = Intent(this,clazz2)
        startActivity(it)
    }
    fun startSingleTaskModel(v: View) {
        val clazz2 = A5Activity::class.java
        val it:Intent = Intent(this,clazz2)
        startActivity(it)
    }
    fun startSingleInstanceModel(v: View) {
        val clazz2 = A8Activity::class.java
        val it:Intent = Intent(this,clazz2)
        startActivity(it)
        Handler().postDelayed(Runnable {
            run {
                val clazz2 = A10Activity::class.java
                val it: Intent = Intent(this,clazz2)
                startActivity(it)
            }
        },6000);
    }
}