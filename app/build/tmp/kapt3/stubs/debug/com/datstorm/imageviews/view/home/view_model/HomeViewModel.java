package com.datstorm.imageviews.view.home.view_model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J<\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0007J<\u0010 \u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0010JD\u0010$\u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0007R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000b\u00a8\u0006%"}, d2 = {"Lcom/datstorm/imageviews/view/home/view_model/HomeViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "domainName", "Landroidx/lifecycle/MutableLiveData;", "", "getDomainName", "()Landroidx/lifecycle/MutableLiveData;", "setDomainName", "(Landroidx/lifecycle/MutableLiveData;)V", "errorText", "getErrorText", "setErrorText", "progressDialog", "", "getProgressDialog", "setProgressDialog", "storeCount", "getStoreCount", "setStoreCount", "getAllOffers", "", "getAllOffersRetrofitCallback", "Lcom/datstorm/imageviews/callbacks/RetrofitCallback;", "Lcom/datstorm/imageviews/view/home/model/view_all_offers/ViewAllOffersResponseModel;", "currentPage", "pageSize", "domainId", "favourite", "searchBy", "getMyEStoreCategory", "getMyEStoreCategoryRetrofitCallback", "Lcom/datstorm/estore/view/categories/model/domain/EstoreCategoryModel;", "orderBy", "getMyEStoreCategoryBySearch", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorText;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> progressDialog;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> domainName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> storeCount;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorText() {
        return null;
    }
    
    public final void setErrorText(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDomainName() {
        return null;
    }
    
    public final void setDomainName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStoreCount() {
        return null;
    }
    
    public final void setStoreCount(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void getMyEStoreCategory(@org.jetbrains.annotations.NotNull()
    com.datstorm.imageviews.callbacks.RetrofitCallback<com.datstorm.estore.view.categories.model.domain.EstoreCategoryModel> getMyEStoreCategoryRetrofitCallback, int currentPage, int domainId, int pageSize, int favourite, int orderBy) {
    }
    
    public final void getMyEStoreCategoryBySearch(@org.jetbrains.annotations.NotNull()
    com.datstorm.imageviews.callbacks.RetrofitCallback<com.datstorm.estore.view.categories.model.domain.EstoreCategoryModel> getMyEStoreCategoryRetrofitCallback, int currentPage, int domainId, int pageSize, int favourite, int orderBy, @org.jetbrains.annotations.NotNull()
    java.lang.String searchBy) {
    }
    
    public final void getAllOffers(@org.jetbrains.annotations.NotNull()
    com.datstorm.imageviews.callbacks.RetrofitCallback<com.datstorm.imageviews.view.home.model.view_all_offers.ViewAllOffersResponseModel> getAllOffersRetrofitCallback, int currentPage, int pageSize, int domainId, int favourite, @org.jetbrains.annotations.NotNull()
    java.lang.String searchBy) {
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}