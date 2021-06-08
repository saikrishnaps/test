package com.datstorm.estore.view.categories.model.domain

data class Advertisement(
    val BranchId: Int,
    val CompId: Int,
    val Description: String,
    val DomainId: Int,
    val Id: Int,
    val ImageId: Int,
    val Images: Any,
    val IsMyFavourite: Int,
    val Name: String,
    val ProductsList: Any,
    val SubTitle: String,
    val ThumbnailUrl: String
)