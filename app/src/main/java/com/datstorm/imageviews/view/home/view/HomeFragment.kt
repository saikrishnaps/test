package com.datstorm.imageviews.view.home.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.NestedScrollView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.datstorm.estore.view.categories.model.domain.Detail
import com.datstorm.estore.view.categories.model.domain.EstoreCategoryModel
import com.datstorm.imageviews.R
import com.datstorm.imageviews.callbacks.RetrofitCallback
import com.datstorm.imageviews.components.InfiniteNestedScrollListener
import com.datstorm.imageviews.config.Constant
import com.datstorm.imageviews.databinding.FragmentCategoriesBinding
import com.datstorm.imageviews.utils.Utils
import com.datstorm.imageviews.view.home.model.view_all_offers.Advertisement
import com.datstorm.imageviews.view.home.model.view_all_offers.ViewAllOffersResponseModel
import com.datstorm.imageviews.view.home.view_model.HomeViewModel
import com.google.gson.GsonBuilder
import retrofit2.Response


class HomeFragment : Fragment(), InfiniteNestedScrollListener.OnLoadMoreListener{
    private var binding: FragmentCategoriesBinding? = null
    private var viewModel: HomeViewModel? = null
    private var categoryAdapter: CategoryAdapter? = null
    private var bean: Detail? = null
    private var currentPage = 1
    private var currentOfferPage = 1
    private var pageSize = 4
    private var utils: Utils? = null
    private var searchBy:String? = null
    private var offersAdapter: ViewAllOffersAdapter? = null
    var infiniteScrollListener: InfiniteNestedScrollListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_categories, container, false)

        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding?.viewModel = viewModel
        binding?.lifecycleOwner = viewLifecycleOwner

        viewModel!!.domainName.value = arguments?.getString("domainName")

        utils = Utils(requireActivity())


        viewModel!!.getMyEStoreCategory(getMyEStoreCategoryRetrofitCallback,currentPage,
            2,pageSize,0, 1
        )

        binding?.swiperefresh!!.setOnRefreshListener {
            binding?.domainSearchView?.text?.clear()
            currentPage = 1
            viewModel!!.getMyEStoreCategory(getMyEStoreCategoryRetrofitCallback,currentPage,
                2,pageSize,0, 1
            )
            viewModel!!.getAllOffers(
                getAllOffersPageCategoryRetrofitCallback,
                1,
                20,
                1,
                0,
                ""
            )
        }

        binding?.domainSearchView?.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun afterTextChanged(s: Editable) {
                searchBy = s.toString()
                currentPage = 1
                viewModel!!.getMyEStoreCategoryBySearch(getMyEStoreCategoryRetrofitCallback,currentPage,
                    2,pageSize,0, 1,
                    s.toString()
                )
            }
        })


        binding?.categoriesRecyclerView?.isNestedScrollingEnabled = false
        binding?.offersRecyclerView?.isNestedScrollingEnabled = true
        val manager: LinearLayoutManager
        manager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.VERTICAL,
            false
        )


        binding?.categoriesRecyclerView?.layoutManager = manager
        categoryAdapter =
            CategoryAdapter(requireContext(), mutableListOf(),0)

        binding?.categoriesRecyclerView?.adapter = categoryAdapter

        binding?.nestedScrollView?.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->

            currentOfferPage++
            if (scrollY > oldScrollY) {
            }
            if (scrollY < oldScrollY) {
            }
            if (scrollY == 0) {
            }
            if (scrollY == v.getChildAt(0).measuredHeight - v.measuredHeight) {
                println("BOTTOM SCROLL")
                currentPage++
                if (searchBy == null) {
                    viewModel!!.getMyEStoreCategory(
                        getMyEStoreNextPageCategoryRetrofitCallback, currentPage,
                        2, pageSize, 0,1
                    )
                }else if (searchBy != null){
                    viewModel!!.getMyEStoreCategoryBySearch(getMyEStoreNextPageCategoryRetrofitCallback,currentPage,
                        2,pageSize,0, 1,
                        searchBy!!
                    )
                }
            }
        })


        val snap = LinearSnapHelper()
        snap.attachToRecyclerView(binding?.offersRecyclerView)

        viewModel!!.getAllOffers(
            getAllOffersPageCategoryRetrofitCallback,
            1,
            pageSize,
            1,
            0,
            ""
        )


        infiniteScrollListener = InfiniteNestedScrollListener(manager, this)
        infiniteScrollListener!!.setLoaded()
        val managerHorizontal: LinearLayoutManager
        managerHorizontal = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false
        )
        binding?.offersRecyclerView?.layoutManager = managerHorizontal

        val firstVisiblePosition: Int = managerHorizontal.findLastCompletelyVisibleItemPosition()
        offersAdapter?.getItem(firstVisiblePosition)
//        utils!.showToast(firstVisiblePosition.toString())
        binding?.offersRecyclerView?.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

            }
        })

        offersAdapter =
            ViewAllOffersAdapter(requireContext(), mutableListOf())

        binding?.offersRecyclerView?.adapter = offersAdapter

        offersAdapter!!.setOnItemClickListener(object : ViewAllOffersAdapter.OnItemClickListener{
            override fun onItemClick(bean: Advertisement, position: Int, i: Int) {
//                viewModel!!.getMyEStoreCategory(
//                    getMyEStoreCategoryRetrofitCallback, 1,
//                    bean?.Id, pageSize, 0,1
//                )
                utils!!.showToast(bean?.Name)
            }

        })


        return binding?.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }

    private val getMyEStoreCategoryRetrofitCallback = object :
        RetrofitCallback<EstoreCategoryModel> {
        override fun onSuccessfulResponse(response: Response<EstoreCategoryModel>) {
            if (activity != null && isAdded) {
                if (response.body()?.Code == Constant.SortType.API_SUCCESS && response.body() != null && response.body()?.Result != null) {
//                    currentPage++
                    categoryAdapter?.refresh(response.body()?.Result?.Headers?.get(0)?.Details!!)
                    viewModel?.storeCount?.value = "My Stores ("+response.body()?.Result?.TotalRecords.toString()+")"
                } else {

                }
            }
        }

        override fun onBadRequest(response: Response<EstoreCategoryModel>) {
            if (activity != null && isAdded) {
                val gson = GsonBuilder().create()
                val errorResponseModel: EstoreCategoryModel
                try {
                    errorResponseModel = gson.fromJson(
                        response.errorBody()!!.string(),
                        EstoreCategoryModel::class.java
                    )

                    utils!!.showToast(
                        errorResponseModel.Message
                    )

                } catch (e: Exception) {
                    utils!!.showToast(
                        getString(R.string.badRequestException)
                    )
                    e.printStackTrace()
                }

            }
        }

        override fun onServerError(response: Response<*>) {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.serverError)
                )
            }
        }

        override fun onUnAuthorized() {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.unauthorized)
                )
            }
        }

        override fun onForbidden() {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.forbidden)
                )
            }
        }

        override fun onFailure(failure: String) {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.connectivityLost)
                )
            }
        }

        override fun onEverytime() {
            if (activity != null && isAdded) {
                binding?.swiperefresh?.isRefreshing = false
            }
        }
    }

    private val getMyEStoreNextPageCategoryRetrofitCallback = object :
        RetrofitCallback<EstoreCategoryModel> {
        override fun onSuccessfulResponse(response: Response<EstoreCategoryModel>) {
            if (activity != null && isAdded) {
                if (response.body()?.Code == Constant.SortType.API_SUCCESS && response.body() != null && response.body()?.Result != null) {
//                    currentPage++
                    categoryAdapter?.addItem(response.body()?.Result?.Headers?.get(0)?.Details!!)
                } else {
                }
            }
        }

        override fun onBadRequest(response: Response<EstoreCategoryModel>) {
            if (activity != null && isAdded) {
                val gson = GsonBuilder().create()
                val errorResponseModel: EstoreCategoryModel
                try {
                    errorResponseModel = gson.fromJson(
                        response.errorBody()!!.string(),
                        EstoreCategoryModel::class.java
                    )

                    utils!!.showToast(
                        errorResponseModel.Message
                    )

                } catch (e: Exception) {
                    utils!!.showToast(
                        getString(R.string.badRequestException)
                    )
                    e.printStackTrace()
                }

            }
        }

        override fun onServerError(response: Response<*>) {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.serverError)
                )
            }
        }

        override fun onUnAuthorized() {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.unauthorized)
                )
            }
        }

        override fun onForbidden() {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.forbidden)
                )
            }
        }

        override fun onFailure(failure: String) {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.connectivityLost)
                )
            }
        }

        override fun onEverytime() {
            if (activity != null && isAdded) {
                binding?.swiperefresh?.isRefreshing = false
            }
        }
    }


    private val getAllOffersPageCategoryRetrofitCallback = object :
        RetrofitCallback<ViewAllOffersResponseModel> {
        override fun onSuccessfulResponse(response: Response<ViewAllOffersResponseModel>) {
            if (activity != null && isAdded) {
                if (response.body()?.Code == Constant.SortType.API_SUCCESS && response.body() != null && response.body()?.Result != null) {
//                    currentPage++
                    offersAdapter?.refresh(response.body()?.Result?.Advertisements!!)
                } else {

                }
            }
        }

        override fun onBadRequest(response: Response<ViewAllOffersResponseModel>) {
            if (activity != null && isAdded) {
                val gson = GsonBuilder().create()
                val errorResponseModel: ViewAllOffersResponseModel
                try {
                    errorResponseModel = gson.fromJson(
                        response.errorBody()!!.string(),
                        ViewAllOffersResponseModel::class.java
                    )

                    utils!!.showToast(
                        errorResponseModel.Message
                    )

                } catch (e: Exception) {
                    utils!!.showToast(
                        getString(R.string.badRequestException)
                    )
                    e.printStackTrace()
                }

            }
        }

        override fun onServerError(response: Response<*>) {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.serverError)
                )
            }
        }

        override fun onUnAuthorized() {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.unauthorized)
                )
            }
        }

        override fun onForbidden() {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.forbidden)
                )
            }
        }

        override fun onFailure(failure: String) {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.connectivityLost)
                )
            }
        }

        override fun onEverytime() {
            if (activity != null && isAdded) {
                binding?.swiperefresh?.isRefreshing = false
            }
        }
    }

    private val getAllOffersNextPageCategoryRetrofitCallback = object :
        RetrofitCallback<ViewAllOffersResponseModel> {
        override fun onSuccessfulResponse(response: Response<ViewAllOffersResponseModel>) {
            if (activity != null && isAdded) {
                if (response.body()?.Code == Constant.SortType.API_SUCCESS && response.body() != null && response.body()?.Result != null) {
                    offersAdapter?.addItem(response.body()?.Result?.Advertisements!!)
                } else {
                }
            }
        }

        override fun onBadRequest(response: Response<ViewAllOffersResponseModel>) {
            if (activity != null && isAdded) {
                val gson = GsonBuilder().create()
                val errorResponseModel: ViewAllOffersResponseModel
                try {
                    errorResponseModel = gson.fromJson(
                        response.errorBody()!!.string(),
                        ViewAllOffersResponseModel::class.java
                    )

                    utils!!.showToast(
                        errorResponseModel.Message
                    )

                } catch (e: Exception) {
                    utils!!.showToast(
                        getString(R.string.badRequestException)
                    )
                    e.printStackTrace()
                }

            }
        }

        override fun onServerError(response: Response<*>) {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.serverError)
                )
            }
        }

        override fun onUnAuthorized() {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.unauthorized)
                )
            }
        }

        override fun onForbidden() {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.forbidden)
                )
            }
        }

        override fun onFailure(failure: String) {
            if (activity != null && isAdded) {
                utils!!.showToast(
                    getString(R.string.connectivityLost)
                )
            }
        }

        override fun onEverytime() {
            if (activity != null && isAdded) {
            }
        }
    }


    override fun onResume() {
        super.onResume()
        currentPage = 1
    }

    override fun onLoadMore() {
        currentOfferPage++
    }

}