package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CouponPriceObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CouponPriceObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String original_coin;

    public CouponPriceObj(@e String str) {
        this.original_coin = str;
    }

    public static /* synthetic */ CouponPriceObj copy$default(CouponPriceObj couponPriceObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{couponPriceObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.H2, new Class[]{CouponPriceObj.class, String.class, Integer.TYPE, Object.class}, CouponPriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CouponPriceObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = couponPriceObj.original_coin;
        }
        return couponPriceObj.copy(str);
    }

    @e
    public final String component1() {
        return this.original_coin;
    }

    @d
    public final CouponPriceObj copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.l.G2, new Class[]{String.class}, CouponPriceObj.class);
        return patchProxyResultProxy.isSupported ? (CouponPriceObj) patchProxyResultProxy.result : new CouponPriceObj(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.K2, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof CouponPriceObj) && f0.g(this.original_coin, ((CouponPriceObj) obj).original_coin);
    }

    @e
    public final String getOriginal_coin() {
        return this.original_coin;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.J2, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.original_coin;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setOriginal_coin(@e String str) {
        this.original_coin = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.I2, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CouponPriceObj(original_coin=" + this.original_coin + ')';
    }
}
