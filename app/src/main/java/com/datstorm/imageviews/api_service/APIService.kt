package com.datstorm.imageviews.api_service

import com.datstorm.estore.view.categories.model.domain.EStoreCategoryRequestModel
import com.datstorm.estore.view.categories.model.domain.EstoreCategoryModel
import com.datstorm.estore.view.categories.model.search.SearchCategoryRequestModel
import com.datstorm.imageviews.BuildConfig
import com.datstorm.imageviews.config.ApplicationConstants
import com.datstorm.imageviews.view.home.model.view_all_offers.ViewAllOffersRequestModel
import com.datstorm.imageviews.view.home.model.view_all_offers.ViewAllOffersResponseModel
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST
import java.util.concurrent.TimeUnit

interface APIService {

    object Factory {
        fun create(): APIService {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            if (BuildConfig.DEBUG) {
                httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            } else {
                httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
            }
            val gson = GsonBuilder()
                .setLenient()
                .create()
            val client = OkHttpClient.Builder()
                .readTimeout(
                    ApplicationConstants.TIMEOUT_VALUE.toLong(),
                    TimeUnit.MILLISECONDS
                )
                .writeTimeout(
                    ApplicationConstants.TIMEOUT_VALUE.toLong(),
                    TimeUnit.MILLISECONDS
                )
                .addInterceptor(httpLoggingInterceptor)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(ApplicationConstants.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build()
            return retrofit.create(APIService::class.java)
        }
    }

    @POST("LandingPage/GetMyEStores")
    fun getMyEStoreCategories(
        @Body body: EStoreCategoryRequestModel?
    ): Call<EstoreCategoryModel?>?

    @POST("LandingPage/GetMyEStores")
    fun searchCategories(
        @Body body: SearchCategoryRequestModel?
    ): Call<EstoreCategoryModel?>?


    @POST("LandingPage/ViewAllOffers")
    fun getViewAllOffers(
        @Body body: ViewAllOffersRequestModel?
    ): Call<ViewAllOffersResponseModel?>?

}
