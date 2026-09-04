package com.max.accelworld;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: AccelWorldABTest.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f64936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final j f64937b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final j f64938c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f64939d;

    public i(boolean z10) {
        this.f64936a = z10;
    }

    public final void a(@dl.d l<? super j, b2> foo) {
        if (PatchProxy.proxy(new Object[]{foo}, this, changeQuickRedirect, false, bb.c.b.Of, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(foo, "foo");
        if (this.f64936a) {
            return;
        }
        foo.invoke(this.f64938c);
    }

    public final void b(@dl.d yh.a<b2> finallyFunc) {
        if (PatchProxy.proxy(new Object[]{finallyFunc}, this, changeQuickRedirect, false, bb.c.b.Pf, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(finallyFunc, "finallyFunc");
        this.f64939d = finallyFunc;
    }

    public final void c(@dl.d l<? super j, b2> foo) {
        if (PatchProxy.proxy(new Object[]{foo}, this, changeQuickRedirect, false, bb.c.b.Nf, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(foo, "foo");
        if (this.f64936a) {
            foo.invoke(this.f64937b);
        }
    }

    @dl.d
    public final j d() {
        return this.f64937b;
    }

    @dl.d
    public final j e() {
        return this.f64938c;
    }

    @dl.e
    public final yh.a<b2> f() {
        return this.f64939d;
    }
}
