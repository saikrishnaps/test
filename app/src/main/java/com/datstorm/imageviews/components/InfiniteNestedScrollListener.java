package com.datstorm.imageviews.components;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;

public class InfiniteNestedScrollListener implements NestedScrollView.OnScrollChangeListener {

    private final static int VISIBLE_THRESHOLD = 2;
    private LinearLayoutManager linearLayoutManager;
    private boolean loading; // LOAD MORE Progress dialog
    private OnLoadMoreListener listener;
    private boolean pauseListening = false;


    private boolean END_OF_FEED_ADDED = false;
    private int NUM_LOAD_ITEMS = 10;

    public InfiniteNestedScrollListener(LinearLayoutManager linearLayoutManager, OnLoadMoreListener listener) {
        this.linearLayoutManager = linearLayoutManager;
        this.listener = listener;
    }

//    @Override
//    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//        super.onScrolled(recyclerView, dx, dy);
//        if (dx == 0 && dy == 0)
//            return;
//        int totalItemCount = linearLayoutManager.getItemCount();
//        int lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();
//        if (!loading && totalItemCount <= lastVisibleItem + VISIBLE_THRESHOLD && totalItemCount != 0 && !END_OF_FEED_ADDED && !pauseListening) {
//            if (listener != null) {
//                listener.onLoadMore();
//            }
//            loading = true;
//        }
//    }

    public void setLoaded() {
        loading = false;
    }

    @Override
    public void onScrollChange(NestedScrollView v, int dx, int dy, int oldScrollX, int oldScrollY) {
//        if (dx == 0 && dy == 0)
//            return;
//        int totalItemCount = linearLayoutManager.getItemCount();
//        int lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();
//        if (!loading && totalItemCount <= lastVisibleItem + VISIBLE_THRESHOLD && totalItemCount != 0 && !END_OF_FEED_ADDED && !pauseListening) {
//            if (listener != null) {
//                listener.onLoadMore();
//            }
//            loading = true;
//        }

        if (v.getChildAt(v.getChildCount() - 1) != null) {
            if ((dy >= (v.getChildAt(v.getChildCount() - 1).getMeasuredHeight() - v.getMeasuredHeight())) &&
                    dy > oldScrollY) {

                int visibleItemCount = linearLayoutManager.getChildCount();
               int totalItemCount = linearLayoutManager.getItemCount();
                int pastVisiblesItems = linearLayoutManager.findFirstVisibleItemPosition();

                if (!loading) {

                    if ((visibleItemCount + pastVisiblesItems) >= totalItemCount) {
                        listener.onLoadMore();
                        loading = true;
//                        Load Your Data
                    }
                }
            }
        }
    }

    public interface OnLoadMoreListener {
        void onLoadMore();
    }

    public void addEndOfRequests() {
        this.END_OF_FEED_ADDED = true;
    }

    public void pauseScrollListener(boolean pauseListening) {
        this.pauseListening = pauseListening;
    }
}
