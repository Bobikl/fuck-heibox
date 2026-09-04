package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCouponCountObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MallCouponCountObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String all;

    @e
    private String coupon;

    @e
    private String redeem;

    public MallCouponCountObj(@e String str, @e String str2, @e String str3) {
        this.coupon = str;
        this.all = str2;
        this.redeem = str3;
    }

    public static /* synthetic */ MallCouponCountObj copy$default(MallCouponCountObj mallCouponCountObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCouponCountObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.M2, new Class[]{MallCouponCountObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, MallCouponCountObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallCouponCountObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = mallCouponCountObj.coupon;
        }
        if ((i10 & 2) != 0) {
            str2 = mallCouponCountObj.all;
        }
        if ((i10 & 4) != 0) {
            str3 = mallCouponCountObj.redeem;
        }
        return mallCouponCountObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.coupon;
    }

    @e
    public final String component2() {
        return this.all;
    }

    @e
    public final String component3() {
        return this.redeem;
    }

    @d
    public final MallCouponCountObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.l.L2, new Class[]{String.class, String.class, String.class}, MallCouponCountObj.class);
        return patchProxyResultProxy.isSupported ? (MallCouponCountObj) patchProxyResultProxy.result : new MallCouponCountObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.P2, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallCouponCountObj)) {
            return false;
        }
        MallCouponCountObj mallCouponCountObj = (MallCouponCountObj) obj;
        return f0.g(this.coupon, mallCouponCountObj.coupon) && f0.g(this.all, mallCouponCountObj.all) && f0.g(this.redeem, mallCouponCountObj.redeem);
    }

    @e
    public final String getAll() {
        return this.all;
    }

    @e
    public final String getCoupon() {
        return this.coupon;
    }

    @e
    public final String getRedeem() {
        return this.redeem;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.O2, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.coupon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.all;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redeem;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAll(@e String str) {
        this.all = str;
    }

    public final void setCoupon(@e String str) {
        this.coupon = str;
    }

    public final void setRedeem(@e String str) {
        this.redeem = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.N2, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallCouponCountObj(coupon=" + this.coupon + ", all=" + this.all + ", redeem=" + this.redeem + ')';
    }
}
