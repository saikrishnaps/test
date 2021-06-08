package com.datstorm.imageviews.view.landing.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006/"}, d2 = {"Lcom/datstorm/imageviews/view/landing/view/LandingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "backPressed", "", "binding", "Lcom/datstorm/imageviews/databinding/FragmentLandingBinding;", "materialAlertDialogBuilder", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "getMaterialAlertDialogBuilder", "()Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "setMaterialAlertDialogBuilder", "(Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)V", "navController", "Landroidx/navigation/NavController;", "navGraph", "Landroidx/navigation/NavGraph;", "getNavGraph", "()Landroidx/navigation/NavGraph;", "setNavGraph", "(Landroidx/navigation/NavGraph;)V", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "setNavHostFragment", "(Landroidx/navigation/fragment/NavHostFragment;)V", "navigationItemSelectedListener", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "getNavigationItemSelectedListener", "()Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "setNavigationItemSelectedListener", "(Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;)V", "viewModel", "Lcom/datstorm/imageviews/view/landing/view_model/LandingViewModel;", "getViewModel", "()Lcom/datstorm/imageviews/view/landing/view_model/LandingViewModel;", "setViewModel", "(Lcom/datstorm/imageviews/view/landing/view_model/LandingViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class LandingFragment extends androidx.fragment.app.Fragment {
    private com.datstorm.imageviews.databinding.FragmentLandingBinding binding;
    @org.jetbrains.annotations.NotNull()
    public com.datstorm.imageviews.view.landing.view_model.LandingViewModel viewModel;
    private long backPressed = 0L;
    private androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.fragment.NavHostFragment navHostFragment;
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.NavGraph navGraph;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.dialog.MaterialAlertDialogBuilder materialAlertDialogBuilder;
    @org.jetbrains.annotations.NotNull()
    private com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.imageviews.view.landing.view_model.LandingViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.datstorm.imageviews.view.landing.view_model.LandingViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.fragment.NavHostFragment getNavHostFragment() {
        return null;
    }
    
    public final void setNavHostFragment(@org.jetbrains.annotations.NotNull()
    androidx.navigation.fragment.NavHostFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavGraph getNavGraph() {
        return null;
    }
    
    public final void setNavGraph(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraph p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.dialog.MaterialAlertDialogBuilder getMaterialAlertDialogBuilder() {
        return null;
    }
    
    public final void setMaterialAlertDialogBuilder(@org.jetbrains.annotations.NotNull()
    com.google.android.material.dialog.MaterialAlertDialogBuilder p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener getNavigationItemSelectedListener() {
        return null;
    }
    
    public final void setNavigationItemSelectedListener(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener p0) {
    }
    
    public LandingFragment() {
        super();
    }
}