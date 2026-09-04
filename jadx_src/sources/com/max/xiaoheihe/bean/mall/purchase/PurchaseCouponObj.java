package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchaseCouponObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchaseCouponObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String cate;

    @e
    private String primary_id;

    public PurchaseCouponObj(@e String str, @e String str2) {
        this.primary_id = str;
        this.cate = str2;
    }

    public static /* synthetic */ PurchaseCouponObj copy$default(PurchaseCouponObj purchaseCouponObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchaseCouponObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15690, new Class[]{PurchaseCouponObj.class, String.class, String.class, Integer.TYPE, Object.class}, PurchaseCouponObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseCouponObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = purchaseCouponObj.primary_id;
        }
        if ((i10 & 2) != 0) {
            str2 = purchaseCouponObj.cate;
        }
        return purchaseCouponObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.primary_id;
    }

    @e
    public final String component2() {
        return this.cate;
    }

    @d
    public final PurchaseCouponObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15689, new Class[]{String.class, String.class}, PurchaseCouponObj.class);
        return patchProxyResultProxy.isSupported ? (PurchaseCouponObj) patchProxyResultProxy.result : new PurchaseCouponObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15693, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseCouponObj)) {
            return false;
        }
        PurchaseCouponObj purchaseCouponObj = (PurchaseCouponObj) obj;
        return f0.g(this.primary_id, purchaseCouponObj.primary_id) && f0.g(this.cate, purchaseCouponObj.cate);
    }

    @e
    public final String getCate() {
        return this.cate;
    }

    @e
    public final String getPrimary_id() {
        return this.primary_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15692, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.primary_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cate;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCate(@e String str) {
        this.cate = str;
    }

    public final void setPrimary_id(@e String str) {
        this.primary_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15691, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchaseCouponObj(primary_id=" + this.primary_id + ", cate=" + this.cate + ')';
    }
}
