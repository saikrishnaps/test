package com.datstorm.estore.view.categories.model.domain

data class Offer(
    val Description: Any,
    val Id: Int,
    val Images: Any,
    val IsMyFavourite: Int,
    val Name: String,
    val ProductsList: List<Products>,
    val SubTitle: Any,
    val ThumbnailUrl: String
)