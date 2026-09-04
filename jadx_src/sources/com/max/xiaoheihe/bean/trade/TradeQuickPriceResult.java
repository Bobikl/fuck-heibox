package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeQuickPriceResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeQuickPriceResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String fee_rate;

    @e
    private String min_price_rate;

    @d
    private Map<String, TradeItemDescTagObj> sku_tags;

    @d
    private Map<String, List<String>> spu_items;

    @d
    private Map<String, ItemQuickPriceObj> spus;

    public TradeQuickPriceResult(@e String str, @e String str2, @d Map<String, List<String>> spu_items, @d Map<String, ItemQuickPriceObj> spus, @d Map<String, TradeItemDescTagObj> sku_tags) {
        f0.p(spu_items, "spu_items");
        f0.p(spus, "spus");
        f0.p(sku_tags, "sku_tags");
        this.fee_rate = str;
        this.min_price_rate = str2;
        this.spu_items = spu_items;
        this.spus = spus;
        this.sku_tags = sku_tags;
    }

    public static /* synthetic */ TradeQuickPriceResult copy$default(TradeQuickPriceResult tradeQuickPriceResult, String str, String str2, Map map, Map map2, Map map3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeQuickPriceResult, str, str2, map, map2, map3, new Integer(i10), obj}, null, changeQuickRedirect, true, 16162, new Class[]{TradeQuickPriceResult.class, String.class, String.class, Map.class, Map.class, Map.class, Integer.TYPE, Object.class}, TradeQuickPriceResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeQuickPriceResult) patchProxyResultProxy.result;
        }
        return tradeQuickPriceResult.copy((i10 & 1) != 0 ? tradeQuickPriceResult.fee_rate : str, (i10 & 2) != 0 ? tradeQuickPriceResult.min_price_rate : str2, (i10 & 4) != 0 ? tradeQuickPriceResult.spu_items : map, (i10 & 8) != 0 ? tradeQuickPriceResult.spus : map2, (i10 & 16) != 0 ? tradeQuickPriceResult.sku_tags : map3);
    }

    @e
    public final String component1() {
        return this.fee_rate;
    }

    @e
    public final String component2() {
        return this.min_price_rate;
    }

    @d
    public final Map<String, List<String>> component3() {
        return this.spu_items;
    }

    @d
    public final Map<String, ItemQuickPriceObj> component4() {
        return this.spus;
    }

    @d
    public final Map<String, TradeItemDescTagObj> component5() {
        return this.sku_tags;
    }

    @d
    public final TradeQuickPriceResult copy(@e String str, @e String str2, @d Map<String, List<String>> spu_items, @d Map<String, ItemQuickPriceObj> spus, @d Map<String, TradeItemDescTagObj> sku_tags) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, spu_items, spus, sku_tags}, this, changeQuickRedirect, false, 16161, new Class[]{String.class, String.class, Map.class, Map.class, Map.class}, TradeQuickPriceResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeQuickPriceResult) patchProxyResultProxy.result;
        }
        f0.p(spu_items, "spu_items");
        f0.p(spus, "spus");
        f0.p(sku_tags, "sku_tags");
        return new TradeQuickPriceResult(str, str2, spu_items, spus, sku_tags);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16165, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeQuickPriceResult)) {
            return false;
        }
        TradeQuickPriceResult tradeQuickPriceResult = (TradeQuickPriceResult) obj;
        return f0.g(this.fee_rate, tradeQuickPriceResult.fee_rate) && f0.g(this.min_price_rate, tradeQuickPriceResult.min_price_rate) && f0.g(this.spu_items, tradeQuickPriceResult.spu_items) && f0.g(this.spus, tradeQuickPriceResult.spus) && f0.g(this.sku_tags, tradeQuickPriceResult.sku_tags);
    }

    @e
    public final String getFee_rate() {
        return this.fee_rate;
    }

    @e
    public final String getMin_price_rate() {
        return this.min_price_rate;
    }

    @d
    public final Map<String, TradeItemDescTagObj> getSku_tags() {
        return this.sku_tags;
    }

    @d
    public final Map<String, List<String>> getSpu_items() {
        return this.spu_items;
    }

    @d
    public final Map<String, ItemQuickPriceObj> getSpus() {
        return this.spus;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16164, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.fee_rate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.min_price_rate;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.spu_items.hashCode()) * 31) + this.spus.hashCode()) * 31) + this.sku_tags.hashCode();
    }

    public final void setFee_rate(@e String str) {
        this.fee_rate = str;
    }

    public final void setMin_price_rate(@e String str) {
        this.min_price_rate = str;
    }

    public final void setSku_tags(@d Map<String, TradeItemDescTagObj> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 16160, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.sku_tags = map;
    }

    public final void setSpu_items(@d Map<String, List<String>> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 16158, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.spu_items = map;
    }

    public final void setSpus(@d Map<String, ItemQuickPriceObj> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 16159, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.spus = map;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16163, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeQuickPriceResult(fee_rate=" + this.fee_rate + ", min_price_rate=" + this.min_price_rate + ", spu_items=" + this.spu_items + ", spus=" + this.spus + ", sku_tags=" + this.sku_tags + ')';
    }
}
