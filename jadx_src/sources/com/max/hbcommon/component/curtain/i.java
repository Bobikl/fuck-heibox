package com.max.hbcommon.component.curtain;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Padding.java */
/* JADX INFO: loaded from: classes9.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f67563b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f67564c = 2;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f67565d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f67566e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f67567f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<Integer> f67568a;

    /* JADX INFO: compiled from: Padding.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    i() {
        this.f67568a = new SparseArray<>(4);
    }

    i(int i10) {
        SparseArray<Integer> sparseArray = new SparseArray<>(1);
        this.f67568a = sparseArray;
        sparseArray.append(1, Integer.valueOf(i10));
    }

    public static i a(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.pp, new Class[]{Integer.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : new i(i10);
    }

    public static i e(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.qp, new Class[]{Integer.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : h(i10, 0, 0, 0);
    }

    public static i f(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.rp, new Class[]{cls, cls}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : h(i10, i11, 0, 0);
    }

    public static i g(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.sp, new Class[]{cls, cls, cls}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : h(i10, i11, i12, 0);
    }

    public static i h(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.tp, new Class[]{cls, cls, cls, cls}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : new i().b(2, i10).b(4, i11).b(6, i12).b(8, i13);
    }

    i b(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.up, new Class[]{cls, cls}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        this.f67568a.append(i10, Integer.valueOf(i11));
        return this;
    }

    int c(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.vp, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f67568a.get(i10, 0).intValue();
    }

    boolean d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.wp, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f67568a.size() == 1;
    }
}
