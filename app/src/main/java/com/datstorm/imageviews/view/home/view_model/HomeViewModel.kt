package com.datstorm.imageviews.view.home.view_model

import android.annotation.SuppressLint
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.datstorm.estore.view.categories.model.domain.EStoreCategoryRequestModel
import com.datstorm.estore.view.categories.model.domain.EstoreCategoryModel
import com.datstorm.estore.view.categories.model.search.SearchCategoryRequestModel
import com.datstorm.imageviews.application.ImageApplication
import com.datstorm.imageviews.callbacks.RetrofitCallback
import com.datstorm.imageviews.callbacks.RetrofitMainCallback
import com.datstorm.imageviews.utils.Utils
import com.datstorm.imageviews.view.home.model.view_all_offers.ViewAllOffersRequestModel
import com.datstorm.imageviews.view.home.model.view_all_offers.ViewAllOffersResponseModel
import com.google.gson.Gson

class HomeViewModel @SuppressLint("HardwareIds") constructor(
    application: Application
) :
    AndroidViewModel(application) {
    var errorText: MutableLiveData<String?>? = MutableLiveData()
    var progressDialog: MutableLiveData<Int?>? = MutableLiveData()
    var domainName = MutableLiveData<String>()
    var storeCount = MutableLiveData<String>()

    init {
        progressDialog?.value = 8
    }


    fun getMyEStoreCategory(
        getMyEStoreCategoryRetrofitCallback: RetrofitCallback<EstoreCategoryModel>,
        currentPage: Int,
        domainId: Int,
        pageSize: Int,
        favourite: Int,
        orderBy: Int
    ) {
        val eStoreCategoryRequestModel = EStoreCategoryRequestModel()
        eStoreCategoryRequestModel.DomainId = domainId
        eStoreCategoryRequestModel.PageNo = currentPage
        eStoreCategoryRequestModel.UserId = 1243
        eStoreCategoryRequestModel.PageSize = pageSize
        eStoreCategoryRequestModel.Latitude = 0.0
        eStoreCategoryRequestModel.Longitude = 0.0
        eStoreCategoryRequestModel.Favourite = favourite
        eStoreCategoryRequestModel.OrderBy = 1
        if (!Utils.isNetworkConnected(getApplication())) {
        } else {
            val aiiceApplication = ImageApplication.get(getApplication())
            val apiService = aiiceApplication.getRetrofitService()
            println("getMyEStore inputs = ${Gson().toJson(eStoreCategoryRequestModel)}")
            apiService?.getMyEStoreCategories(
                eStoreCategoryRequestModel
            )?.enqueue(RetrofitMainCallback(getMyEStoreCategoryRetrofitCallback))

        }
    }

    fun getMyEStoreCategoryBySearch(
        getMyEStoreCategoryRetrofitCallback: RetrofitCallback<EstoreCategoryModel>,
        currentPage: Int,
        domainId: Int,
        pageSize: Int,
        favourite: Int,
        orderBy: Int,
        searchBy: String
    ) {
        val searchCategoryRequestModel = SearchCategoryRequestModel()
        searchCategoryRequestModel.DomainId = domainId
        searchCategoryRequestModel.PageNo = currentPage
        searchCategoryRequestModel.UserId = 1243
        searchCategoryRequestModel.PageSize = pageSize
        searchCategoryRequestModel.Latitude = 0.0
        searchCategoryRequestModel.Longitude = 0.0
        searchCategoryRequestModel.Favourite = favourite
        searchCategoryRequestModel.OrderBy = 1
        searchCategoryRequestModel.SearchBy = searchBy
        if (!Utils.isNetworkConnected(getApplication())) {
        } else {
            val imageApplication = ImageApplication.get(getApplication())
            val apiService = imageApplication.getRetrofitService()
            println("getMyEStore inputs = ${Gson().toJson(searchCategoryRequestModel)}")
            apiService?.searchCategories(
                searchCategoryRequestModel
            )?.enqueue(RetrofitMainCallback(getMyEStoreCategoryRetrofitCallback))
        }
    }

    fun getAllOffers(
        getAllOffersRetrofitCallback: RetrofitCallback<ViewAllOffersResponseModel>,
        currentPage: Int,
        pageSize: Int,
        domainId: Int,
        favourite: Int,
        searchBy: String
    ) {
                val viewAllOffersRequestModel = ViewAllOffersRequestModel()
                viewAllOffersRequestModel.DomainId = domainId
                viewAllOffersRequestModel.UserId = 1243
                viewAllOffersRequestModel.Favourite = favourite
                viewAllOffersRequestModel.Longitude = 0.0
                viewAllOffersRequestModel.Latitude = 0.0
                viewAllOffersRequestModel.PageNo = 1
                viewAllOffersRequestModel.PageSize = 7
                viewAllOffersRequestModel.SearchBy = ""
                if (!Utils.isNetworkConnected(getApplication())) {
                } else {
                    val aiiceApplication = ImageApplication.get(getApplication())
                    val apiService = aiiceApplication.getRetrofitService()
                    println("getMyEStore inputs = ${Gson().toJson(viewAllOffersRequestModel)}")
                    apiService?.getViewAllOffers(
                        viewAllOffersRequestModel
                    )?.enqueue(RetrofitMainCallback(getAllOffersRetrofitCallback))

        }
    }

}
