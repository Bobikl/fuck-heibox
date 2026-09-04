package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.z3;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: SingleSampleMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j1 extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.r f48492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o.a f48493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a2 f48494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f48495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g0 f48496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f48497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z3 f48498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i2 f48499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.upstream.u0 f48500p;

    /* JADX INFO: compiled from: SingleSampleMediaSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.upstream.o.a f48501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.g0 f48502b = new com.google.android.exoplayer2.upstream.y();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48503c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f48504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48505e;

        public b(com.google.android.exoplayer2.upstream.o.a aVar) {
            this.f48501a = (com.google.android.exoplayer2.upstream.o.a) com.google.android.exoplayer2.util.a.g(aVar);
        }

        public j1 a(i2.k kVar, long j10) {
            return new j1(this.f48505e, kVar, this.f48501a, j10, this.f48502b, this.f48503c, this.f48504d);
        }

        public b b(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.g0 g0Var) {
            if (g0Var == null) {
                g0Var = new com.google.android.exoplayer2.upstream.y();
            }
            this.f48502b = g0Var;
            return this;
        }

        public b c(@androidx.annotation.p0 Object obj) {
            this.f48504d = obj;
            return this;
        }

        public b d(@androidx.annotation.p0 String str) {
            this.f48505e = str;
            return this;
        }

        public b e(boolean z10) {
            this.f48503c = z10;
            return this;
        }
    }

    private j1(@androidx.annotation.p0 String str, i2.k kVar, com.google.android.exoplayer2.upstream.o.a aVar, long j10, com.google.android.exoplayer2.upstream.g0 g0Var, boolean z10, @androidx.annotation.p0 Object obj) {
        this.f48493i = aVar;
        this.f48495k = j10;
        this.f48496l = g0Var;
        this.f48497m = z10;
        i2 i2VarA = new i2.c().K(Uri.EMPTY).D(kVar.f46354a.toString()).H(ImmutableList.D(kVar)).J(obj).a();
        this.f48499o = i2VarA;
        this.f48494j = new a2.b().S(str).e0((String) com.google.common.base.q.a(kVar.f46355b, com.google.android.exoplayer2.util.y.f51577i0)).V(kVar.f46356c).g0(kVar.f46357d).c0(kVar.f46358e).U(kVar.f46359f).E();
        this.f48492h = new com.google.android.exoplayer2.upstream.r.b().j(kVar.f46354a).c(1).a();
        this.f48498n = new h1(j10, true, false, false, (Object) null, i2VarA);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        this.f48500p = u0Var;
        E(this.f48498n);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void F() {
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f48499o;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void f() {
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        return new i1(this.f48492h, this.f48493i, this.f48500p, this.f48494j, this.f48495k, this.f48496l, x(aVar), this.f48497m);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        ((i1) c0Var).t();
    }
}
