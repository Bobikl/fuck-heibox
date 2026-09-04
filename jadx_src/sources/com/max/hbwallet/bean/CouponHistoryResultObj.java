package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CouponHistoryResultObj.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CouponHistoryResultObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<MallCouponObj> items;

    @e
    private String lastval;

    public CouponHistoryResultObj(@e ArrayList<MallCouponObj> arrayList, @e String str) {
        this.items = arrayList;
        this.lastval = str;
    }

    public static /* synthetic */ CouponHistoryResultObj copy$default(CouponHistoryResultObj couponHistoryResultObj, ArrayList arrayList, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{couponHistoryResultObj, arrayList, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.f34533x2, new Class[]{CouponHistoryResultObj.class, ArrayList.class, String.class, Integer.TYPE, Object.class}, CouponHistoryResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CouponHistoryResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = couponHistoryResultObj.items;
        }
        if ((i10 & 2) != 0) {
            str = couponHistoryResultObj.lastval;
        }
        return couponHistoryResultObj.copy(arrayList, str);
    }

    @e
    public final ArrayList<MallCouponObj> component1() {
        return this.items;
    }

    @e
    public final String component2() {
        return this.lastval;
    }

    @d
    public final CouponHistoryResultObj copy(@e ArrayList<MallCouponObj> arrayList, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str}, this, changeQuickRedirect, false, c.l.f34511w2, new Class[]{ArrayList.class, String.class}, CouponHistoryResultObj.class);
        return patchProxyResultProxy.isSupported ? (CouponHistoryResultObj) patchProxyResultProxy.result : new CouponHistoryResultObj(arrayList, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.A2, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponHistoryResultObj)) {
            return false;
        }
        CouponHistoryResultObj couponHistoryResultObj = (CouponHistoryResultObj) obj;
        return f0.g(this.items, couponHistoryResultObj.items) && f0.g(this.lastval, couponHistoryResultObj.lastval);
    }

    @e
    public final ArrayList<MallCouponObj> getItems() {
        return this.items;
    }

    @e
    public final String getLastval() {
        return this.lastval;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34577z2, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<MallCouponObj> arrayList = this.items;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.lastval;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setItems(@e ArrayList<MallCouponObj> arrayList) {
        this.items = arrayList;
    }

    public final void setLastval(@e String str) {
        this.lastval = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34555y2, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CouponHistoryResultObj(items=" + this.items + ", lastval=" + this.lastval + ')';
    }
}
