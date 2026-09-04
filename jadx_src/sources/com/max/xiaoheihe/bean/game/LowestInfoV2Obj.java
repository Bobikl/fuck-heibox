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
public final class LowestInfoV2Obj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String count;

    @e
    private String currency;

    @e
    private String price;

    public LowestInfoV2Obj(@e String str, @e String str2, @e String str3) {
        this.price = str;
        this.count = str2;
        this.currency = str3;
    }

    public static /* synthetic */ LowestInfoV2Obj copy$default(LowestInfoV2Obj lowestInfoV2Obj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lowestInfoV2Obj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14909, new Class[]{LowestInfoV2Obj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, LowestInfoV2Obj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LowestInfoV2Obj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = lowestInfoV2Obj.price;
        }
        if ((i10 & 2) != 0) {
            str2 = lowestInfoV2Obj.count;
        }
        if ((i10 & 4) != 0) {
            str3 = lowestInfoV2Obj.currency;
        }
        return lowestInfoV2Obj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.price;
    }

    @e
    public final String component2() {
        return this.count;
    }

    @e
    public final String component3() {
        return this.currency;
    }

    @d
    public final LowestInfoV2Obj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 14908, new Class[]{String.class, String.class, String.class}, LowestInfoV2Obj.class);
        return patchProxyResultProxy.isSupported ? (LowestInfoV2Obj) patchProxyResultProxy.result : new LowestInfoV2Obj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14912, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LowestInfoV2Obj)) {
            return false;
        }
        LowestInfoV2Obj lowestInfoV2Obj = (LowestInfoV2Obj) obj;
        return f0.g(this.price, lowestInfoV2Obj.price) && f0.g(this.count, lowestInfoV2Obj.count) && f0.g(this.currency, lowestInfoV2Obj.currency);
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final String getCurrency() {
        return this.currency;
    }

    @e
    public final String getPrice() {
        return this.price;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14911, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.count;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setCurrency(@e String str) {
        this.currency = str;
    }

    public final void setPrice(@e String str) {
        this.price = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14910, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LowestInfoV2Obj(price=" + this.price + ", count=" + this.count + ", currency=" + this.currency + ')';
    }
}
