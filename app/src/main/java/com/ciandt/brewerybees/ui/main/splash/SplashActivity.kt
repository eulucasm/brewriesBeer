package com.ciandt.brewerybees.ui.main.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ciandt.brewerybees.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setTheme(R.style.Theme_BreweryBees)
        setContentView(R.layout.activity_splash)
    }
}