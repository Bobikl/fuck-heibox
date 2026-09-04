package com.max.xiaoheihe.module.account;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: FastTestHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class FastTestABTestResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77663d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private List<String> f77664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f77665c;

    public FastTestABTestResult(@dl.e List<String> list, @dl.e String str) {
        this.f77664b = list;
        this.f77665c = str;
    }

    public static /* synthetic */ FastTestABTestResult d(FastTestABTestResult fastTestABTestResult, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fastTestABTestResult, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 22738, new Class[]{FastTestABTestResult.class, List.class, String.class, Integer.TYPE, Object.class}, FastTestABTestResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (FastTestABTestResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = fastTestABTestResult.f77664b;
        }
        if ((i10 & 2) != 0) {
            str = fastTestABTestResult.f77665c;
        }
        return fastTestABTestResult.c(list, str);
    }

    @dl.e
    public final List<String> a() {
        return this.f77664b;
    }

    @dl.e
    public final String b() {
        return this.f77665c;
    }

    @dl.d
    public final FastTestABTestResult c(@dl.e List<String> list, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 22737, new Class[]{List.class, String.class}, FastTestABTestResult.class);
        return patchProxyResultProxy.isSupported ? (FastTestABTestResult) patchProxyResultProxy.result : new FastTestABTestResult(list, str);
    }

    @dl.e
    public final String e() {
        return this.f77665c;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22741, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FastTestABTestResult)) {
            return false;
        }
        FastTestABTestResult fastTestABTestResult = (FastTestABTestResult) obj;
        return kotlin.jvm.internal.f0.g(this.f77664b, fastTestABTestResult.f77664b) && kotlin.jvm.internal.f0.g(this.f77665c, fastTestABTestResult.f77665c);
    }

    @dl.e
    public final List<String> f() {
        return this.f77664b;
    }

    public final void g(@dl.e String str) {
        this.f77665c = str;
    }

    public final void h(@dl.e List<String> list) {
        this.f77664b = list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22740, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<String> list = this.f77664b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f77665c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22739, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FastTestABTestResult(groups=" + this.f77664b + ", current_group=" + this.f77665c + ')';
    }
}
