package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.z3;

/* JADX INFO: compiled from: MaskingMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x extends e<Void> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f0 f49268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f49269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z3.d f49270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z3.b f49271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f49272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private w f49273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f49274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f49275r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49276s;

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class a extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final Object f49277j = new Object();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private final Object f49278h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private final Object f49279i;

        private a(z3 z3Var, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
            super(z3Var);
            this.f49278h = obj;
            this.f49279i = obj2;
        }

        public static a D(i2 i2Var) {
            return new a(new b(i2Var), z3.d.f52104s, f49277j);
        }

        public static a E(z3 z3Var, @androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
            return new a(z3Var, obj, obj2);
        }

        public a C(z3 z3Var) {
            return new a(z3Var, this.f49278h, this.f49279i);
        }

        public z3 F() {
            return this.f49002g;
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public int g(Object obj) {
            Object obj2;
            z3 z3Var = this.f49002g;
            if (f49277j.equals(obj) && (obj2 = this.f49279i) != null) {
                obj = obj2;
            }
            return z3Var.g(obj);
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.b l(int i10, z3.b bVar, boolean z10) {
            this.f49002g.l(i10, bVar, z10);
            if (com.google.android.exoplayer2.util.u0.c(bVar.f52094c, this.f49279i) && z10) {
                bVar.f52094c = f49277j;
            }
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public Object t(int i10) {
            Object objT = this.f49002g.t(i10);
            return com.google.android.exoplayer2.util.u0.c(objT, this.f49279i) ? f49277j : objT;
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.d v(int i10, z3.d dVar, long j10) {
            this.f49002g.v(i10, dVar, j10);
            if (com.google.android.exoplayer2.util.u0.c(dVar.f52112b, this.f49278h)) {
                dVar.f52112b = z3.d.f52104s;
            }
            return dVar;
        }
    }

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    @androidx.annotation.j1
    public static final class b extends z3 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final i2 f49280g;

        public b(i2 i2Var) {
            this.f49280g = i2Var;
        }

        @Override // com.google.android.exoplayer2.z3
        public int g(Object obj) {
            return obj == a.f49277j ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.z3
        public z3.b l(int i10, z3.b bVar, boolean z10) {
            bVar.y(z10 ? 0 : null, z10 ? a.f49277j : null, 0, com.google.android.exoplayer2.j.f46377b, 0L, com.google.android.exoplayer2.source.ads.c.f47508m, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.z3
        public int n() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.z3
        public Object t(int i10) {
            return a.f49277j;
        }

        @Override // com.google.android.exoplayer2.z3
        public z3.d v(int i10, z3.d dVar, long j10) {
            dVar.n(z3.d.f52104s, this.f49280g, null, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, false, true, null, 0L, com.google.android.exoplayer2.j.f46377b, 0, 0, 0L);
            dVar.f52123m = true;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.z3
        public int w() {
            return 1;
        }
    }

    public x(f0 f0Var, boolean z10) {
        this.f49268k = f0Var;
        this.f49269l = z10 && f0Var.t();
        this.f49270m = new z3.d();
        this.f49271n = new z3.b();
        z3 z3VarG = f0Var.g();
        if (z3VarG == null) {
            this.f49272o = a.D(f0Var.c());
        } else {
            this.f49272o = a.E(z3VarG, null, null);
            this.f49276s = true;
        }
    }

    private Object a0(Object obj) {
        return (this.f49272o.f49279i == null || !this.f49272o.f49279i.equals(obj)) ? obj : a.f49277j;
    }

    private Object b0(Object obj) {
        return (this.f49272o.f49279i == null || !obj.equals(a.f49277j)) ? obj : this.f49272o.f49279i;
    }

    @mk.m({"unpreparedMaskingMediaPeriod"})
    private void f0(long j10) {
        w wVar = this.f49273p;
        int iG = this.f49272o.g(wVar.f49238b.f47719a);
        if (iG == -1) {
            return;
        }
        long j11 = this.f49272o.k(iG, this.f49271n).f52096e;
        if (j11 != com.google.android.exoplayer2.j.f46377b && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        wVar.x(j10);
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    public void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        super.D(u0Var);
        if (this.f49269l) {
            return;
        }
        this.f49274q = true;
        V(null, this.f49268k);
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    public void F() {
        this.f49275r = false;
        this.f49274q = false;
        super.F();
    }

    @Override // com.google.android.exoplayer2.source.f0
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public w h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        w wVar = new w(aVar, bVar, j10);
        wVar.z(this.f49268k);
        if (this.f49275r) {
            wVar.b(aVar.a(b0(aVar.f47719a)));
        } else {
            this.f49273p = wVar;
            if (!this.f49274q) {
                this.f49274q = true;
                V(null, this.f49268k);
            }
        }
        return wVar;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f49268k.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    @androidx.annotation.p0
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public f0.a K(Void r10, f0.a aVar) {
        return aVar.a(a0(aVar.f47719a));
    }

    public z3 d0() {
        return this.f49272o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.e
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void R(Void r13, f0 f0Var, z3 z3Var) {
        long j10;
        f0.a aVarA;
        if (this.f49275r) {
            this.f49272o = this.f49272o.C(z3Var);
            w wVar = this.f49273p;
            if (wVar != null) {
                f0(wVar.m());
            }
        } else {
            if (!z3Var.x()) {
                z3Var.u(0, this.f49270m);
                long jG = this.f49270m.g();
                Object obj = this.f49270m.f52112b;
                w wVar2 = this.f49273p;
                if (wVar2 != null) {
                    long jS = wVar2.s();
                    this.f49272o.m(this.f49273p.f49238b.f47719a, this.f49271n);
                    long jS2 = this.f49271n.s() + jS;
                    if (jS2 != this.f49272o.u(0, this.f49270m).g()) {
                        j10 = jS2;
                    } else {
                        j10 = jG;
                    }
                } else {
                    j10 = jG;
                }
                Pair<Object, Long> pairO = z3Var.o(this.f49270m, this.f49271n, 0, j10);
                Object obj2 = pairO.first;
                long jLongValue = ((Long) pairO.second).longValue();
                this.f49272o = this.f49276s ? this.f49272o.C(z3Var) : a.E(z3Var, obj, obj2);
                w wVar3 = this.f49273p;
                if (wVar3 != null) {
                    f0(jLongValue);
                    f0.a aVar = wVar3.f49238b;
                    aVarA = aVar.a(b0(aVar.f47719a));
                }
                this.f49276s = true;
                this.f49275r = true;
                E(this.f49272o);
                if (aVarA != null) {
                    ((w) com.google.android.exoplayer2.util.a.g(this.f49273p)).b(aVarA);
                }
            }
            this.f49272o = this.f49276s ? this.f49272o.C(z3Var) : a.E(z3Var, z3.d.f52104s, a.f49277j);
        }
        aVarA = null;
        this.f49276s = true;
        this.f49275r = true;
        E(this.f49272o);
        if (aVarA != null) {
            ((w) com.google.android.exoplayer2.util.a.g(this.f49273p)).b(aVarA);
        }
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.f0
    public void f() {
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        ((w) c0Var).y();
        if (c0Var == this.f49273p) {
            this.f49273p = null;
        }
    }
}
