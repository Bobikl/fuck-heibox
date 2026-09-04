package com.bumptech.glide.load.model;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Queue;

/* JADX INFO: compiled from: ModelCache.java */
/* JADX INFO: loaded from: classes6.dex */
public class n<A, B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f41371b = 250;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.j<b<A>, B> f41372a;

    /* JADX INFO: compiled from: ModelCache.java */
    public class a extends com.bumptech.glide.util.j<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.util.j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(@n0 b<A> bVar, @p0 B b10) {
            bVar.c();
        }
    }

    /* JADX INFO: compiled from: ModelCache.java */
    @j1
    public static final class b<A> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f41374d = com.bumptech.glide.util.o.g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f41376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private A f41377c;

        private b() {
        }

        static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f41374d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a10, i10, i11);
            return bVar;
        }

        private void b(A a10, int i10, int i11) {
            this.f41377c = a10;
            this.f41376b = i10;
            this.f41375a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f41374d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f41376b == bVar.f41376b && this.f41375a == bVar.f41375a && this.f41377c.equals(bVar.f41377c);
        }

        public int hashCode() {
            return (((this.f41375a * 31) + this.f41376b) * 31) + this.f41377c.hashCode();
        }
    }

    public n() {
        this(250L);
    }

    public n(long j10) {
        this.f41372a = new a(j10);
    }

    public void a() {
        this.f41372a.b();
    }

    @p0
    public B b(A a10, int i10, int i11) {
        b<A> bVarA = b.a(a10, i10, i11);
        B bJ = this.f41372a.j(bVarA);
        bVarA.c();
        return bJ;
    }

    public void c(A a10, int i10, int i11, B b10) {
        this.f41372a.n(b.a(a10, i10, i11), b10);
    }
}
