package com.google.android.exoplayer2.analytics;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PlaybackStatsListener.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u1 implements p1, s1.a {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final s1 f43873g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final Map<String, b> f43874h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Map<String, p1.b> f43875i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @androidx.annotation.p0
    private final a f43876j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final boolean f43877k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final z3.b f43878l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private t1 f43879m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @androidx.annotation.p0
    private String f43880n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private long f43881o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f43882p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f43883q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @androidx.annotation.p0
    private Exception f43884r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private long f43885s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private long f43886t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @androidx.annotation.p0
    private a2 f43887u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @androidx.annotation.p0
    private a2 f43888v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private com.google.android.exoplayer2.video.a0 f43889w0;

    /* JADX INFO: compiled from: PlaybackStatsListener.java */
    public interface a {
        void a(p1.b bVar, t1 t1Var);
    }

    /* JADX INFO: compiled from: PlaybackStatsListener.java */
    public static final class b {
        private long A;
        private long B;
        private long C;
        private long D;
        private long E;
        private int F;
        private int G;
        private int H;
        private long I;
        private boolean J;
        private boolean K;
        private boolean L;
        private boolean M;
        private boolean N;
        private long O;

        @androidx.annotation.p0
        private a2 P;

        @androidx.annotation.p0
        private a2 Q;
        private long R;
        private long S;
        private float T;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f43890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f43891b = new long[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<t1.c> f43892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<long[]> f43893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<t1.b> f43894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<t1.b> f43895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<t1.a> f43896g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List<t1.a> f43897h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f43898i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f43899j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f43900k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f43901l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f43902m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f43903n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f43904o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f43905p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f43906q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f43907r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f43908s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f43909t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f43910u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private long f43911v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private long f43912w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private long f43913x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private long f43914y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private long f43915z;

        public b(boolean z10, p1.b bVar) {
            this.f43890a = z10;
            this.f43892c = z10 ? new ArrayList<>() : Collections.emptyList();
            this.f43893d = z10 ? new ArrayList<>() : Collections.emptyList();
            this.f43894e = z10 ? new ArrayList<>() : Collections.emptyList();
            this.f43895f = z10 ? new ArrayList<>() : Collections.emptyList();
            this.f43896g = z10 ? new ArrayList<>() : Collections.emptyList();
            this.f43897h = z10 ? new ArrayList<>() : Collections.emptyList();
            boolean z11 = false;
            this.H = 0;
            this.I = bVar.f43781a;
            this.f43899j = com.google.android.exoplayer2.j.f46377b;
            this.f43907r = com.google.android.exoplayer2.j.f46377b;
            com.google.android.exoplayer2.source.f0.a aVar = bVar.f43784d;
            if (aVar != null && aVar.c()) {
                z11 = true;
            }
            this.f43898i = z11;
            this.f43910u = -1L;
            this.f43909t = -1L;
            this.f43908s = -1;
            this.T = 1.0f;
        }

        private long[] b(long j10) {
            List<long[]> list = this.f43893d;
            long[] jArr = list.get(list.size() - 1);
            return new long[]{j10, jArr[1] + ((long) ((j10 - jArr[0]) * this.T))};
        }

        private static boolean c(int i10, int i11) {
            return ((i10 != 1 && i10 != 2 && i10 != 14) || i11 == 1 || i11 == 2 || i11 == 14 || i11 == 3 || i11 == 4 || i11 == 9 || i11 == 11) ? false : true;
        }

        private static boolean d(int i10) {
            return i10 == 4 || i10 == 7;
        }

        private static boolean e(int i10) {
            return i10 == 3 || i10 == 4 || i10 == 9;
        }

        private static boolean f(int i10) {
            return i10 == 6 || i10 == 7 || i10 == 10;
        }

        private void g(long j10) {
            a2 a2Var;
            int i10;
            if (this.H == 3 && (a2Var = this.Q) != null && (i10 = a2Var.f43589i) != -1) {
                long j11 = (long) ((j10 - this.S) * this.T);
                this.f43915z += j11;
                this.A += j11 * ((long) i10);
            }
            this.S = j10;
        }

        private void h(long j10) {
            a2 a2Var;
            if (this.H == 3 && (a2Var = this.P) != null) {
                long j11 = (long) ((j10 - this.R) * this.T);
                int i10 = a2Var.f43599s;
                if (i10 != -1) {
                    this.f43911v += j11;
                    this.f43912w += ((long) i10) * j11;
                }
                int i11 = a2Var.f43589i;
                if (i11 != -1) {
                    this.f43913x += j11;
                    this.f43914y += j11 * ((long) i11);
                }
            }
            this.R = j10;
        }

        private void i(p1.b bVar, @androidx.annotation.p0 a2 a2Var) {
            int i10;
            if (com.google.android.exoplayer2.util.u0.c(this.Q, a2Var)) {
                return;
            }
            g(bVar.f43781a);
            if (a2Var != null && this.f43910u == -1 && (i10 = a2Var.f43589i) != -1) {
                this.f43910u = i10;
            }
            this.Q = a2Var;
            if (this.f43890a) {
                this.f43895f.add(new t1.b(bVar, a2Var));
            }
        }

        private void j(long j10) {
            if (f(this.H)) {
                long j11 = j10 - this.O;
                long j12 = this.f43907r;
                if (j12 == com.google.android.exoplayer2.j.f46377b || j11 > j12) {
                    this.f43907r = j11;
                }
            }
        }

        private void k(long j10, long j11) {
            if (this.f43890a) {
                if (this.H != 3) {
                    if (j11 == com.google.android.exoplayer2.j.f46377b) {
                        return;
                    }
                    if (!this.f43893d.isEmpty()) {
                        List<long[]> list = this.f43893d;
                        long j12 = list.get(list.size() - 1)[1];
                        if (j12 != j11) {
                            this.f43893d.add(new long[]{j10, j12});
                        }
                    }
                }
                if (j11 != com.google.android.exoplayer2.j.f46377b) {
                    this.f43893d.add(new long[]{j10, j11});
                } else {
                    if (this.f43893d.isEmpty()) {
                        return;
                    }
                    this.f43893d.add(b(j10));
                }
            }
        }

        private void l(p1.b bVar, @androidx.annotation.p0 a2 a2Var) {
            int i10;
            int i11;
            if (com.google.android.exoplayer2.util.u0.c(this.P, a2Var)) {
                return;
            }
            h(bVar.f43781a);
            if (a2Var != null) {
                if (this.f43908s == -1 && (i11 = a2Var.f43599s) != -1) {
                    this.f43908s = i11;
                }
                if (this.f43909t == -1 && (i10 = a2Var.f43589i) != -1) {
                    this.f43909t = i10;
                }
            }
            this.P = a2Var;
            if (this.f43890a) {
                this.f43894e.add(new t1.b(bVar, a2Var));
            }
        }

        private int q(c3 c3Var) {
            int playbackState = c3Var.getPlaybackState();
            if (this.J && this.K) {
                return 5;
            }
            if (this.M) {
                return 13;
            }
            if (!this.K) {
                return this.N ? 1 : 0;
            }
            if (this.L) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState != 2) {
                if (playbackState == 3) {
                    if (c3Var.p0()) {
                        return c3Var.u1() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (playbackState != 1 || this.H == 0) {
                    return this.H;
                }
                return 12;
            }
            int i10 = this.H;
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 14) {
                return 2;
            }
            if (c3Var.p0()) {
                return c3Var.u1() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void r(int i10, p1.b bVar) {
            com.google.android.exoplayer2.util.a.a(bVar.f43781a >= this.I);
            long j10 = bVar.f43781a;
            long j11 = j10 - this.I;
            long[] jArr = this.f43891b;
            int i11 = this.H;
            jArr[i11] = jArr[i11] + j11;
            if (this.f43899j == com.google.android.exoplayer2.j.f46377b) {
                this.f43899j = j10;
            }
            this.f43902m |= c(i11, i10);
            this.f43900k |= e(i10);
            this.f43901l |= i10 == 11;
            if (!d(this.H) && d(i10)) {
                this.f43903n++;
            }
            if (i10 == 5) {
                this.f43905p++;
            }
            if (!f(this.H) && f(i10)) {
                this.f43906q++;
                this.O = bVar.f43781a;
            }
            if (f(this.H) && this.H != 7 && i10 == 7) {
                this.f43904o++;
            }
            j(bVar.f43781a);
            this.H = i10;
            this.I = bVar.f43781a;
            if (this.f43890a) {
                this.f43892c.add(new t1.c(bVar, i10));
            }
        }

        public t1 a(boolean z10) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.f43891b;
            List<long[]> list2 = this.f43893d;
            if (z10) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.f43891b, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.I);
                int i10 = this.H;
                jArrCopyOf[i10] = jArrCopyOf[i10] + jMax;
                j(jElapsedRealtime);
                h(jElapsedRealtime);
                g(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.f43893d);
                if (this.f43890a && this.H == 3) {
                    arrayList.add(b(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i11 = (this.f43902m || !this.f43900k) ? 1 : 0;
            long j10 = i11 != 0 ? com.google.android.exoplayer2.j.f46377b : jArr[2];
            int i12 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z10 ? this.f43894e : new ArrayList(this.f43894e);
            List arrayList3 = z10 ? this.f43895f : new ArrayList(this.f43895f);
            List arrayList4 = z10 ? this.f43892c : new ArrayList(this.f43892c);
            long j11 = this.f43899j;
            boolean z11 = this.K;
            int i13 = !this.f43900k ? 1 : 0;
            boolean z12 = this.f43901l;
            int i14 = i11 ^ 1;
            int i15 = this.f43903n;
            int i16 = this.f43904o;
            int i17 = this.f43905p;
            int i18 = this.f43906q;
            long j12 = this.f43907r;
            boolean z13 = this.f43898i;
            long[] jArr3 = jArr;
            long j13 = this.f43911v;
            long j14 = this.f43912w;
            long j15 = this.f43913x;
            long j16 = this.f43914y;
            long j17 = this.f43915z;
            long j18 = this.A;
            int i19 = this.f43908s;
            int i20 = i19 == -1 ? 0 : 1;
            long j19 = this.f43909t;
            int i21 = j19 == -1 ? 0 : 1;
            long j20 = this.f43910u;
            int i22 = j20 == -1 ? 0 : 1;
            long j21 = this.B;
            long j22 = this.C;
            long j23 = this.D;
            long j24 = this.E;
            int i23 = this.F;
            return new t1(1, jArr3, arrayList4, list, j11, z11 ? 1 : 0, i13, z12 ? 1 : 0, i12, j10, i14, i15, i16, i17, i18, j12, z13 ? 1 : 0, arrayList2, arrayList3, j13, j14, j15, j16, j17, j18, i20, i21, i19, j19, i22, j20, j21, j22, j23, j24, i23 > 0 ? 1 : 0, i23, this.G, this.f43896g, this.f43897h);
        }

        public void m(c3 c3Var, p1.b bVar, boolean z10, long j10, boolean z11, int i10, boolean z12, boolean z13, @androidx.annotation.p0 PlaybackException playbackException, @androidx.annotation.p0 Exception exc, long j11, long j12, @androidx.annotation.p0 a2 a2Var, @androidx.annotation.p0 a2 a2Var2, @androidx.annotation.p0 com.google.android.exoplayer2.video.a0 a0Var) {
            long j13 = com.google.android.exoplayer2.j.f46377b;
            if (j10 != com.google.android.exoplayer2.j.f46377b) {
                k(bVar.f43781a, j10);
                this.J = true;
            }
            if (c3Var.getPlaybackState() != 2) {
                this.J = false;
            }
            int playbackState = c3Var.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z11) {
                this.L = false;
            }
            if (playbackException != null) {
                this.M = true;
                this.F++;
                if (this.f43890a) {
                    this.f43896g.add(new t1.a(bVar, playbackException));
                }
            } else if (c3Var.b() == null) {
                this.M = false;
            }
            if (this.K && !this.L) {
                e4 e4VarV1 = c3Var.v1();
                if (!e4VarV1.d(2)) {
                    l(bVar, null);
                }
                if (!e4VarV1.d(1)) {
                    i(bVar, null);
                }
            }
            if (a2Var != null) {
                l(bVar, a2Var);
            }
            if (a2Var2 != null) {
                i(bVar, a2Var2);
            }
            a2 a2Var3 = this.P;
            if (a2Var3 != null && a2Var3.f43599s == -1 && a0Var != null) {
                l(bVar, a2Var3.c().j0(a0Var.f51712b).Q(a0Var.f51713c).E());
            }
            if (z13) {
                this.N = true;
            }
            if (z12) {
                this.E++;
            }
            this.D += (long) i10;
            this.B += j11;
            this.C += j12;
            if (exc != null) {
                this.G++;
                if (this.f43890a) {
                    this.f43897h.add(new t1.a(bVar, exc));
                }
            }
            int iQ = q(c3Var);
            float f10 = c3Var.g().f44371b;
            if (this.H != iQ || this.T != f10) {
                long j14 = bVar.f43781a;
                if (z10) {
                    j13 = bVar.f43785e;
                }
                k(j14, j13);
                h(bVar.f43781a);
                g(bVar.f43781a);
            }
            this.T = f10;
            if (this.H != iQ) {
                r(iQ, bVar);
            }
        }

        public void n(p1.b bVar, boolean z10, long j10) {
            int i10 = 11;
            if (this.H != 11 && !z10) {
                i10 = 15;
            }
            k(bVar.f43781a, j10);
            h(bVar.f43781a);
            g(bVar.f43781a);
            r(i10, bVar);
        }

        public void o() {
            this.K = true;
        }

        public void p() {
            this.L = true;
            this.J = false;
        }
    }

    public u1(boolean z10, @androidx.annotation.p0 a aVar) {
        this.f43876j0 = aVar;
        this.f43877k0 = z10;
        r1 r1Var = new r1();
        this.f43873g0 = r1Var;
        this.f43874h0 = new HashMap();
        this.f43875i0 = new HashMap();
        this.f43879m0 = t1.f43836e0;
        this.f43878l0 = new z3.b();
        this.f43889w0 = com.google.android.exoplayer2.video.a0.f51706j;
        r1Var.e(this);
    }

    private Pair<p1.b, Boolean> B0(p1.c cVar, String str) {
        com.google.android.exoplayer2.source.f0.a aVar;
        p1.b bVar = null;
        boolean zG = false;
        for (int i10 = 0; i10 < cVar.e(); i10++) {
            p1.b bVarD = cVar.d(cVar.c(i10));
            boolean zG2 = this.f43873g0.g(bVarD, str);
            if (bVar == null || ((zG2 && !zG) || (zG2 == zG && bVarD.f43781a > bVar.f43781a))) {
                bVar = bVarD;
                zG = zG2;
            }
        }
        com.google.android.exoplayer2.util.a.g(bVar);
        if (!zG && (aVar = bVar.f43784d) != null && aVar.c()) {
            long j10 = bVar.f43782b.m(bVar.f43784d.f47719a, this.f43878l0).j(bVar.f43784d.f47720b);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f43878l0.f52096e;
            }
            long jS = j10 + this.f43878l0.s();
            long j11 = bVar.f43781a;
            z3 z3Var = bVar.f43782b;
            int i11 = bVar.f43783c;
            com.google.android.exoplayer2.source.f0.a aVar2 = bVar.f43784d;
            p1.b bVar2 = new p1.b(j11, z3Var, i11, new com.google.android.exoplayer2.source.f0.a(aVar2.f47719a, aVar2.f47722d, aVar2.f47720b), com.google.android.exoplayer2.util.u0.B1(jS), bVar.f43782b, bVar.f43787g, bVar.f43788h, bVar.f43789i, bVar.f43790j);
            zG = this.f43873g0.g(bVar2, str);
            bVar = bVar2;
        }
        return Pair.create(bVar, Boolean.valueOf(zG));
    }

    private boolean E0(p1.c cVar, String str, int i10) {
        return cVar.a(i10) && this.f43873g0.g(cVar.d(i10), str);
    }

    private void F0(p1.c cVar) {
        for (int i10 = 0; i10 < cVar.e(); i10++) {
            int iC = cVar.c(i10);
            p1.b bVarD = cVar.d(iC);
            if (iC == 0) {
                this.f43873g0.c(bVarD);
            } else if (iC == 11) {
                this.f43873g0.b(bVarD, this.f43882p0);
            } else {
                this.f43873g0.f(bVarD);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void A(p1.b bVar) {
        o1.A(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void A0(p1.b bVar, long j10) {
        o1.K(this, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void B(p1.b bVar, int i10, long j10, long j11) {
        o1.m(this, bVar, i10, j10, j11);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void C(p1.b bVar, String str, long j10, long j11) {
        o1.d(this, bVar, str, j10, j11);
    }

    public t1 C0() {
        int i10 = 1;
        t1[] t1VarArr = new t1[this.f43874h0.size() + 1];
        t1VarArr[0] = this.f43879m0;
        Iterator<b> it = this.f43874h0.values().iterator();
        while (it.hasNext()) {
            t1VarArr[i10] = it.next().a(false);
            i10++;
        }
        return t1.W(t1VarArr);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void D(p1.b bVar, com.google.android.exoplayer2.audio.f fVar) {
        o1.a(this, bVar, fVar);
    }

    @androidx.annotation.p0
    public t1 D0() {
        String strD = this.f43873g0.d();
        b bVar = strD == null ? null : this.f43874h0.get(strD);
        if (bVar == null) {
            return null;
        }
        return bVar.a(false);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void E(p1.b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar) {
        o1.F(this, bVar, uVar, yVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void F(p1.b bVar, com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar) {
        o1.i0(this, bVar, p1Var, pVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void G(p1.b bVar, boolean z10) {
        o1.E(this, bVar, z10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void H(p1.b bVar, Exception exc) {
        o1.b(this, bVar, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void I(p1.b bVar, com.google.android.exoplayer2.source.y yVar) {
        int i10 = yVar.f49283b;
        if (i10 == 2 || i10 == 0) {
            this.f43887u0 = yVar.f49284c;
        } else if (i10 == 1) {
            this.f43888v0 = yVar.f49284c;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void J(p1.b bVar, com.google.android.exoplayer2.source.y yVar) {
        o1.k0(this, bVar, yVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void K(p1.b bVar, c3.l lVar, c3.l lVar2, int i10) {
        if (this.f43880n0 == null) {
            this.f43880n0 = this.f43873g0.d();
            this.f43881o0 = lVar.f44471h;
        }
        this.f43882p0 = i10;
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void L(p1.b bVar, c3.c cVar) {
        o1.n(this, bVar, cVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void M(p1.b bVar, Object obj, long j10) {
        o1.Y(this, bVar, obj, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void N(p1.b bVar, int i10, com.google.android.exoplayer2.decoder.g gVar) {
        o1.p(this, bVar, i10, gVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void O(p1.b bVar, String str) {
        o1.o0(this, bVar, str);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void P(p1.b bVar, int i10) {
        o1.y(this, bVar, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void Q(p1.b bVar, Exception exc) {
        this.f43884r0 = exc;
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void R(p1.b bVar, boolean z10) {
        o1.J(this, bVar, z10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void S(p1.b bVar, m2 m2Var) {
        o1.M(this, bVar, m2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void T(p1.b bVar, String str, long j10) {
        o1.c(this, bVar, str, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void U(c3 c3Var, p1.c cVar) {
        if (cVar.e() == 0) {
            return;
        }
        F0(cVar);
        for (String str : this.f43874h0.keySet()) {
            Pair<p1.b, Boolean> pairB0 = B0(cVar, str);
            b bVar = this.f43874h0.get(str);
            boolean zE0 = E0(cVar, str, 11);
            boolean zE1 = E0(cVar, str, 1023);
            boolean zE2 = E0(cVar, str, 1012);
            boolean zE3 = E0(cVar, str, 1000);
            boolean zE4 = E0(cVar, str, 10);
            boolean z10 = E0(cVar, str, 1003) || E0(cVar, str, 1032);
            boolean zE5 = E0(cVar, str, 1006);
            boolean zE6 = E0(cVar, str, 1004);
            bVar.m(c3Var, (p1.b) pairB0.first, ((Boolean) pairB0.second).booleanValue(), str.equals(this.f43880n0) ? this.f43881o0 : com.google.android.exoplayer2.j.f46377b, zE0, zE1 ? this.f43883q0 : 0, zE2, zE3, zE4 ? c3Var.b() : null, z10 ? this.f43884r0 : null, zE5 ? this.f43885s0 : 0L, zE5 ? this.f43886t0 : 0L, zE6 ? this.f43887u0 : null, zE6 ? this.f43888v0 : null, E0(cVar, str, 1028) ? this.f43889w0 : null);
        }
        this.f43887u0 = null;
        this.f43888v0 = null;
        this.f43880n0 = null;
        if (cVar.a(1036)) {
            this.f43873g0.a(cVar.d(1036));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void V(p1.b bVar, int i10) {
        o1.k(this, bVar, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void W(p1.b bVar, int i10, int i11) {
        o1.g0(this, bVar, i10, i11);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void X(p1.b bVar, boolean z10, int i10) {
        o1.O(this, bVar, z10, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void Y(p1.b bVar, a2 a2Var, com.google.android.exoplayer2.decoder.i iVar) {
        o1.t0(this, bVar, a2Var, iVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void Z(p1.b bVar, int i10) {
        o1.h0(this, bVar, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void a(p1.b bVar, long j10, int i10) {
        o1.r0(this, bVar, j10, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void a0(p1.b bVar) {
        o1.d0(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void b(p1.b bVar) {
        o1.w(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void b0(p1.b bVar) {
        o1.x(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void c(p1.b bVar, int i10) {
        o1.R(this, bVar, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void c0(p1.b bVar) {
        o1.v(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void d(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar) {
        o1.g(this, bVar, gVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void d0(p1.b bVar, int i10, long j10, long j11) {
        this.f43885s0 = i10;
        this.f43886t0 = j10;
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void e(p1.b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar, IOException iOException, boolean z10) {
        this.f43884r0 = iOException;
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void e0(p1.b bVar, int i10, int i11, int i12, float f10) {
        o1.u0(this, bVar, i10, i11, i12, f10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void f(p1.b bVar, int i10, com.google.android.exoplayer2.decoder.g gVar) {
        o1.q(this, bVar, i10, gVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void f0(p1.b bVar, int i10, String str, long j10) {
        o1.r(this, bVar, i10, str, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void g(p1.b bVar, e4 e4Var) {
        o1.j0(this, bVar, e4Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void g0(p1.b bVar, int i10) {
        o1.W(this, bVar, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void h(p1.b bVar, Metadata metadata) {
        o1.N(this, bVar, metadata);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void h0(p1.b bVar, b3 b3Var) {
        o1.P(this, bVar, b3Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void i(p1.b bVar, boolean z10, int i10) {
        o1.U(this, bVar, z10, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void i0(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar) {
        o1.f(this, bVar, gVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void j(p1.b bVar, int i10) {
        o1.Q(this, bVar, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void j0(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar) {
        o1.q0(this, bVar, gVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void k(p1.b bVar, a2 a2Var) {
        o1.s0(this, bVar, a2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void k0(p1.b bVar, int i10) {
        o1.Z(this, bVar, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void l(p1.b bVar, long j10) {
        o1.j(this, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void l0(p1.b bVar) {
        o1.T(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void m(p1.b bVar, boolean z10) {
        o1.e0(this, bVar, z10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void m0(p1.b bVar, com.google.android.exoplayer2.video.a0 a0Var) {
        this.f43889w0 = a0Var;
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void n(p1.b bVar, int i10, long j10) {
        this.f43883q0 = i10;
    }

    @Override // com.google.android.exoplayer2.analytics.s1.a
    public void n0(p1.b bVar, String str, boolean z10) {
        b bVar2 = (b) com.google.android.exoplayer2.util.a.g(this.f43874h0.remove(str));
        p1.b bVar3 = (p1.b) com.google.android.exoplayer2.util.a.g(this.f43875i0.remove(str));
        bVar2.n(bVar, z10, str.equals(this.f43880n0) ? this.f43881o0 : com.google.android.exoplayer2.j.f46377b);
        t1 t1VarA = bVar2.a(true);
        this.f43879m0 = t1.W(this.f43879m0, t1VarA);
        a aVar = this.f43876j0;
        if (aVar != null) {
            aVar.a(bVar3, t1VarA);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void o(p1.b bVar, Exception exc) {
        o1.l(this, bVar, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.s1.a
    public void o0(p1.b bVar, String str) {
        ((b) com.google.android.exoplayer2.util.a.g(this.f43874h0.get(str))).o();
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void p(p1.b bVar, boolean z10) {
        o1.f0(this, bVar, z10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void p0(p1.b bVar, a2 a2Var) {
        o1.h(this, bVar, a2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void q(p1.b bVar, String str, long j10, long j11) {
        o1.n0(this, bVar, str, j10, j11);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void q0(p1.b bVar) {
        o1.u(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void r(p1.b bVar, long j10) {
        o1.b0(this, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void r0(p1.b bVar, float f10) {
        o1.w0(this, bVar, f10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void s(p1.b bVar, Exception exc) {
        o1.l0(this, bVar, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void s0(p1.b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar) {
        o1.G(this, bVar, uVar, yVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void t(p1.b bVar, i2 i2Var, int i10) {
        o1.L(this, bVar, i2Var, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void t0(p1.b bVar, String str) {
        o1.e(this, bVar, str);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void u(p1.b bVar, long j10) {
        o1.a0(this, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.s1.a
    public void u0(p1.b bVar, String str) {
        this.f43874h0.put(str, new b(this.f43877k0, bVar));
        this.f43875i0.put(str, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void v(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar) {
        o1.p0(this, bVar, gVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void v0(p1.b bVar, String str, long j10) {
        o1.m0(this, bVar, str, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void w(p1.b bVar, int i10, a2 a2Var) {
        o1.s(this, bVar, i10, a2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void w0(p1.b bVar, a2 a2Var, com.google.android.exoplayer2.decoder.i iVar) {
        o1.i(this, bVar, a2Var, iVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void x(p1.b bVar) {
        o1.c0(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void x0(p1.b bVar, m2 m2Var) {
        o1.V(this, bVar, m2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void y(p1.b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar) {
        o1.I(this, bVar, uVar, yVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void y0(p1.b bVar, boolean z10) {
        o1.D(this, bVar, z10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void z(p1.b bVar, PlaybackException playbackException) {
        o1.S(this, bVar, playbackException);
    }

    @Override // com.google.android.exoplayer2.analytics.s1.a
    public void z0(p1.b bVar, String str, String str2) {
        ((b) com.google.android.exoplayer2.util.a.g(this.f43874h0.get(str))).p();
    }
}
