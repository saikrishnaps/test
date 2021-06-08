package com.datstorm.estore.view.categories.model.domain

data class OfferProduct(
    val BranchId: Int,
    val CompId: Int,
    val Description: Any,
    val DomainId: Int,
    val ImageId: Int,
    val IsMyFavourite: Int,
    val OfferPrice: Double,
    val Price: Double,
    val ProductId: Int,
    val ProductName: String,
    val RefDesc: String,
    val RefId: Int,
    val RefType: String,
    val SubTitle: Any,
    val ThumbnailUrl: String
)