package com.lzy.okgo.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.s;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f64803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Throwable f64804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f64805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f64806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c0 f64807e;

    public static <T> b<T> c(boolean z10, e eVar, c0 c0Var, Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), eVar, c0Var, th2}, null, changeQuickRedirect, true, bb.c.b.f30791m9, new Class[]{Boolean.TYPE, e.class, c0.class, Throwable.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        b<T> bVar = new b<>();
        bVar.m(z10);
        bVar.n(eVar);
        bVar.o(c0Var);
        bVar.l(th2);
        return bVar;
    }

    public static <T> b<T> p(boolean z10, T t10, e eVar, c0 c0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), t10, eVar, c0Var}, null, changeQuickRedirect, true, bb.c.b.f30768l9, new Class[]{Boolean.TYPE, Object.class, e.class, c0.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        b<T> bVar = new b<>();
        bVar.m(z10);
        bVar.k(t10);
        bVar.n(eVar);
        bVar.o(c0Var);
        return bVar;
    }

    public T a() {
        return this.f64803a;
    }

    public int b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30814n9, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        c0 c0Var = this.f64807e;
        if (c0Var == null) {
            return -1;
        }
        return c0Var.x();
    }

    public Throwable d() {
        return this.f64804b;
    }

    public e e() {
        return this.f64806d;
    }

    public c0 f() {
        return this.f64807e;
    }

    public s g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30860p9, new Class[0], s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        c0 c0Var = this.f64807e;
        if (c0Var == null) {
            return null;
        }
        return c0Var.getHeaders();
    }

    public boolean h() {
        return this.f64805c;
    }

    public boolean i() {
        return this.f64804b == null;
    }

    public String j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30837o9, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        c0 c0Var = this.f64807e;
        if (c0Var == null) {
            return null;
        }
        return c0Var.getMessage();
    }

    public void k(T t10) {
        this.f64803a = t10;
    }

    public void l(Throwable th2) {
        this.f64804b = th2;
    }

    public void m(boolean z10) {
        this.f64805c = z10;
    }

    public void n(e eVar) {
        this.f64806d = eVar;
    }

    public void o(c0 c0Var) {
        this.f64807e = c0Var;
    }
}
