package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeOfferStateObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeOfferStateObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String buyer_create_time;

    @e
    private String state;

    @e
    private String state_desc;

    @e
    private String toast_msg;

    public TradeOfferStateObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.state_desc = str;
        this.state = str2;
        this.buyer_create_time = str3;
        this.toast_msg = str4;
    }

    public static /* synthetic */ TradeOfferStateObj copy$default(TradeOfferStateObj tradeOfferStateObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeOfferStateObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 16121, new Class[]{TradeOfferStateObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TradeOfferStateObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeOfferStateObj) patchProxyResultProxy.result;
        }
        return tradeOfferStateObj.copy((i10 & 1) != 0 ? tradeOfferStateObj.state_desc : str, (i10 & 2) != 0 ? tradeOfferStateObj.state : str2, (i10 & 4) != 0 ? tradeOfferStateObj.buyer_create_time : str3, (i10 & 8) != 0 ? tradeOfferStateObj.toast_msg : str4);
    }

    @e
    public final String component1() {
        return this.state_desc;
    }

    @e
    public final String component2() {
        return this.state;
    }

    @e
    public final String component3() {
        return this.buyer_create_time;
    }

    @e
    public final String component4() {
        return this.toast_msg;
    }

    @d
    public final TradeOfferStateObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 16120, new Class[]{String.class, String.class, String.class, String.class}, TradeOfferStateObj.class);
        return patchProxyResultProxy.isSupported ? (TradeOfferStateObj) patchProxyResultProxy.result : new TradeOfferStateObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16124, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeOfferStateObj)) {
            return false;
        }
        TradeOfferStateObj tradeOfferStateObj = (TradeOfferStateObj) obj;
        return f0.g(this.state_desc, tradeOfferStateObj.state_desc) && f0.g(this.state, tradeOfferStateObj.state) && f0.g(this.buyer_create_time, tradeOfferStateObj.buyer_create_time) && f0.g(this.toast_msg, tradeOfferStateObj.toast_msg);
    }

    @e
    public final String getBuyer_create_time() {
        return this.buyer_create_time;
    }

    @e
    public final String getState() {
        return this.state;
    }

    @e
    public final String getState_desc() {
        return this.state_desc;
    }

    @e
    public final String getToast_msg() {
        return this.toast_msg;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16123, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.state_desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buyer_create_time;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toast_msg;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBuyer_create_time(@e String str) {
        this.buyer_create_time = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void setState_desc(@e String str) {
        this.state_desc = str;
    }

    public final void setToast_msg(@e String str) {
        this.toast_msg = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16122, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeOfferStateObj(state_desc=" + this.state_desc + ", state=" + this.state + ", buyer_create_time=" + this.buyer_create_time + ", toast_msg=" + this.toast_msg + ')';
    }
}
