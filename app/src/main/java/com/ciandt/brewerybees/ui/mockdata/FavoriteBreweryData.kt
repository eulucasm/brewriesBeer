package com.ciandt.brewerybees.ui.mockdata

data class Favorite(
    val brewerynamefavorite: String,
    val breweryratingfavorite: String,
    val brewerytypefavorite: String,
    val brewerylocationfavorite: String,
    val brewerystarfavorite: Boolean
)

class FavoriteViewHolder{

}

class FavoriteBuilder{
    var brewerynamefavorite: String = ""
    var breweryratingfavorite: String = ""
    var brewerytypefavorite: String = ""
    var brewerylocationfavorite: String = ""
    var brewerystarfavorite: Boolean = false

    fun build() : Favorite = Favorite(brewerynamefavorite, breweryratingfavorite, brewerytypefavorite, brewerylocationfavorite, false)
}

fun favorite(block: FavoriteBuilder.() -> Unit): Favorite = FavoriteBuilder().apply(block).build()

fun fakefavorite() : MutableList<Favorite> = mutableListOf(
    favorite {
        brewerynamefavorite = "Bar do Jon"
        breweryratingfavorite = "5,0"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "2,9km"
        brewerystarfavorite = false
    },
    favorite {
        brewerynamefavorite = "Bar da Dalva"
        breweryratingfavorite = "5,0"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "2,4km"
        brewerystarfavorite = false
    },
    favorite {
        brewerynamefavorite = "Botequin Lirio"
        breweryratingfavorite = "4,9"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "1,9km"
        brewerystarfavorite = false
    },
    favorite {
        brewerynamefavorite = "Bar do Neto"
        breweryratingfavorite = "4,8"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "2,6km"
        brewerystarfavorite = false
    },
    favorite {
        brewerynamefavorite = "Taverna Targaryen"
        breweryratingfavorite = "4,8"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "2,0km"
        brewerystarfavorite = false
    },
    favorite {
        brewerynamefavorite = "Bar da Lu"
        breweryratingfavorite = "4,6"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "2,7km"
        brewerystarfavorite = false
    },
    favorite {
        brewerynamefavorite = "A Tenda"
        breweryratingfavorite = "4,4"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "0,4"
        brewerystarfavorite = false
    },
    favorite {
        brewerynamefavorite = "Bar do Douglas"
        breweryratingfavorite = "4,1"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "4,4km"
        brewerystarfavorite = false
    },
    favorite {
        brewerynamefavorite = "Fonte do Sabor"
        breweryratingfavorite = "4,0"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "3,5km"
        brewerystarfavorite = false
    },
    favorite {
        brewerynamefavorite = "Bar da Ines"
        breweryratingfavorite = "3,9"
        brewerytypefavorite = "Tipo"
        brewerylocationfavorite = "2,5km"
        brewerystarfavorite = false
    }

)