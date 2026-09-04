package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeOfferDetailResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeOfferDetailResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private List<TradeSteamInventoryObj> list;

    @e
    private String time_left;

    @e
    private String trade_url;

    public TradeOfferDetailResult(@e String str, @e String str2, @e String str3, @e List<TradeSteamInventoryObj> list) {
        this.time_left = str;
        this.desc = str2;
        this.trade_url = str3;
        this.list = list;
    }

    public static /* synthetic */ TradeOfferDetailResult copy$default(TradeOfferDetailResult tradeOfferDetailResult, String str, String str2, String str3, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeOfferDetailResult, str, str2, str3, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 16111, new Class[]{TradeOfferDetailResult.class, String.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, TradeOfferDetailResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeOfferDetailResult) patchProxyResultProxy.result;
        }
        return tradeOfferDetailResult.copy((i10 & 1) != 0 ? tradeOfferDetailResult.time_left : str, (i10 & 2) != 0 ? tradeOfferDetailResult.desc : str2, (i10 & 4) != 0 ? tradeOfferDetailResult.trade_url : str3, (i10 & 8) != 0 ? tradeOfferDetailResult.list : list);
    }

    @e
    public final String component1() {
        return this.time_left;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.trade_url;
    }

    @e
    public final List<TradeSteamInventoryObj> component4() {
        return this.list;
    }

    @d
    public final TradeOfferDetailResult copy(@e String str, @e String str2, @e String str3, @e List<TradeSteamInventoryObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, list}, this, changeQuickRedirect, false, 16110, new Class[]{String.class, String.class, String.class, List.class}, TradeOfferDetailResult.class);
        return patchProxyResultProxy.isSupported ? (TradeOfferDetailResult) patchProxyResultProxy.result : new TradeOfferDetailResult(str, str2, str3, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16114, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeOfferDetailResult)) {
            return false;
        }
        TradeOfferDetailResult tradeOfferDetailResult = (TradeOfferDetailResult) obj;
        return f0.g(this.time_left, tradeOfferDetailResult.time_left) && f0.g(this.desc, tradeOfferDetailResult.desc) && f0.g(this.trade_url, tradeOfferDetailResult.trade_url) && f0.g(this.list, tradeOfferDetailResult.list);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final List<TradeSteamInventoryObj> getList() {
        return this.list;
    }

    @e
    public final String getTime_left() {
        return this.time_left;
    }

    @e
    public final String getTrade_url() {
        return this.trade_url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16113, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.time_left;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trade_url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<TradeSteamInventoryObj> list = this.list;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setList(@e List<TradeSteamInventoryObj> list) {
        this.list = list;
    }

    public final void setTime_left(@e String str) {
        this.time_left = str;
    }

    public final void setTrade_url(@e String str) {
        this.trade_url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16112, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeOfferDetailResult(time_left=" + this.time_left + ", desc=" + this.desc + ", trade_url=" + this.trade_url + ", list=" + this.list + ')';
    }
}
