package com.datstorm.estore.view.categories.model.domain

data class Detail(
    val Description: Any,
    val Id: Int,
    val Images: Any,
    val IsMyFavourite: Int,
    val IsOpen: Int,
    val Location: Location,
    val Name: String,
    val ProductsList: Any,
    val SubTitle: String,
    val ThumbnailUrl: String
)