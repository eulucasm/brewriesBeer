package com.ciandt.brewerybees.ui.favorites

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ciandt.brewerybees.R
import com.ciandt.brewerybees.databinding.ActivityFavoriteBreweryBinding
import com.ciandt.brewerybees.ui.main.HomeBeesActivity

class FavoriteBreweryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBreweryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_BreweryBees)

        binding= ActivityFavoriteBreweryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.returnButton.setOnClickListener{
            val intent = Intent(this, HomeBeesActivity::class.java)
            startActivity(intent)
        }

    }


}