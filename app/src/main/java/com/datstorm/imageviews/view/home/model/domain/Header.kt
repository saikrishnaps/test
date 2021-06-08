package com.datstorm.estore.view.categories.model.domain

data class Header(
    val Description: Any,
    val Details: List<Detail>,
    val Id: Int,
    val Images: Any,
    val IsMyFavourite: Int,
    val Location: LocationX,
    val Name: String,
    val ProductsCount: Int,
    val SubTitle: String,
    val ThumbnailUrl: String
)