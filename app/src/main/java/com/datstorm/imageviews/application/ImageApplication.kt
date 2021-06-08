package com.datstorm.imageviews.application

import android.content.Context
import androidx.multidex.MultiDexApplication
import com.datstorm.imageviews.api_service.APIService


class ImageApplication : MultiDexApplication() {
    private var mRetrofitService: APIService? = null

    override fun onCreate() {
        super.onCreate()

    }

    fun getRetrofitService(): APIService? {
        if (mRetrofitService == null) {
            mRetrofitService = APIService.Factory.create()
        }
        return mRetrofitService
    }

    companion object {
        fun get(context: Context): ImageApplication {
            return context.applicationContext as ImageApplication
        }
    }



    operator fun get(context: Context): ImageApplication? {
        return context.applicationContext as ImageApplication
    }



    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onTerminate() {
        super.onTerminate()
    }


}