package com.datstorm.imageviews.view.landing.view_model

import android.annotation.SuppressLint
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class LandingViewModel @SuppressLint("HardwareIds") constructor(
    application: Application
) :
    AndroidViewModel(application) {
    var errorText: MutableLiveData<String?>? = MutableLiveData()
    var progressDialog: MutableLiveData<Int?>? = MutableLiveData()


    init {
        progressDialog?.value = 8

    }


}