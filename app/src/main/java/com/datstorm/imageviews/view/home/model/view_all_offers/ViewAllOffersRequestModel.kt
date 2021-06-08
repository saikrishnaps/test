package com.datstorm.imageviews.view.home.model.view_all_offers

data class ViewAllOffersRequestModel(
    var DomainId: Int? = 0,
    var Favourite: Int? = 0,
    var Latitude: Double? = 0.0,
    var Longitude: Double? = 0.0,
    var PageNo: Int? = 0,
    var PageSize: Int? = 0,
    var UserId: Int? = 0,
    var SearchBy: String? = null
)