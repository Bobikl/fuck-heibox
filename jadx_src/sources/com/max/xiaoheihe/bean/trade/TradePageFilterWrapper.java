package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradePageFilterWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradePageFilterWrapper implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private Map<String, List<TradeFilterItemObj>> filterMap;

    @e
    private String maxPrice;

    @e
    private String minPrice;

    public TradePageFilterWrapper() {
        this(null, null, null, 7, null);
    }

    public TradePageFilterWrapper(@d Map<String, List<TradeFilterItemObj>> filterMap, @e String str, @e String str2) {
        f0.p(filterMap, "filterMap");
        this.filterMap = filterMap;
        this.minPrice = str;
        this.maxPrice = str2;
    }

    public /* synthetic */ TradePageFilterWrapper(Map map, String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ TradePageFilterWrapper copy$default(TradePageFilterWrapper tradePageFilterWrapper, Map map, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradePageFilterWrapper, map, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16128, new Class[]{TradePageFilterWrapper.class, Map.class, String.class, String.class, Integer.TYPE, Object.class}, TradePageFilterWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradePageFilterWrapper) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            map = tradePageFilterWrapper.filterMap;
        }
        if ((i10 & 2) != 0) {
            str = tradePageFilterWrapper.minPrice;
        }
        if ((i10 & 4) != 0) {
            str2 = tradePageFilterWrapper.maxPrice;
        }
        return tradePageFilterWrapper.copy(map, str, str2);
    }

    @d
    public final Map<String, List<TradeFilterItemObj>> component1() {
        return this.filterMap;
    }

    @e
    public final String component2() {
        return this.minPrice;
    }

    @e
    public final String component3() {
        return this.maxPrice;
    }

    @d
    public final TradePageFilterWrapper copy(@d Map<String, List<TradeFilterItemObj>> filterMap, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filterMap, str, str2}, this, changeQuickRedirect, false, 16127, new Class[]{Map.class, String.class, String.class}, TradePageFilterWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradePageFilterWrapper) patchProxyResultProxy.result;
        }
        f0.p(filterMap, "filterMap");
        return new TradePageFilterWrapper(filterMap, str, str2);
    }

    @d
    public final TradePageFilterWrapper deepCopyByJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16126, new Class[0], TradePageFilterWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradePageFilterWrapper) patchProxyResultProxy.result;
        }
        Object objA = k.a(k.p(this), TradePageFilterWrapper.class);
        f0.o(objA, "deserialize(json, TradeP…ilterWrapper::class.java)");
        return (TradePageFilterWrapper) objA;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16131, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradePageFilterWrapper)) {
            return false;
        }
        TradePageFilterWrapper tradePageFilterWrapper = (TradePageFilterWrapper) obj;
        return f0.g(this.filterMap, tradePageFilterWrapper.filterMap) && f0.g(this.minPrice, tradePageFilterWrapper.minPrice) && f0.g(this.maxPrice, tradePageFilterWrapper.maxPrice);
    }

    @d
    public final Map<String, List<TradeFilterItemObj>> getFilterMap() {
        return this.filterMap;
    }

    @e
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    @e
    public final String getMinPrice() {
        return this.minPrice;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16130, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.filterMap.hashCode() * 31;
        String str = this.minPrice;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxPrice;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setFilterMap(@d Map<String, List<TradeFilterItemObj>> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 16125, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.filterMap = map;
    }

    public final void setMaxPrice(@e String str) {
        this.maxPrice = str;
    }

    public final void setMinPrice(@e String str) {
        this.minPrice = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16129, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradePageFilterWrapper(filterMap=" + this.filterMap + ", minPrice=" + this.minPrice + ", maxPrice=" + this.maxPrice + ')';
    }
}
