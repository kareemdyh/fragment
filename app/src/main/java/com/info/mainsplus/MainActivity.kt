package com.info.mainsplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    lateinit var b_plus: Button
    lateinit var b_sub: Button
    lateinit var frame1: FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_sub = findViewById(R.id.b_sub)
        frame1 = findViewById(R.id.frame1)


        b_plus = findViewById(R.id.b_plus)
        b_plus.setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.frame1, BlankFragment())
                .commit()


        }
        b_sub.setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.frame1, fr_sub())
                .commit()


        }

    }
}