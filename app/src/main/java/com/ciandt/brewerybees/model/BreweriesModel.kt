package com.ciandt.brewerybees.model

//import com.google.gson.annotations.SerializedName

data class BreweriesModel(
   val id: String? = null,
   val name: String? = null,
   val address2: String? = null,
   val address3: String? = null,
   val average: Double? = null,
   //@SerializedName("brewery_type")
   val brewery_type: String? = null,
   val city: String? = null,
   val country: String? = null,
   val latitude: Double? = null,
   val longitude: Double? = null,
   val phone: String? = null,
   //@SerializedName("postal_code")
   val postal_code: String? = null,
   //@SerializedName("size_evaluations")
   val size_evaluations: Int? = null,
   val state: String? = null,
   val street: String? = null,
   //@SerializedName("website_url")
   val website_url: String? = null,
   val photos: List<String>? = null,
)