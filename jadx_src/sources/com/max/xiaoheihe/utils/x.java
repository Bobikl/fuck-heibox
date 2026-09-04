package com.max.xiaoheihe.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: websocket.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95786c = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final String f95787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f95788b;

    public x(@dl.e String str, boolean z10) {
        this.f95787a = str;
        this.f95788b = z10;
    }

    public /* synthetic */ x(String str, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }

    public static /* synthetic */ x d(x xVar, String str, boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 48822, new Class[]{x.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, x.class);
        if (patchProxyResultProxy.isSupported) {
            return (x) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = xVar.f95787a;
        }
        if ((i10 & 2) != 0) {
            z10 = xVar.f95788b;
        }
        return xVar.c(str, z10);
    }

    @dl.e
    public final String a() {
        return this.f95787a;
    }

    public final boolean b() {
        return this.f95788b;
    }

    @dl.d
    public final x c(@dl.e String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48821, new Class[]{String.class, Boolean.TYPE}, x.class);
        return patchProxyResultProxy.isSupported ? (x) patchProxyResultProxy.result : new x(str, z10);
    }

    @dl.e
    public final String e() {
        return this.f95787a;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48825, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.f0.g(this.f95787a, xVar.f95787a) && this.f95788b == xVar.f95788b;
    }

    public final boolean f() {
        return this.f95788b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48824, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f95787a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z10 = this.f95788b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48823, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RawData(json=" + this.f95787a + ", isClose=" + this.f95788b + ')';
    }
}
