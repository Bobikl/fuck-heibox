package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: AdtsReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements m {
    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 2;
    private static final int D = 8;
    private static final int E = 256;
    private static final int F = 512;
    private static final int G = 768;
    private static final int H = 1024;
    private static final int I = 10;
    private static final int J = 6;
    private static final byte[] K = {73, 68, org.apache.tools.tar.c.I};
    private static final int L = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f45856v = "AdtsReader";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f45857w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f45858x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f45859y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f45860z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f45861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.d0 f45862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final String f45864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f45865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f45869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f45871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f45872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f45873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f45874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f45875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f45876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f45877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f45878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f45879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f45881u;

    public i(boolean z10) {
        this(z10, null);
    }

    public i(boolean z10, @p0 String str) {
        this.f45862b = new com.google.android.exoplayer2.util.d0(new byte[7]);
        this.f45863c = new com.google.android.exoplayer2.util.e0(Arrays.copyOf(K, 10));
        s();
        this.f45873m = -1;
        this.f45874n = -1;
        this.f45877q = com.google.android.exoplayer2.j.f46377b;
        this.f45879s = com.google.android.exoplayer2.j.f46377b;
        this.f45861a = z10;
        this.f45864d = str;
    }

    @mk.d({"output", "currentOutput", "id3Output"})
    private void a() {
        com.google.android.exoplayer2.util.a.g(this.f45866f);
        u0.k(this.f45880t);
        u0.k(this.f45867g);
    }

    private void g(com.google.android.exoplayer2.util.e0 e0Var) {
        if (e0Var.a() == 0) {
            return;
        }
        this.f45862b.f51383a[0] = e0Var.d()[e0Var.e()];
        this.f45862b.q(2);
        int iH = this.f45862b.h(4);
        int i10 = this.f45874n;
        if (i10 != -1 && iH != i10) {
            q();
            return;
        }
        if (!this.f45872l) {
            this.f45872l = true;
            this.f45873m = this.f45875o;
            this.f45874n = iH;
        }
        t();
    }

    private boolean h(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        e0Var.S(i10 + 1);
        if (!w(e0Var, this.f45862b.f51383a, 1)) {
            return false;
        }
        this.f45862b.q(4);
        int iH = this.f45862b.h(1);
        int i11 = this.f45873m;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f45874n != -1) {
            if (!w(e0Var, this.f45862b.f51383a, 1)) {
                return true;
            }
            this.f45862b.q(2);
            if (this.f45862b.h(4) != this.f45874n) {
                return false;
            }
            e0Var.S(i10 + 2);
        }
        if (!w(e0Var, this.f45862b.f51383a, 4)) {
            return true;
        }
        this.f45862b.q(14);
        int iH2 = this.f45862b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrD = e0Var.d();
        int iF = e0Var.f();
        int i12 = i10 + iH2;
        if (i12 >= iF) {
            return true;
        }
        byte b10 = bArrD[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iF) {
                return true;
            }
            return l((byte) -1, bArrD[i13]) && ((bArrD[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iF) {
            return true;
        }
        if (bArrD[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iF || bArrD[i15] == 51;
    }

    private boolean i(com.google.android.exoplayer2.util.e0 e0Var, byte[] bArr, int i10) {
        int iMin = Math.min(e0Var.a(), i10 - this.f45869i);
        e0Var.k(bArr, this.f45869i, iMin);
        int i11 = this.f45869i + iMin;
        this.f45869i = i11;
        return i11 == i10;
    }

    private void j(com.google.android.exoplayer2.util.e0 e0Var) {
        byte[] bArrD = e0Var.d();
        int iE = e0Var.e();
        int iF = e0Var.f();
        while (iE < iF) {
            int i10 = iE + 1;
            int i11 = bArrD[iE] & 255;
            if (this.f45870j == 512 && l((byte) -1, (byte) i11) && (this.f45872l || h(e0Var, i10 - 2))) {
                this.f45875o = (i11 & 8) >> 3;
                this.f45871k = (i11 & 1) == 0;
                if (this.f45872l) {
                    t();
                } else {
                    r();
                }
                e0Var.S(i10);
                return;
            }
            int i12 = this.f45870j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f45870j = 768;
            } else if (i13 == 511) {
                this.f45870j = 512;
            } else if (i13 == 836) {
                this.f45870j = 1024;
            } else if (i13 == 1075) {
                u();
                e0Var.S(i10);
                return;
            } else if (i12 != 256) {
                this.f45870j = 256;
                i10--;
            }
            iE = i10;
        }
        e0Var.S(iE);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    @mk.m({"output"})
    private void n() throws ParserException {
        this.f45862b.q(0);
        if (this.f45876p) {
            this.f45862b.s(10);
        } else {
            int iH = this.f45862b.h(2) + 1;
            if (iH != 2) {
                StringBuilder sb2 = new StringBuilder(61);
                sb2.append("Detected audio object type: ");
                sb2.append(iH);
                sb2.append(", but assuming AAC LC.");
                com.google.android.exoplayer2.util.u.m(f45856v, sb2.toString());
                iH = 2;
            }
            this.f45862b.s(5);
            byte[] bArrB = com.google.android.exoplayer2.audio.a.b(iH, this.f45874n, this.f45862b.h(3));
            com.google.android.exoplayer2.audio.a.c cVarF = com.google.android.exoplayer2.audio.a.f(bArrB);
            a2 a2VarE = new a2.b().S(this.f45865e).e0(com.google.android.exoplayer2.util.y.A).I(cVarF.f44064c).H(cVarF.f44063b).f0(cVarF.f44062a).T(Collections.singletonList(bArrB)).V(this.f45864d).E();
            this.f45877q = 1024000000 / ((long) a2VarE.A);
            this.f45866f.d(a2VarE);
            this.f45876p = true;
        }
        this.f45862b.s(4);
        int iH2 = (this.f45862b.h(13) - 2) - 5;
        if (this.f45871k) {
            iH2 -= 2;
        }
        v(this.f45866f, this.f45877q, 0, iH2);
    }

    @mk.m({"id3Output"})
    private void o() {
        this.f45867g.c(this.f45863c, 10);
        this.f45863c.S(6);
        v(this.f45867g, 0L, 10, this.f45863c.F() + 10);
    }

    @mk.m({"currentOutput"})
    private void p(com.google.android.exoplayer2.util.e0 e0Var) {
        int iMin = Math.min(e0Var.a(), this.f45878r - this.f45869i);
        this.f45880t.c(e0Var, iMin);
        int i10 = this.f45869i + iMin;
        this.f45869i = i10;
        int i11 = this.f45878r;
        if (i10 == i11) {
            long j10 = this.f45879s;
            if (j10 != com.google.android.exoplayer2.j.f46377b) {
                this.f45880t.e(j10, 1, i11, 0, null);
                this.f45879s += this.f45881u;
            }
            s();
        }
    }

    private void q() {
        this.f45872l = false;
        s();
    }

    private void r() {
        this.f45868h = 1;
        this.f45869i = 0;
    }

    private void s() {
        this.f45868h = 0;
        this.f45869i = 0;
        this.f45870j = 256;
    }

    private void t() {
        this.f45868h = 3;
        this.f45869i = 0;
    }

    private void u() {
        this.f45868h = 2;
        this.f45869i = K.length;
        this.f45878r = 0;
        this.f45863c.S(0);
    }

    private void v(com.google.android.exoplayer2.extractor.e0 e0Var, long j10, int i10, int i11) {
        this.f45868h = 4;
        this.f45869i = i10;
        this.f45880t = e0Var;
        this.f45881u = j10;
        this.f45878r = i11;
    }

    private boolean w(com.google.android.exoplayer2.util.e0 e0Var, byte[] bArr, int i10) {
        if (e0Var.a() < i10) {
            return false;
        }
        e0Var.k(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f45879s = com.google.android.exoplayer2.j.f46377b;
        q();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) throws ParserException {
        a();
        while (e0Var.a() > 0) {
            int i10 = this.f45868h;
            if (i10 == 0) {
                j(e0Var);
            } else if (i10 == 1) {
                g(e0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(e0Var, this.f45862b.f51383a, this.f45871k ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    p(e0Var);
                }
            } else if (i(e0Var, this.f45863c.d(), 10)) {
                o();
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f45879s = j10;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f45865e = eVar.b();
        com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(eVar.c(), 1);
        this.f45866f = e0VarB;
        this.f45880t = e0VarB;
        if (!this.f45861a) {
            this.f45867g = new com.google.android.exoplayer2.extractor.j();
            return;
        }
        eVar.a();
        com.google.android.exoplayer2.extractor.e0 e0VarB2 = mVar.b(eVar.c(), 5);
        this.f45867g = e0VarB2;
        e0VarB2.d(new a2.b().S(eVar.b()).e0(com.google.android.exoplayer2.util.y.f51591p0).E());
    }

    public long k() {
        return this.f45877q;
    }
}
