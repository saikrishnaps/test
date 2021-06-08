package com.datstorm.imageviews.view.splash.view_model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/datstorm/imageviews/view/splash/view_model/SplashViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "appPreferences", "Lcom/datstorm/imageviews/config/AppPreferences;", "getAppPreferences", "()Lcom/datstorm/imageviews/config/AppPreferences;", "setAppPreferences", "(Lcom/datstorm/imageviews/config/AppPreferences;)V", "errorText", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorText", "()Landroidx/lifecycle/MutableLiveData;", "setErrorText", "(Landroidx/lifecycle/MutableLiveData;)V", "progressDialog", "", "getProgressDialog", "setProgressDialog", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorText;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> progressDialog;
    @org.jetbrains.annotations.Nullable()
    private com.datstorm.imageviews.config.AppPreferences appPreferences;
    
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.datstorm.imageviews.config.AppPreferences getAppPreferences() {
        return null;
    }
    
    public final void setAppPreferences(@org.jetbrains.annotations.Nullable()
    com.datstorm.imageviews.config.AppPreferences p0) {
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}