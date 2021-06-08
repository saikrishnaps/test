package com.datstorm.estore.view.categories.model.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\"\u001a\u00020\rH\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0001H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\rH\u00c6\u0003Js\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0007H\u00d6\u0001J\t\u00100\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001d\u00a8\u00061"}, d2 = {"Lcom/datstorm/estore/view/categories/model/domain/Header;", "", "Description", "Details", "", "Lcom/datstorm/estore/view/categories/model/domain/Detail;", "Id", "", "Images", "IsMyFavourite", "Location", "Lcom/datstorm/estore/view/categories/model/domain/LocationX;", "Name", "", "ProductsCount", "SubTitle", "ThumbnailUrl", "(Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;ILcom/datstorm/estore/view/categories/model/domain/LocationX;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/Object;", "getDetails", "()Ljava/util/List;", "getId", "()I", "getImages", "getIsMyFavourite", "getLocation", "()Lcom/datstorm/estore/view/categories/model/domain/LocationX;", "getName", "()Ljava/lang/String;", "getProductsCount", "getSubTitle", "getThumbnailUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Header {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> Details = null;
    private final int Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Images = null;
    private final int IsMyFavourite = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.datstorm.estore.view.categories.model.domain.LocationX Location = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Name = null;
    private final int ProductsCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String SubTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ThumbnailUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> getDetails() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getImages() {
        return null;
    }
    
    public final int getIsMyFavourite() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.estore.view.categories.model.domain.LocationX getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getProductsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbnailUrl() {
        return null;
    }
    
    public Header(@org.jetbrains.annotations.NotNull()
    java.lang.Object Description, @org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> Details, int Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Images, int IsMyFavourite, @org.jetbrains.annotations.NotNull()
    com.datstorm.estore.view.categories.model.domain.LocationX Location, @org.jetbrains.annotations.NotNull()
    java.lang.String Name, int ProductsCount, @org.jetbrains.annotations.NotNull()
    java.lang.String SubTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String ThumbnailUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.estore.view.categories.model.domain.LocationX component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.estore.view.categories.model.domain.Header copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object Description, @org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Detail> Details, int Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Images, int IsMyFavourite, @org.jetbrains.annotations.NotNull()
    com.datstorm.estore.view.categories.model.domain.LocationX Location, @org.jetbrains.annotations.NotNull()
    java.lang.String Name, int ProductsCount, @org.jetbrains.annotations.NotNull()
    java.lang.String SubTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String ThumbnailUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}