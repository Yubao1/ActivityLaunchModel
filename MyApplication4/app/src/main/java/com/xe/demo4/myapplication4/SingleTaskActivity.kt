package com.xe.demo4.myapplication4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SingleTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_task)
    }
    fun startA5Activity(v: View) {
        val clazz2 = A5Activity::class.java
        val it: Intent = Intent(this,clazz2)
        startActivity(it)
    }
}
