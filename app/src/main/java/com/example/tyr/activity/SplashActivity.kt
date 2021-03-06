package com.example.tyr.activity

import android.os.Bundle
import android.os.Handler
import com.example.tyr.R

class SplashActivity : BaseActivity() {

    private val SPLASH_TIME_OUT = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(Runnable {
            launchActivity(LoginActivity.getIntent(this))
            finish()
        }, SPLASH_TIME_OUT.toLong())

    }
}