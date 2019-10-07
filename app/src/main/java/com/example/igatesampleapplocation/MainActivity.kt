package com.example.igatesampleapplocation

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null)
            supportActionBar?.hide()
        setContentView(R.layout.activity_main)
    }

    fun gotoHome(view: View) {
        if(isValidEmail(editTextEmail.text.toString())) {

            if (!TextUtils.isEmpty(editTextPassword.text.toString()))
                startActivity(Intent(this@MainActivity, HomeActivity::class.java))
            else
                Toast.makeText(this, "Please enter your password", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(this, "Please enter valid email", Toast.LENGTH_LONG).show()

    }

    fun forgotPassword(view: View) {
        Toast.makeText(this, "Please contact administrator", Toast.LENGTH_LONG).show()
    }
    fun createAccount(view: View) {
        Toast.makeText(this, "Sorry not available", Toast.LENGTH_LONG).show()
    }
    private fun isValidEmail(email: String): Boolean {
        val pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(email).matches()
    }
}
