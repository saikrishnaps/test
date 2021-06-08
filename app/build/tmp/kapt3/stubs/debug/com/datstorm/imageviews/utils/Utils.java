package com.datstorm.imageviews.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\"\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0013\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/datstorm/imageviews/utils/Utils;", "", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "progressDialog", "Landroid/app/Dialog;", "toast", "Landroid/widget/Toast;", "dismissProgress", "", "generateOTP", "", "showLongToast", "color", "", "view", "Landroid/view/View;", "message", "showProgress", "showToast", "Companion", "app_debug"})
public final class Utils {
    private android.widget.Toast toast;
    private android.app.Dialog progressDialog;
    private final android.app.Activity context = null;
    public static final com.datstorm.imageviews.utils.Utils.Companion Companion = null;
    
    public final void showToast(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void showLongToast(int color, @org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void showProgress() {
    }
    
    public final void dismissProgress() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String generateOTP() {
        return null;
    }
    
    public Utils(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/datstorm/imageviews/utils/Utils$Companion;", "", "()V", "isNetworkConnected", "", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        public final boolean isNetworkConnected(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}