package com.datstorm.imageviews.view.splash.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.datstorm.imageviews.R

class SplashFragmentDirections private constructor() {
  companion object {
    fun actionSplashToLanding(): NavDirections = ActionOnlyNavDirections(R.id.actionSplashToLanding)
  }
}
