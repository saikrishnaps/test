package com.datstorm.imageviews.components;

import android.content.Context;
import android.util.AttributeSet;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class SwipeRefreshWrapper extends SwipeRefreshLayout {
    private ScrollResolver mScrollResolver;

    public SwipeRefreshWrapper(Context context) {
        super(context);
    }

    public SwipeRefreshWrapper(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScrollResolver(ScrollResolver scrollResolver) {
        mScrollResolver = scrollResolver;
    }

    @Override
    public boolean canChildScrollUp() {
        if(mScrollResolver != null){
            return mScrollResolver.canScrollUp();
        }else {
            return super.canChildScrollUp();
        }
    }

    public interface ScrollResolver{
        boolean canScrollUp();
    }
}
