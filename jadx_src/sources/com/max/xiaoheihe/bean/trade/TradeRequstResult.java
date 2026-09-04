package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeRequstResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeRequstResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Integer has_bind_steam;

    @e
    private Integer has_trade_info;

    @e
    private String has_trade_info_desc;

    public TradeRequstResult(@e Integer num, @e String str, @e Integer num2) {
        this.has_trade_info = num;
        this.has_trade_info_desc = str;
        this.has_bind_steam = num2;
    }

    public static /* synthetic */ TradeRequstResult copy$default(TradeRequstResult tradeRequstResult, Integer num, String str, Integer num2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeRequstResult, num, str, num2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16167, new Class[]{TradeRequstResult.class, Integer.class, String.class, Integer.class, Integer.TYPE, Object.class}, TradeRequstResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeRequstResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            num = tradeRequstResult.has_trade_info;
        }
        if ((i10 & 2) != 0) {
            str = tradeRequstResult.has_trade_info_desc;
        }
        if ((i10 & 4) != 0) {
            num2 = tradeRequstResult.has_bind_steam;
        }
        return tradeRequstResult.copy(num, str, num2);
    }

    @e
    public final Integer component1() {
        return this.has_trade_info;
    }

    @e
    public final String component2() {
        return this.has_trade_info_desc;
    }

    @e
    public final Integer component3() {
        return this.has_bind_steam;
    }

    @d
    public final TradeRequstResult copy(@e Integer num, @e String str, @e Integer num2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, str, num2}, this, changeQuickRedirect, false, 16166, new Class[]{Integer.class, String.class, Integer.class}, TradeRequstResult.class);
        return patchProxyResultProxy.isSupported ? (TradeRequstResult) patchProxyResultProxy.result : new TradeRequstResult(num, str, num2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16170, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeRequstResult)) {
            return false;
        }
        TradeRequstResult tradeRequstResult = (TradeRequstResult) obj;
        return f0.g(this.has_trade_info, tradeRequstResult.has_trade_info) && f0.g(this.has_trade_info_desc, tradeRequstResult.has_trade_info_desc) && f0.g(this.has_bind_steam, tradeRequstResult.has_bind_steam);
    }

    @e
    public final Integer getHas_bind_steam() {
        return this.has_bind_steam;
    }

    @e
    public final Integer getHas_trade_info() {
        return this.has_trade_info;
    }

    @e
    public final String getHas_trade_info_desc() {
        return this.has_trade_info_desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16169, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.has_trade_info;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.has_trade_info_desc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.has_bind_steam;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setHas_bind_steam(@e Integer num) {
        this.has_bind_steam = num;
    }

    public final void setHas_trade_info(@e Integer num) {
        this.has_trade_info = num;
    }

    public final void setHas_trade_info_desc(@e String str) {
        this.has_trade_info_desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16168, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeRequstResult(has_trade_info=" + this.has_trade_info + ", has_trade_info_desc=" + this.has_trade_info_desc + ", has_bind_steam=" + this.has_bind_steam + ')';
    }
}
