package com.lzy.okgo.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: Result.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<T> f64808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f64809b;

    private c(b<T> bVar, Throwable th2) {
        this.f64808a = bVar;
        this.f64809b = th2;
    }

    public static <T> c<T> a(Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, bb.c.b.f30883q9, new Class[]{Throwable.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (th2 != null) {
            return new c<>(null, th2);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> c<T> e(b<T> bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, bb.c.b.f30905r9, new Class[]{b.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (bVar != null) {
            return new c<>(bVar, null);
        }
        throw new NullPointerException("response == null");
    }

    public Throwable b() {
        return this.f64809b;
    }

    public boolean c() {
        return this.f64809b != null;
    }

    public b<T> d() {
        return this.f64808a;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30927s9, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f64809b != null) {
            return "Result{isError=true, error=\"" + this.f64809b + "\"}";
        }
        return "Result{isError=false, response=" + this.f64808a + '}';
    }
}
