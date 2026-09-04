package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradePurchaseResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradePurchaseResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<TradePurchaseInfoObj> list;

    public TradePurchaseResult(@e ArrayList<TradePurchaseInfoObj> arrayList) {
        this.list = arrayList;
    }

    public static /* synthetic */ TradePurchaseResult copy$default(TradePurchaseResult tradePurchaseResult, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradePurchaseResult, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 16154, new Class[]{TradePurchaseResult.class, ArrayList.class, Integer.TYPE, Object.class}, TradePurchaseResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradePurchaseResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = tradePurchaseResult.list;
        }
        return tradePurchaseResult.copy(arrayList);
    }

    @e
    public final ArrayList<TradePurchaseInfoObj> component1() {
        return this.list;
    }

    @d
    public final TradePurchaseResult copy(@e ArrayList<TradePurchaseInfoObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 16153, new Class[]{ArrayList.class}, TradePurchaseResult.class);
        return patchProxyResultProxy.isSupported ? (TradePurchaseResult) patchProxyResultProxy.result : new TradePurchaseResult(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16157, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof TradePurchaseResult) && f0.g(this.list, ((TradePurchaseResult) obj).list);
    }

    @e
    public final ArrayList<TradePurchaseInfoObj> getList() {
        return this.list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16156, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<TradePurchaseInfoObj> arrayList = this.list;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setList(@e ArrayList<TradePurchaseInfoObj> arrayList) {
        this.list = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16155, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradePurchaseResult(list=" + this.list + ')';
    }
}
