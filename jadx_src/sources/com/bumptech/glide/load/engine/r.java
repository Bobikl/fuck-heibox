package com.bumptech.glide.load.engine;

import androidx.annotation.n0;

/* JADX INFO: compiled from: LockedResource.java */
/* JADX INFO: loaded from: classes6.dex */
public final class r<Z> implements s<Z>, com.bumptech.glide.util.pool.a.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final androidx.core.util.n.a<r<?>> f41270f = com.bumptech.glide.util.pool.a.e(20, new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f41271b = com.bumptech.glide.util.pool.c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s<Z> f41272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41274e;

    /* JADX INFO: compiled from: LockedResource.java */
    public class a implements com.bumptech.glide.util.pool.a.d<r<?>> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r<?> a() {
            return new r<>();
        }
    }

    r() {
    }

    private void c(s<Z> sVar) {
        this.f41274e = false;
        this.f41273d = true;
        this.f41272c = sVar;
    }

    @n0
    static <Z> r<Z> d(s<Z> sVar) {
        r<Z> rVar = (r) com.bumptech.glide.util.m.e(f41270f.a());
        rVar.c(sVar);
        return rVar;
    }

    private void f() {
        this.f41272c = null;
        f41270f.b(this);
    }

    @Override // com.bumptech.glide.load.engine.s
    public int a() {
        return this.f41272c.a();
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Class<Z> b() {
        return this.f41272c.b();
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @n0
    public com.bumptech.glide.util.pool.c e() {
        return this.f41271b;
    }

    synchronized void g() {
        this.f41271b.c();
        if (!this.f41273d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f41273d = false;
        if (this.f41274e) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Z get() {
        return this.f41272c.get();
    }

    @Override // com.bumptech.glide.load.engine.s
    public synchronized void recycle() {
        this.f41271b.c();
        this.f41274e = true;
        if (!this.f41273d) {
            this.f41272c.recycle();
            f();
        }
    }
}
