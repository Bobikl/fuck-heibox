package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeItemFlagObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeItemFlagObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String color;

    @e
    private String desc;

    @e
    private String is_special;

    public TradeItemFlagObj(@e String str, @e String str2, @e String str3) {
        this.color = str;
        this.desc = str2;
        this.is_special = str3;
    }

    public static /* synthetic */ TradeItemFlagObj copy$default(TradeItemFlagObj tradeItemFlagObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeItemFlagObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 16096, new Class[]{TradeItemFlagObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TradeItemFlagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeItemFlagObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tradeItemFlagObj.color;
        }
        if ((i10 & 2) != 0) {
            str2 = tradeItemFlagObj.desc;
        }
        if ((i10 & 4) != 0) {
            str3 = tradeItemFlagObj.is_special;
        }
        return tradeItemFlagObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.color;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.is_special;
    }

    @d
    public final TradeItemFlagObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 16095, new Class[]{String.class, String.class, String.class}, TradeItemFlagObj.class);
        return patchProxyResultProxy.isSupported ? (TradeItemFlagObj) patchProxyResultProxy.result : new TradeItemFlagObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16099, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeItemFlagObj)) {
            return false;
        }
        TradeItemFlagObj tradeItemFlagObj = (TradeItemFlagObj) obj;
        return f0.g(this.color, tradeItemFlagObj.color) && f0.g(this.desc, tradeItemFlagObj.desc) && f0.g(this.is_special, tradeItemFlagObj.is_special);
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16098, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.is_special;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @e
    public final String is_special() {
        return this.is_special;
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void set_special(@e String str) {
        this.is_special = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16097, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeItemFlagObj(color=" + this.color + ", desc=" + this.desc + ", is_special=" + this.is_special + ')';
    }
}
