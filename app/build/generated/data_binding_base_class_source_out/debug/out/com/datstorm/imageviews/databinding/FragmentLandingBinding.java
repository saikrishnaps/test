// Generated by data binding compiler. Do not edit!
package com.datstorm.imageviews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.datstorm.imageviews.R;
import com.datstorm.imageviews.view.landing.view_model.LandingViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLandingBinding extends ViewDataBinding {
  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final LinearLayout contentContainer;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout topRelativeLayout;

  @Bindable
  protected LandingViewModel mViewModel;

  protected FragmentLandingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      BottomNavigationView bottomNavigationView, LinearLayout contentContainer, ImageView imageView,
      LinearLayout topRelativeLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomNavigationView = bottomNavigationView;
    this.contentContainer = contentContainer;
    this.imageView = imageView;
    this.topRelativeLayout = topRelativeLayout;
  }

  public abstract void setViewModel(@Nullable LandingViewModel viewModel);

  @Nullable
  public LandingViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_landing, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLandingBinding>inflateInternal(inflater, R.layout.fragment_landing, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_landing, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLandingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLandingBinding>inflateInternal(inflater, R.layout.fragment_landing, null, false, component);
  }

  public static FragmentLandingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLandingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLandingBinding)bind(component, view, R.layout.fragment_landing);
  }
}
