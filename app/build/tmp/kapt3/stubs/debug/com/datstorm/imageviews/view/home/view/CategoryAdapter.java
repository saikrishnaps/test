package com.datstorm.imageviews.view.home.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\"#B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\u0018\u001a\u00020\tH\u0016J\u001c\u0010\u0019\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0017J\u001c\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0014\u0010 \u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006$"}, d2 = {"Lcom/datstorm/imageviews/view/home/view/CategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/datstorm/imageviews/view/home/view/CategoryAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "result", "", "Lcom/datstorm/estore/view/categories/model/domain/Detail;", "i", "", "(Landroid/content/Context;Ljava/util/List;I)V", "getI", "()I", "setI", "(I)V", "onItemClickListener", "Lcom/datstorm/imageviews/view/home/view/CategoryAdapter$OnItemClickListener;", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "addItem", "", "items", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refresh", "setOnItemClickListener", "MyViewHolder", "OnItemClickListener", "app_debug"})
public final class CategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.datstorm.imageviews.view.home.view.CategoryAdapter.MyViewHolder> {
    private com.datstorm.imageviews.view.home.view.CategoryAdapter.OnItemClickListener onItemClickListener;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> result;
    private int i;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.datstorm.imageviews.view.home.view.CategoryAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.datstorm.imageviews.view.home.view.CategoryAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void refresh(@org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> result) {
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> items) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.datstorm.imageviews.view.home.view.CategoryAdapter.OnItemClickListener onItemClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> p0) {
    }
    
    public final int getI() {
        return 0;
    }
    
    public final void setI(int p0) {
    }
    
    public CategoryAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> result, int i) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/datstorm/imageviews/view/home/view/CategoryAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/datstorm/imageviews/view/home/view/CategoryAdapter;Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView$app_debug", "()Landroid/widget/ImageView;", "titleTextView", "Landroid/widget/TextView;", "getTitleTextView$app_debug", "()Landroid/widget/TextView;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imageView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTextView$app_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageView$app_debug() {
            return null;
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/datstorm/imageviews/view/home/view/CategoryAdapter$OnItemClickListener;", "", "onItemClick", "", "bean", "Lcom/datstorm/estore/view/categories/model/domain/Detail;", "position", "", "i", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.datstorm.estore.view.categories.model.domain.Detail bean, int position, int i);
    }
}