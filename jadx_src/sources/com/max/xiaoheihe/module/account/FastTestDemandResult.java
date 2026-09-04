package com.max.xiaoheihe.module.account;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: FastTestHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class FastTestDemandResult implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f77676c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private List<FastTestDemand> f77677b;

    public FastTestDemandResult(@dl.e List<FastTestDemand> list) {
        this.f77677b = list;
    }

    public static /* synthetic */ FastTestDemandResult c(FastTestDemandResult fastTestDemandResult, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fastTestDemandResult, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 22750, new Class[]{FastTestDemandResult.class, List.class, Integer.TYPE, Object.class}, FastTestDemandResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (FastTestDemandResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = fastTestDemandResult.f77677b;
        }
        return fastTestDemandResult.b(list);
    }

    @dl.e
    public final List<FastTestDemand> a() {
        return this.f77677b;
    }

    @dl.d
    public final FastTestDemandResult b(@dl.e List<FastTestDemand> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 22749, new Class[]{List.class}, FastTestDemandResult.class);
        return patchProxyResultProxy.isSupported ? (FastTestDemandResult) patchProxyResultProxy.result : new FastTestDemandResult(list);
    }

    @dl.e
    public final List<FastTestDemand> d() {
        return this.f77677b;
    }

    public final void e(@dl.e List<FastTestDemand> list) {
        this.f77677b = list;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22753, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FastTestDemandResult) && kotlin.jvm.internal.f0.g(this.f77677b, ((FastTestDemandResult) obj).f77677b);
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22752, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<FastTestDemand> list = this.f77677b;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22751, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FastTestDemandResult(demand_list=" + this.f77677b + ')';
    }
}
