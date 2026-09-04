package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeBatchBuyResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeBatchBuyResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String aborted_count;

    @d
    private String buy_count;

    public TradeBatchBuyResult(@d String buy_count, @d String aborted_count) {
        f0.p(buy_count, "buy_count");
        f0.p(aborted_count, "aborted_count");
        this.buy_count = buy_count;
        this.aborted_count = aborted_count;
    }

    public static /* synthetic */ TradeBatchBuyResult copy$default(TradeBatchBuyResult tradeBatchBuyResult, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeBatchBuyResult, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16058, new Class[]{TradeBatchBuyResult.class, String.class, String.class, Integer.TYPE, Object.class}, TradeBatchBuyResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeBatchBuyResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tradeBatchBuyResult.buy_count;
        }
        if ((i10 & 2) != 0) {
            str2 = tradeBatchBuyResult.aborted_count;
        }
        return tradeBatchBuyResult.copy(str, str2);
    }

    @d
    public final String component1() {
        return this.buy_count;
    }

    @d
    public final String component2() {
        return this.aborted_count;
    }

    @d
    public final TradeBatchBuyResult copy(@d String buy_count, @d String aborted_count) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{buy_count, aborted_count}, this, changeQuickRedirect, false, 16057, new Class[]{String.class, String.class}, TradeBatchBuyResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeBatchBuyResult) patchProxyResultProxy.result;
        }
        f0.p(buy_count, "buy_count");
        f0.p(aborted_count, "aborted_count");
        return new TradeBatchBuyResult(buy_count, aborted_count);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16061, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeBatchBuyResult)) {
            return false;
        }
        TradeBatchBuyResult tradeBatchBuyResult = (TradeBatchBuyResult) obj;
        return f0.g(this.buy_count, tradeBatchBuyResult.buy_count) && f0.g(this.aborted_count, tradeBatchBuyResult.aborted_count);
    }

    @d
    public final String getAborted_count() {
        return this.aborted_count;
    }

    @d
    public final String getBuy_count() {
        return this.buy_count;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16060, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.buy_count.hashCode() * 31) + this.aborted_count.hashCode();
    }

    public final void setAborted_count(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16056, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.aborted_count = str;
    }

    public final void setBuy_count(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16055, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.buy_count = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16059, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeBatchBuyResult(buy_count=" + this.buy_count + ", aborted_count=" + this.aborted_count + ')';
    }
}
