package com.ciandt.brewerybees.ui.mockdata

data class PhotoGaleryList(
    val phototype: String,
    val photostate: Boolean
)

class PhotoGaleryBuilder{
    var phototype: String = ""
    var photostate: Boolean = false

    fun build() : PhotoGaleryList = PhotoGaleryList(phototype, false)
}

fun photogalery(block: PhotoGaleryBuilder.() -> Unit): PhotoGaleryList = PhotoGaleryBuilder().apply(block).build()

fun fakephotogalery() : MutableList<PhotoGaleryList> = mutableListOf(

    photogalery{
        phototype = "teste"
        photostate = false
    }

)