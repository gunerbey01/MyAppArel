package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.utils.UiHelper

class SplashActivity : AppCompatActivity() {
    private val mSplashThread: Thread? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if (UiHelper.hasInternetConnection(this)) {
            loadSplashScreen()
        } else {
            UiHelper.customErrorDialog(this, "Connection failed")
        }
    }

    private fun loadSplashScreen() {
        try {
            Thread.sleep(1000)
        } catch (ex: InterruptedException) {

        }
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)

    }
}