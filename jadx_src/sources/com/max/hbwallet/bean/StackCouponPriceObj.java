package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallOrderStackCouponObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StackCouponPriceObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String discount;

    @e
    private String final_price;

    @e
    private String initial_price;

    public StackCouponPriceObj(@e String str, @e String str2, @e String str3) {
        this.discount = str;
        this.final_price = str2;
        this.initial_price = str3;
    }

    public static /* synthetic */ StackCouponPriceObj copy$default(StackCouponPriceObj stackCouponPriceObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{stackCouponPriceObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.f34424s3, new Class[]{StackCouponPriceObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, StackCouponPriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StackCouponPriceObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = stackCouponPriceObj.discount;
        }
        if ((i10 & 2) != 0) {
            str2 = stackCouponPriceObj.final_price;
        }
        if ((i10 & 4) != 0) {
            str3 = stackCouponPriceObj.initial_price;
        }
        return stackCouponPriceObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.discount;
    }

    @e
    public final String component2() {
        return this.final_price;
    }

    @e
    public final String component3() {
        return this.initial_price;
    }

    @d
    public final StackCouponPriceObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.l.f34402r3, new Class[]{String.class, String.class, String.class}, StackCouponPriceObj.class);
        return patchProxyResultProxy.isSupported ? (StackCouponPriceObj) patchProxyResultProxy.result : new StackCouponPriceObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.f34490v3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackCouponPriceObj)) {
            return false;
        }
        StackCouponPriceObj stackCouponPriceObj = (StackCouponPriceObj) obj;
        return f0.g(this.discount, stackCouponPriceObj.discount) && f0.g(this.final_price, stackCouponPriceObj.final_price) && f0.g(this.initial_price, stackCouponPriceObj.initial_price);
    }

    @e
    public final String getDiscount() {
        return this.discount;
    }

    @e
    public final String getFinal_price() {
        return this.final_price;
    }

    @e
    public final String getInitial_price() {
        return this.initial_price;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34468u3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.discount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.final_price;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initial_price;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDiscount(@e String str) {
        this.discount = str;
    }

    public final void setFinal_price(@e String str) {
        this.final_price = str;
    }

    public final void setInitial_price(@e String str) {
        this.initial_price = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34446t3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StackCouponPriceObj(discount=" + this.discount + ", final_price=" + this.final_price + ", initial_price=" + this.initial_price + ')';
    }
}
