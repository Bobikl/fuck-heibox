package com.max.hbutils.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SystemWindowInsetExtensions.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f73543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f73545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f73546d;

    public g(int i10, int i11, int i12, int i13) {
        this.f73543a = i10;
        this.f73544b = i11;
        this.f73545c = i12;
        this.f73546d = i13;
    }

    public static /* synthetic */ g f(g gVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        int i18 = i13;
        Object[] objArr = {gVar, new Integer(i15), new Integer(i16), new Integer(i17), new Integer(i18), new Integer(i14), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Zo, new Class[]{g.class, cls, cls, cls, cls, cls, Object.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        if ((i14 & 1) != 0) {
            i15 = gVar.f73543a;
        }
        if ((i14 & 2) != 0) {
            i16 = gVar.f73544b;
        }
        if ((i14 & 4) != 0) {
            i17 = gVar.f73545c;
        }
        if ((i14 & 8) != 0) {
            i18 = gVar.f73546d;
        }
        return gVar.e(i15, i16, i17, i18);
    }

    public final int a() {
        return this.f73543a;
    }

    public final int b() {
        return this.f73544b;
    }

    public final int c() {
        return this.f73545c;
    }

    public final int d() {
        return this.f73546d;
    }

    @dl.d
    public final g e(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Yo, new Class[]{cls, cls, cls, cls}, g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : new g(i10, i11, i12, i13);
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f73543a == gVar.f73543a && this.f73544b == gVar.f73544b && this.f73545c == gVar.f73545c && this.f73546d == gVar.f73546d;
    }

    public final int g() {
        return this.f73546d;
    }

    public final int h() {
        return this.f73543a;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.bp, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((this.f73543a * 31) + this.f73544b) * 31) + this.f73545c) * 31) + this.f73546d;
    }

    public final int i() {
        return this.f73545c;
    }

    public final int j() {
        return this.f73544b;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.ap, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "InitialPadding(left=" + this.f73543a + ", top=" + this.f73544b + ", right=" + this.f73545c + ", bottom=" + this.f73546d + ')';
    }
}
