package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeBargainDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BargainInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String estimate_price;

    @e
    private String state;

    public BargainInfo(@e String str, @e String str2) {
        this.estimate_price = str;
        this.state = str2;
    }

    public static /* synthetic */ BargainInfo copy$default(BargainInfo bargainInfo, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bargainInfo, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15998, new Class[]{BargainInfo.class, String.class, String.class, Integer.TYPE, Object.class}, BargainInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (BargainInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = bargainInfo.estimate_price;
        }
        if ((i10 & 2) != 0) {
            str2 = bargainInfo.state;
        }
        return bargainInfo.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.estimate_price;
    }

    @e
    public final String component2() {
        return this.state;
    }

    @d
    public final BargainInfo copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15997, new Class[]{String.class, String.class}, BargainInfo.class);
        return patchProxyResultProxy.isSupported ? (BargainInfo) patchProxyResultProxy.result : new BargainInfo(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16001, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BargainInfo)) {
            return false;
        }
        BargainInfo bargainInfo = (BargainInfo) obj;
        return f0.g(this.estimate_price, bargainInfo.estimate_price) && f0.g(this.state, bargainInfo.state);
    }

    @e
    public final String getEstimate_price() {
        return this.estimate_price;
    }

    @e
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16000, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.estimate_price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setEstimate_price(@e String str) {
        this.estimate_price = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15999, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BargainInfo(estimate_price=" + this.estimate_price + ", state=" + this.state + ')';
    }
}
