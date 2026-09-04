package com.max.xiaoheihe.accelworld;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: AccelWorldMMKV.kt */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f76784c = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f76785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f76786b;

    public u(boolean z10, long j10) {
        this.f76785a = z10;
        this.f76786b = j10;
    }

    public static /* synthetic */ u d(u uVar, boolean z10, long j10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Long(j10), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.ND, new Class[]{u.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Object.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z10 = uVar.f76785a;
        }
        if ((i10 & 2) != 0) {
            j10 = uVar.f76786b;
        }
        return uVar.c(z10, j10);
    }

    public final boolean a() {
        return this.f76785a;
    }

    public final long b() {
        return this.f76786b;
    }

    @dl.d
    public final u c(boolean z10, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Long(j10)}, this, changeQuickRedirect, false, bb.c.m.MD, new Class[]{Boolean.TYPE, Long.TYPE}, u.class);
        return patchProxyResultProxy.isSupported ? (u) patchProxyResultProxy.result : new u(z10, j10);
    }

    public final long e() {
        return this.f76786b;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f76785a == uVar.f76785a && this.f76786b == uVar.f76786b;
    }

    public final boolean f() {
        return this.f76785a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.PD, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.f76785a;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        return (r10 * 31) + androidx.collection.k.a(this.f76786b);
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.OD, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ExpirableBooleanValue(value=" + this.f76785a + ", expirationTime=" + this.f76786b + ')';
    }
}
