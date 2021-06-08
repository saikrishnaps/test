package com.datstorm.imageviews.api_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u001e\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\tH\'J\u001e\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\'\u00a8\u0006\r"}, d2 = {"Lcom/datstorm/imageviews/api_service/APIService;", "", "getMyEStoreCategories", "Lretrofit2/Call;", "Lcom/datstorm/estore/view/categories/model/domain/EstoreCategoryModel;", "body", "Lcom/datstorm/estore/view/categories/model/domain/EStoreCategoryRequestModel;", "getViewAllOffers", "Lcom/datstorm/imageviews/view/home/model/view_all_offers/ViewAllOffersResponseModel;", "Lcom/datstorm/imageviews/view/home/model/view_all_offers/ViewAllOffersRequestModel;", "searchCategories", "Lcom/datstorm/estore/view/categories/model/search/SearchCategoryRequestModel;", "Factory", "app_debug"})
public abstract interface APIService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "LandingPage/GetMyEStores")
    public abstract retrofit2.Call<com.datstorm.estore.view.categories.model.domain.EstoreCategoryModel> getMyEStoreCategories(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.datstorm.estore.view.categories.model.domain.EStoreCategoryRequestModel body);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "LandingPage/GetMyEStores")
    public abstract retrofit2.Call<com.datstorm.estore.view.categories.model.domain.EstoreCategoryModel> searchCategories(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.datstorm.estore.view.categories.model.search.SearchCategoryRequestModel body);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "LandingPage/ViewAllOffers")
    public abstract retrofit2.Call<com.datstorm.imageviews.view.home.model.view_all_offers.ViewAllOffersResponseModel> getViewAllOffers(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.datstorm.imageviews.view.home.model.view_all_offers.ViewAllOffersRequestModel body);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/datstorm/imageviews/api_service/APIService$Factory;", "", "()V", "create", "Lcom/datstorm/imageviews/api_service/APIService;", "app_debug"})
    public static final class Factory {
        public static final com.datstorm.imageviews.api_service.APIService.Factory INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.datstorm.imageviews.api_service.APIService create() {
            return null;
        }
        
        private Factory() {
            super();
        }
    }
}