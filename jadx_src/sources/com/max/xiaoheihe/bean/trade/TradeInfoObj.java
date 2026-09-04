package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private Integer state;

    public TradeInfoObj(@e Integer num, @e String str) {
        this.state = num;
        this.desc = str;
    }

    public static /* synthetic */ TradeInfoObj copy$default(TradeInfoObj tradeInfoObj, Integer num, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeInfoObj, num, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 16086, new Class[]{TradeInfoObj.class, Integer.class, String.class, Integer.TYPE, Object.class}, TradeInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            num = tradeInfoObj.state;
        }
        if ((i10 & 2) != 0) {
            str = tradeInfoObj.desc;
        }
        return tradeInfoObj.copy(num, str);
    }

    @e
    public final Integer component1() {
        return this.state;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @d
    public final TradeInfoObj copy(@e Integer num, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, str}, this, changeQuickRedirect, false, 16085, new Class[]{Integer.class, String.class}, TradeInfoObj.class);
        return patchProxyResultProxy.isSupported ? (TradeInfoObj) patchProxyResultProxy.result : new TradeInfoObj(num, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16089, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeInfoObj)) {
            return false;
        }
        TradeInfoObj tradeInfoObj = (TradeInfoObj) obj;
        return f0.g(this.state, tradeInfoObj.state) && f0.g(this.desc, tradeInfoObj.desc);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final Integer getState() {
        return this.state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16088, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.state;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.desc;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setState(@e Integer num) {
        this.state = num;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16087, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeInfoObj(state=" + this.state + ", desc=" + this.desc + ')';
    }
}
