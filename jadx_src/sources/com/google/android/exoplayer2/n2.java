package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.r;

/* JADX INFO: compiled from: MediaPeriodHolder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f47029p = "MediaPeriodHolder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.c0 f47030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.d1[] f47032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o2 f47035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f47037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o3[] f47038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.trackselection.w f47039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t2 f47040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private n2 f47041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.exoplayer2.source.p1 f47042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.exoplayer2.trackselection.x f47043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f47044o;

    public n2(o3[] o3VarArr, long j10, com.google.android.exoplayer2.trackselection.w wVar, com.google.android.exoplayer2.upstream.b bVar, t2 t2Var, o2 o2Var, com.google.android.exoplayer2.trackselection.x xVar) {
        this.f47038i = o3VarArr;
        this.f47044o = j10;
        this.f47039j = wVar;
        this.f47040k = t2Var;
        com.google.android.exoplayer2.source.f0.a aVar = o2Var.f47048a;
        this.f47031b = aVar.f47719a;
        this.f47035f = o2Var;
        this.f47042m = com.google.android.exoplayer2.source.p1.f48606e;
        this.f47043n = xVar;
        this.f47032c = new com.google.android.exoplayer2.source.d1[o3VarArr.length];
        this.f47037h = new boolean[o3VarArr.length];
        this.f47030a = e(aVar, t2Var, bVar, o2Var.f47049b, o2Var.f47051d);
    }

    private void c(com.google.android.exoplayer2.source.d1[] d1VarArr) {
        int i10 = 0;
        while (true) {
            o3[] o3VarArr = this.f47038i;
            if (i10 >= o3VarArr.length) {
                return;
            }
            if (o3VarArr[i10].d() == -2 && this.f47043n.c(i10)) {
                d1VarArr[i10] = new r();
            }
            i10++;
        }
    }

    private static com.google.android.exoplayer2.source.c0 e(com.google.android.exoplayer2.source.f0.a aVar, t2 t2Var, com.google.android.exoplayer2.upstream.b bVar, long j10, long j11) {
        com.google.android.exoplayer2.source.c0 c0VarI = t2Var.i(aVar, bVar, j10);
        return j11 != j.f46377b ? new com.google.android.exoplayer2.source.c(c0VarI, true, 0L, j11) : c0VarI;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            com.google.android.exoplayer2.trackselection.x xVar = this.f47043n;
            if (i10 >= xVar.f50190a) {
                return;
            }
            boolean zC = xVar.c(i10);
            com.google.android.exoplayer2.trackselection.j jVar = this.f47043n.f50192c[i10];
            if (zC && jVar != null) {
                jVar.c();
            }
            i10++;
        }
    }

    private void g(com.google.android.exoplayer2.source.d1[] d1VarArr) {
        int i10 = 0;
        while (true) {
            o3[] o3VarArr = this.f47038i;
            if (i10 >= o3VarArr.length) {
                return;
            }
            if (o3VarArr[i10].d() == -2) {
                d1VarArr[i10] = null;
            }
            i10++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            com.google.android.exoplayer2.trackselection.x xVar = this.f47043n;
            if (i10 >= xVar.f50190a) {
                return;
            }
            boolean zC = xVar.c(i10);
            com.google.android.exoplayer2.trackselection.j jVar = this.f47043n.f50192c[i10];
            if (zC && jVar != null) {
                jVar.i();
            }
            i10++;
        }
    }

    private boolean r() {
        return this.f47041l == null;
    }

    private static void u(t2 t2Var, com.google.android.exoplayer2.source.c0 c0Var) {
        try {
            if (c0Var instanceof com.google.android.exoplayer2.source.c) {
                t2Var.B(((com.google.android.exoplayer2.source.c) c0Var).f47581b);
            } else {
                t2Var.B(c0Var);
            }
        } catch (RuntimeException e10) {
            com.google.android.exoplayer2.util.u.e(f47029p, "Period release failed.", e10);
        }
    }

    public void A() {
        com.google.android.exoplayer2.source.c0 c0Var = this.f47030a;
        if (c0Var instanceof com.google.android.exoplayer2.source.c) {
            long j10 = this.f47035f.f47051d;
            if (j10 == j.f46377b) {
                j10 = Long.MIN_VALUE;
            }
            ((com.google.android.exoplayer2.source.c) c0Var).x(0L, j10);
        }
    }

    public long a(com.google.android.exoplayer2.trackselection.x xVar, long j10, boolean z10) {
        return b(xVar, j10, z10, new boolean[this.f47038i.length]);
    }

    public long b(com.google.android.exoplayer2.trackselection.x xVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= xVar.f50190a) {
                break;
            }
            boolean[] zArr2 = this.f47037h;
            if (z10 || !xVar.b(this.f47043n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f47032c);
        f();
        this.f47043n = xVar;
        h();
        long jL = this.f47030a.l(xVar.f50192c, this.f47037h, this.f47032c, zArr, j10);
        c(this.f47032c);
        this.f47034e = false;
        int i11 = 0;
        while (true) {
            com.google.android.exoplayer2.source.d1[] d1VarArr = this.f47032c;
            if (i11 >= d1VarArr.length) {
                return jL;
            }
            if (d1VarArr[i11] != null) {
                com.google.android.exoplayer2.util.a.i(xVar.c(i11));
                if (this.f47038i[i11].d() != -2) {
                    this.f47034e = true;
                }
            } else {
                com.google.android.exoplayer2.util.a.i(xVar.f50192c[i11] == null);
            }
            i11++;
        }
    }

    public void d(long j10) {
        com.google.android.exoplayer2.util.a.i(r());
        this.f47030a.d(y(j10));
    }

    public long i() {
        if (!this.f47033d) {
            return this.f47035f.f47049b;
        }
        long jE = this.f47034e ? this.f47030a.e() : Long.MIN_VALUE;
        return jE == Long.MIN_VALUE ? this.f47035f.f47052e : jE;
    }

    @androidx.annotation.p0
    public n2 j() {
        return this.f47041l;
    }

    public long k() {
        if (this.f47033d) {
            return this.f47030a.g();
        }
        return 0L;
    }

    public long l() {
        return this.f47044o;
    }

    public long m() {
        return this.f47035f.f47049b + this.f47044o;
    }

    public com.google.android.exoplayer2.source.p1 n() {
        return this.f47042m;
    }

    public com.google.android.exoplayer2.trackselection.x o() {
        return this.f47043n;
    }

    public void p(float f10, z3 z3Var) throws ExoPlaybackException {
        this.f47033d = true;
        this.f47042m = this.f47030a.o();
        com.google.android.exoplayer2.trackselection.x xVarV = v(f10, z3Var);
        o2 o2Var = this.f47035f;
        long jMax = o2Var.f47049b;
        long j10 = o2Var.f47052e;
        if (j10 != j.f46377b && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(xVarV, jMax, false);
        long j11 = this.f47044o;
        o2 o2Var2 = this.f47035f;
        this.f47044o = j11 + (o2Var2.f47049b - jA);
        this.f47035f = o2Var2.b(jA);
    }

    public boolean q() {
        return this.f47033d && (!this.f47034e || this.f47030a.e() == Long.MIN_VALUE);
    }

    public void s(long j10) {
        com.google.android.exoplayer2.util.a.i(r());
        if (this.f47033d) {
            this.f47030a.f(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f47040k, this.f47030a);
    }

    public com.google.android.exoplayer2.trackselection.x v(float f10, z3 z3Var) throws ExoPlaybackException {
        com.google.android.exoplayer2.trackselection.x xVarG = this.f47039j.g(this.f47038i, n(), this.f47035f.f47048a, z3Var);
        for (com.google.android.exoplayer2.trackselection.j jVar : xVarG.f50192c) {
            if (jVar != null) {
                jVar.q(f10);
            }
        }
        return xVarG;
    }

    public void w(@androidx.annotation.p0 n2 n2Var) {
        if (n2Var == this.f47041l) {
            return;
        }
        f();
        this.f47041l = n2Var;
        h();
    }

    public void x(long j10) {
        this.f47044o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
