package com.ciandt.brewerybees.ui.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ciandt.brewerybees.R
import com.ciandt.brewerybees.databinding.ActivityBreweryDetailsBinding
import com.ciandt.brewerybees.databinding.ActivityHomeBeesBinding

class BreweryDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreweryDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_BreweryBees)
    }


}