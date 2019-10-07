package com.example.igatesampleapplocation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null)
            supportActionBar?.hide()
        setContentView(R.layout.activity_main)
    }

    fun gotoHome(view: View) {
        startActivity(Intent(this@MainActivity, HomeActivity::class.java))
    }
    fun forgotPassword(view: View) {
        Toast.makeText(this, "Please contact administrator", Toast.LENGTH_LONG).show();
    }
    fun createAccount(view: View) {
        Toast.makeText(this, "Sorry not available", Toast.LENGTH_LONG).show();
    }
}
