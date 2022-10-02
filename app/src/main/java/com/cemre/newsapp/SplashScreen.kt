package com.cemre.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.cemre.newsapp.ui.MainActivity

class SplashScreen : AppCompatActivity() {
    lateinit var backgrounding: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()
        backgrounding = findViewById(R.id.iv_logo)

        val sideAnimation = AnimationUtils.loadAnimation(this,R.anim.float_in)
        backgrounding.startAnimation(sideAnimation)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}