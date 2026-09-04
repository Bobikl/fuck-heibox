package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProfitWithdrawResult.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfitWithdrawResult {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<ProfitWithdrawInfoObj> history;

    public ProfitWithdrawResult(@e ArrayList<ProfitWithdrawInfoObj> arrayList) {
        this.history = arrayList;
    }

    public static /* synthetic */ ProfitWithdrawResult copy$default(ProfitWithdrawResult profitWithdrawResult, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{profitWithdrawResult, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.f34311n3, new Class[]{ProfitWithdrawResult.class, ArrayList.class, Integer.TYPE, Object.class}, ProfitWithdrawResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProfitWithdrawResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = profitWithdrawResult.history;
        }
        return profitWithdrawResult.copy(arrayList);
    }

    @e
    public final ArrayList<ProfitWithdrawInfoObj> component1() {
        return this.history;
    }

    @d
    public final ProfitWithdrawResult copy(@e ArrayList<ProfitWithdrawInfoObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, c.l.f34288m3, new Class[]{ArrayList.class}, ProfitWithdrawResult.class);
        return patchProxyResultProxy.isSupported ? (ProfitWithdrawResult) patchProxyResultProxy.result : new ProfitWithdrawResult(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.f34380q3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfitWithdrawResult) && f0.g(this.history, ((ProfitWithdrawResult) obj).history);
    }

    @e
    public final ArrayList<ProfitWithdrawInfoObj> getHistory() {
        return this.history;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34357p3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<ProfitWithdrawInfoObj> arrayList = this.history;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setHistory(@e ArrayList<ProfitWithdrawInfoObj> arrayList) {
        this.history = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34334o3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ProfitWithdrawResult(history=" + this.history + ')';
    }
}
