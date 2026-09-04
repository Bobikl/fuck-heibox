package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ItemQuickPriceObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ItemQuickPriceObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String min_price;

    @e
    private String quick_price;

    public ItemQuickPriceObj(@e String str, @e String str2) {
        this.min_price = str;
        this.quick_price = str2;
    }

    public static /* synthetic */ ItemQuickPriceObj copy$default(ItemQuickPriceObj itemQuickPriceObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{itemQuickPriceObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16018, new Class[]{ItemQuickPriceObj.class, String.class, String.class, Integer.TYPE, Object.class}, ItemQuickPriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemQuickPriceObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = itemQuickPriceObj.min_price;
        }
        if ((i10 & 2) != 0) {
            str2 = itemQuickPriceObj.quick_price;
        }
        return itemQuickPriceObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.min_price;
    }

    @e
    public final String component2() {
        return this.quick_price;
    }

    @d
    public final ItemQuickPriceObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 16017, new Class[]{String.class, String.class}, ItemQuickPriceObj.class);
        return patchProxyResultProxy.isSupported ? (ItemQuickPriceObj) patchProxyResultProxy.result : new ItemQuickPriceObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16021, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemQuickPriceObj)) {
            return false;
        }
        ItemQuickPriceObj itemQuickPriceObj = (ItemQuickPriceObj) obj;
        return f0.g(this.min_price, itemQuickPriceObj.min_price) && f0.g(this.quick_price, itemQuickPriceObj.quick_price);
    }

    @e
    public final String getMin_price() {
        return this.min_price;
    }

    @e
    public final String getQuick_price() {
        return this.quick_price;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16020, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.min_price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.quick_price;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setMin_price(@e String str) {
        this.min_price = str;
    }

    public final void setQuick_price(@e String str) {
        this.quick_price = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16019, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ItemQuickPriceObj(min_price=" + this.min_price + ", quick_price=" + this.quick_price + ')';
    }
}
