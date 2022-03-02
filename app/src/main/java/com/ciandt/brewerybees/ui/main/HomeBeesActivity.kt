package com.ciandt.brewerybees.ui.main


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ciandt.brewerybees.R
import com.ciandt.brewerybees.databinding.ActivityHomeBeesBinding
import com.ciandt.brewerybees.ui.favorites.FavoriteBreweryActivity
import androidx.appcompat.widget.SearchView
import com.ciandt.brewerybees.ui.main.search.SearchResultFragment
import com.ciandt.brewerybees.ui.myAvaliations.MyRateBreweriesActivity


class HomeBeesActivity : AppCompatActivity() {

   private lateinit var binding: ActivityHomeBeesBinding

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setTheme(R.style.Theme_BreweryBees)

      binding = ActivityHomeBeesBinding.inflate(layoutInflater, null, false)

      setContentView(binding.root)

      binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
         override fun onQueryTextSubmit(query: String?): Boolean {
            binding.searchView.clearFocus()
            viewSearch(query!!)
            return false
         }

         override fun onQueryTextChange(newText: String?): Boolean {
//            binding.searchView.clearFocus()
//            viewSearch(newText!!)
            return false
         }
      })

      binding.ratedButton.setOnClickListener{
         val intent = Intent(this, MyRateBreweriesActivity::class.java)
         startActivity(intent)
      }

   }

   private fun viewSearch(query: String) {
      val fragment = SearchResultFragment()
      val bundle = Bundle()
      bundle.putString("searchCity", query)
      val transaction = supportFragmentManager.beginTransaction()
      transaction.replace(R.id.homeFragment, fragment)
      fragment.arguments = bundle
      transaction.commit()
   }

    fun goToFavorites(view: View) {
        val intent = Intent(this, FavoriteBreweryActivity::class.java)
        startActivity(intent)
    }
}