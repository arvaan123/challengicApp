package com.app.challengicapp.design.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.app.challengicapp.R
import com.app.challengicapp.design.login.LoginActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable
    private val screenTimeOut = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        mRunnable= Runnable {
            run {
                    startActivity(Intent(this,LoginActivity::class.java))
            }
        }
        mHandler = Handler(Looper.getMainLooper())
    }

    override fun onPause() {
        super.onPause()
        mHandler.removeCallbacks(mRunnable)
    }

    override fun onResume() {
        super.onResume()
        mHandler.postDelayed(mRunnable, screenTimeOut)
    }
}