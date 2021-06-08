package com.datstorm.estore.view.categories.model.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0001H\u00c6\u0003J\t\u0010)\u001a\u00020\u000eH\u00c6\u0003J\t\u0010*\u001a\u00020\u0001H\u00c6\u0003J\t\u0010+\u001a\u00020\u0001H\u00c6\u0003J\t\u0010,\u001a\u00020\u0001H\u00c6\u0003J\t\u0010-\u001a\u00020\u0001H\u00c6\u0003J\t\u0010.\u001a\u00020\u000eH\u00c6\u0003J\t\u0010/\u001a\u00020\u0001H\u00c6\u0003J\t\u00100\u001a\u00020\u0001H\u00c6\u0003J\t\u00101\u001a\u00020\u0001H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\u0001H\u00c6\u0003J\t\u00105\u001a\u00020\u000bH\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\u009f\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u00c6\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\u0007H\u00d6\u0001J\t\u0010<\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"\u00a8\u0006="}, d2 = {"Lcom/datstorm/estore/view/categories/model/domain/Products;", "", "BranchId", "CompId", "Description", "DomainId", "ImageId", "", "IsMyFavourite", "OfferPrice", "Price", "", "ProductId", "ProductName", "", "RefDesc", "RefId", "RefType", "SubTitle", "ThumbnailUrl", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IILjava/lang/Object;DILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getBranchId", "()Ljava/lang/Object;", "getCompId", "getDescription", "getDomainId", "getImageId", "()I", "getIsMyFavourite", "getOfferPrice", "getPrice", "()D", "getProductId", "getProductName", "()Ljava/lang/String;", "getRefDesc", "getRefId", "getRefType", "getSubTitle", "getThumbnailUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Products {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CompId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DomainId = null;
    private final int ImageId = 0;
    private final int IsMyFavourite = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object OfferPrice = null;
    private final double Price = 0.0;
    private final int ProductId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ProductName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object RefDesc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object RefId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object RefType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SubTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ThumbnailUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranchId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCompId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDomainId() {
        return null;
    }
    
    public final int getImageId() {
        return 0;
    }
    
    public final int getIsMyFavourite() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getOfferPrice() {
        return null;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final int getProductId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRefDesc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRefId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRefType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSubTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbnailUrl() {
        return null;
    }
    
    public Products(@org.jetbrains.annotations.NotNull()
    java.lang.Object BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.Object CompId, @org.jetbrains.annotations.NotNull()
    java.lang.Object Description, @org.jetbrains.annotations.NotNull()
    java.lang.Object DomainId, int ImageId, int IsMyFavourite, @org.jetbrains.annotations.NotNull()
    java.lang.Object OfferPrice, double Price, int ProductId, @org.jetbrains.annotations.NotNull()
    java.lang.String ProductName, @org.jetbrains.annotations.NotNull()
    java.lang.Object RefDesc, @org.jetbrains.annotations.NotNull()
    java.lang.Object RefId, @org.jetbrains.annotations.NotNull()
    java.lang.Object RefType, @org.jetbrains.annotations.NotNull()
    java.lang.Object SubTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String ThumbnailUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component7() {
        return null;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.estore.view.categories.model.domain.Products copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.Object CompId, @org.jetbrains.annotations.NotNull()
    java.lang.Object Description, @org.jetbrains.annotations.NotNull()
    java.lang.Object DomainId, int ImageId, int IsMyFavourite, @org.jetbrains.annotations.NotNull()
    java.lang.Object OfferPrice, double Price, int ProductId, @org.jetbrains.annotations.NotNull()
    java.lang.String ProductName, @org.jetbrains.annotations.NotNull()
    java.lang.Object RefDesc, @org.jetbrains.annotations.NotNull()
    java.lang.Object RefId, @org.jetbrains.annotations.NotNull()
    java.lang.Object RefType, @org.jetbrains.annotations.NotNull()
    java.lang.Object SubTitle, @org.jetbrains.annotations.NotNull()
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