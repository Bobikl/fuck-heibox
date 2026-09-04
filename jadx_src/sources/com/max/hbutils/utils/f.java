package com.max.hbutils.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SystemWindowInsetExtensions.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f73539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f73541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f73542d;

    public f(int i10, int i11, int i12, int i13) {
        this.f73539a = i10;
        this.f73540b = i11;
        this.f73541c = i12;
        this.f73542d = i13;
    }

    public static /* synthetic */ f f(f fVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        int i18 = i13;
        Object[] objArr = {fVar, new Integer(i15), new Integer(i16), new Integer(i17), new Integer(i18), new Integer(i14), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Vo, new Class[]{f.class, cls, cls, cls, cls, cls, Object.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        if ((i14 & 1) != 0) {
            i15 = fVar.f73539a;
        }
        if ((i14 & 2) != 0) {
            i16 = fVar.f73540b;
        }
        if ((i14 & 4) != 0) {
            i17 = fVar.f73541c;
        }
        if ((i14 & 8) != 0) {
            i18 = fVar.f73542d;
        }
        return fVar.e(i15, i16, i17, i18);
    }

    public final int a() {
        return this.f73539a;
    }

    public final int b() {
        return this.f73540b;
    }

    public final int c() {
        return this.f73541c;
    }

    public final int d() {
        return this.f73542d;
    }

    @dl.d
    public final f e(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Uo, new Class[]{cls, cls, cls, cls}, f.class);
        return patchProxyResultProxy.isSupported ? (f) patchProxyResultProxy.result : new f(i10, i11, i12, i13);
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f73539a == fVar.f73539a && this.f73540b == fVar.f73540b && this.f73541c == fVar.f73541c && this.f73542d == fVar.f73542d;
    }

    public final int g() {
        return this.f73542d;
    }

    public final int h() {
        return this.f73539a;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Xo, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((this.f73539a * 31) + this.f73540b) * 31) + this.f73541c) * 31) + this.f73542d;
    }

    public final int i() {
        return this.f73541c;
    }

    public final int j() {
        return this.f73540b;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Wo, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "InitialMargin(left=" + this.f73539a + ", top=" + this.f73540b + ", right=" + this.f73541c + ", bottom=" + this.f73542d + ')';
    }
}
