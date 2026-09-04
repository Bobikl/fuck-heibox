package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeWechatDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeWechatDataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String account_id;

    @e
    private String code;

    public TradeWechatDataObj(@e String str, @e String str2) {
        this.account_id = str;
        this.code = str2;
    }

    public static /* synthetic */ TradeWechatDataObj copy$default(TradeWechatDataObj tradeWechatDataObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeWechatDataObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16217, new Class[]{TradeWechatDataObj.class, String.class, String.class, Integer.TYPE, Object.class}, TradeWechatDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeWechatDataObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tradeWechatDataObj.account_id;
        }
        if ((i10 & 2) != 0) {
            str2 = tradeWechatDataObj.code;
        }
        return tradeWechatDataObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.account_id;
    }

    @e
    public final String component2() {
        return this.code;
    }

    @d
    public final TradeWechatDataObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 16216, new Class[]{String.class, String.class}, TradeWechatDataObj.class);
        return patchProxyResultProxy.isSupported ? (TradeWechatDataObj) patchProxyResultProxy.result : new TradeWechatDataObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16220, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeWechatDataObj)) {
            return false;
        }
        TradeWechatDataObj tradeWechatDataObj = (TradeWechatDataObj) obj;
        return f0.g(this.account_id, tradeWechatDataObj.account_id) && f0.g(this.code, tradeWechatDataObj.code);
    }

    @e
    public final String getAccount_id() {
        return this.account_id;
    }

    @e
    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16219, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.account_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAccount_id(@e String str) {
        this.account_id = str;
    }

    public final void setCode(@e String str) {
        this.code = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16218, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeWechatDataObj(account_id=" + this.account_id + ", code=" + this.code + ')';
    }
}
