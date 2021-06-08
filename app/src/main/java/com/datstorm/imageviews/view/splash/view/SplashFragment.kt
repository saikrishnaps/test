package com.datstorm.imageviews.view.splash.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.datstorm.imageviews.R
import com.datstorm.imageviews.config.AppPreferences
import com.datstorm.imageviews.config.ApplicationConstants
import com.datstorm.imageviews.databinding.FragmentSplashBinding
import com.datstorm.imageviews.utils.Utils
import com.datstorm.imageviews.utils.setStatusBarTranslucent
import com.datstorm.imageviews.view.splash.view_model.SplashViewModel


class SplashFragment : Fragment() {
    private var binding: FragmentSplashBinding? = null
    lateinit var viewModel: SplashViewModel
    private var appPreferences: AppPreferences? = null
    private var utils: Utils? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        requireActivity().setStatusBarTranslucent(true)

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false)

        appPreferences =
            AppPreferences.getInstance(
                requireContext(),
                ApplicationConstants.APPLICATION_DATA
            )

        viewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
        binding?.viewModel = viewModel
        binding?.lifecycleOwner = this

        utils = Utils(requireActivity())


        viewModel.errorText?.observe(viewLifecycleOwner,
            Observer { toastMessage ->
                utils!!.showToast(toastMessage)
            })


        checkAndRedirect()

        return binding!!.root
    }

    private fun checkAndRedirect() {
        val appPreferences: AppPreferences =
            AppPreferences.getInstance(
                requireContext(),
                ApplicationConstants.APPLICATION_DATA
            )
//        if (!appPreferences.getBoolean(LOGGED_STATUS)) {
//        } else {
            findNavController().navigate(R.id.actionSplashToLanding)
//        }
    }

}
