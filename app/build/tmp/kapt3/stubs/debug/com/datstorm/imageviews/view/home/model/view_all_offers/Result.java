package com.datstorm.imageviews.view.home.model.view_all_offers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\'\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0014J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0001H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0001H\u00c6\u0003J\t\u0010+\u001a\u00020\u0012H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0001H\u00c6\u0003J\t\u00100\u001a\u00020\u0001H\u00c6\u0003J\t\u00101\u001a\u00020\u0001H\u00c6\u0003J\t\u00102\u001a\u00020\u0001H\u00c6\u0003J\t\u00103\u001a\u00020\u0001H\u00c6\u0003J\t\u00104\u001a\u00020\u0001H\u00c6\u0003J\u009b\u0001\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u00c6\u0001J\u0013\u00106\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0006H\u00d6\u0001J\t\u00109\u001a\u00020:H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018\u00a8\u0006;"}, d2 = {"Lcom/datstorm/imageviews/view/home/model/view_all_offers/Result;", "", "Advertisements", "", "Lcom/datstorm/imageviews/view/home/model/view_all_offers/Advertisement;", "BranchCode", "", "CompanyCode", "Details", "Headers", "Message", "OfferProducts", "Offers", "Products", "ProductsList", "ReturnCode", "SpecialProducts", "Success", "", "TotalRecords", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ZI)V", "getAdvertisements", "()Ljava/util/List;", "getBranchCode", "()I", "getCompanyCode", "getDetails", "()Ljava/lang/Object;", "getHeaders", "getMessage", "getOfferProducts", "getOffers", "getProducts", "getProductsList", "getReturnCode", "getSpecialProducts", "getSuccess", "()Z", "getTotalRecords", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.datstorm.imageviews.view.home.model.view_all_offers.Advertisement> Advertisements = null;
    private final int BranchCode = 0;
    private final int CompanyCode = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Details = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Headers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Message = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object OfferProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Offers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Products = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ProductsList = null;
    private final int ReturnCode = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SpecialProducts = null;
    private final boolean Success = false;
    private final int TotalRecords = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.imageviews.view.home.model.view_all_offers.Advertisement> getAdvertisements() {
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
    public final java.lang.Object getHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getOfferProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getOffers() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSpecialProducts() {
        return null;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final int getTotalRecords() {
        return 0;
    }
    
    public Result(@org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.imageviews.view.home.model.view_all_offers.Advertisement> Advertisements, int BranchCode, int CompanyCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object Details, @org.jetbrains.annotations.NotNull()
    java.lang.Object Headers, @org.jetbrains.annotations.NotNull()
    java.lang.Object Message, @org.jetbrains.annotations.NotNull()
    java.lang.Object OfferProducts, @org.jetbrains.annotations.NotNull()
    java.lang.Object Offers, @org.jetbrains.annotations.NotNull()
    java.lang.Object Products, @org.jetbrains.annotations.NotNull()
    java.lang.Object ProductsList, int ReturnCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object SpecialProducts, boolean Success, int TotalRecords) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.datstorm.imageviews.view.home.model.view_all_offers.Advertisement> component1() {
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
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component8() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component12() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.imageviews.view.home.model.view_all_offers.Result copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.datstorm.imageviews.view.home.model.view_all_offers.Advertisement> Advertisements, int BranchCode, int CompanyCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object Details, @org.jetbrains.annotations.NotNull()
    java.lang.Object Headers, @org.jetbrains.annotations.NotNull()
    java.lang.Object Message, @org.jetbrains.annotations.NotNull()
    java.lang.Object OfferProducts, @org.jetbrains.annotations.NotNull()
    java.lang.Object Offers, @org.jetbrains.annotations.NotNull()
    java.lang.Object Products, @org.jetbrains.annotations.NotNull()
    java.lang.Object ProductsList, int ReturnCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object SpecialProducts, boolean Success, int TotalRecords) {
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