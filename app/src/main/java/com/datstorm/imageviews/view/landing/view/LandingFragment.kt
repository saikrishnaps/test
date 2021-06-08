package com.datstorm.imageviews.view.landing.view

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.datstorm.imageviews.R
import com.datstorm.imageviews.config.AppPreferences
import com.datstorm.imageviews.config.ApplicationConstants
import com.datstorm.imageviews.databinding.FragmentLandingBinding
import com.datstorm.imageviews.utils.setMarginTop
import com.datstorm.imageviews.view.MainActivity
import com.datstorm.imageviews.view.landing.view_model.LandingViewModel


class LandingFragment : Fragment() {
    private var binding: FragmentLandingBinding? = null
    lateinit var viewModel: LandingViewModel
    private var backPressed: Long = 0L
    private lateinit var navController: NavController
    lateinit var navHostFragment: NavHostFragment
    lateinit var navGraph: NavGraph
    lateinit var materialAlertDialogBuilder: MaterialAlertDialogBuilder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_landing, container, false)

        viewModel = ViewModelProvider(this).get(LandingViewModel::class.java)
        binding?.viewModel = viewModel
        binding?.lifecycleOwner = this

        ViewCompat.setOnApplyWindowInsetsListener(binding?.contentContainer as View) { _, insets ->
            binding?.topRelativeLayout?.setMarginTop(insets.systemWindowInsetTop)
            insets.consumeSystemWindowInsets()
        }

        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    if (backPressed + 2000 > System.currentTimeMillis()) requireActivity().finish() else {
                        Toast.makeText(
                            requireContext(),
                            "Press once again to exit",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    backPressed = System.currentTimeMillis()
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)

        binding?.bottomNavigationView?.itemIconTintList =
            ContextCompat.getColorStateList(requireContext(), R.color.bnv_colors)


        binding?.bottomNavigationView?.setOnNavigationItemSelectedListener(
            navigationItemSelectedListener
        )


        return binding!!.root
    }

    var navigationItemSelectedListener: BottomNavigationView.OnNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {

            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                binding?.bottomNavigationView?.itemIconTintList =
                    ContextCompat.getColorStateList(requireContext(), R.color.bnv_colors)
                val args = Bundle()
                navHostFragment =
                    childFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
                navController = navHostFragment.navController

                val graphInflater = navController.navInflater
                navGraph = graphInflater.inflate(R.navigation.landing_navigation)
//                if ((requireActivity() as MainActivity).actionMode != null) {
//                    (requireActivity() as MainActivity).actionMode?.finish()
//                }
                var destination  = 0
                when (item.itemId) {
                    R.id.itemHome -> {
                        destination = R.id.imageScreen
                        navGraph.startDestination = destination
                        navController.graph = navGraph
                        return true
                    }
                    R.id.itemProfile -> {
                    }
                    R.id.itemLogout -> {
                        materialAlertDialogBuilder = MaterialAlertDialogBuilder(
                            requireActivity(),
                            R.style.RoundShapeTheme
                        )
                        materialAlertDialogBuilder.setTitle("Logout")
                            .setMessage("Are you sure you want to logout?")
                            .setPositiveButton("Yes"){dialog, _ ->
                                val appPreferences: AppPreferences =
                                    AppPreferences.getInstance(
                                        requireContext(),
                                        ApplicationConstants.APPLICATION_DATA
                                    )
                                appPreferences.clearData()
                                appPreferences.saveBoolean(ApplicationConstants.LOGGED_STATUS, false)

                                val intent = Intent(requireContext(), MainActivity::class.java)
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                                startActivity(intent)
                            }
                            .setNegativeButton("No"){dialog, _ ->
                                dialog.dismiss()
                            }
                            .setCancelable(false)
                            .show()
                        return true
                    }

                }
                return false
            }

        }

}
