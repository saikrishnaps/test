package com.datstorm.imageviews.view.splash.view_model

import android.annotation.SuppressLint
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.datstorm.imageviews.config.AppPreferences
import com.datstorm.imageviews.config.ApplicationConstants

class SplashViewModel @SuppressLint("HardwareIds") constructor(
    application: Application
) :
    AndroidViewModel(application) {
    var errorText: MutableLiveData<String?>? = MutableLiveData()
    var progressDialog: MutableLiveData<Int?>? = MutableLiveData()
    var appPreferences: AppPreferences? = null

    init {
        progressDialog?.value = 8
        appPreferences =
            AppPreferences.getInstance(getApplication(), ApplicationConstants.APPLICATION_DATA)
    }

}