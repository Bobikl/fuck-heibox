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

/* JADX INFO: compiled from: TradeAssistantResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeAssistantResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<TradeOfferObj> list;

    @e
    private String message;

    @e
    private String steam_id;

    public TradeAssistantResult(@e String str, @e List<TradeOfferObj> list, @e String str2) {
        this.message = str;
        this.list = list;
        this.steam_id = str2;
    }

    public static /* synthetic */ TradeAssistantResult copy$default(TradeAssistantResult tradeAssistantResult, String str, List list, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeAssistantResult, str, list, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16034, new Class[]{TradeAssistantResult.class, String.class, List.class, String.class, Integer.TYPE, Object.class}, TradeAssistantResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeAssistantResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tradeAssistantResult.message;
        }
        if ((i10 & 2) != 0) {
            list = tradeAssistantResult.list;
        }
        if ((i10 & 4) != 0) {
            str2 = tradeAssistantResult.steam_id;
        }
        return tradeAssistantResult.copy(str, list, str2);
    }

    @e
    public final String component1() {
        return this.message;
    }

    @e
    public final List<TradeOfferObj> component2() {
        return this.list;
    }

    @e
    public final String component3() {
        return this.steam_id;
    }

    @d
    public final TradeAssistantResult copy(@e String str, @e List<TradeOfferObj> list, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, str2}, this, changeQuickRedirect, false, 16033, new Class[]{String.class, List.class, String.class}, TradeAssistantResult.class);
        return patchProxyResultProxy.isSupported ? (TradeAssistantResult) patchProxyResultProxy.result : new TradeAssistantResult(str, list, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16037, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeAssistantResult)) {
            return false;
        }
        TradeAssistantResult tradeAssistantResult = (TradeAssistantResult) obj;
        return f0.g(this.message, tradeAssistantResult.message) && f0.g(this.list, tradeAssistantResult.list) && f0.g(this.steam_id, tradeAssistantResult.steam_id);
    }

    @e
    public final List<TradeOfferObj> getList() {
        return this.list;
    }

    @e
    public final String getMessage() {
        return this.message;
    }

    @e
    public final String getSteam_id() {
        return this.steam_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16036, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<TradeOfferObj> list = this.list;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.steam_id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setList(@e List<TradeOfferObj> list) {
        this.list = list;
    }

    public final void setMessage(@e String str) {
        this.message = str;
    }

    public final void setSteam_id(@e String str) {
        this.steam_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16035, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeAssistantResult(message=" + this.message + ", list=" + this.list + ", steam_id=" + this.steam_id + ')';
    }
}
