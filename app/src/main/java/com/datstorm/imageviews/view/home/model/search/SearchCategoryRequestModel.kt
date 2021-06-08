package com.datstorm.estore.view.categories.model.search

data class SearchCategoryRequestModel(
    var DomainId: Int? = 0,
    var Favourite: Int? = 0,
    var Latitude: Double? = 0.0,
    var Longitude: Double? = 0.0,
    var OrderBy: Int? = 0,
    var PageNo: Int? = 0,
    var PageSize: Int? = 0,
    var SearchBy: String? = null,
    var UserId: Int? = 0
)