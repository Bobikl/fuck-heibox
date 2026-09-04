package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: TradeSupplyCheckResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeSupplyCheckResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {"count"}, value = "merge_count")
    private int merge_count;

    public TradeSupplyCheckResult(int i10) {
        this.merge_count = i10;
    }

    public static /* synthetic */ TradeSupplyCheckResult copy$default(TradeSupplyCheckResult tradeSupplyCheckResult, int i10, int i11, Object obj) {
        Object[] objArr = {tradeSupplyCheckResult, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 16208, new Class[]{TradeSupplyCheckResult.class, cls, cls, Object.class}, TradeSupplyCheckResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeSupplyCheckResult) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            i10 = tradeSupplyCheckResult.merge_count;
        }
        return tradeSupplyCheckResult.copy(i10);
    }

    public final int component1() {
        return this.merge_count;
    }

    @d
    public final TradeSupplyCheckResult copy(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 16207, new Class[]{Integer.TYPE}, TradeSupplyCheckResult.class);
        return patchProxyResultProxy.isSupported ? (TradeSupplyCheckResult) patchProxyResultProxy.result : new TradeSupplyCheckResult(i10);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TradeSupplyCheckResult) && this.merge_count == ((TradeSupplyCheckResult) obj).merge_count;
    }

    public final int getMerge_count() {
        return this.merge_count;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16210, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.merge_count;
    }

    public final void setMerge_count(int i10) {
        this.merge_count = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16209, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeSupplyCheckResult(merge_count=" + this.merge_count + ')';
    }
}
