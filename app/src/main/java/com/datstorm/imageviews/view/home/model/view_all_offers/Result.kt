package com.datstorm.imageviews.view.home.model.view_all_offers

data class Result(
    val Advertisements: List<Advertisement>,
    val BranchCode: Int,
    val CompanyCode: Int,
    val Details: Any,
    val Headers: Any,
    val Message: Any,
    val OfferProducts: Any,
    val Offers: Any,
    val Products: Any,
    val ProductsList: Any,
    val ReturnCode: Int,
    val SpecialProducts: Any,
    val Success: Boolean,
    val TotalRecords: Int
)