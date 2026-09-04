package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchasePriceObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchasePriceObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String current_price;

    @e
    private String initial_price;

    @e
    private String type;

    public PurchasePriceObj(@e String str, @e String str2, @e String str3) {
        this.current_price = str;
        this.type = str2;
        this.initial_price = str3;
    }

    public static /* synthetic */ PurchasePriceObj copy$default(PurchasePriceObj purchasePriceObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchasePriceObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15715, new Class[]{PurchasePriceObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, PurchasePriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchasePriceObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = purchasePriceObj.current_price;
        }
        if ((i10 & 2) != 0) {
            str2 = purchasePriceObj.type;
        }
        if ((i10 & 4) != 0) {
            str3 = purchasePriceObj.initial_price;
        }
        return purchasePriceObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.current_price;
    }

    @e
    public final String component2() {
        return this.type;
    }

    @e
    public final String component3() {
        return this.initial_price;
    }

    @d
    public final PurchasePriceObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15714, new Class[]{String.class, String.class, String.class}, PurchasePriceObj.class);
        return patchProxyResultProxy.isSupported ? (PurchasePriceObj) patchProxyResultProxy.result : new PurchasePriceObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15718, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasePriceObj)) {
            return false;
        }
        PurchasePriceObj purchasePriceObj = (PurchasePriceObj) obj;
        return f0.g(this.current_price, purchasePriceObj.current_price) && f0.g(this.type, purchasePriceObj.type) && f0.g(this.initial_price, purchasePriceObj.initial_price);
    }

    @e
    public final String getCurrent_price() {
        return this.current_price;
    }

    @e
    public final String getInitial_price() {
        return this.initial_price;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15717, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.current_price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initial_price;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCurrent_price(@e String str) {
        this.current_price = str;
    }

    public final void setInitial_price(@e String str) {
        this.initial_price = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15716, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchasePriceObj(current_price=" + this.current_price + ", type=" + this.type + ", initial_price=" + this.initial_price + ')';
    }
}
