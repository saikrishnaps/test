package com.datstorm.estore.view.categories.model.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0001H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\u0014H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0001H\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0001H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0001H\u00c6\u0003J\u00a3\u0001\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0006H\u00c6\u0001J\u0013\u00106\u001a\u00020\u00142\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0006H\u00d6\u0001J\t\u00109\u001a\u00020:H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001a\u00a8\u0006;"}, d2 = {"Lcom/datstorm/estore/view/categories/model/domain/Result;", "", "Advertisements", "", "Lcom/datstorm/estore/view/categories/model/domain/Advertisement;", "BranchCode", "", "CompanyCode", "Details", "Headers", "Lcom/datstorm/estore/view/categories/model/domain/Header;", "Message", "OfferProducts", "Lcom/datstorm/estore/view/categories/model/domain/OfferProduct;", "Offers", "Lcom/datstorm/estore/view/categories/model/domain/Offer;", "Products", "ProductsList", "ReturnCode", "Success", "", "TotalRecords", "(Ljava/util/List;IILjava/lang/Object;Ljava/util/List;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;IZI)V", "getAdvertisements", "()Ljava/util/List;", "getBranchCode", "()I", "getCompanyCode", "getDetails", "()Ljava/lang/Object;", "getHeaders", "getMessage", "getOfferProducts", "getOffers", "getProducts", "getProductsList", "getReturnCode", "getSuccess", "()Z", "getTotalRecords", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.datstorm.estore.view.categories.model.domain.Advertisement> Advertisements = null;
    private final int BranchCode = 0;
    private final int CompanyCode = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Details = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.datstorm.estore.view.categories.model.domain.Header> Headers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Message = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.datstorm.estore.view.categories.model.domain.OfferProduct> OfferProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.datstorm.estore.view.categories.model.domain.Offer> Offers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Products = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ProductsList = null;
    private final int ReturnCode = 0;
    private final boolean Success = false;
    private final int TotalRecords = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.Advertisement> getAdvertisements() {
        return null;
    }
    
    public final int getBranchCode() {
        return 0;
    }
    
    public final int getCompanyCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.Header> getHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.OfferProduct> getOfferProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.Offer> getOffers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getProductsList() {
        return null;
    }
    
    public final int getReturnCode() {
        return 0;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final int getTotalRecords() {
        return 0;
    }
    
    public Result(@org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Advertisement> Advertisements, int BranchCode, int CompanyCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object Details, @org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Header> Headers, @org.jetbrains.annotations.NotNull()
    java.lang.Object Message, @org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.OfferProduct> OfferProducts, @org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Offer> Offers, @org.jetbrains.annotations.NotNull()
    java.lang.Object Products, @org.jetbrains.annotations.NotNull()
    java.lang.Object ProductsList, int ReturnCode, boolean Success, int TotalRecords) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.Advertisement> component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.Header> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.OfferProduct> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.estore.view.categories.model.domain.Offer> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.estore.view.categories.model.domain.Result copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Advertisement> Advertisements, int BranchCode, int CompanyCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object Details, @org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Header> Headers, @org.jetbrains.annotations.NotNull()
    java.lang.Object Message, @org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.OfferProduct> OfferProducts, @org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.estore.view.categories.model.domain.Offer> Offers, @org.jetbrains.annotations.NotNull()
    java.lang.Object Products, @org.jetbrains.annotations.NotNull()
    java.lang.Object ProductsList, int ReturnCode, boolean Success, int TotalRecords) {
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