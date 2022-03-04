package com.example.aula1_commov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Life cycle: onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("Life cycle: onStart")

    }

    override fun onRestart() {
        super.onRestart()
        println("Life cycle: onRestart")
    }

    override fun onPause() {
        super.onPause()
        println("Life cycle: onPause")

    }

    override fun onStop() {
        super.onStop()
        println("Life cycle: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Life cycle: onDestroy")
    }
}