package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.a2;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PlaybackStats.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t1 {
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 5;
    public static final int U = 6;
    public static final int V = 7;
    public static final int W = 9;
    public static final int X = 10;
    public static final int Y = 11;
    public static final int Z = 12;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f43832a0 = 13;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f43833b0 = 14;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f43834c0 = 15;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    static final int f43835d0 = 16;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final t1 f43836e0 = W(new t1[0]);
    public final int A;
    public final long B;
    public final int C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final int I;
    public final int J;
    public final int K;
    public final List<a> L;
    public final List<a> M;
    private final long[] N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f43838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<long[]> f43839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f43844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f43845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f43846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f43847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f43848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f43849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f43850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f43851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f43852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<b> f43853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<b> f43854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f43855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f43856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f43857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f43858v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f43859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f43860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f43861y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f43862z;

    /* JADX INFO: compiled from: PlaybackStats.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p1.b f43863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Exception f43864b;

        public a(p1.b bVar, Exception exc) {
            this.f43863a = bVar;
            this.f43864b = exc;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f43863a.equals(aVar.f43863a)) {
                return this.f43864b.equals(aVar.f43864b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f43863a.hashCode() * 31) + this.f43864b.hashCode();
        }
    }

    /* JADX INFO: compiled from: PlaybackStats.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p1.b f43865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final a2 f43866b;

        public b(p1.b bVar, @androidx.annotation.p0 a2 a2Var) {
            this.f43865a = bVar;
            this.f43866b = a2Var;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f43865a.equals(bVar.f43865a)) {
                return false;
            }
            a2 a2Var = this.f43866b;
            a2 a2Var2 = bVar.f43866b;
            if (a2Var != null) {
                return a2Var.equals(a2Var2);
            }
            return a2Var2 == null;
        }

        public int hashCode() {
            int iHashCode = this.f43865a.hashCode() * 31;
            a2 a2Var = this.f43866b;
            return iHashCode + (a2Var != null ? a2Var.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: PlaybackStats.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p1.b f43867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43868b;

        public c(p1.b bVar, int i10) {
            this.f43867a = bVar;
            this.f43868b = i10;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f43868b != cVar.f43868b) {
                return false;
            }
            return this.f43867a.equals(cVar.f43867a);
        }

        public int hashCode() {
            return (this.f43867a.hashCode() * 31) + this.f43868b;
        }
    }

    t1(int i10, long[] jArr, List<c> list, List<long[]> list2, long j10, int i11, int i12, int i13, int i14, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, List<b> list3, List<b> list4, long j13, long j14, long j15, long j16, long j17, long j18, int i21, int i22, int i23, long j19, int i24, long j20, long j21, long j22, long j23, long j24, int i25, int i26, int i27, List<a> list5, List<a> list6) {
        this.f43837a = i10;
        this.N = jArr;
        this.f43838b = Collections.unmodifiableList(list);
        this.f43839c = Collections.unmodifiableList(list2);
        this.f43840d = j10;
        this.f43841e = i11;
        this.f43842f = i12;
        this.f43843g = i13;
        this.f43844h = i14;
        this.f43845i = j11;
        this.f43846j = i15;
        this.f43847k = i16;
        this.f43848l = i17;
        this.f43849m = i18;
        this.f43850n = i19;
        this.f43851o = j12;
        this.f43852p = i20;
        this.f43853q = Collections.unmodifiableList(list3);
        this.f43854r = Collections.unmodifiableList(list4);
        this.f43855s = j13;
        this.f43856t = j14;
        this.f43857u = j15;
        this.f43858v = j16;
        this.f43859w = j17;
        this.f43860x = j18;
        this.f43861y = i21;
        this.f43862z = i22;
        this.A = i23;
        this.B = j19;
        this.C = i24;
        this.D = j20;
        this.E = j21;
        this.F = j22;
        this.G = j23;
        this.H = j24;
        this.I = i25;
        this.J = i26;
        this.K = i27;
        this.L = Collections.unmodifiableList(list5);
        this.M = Collections.unmodifiableList(list6);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0111  */
    /* JADX WARN: Code duplicated, block: B:37:0x0119  */
    /* JADX WARN: Code duplicated, block: B:40:0x0123  */
    /* JADX WARN: Code duplicated, block: B:41:0x0128  */
    /* JADX WARN: Code duplicated, block: B:43:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130 A[SYNTHETIC] */
    public static t1 W(t1... t1VarArr) {
        int i10;
        int i11;
        long j10;
        long j11;
        int i12 = 16;
        long[] jArr = new long[16];
        int length = t1VarArr.length;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long jMax = com.google.android.exoplayer2.j.f46377b;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        long jMin = com.google.android.exoplayer2.j.f46377b;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        long j22 = com.google.android.exoplayer2.j.f46377b;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j23 = -1;
        int i27 = 0;
        long j24 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = 0;
        while (i15 < length) {
            t1 t1Var = t1VarArr[i15];
            int i32 = i13 + t1Var.f43837a;
            for (int i33 = 0; i33 < i12; i33++) {
                jArr[i33] = jArr[i33] + t1Var.N[i33];
            }
            if (jMin == com.google.android.exoplayer2.j.f46377b) {
                jMin = t1Var.f43840d;
                i10 = length;
            } else {
                i10 = length;
                long j25 = t1Var.f43840d;
                if (j25 != com.google.android.exoplayer2.j.f46377b) {
                    jMin = Math.min(jMin, j25);
                }
            }
            i14 += t1Var.f43841e;
            i16 += t1Var.f43842f;
            i17 += t1Var.f43843g;
            i18 += t1Var.f43844h;
            if (j22 == com.google.android.exoplayer2.j.f46377b) {
                j22 = t1Var.f43845i;
            } else {
                long j26 = t1Var.f43845i;
                if (j26 != com.google.android.exoplayer2.j.f46377b) {
                    j22 += j26;
                }
            }
            i19 += t1Var.f43846j;
            i20 += t1Var.f43847k;
            i21 += t1Var.f43848l;
            i22 += t1Var.f43849m;
            i23 += t1Var.f43850n;
            if (jMax == com.google.android.exoplayer2.j.f46377b) {
                jMax = t1Var.f43851o;
            } else {
                long j27 = t1Var.f43851o;
                if (j27 != com.google.android.exoplayer2.j.f46377b) {
                    jMax = Math.max(jMax, j27);
                }
            }
            i24 += t1Var.f43852p;
            j12 += t1Var.f43855s;
            j13 += t1Var.f43856t;
            j14 += t1Var.f43857u;
            j15 += t1Var.f43858v;
            j16 += t1Var.f43859w;
            j17 += t1Var.f43860x;
            i25 += t1Var.f43861y;
            i26 += t1Var.f43862z;
            int i34 = i30;
            if (i34 == -1) {
                i34 = t1Var.A;
            } else {
                int i35 = t1Var.A;
                if (i35 != -1) {
                    i30 = i34 + i35;
                }
                if (j23 == -1) {
                    i11 = i32;
                    j23 = t1Var.B;
                } else {
                    i11 = i32;
                    j10 = t1Var.B;
                    if (j10 != -1) {
                        j23 += j10;
                    }
                }
                i27 += t1Var.C;
                if (j24 == -1) {
                    j24 = t1Var.D;
                } else {
                    j11 = t1Var.D;
                    if (j11 != -1) {
                        j24 += j11;
                    }
                }
                j18 += t1Var.E;
                j19 += t1Var.F;
                j20 += t1Var.G;
                j21 += t1Var.H;
                i28 += t1Var.I;
                i29 += t1Var.J;
                i31 += t1Var.K;
                i15++;
                i13 = i11;
                length = i10;
                i12 = 16;
            }
            i30 = i34;
            if (j23 == -1) {
                i11 = i32;
                j23 = t1Var.B;
            } else {
                i11 = i32;
                j10 = t1Var.B;
                if (j10 != -1) {
                    j23 += j10;
                }
            }
            i27 += t1Var.C;
            if (j24 == -1) {
                j24 = t1Var.D;
            } else {
                j11 = t1Var.D;
                if (j11 != -1) {
                    j24 += j11;
                }
            }
            j18 += t1Var.E;
            j19 += t1Var.F;
            j20 += t1Var.G;
            j21 += t1Var.H;
            i28 += t1Var.I;
            i29 += t1Var.J;
            i31 += t1Var.K;
            i15++;
            i13 = i11;
            length = i10;
            i12 = 16;
        }
        return new t1(i13, jArr, Collections.emptyList(), Collections.emptyList(), jMin, i14, i16, i17, i18, j22, i19, i20, i21, i22, i23, jMax, i24, Collections.emptyList(), Collections.emptyList(), j12, j13, j14, j15, j16, j17, i25, i26, i30, j23, i27, j24, j18, j19, j20, j21, i28, i29, i31, Collections.emptyList(), Collections.emptyList());
    }

    public float A() {
        return 1.0f / e();
    }

    public float B() {
        return 1.0f / H();
    }

    public float C() {
        return 1.0f / K();
    }

    public int D() {
        long j10 = this.f43857u;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.f43858v / j10);
    }

    public int E() {
        long j10 = this.f43855s;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.f43856t / j10);
    }

    public long F() {
        return this.f43841e == 0 ? com.google.android.exoplayer2.j.f46377b : U() / ((long) this.f43841e);
    }

    public long G(long j10) {
        if (this.f43839c.isEmpty()) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        int i10 = 0;
        while (i10 < this.f43839c.size() && this.f43839c.get(i10)[0] <= j10) {
            i10++;
        }
        if (i10 == 0) {
            return this.f43839c.get(0)[1];
        }
        if (i10 == this.f43839c.size()) {
            List<long[]> list = this.f43839c;
            return list.get(list.size() - 1)[1];
        }
        int i11 = i10 - 1;
        long j11 = this.f43839c.get(i11)[0];
        long j12 = this.f43839c.get(i11)[1];
        long j13 = this.f43839c.get(i10)[0];
        long j14 = this.f43839c.get(i10)[1];
        long j15 = j13 - j11;
        if (j15 == 0) {
            return j12;
        }
        return j12 + ((long) ((j14 - j12) * ((j10 - j11) / j15)));
    }

    public float H() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.K * 1000.0f) / jR;
    }

    public int I(long j10) {
        int i10 = 0;
        for (c cVar : this.f43838b) {
            if (cVar.f43867a.f43781a > j10) {
                break;
            }
            i10 = cVar.f43868b;
        }
        return i10;
    }

    public long J(int i10) {
        return this.N[i10];
    }

    public float K() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.f43850n * 1000.0f) / jR;
    }

    public float L() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return S() / jQ;
    }

    public float M() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return T() / jQ;
    }

    public long N() {
        long j10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            j10 += this.N[i10];
        }
        return j10;
    }

    public long O() {
        return J(2);
    }

    public long P() {
        return J(4) + J(7);
    }

    public long Q() {
        return R() + U();
    }

    public long R() {
        return J(3);
    }

    public long S() {
        return J(6);
    }

    public long T() {
        return J(5);
    }

    public long U() {
        return J(2) + J(6) + J(5);
    }

    public float V() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return U() / jQ;
    }

    public float a() {
        int i10 = this.f43842f;
        int i11 = this.f43837a;
        int i12 = this.f43841e;
        int i13 = i10 - (i11 - i12);
        if (i12 == 0) {
            return 0.0f;
        }
        return i13 / i12;
    }

    public float b() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.H * 1000.0f) / jR;
    }

    public float c() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.G * 1000.0f) / jR;
    }

    public float d() {
        int i10 = this.f43841e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f43843g / i10;
    }

    public float e() {
        long jR = R();
        if (jR == 0) {
            return 0.0f;
        }
        return (this.J * 1000.0f) / jR;
    }

    public float f() {
        int i10 = this.f43841e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.I / i10;
    }

    public float g() {
        long jQ = Q();
        if (jQ == 0) {
            return 0.0f;
        }
        return O() / jQ;
    }

    public int h() {
        long j10 = this.f43859w;
        if (j10 == 0) {
            return -1;
        }
        return (int) (this.f43860x / j10);
    }

    public int i() {
        long j10 = this.E;
        if (j10 == 0) {
            return -1;
        }
        return (int) ((this.F * 8000) / j10);
    }

    public long j() {
        return this.f43837a == 0 ? com.google.android.exoplayer2.j.f46377b : N() / ((long) this.f43837a);
    }

    public int k() {
        int i10 = this.C;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.D / ((long) i10));
    }

    public int l() {
        int i10 = this.f43862z;
        if (i10 == 0) {
            return -1;
        }
        return (int) (this.B / ((long) i10));
    }

    public int m() {
        int i10 = this.f43861y;
        if (i10 == 0) {
            return -1;
        }
        return this.A / i10;
    }

    public long n() {
        int i10 = this.f43846j;
        return i10 == 0 ? com.google.android.exoplayer2.j.f46377b : this.f43845i / ((long) i10);
    }

    public float o() {
        int i10 = this.f43841e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.K / i10;
    }

    public float p() {
        int i10 = this.f43841e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f43848l / i10;
    }

    public float q() {
        int i10 = this.f43841e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f43847k / i10;
    }

    public long r() {
        return this.f43841e == 0 ? com.google.android.exoplayer2.j.f46377b : P() / ((long) this.f43841e);
    }

    public long s() {
        return this.f43841e == 0 ? com.google.android.exoplayer2.j.f46377b : Q() / ((long) this.f43841e);
    }

    public long t() {
        return this.f43841e == 0 ? com.google.android.exoplayer2.j.f46377b : R() / ((long) this.f43841e);
    }

    public float u() {
        int i10 = this.f43841e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f43850n / i10;
    }

    public long v() {
        return this.f43841e == 0 ? com.google.android.exoplayer2.j.f46377b : S() / ((long) this.f43841e);
    }

    public float w() {
        int i10 = this.f43841e;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f43849m / i10;
    }

    public long x() {
        return this.f43841e == 0 ? com.google.android.exoplayer2.j.f46377b : T() / ((long) this.f43841e);
    }

    public long y() {
        return this.f43850n == 0 ? com.google.android.exoplayer2.j.f46377b : (J(6) + J(7)) / ((long) this.f43850n);
    }

    public long z() {
        return this.f43849m == 0 ? com.google.android.exoplayer2.j.f46377b : T() / ((long) this.f43849m);
    }
}
