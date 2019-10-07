package com.example.igatesampleapplocation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null)
        supportActionBar?.hide()
        setContentView(R.layout.activity_home)
    }

    fun goBack(view: View) {
        finish()
    }
}
