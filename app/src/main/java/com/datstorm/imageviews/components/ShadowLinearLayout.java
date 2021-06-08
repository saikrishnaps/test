package com.datstorm.imageviews.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.datstorm.imageviews.utils.ViewUtils;


public class ShadowLinearLayout extends LinearLayout {
    public ShadowLinearLayout(Context context) {
        super(context);
    }

    public ShadowLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ShadowLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setShadow(int backgroundColor, int shadowRadius, int shadowColor, int leftElevation, int rightElevation, int topElevation, int bottomElevation, float corner, int gravity) {
        setBackground(ViewUtils.generateBackgroundWithShadow(this, backgroundColor,
                shadowRadius, shadowColor, leftElevation, rightElevation, topElevation, bottomElevation, corner, gravity));
    }
}