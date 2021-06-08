package com.datstorm.estore.view.categories.model.domain

data class Result(
    val Advertisements: List<Advertisement>,
    val BranchCode: Int,
    val CompanyCode: Int,
    val Details: Any,
    val Headers: List<Header>,
    val Message: Any,
    val OfferProducts: List<OfferProduct>,
    val Offers: List<Offer>,
    val Products: Any,
    val ProductsList: Any,
    val ReturnCode: Int,
    val Success: Boolean,
    val TotalRecords: Int
)