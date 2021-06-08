package com.datstorm.imageviews.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.datstorm.imageviews.R
import com.datstorm.imageviews.databinding.ActivityMainBinding
import com.datstorm.imageviews.utils.makeStatusBarTransparent

/**
 * An activity that inflates a layout that has a NavHostFragment.
 */
class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        makeStatusBarTransparent()
    }

}
