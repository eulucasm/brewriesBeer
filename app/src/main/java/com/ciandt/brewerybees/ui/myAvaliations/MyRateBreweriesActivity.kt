package com.ciandt.brewerybees.ui.myAvaliations

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.ciandt.brewerybees.R
import com.ciandt.brewerybees.databinding.ActivityMyRateBreweriesBinding
import com.ciandt.brewerybees.ui.main.HomeBeesActivity
import com.ciandt.brewerybees.ui.myAvaliations.myRate.MyRateFragment
import com.ciandt.brewerybees.ui.myAvaliations.ratedMail.RatedMailFragment
import org.koin.androidx.fragment.android.replace

class MyRateBreweriesActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMyRateBreweriesBinding

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = ActivityMyRateBreweriesBinding.inflate(layoutInflater, null, false)

      setContentView(binding.root)

      binding.returnButton.setOnClickListener{
         val intent = Intent(this, HomeBeesActivity::class.java)
         startActivity(intent)
      }

      val emailFragment = supportFragmentManager.findFragmentByTag("myBreweryContainer") as RatedMailFragment

      emailFragment.emailListener =  { email ->
         supportFragmentManager.commit {
            val args = Bundle().apply {
               putString("inputEmail", email)
            }
            replace<MyRateFragment>(R.id.myBreweryContainer, args)
         }
      }
   }
}