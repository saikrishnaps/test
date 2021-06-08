package com.datstorm.imageviews.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/datstorm/imageviews/application/ImageApplication;", "Landroidx/multidex/MultiDexApplication;", "()V", "mRetrofitService", "Lcom/datstorm/imageviews/api_service/APIService;", "get", "context", "Landroid/content/Context;", "getRetrofitService", "onCreate", "", "onLowMemory", "onTerminate", "Companion", "app_debug"})
public final class ImageApplication extends androidx.multidex.MultiDexApplication {
    private com.datstorm.imageviews.api_service.APIService mRetrofitService;
    public static final com.datstorm.imageviews.application.ImageApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.datstorm.imageviews.api_service.APIService getRetrofitService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.datstorm.imageviews.application.ImageApplication get(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
    public ImageApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/datstorm/imageviews/application/ImageApplication$Companion;", "", "()V", "get", "Lcom/datstorm/imageviews/application/ImageApplication;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.datstorm.imageviews.application.ImageApplication get(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}