package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ExoPlayerImplInternal.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x1 implements Handler.Callback, com.google.android.exoplayer2.source.c0.a, com.google.android.exoplayer2.trackselection.w.a, t2.d, m.a, h3.a {
    private static final int G2 = 17;
    private static final int G3 = 19;
    private static final int J3 = 20;
    private static final int K3 = 21;
    private static final int L3 = 22;
    private static final int M3 = 23;
    private static final int N3 = 24;
    private static final int O3 = 25;
    private static final int P3 = 10;
    private static final int Q3 = 1000;
    private static final String R = "ExoPlayerImplInternal";
    private static final long R3 = 2000;
    private static final int S = 0;
    private static final int T = 1;
    private static final int U = 2;
    private static final int V = 3;
    private static final int W = 4;
    private static final int X = 5;
    private static final int Y = 6;
    private static final int Z = 7;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f51975a0 = 8;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f51976b0 = 9;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f51977c0 = 10;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f51978p1 = 11;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f51979p2 = 14;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f51980p3 = 18;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f51981x1 = 12;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f51982x2 = 15;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f51983y1 = 13;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f51984y2 = 16;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;

    @androidx.annotation.p0
    private h L;
    private long M;
    private int N;
    private boolean O;

    @androidx.annotation.p0
    private ExoPlaybackException P;
    private long Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m3[] f51985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<m3> f51986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3[] f51987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.trackselection.w f51988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.trackselection.x f51989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g2 f51990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.e f51991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.p f51992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HandlerThread f51993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Looper f51994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final z3.d f51995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z3.b f51996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f51997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f51998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final m f51999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList<d> f52000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e f52001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f f52002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final q2 f52003t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final t2 f52004u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f2 f52005v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f52006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private r3 f52007x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private z2 f52008y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private e f52009z;

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public class a implements m3.c {
        a() {
        }

        @Override // com.google.android.exoplayer2.m3.c
        public void a() {
            x1.this.f51992i.l(2);
        }

        @Override // com.google.android.exoplayer2.m3.c
        public void b(long j10) {
            if (j10 >= 2000) {
                x1.this.I = true;
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<t2.c> f52011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.f1 f52012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f52013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f52014d;

        private b(List<t2.c> list, com.google.android.exoplayer2.source.f1 f1Var, int i10, long j10) {
            this.f52011a = list;
            this.f52012b = f1Var;
            this.f52013c = i10;
            this.f52014d = j10;
        }

        /* synthetic */ b(List list, com.google.android.exoplayer2.source.f1 f1Var, int i10, long j10, a aVar) {
            this(list, f1Var, i10, j10);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f52016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.f1 f52018d;

        public c(int i10, int i11, int i12, com.google.android.exoplayer2.source.f1 f1Var) {
            this.f52015a = i10;
            this.f52016b = i11;
            this.f52017c = i12;
            this.f52018d = f1Var;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h3 f52019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f52021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f52022e;

        public d(h3 h3Var) {
            this.f52019b = h3Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f52022e;
            if ((obj == null) != (dVar.f52022e == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f52020c - dVar.f52020c;
            return i10 != 0 ? i10 : com.google.android.exoplayer2.util.u0.q(this.f52021d, dVar.f52021d);
        }

        public void b(int i10, long j10, Object obj) {
            this.f52020c = i10;
            this.f52021d = j10;
            this.f52022e = obj;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f52023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z2 f52024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f52026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f52027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f52028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52029g;

        public e(z2 z2Var) {
            this.f52024b = z2Var;
        }

        public void b(int i10) {
            this.f52023a |= i10 > 0;
            this.f52025c += i10;
        }

        public void c(int i10) {
            this.f52023a = true;
            this.f52028f = true;
            this.f52029g = i10;
        }

        public void d(z2 z2Var) {
            this.f52023a |= this.f52024b != z2Var;
            this.f52024b = z2Var;
        }

        public void e(int i10) {
            if (this.f52026d && this.f52027e != 5) {
                com.google.android.exoplayer2.util.a.a(i10 == 5);
                return;
            }
            this.f52023a = true;
            this.f52026d = true;
            this.f52027e = i10;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.f0.a f52030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f52031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f52032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f52033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f52034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f52035f;

        public g(com.google.android.exoplayer2.source.f0.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f52030a = aVar;
            this.f52031b = j10;
            this.f52032c = j11;
            this.f52033d = z10;
            this.f52034e = z11;
            this.f52035f = z12;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z3 f52036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f52037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f52038c;

        public h(z3 z3Var, int i10, long j10) {
            this.f52036a = z3Var;
            this.f52037b = i10;
            this.f52038c = j10;
        }
    }

    public x1(m3[] m3VarArr, com.google.android.exoplayer2.trackselection.w wVar, com.google.android.exoplayer2.trackselection.x xVar, g2 g2Var, com.google.android.exoplayer2.upstream.e eVar, int i10, boolean z10, @androidx.annotation.p0 com.google.android.exoplayer2.analytics.n1 n1Var, r3 r3Var, f2 f2Var, long j10, boolean z11, Looper looper, com.google.android.exoplayer2.util.e eVar2, f fVar) {
        this.f52002s = fVar;
        this.f51985b = m3VarArr;
        this.f51988e = wVar;
        this.f51989f = xVar;
        this.f51990g = g2Var;
        this.f51991h = eVar;
        this.F = i10;
        this.G = z10;
        this.f52007x = r3Var;
        this.f52005v = f2Var;
        this.f52006w = j10;
        this.Q = j10;
        this.B = z11;
        this.f52001r = eVar2;
        this.f51997n = g2Var.h();
        this.f51998o = g2Var.d();
        z2 z2VarK = z2.k(xVar);
        this.f52008y = z2VarK;
        this.f52009z = new e(z2VarK);
        this.f51987d = new o3[m3VarArr.length];
        for (int i11 = 0; i11 < m3VarArr.length; i11++) {
            m3VarArr[i11].setIndex(i11);
            this.f51987d[i11] = m3VarArr[i11].r();
        }
        this.f51999p = new m(this, eVar2);
        this.f52000q = new ArrayList<>();
        this.f51986c = Sets.z();
        this.f51995l = new z3.d();
        this.f51996m = new z3.b();
        wVar.c(this, eVar);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f52003t = new q2(n1Var, handler);
        this.f52004u = new t2(this, n1Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f51993j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f51994k = looper2;
        this.f51992i = eVar2.e(looper2, this);
    }

    private static a2[] A(com.google.android.exoplayer2.trackselection.j jVar) {
        int length = jVar != null ? jVar.length() : 0;
        a2[] a2VarArr = new a2[length];
        for (int i10 = 0; i10 < length; i10++) {
            a2VarArr[i10] = jVar.p(i10);
        }
        return a2VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0175  */
    /* JADX WARN: Code duplicated, block: B:60:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01de  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fb  */
    private static g A0(z3 z3Var, z2 z2Var, @androidx.annotation.p0 h hVar, q2 q2Var, int i10, boolean z10, z3.d dVar, z3.b bVar) {
        com.google.android.exoplayer2.source.f0.a aVar;
        int i11;
        com.google.android.exoplayer2.source.f0.a aVar2;
        int i12;
        long jLongValue;
        boolean z11;
        boolean z12;
        boolean z13;
        int iF;
        int iF2;
        boolean z14;
        long j10;
        com.google.android.exoplayer2.source.f0.a aVarA;
        boolean z15;
        boolean zEquals;
        boolean z16;
        int i13;
        int iF3;
        boolean z17;
        boolean z18;
        boolean z19;
        if (z3Var.x()) {
            return new g(z2.l(), 0L, j.f46377b, false, true, false);
        }
        com.google.android.exoplayer2.source.f0.a aVar3 = z2Var.f52064b;
        Object obj = aVar3.f47719a;
        boolean zU = U(z2Var, bVar);
        long j11 = (z2Var.f52064b.c() || zU) ? z2Var.f52065c : z2Var.f52081s;
        boolean z20 = false;
        if (hVar != null) {
            aVar = aVar3;
            i11 = -1;
            Pair<Object, Long> pairB0 = B0(z3Var, hVar, true, i10, z10, dVar, bVar);
            if (pairB0 == null) {
                iF3 = z3Var.f(z10);
                jLongValue = j11;
                z17 = false;
                z18 = false;
                z19 = true;
            } else {
                if (hVar.f52038c == j.f46377b) {
                    iF3 = z3Var.m(pairB0.first, bVar).f52095d;
                    jLongValue = j11;
                    z17 = false;
                } else {
                    obj = pairB0.first;
                    jLongValue = ((Long) pairB0.second).longValue();
                    iF3 = -1;
                    z17 = true;
                }
                z18 = z2Var.f52067e == 4;
                z19 = false;
            }
            z13 = z17;
            z11 = z18;
            z12 = z19;
            i12 = iF3;
        } else {
            aVar = aVar3;
            i11 = -1;
            if (!z2Var.f52063a.x()) {
                if (z3Var.g(obj) == -1) {
                    Object objC0 = C0(dVar, bVar, i10, z10, obj, z2Var.f52063a, z3Var);
                    if (objC0 == null) {
                        iF2 = z3Var.f(z10);
                        z14 = true;
                    } else {
                        iF2 = z3Var.m(objC0, bVar).f52095d;
                        z14 = false;
                    }
                    i12 = iF2;
                    z12 = z14;
                    jLongValue = j11;
                    z11 = false;
                    z13 = false;
                } else if (j11 == j.f46377b) {
                    iF = z3Var.m(obj, bVar).f52095d;
                } else if (zU) {
                    aVar2 = aVar;
                    z2Var.f52063a.m(aVar2.f47719a, bVar);
                    if (z2Var.f52063a.u(bVar.f52095d, dVar).f52126p == z2Var.f52063a.g(aVar2.f47719a)) {
                        Pair<Object, Long> pairO = z3Var.o(dVar, bVar, z3Var.m(obj, bVar).f52095d, j11 + bVar.s());
                        obj = pairO.first;
                        jLongValue = ((Long) pairO.second).longValue();
                    } else {
                        jLongValue = j11;
                    }
                    i12 = -1;
                    z11 = false;
                    z12 = false;
                    z13 = true;
                } else {
                    aVar2 = aVar;
                    i12 = -1;
                    jLongValue = j11;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                }
                if (i12 != i11) {
                    Pair<Object, Long> pairO2 = z3Var.o(dVar, bVar, i12, j.f46377b);
                    obj = pairO2.first;
                    jLongValue = ((Long) pairO2.second).longValue();
                    j10 = -9223372036854775807L;
                } else {
                    j10 = jLongValue;
                }
                aVarA = q2Var.A(z3Var, obj, jLongValue);
                if (aVarA.f47723e != i11 || ((i13 = aVar2.f47723e) != i11 && aVarA.f47720b >= i13)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zEquals = aVar2.f47719a.equals(obj);
                if (zEquals || aVar2.c() || aVarA.c() || !z15) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                z3Var.m(obj, bVar);
                if (zEquals && !zU && j11 == j10 && ((aVarA.c() && bVar.v(aVarA.f47720b)) || (aVar2.c() && bVar.v(aVar2.f47720b)))) {
                    z20 = true;
                }
                if (z16 || z20) {
                    aVarA = aVar2;
                }
                if (aVarA.c()) {
                    if (aVarA.equals(aVar2)) {
                        jLongValue = z2Var.f52081s;
                    } else {
                        z3Var.m(aVarA.f47719a, bVar);
                        if (aVarA.f47721c == bVar.p(aVarA.f47720b)) {
                            jLongValue = bVar.k();
                        } else {
                            jLongValue = 0;
                        }
                    }
                }
                return new g(aVarA, jLongValue, j10, z11, z12, z13);
            }
            iF = z3Var.f(z10);
            i12 = iF;
            jLongValue = j11;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        aVar2 = aVar;
        if (i12 != i11) {
            Pair<Object, Long> pairO3 = z3Var.o(dVar, bVar, i12, j.f46377b);
            obj = pairO3.first;
            jLongValue = ((Long) pairO3.second).longValue();
            j10 = -9223372036854775807L;
        } else {
            j10 = jLongValue;
        }
        aVarA = q2Var.A(z3Var, obj, jLongValue);
        if (aVarA.f47723e != i11) {
            z15 = true;
        } else {
            z15 = true;
        }
        zEquals = aVar2.f47719a.equals(obj);
        if (zEquals) {
            z16 = false;
        } else {
            z16 = false;
        }
        z3Var.m(obj, bVar);
        if (zEquals) {
            z20 = true;
        }
        if (z16) {
            aVarA = aVar2;
        } else {
            aVarA = aVar2;
        }
        if (aVarA.c()) {
            if (aVarA.equals(aVar2)) {
                jLongValue = z2Var.f52081s;
            } else {
                z3Var.m(aVarA.f47719a, bVar);
                if (aVarA.f47721c == bVar.p(aVarA.f47720b)) {
                    jLongValue = bVar.k();
                } else {
                    jLongValue = 0;
                }
            }
        }
        return new g(aVarA, jLongValue, j10, z11, z12, z13);
    }

    private long B(z3 z3Var, Object obj, long j10) {
        z3Var.u(z3Var.m(obj, this.f51996m).f52095d, this.f51995l);
        z3.d dVar = this.f51995l;
        if (dVar.f52117g != j.f46377b && dVar.l()) {
            z3.d dVar2 = this.f51995l;
            if (dVar2.f52120j) {
                return com.google.android.exoplayer2.util.u0.U0(dVar2.e() - this.f51995l.f52117g) - (j10 + this.f51996m.s());
            }
        }
        return j.f46377b;
    }

    @androidx.annotation.p0
    private static Pair<Object, Long> B0(z3 z3Var, h hVar, boolean z10, int i10, boolean z11, z3.d dVar, z3.b bVar) {
        Object objC0;
        z3 z3Var2 = hVar.f52036a;
        if (z3Var.x()) {
            return null;
        }
        z3 z3Var3 = z3Var2.x() ? z3Var : z3Var2;
        try {
            Pair<Object, Long> pairO = z3Var3.o(dVar, bVar, hVar.f52037b, hVar.f52038c);
            if (z3Var.equals(z3Var3)) {
                return pairO;
            }
            if (z3Var.g(pairO.first) != -1) {
                return (z3Var3.m(pairO.first, bVar).f52098g && z3Var3.u(bVar.f52095d, dVar).f52126p == z3Var3.g(pairO.first)) ? z3Var.o(dVar, bVar, z3Var.m(pairO.first, bVar).f52095d, hVar.f52038c) : pairO;
            }
            if (z10 && (objC0 = C0(dVar, bVar, i10, z11, pairO.first, z3Var3, z3Var)) != null) {
                return z3Var.o(dVar, bVar, z3Var.m(objC0, bVar).f52095d, j.f46377b);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private long C() {
        n2 n2VarQ = this.f52003t.q();
        if (n2VarQ == null) {
            return 0L;
        }
        long jL = n2VarQ.l();
        if (!n2VarQ.f47033d) {
            return jL;
        }
        int i10 = 0;
        while (true) {
            m3[] m3VarArr = this.f51985b;
            if (i10 >= m3VarArr.length) {
                return jL;
            }
            if (S(m3VarArr[i10]) && this.f51985b[i10].k() == n2VarQ.f47032c[i10]) {
                long jL2 = this.f51985b[i10].l();
                if (jL2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(jL2, jL);
            }
            i10++;
        }
    }

    @androidx.annotation.p0
    static Object C0(z3.d dVar, z3.b bVar, int i10, boolean z10, Object obj, z3 z3Var, z3 z3Var2) {
        int iG = z3Var.g(obj);
        int iN = z3Var.n();
        int i11 = iG;
        int iG2 = -1;
        for (int i12 = 0; i12 < iN && iG2 == -1; i12++) {
            i11 = z3Var.i(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            iG2 = z3Var2.g(z3Var.t(i11));
        }
        if (iG2 == -1) {
            return null;
        }
        return z3Var2.t(iG2);
    }

    private Pair<com.google.android.exoplayer2.source.f0.a, Long> D(z3 z3Var) {
        if (z3Var.x()) {
            return Pair.create(z2.l(), 0L);
        }
        Pair<Object, Long> pairO = z3Var.o(this.f51995l, this.f51996m, z3Var.f(this.G), j.f46377b);
        com.google.android.exoplayer2.source.f0.a aVarA = this.f52003t.A(z3Var, pairO.first, 0L);
        long jLongValue = ((Long) pairO.second).longValue();
        if (aVarA.c()) {
            z3Var.m(aVarA.f47719a, this.f51996m);
            jLongValue = aVarA.f47721c == this.f51996m.p(aVarA.f47720b) ? this.f51996m.k() : 0L;
        }
        return Pair.create(aVarA, Long.valueOf(jLongValue));
    }

    private void D0(long j10, long j11) {
        this.f51992i.n(2);
        this.f51992i.m(2, j10 + j11);
    }

    private long F() {
        return G(this.f52008y.f52079q);
    }

    private void F0(boolean z10) throws ExoPlaybackException {
        com.google.android.exoplayer2.source.f0.a aVar = this.f52003t.p().f47035f.f47048a;
        long jI0 = I0(aVar, this.f52008y.f52081s, true, false);
        if (jI0 != this.f52008y.f52081s) {
            z2 z2Var = this.f52008y;
            this.f52008y = O(aVar, jI0, z2Var.f52065c, z2Var.f52066d, z10, 5);
        }
    }

    private long G(long j10) {
        n2 n2VarJ = this.f52003t.j();
        if (n2VarJ == null) {
            return 0L;
        }
        return Math.max(0L, j10 - n2VarJ.y(this.M));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2 A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1 A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    private void G0(h hVar) throws Throwable {
        long jLongValue;
        long j10;
        boolean z10;
        com.google.android.exoplayer2.source.f0.a aVar;
        long jK;
        long j11;
        long j12;
        long jH;
        boolean z11;
        long jH0;
        boolean z12;
        long j13;
        n2 n2VarP;
        z2 z2Var;
        int i10;
        this.f52009z.b(1);
        Pair<Object, Long> pairB0 = B0(this.f52008y.f52063a, hVar, true, this.F, this.G, this.f51995l, this.f51996m);
        try {
            if (pairB0 != null) {
                Object obj = pairB0.first;
                jLongValue = ((Long) pairB0.second).longValue();
                long j14 = hVar.f52038c == j.f46377b ? -9223372036854775807L : jLongValue;
                com.google.android.exoplayer2.source.f0.a aVarA = this.f52003t.A(this.f52008y.f52063a, obj, jLongValue);
                if (aVarA.c()) {
                    this.f52008y.f52063a.m(aVarA.f47719a, this.f51996m);
                    jK = this.f51996m.p(aVarA.f47720b) == aVarA.f47721c ? this.f51996m.k() : 0L;
                    j11 = j14;
                    aVar = aVarA;
                    z10 = true;
                } else {
                    j10 = j14;
                    z10 = hVar.f52038c == j.f46377b;
                    aVar = aVarA;
                }
                if (this.f52008y.f52063a.x()) {
                    if (pairB0 == null) {
                        if (this.f52008y.f52067e != 1) {
                            h1(4);
                        }
                        u0(false, true, false, true);
                    } else {
                        if (aVar.equals(this.f52008y.f52064b)) {
                            n2VarP = this.f52003t.p();
                            if (n2VarP == null && n2VarP.f47033d && jK != 0) {
                                jH = n2VarP.f47030a.h(jK, this.f52007x);
                            } else {
                                jH = jK;
                            }
                            if (com.google.android.exoplayer2.util.u0.B1(jH) == com.google.android.exoplayer2.util.u0.B1(this.f52008y.f52081s) && ((i10 = (z2Var = this.f52008y).f52067e) == 2 || i10 == 3)) {
                                long j15 = z2Var.f52081s;
                                this.f52008y = O(aVar, j15, j11, j15, z10, 2);
                                return;
                            }
                        } else {
                            jH = jK;
                        }
                        if (this.f52008y.f52067e == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        jH0 = H0(aVar, jH, z11);
                        z12 = (jK != jH0) | z10;
                        try {
                            z2 z2Var2 = this.f52008y;
                            z3 z3Var = z2Var2.f52063a;
                            s1(z3Var, aVar, z3Var, z2Var2.f52064b, j11);
                            z10 = z12;
                            j13 = jH0;
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = z12;
                            j12 = jH0;
                            this.f52008y = O(aVar, j12, j11, j12, z10, 2);
                            throw th;
                        }
                    }
                    this.f52008y = O(aVar, j13, j11, j13, z10, 2);
                    return;
                }
                this.L = hVar;
                j13 = jK;
                this.f52008y = O(aVar, j13, j11, j13, z10, 2);
                return;
            }
            Pair<com.google.android.exoplayer2.source.f0.a, Long> pairD = D(this.f52008y.f52063a);
            aVar = (com.google.android.exoplayer2.source.f0.a) pairD.first;
            jLongValue = ((Long) pairD.second).longValue();
            z10 = !this.f52008y.f52063a.x();
            j10 = -9223372036854775807L;
            if (this.f52008y.f52063a.x()) {
                if (pairB0 == null) {
                    if (this.f52008y.f52067e != 1) {
                        h1(4);
                    }
                    u0(false, true, false, true);
                } else {
                    if (aVar.equals(this.f52008y.f52064b)) {
                        n2VarP = this.f52003t.p();
                        if (n2VarP == null) {
                            jH = jK;
                        } else {
                            jH = jK;
                        }
                        if (com.google.android.exoplayer2.util.u0.B1(jH) == com.google.android.exoplayer2.util.u0.B1(this.f52008y.f52081s)) {
                            long j16 = z2Var.f52081s;
                            this.f52008y = O(aVar, j16, j11, j16, z10, 2);
                            return;
                        }
                    } else {
                        jH = jK;
                    }
                    if (this.f52008y.f52067e == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jH0 = H0(aVar, jH, z11);
                    z12 = (jK != jH0) | z10;
                    z2 z2Var3 = this.f52008y;
                    z3 z3Var2 = z2Var3.f52063a;
                    s1(z3Var2, aVar, z3Var2, z2Var3.f52064b, j11);
                    z10 = z12;
                    j13 = jH0;
                }
                this.f52008y = O(aVar, j13, j11, j13, z10, 2);
                return;
            }
            this.L = hVar;
            j13 = jK;
            this.f52008y = O(aVar, j13, j11, j13, z10, 2);
            return;
        } catch (Throwable th3) {
            th = th3;
            j12 = jK;
        }
        jK = jLongValue;
        j11 = j10;
    }

    private void H(com.google.android.exoplayer2.source.c0 c0Var) {
        if (this.f52003t.v(c0Var)) {
            this.f52003t.y(this.M);
            X();
        }
    }

    private long H0(com.google.android.exoplayer2.source.f0.a aVar, long j10, boolean z10) throws ExoPlaybackException {
        return I0(aVar, j10, this.f52003t.p() != this.f52003t.q(), z10);
    }

    private void I(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackExceptionM = ExoPlaybackException.m(iOException, i10);
        n2 n2VarP = this.f52003t.p();
        if (n2VarP != null) {
            exoPlaybackExceptionM = exoPlaybackExceptionM.j(n2VarP.f47035f.f47048a);
        }
        com.google.android.exoplayer2.util.u.e(R, "Playback error", exoPlaybackExceptionM);
        p1(false, false);
        this.f52008y = this.f52008y.f(exoPlaybackExceptionM);
    }

    private long I0(com.google.android.exoplayer2.source.f0.a aVar, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        q1();
        this.D = false;
        if (z11 || this.f52008y.f52067e == 3) {
            h1(2);
        }
        n2 n2VarP = this.f52003t.p();
        n2 n2VarJ = n2VarP;
        while (n2VarJ != null && !aVar.equals(n2VarJ.f47035f.f47048a)) {
            n2VarJ = n2VarJ.j();
        }
        if (z10 || n2VarP != n2VarJ || (n2VarJ != null && n2VarJ.z(j10) < 0)) {
            for (m3 m3Var : this.f51985b) {
                o(m3Var);
            }
            if (n2VarJ != null) {
                while (this.f52003t.p() != n2VarJ) {
                    this.f52003t.b();
                }
                this.f52003t.z(n2VarJ);
                n2VarJ.x(q2.f47326n);
                t();
            }
        }
        if (n2VarJ != null) {
            this.f52003t.z(n2VarJ);
            if (!n2VarJ.f47033d) {
                n2VarJ.f47035f = n2VarJ.f47035f.b(j10);
            } else if (n2VarJ.f47034e) {
                long j11 = n2VarJ.f47030a.j(j10);
                n2VarJ.f47030a.v(j11 - this.f51997n, this.f51998o);
                j10 = j11;
            }
            w0(j10);
            X();
        } else {
            this.f52003t.f();
            w0(j10);
        }
        J(false);
        this.f51992i.l(2);
        return j10;
    }

    private void J(boolean z10) {
        n2 n2VarJ = this.f52003t.j();
        com.google.android.exoplayer2.source.f0.a aVar = n2VarJ == null ? this.f52008y.f52064b : n2VarJ.f47035f.f47048a;
        boolean z11 = !this.f52008y.f52073k.equals(aVar);
        if (z11) {
            this.f52008y = this.f52008y.b(aVar);
        }
        z2 z2Var = this.f52008y;
        z2Var.f52079q = n2VarJ == null ? z2Var.f52081s : n2VarJ.i();
        this.f52008y.f52080r = F();
        if ((z11 || z10) && n2VarJ != null && n2VarJ.f47033d) {
            t1(n2VarJ.n(), n2VarJ.o());
        }
    }

    private void J0(h3 h3Var) throws ExoPlaybackException {
        if (h3Var.h() == j.f46377b) {
            K0(h3Var);
            return;
        }
        if (this.f52008y.f52063a.x()) {
            this.f52000q.add(new d(h3Var));
            return;
        }
        d dVar = new d(h3Var);
        z3 z3Var = this.f52008y.f52063a;
        if (!y0(dVar, z3Var, z3Var, this.F, this.G, this.f51995l, this.f51996m)) {
            h3Var.m(false);
        } else {
            this.f52000q.add(dVar);
            Collections.sort(this.f52000q);
        }
    }

    private void K(z3 z3Var, boolean z10) throws Throwable {
        int i10;
        int i11;
        boolean z11;
        g gVarA0 = A0(z3Var, this.f52008y, this.L, this.f52003t, this.F, this.G, this.f51995l, this.f51996m);
        com.google.android.exoplayer2.source.f0.a aVar = gVarA0.f52030a;
        long j10 = gVarA0.f52032c;
        boolean z12 = gVarA0.f52033d;
        long jH0 = gVarA0.f52031b;
        boolean z13 = (this.f52008y.f52064b.equals(aVar) && jH0 == this.f52008y.f52081s) ? false : true;
        h hVar = null;
        long j11 = j.f46377b;
        try {
            if (gVarA0.f52034e) {
                if (this.f52008y.f52067e != 1) {
                    h1(4);
                }
                u0(false, false, false, true);
            }
            try {
                if (z13) {
                    i11 = 4;
                    z11 = false;
                    if (!z3Var.x()) {
                        for (n2 n2VarP = this.f52003t.p(); n2VarP != null; n2VarP = n2VarP.j()) {
                            if (n2VarP.f47035f.f47048a.equals(aVar)) {
                                n2VarP.f47035f = this.f52003t.r(z3Var, n2VarP.f47035f);
                                n2VarP.A();
                            }
                        }
                        jH0 = H0(aVar, jH0, z12);
                    }
                } else {
                    try {
                        i11 = 4;
                        z11 = false;
                        if (!this.f52003t.F(z3Var, this.M, C())) {
                            F0(false);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i10 = 4;
                        z2 z2Var = this.f52008y;
                        z3 z3Var2 = z2Var.f52063a;
                        com.google.android.exoplayer2.source.f0.a aVar2 = z2Var.f52064b;
                        if (gVarA0.f52035f) {
                            j11 = jH0;
                        }
                        h hVar2 = hVar;
                        s1(z3Var, aVar, z3Var2, aVar2, j11);
                        if (z13 || j10 != this.f52008y.f52065c) {
                            z2 z2Var2 = this.f52008y;
                            Object obj = z2Var2.f52064b.f47719a;
                            z3 z3Var3 = z2Var2.f52063a;
                            this.f52008y = O(aVar, jH0, j10, this.f52008y.f52066d, z13 && z10 && !z3Var3.x() && !z3Var3.m(obj, this.f51996m).f52098g, z3Var.g(obj) == -1 ? i10 : 3);
                        }
                        v0();
                        z0(z3Var, this.f52008y.f52063a);
                        this.f52008y = this.f52008y.j(z3Var);
                        if (!z3Var.x()) {
                            this.L = hVar2;
                        }
                        J(false);
                        throw th;
                    }
                }
                z2 z2Var3 = this.f52008y;
                s1(z3Var, aVar, z2Var3.f52063a, z2Var3.f52064b, gVarA0.f52035f ? jH0 : -9223372036854775807L);
                if (z13 || j10 != this.f52008y.f52065c) {
                    z2 z2Var4 = this.f52008y;
                    Object obj2 = z2Var4.f52064b.f47719a;
                    z3 z3Var4 = z2Var4.f52063a;
                    this.f52008y = O(aVar, jH0, j10, this.f52008y.f52066d, (!z13 || !z10 || z3Var4.x() || z3Var4.m(obj2, this.f51996m).f52098g) ? z11 : true, z3Var.g(obj2) == -1 ? i11 : 3);
                }
                v0();
                z0(z3Var, this.f52008y.f52063a);
                this.f52008y = this.f52008y.j(z3Var);
                if (!z3Var.x()) {
                    this.L = null;
                }
                J(z11);
            } catch (Throwable th3) {
                th = th3;
                hVar = null;
            }
        } catch (Throwable th4) {
            th = th4;
            i10 = 4;
        }
    }

    private void K0(h3 h3Var) throws ExoPlaybackException {
        if (h3Var.e() != this.f51994k) {
            this.f51992i.e(15, h3Var).a();
            return;
        }
        m(h3Var);
        int i10 = this.f52008y.f52067e;
        if (i10 == 3 || i10 == 2) {
            this.f51992i.l(2);
        }
    }

    private void L(com.google.android.exoplayer2.source.c0 c0Var) throws ExoPlaybackException {
        if (this.f52003t.v(c0Var)) {
            n2 n2VarJ = this.f52003t.j();
            n2VarJ.p(this.f51999p.g().f44371b, this.f52008y.f52063a);
            t1(n2VarJ.n(), n2VarJ.o());
            if (n2VarJ == this.f52003t.p()) {
                w0(n2VarJ.f47035f.f47049b);
                t();
                z2 z2Var = this.f52008y;
                com.google.android.exoplayer2.source.f0.a aVar = z2Var.f52064b;
                long j10 = n2VarJ.f47035f.f47049b;
                this.f52008y = O(aVar, j10, z2Var.f52065c, j10, false, 5);
            }
            X();
        }
    }

    private void L0(final h3 h3Var) {
        Looper looperE = h3Var.e();
        if (looperE.getThread().isAlive()) {
            this.f52001r.e(looperE, null).k(new Runnable() { // from class: com.google.android.exoplayer2.v1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51655b.W(h3Var);
                }
            });
        } else {
            com.google.android.exoplayer2.util.u.m("TAG", "Trying to send message on a dead thread.");
            h3Var.m(false);
        }
    }

    private void M(b3 b3Var, float f10, boolean z10, boolean z11) throws ExoPlaybackException {
        if (z10) {
            if (z11) {
                this.f52009z.b(1);
            }
            this.f52008y = this.f52008y.g(b3Var);
        }
        w1(b3Var.f44371b);
        for (m3 m3Var : this.f51985b) {
            if (m3Var != null) {
                m3Var.t(f10, b3Var.f44371b);
            }
        }
    }

    private void M0(long j10) {
        for (m3 m3Var : this.f51985b) {
            if (m3Var.k() != null) {
                N0(m3Var, j10);
            }
        }
    }

    private void N(b3 b3Var, boolean z10) throws ExoPlaybackException {
        M(b3Var, b3Var.f44371b, true, z10);
    }

    private void N0(m3 m3Var, long j10) {
        m3Var.o();
        if (m3Var instanceof com.google.android.exoplayer2.text.n) {
            ((com.google.android.exoplayer2.text.n) m3Var).V(j10);
        }
    }

    @androidx.annotation.j
    private z2 O(com.google.android.exoplayer2.source.f0.a aVar, long j10, long j11, long j12, boolean z10, int i10) {
        List<Metadata> listB;
        com.google.android.exoplayer2.source.p1 p1Var;
        com.google.android.exoplayer2.trackselection.x xVar;
        this.O = (!this.O && j10 == this.f52008y.f52081s && aVar.equals(this.f52008y.f52064b)) ? false : true;
        v0();
        z2 z2Var = this.f52008y;
        com.google.android.exoplayer2.source.p1 p1Var2 = z2Var.f52070h;
        com.google.android.exoplayer2.trackselection.x xVar2 = z2Var.f52071i;
        List<Metadata> list = z2Var.f52072j;
        if (this.f52004u.t()) {
            n2 n2VarP = this.f52003t.p();
            com.google.android.exoplayer2.source.p1 p1VarN = n2VarP == null ? com.google.android.exoplayer2.source.p1.f48606e : n2VarP.n();
            com.google.android.exoplayer2.trackselection.x xVarO = n2VarP == null ? this.f51989f : n2VarP.o();
            ImmutableList<Metadata> immutableListY = y(xVarO.f50192c);
            if (n2VarP != null) {
                o2 o2Var = n2VarP.f47035f;
                if (o2Var.f47050c != j11) {
                    n2VarP.f47035f = o2Var.a(j11);
                }
            }
            p1Var = p1VarN;
            xVar = xVarO;
            listB = immutableListY;
        } else if (aVar.equals(this.f52008y.f52064b)) {
            listB = list;
            p1Var = p1Var2;
            xVar = xVar2;
        } else {
            p1Var = com.google.android.exoplayer2.source.p1.f48606e;
            xVar = this.f51989f;
            listB = ImmutableList.B();
        }
        if (z10) {
            this.f52009z.e(i10);
        }
        return this.f52008y.c(aVar, j10, j11, j12, F(), p1Var, xVar, listB);
    }

    private boolean P(m3 m3Var, n2 n2Var) {
        n2 n2VarJ = n2Var.j();
        return n2Var.f47035f.f47053f && n2VarJ.f47033d && ((m3Var instanceof com.google.android.exoplayer2.text.n) || m3Var.l() >= n2VarJ.m());
    }

    private void P0(boolean z10, @androidx.annotation.p0 AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (m3 m3Var : this.f51985b) {
                    if (!S(m3Var) && this.f51986c.remove(m3Var)) {
                        m3Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private boolean Q() {
        n2 n2VarQ = this.f52003t.q();
        if (!n2VarQ.f47033d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            m3[] m3VarArr = this.f51985b;
            if (i10 >= m3VarArr.length) {
                return true;
            }
            m3 m3Var = m3VarArr[i10];
            com.google.android.exoplayer2.source.d1 d1Var = n2VarQ.f47032c[i10];
            if (m3Var.k() != d1Var || (d1Var != null && !m3Var.f() && !P(m3Var, n2VarQ))) {
                return false;
            }
            i10++;
        }
    }

    private void Q0(b bVar) throws Throwable {
        this.f52009z.b(1);
        if (bVar.f52013c != -1) {
            this.L = new h(new i3(bVar.f52011a, bVar.f52012b), bVar.f52013c, bVar.f52014d);
        }
        K(this.f52004u.E(bVar.f52011a, bVar.f52012b), false);
    }

    private boolean R() {
        n2 n2VarJ = this.f52003t.j();
        return (n2VarJ == null || n2VarJ.k() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean S(m3 m3Var) {
        return m3Var.getState() != 0;
    }

    private void S0(boolean z10) {
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        z2 z2Var = this.f52008y;
        int i10 = z2Var.f52067e;
        if (z10 || i10 == 4 || i10 == 1) {
            this.f52008y = z2Var.d(z10);
        } else {
            this.f51992i.l(2);
        }
    }

    private boolean T() {
        n2 n2VarP = this.f52003t.p();
        long j10 = n2VarP.f47035f.f47052e;
        return n2VarP.f47033d && (j10 == j.f46377b || this.f52008y.f52081s < j10 || !k1());
    }

    private static boolean U(z2 z2Var, z3.b bVar) {
        com.google.android.exoplayer2.source.f0.a aVar = z2Var.f52064b;
        z3 z3Var = z2Var.f52063a;
        return z3Var.x() || z3Var.m(aVar.f47719a, bVar).f52098g;
    }

    private void U0(boolean z10) throws ExoPlaybackException {
        this.B = z10;
        v0();
        if (!this.C || this.f52003t.q() == this.f52003t.p()) {
            return;
        }
        F0(true);
        J(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean V() {
        return Boolean.valueOf(this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(h3 h3Var) {
        try {
            m(h3Var);
        } catch (ExoPlaybackException e10) {
            com.google.android.exoplayer2.util.u.e(R, "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void W0(boolean z10, int i10, boolean z11, int i11) throws ExoPlaybackException {
        this.f52009z.b(z11 ? 1 : 0);
        this.f52009z.c(i11);
        this.f52008y = this.f52008y.e(z10, i10);
        this.D = false;
        j0(z10);
        if (!k1()) {
            q1();
            v1();
            return;
        }
        int i12 = this.f52008y.f52067e;
        if (i12 == 3) {
            n1();
            this.f51992i.l(2);
        } else if (i12 == 2) {
            this.f51992i.l(2);
        }
    }

    private void X() {
        boolean zJ1 = j1();
        this.E = zJ1;
        if (zJ1) {
            this.f52003t.j().d(this.M);
        }
        r1();
    }

    private void Y() {
        this.f52009z.d(this.f52008y);
        if (this.f52009z.f52023a) {
            this.f52002s.a(this.f52009z);
            this.f52009z = new e(this.f52008y);
        }
    }

    private void Y0(b3 b3Var) throws ExoPlaybackException {
        this.f51999p.e(b3Var);
        N(this.f51999p.g(), true);
    }

    private boolean Z(long j10, long j11) {
        if (this.J && this.I) {
            return false;
        }
        D0(j10, j11);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0074, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a0(long r8, long r10) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.x1.a0(long, long):void");
    }

    private void a1(int i10) throws ExoPlaybackException {
        this.F = i10;
        if (!this.f52003t.G(this.f52008y.f52063a, i10)) {
            F0(true);
        }
        J(false);
    }

    private void b0() throws ExoPlaybackException {
        o2 o2VarO;
        this.f52003t.y(this.M);
        if (this.f52003t.D() && (o2VarO = this.f52003t.o(this.M, this.f52008y)) != null) {
            n2 n2VarG = this.f52003t.g(this.f51987d, this.f51988e, this.f51990g.j(), this.f52004u, o2VarO, this.f51989f);
            n2VarG.f47030a.r(this, o2VarO.f47049b);
            if (this.f52003t.p() == n2VarG) {
                w0(o2VarO.f47049b);
            }
            J(false);
        }
        if (!this.E) {
            X();
        } else {
            this.E = R();
            r1();
        }
    }

    private void c0() throws ExoPlaybackException {
        boolean z10 = false;
        while (i1()) {
            if (z10) {
                Y();
            }
            n2 n2VarP = this.f52003t.p();
            n2 n2VarB = this.f52003t.b();
            o2 o2Var = n2VarB.f47035f;
            com.google.android.exoplayer2.source.f0.a aVar = o2Var.f47048a;
            long j10 = o2Var.f47049b;
            z2 z2VarO = O(aVar, j10, o2Var.f47050c, j10, true, 0);
            this.f52008y = z2VarO;
            z3 z3Var = z2VarO.f52063a;
            s1(z3Var, n2VarB.f47035f.f47048a, z3Var, n2VarP.f47035f.f47048a, j.f46377b);
            v0();
            v1();
            z10 = true;
        }
    }

    private void c1(r3 r3Var) {
        this.f52007x = r3Var;
    }

    private void d0() {
        n2 n2VarQ = this.f52003t.q();
        if (n2VarQ == null) {
            return;
        }
        int i10 = 0;
        if (n2VarQ.j() != null && !this.C) {
            if (Q()) {
                if (n2VarQ.j().f47033d || this.M >= n2VarQ.j().m()) {
                    com.google.android.exoplayer2.trackselection.x xVarO = n2VarQ.o();
                    n2 n2VarC = this.f52003t.c();
                    com.google.android.exoplayer2.trackselection.x xVarO2 = n2VarC.o();
                    if (n2VarC.f47033d && n2VarC.f47030a.k() != j.f46377b) {
                        M0(n2VarC.m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f51985b.length; i11++) {
                        boolean zC = xVarO.c(i11);
                        boolean zC2 = xVarO2.c(i11);
                        if (zC && !this.f51985b[i11].i()) {
                            boolean z10 = this.f51987d[i11].d() == -2;
                            p3 p3Var = xVarO.f50191b[i11];
                            p3 p3Var2 = xVarO2.f50191b[i11];
                            if (!zC2 || !p3Var2.equals(p3Var) || z10) {
                                N0(this.f51985b[i11], n2VarC.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!n2VarQ.f47035f.f47056i && !this.C) {
            return;
        }
        while (true) {
            m3[] m3VarArr = this.f51985b;
            if (i10 >= m3VarArr.length) {
                return;
            }
            m3 m3Var = m3VarArr[i10];
            com.google.android.exoplayer2.source.d1 d1Var = n2VarQ.f47032c[i10];
            if (d1Var != null && m3Var.k() == d1Var && m3Var.f()) {
                long j10 = n2VarQ.f47035f.f47052e;
                N0(m3Var, (j10 == j.f46377b || j10 == Long.MIN_VALUE) ? -9223372036854775807L : n2VarQ.l() + n2VarQ.f47035f.f47052e);
            }
            i10++;
        }
    }

    private void e0() throws ExoPlaybackException {
        n2 n2VarQ = this.f52003t.q();
        if (n2VarQ == null || this.f52003t.p() == n2VarQ || n2VarQ.f47036g || !s0()) {
            return;
        }
        t();
    }

    private void e1(boolean z10) throws ExoPlaybackException {
        this.G = z10;
        if (!this.f52003t.H(this.f52008y.f52063a, z10)) {
            F0(true);
        }
        J(false);
    }

    private void f0() throws Throwable {
        K(this.f52004u.j(), true);
    }

    private void g0(c cVar) throws Throwable {
        this.f52009z.b(1);
        K(this.f52004u.x(cVar.f52015a, cVar.f52016b, cVar.f52017c, cVar.f52018d), false);
    }

    private void g1(com.google.android.exoplayer2.source.f1 f1Var) throws Throwable {
        this.f52009z.b(1);
        K(this.f52004u.F(f1Var), false);
    }

    private void h1(int i10) {
        z2 z2Var = this.f52008y;
        if (z2Var.f52067e != i10) {
            this.f52008y = z2Var.h(i10);
        }
    }

    private void i0() {
        for (n2 n2VarP = this.f52003t.p(); n2VarP != null; n2VarP = n2VarP.j()) {
            for (com.google.android.exoplayer2.trackselection.j jVar : n2VarP.o().f50192c) {
                if (jVar != null) {
                    jVar.f();
                }
            }
        }
    }

    private boolean i1() {
        n2 n2VarP;
        n2 n2VarJ;
        return k1() && !this.C && (n2VarP = this.f52003t.p()) != null && (n2VarJ = n2VarP.j()) != null && this.M >= n2VarJ.m() && n2VarJ.f47036g;
    }

    private void j(b bVar, int i10) throws Throwable {
        this.f52009z.b(1);
        t2 t2Var = this.f52004u;
        if (i10 == -1) {
            i10 = t2Var.r();
        }
        K(t2Var.f(i10, bVar.f52011a, bVar.f52012b), false);
    }

    private void j0(boolean z10) {
        for (n2 n2VarP = this.f52003t.p(); n2VarP != null; n2VarP = n2VarP.j()) {
            for (com.google.android.exoplayer2.trackselection.j jVar : n2VarP.o().f50192c) {
                if (jVar != null) {
                    jVar.s(z10);
                }
            }
        }
    }

    private boolean j1() {
        if (!R()) {
            return false;
        }
        n2 n2VarJ = this.f52003t.j();
        return this.f51990g.g(n2VarJ == this.f52003t.p() ? n2VarJ.y(this.M) : n2VarJ.y(this.M) - n2VarJ.f47035f.f47049b, G(n2VarJ.k()), this.f51999p.g().f44371b);
    }

    private void k0() {
        for (n2 n2VarP = this.f52003t.p(); n2VarP != null; n2VarP = n2VarP.j()) {
            for (com.google.android.exoplayer2.trackselection.j jVar : n2VarP.o().f50192c) {
                if (jVar != null) {
                    jVar.n();
                }
            }
        }
    }

    private boolean k1() {
        z2 z2Var = this.f52008y;
        return z2Var.f52074l && z2Var.f52075m == 0;
    }

    private void l() throws ExoPlaybackException {
        F0(true);
    }

    private boolean l1(boolean z10) {
        if (this.K == 0) {
            return T();
        }
        if (!z10) {
            return false;
        }
        z2 z2Var = this.f52008y;
        if (!z2Var.f52069g) {
            return true;
        }
        long jC = m1(z2Var.f52063a, this.f52003t.p().f47035f.f47048a) ? this.f52005v.c() : j.f46377b;
        n2 n2VarJ = this.f52003t.j();
        return (n2VarJ.q() && n2VarJ.f47035f.f47056i) || (n2VarJ.f47035f.f47048a.c() && !n2VarJ.f47033d) || this.f51990g.i(F(), this.f51999p.g().f44371b, this.D, jC);
    }

    private void m(h3 h3Var) throws ExoPlaybackException {
        if (h3Var.l()) {
            return;
        }
        try {
            h3Var.i().h(h3Var.k(), h3Var.g());
        } finally {
            h3Var.m(true);
        }
    }

    private boolean m1(z3 z3Var, com.google.android.exoplayer2.source.f0.a aVar) {
        if (aVar.c() || z3Var.x()) {
            return false;
        }
        z3Var.u(z3Var.m(aVar.f47719a, this.f51996m).f52095d, this.f51995l);
        if (!this.f51995l.l()) {
            return false;
        }
        z3.d dVar = this.f51995l;
        return dVar.f52120j && dVar.f52117g != j.f46377b;
    }

    private void n0() {
        this.f52009z.b(1);
        u0(false, false, false, true);
        this.f51990g.c();
        h1(this.f52008y.f52063a.x() ? 4 : 2);
        this.f52004u.y(this.f51991h.g());
        this.f51992i.l(2);
    }

    private void n1() throws ExoPlaybackException {
        this.D = false;
        this.f51999p.f();
        for (m3 m3Var : this.f51985b) {
            if (S(m3Var)) {
                m3Var.start();
            }
        }
    }

    private void o(m3 m3Var) throws ExoPlaybackException {
        if (S(m3Var)) {
            this.f51999p.a(m3Var);
            v(m3Var);
            m3Var.c();
            this.K--;
        }
    }

    private void p0() {
        u0(true, false, true, false);
        this.f51990g.f();
        h1(1);
        this.f51993j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    private void p1(boolean z10, boolean z11) {
        u0(z10 || !this.H, false, true, false);
        this.f52009z.b(z11 ? 1 : 0);
        this.f51990g.k();
        h1(1);
    }

    private void q0(int i10, int i11, com.google.android.exoplayer2.source.f1 f1Var) throws Throwable {
        this.f52009z.b(1);
        K(this.f52004u.C(i10, i11, f1Var), false);
    }

    private void q1() throws ExoPlaybackException {
        this.f51999p.h();
        for (m3 m3Var : this.f51985b) {
            if (S(m3Var)) {
                v(m3Var);
            }
        }
    }

    private void r() throws ExoPlaybackException, IOException {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        long jC = this.f52001r.c();
        u1();
        int i11 = this.f52008y.f52067e;
        if (i11 == 1 || i11 == 4) {
            this.f51992i.n(2);
            return;
        }
        n2 n2VarP = this.f52003t.p();
        if (n2VarP == null) {
            D0(jC, 10L);
            return;
        }
        com.google.android.exoplayer2.util.o0.a("doSomeWork");
        v1();
        if (n2VarP.f47033d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            n2VarP.f47030a.v(this.f52008y.f52081s - this.f51997n, this.f51998o);
            z10 = true;
            z11 = true;
            int i12 = 0;
            while (true) {
                m3[] m3VarArr = this.f51985b;
                if (i12 >= m3VarArr.length) {
                    break;
                }
                m3 m3Var = m3VarArr[i12];
                if (S(m3Var)) {
                    m3Var.j(this.M, jElapsedRealtime);
                    z10 = z10 && m3Var.b();
                    boolean z13 = n2VarP.f47032c[i12] != m3Var.k();
                    boolean z14 = z13 || (!z13 && m3Var.f()) || m3Var.isReady() || m3Var.b();
                    z11 = z11 && z14;
                    if (!z14) {
                        m3Var.p();
                    }
                }
                i12++;
            }
        } else {
            n2VarP.f47030a.u();
            z10 = true;
            z11 = true;
        }
        long j10 = n2VarP.f47035f.f47052e;
        boolean z15 = z10 && n2VarP.f47033d && (j10 == j.f46377b || j10 <= this.f52008y.f52081s);
        if (z15 && this.C) {
            this.C = false;
            W0(false, this.f52008y.f52075m, false, 5);
        }
        if (z15 && n2VarP.f47035f.f47056i) {
            h1(4);
            q1();
        } else if (this.f52008y.f52067e == 2 && l1(z11)) {
            h1(3);
            this.P = null;
            if (k1()) {
                n1();
            }
        } else if (this.f52008y.f52067e == 3 && (this.K != 0 ? !z11 : !T())) {
            this.D = k1();
            h1(2);
            if (this.D) {
                k0();
                this.f52005v.d();
            }
            q1();
        }
        if (this.f52008y.f52067e == 2) {
            int i13 = 0;
            while (true) {
                m3[] m3VarArr2 = this.f51985b;
                if (i13 >= m3VarArr2.length) {
                    break;
                }
                if (S(m3VarArr2[i13]) && this.f51985b[i13].k() == n2VarP.f47032c[i13]) {
                    this.f51985b[i13].p();
                }
                i13++;
            }
            z2 z2Var = this.f52008y;
            if (!z2Var.f52069g && z2Var.f52080r < 500000 && R()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z16 = this.J;
        z2 z2Var2 = this.f52008y;
        if (z16 != z2Var2.f52077o) {
            this.f52008y = z2Var2.d(z16);
        }
        if ((k1() && this.f52008y.f52067e == 3) || (i10 = this.f52008y.f52067e) == 2) {
            z12 = !Z(jC, 10L);
        } else {
            if (this.K == 0 || i10 == 4) {
                this.f51992i.n(2);
            } else {
                D0(jC, 1000L);
            }
            z12 = false;
        }
        z2 z2Var3 = this.f52008y;
        if (z2Var3.f52078p != z12) {
            this.f52008y = z2Var3.i(z12);
        }
        this.I = false;
        com.google.android.exoplayer2.util.o0.c();
    }

    private void r1() {
        n2 n2VarJ = this.f52003t.j();
        boolean z10 = this.E || (n2VarJ != null && n2VarJ.f47030a.a());
        z2 z2Var = this.f52008y;
        if (z10 != z2Var.f52069g) {
            this.f52008y = z2Var.a(z10);
        }
    }

    private void s(int i10, boolean z10) throws ExoPlaybackException {
        m3 m3Var = this.f51985b[i10];
        if (S(m3Var)) {
            return;
        }
        n2 n2VarQ = this.f52003t.q();
        boolean z11 = n2VarQ == this.f52003t.p();
        com.google.android.exoplayer2.trackselection.x xVarO = n2VarQ.o();
        p3 p3Var = xVarO.f50191b[i10];
        a2[] a2VarArrA = A(xVarO.f50192c[i10]);
        boolean z12 = k1() && this.f52008y.f52067e == 3;
        boolean z13 = !z10 && z12;
        this.K++;
        this.f51986c.add(m3Var);
        m3Var.u(p3Var, a2VarArrA, n2VarQ.f47032c[i10], this.M, z13, z11, n2VarQ.m(), n2VarQ.l());
        m3Var.h(11, new a());
        this.f51999p.b(m3Var);
        if (z12) {
            m3Var.start();
        }
    }

    private boolean s0() throws ExoPlaybackException {
        n2 n2VarQ = this.f52003t.q();
        com.google.android.exoplayer2.trackselection.x xVarO = n2VarQ.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            m3[] m3VarArr = this.f51985b;
            if (i10 >= m3VarArr.length) {
                return !z10;
            }
            m3 m3Var = m3VarArr[i10];
            if (S(m3Var)) {
                boolean z11 = m3Var.k() != n2VarQ.f47032c[i10];
                if (!xVarO.c(i10) || z11) {
                    if (!m3Var.i()) {
                        m3Var.q(A(xVarO.f50192c[i10]), n2VarQ.f47032c[i10], n2VarQ.m(), n2VarQ.l());
                    } else if (m3Var.b()) {
                        o(m3Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void s1(z3 z3Var, com.google.android.exoplayer2.source.f0.a aVar, z3 z3Var2, com.google.android.exoplayer2.source.f0.a aVar2, long j10) {
        if (z3Var.x() || !m1(z3Var, aVar)) {
            float f10 = this.f51999p.g().f44371b;
            b3 b3Var = this.f52008y.f52076n;
            if (f10 != b3Var.f44371b) {
                this.f51999p.e(b3Var);
                return;
            }
            return;
        }
        z3Var.u(z3Var.m(aVar.f47719a, this.f51996m).f52095d, this.f51995l);
        this.f52005v.a((i2.g) com.google.android.exoplayer2.util.u0.k(this.f51995l.f52122l));
        if (j10 != j.f46377b) {
            this.f52005v.e(B(z3Var, aVar.f47719a, j10));
            return;
        }
        if (com.google.android.exoplayer2.util.u0.c(z3Var2.x() ? null : z3Var2.u(z3Var2.m(aVar2.f47719a, this.f51996m).f52095d, this.f51995l).f52112b, this.f51995l.f52112b)) {
            return;
        }
        this.f52005v.e(j.f46377b);
    }

    private void t() throws ExoPlaybackException {
        u(new boolean[this.f51985b.length]);
    }

    private void t0() throws ExoPlaybackException {
        float f10 = this.f51999p.g().f44371b;
        n2 n2VarQ = this.f52003t.q();
        boolean z10 = true;
        for (n2 n2VarP = this.f52003t.p(); n2VarP != null && n2VarP.f47033d; n2VarP = n2VarP.j()) {
            com.google.android.exoplayer2.trackselection.x xVarV = n2VarP.v(f10, this.f52008y.f52063a);
            if (!xVarV.a(n2VarP.o())) {
                if (z10) {
                    n2 n2VarP2 = this.f52003t.p();
                    boolean z11 = this.f52003t.z(n2VarP2);
                    boolean[] zArr = new boolean[this.f51985b.length];
                    long jB = n2VarP2.b(xVarV, this.f52008y.f52081s, z11, zArr);
                    z2 z2Var = this.f52008y;
                    boolean z12 = (z2Var.f52067e == 4 || jB == z2Var.f52081s) ? false : true;
                    z2 z2Var2 = this.f52008y;
                    this.f52008y = O(z2Var2.f52064b, jB, z2Var2.f52065c, z2Var2.f52066d, z12, 5);
                    if (z12) {
                        w0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f51985b.length];
                    int i10 = 0;
                    while (true) {
                        m3[] m3VarArr = this.f51985b;
                        if (i10 >= m3VarArr.length) {
                            break;
                        }
                        m3 m3Var = m3VarArr[i10];
                        boolean zS = S(m3Var);
                        zArr2[i10] = zS;
                        com.google.android.exoplayer2.source.d1 d1Var = n2VarP2.f47032c[i10];
                        if (zS) {
                            if (d1Var != m3Var.k()) {
                                o(m3Var);
                            } else if (zArr[i10]) {
                                m3Var.m(this.M);
                            }
                        }
                        i10++;
                    }
                    u(zArr2);
                } else {
                    this.f52003t.z(n2VarP);
                    if (n2VarP.f47033d) {
                        n2VarP.a(xVarV, Math.max(n2VarP.f47035f.f47049b, n2VarP.y(this.M)), false);
                    }
                }
                J(true);
                if (this.f52008y.f52067e != 4) {
                    X();
                    v1();
                    this.f51992i.l(2);
                    return;
                }
                return;
            }
            if (n2VarP == n2VarQ) {
                z10 = false;
            }
        }
    }

    private void t1(com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.x xVar) {
        this.f51990g.e(this.f51985b, p1Var, xVar.f50192c);
    }

    private void u(boolean[] zArr) throws ExoPlaybackException {
        n2 n2VarQ = this.f52003t.q();
        com.google.android.exoplayer2.trackselection.x xVarO = n2VarQ.o();
        for (int i10 = 0; i10 < this.f51985b.length; i10++) {
            if (!xVarO.c(i10) && this.f51986c.remove(this.f51985b[i10])) {
                this.f51985b[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f51985b.length; i11++) {
            if (xVarO.c(i11)) {
                s(i11, zArr[i11]);
            }
        }
        n2VarQ.f47036g = true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[PHI: r4 r5 r7
  0x00a2: PHI (r4v3 com.google.android.exoplayer2.source.f0$a) = (r4v2 com.google.android.exoplayer2.source.f0$a), (r4v9 com.google.android.exoplayer2.source.f0$a) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x00a2: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x00a2: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    private void u0(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        this.f51992i.n(2);
        this.P = null;
        this.D = false;
        this.f51999p.h();
        this.M = q2.f47326n;
        for (m3 m3Var : this.f51985b) {
            try {
                o(m3Var);
            } catch (ExoPlaybackException | RuntimeException e10) {
                com.google.android.exoplayer2.util.u.e(R, "Disable failed.", e10);
            }
        }
        if (z10) {
            for (m3 m3Var2 : this.f51985b) {
                if (this.f51986c.remove(m3Var2)) {
                    try {
                        m3Var2.reset();
                    } catch (RuntimeException e11) {
                        com.google.android.exoplayer2.util.u.e(R, "Reset failed.", e11);
                    }
                }
            }
        }
        this.K = 0;
        z2 z2Var = this.f52008y;
        com.google.android.exoplayer2.source.f0.a aVar = z2Var.f52064b;
        long jLongValue = z2Var.f52081s;
        long j10 = (this.f52008y.f52064b.c() || U(this.f52008y, this.f51996m)) ? this.f52008y.f52065c : this.f52008y.f52081s;
        if (z11) {
            this.L = null;
            Pair<com.google.android.exoplayer2.source.f0.a, Long> pairD = D(this.f52008y.f52063a);
            aVar = (com.google.android.exoplayer2.source.f0.a) pairD.first;
            jLongValue = ((Long) pairD.second).longValue();
            j10 = j.f46377b;
            if (aVar.equals(this.f52008y.f52064b)) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        com.google.android.exoplayer2.source.f0.a aVar2 = aVar;
        long j11 = jLongValue;
        this.f52003t.f();
        this.E = false;
        z2 z2Var2 = this.f52008y;
        z3 z3Var = z2Var2.f52063a;
        int i10 = z2Var2.f52067e;
        ExoPlaybackException exoPlaybackException = z13 ? null : z2Var2.f52068f;
        com.google.android.exoplayer2.source.p1 p1Var = z14 ? com.google.android.exoplayer2.source.p1.f48606e : z2Var2.f52070h;
        com.google.android.exoplayer2.trackselection.x xVar = z14 ? this.f51989f : z2Var2.f52071i;
        List listB = z14 ? ImmutableList.B() : z2Var2.f52072j;
        z2 z2Var3 = this.f52008y;
        this.f52008y = new z2(z3Var, aVar2, j10, j11, i10, exoPlaybackException, false, p1Var, xVar, listB, aVar2, z2Var3.f52074l, z2Var3.f52075m, z2Var3.f52076n, j11, 0L, j11, this.J, false);
        if (z12) {
            this.f52004u.A();
        }
    }

    private void u1() throws ExoPlaybackException, IOException {
        if (this.f52008y.f52063a.x() || !this.f52004u.t()) {
            return;
        }
        b0();
        d0();
        e0();
        c0();
    }

    private void v(m3 m3Var) throws ExoPlaybackException {
        if (m3Var.getState() == 2) {
            m3Var.stop();
        }
    }

    private void v0() {
        n2 n2VarP = this.f52003t.p();
        this.C = n2VarP != null && n2VarP.f47035f.f47055h && this.B;
    }

    private void v1() throws ExoPlaybackException {
        n2 n2VarP = this.f52003t.p();
        if (n2VarP == null) {
            return;
        }
        long jK = n2VarP.f47033d ? n2VarP.f47030a.k() : -9223372036854775807L;
        if (jK != j.f46377b) {
            w0(jK);
            if (jK != this.f52008y.f52081s) {
                z2 z2Var = this.f52008y;
                this.f52008y = O(z2Var.f52064b, jK, z2Var.f52065c, jK, true, 5);
            }
        } else {
            long jI = this.f51999p.i(n2VarP != this.f52003t.q());
            this.M = jI;
            long jY = n2VarP.y(jI);
            a0(this.f52008y.f52081s, jY);
            this.f52008y.f52081s = jY;
        }
        this.f52008y.f52079q = this.f52003t.j().i();
        this.f52008y.f52080r = F();
        z2 z2Var2 = this.f52008y;
        if (z2Var2.f52074l && z2Var2.f52067e == 3 && m1(z2Var2.f52063a, z2Var2.f52064b) && this.f52008y.f52076n.f44371b == 1.0f) {
            float fB = this.f52005v.b(z(), F());
            if (this.f51999p.g().f44371b != fB) {
                this.f51999p.e(this.f52008y.f52076n.f(fB));
                M(this.f52008y.f52076n, this.f51999p.g().f44371b, false, false);
            }
        }
    }

    private void w0(long j10) throws ExoPlaybackException {
        n2 n2VarP = this.f52003t.p();
        long jZ = n2VarP == null ? j10 + q2.f47326n : n2VarP.z(j10);
        this.M = jZ;
        this.f51999p.c(jZ);
        for (m3 m3Var : this.f51985b) {
            if (S(m3Var)) {
                m3Var.m(this.M);
            }
        }
        i0();
    }

    private void w1(float f10) {
        for (n2 n2VarP = this.f52003t.p(); n2VarP != null; n2VarP = n2VarP.j()) {
            for (com.google.android.exoplayer2.trackselection.j jVar : n2VarP.o().f50192c) {
                if (jVar != null) {
                    jVar.q(f10);
                }
            }
        }
    }

    private static void x0(z3 z3Var, d dVar, z3.d dVar2, z3.b bVar) {
        int i10 = z3Var.u(z3Var.m(dVar.f52022e, bVar).f52095d, dVar2).f52127q;
        Object obj = z3Var.l(i10, bVar, true).f52094c;
        long j10 = bVar.f52096e;
        dVar.b(i10, j10 != j.f46377b ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private synchronized void x1(com.google.common.base.c0<Boolean> c0Var, long j10) {
        long jB = this.f52001r.b() + j10;
        boolean z10 = false;
        while (!c0Var.get().booleanValue() && j10 > 0) {
            try {
                this.f52001r.d();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jB - this.f52001r.b();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private ImmutableList<Metadata> y(com.google.android.exoplayer2.trackselection.j[] jVarArr) {
        ImmutableList.a aVar = new ImmutableList.a();
        boolean z10 = false;
        for (com.google.android.exoplayer2.trackselection.j jVar : jVarArr) {
            if (jVar != null) {
                Metadata metadata = jVar.p(0).f43591k;
                if (metadata == null) {
                    aVar.a(new Metadata(new Metadata.Entry[0]));
                } else {
                    aVar.a(metadata);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.e() : ImmutableList.B();
    }

    private static boolean y0(d dVar, z3 z3Var, z3 z3Var2, int i10, boolean z10, z3.d dVar2, z3.b bVar) {
        Object obj = dVar.f52022e;
        if (obj == null) {
            Pair<Object, Long> pairB0 = B0(z3Var, new h(dVar.f52019b.j(), dVar.f52019b.f(), dVar.f52019b.h() == Long.MIN_VALUE ? j.f46377b : com.google.android.exoplayer2.util.u0.U0(dVar.f52019b.h())), false, i10, z10, dVar2, bVar);
            if (pairB0 == null) {
                return false;
            }
            dVar.b(z3Var.g(pairB0.first), ((Long) pairB0.second).longValue(), pairB0.first);
            if (dVar.f52019b.h() == Long.MIN_VALUE) {
                x0(z3Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int iG = z3Var.g(obj);
        if (iG == -1) {
            return false;
        }
        if (dVar.f52019b.h() == Long.MIN_VALUE) {
            x0(z3Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f52020c = iG;
        z3Var2.m(dVar.f52022e, bVar);
        if (bVar.f52098g && z3Var2.u(bVar.f52095d, dVar2).f52126p == z3Var2.g(dVar.f52022e)) {
            Pair<Object, Long> pairO = z3Var.o(dVar2, bVar, z3Var.m(dVar.f52022e, bVar).f52095d, dVar.f52021d + bVar.s());
            dVar.b(z3Var.g(pairO.first), ((Long) pairO.second).longValue(), pairO.first);
        }
        return true;
    }

    private long z() {
        z2 z2Var = this.f52008y;
        return B(z2Var.f52063a, z2Var.f52064b.f47719a, z2Var.f52081s);
    }

    private void z0(z3 z3Var, z3 z3Var2) {
        if (z3Var.x() && z3Var2.x()) {
            return;
        }
        for (int size = this.f52000q.size() - 1; size >= 0; size--) {
            if (!y0(this.f52000q.get(size), z3Var, z3Var2, this.F, this.G, this.f51995l, this.f51996m)) {
                this.f52000q.get(size).f52019b.m(false);
                this.f52000q.remove(size);
            }
        }
        Collections.sort(this.f52000q);
    }

    public Looper E() {
        return this.f51994k;
    }

    public void E0(z3 z3Var, int i10, long j10) {
        this.f51992i.e(3, new h(z3Var, i10, j10)).a();
    }

    public synchronized boolean O0(boolean z10) {
        if (!this.A && this.f51993j.isAlive()) {
            if (z10) {
                this.f51992i.g(13, 1, 0).a();
                return true;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f51992i.i(13, 0, 0, atomicBoolean).a();
            x1(new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.w1
                @Override // com.google.common.base.c0
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, this.Q);
            return atomicBoolean.get();
        }
        return true;
    }

    public void R0(List<t2.c> list, int i10, long j10, com.google.android.exoplayer2.source.f1 f1Var) {
        this.f51992i.e(17, new b(list, f1Var, i10, j10, null)).a();
    }

    public void T0(boolean z10) {
        this.f51992i.g(23, z10 ? 1 : 0, 0).a();
    }

    public void V0(boolean z10, int i10) {
        this.f51992i.g(1, z10 ? 1 : 0, i10).a();
    }

    public void X0(b3 b3Var) {
        this.f51992i.e(4, b3Var).a();
    }

    public void Z0(int i10) {
        this.f51992i.g(11, i10, 0).a();
    }

    @Override // com.google.android.exoplayer2.trackselection.w.a
    public void a() {
        this.f51992i.l(10);
    }

    @Override // com.google.android.exoplayer2.m.a
    public void b(b3 b3Var) {
        this.f51992i.e(16, b3Var).a();
    }

    public void b1(r3 r3Var) {
        this.f51992i.e(5, r3Var).a();
    }

    @Override // com.google.android.exoplayer2.t2.d
    public void d() {
        this.f51992i.l(22);
    }

    public void d1(boolean z10) {
        this.f51992i.g(12, z10 ? 1 : 0, 0).a();
    }

    @Override // com.google.android.exoplayer2.h3.a
    public synchronized void e(h3 h3Var) {
        if (!this.A && this.f51993j.isAlive()) {
            this.f51992i.e(14, h3Var).a();
            return;
        }
        com.google.android.exoplayer2.util.u.m(R, "Ignoring messages sent after release.");
        h3Var.m(false);
    }

    public void f1(com.google.android.exoplayer2.source.f1 f1Var) {
        this.f51992i.e(21, f1Var).a();
    }

    public void h0(int i10, int i11, int i12, com.google.android.exoplayer2.source.f1 f1Var) {
        this.f51992i.e(19, new c(i10, i11, i12, f1Var)).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i10;
        n2 n2VarQ;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    n0();
                    break;
                case 1:
                    W0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    r();
                    break;
                case 3:
                    G0((h) message.obj);
                    break;
                case 4:
                    Y0((b3) message.obj);
                    break;
                case 5:
                    c1((r3) message.obj);
                    break;
                case 6:
                    p1(false, true);
                    break;
                case 7:
                    p0();
                    return true;
                case 8:
                    L((com.google.android.exoplayer2.source.c0) message.obj);
                    break;
                case 9:
                    H((com.google.android.exoplayer2.source.c0) message.obj);
                    break;
                case 10:
                    t0();
                    break;
                case 11:
                    a1(message.arg1);
                    break;
                case 12:
                    e1(message.arg1 != 0);
                    break;
                case 13:
                    P0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    J0((h3) message.obj);
                    break;
                case 15:
                    L0((h3) message.obj);
                    break;
                case 16:
                    N((b3) message.obj, false);
                    break;
                case 17:
                    Q0((b) message.obj);
                    break;
                case 18:
                    j((b) message.obj, message.arg1);
                    break;
                case 19:
                    g0((c) message.obj);
                    break;
                case 20:
                    q0(message.arg1, message.arg2, (com.google.android.exoplayer2.source.f1) message.obj);
                    break;
                case 21:
                    g1((com.google.android.exoplayer2.source.f1) message.obj);
                    break;
                case 22:
                    f0();
                    break;
                case 23:
                    U0(message.arg1 != 0);
                    break;
                case 24:
                    S0(message.arg1 == 1);
                    break;
                case 25:
                    l();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e10) {
            e = e10;
            if (e.T == 1 && (n2VarQ = this.f52003t.q()) != null) {
                e = e.j(n2VarQ.f47035f.f47048a);
            }
            if (e.Z && this.P == null) {
                com.google.android.exoplayer2.util.u.n(R, "Recoverable renderer error", e);
                this.P = e;
                com.google.android.exoplayer2.util.p pVar = this.f51992i;
                pVar.h(pVar.e(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.P;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.P;
                }
                com.google.android.exoplayer2.util.u.e(R, "Playback error", e);
                p1(true, false);
                this.f52008y = this.f52008y.f(e);
            }
        } catch (ParserException e11) {
            int i12 = e11.f43516c;
            if (i12 == 1) {
                i10 = e11.f43515b ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = e11.f43515b ? 3002 : 3004;
                }
                I(e11, i11);
            }
            i11 = i10;
            I(e11, i11);
        } catch (DrmSession.DrmSessionException e12) {
            I(e12, e12.f44664b);
        } catch (BehindLiveWindowException e13) {
            I(e13, 1002);
        } catch (DataSourceException e14) {
            I(e14, e14.f50858b);
        } catch (IOException e15) {
            I(e15, 2000);
        } catch (RuntimeException e16) {
            ExoPlaybackException exoPlaybackExceptionO = ExoPlaybackException.o(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            com.google.android.exoplayer2.util.u.e(R, "Playback error", exoPlaybackExceptionO);
            p1(true, false);
            this.f52008y = this.f52008y.f(exoPlaybackExceptionO);
        }
        Y();
        return true;
    }

    public void k(int i10, List<t2.c> list, com.google.android.exoplayer2.source.f1 f1Var) {
        this.f51992i.i(18, i10, 0, new b(list, f1Var, -1, j.f46377b, null)).a();
    }

    @Override // com.google.android.exoplayer2.source.e1.a
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void n(com.google.android.exoplayer2.source.c0 c0Var) {
        this.f51992i.e(9, c0Var).a();
    }

    public void m0() {
        this.f51992i.c(0).a();
    }

    public synchronized boolean o0() {
        if (!this.A && this.f51993j.isAlive()) {
            this.f51992i.l(7);
            x1(new com.google.common.base.c0() { // from class: com.google.android.exoplayer2.u1
                @Override // com.google.common.base.c0
                public final Object get() {
                    return this.f50354b.V();
                }
            }, this.f52006w);
            return this.A;
        }
        return true;
    }

    public void o1() {
        this.f51992i.c(6).a();
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    public void q(com.google.android.exoplayer2.source.c0 c0Var) {
        this.f51992i.e(8, c0Var).a();
    }

    public void r0(int i10, int i11, com.google.android.exoplayer2.source.f1 f1Var) {
        this.f51992i.i(20, i10, i11, f1Var).a();
    }

    public void w(long j10) {
        this.Q = j10;
    }

    public void x(boolean z10) {
        this.f51992i.g(24, z10 ? 1 : 0, 0).a();
    }
}
