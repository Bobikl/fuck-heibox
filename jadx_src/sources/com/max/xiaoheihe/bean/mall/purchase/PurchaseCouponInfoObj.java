package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchaseCouponInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchaseCouponInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String available_coupon_count;

    @e
    private String available_coupon_max_deduce;

    @e
    private String coupon_center_protocol;

    @e
    private String coupon_count;

    @e
    private String disable;

    @e
    private String disable_desc;

    public PurchaseCouponInfoObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.coupon_count = str;
        this.available_coupon_count = str2;
        this.coupon_center_protocol = str3;
        this.available_coupon_max_deduce = str4;
        this.disable = str5;
        this.disable_desc = str6;
    }

    public static /* synthetic */ PurchaseCouponInfoObj copy$default(PurchaseCouponInfoObj purchaseCouponInfoObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchaseCouponInfoObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 15685, new Class[]{PurchaseCouponInfoObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, PurchaseCouponInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseCouponInfoObj) patchProxyResultProxy.result;
        }
        return purchaseCouponInfoObj.copy((i10 & 1) != 0 ? purchaseCouponInfoObj.coupon_count : str, (i10 & 2) != 0 ? purchaseCouponInfoObj.available_coupon_count : str2, (i10 & 4) != 0 ? purchaseCouponInfoObj.coupon_center_protocol : str3, (i10 & 8) != 0 ? purchaseCouponInfoObj.available_coupon_max_deduce : str4, (i10 & 16) != 0 ? purchaseCouponInfoObj.disable : str5, (i10 & 32) != 0 ? purchaseCouponInfoObj.disable_desc : str6);
    }

    @e
    public final String component1() {
        return this.coupon_count;
    }

    @e
    public final String component2() {
        return this.available_coupon_count;
    }

    @e
    public final String component3() {
        return this.coupon_center_protocol;
    }

    @e
    public final String component4() {
        return this.available_coupon_max_deduce;
    }

    @e
    public final String component5() {
        return this.disable;
    }

    @e
    public final String component6() {
        return this.disable_desc;
    }

    @d
    public final PurchaseCouponInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 15684, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, PurchaseCouponInfoObj.class);
        return patchProxyResultProxy.isSupported ? (PurchaseCouponInfoObj) patchProxyResultProxy.result : new PurchaseCouponInfoObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15688, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseCouponInfoObj)) {
            return false;
        }
        PurchaseCouponInfoObj purchaseCouponInfoObj = (PurchaseCouponInfoObj) obj;
        return f0.g(this.coupon_count, purchaseCouponInfoObj.coupon_count) && f0.g(this.available_coupon_count, purchaseCouponInfoObj.available_coupon_count) && f0.g(this.coupon_center_protocol, purchaseCouponInfoObj.coupon_center_protocol) && f0.g(this.available_coupon_max_deduce, purchaseCouponInfoObj.available_coupon_max_deduce) && f0.g(this.disable, purchaseCouponInfoObj.disable) && f0.g(this.disable_desc, purchaseCouponInfoObj.disable_desc);
    }

    @e
    public final String getAvailable_coupon_count() {
        return this.available_coupon_count;
    }

    @e
    public final String getAvailable_coupon_max_deduce() {
        return this.available_coupon_max_deduce;
    }

    @e
    public final String getCoupon_center_protocol() {
        return this.coupon_center_protocol;
    }

    @e
    public final String getCoupon_count() {
        return this.coupon_count;
    }

    @e
    public final String getDisable() {
        return this.disable;
    }

    @e
    public final String getDisable_desc() {
        return this.disable_desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15687, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.coupon_count;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.available_coupon_count;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coupon_center_protocol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.available_coupon_max_deduce;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.disable;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.disable_desc;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAvailable_coupon_count(@e String str) {
        this.available_coupon_count = str;
    }

    public final void setAvailable_coupon_max_deduce(@e String str) {
        this.available_coupon_max_deduce = str;
    }

    public final void setCoupon_center_protocol(@e String str) {
        this.coupon_center_protocol = str;
    }

    public final void setCoupon_count(@e String str) {
        this.coupon_count = str;
    }

    public final void setDisable(@e String str) {
        this.disable = str;
    }

    public final void setDisable_desc(@e String str) {
        this.disable_desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15686, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchaseCouponInfoObj(coupon_count=" + this.coupon_count + ", available_coupon_count=" + this.available_coupon_count + ", coupon_center_protocol=" + this.coupon_center_protocol + ", available_coupon_max_deduce=" + this.available_coupon_max_deduce + ", disable=" + this.disable + ", disable_desc=" + this.disable_desc + ')';
    }
}
