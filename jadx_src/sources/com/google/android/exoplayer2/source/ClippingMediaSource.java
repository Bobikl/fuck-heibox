package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.z3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class ClippingMediaSource extends e<Void> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f0 f47412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f47413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f47414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f47415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f47416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f47417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList<c> f47418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final z3.d f47419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private a f47420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private IllegalClippingException f47421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f47422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f47423v;

    public static final class IllegalClippingException extends IOException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f47424c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f47425d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f47426e = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47427b;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public IllegalClippingException(int i10) {
            String strValueOf = String.valueOf(a(i10));
            super(strValueOf.length() != 0 ? "Illegal clipping: ".concat(strValueOf) : new String("Illegal clipping: "));
            this.f47427b = i10;
        }

        private static String a(int i10) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 != 1) {
                return i10 != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }
    }

    public static final class a extends s {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f47428h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f47429i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f47430j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final boolean f47431k;

        public a(z3 z3Var, long j10, long j11) throws IllegalClippingException {
            super(z3Var);
            boolean z10 = false;
            if (z3Var.n() != 1) {
                throw new IllegalClippingException(0);
            }
            z3.d dVarU = z3Var.u(0, new z3.d());
            long jMax = Math.max(0L, j10);
            if (!dVarU.f52123m && jMax != 0 && !dVarU.f52119i) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? dVarU.f52125o : Math.max(0L, j11);
            long j12 = dVarU.f52125o;
            if (j12 != com.google.android.exoplayer2.j.f46377b) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f47428h = jMax;
            this.f47429i = jMax2;
            this.f47430j = jMax2 == com.google.android.exoplayer2.j.f46377b ? -9223372036854775807L : jMax2 - jMax;
            if (dVarU.f52120j && (jMax2 == com.google.android.exoplayer2.j.f46377b || (j12 != com.google.android.exoplayer2.j.f46377b && jMax2 == j12))) {
                z10 = true;
            }
            this.f47431k = z10;
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.b l(int i10, z3.b bVar, boolean z10) {
            this.f49002g.l(0, bVar, z10);
            long jS = bVar.s() - this.f47428h;
            long j10 = this.f47430j;
            return bVar.x(bVar.f52093b, bVar.f52094c, 0, j10 == com.google.android.exoplayer2.j.f46377b ? -9223372036854775807L : j10 - jS, jS);
        }

        @Override // com.google.android.exoplayer2.source.s, com.google.android.exoplayer2.z3
        public z3.d v(int i10, z3.d dVar, long j10) {
            this.f49002g.v(0, dVar, 0L);
            long j11 = dVar.f52128r;
            long j12 = this.f47428h;
            dVar.f52128r = j11 + j12;
            dVar.f52125o = this.f47430j;
            dVar.f52120j = this.f47431k;
            long j13 = dVar.f52124n;
            if (j13 != com.google.android.exoplayer2.j.f46377b) {
                long jMax = Math.max(j13, j12);
                dVar.f52124n = jMax;
                long j14 = this.f47429i;
                if (j14 != com.google.android.exoplayer2.j.f46377b) {
                    jMax = Math.min(jMax, j14);
                }
                dVar.f52124n = jMax - this.f47428h;
            }
            long jB1 = com.google.android.exoplayer2.util.u0.B1(this.f47428h);
            long j15 = dVar.f52116f;
            if (j15 != com.google.android.exoplayer2.j.f46377b) {
                dVar.f52116f = j15 + jB1;
            }
            long j16 = dVar.f52117g;
            if (j16 != com.google.android.exoplayer2.j.f46377b) {
                dVar.f52117g = j16 + jB1;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(f0 f0Var, long j10) {
        this(f0Var, 0L, j10, true, false, true);
    }

    public ClippingMediaSource(f0 f0Var, long j10, long j11) {
        this(f0Var, j10, j11, true, false, false);
    }

    public ClippingMediaSource(f0 f0Var, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        com.google.android.exoplayer2.util.a.a(j10 >= 0);
        this.f47412k = (f0) com.google.android.exoplayer2.util.a.g(f0Var);
        this.f47413l = j10;
        this.f47414m = j11;
        this.f47415n = z10;
        this.f47416o = z11;
        this.f47417p = z12;
        this.f47418q = new ArrayList<>();
        this.f47419r = new z3.d();
    }

    private void a0(z3 z3Var) {
        long j10;
        long j11;
        z3Var.u(0, this.f47419r);
        long jK = this.f47419r.k();
        if (this.f47420s == null || this.f47418q.isEmpty() || this.f47416o) {
            long j12 = this.f47413l;
            long j13 = this.f47414m;
            if (this.f47417p) {
                long jG = this.f47419r.g();
                j12 += jG;
                j13 += jG;
            }
            this.f47422u = jK + j12;
            this.f47423v = this.f47414m != Long.MIN_VALUE ? jK + j13 : Long.MIN_VALUE;
            int size = this.f47418q.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f47418q.get(i10).x(this.f47422u, this.f47423v);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f47422u - jK;
            j11 = this.f47414m != Long.MIN_VALUE ? this.f47423v - jK : Long.MIN_VALUE;
            j10 = j14;
        }
        try {
            a aVar = new a(z3Var, j10, j11);
            this.f47420s = aVar;
            E(aVar);
        } catch (IllegalClippingException e10) {
            this.f47421t = e10;
            for (int i11 = 0; i11 < this.f47418q.size(); i11++) {
                this.f47418q.get(i11).t(this.f47421t);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        super.D(u0Var);
        V(null, this.f47412k);
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected void F() {
        super.F();
        this.f47421t = null;
        this.f47420s = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void R(Void r10, f0 f0Var, z3 z3Var) {
        if (this.f47421t != null) {
            return;
        }
        a0(z3Var);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f47412k.c();
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.f0
    public void f() throws IOException {
        IllegalClippingException illegalClippingException = this.f47421t;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.f();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        c cVar = new c(this.f47412k.h(aVar, bVar, j10), this.f47415n, this.f47422u, this.f47423v);
        this.f47418q.add(cVar);
        return cVar;
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        com.google.android.exoplayer2.util.a.i(this.f47418q.remove(c0Var));
        this.f47412k.k(((c) c0Var).f47581b);
        if (!this.f47418q.isEmpty() || this.f47416o) {
            return;
        }
        a0(((a) com.google.android.exoplayer2.util.a.g(this.f47420s)).f49002g);
    }
}
