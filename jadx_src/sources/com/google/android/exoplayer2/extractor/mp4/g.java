package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.w;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import com.google.android.exoplayer2.util.z;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: FragmentedMp4Extractor.java */
/* JADX INFO: loaded from: classes7.dex */
public class g implements com.google.android.exoplayer2.extractor.k {
    public static final int M = 1;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 16;
    private static final String Q = "FragmentedMp4Extractor";
    private static final int R = 1936025959;
    private static final int U = 100;
    private static final int V = 0;
    private static final int W = 1;
    private static final int X = 2;
    private static final int Y = 3;
    private static final int Z = 4;
    private long A;
    private long B;

    @p0
    private c C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private com.google.android.exoplayer2.extractor.m H;
    private e0[] I;
    private e0[] J;
    private boolean K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final o f45429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<a2> f45430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<c> f45431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final byte[] f45435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final n0 f45437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.exoplayer2.metadata.emsg.b f45438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayDeque<com.google.android.exoplayer2.extractor.mp4.a.C0377a> f45440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayDeque<b> f45441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private final e0 f45442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f45443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f45444t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f45445u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f45446v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.util.e0 f45447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f45448x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f45449y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f45450z;
    public static final com.google.android.exoplayer2.extractor.q L = new com.google.android.exoplayer2.extractor.q() { // from class: com.google.android.exoplayer2.extractor.mp4.f
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ com.google.android.exoplayer2.extractor.k[] a(Uri uri, Map map) {
            return com.google.android.exoplayer2.extractor.p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final com.google.android.exoplayer2.extractor.k[] b() {
            return g.l();
        }
    };
    private static final byte[] S = {-94, 57, 79, 82, 90, -101, 79, com.google.common.base.a.f56671x, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final a2 T = new a2.b().e0(y.C0).E();

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f45451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45452b;

        public b(long j10, int i10) {
            this.f45451a = j10;
            this.f45452b = i10;
        }
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f45453m = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f45454a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r f45457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.google.android.exoplayer2.extractor.mp4.c f45458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f45459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f45460g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45461h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f45462i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f45465l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f45455b = new q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.e0 f45456c = new com.google.android.exoplayer2.util.e0();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.e0 f45463j = new com.google.android.exoplayer2.util.e0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.e0 f45464k = new com.google.android.exoplayer2.util.e0();

        public c(e0 e0Var, r rVar, com.google.android.exoplayer2.extractor.mp4.c cVar) {
            this.f45454a = e0Var;
            this.f45457d = rVar;
            this.f45458e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10;
            if (this.f45465l) {
                i10 = this.f45455b.f45579k[this.f45459f] ? 1 : 0;
            } else {
                i10 = this.f45457d.f45593g[this.f45459f];
            }
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f45465l ? this.f45457d.f45589c[this.f45459f] : this.f45455b.f45575g[this.f45461h];
        }

        public long e() {
            return !this.f45465l ? this.f45457d.f45592f[this.f45459f] : this.f45455b.c(this.f45459f);
        }

        public int f() {
            return !this.f45465l ? this.f45457d.f45590d[this.f45459f] : this.f45455b.f45577i[this.f45459f];
        }

        @p0
        public p g() {
            if (!this.f45465l) {
                return null;
            }
            int i10 = ((com.google.android.exoplayer2.extractor.mp4.c) u0.k(this.f45455b.f45569a)).f45416a;
            p pVarB = this.f45455b.f45582n;
            if (pVarB == null) {
                pVarB = this.f45457d.f45587a.b(i10);
            }
            if (pVarB == null || !pVarB.f45564a) {
                return null;
            }
            return pVarB;
        }

        public boolean h() {
            this.f45459f++;
            if (!this.f45465l) {
                return false;
            }
            int i10 = this.f45460g + 1;
            this.f45460g = i10;
            int[] iArr = this.f45455b.f45576h;
            int i11 = this.f45461h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f45461h = i11 + 1;
            this.f45460g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            com.google.android.exoplayer2.util.e0 e0Var;
            p pVarG = g();
            if (pVarG == null) {
                return 0;
            }
            int length = pVarG.f45567d;
            if (length != 0) {
                e0Var = this.f45455b.f45583o;
            } else {
                byte[] bArr = (byte[]) u0.k(pVarG.f45568e);
                this.f45464k.Q(bArr, bArr.length);
                com.google.android.exoplayer2.util.e0 e0Var2 = this.f45464k;
                length = bArr.length;
                e0Var = e0Var2;
            }
            boolean zG = this.f45455b.g(this.f45459f);
            boolean z10 = zG || i11 != 0;
            this.f45463j.d()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f45463j.S(0);
            this.f45454a.f(this.f45463j, 1, 1);
            this.f45454a.f(e0Var, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f45456c.O(8);
                byte[] bArrD = this.f45456c.d();
                bArrD[0] = 0;
                bArrD[1] = 1;
                bArrD[2] = (byte) ((i11 >> 8) & 255);
                bArrD[3] = (byte) (i11 & 255);
                bArrD[4] = (byte) ((i10 >> 24) & 255);
                bArrD[5] = (byte) ((i10 >> 16) & 255);
                bArrD[6] = (byte) ((i10 >> 8) & 255);
                bArrD[7] = (byte) (i10 & 255);
                this.f45454a.f(this.f45456c, 8, 1);
                return length + 1 + 8;
            }
            com.google.android.exoplayer2.util.e0 e0Var3 = this.f45455b.f45583o;
            int iM = e0Var3.M();
            e0Var3.T(-2);
            int i12 = (iM * 6) + 2;
            if (i11 != 0) {
                this.f45456c.O(i12);
                byte[] bArrD2 = this.f45456c.d();
                e0Var3.k(bArrD2, 0, i12);
                int i13 = (((bArrD2[2] & 255) << 8) | (bArrD2[3] & 255)) + i11;
                bArrD2[2] = (byte) ((i13 >> 8) & 255);
                bArrD2[3] = (byte) (i13 & 255);
                e0Var3 = this.f45456c;
            }
            this.f45454a.f(e0Var3, i12, 1);
            return length + 1 + i12;
        }

        public void j(r rVar, com.google.android.exoplayer2.extractor.mp4.c cVar) {
            this.f45457d = rVar;
            this.f45458e = cVar;
            this.f45454a.d(rVar.f45587a.f45557f);
            k();
        }

        public void k() {
            this.f45455b.f();
            this.f45459f = 0;
            this.f45461h = 0;
            this.f45460g = 0;
            this.f45462i = 0;
            this.f45465l = false;
        }

        public void l(long j10) {
            int i10 = this.f45459f;
            while (true) {
                q qVar = this.f45455b;
                if (i10 >= qVar.f45574f || qVar.c(i10) >= j10) {
                    return;
                }
                if (this.f45455b.f45579k[i10]) {
                    this.f45462i = i10;
                }
                i10++;
            }
        }

        public void m() {
            p pVarG = g();
            if (pVarG == null) {
                return;
            }
            com.google.android.exoplayer2.util.e0 e0Var = this.f45455b.f45583o;
            int i10 = pVarG.f45567d;
            if (i10 != 0) {
                e0Var.T(i10);
            }
            if (this.f45455b.g(this.f45459f)) {
                e0Var.T(e0Var.M() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            p pVarB = this.f45457d.f45587a.b(((com.google.android.exoplayer2.extractor.mp4.c) u0.k(this.f45455b.f45569a)).f45416a);
            this.f45454a.d(this.f45457d.f45587a.f45557f.c().M(drmInitData.c(pVarB != null ? pVarB.f45565b : null)).E());
        }
    }

    public g() {
        this(0);
    }

    public g(int i10) {
        this(i10, null);
    }

    public g(int i10, @p0 n0 n0Var) {
        this(i10, n0Var, null, Collections.emptyList());
    }

    public g(int i10, @p0 n0 n0Var, @p0 o oVar) {
        this(i10, n0Var, oVar, Collections.emptyList());
    }

    public g(int i10, @p0 n0 n0Var, @p0 o oVar, List<a2> list) {
        this(i10, n0Var, oVar, list, null);
    }

    public g(int i10, @p0 n0 n0Var, @p0 o oVar, List<a2> list, @p0 e0 e0Var) {
        this.f45428d = i10;
        this.f45437m = n0Var;
        this.f45429e = oVar;
        this.f45430f = Collections.unmodifiableList(list);
        this.f45442r = e0Var;
        this.f45438n = new com.google.android.exoplayer2.metadata.emsg.b();
        this.f45439o = new com.google.android.exoplayer2.util.e0(16);
        this.f45432h = new com.google.android.exoplayer2.util.e0(z.f51618b);
        this.f45433i = new com.google.android.exoplayer2.util.e0(5);
        this.f45434j = new com.google.android.exoplayer2.util.e0();
        byte[] bArr = new byte[16];
        this.f45435k = bArr;
        this.f45436l = new com.google.android.exoplayer2.util.e0(bArr);
        this.f45440p = new ArrayDeque<>();
        this.f45441q = new ArrayDeque<>();
        this.f45431g = new SparseArray<>();
        this.A = com.google.android.exoplayer2.j.f46377b;
        this.f45450z = com.google.android.exoplayer2.j.f46377b;
        this.B = com.google.android.exoplayer2.j.f46377b;
        this.H = com.google.android.exoplayer2.extractor.m.f45083e1;
        this.I = new e0[0];
        this.J = new e0[0];
    }

    private static Pair<Long, com.google.android.exoplayer2.extractor.e> A(com.google.android.exoplayer2.util.e0 e0Var, long j10) throws ParserException {
        long jL;
        long jL2;
        e0Var.S(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o());
        e0Var.T(4);
        long jI = e0Var.I();
        if (iC == 0) {
            jL = e0Var.I();
            jL2 = e0Var.I();
        } else {
            jL = e0Var.L();
            jL2 = e0Var.L();
        }
        long j11 = jL;
        long j12 = j10 + jL2;
        long jJ1 = u0.j1(j11, 1000000L, jI);
        e0Var.T(2);
        int iM = e0Var.M();
        int[] iArr = new int[iM];
        long[] jArr = new long[iM];
        long[] jArr2 = new long[iM];
        long[] jArr3 = new long[iM];
        long j13 = jJ1;
        int i10 = 0;
        long j14 = j11;
        while (i10 < iM) {
            int iO = e0Var.o();
            if ((iO & Integer.MIN_VALUE) != 0) {
                throw ParserException.a("Unhandled indirect reference", null);
            }
            long jI2 = e0Var.I();
            iArr[i10] = iO & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + jI2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = iM;
            int[] iArr2 = iArr;
            long jJ2 = u0.j1(j15, 1000000L, jI);
            jArr4[i10] = jJ2 - jArr5[i10];
            e0Var.T(4);
            j12 += (long) iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iM = i11;
            j14 = j15;
            j13 = jJ2;
        }
        return Pair.create(Long.valueOf(jJ1), new com.google.android.exoplayer2.extractor.e(iArr, jArr, jArr2, jArr3));
    }

    private static long B(com.google.android.exoplayer2.util.e0 e0Var) {
        e0Var.S(8);
        return com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o()) == 1 ? e0Var.L() : e0Var.I();
    }

    @p0
    private static c C(com.google.android.exoplayer2.util.e0 e0Var, SparseArray<c> sparseArray, boolean z10) {
        e0Var.S(8);
        int iB = com.google.android.exoplayer2.extractor.mp4.a.b(e0Var.o());
        c cVarValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(e0Var.o());
        if (cVarValueAt == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jL = e0Var.L();
            q qVar = cVarValueAt.f45455b;
            qVar.f45571c = jL;
            qVar.f45572d = jL;
        }
        com.google.android.exoplayer2.extractor.mp4.c cVar = cVarValueAt.f45458e;
        cVarValueAt.f45455b.f45569a = new com.google.android.exoplayer2.extractor.mp4.c((iB & 2) != 0 ? e0Var.o() - 1 : cVar.f45416a, (iB & 8) != 0 ? e0Var.o() : cVar.f45417b, (iB & 16) != 0 ? e0Var.o() : cVar.f45418c, (iB & 32) != 0 ? e0Var.o() : cVar.f45419d);
        return cVarValueAt;
    }

    private static void D(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a, SparseArray<c> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        c cVarC = C(((com.google.android.exoplayer2.extractor.mp4.a.b) com.google.android.exoplayer2.util.a.g(c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.f45303b0))).C1, sparseArray, z10);
        if (cVarC == null) {
            return;
        }
        q qVar = cVarC.f45455b;
        long j10 = qVar.f45585q;
        boolean z11 = qVar.f45586r;
        cVarC.k();
        cVarC.f45465l = true;
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.f45300a0);
        if (bVarH == null || (i10 & 2) != 0) {
            qVar.f45585q = j10;
            qVar.f45586r = z11;
        } else {
            qVar.f45585q = B(bVarH.C1);
            qVar.f45586r = true;
        }
        G(c0377a, cVarC, i10);
        p pVarB = cVarC.f45457d.f45587a.b(((com.google.android.exoplayer2.extractor.mp4.c) com.google.android.exoplayer2.util.a.g(qVar.f45569a)).f45416a);
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH2 = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.F0);
        if (bVarH2 != null) {
            w((p) com.google.android.exoplayer2.util.a.g(pVarB), bVarH2.C1, qVar);
        }
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH3 = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.G0);
        if (bVarH3 != null) {
            v(bVarH3.C1, qVar);
        }
        com.google.android.exoplayer2.extractor.mp4.a.b bVarH4 = c0377a.h(com.google.android.exoplayer2.extractor.mp4.a.K0);
        if (bVarH4 != null) {
            z(bVarH4.C1, qVar);
        }
        x(c0377a, pVarB != null ? pVarB.f45565b : null, qVar);
        int size = c0377a.D1.size();
        for (int i11 = 0; i11 < size; i11++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = c0377a.D1.get(i11);
            if (bVar.f45377a == 1970628964) {
                H(bVar.C1, qVar, bArr);
            }
        }
    }

    private static Pair<Integer, com.google.android.exoplayer2.extractor.mp4.c> E(com.google.android.exoplayer2.util.e0 e0Var) {
        e0Var.S(12);
        return Pair.create(Integer.valueOf(e0Var.o()), new com.google.android.exoplayer2.extractor.mp4.c(e0Var.o() - 1, e0Var.o(), e0Var.o(), e0Var.o()));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    private static int F(c cVar, int i10, int i11, com.google.android.exoplayer2.util.e0 e0Var, int i12) throws ParserException {
        long j10;
        long j11;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z10;
        int i13;
        long j12;
        long j13;
        int i14;
        int iO;
        int iO2;
        int iO3;
        int iO4;
        long jJ1;
        boolean z11;
        c cVar2 = cVar;
        e0Var.S(8);
        int iB = com.google.android.exoplayer2.extractor.mp4.a.b(e0Var.o());
        o oVar = cVar2.f45457d.f45587a;
        q qVar = cVar2.f45455b;
        com.google.android.exoplayer2.extractor.mp4.c cVar3 = (com.google.android.exoplayer2.extractor.mp4.c) u0.k(qVar.f45569a);
        qVar.f45576h[i10] = e0Var.K();
        long[] jArr2 = qVar.f45575g;
        long j14 = qVar.f45571c;
        jArr2[i10] = j14;
        if ((iB & 1) != 0) {
            jArr2[i10] = j14 + ((long) e0Var.o());
        }
        boolean z12 = (iB & 4) != 0;
        int iO5 = cVar3.f45419d;
        if (z12) {
            iO5 = e0Var.o();
        }
        boolean z13 = (iB & 256) != 0;
        boolean z14 = (iB & 512) != 0;
        boolean z15 = (iB & 1024) != 0;
        boolean z16 = (iB & 2048) != 0;
        long[] jArr3 = oVar.f45559h;
        if (jArr3 != null && jArr3.length == 1) {
            j10 = 0;
            if (jArr3[0] == 0) {
                j11 = ((long[]) u0.k(oVar.f45560i))[0];
            }
            iArr = qVar.f45577i;
            jArr = qVar.f45578j;
            zArr = qVar.f45579k;
            int i15 = iO5;
            if (oVar.f45553b == 2 || (i11 & 1) == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            i13 = i12 + qVar.f45576h[i10];
            boolean z17 = z10;
            j12 = oVar.f45554c;
            j13 = qVar.f45585q;
            i14 = i12;
            while (i14 < i13) {
                if (z13) {
                    iO = e0Var.o();
                } else {
                    iO = cVar3.f45417b;
                }
                int iD = d(iO);
                if (z14) {
                    iO2 = e0Var.o();
                } else {
                    iO2 = cVar3.f45418c;
                }
                int iD2 = d(iO2);
                if (z15) {
                    iO3 = e0Var.o();
                } else if (i14 == 0 || !z12) {
                    iO3 = cVar3.f45419d;
                } else {
                    iO3 = i15;
                }
                if (z16) {
                    iO4 = e0Var.o();
                } else {
                    iO4 = 0;
                }
                jJ1 = u0.j1((((long) iO4) + j13) - j11, 1000000L, j12);
                jArr[i14] = jJ1;
                if (!qVar.f45586r) {
                    jArr[i14] = jJ1 + cVar2.f45457d.f45594h;
                }
                iArr[i14] = iD2;
                if (((iO3 >> 16) & 1) == 0 || (z17 && i14 != 0)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                zArr[i14] = z11;
                j13 += (long) iD;
                i14++;
                cVar2 = cVar;
                z13 = z13;
                z12 = z12;
                z16 = z16;
                z14 = z14;
                z15 = z15;
            }
            qVar.f45585q = j13;
            return i13;
        }
        j10 = 0;
        j11 = j10;
        iArr = qVar.f45577i;
        jArr = qVar.f45578j;
        zArr = qVar.f45579k;
        int i16 = iO5;
        if (oVar.f45553b == 2) {
            z10 = false;
        } else {
            z10 = false;
        }
        i13 = i12 + qVar.f45576h[i10];
        boolean z18 = z10;
        j12 = oVar.f45554c;
        j13 = qVar.f45585q;
        i14 = i12;
        while (i14 < i13) {
            if (z13) {
                iO = e0Var.o();
            } else {
                iO = cVar3.f45417b;
            }
            int iD3 = d(iO);
            if (z14) {
                iO2 = e0Var.o();
            } else {
                iO2 = cVar3.f45418c;
            }
            int iD4 = d(iO2);
            if (z15) {
                iO3 = e0Var.o();
            } else if (i14 == 0) {
                iO3 = cVar3.f45419d;
            } else {
                iO3 = cVar3.f45419d;
            }
            if (z16) {
                iO4 = e0Var.o();
            } else {
                iO4 = 0;
            }
            jJ1 = u0.j1((((long) iO4) + j13) - j11, 1000000L, j12);
            jArr[i14] = jJ1;
            if (!qVar.f45586r) {
                jArr[i14] = jJ1 + cVar2.f45457d.f45594h;
            }
            iArr[i14] = iD4;
            if (((iO3 >> 16) & 1) == 0) {
                z11 = false;
            } else {
                z11 = false;
            }
            zArr[i14] = z11;
            j13 += (long) iD3;
            i14++;
            cVar2 = cVar;
            z13 = z13;
            z12 = z12;
            z16 = z16;
            z14 = z14;
            z15 = z15;
        }
        qVar.f45585q = j13;
        return i13;
    }

    private static void G(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a, c cVar, int i10) throws ParserException {
        List<com.google.android.exoplayer2.extractor.mp4.a.b> list = c0377a.D1;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = list.get(i13);
            if (bVar.f45377a == 1953658222) {
                com.google.android.exoplayer2.util.e0 e0Var = bVar.C1;
                e0Var.S(12);
                int iK = e0Var.K();
                if (iK > 0) {
                    i12 += iK;
                    i11++;
                }
            }
        }
        cVar.f45461h = 0;
        cVar.f45460g = 0;
        cVar.f45459f = 0;
        cVar.f45455b.e(i11, i12);
        int i14 = 0;
        int iF = 0;
        for (int i15 = 0; i15 < size; i15++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar2 = list.get(i15);
            if (bVar2.f45377a == 1953658222) {
                iF = F(cVar, i14, i10, bVar2.C1, iF);
                i14++;
            }
        }
    }

    private static void H(com.google.android.exoplayer2.util.e0 e0Var, q qVar, byte[] bArr) throws ParserException {
        e0Var.S(8);
        e0Var.k(bArr, 0, 16);
        if (Arrays.equals(bArr, S)) {
            y(e0Var, 16, qVar);
        }
    }

    private void I(long j10) throws ParserException {
        while (!this.f45440p.isEmpty() && this.f45440p.peek().C1 == j10) {
            n(this.f45440p.pop());
        }
        e();
    }

    private boolean J(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        if (this.f45446v == 0) {
            if (!lVar.g(this.f45439o.d(), 0, 8, true)) {
                return false;
            }
            this.f45446v = 8;
            this.f45439o.S(0);
            this.f45445u = this.f45439o.I();
            this.f45444t = this.f45439o.o();
        }
        long j10 = this.f45445u;
        if (j10 == 1) {
            lVar.readFully(this.f45439o.d(), 8, 8);
            this.f45446v += 8;
            this.f45445u = this.f45439o.L();
        } else if (j10 == 0) {
            long length = lVar.getLength();
            if (length == -1 && !this.f45440p.isEmpty()) {
                length = this.f45440p.peek().C1;
            }
            if (length != -1) {
                this.f45445u = (length - lVar.getPosition()) + ((long) this.f45446v);
            }
        }
        if (this.f45445u < this.f45446v) {
            throw ParserException.e("Atom size less than header length (unsupported).");
        }
        long position = lVar.getPosition() - ((long) this.f45446v);
        int i10 = this.f45444t;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.K) {
            this.H.t(new b0.b(this.A, position));
            this.K = true;
        }
        if (this.f45444t == 1836019558) {
            int size = this.f45431g.size();
            for (int i11 = 0; i11 < size; i11++) {
                q qVar = this.f45431g.valueAt(i11).f45455b;
                qVar.f45570b = position;
                qVar.f45572d = position;
                qVar.f45571c = position;
            }
        }
        int i12 = this.f45444t;
        if (i12 == 1835295092) {
            this.C = null;
            this.f45448x = position + this.f45445u;
            this.f45443s = 2;
            return true;
        }
        if (N(i12)) {
            long position2 = (lVar.getPosition() + this.f45445u) - 8;
            this.f45440p.push(new com.google.android.exoplayer2.extractor.mp4.a.C0377a(this.f45444t, position2));
            if (this.f45445u == this.f45446v) {
                I(position2);
            } else {
                e();
            }
        } else if (O(this.f45444t)) {
            if (this.f45446v != 8) {
                throw ParserException.e("Leaf atom defines extended atom size (unsupported).");
            }
            long j11 = this.f45445u;
            if (j11 > 2147483647L) {
                throw ParserException.e("Leaf atom with length > 2147483647 (unsupported).");
            }
            com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0((int) j11);
            System.arraycopy(this.f45439o.d(), 0, e0Var.d(), 0, 8);
            this.f45447w = e0Var;
            this.f45443s = 1;
        } else {
            if (this.f45445u > 2147483647L) {
                throw ParserException.e("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f45447w = null;
            this.f45443s = 1;
        }
        return true;
    }

    private void K(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        int i10 = ((int) this.f45445u) - this.f45446v;
        com.google.android.exoplayer2.util.e0 e0Var = this.f45447w;
        if (e0Var != null) {
            lVar.readFully(e0Var.d(), 8, i10);
            p(new com.google.android.exoplayer2.extractor.mp4.a.b(this.f45444t, e0Var), lVar.getPosition());
        } else {
            lVar.t(i10);
        }
        I(lVar.getPosition());
    }

    private void L(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        int size = this.f45431g.size();
        long j10 = Long.MAX_VALUE;
        c cVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f45431g.valueAt(i10).f45455b;
            if (qVar.f45584p) {
                long j11 = qVar.f45572d;
                if (j11 < j10) {
                    cVarValueAt = this.f45431g.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (cVarValueAt == null) {
            this.f45443s = 3;
            return;
        }
        int position = (int) (j10 - lVar.getPosition());
        if (position < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        lVar.t(position);
        cVarValueAt.f45455b.a(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean M(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        int iB;
        c cVarJ = this.C;
        Throwable th2 = null;
        if (cVarJ == null) {
            cVarJ = j(this.f45431g);
            if (cVarJ == null) {
                int position = (int) (this.f45448x - lVar.getPosition());
                if (position < 0) {
                    throw ParserException.a("Offset to end of mdat was negative.", null);
                }
                lVar.t(position);
                e();
                return false;
            }
            int iD = (int) (cVarJ.d() - lVar.getPosition());
            if (iD < 0) {
                u.m(Q, "Ignoring negative offset to sample data.");
                iD = 0;
            }
            lVar.t(iD);
            this.C = cVarJ;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f45443s == 3) {
            int iF = cVarJ.f();
            this.D = iF;
            if (cVarJ.f45459f < cVarJ.f45462i) {
                lVar.t(iF);
                cVarJ.m();
                if (!cVarJ.h()) {
                    this.C = null;
                }
                this.f45443s = 3;
                return true;
            }
            if (cVarJ.f45457d.f45587a.f45558g == 1) {
                this.D = iF - 8;
                lVar.t(8);
            }
            if (y.O.equals(cVarJ.f45457d.f45587a.f45557f.f43593m)) {
                this.E = cVarJ.i(this.D, 7);
                com.google.android.exoplayer2.audio.c.a(this.D, this.f45436l);
                cVarJ.f45454a.c(this.f45436l, 7);
                this.E += 7;
            } else {
                this.E = cVarJ.i(this.D, 0);
            }
            this.D += this.E;
            this.f45443s = 4;
            this.F = 0;
        }
        o oVar = cVarJ.f45457d.f45587a;
        e0 e0Var = cVarJ.f45454a;
        long jE = cVarJ.e();
        n0 n0Var = this.f45437m;
        if (n0Var != null) {
            jE = n0Var.a(jE);
        }
        long j10 = jE;
        if (oVar.f45561j == 0) {
            while (true) {
                int i12 = this.E;
                int i13 = this.D;
                if (i12 >= i13) {
                    break;
                }
                this.E += e0Var.b(lVar, i13 - i12, false);
            }
        } else {
            byte[] bArrD = this.f45433i.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i14 = oVar.f45561j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.E < this.D) {
                int i17 = this.F;
                if (i17 == 0) {
                    lVar.readFully(bArrD, i16, i15);
                    this.f45433i.S(0);
                    int iO = this.f45433i.o();
                    if (iO < i11) {
                        throw ParserException.a("Invalid NAL length", th2);
                    }
                    this.F = iO - 1;
                    this.f45432h.S(0);
                    e0Var.c(this.f45432h, i10);
                    e0Var.c(this.f45433i, i11);
                    this.G = (this.J.length <= 0 || !z.g(oVar.f45557f.f43593m, bArrD[i10])) ? 0 : i11;
                    this.E += 5;
                    this.D += i16;
                } else {
                    if (this.G) {
                        this.f45434j.O(i17);
                        lVar.readFully(this.f45434j.d(), 0, this.F);
                        e0Var.c(this.f45434j, this.F);
                        iB = this.F;
                        int iQ = z.q(this.f45434j.d(), this.f45434j.f());
                        this.f45434j.S("video/hevc".equals(oVar.f45557f.f43593m) ? 1 : 0);
                        this.f45434j.R(iQ);
                        com.google.android.exoplayer2.extractor.d.a(j10, this.f45434j, this.J);
                    } else {
                        iB = e0Var.b(lVar, i17, false);
                    }
                    this.E += iB;
                    this.F -= iB;
                    th2 = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int iC = cVarJ.c();
        p pVarG = cVarJ.g();
        e0Var.e(j10, iC, this.D, 0, pVarG != null ? pVarG.f45566c : null);
        s(j10);
        if (!cVarJ.h()) {
            this.C = null;
        }
        this.f45443s = 3;
        return true;
    }

    private static boolean N(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean O(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static int d(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw ParserException.a(sb2.toString(), null);
    }

    private void e() {
        this.f45443s = 0;
        this.f45446v = 0;
    }

    private com.google.android.exoplayer2.extractor.mp4.c h(SparseArray<com.google.android.exoplayer2.extractor.mp4.c> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (com.google.android.exoplayer2.extractor.mp4.c) com.google.android.exoplayer2.util.a.g(sparseArray.get(i10));
    }

    @p0
    private static DrmInitData i(List<com.google.android.exoplayer2.extractor.mp4.a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = list.get(i10);
            if (bVar.f45377a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrD = bVar.C1.d();
                UUID uuidF = l.f(bArrD);
                if (uuidF == null) {
                    u.m(Q, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidF, "video/mp4", bArrD));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @p0
    private static c j(SparseArray<c> sparseArray) {
        int size = sparseArray.size();
        c cVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            c cVarValueAt = sparseArray.valueAt(i10);
            if ((cVarValueAt.f45465l || cVarValueAt.f45459f != cVarValueAt.f45457d.f45588b) && (!cVarValueAt.f45465l || cVarValueAt.f45461h != cVarValueAt.f45455b.f45573e)) {
                long jD = cVarValueAt.d();
                if (jD < j10) {
                    cVar = cVarValueAt;
                    j10 = jD;
                }
            }
        }
        return cVar;
    }

    private void k() {
        int i10;
        e0[] e0VarArr = new e0[2];
        this.I = e0VarArr;
        e0 e0Var = this.f45442r;
        int i11 = 0;
        if (e0Var != null) {
            e0VarArr[0] = e0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f45428d & 4) != 0) {
            e0VarArr[i10] = this.H.b(100, 5);
            i10++;
            i12 = 101;
        }
        e0[] e0VarArr2 = (e0[]) u0.Z0(this.I, i10);
        this.I = e0VarArr2;
        for (e0 e0Var2 : e0VarArr2) {
            e0Var2.d(T);
        }
        this.J = new e0[this.f45430f.size()];
        while (i11 < this.J.length) {
            e0 e0VarB = this.H.b(i12, 3);
            e0VarB.d(this.f45430f.get(i11));
            this.J[i11] = e0VarB;
            i11++;
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.k[] l() {
        return new com.google.android.exoplayer2.extractor.k[]{new g()};
    }

    private void n(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a) throws ParserException {
        int i10 = c0377a.f45377a;
        if (i10 == 1836019574) {
            r(c0377a);
        } else if (i10 == 1836019558) {
            q(c0377a);
        } else {
            if (this.f45440p.isEmpty()) {
                return;
            }
            this.f45440p.peek().d(c0377a);
        }
    }

    private void o(com.google.android.exoplayer2.util.e0 e0Var) {
        long jJ1;
        String str;
        long jJ2;
        String str2;
        long jI;
        long jA;
        if (this.I.length == 0) {
            return;
        }
        e0Var.S(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o());
        if (iC == 0) {
            String str3 = (String) com.google.android.exoplayer2.util.a.g(e0Var.A());
            String str4 = (String) com.google.android.exoplayer2.util.a.g(e0Var.A());
            long jI2 = e0Var.I();
            jJ1 = u0.j1(e0Var.I(), 1000000L, jI2);
            long j10 = this.B;
            long j11 = j10 != com.google.android.exoplayer2.j.f46377b ? j10 + jJ1 : -9223372036854775807L;
            str = str3;
            jJ2 = u0.j1(e0Var.I(), 1000L, jI2);
            str2 = str4;
            jI = e0Var.I();
            jA = j11;
        } else {
            if (iC != 1) {
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Skipping unsupported emsg version: ");
                sb2.append(iC);
                u.m(Q, sb2.toString());
                return;
            }
            long jI3 = e0Var.I();
            jA = u0.j1(e0Var.L(), 1000000L, jI3);
            long jJ3 = u0.j1(e0Var.I(), 1000L, jI3);
            long jI4 = e0Var.I();
            str = (String) com.google.android.exoplayer2.util.a.g(e0Var.A());
            jJ2 = jJ3;
            jI = jI4;
            str2 = (String) com.google.android.exoplayer2.util.a.g(e0Var.A());
            jJ1 = -9223372036854775807L;
        }
        byte[] bArr = new byte[e0Var.a()];
        e0Var.k(bArr, 0, e0Var.a());
        com.google.android.exoplayer2.util.e0 e0Var2 = new com.google.android.exoplayer2.util.e0(this.f45438n.a(new EventMessage(str, str2, jJ2, jI, bArr)));
        int iA = e0Var2.a();
        for (e0 e0Var3 : this.I) {
            e0Var2.S(0);
            e0Var3.c(e0Var2, iA);
        }
        if (jA == com.google.android.exoplayer2.j.f46377b) {
            this.f45441q.addLast(new b(jJ1, iA));
            this.f45449y += iA;
            return;
        }
        n0 n0Var = this.f45437m;
        if (n0Var != null) {
            jA = n0Var.a(jA);
        }
        for (e0 e0Var4 : this.I) {
            e0Var4.e(jA, 1, iA, 0, null);
        }
    }

    private void p(com.google.android.exoplayer2.extractor.mp4.a.b bVar, long j10) throws ParserException {
        if (!this.f45440p.isEmpty()) {
            this.f45440p.peek().e(bVar);
            return;
        }
        int i10 = bVar.f45377a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                o(bVar.C1);
            }
        } else {
            Pair<Long, com.google.android.exoplayer2.extractor.e> pairA = A(bVar.C1, j10);
            this.B = ((Long) pairA.first).longValue();
            this.H.t((b0) pairA.second);
            this.K = true;
        }
    }

    private void q(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a) throws ParserException {
        u(c0377a, this.f45431g, this.f45429e != null, this.f45428d, this.f45435k);
        DrmInitData drmInitDataI = i(c0377a.D1);
        if (drmInitDataI != null) {
            int size = this.f45431g.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f45431g.valueAt(i10).n(drmInitDataI);
            }
        }
        if (this.f45450z != com.google.android.exoplayer2.j.f46377b) {
            int size2 = this.f45431g.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f45431g.valueAt(i11).l(this.f45450z);
            }
            this.f45450z = com.google.android.exoplayer2.j.f46377b;
        }
    }

    private void r(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a) throws ParserException {
        int i10 = 0;
        com.google.android.exoplayer2.util.a.j(this.f45429e == null, "Unexpected moov box.");
        DrmInitData drmInitDataI = i(c0377a.D1);
        com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a2 = (com.google.android.exoplayer2.extractor.mp4.a.C0377a) com.google.android.exoplayer2.util.a.g(c0377a.g(com.google.android.exoplayer2.extractor.mp4.a.f45345p0));
        SparseArray<com.google.android.exoplayer2.extractor.mp4.c> sparseArray = new SparseArray<>();
        int size = c0377a2.D1.size();
        long jT = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = c0377a2.D1.get(i11);
            int i12 = bVar.f45377a;
            if (i12 == 1953654136) {
                Pair<Integer, com.google.android.exoplayer2.extractor.mp4.c> pairE = E(bVar.C1);
                sparseArray.put(((Integer) pairE.first).intValue(), (com.google.android.exoplayer2.extractor.mp4.c) pairE.second);
            } else if (i12 == 1835362404) {
                jT = t(bVar.C1);
            }
        }
        List<r> listA = com.google.android.exoplayer2.extractor.mp4.b.A(c0377a, new w(), jT, drmInitDataI, (this.f45428d & 16) != 0, false, new com.google.common.base.n() { // from class: com.google.android.exoplayer2.extractor.mp4.e
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return this.f45427b.m((o) obj);
            }
        });
        int size2 = listA.size();
        if (this.f45431g.size() != 0) {
            com.google.android.exoplayer2.util.a.i(this.f45431g.size() == size2);
            while (i10 < size2) {
                r rVar = listA.get(i10);
                o oVar = rVar.f45587a;
                this.f45431g.get(oVar.f45552a).j(rVar, h(sparseArray, oVar.f45552a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            r rVar2 = listA.get(i10);
            o oVar2 = rVar2.f45587a;
            this.f45431g.put(oVar2.f45552a, new c(this.H.b(i10, oVar2.f45553b), rVar2, h(sparseArray, oVar2.f45552a)));
            this.A = Math.max(this.A, oVar2.f45556e);
            i10++;
        }
        this.H.n();
    }

    private void s(long j10) {
        while (!this.f45441q.isEmpty()) {
            b bVarRemoveFirst = this.f45441q.removeFirst();
            this.f45449y -= bVarRemoveFirst.f45452b;
            long jA = bVarRemoveFirst.f45451a + j10;
            n0 n0Var = this.f45437m;
            if (n0Var != null) {
                jA = n0Var.a(jA);
            }
            for (e0 e0Var : this.I) {
                e0Var.e(jA, 1, bVarRemoveFirst.f45452b, this.f45449y, null);
            }
        }
    }

    private static long t(com.google.android.exoplayer2.util.e0 e0Var) {
        e0Var.S(8);
        return com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o()) == 0 ? e0Var.I() : e0Var.L();
    }

    private static void u(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a, SparseArray<c> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        int size = c0377a.E1.size();
        for (int i11 = 0; i11 < size; i11++) {
            com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a2 = c0377a.E1.get(i11);
            if (c0377a2.f45377a == 1953653094) {
                D(c0377a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void v(com.google.android.exoplayer2.util.e0 e0Var, q qVar) throws ParserException {
        e0Var.S(8);
        int iO = e0Var.o();
        if ((com.google.android.exoplayer2.extractor.mp4.a.b(iO) & 1) == 1) {
            e0Var.T(8);
        }
        int iK = e0Var.K();
        if (iK == 1) {
            qVar.f45572d += com.google.android.exoplayer2.extractor.mp4.a.c(iO) == 0 ? e0Var.I() : e0Var.L();
        } else {
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Unexpected saio entry count: ");
            sb2.append(iK);
            throw ParserException.a(sb2.toString(), null);
        }
    }

    private static void w(p pVar, com.google.android.exoplayer2.util.e0 e0Var, q qVar) throws ParserException {
        int i10;
        int i11 = pVar.f45567d;
        e0Var.S(8);
        if ((com.google.android.exoplayer2.extractor.mp4.a.b(e0Var.o()) & 1) == 1) {
            e0Var.T(8);
        }
        int iG = e0Var.G();
        int iK = e0Var.K();
        int i12 = qVar.f45574f;
        if (iK > i12) {
            StringBuilder sb2 = new StringBuilder(78);
            sb2.append("Saiz sample count ");
            sb2.append(iK);
            sb2.append(" is greater than fragment sample count");
            sb2.append(i12);
            throw ParserException.a(sb2.toString(), null);
        }
        if (iG == 0) {
            boolean[] zArr = qVar.f45581m;
            i10 = 0;
            for (int i13 = 0; i13 < iK; i13++) {
                int iG2 = e0Var.G();
                i10 += iG2;
                zArr[i13] = iG2 > i11;
            }
        } else {
            i10 = (iG * iK) + 0;
            Arrays.fill(qVar.f45581m, 0, iK, iG > i11);
        }
        Arrays.fill(qVar.f45581m, iK, qVar.f45574f, false);
        if (i10 > 0) {
            qVar.d(i10);
        }
    }

    private static void x(com.google.android.exoplayer2.extractor.mp4.a.C0377a c0377a, @p0 String str, q qVar) throws ParserException {
        byte[] bArr = null;
        com.google.android.exoplayer2.util.e0 e0Var = null;
        com.google.android.exoplayer2.util.e0 e0Var2 = null;
        for (int i10 = 0; i10 < c0377a.D1.size(); i10++) {
            com.google.android.exoplayer2.extractor.mp4.a.b bVar = c0377a.D1.get(i10);
            com.google.android.exoplayer2.util.e0 e0Var3 = bVar.C1;
            int i11 = bVar.f45377a;
            if (i11 == 1935828848) {
                e0Var3.S(12);
                if (e0Var3.o() == R) {
                    e0Var = e0Var3;
                }
            } else if (i11 == 1936158820) {
                e0Var3.S(12);
                if (e0Var3.o() == R) {
                    e0Var2 = e0Var3;
                }
            }
        }
        if (e0Var == null || e0Var2 == null) {
            return;
        }
        e0Var.S(8);
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o());
        e0Var.T(4);
        if (iC == 1) {
            e0Var.T(4);
        }
        if (e0Var.o() != 1) {
            throw ParserException.e("Entry count in sbgp != 1 (unsupported).");
        }
        e0Var2.S(8);
        int iC2 = com.google.android.exoplayer2.extractor.mp4.a.c(e0Var2.o());
        e0Var2.T(4);
        if (iC2 == 1) {
            if (e0Var2.I() == 0) {
                throw ParserException.e("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC2 >= 2) {
            e0Var2.T(4);
        }
        if (e0Var2.I() != 1) {
            throw ParserException.e("Entry count in sgpd != 1 (unsupported).");
        }
        e0Var2.T(1);
        int iG = e0Var2.G();
        int i12 = (iG & 240) >> 4;
        int i13 = iG & 15;
        boolean z10 = e0Var2.G() == 1;
        if (z10) {
            int iG2 = e0Var2.G();
            byte[] bArr2 = new byte[16];
            e0Var2.k(bArr2, 0, 16);
            if (iG2 == 0) {
                int iG3 = e0Var2.G();
                bArr = new byte[iG3];
                e0Var2.k(bArr, 0, iG3);
            }
            qVar.f45580l = true;
            qVar.f45582n = new p(z10, str, iG2, bArr2, i12, i13, bArr);
        }
    }

    private static void y(com.google.android.exoplayer2.util.e0 e0Var, int i10, q qVar) throws ParserException {
        e0Var.S(i10 + 8);
        int iB = com.google.android.exoplayer2.extractor.mp4.a.b(e0Var.o());
        if ((iB & 1) != 0) {
            throw ParserException.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iK = e0Var.K();
        if (iK == 0) {
            Arrays.fill(qVar.f45581m, 0, qVar.f45574f, false);
            return;
        }
        int i11 = qVar.f45574f;
        if (iK == i11) {
            Arrays.fill(qVar.f45581m, 0, iK, z10);
            qVar.d(e0Var.a());
            qVar.b(e0Var);
        } else {
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("Senc sample count ");
            sb2.append(iK);
            sb2.append(" is different from fragment sample count");
            sb2.append(i11);
            throw ParserException.a(sb2.toString(), null);
        }
    }

    private static void z(com.google.android.exoplayer2.util.e0 e0Var, q qVar) throws ParserException {
        y(e0Var, 0, qVar);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        int size = this.f45431g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f45431g.valueAt(i10).k();
        }
        this.f45441q.clear();
        this.f45449y = 0;
        this.f45450z = j11;
        this.f45440p.clear();
        e();
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.H = mVar;
        e();
        k();
        o oVar = this.f45429e;
        if (oVar != null) {
            this.f45431g.put(0, new c(mVar.b(0, oVar.f45553b), new r(this.f45429e, new long[0], new int[0], 0, new long[0], new int[0], 0L), new com.google.android.exoplayer2.extractor.mp4.c(0, 0, 0, 0)));
            this.H.n();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        return n.b(lVar);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        while (true) {
            int i10 = this.f45443s;
            if (i10 != 0) {
                if (i10 == 1) {
                    K(lVar);
                } else if (i10 == 2) {
                    L(lVar);
                } else if (M(lVar)) {
                    return 0;
                }
            } else if (!J(lVar)) {
                return -1;
            }
        }
    }

    @p0
    protected o m(@p0 o oVar) {
        return oVar;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
