package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PriceHistoryResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class LowestInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String date;

    @e
    private String is_lowest;

    @e
    private String price;

    @e
    private String region;

    public LowestInfoObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.date = str;
        this.is_lowest = str2;
        this.price = str3;
        this.region = str4;
    }

    public static /* synthetic */ LowestInfoObj copy$default(LowestInfoObj lowestInfoObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lowestInfoObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 14904, new Class[]{LowestInfoObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, LowestInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LowestInfoObj) patchProxyResultProxy.result;
        }
        return lowestInfoObj.copy((i10 & 1) != 0 ? lowestInfoObj.date : str, (i10 & 2) != 0 ? lowestInfoObj.is_lowest : str2, (i10 & 4) != 0 ? lowestInfoObj.price : str3, (i10 & 8) != 0 ? lowestInfoObj.region : str4);
    }

    @e
    public final String component1() {
        return this.date;
    }

    @e
    public final String component2() {
        return this.is_lowest;
    }

    @e
    public final String component3() {
        return this.price;
    }

    @e
    public final String component4() {
        return this.region;
    }

    @d
    public final LowestInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 14903, new Class[]{String.class, String.class, String.class, String.class}, LowestInfoObj.class);
        return patchProxyResultProxy.isSupported ? (LowestInfoObj) patchProxyResultProxy.result : new LowestInfoObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14907, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LowestInfoObj)) {
            return false;
        }
        LowestInfoObj lowestInfoObj = (LowestInfoObj) obj;
        return f0.g(this.date, lowestInfoObj.date) && f0.g(this.is_lowest, lowestInfoObj.is_lowest) && f0.g(this.price, lowestInfoObj.price) && f0.g(this.region, lowestInfoObj.region);
    }

    @e
    public final String getDate() {
        return this.date;
    }

    @e
    public final String getPrice() {
        return this.price;
    }

    @e
    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14906, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.is_lowest;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.price;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.region;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @e
    public final String is_lowest() {
        return this.is_lowest;
    }

    public final void setDate(@e String str) {
        this.date = str;
    }

    public final void setPrice(@e String str) {
        this.price = str;
    }

    public final void setRegion(@e String str) {
        this.region = str;
    }

    public final void set_lowest(@e String str) {
        this.is_lowest = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14905, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LowestInfoObj(date=" + this.date + ", is_lowest=" + this.is_lowest + ", price=" + this.price + ", region=" + this.region + ')';
    }
}
