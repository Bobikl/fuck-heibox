package com.bumptech.glide.load.engine;

import androidx.annotation.n0;

/* JADX INFO: compiled from: EngineResource.java */
/* JADX INFO: loaded from: classes6.dex */
public class n<Z> implements s<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s<Z> f41228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f41229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.c f41230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f41232h;

    /* JADX INFO: compiled from: EngineResource.java */
    public interface a {
        void c(com.bumptech.glide.load.c cVar, n<?> nVar);
    }

    n(s<Z> sVar, boolean z10, boolean z11, com.bumptech.glide.load.c cVar, a aVar) {
        this.f41228d = (s) com.bumptech.glide.util.m.e(sVar);
        this.f41226b = z10;
        this.f41227c = z11;
        this.f41230f = cVar;
        this.f41229e = (a) com.bumptech.glide.util.m.e(aVar);
    }

    @Override // com.bumptech.glide.load.engine.s
    public int a() {
        return this.f41228d.a();
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Class<Z> b() {
        return this.f41228d.b();
    }

    synchronized void c() {
        if (this.f41232h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f41231g++;
    }

    s<Z> d() {
        return this.f41228d;
    }

    boolean e() {
        return this.f41226b;
    }

    void f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f41231g;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f41231g = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f41229e.c(this.f41230f, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Z get() {
        return this.f41228d.get();
    }

    @Override // com.bumptech.glide.load.engine.s
    public synchronized void recycle() {
        if (this.f41231g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f41232h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f41232h = true;
        if (this.f41227c) {
            this.f41228d.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f41226b + ", listener=" + this.f41229e + ", key=" + this.f41230f + ", acquired=" + this.f41231g + ", isRecycled=" + this.f41232h + ", resource=" + this.f41228d + '}';
    }
}
