package com.max.xiaoheihe.module.bbs.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: GalleryPagingAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80637c = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f80638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f80639b;

    public u(int i10, int i11) {
        this.f80638a = i10;
        this.f80639b = i11;
    }

    public static /* synthetic */ u d(u uVar, int i10, int i11, int i12, Object obj) {
        Object[] objArr = {uVar, new Integer(i10), new Integer(i11), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 27467, new Class[]{u.class, cls, cls, cls, Object.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        if ((i12 & 1) != 0) {
            i10 = uVar.f80638a;
        }
        if ((i12 & 2) != 0) {
            i11 = uVar.f80639b;
        }
        return uVar.c(i10, i11);
    }

    public final int a() {
        return this.f80638a;
    }

    public final int b() {
        return this.f80639b;
    }

    @dl.d
    public final u c(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27466, new Class[]{cls, cls}, u.class);
        return patchProxyResultProxy.isSupported ? (u) patchProxyResultProxy.result : new u(i10, i11);
    }

    public final int e() {
        return this.f80638a;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f80638a == uVar.f80638a && this.f80639b == uVar.f80639b;
    }

    public final int f() {
        return this.f80639b;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27469, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.f80638a * 31) + this.f80639b;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27468, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SelectResult(resultCode=" + this.f80638a + ", selectNum=" + this.f80639b + ')';
    }
}
