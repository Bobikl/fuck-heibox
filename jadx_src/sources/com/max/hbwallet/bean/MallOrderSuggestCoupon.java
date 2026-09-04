package com.max.hbwallet.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallOrderStackCouponObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MallOrderSuggestCoupon implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String coupon_id;

    @e
    private String coupon_value;

    public MallOrderSuggestCoupon(@e String str, @e String str2) {
        this.coupon_value = str;
        this.coupon_id = str2;
    }

    public static /* synthetic */ MallOrderSuggestCoupon copy$default(MallOrderSuggestCoupon mallOrderSuggestCoupon, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderSuggestCoupon, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 10111, new Class[]{MallOrderSuggestCoupon.class, String.class, String.class, Integer.TYPE, Object.class}, MallOrderSuggestCoupon.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallOrderSuggestCoupon) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = mallOrderSuggestCoupon.coupon_value;
        }
        if ((i10 & 2) != 0) {
            str2 = mallOrderSuggestCoupon.coupon_id;
        }
        return mallOrderSuggestCoupon.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.coupon_value;
    }

    @e
    public final String component2() {
        return this.coupon_id;
    }

    @d
    public final MallOrderSuggestCoupon copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 10110, new Class[]{String.class, String.class}, MallOrderSuggestCoupon.class);
        return patchProxyResultProxy.isSupported ? (MallOrderSuggestCoupon) patchProxyResultProxy.result : new MallOrderSuggestCoupon(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 10114, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallOrderSuggestCoupon)) {
            return false;
        }
        MallOrderSuggestCoupon mallOrderSuggestCoupon = (MallOrderSuggestCoupon) obj;
        return f0.g(this.coupon_value, mallOrderSuggestCoupon.coupon_value) && f0.g(this.coupon_id, mallOrderSuggestCoupon.coupon_id);
    }

    @e
    public final String getCoupon_id() {
        return this.coupon_id;
    }

    @e
    public final String getCoupon_value() {
        return this.coupon_value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10113, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.coupon_value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.coupon_id;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCoupon_id(@e String str) {
        this.coupon_id = str;
    }

    public final void setCoupon_value(@e String str) {
        this.coupon_value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10112, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallOrderSuggestCoupon(coupon_value=" + this.coupon_value + ", coupon_id=" + this.coupon_id + ')';
    }
}
