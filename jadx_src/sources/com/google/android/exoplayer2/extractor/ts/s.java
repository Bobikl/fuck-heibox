package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import java.util.Collections;

/* JADX INFO: compiled from: LatmReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s implements m {
    private static final int A = 86;
    private static final int B = 224;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f46105v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f46106w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f46107x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f46108y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f46109z = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final String f46110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f46111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.d0 f46112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f46113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a2 f46115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f46118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f46119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f46120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f46121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f46122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f46123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f46124o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f46125p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f46126q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f46127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f46128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f46129t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private String f46130u;

    public s(@p0 String str) {
        this.f46110a = str;
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(1024);
        this.f46111b = e0Var;
        this.f46112c = new com.google.android.exoplayer2.util.d0(e0Var.d());
        this.f46120k = com.google.android.exoplayer2.j.f46377b;
    }

    private static long a(com.google.android.exoplayer2.util.d0 d0Var) {
        return d0Var.h((d0Var.h(2) + 1) * 8);
    }

    @mk.m({"output"})
    private void g(com.google.android.exoplayer2.util.d0 d0Var) throws ParserException {
        if (!d0Var.g()) {
            this.f46121l = true;
            l(d0Var);
        } else if (!this.f46121l) {
            return;
        }
        if (this.f46122m != 0) {
            throw ParserException.a(null, null);
        }
        if (this.f46123n != 0) {
            throw ParserException.a(null, null);
        }
        k(d0Var, j(d0Var));
        if (this.f46125p) {
            d0Var.s((int) this.f46126q);
        }
    }

    private int h(com.google.android.exoplayer2.util.d0 d0Var) throws ParserException {
        int iB = d0Var.b();
        com.google.android.exoplayer2.audio.a.c cVarE = com.google.android.exoplayer2.audio.a.e(d0Var, true);
        this.f46130u = cVarE.f44064c;
        this.f46127r = cVarE.f44062a;
        this.f46129t = cVarE.f44063b;
        return iB - d0Var.b();
    }

    private void i(com.google.android.exoplayer2.util.d0 d0Var) {
        int iH = d0Var.h(3);
        this.f46124o = iH;
        if (iH == 0) {
            d0Var.s(8);
            return;
        }
        if (iH == 1) {
            d0Var.s(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            d0Var.s(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            d0Var.s(1);
        }
    }

    private int j(com.google.android.exoplayer2.util.d0 d0Var) throws ParserException {
        int iH;
        if (this.f46124o != 0) {
            throw ParserException.a(null, null);
        }
        int i10 = 0;
        do {
            iH = d0Var.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    @mk.m({"output"})
    private void k(com.google.android.exoplayer2.util.d0 d0Var, int i10) {
        int iE = d0Var.e();
        if ((iE & 7) == 0) {
            this.f46111b.S(iE >> 3);
        } else {
            d0Var.i(this.f46111b.d(), 0, i10 * 8);
            this.f46111b.S(0);
        }
        this.f46113d.c(this.f46111b, i10);
        long j10 = this.f46120k;
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f46113d.e(j10, 1, i10, 0, null);
            this.f46120k += this.f46128s;
        }
    }

    @mk.m({"output"})
    private void l(com.google.android.exoplayer2.util.d0 d0Var) throws ParserException {
        boolean zG;
        int iH = d0Var.h(1);
        int iH2 = iH == 1 ? d0Var.h(1) : 0;
        this.f46122m = iH2;
        if (iH2 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 1) {
            a(d0Var);
        }
        if (!d0Var.g()) {
            throw ParserException.a(null, null);
        }
        this.f46123n = d0Var.h(6);
        int iH3 = d0Var.h(4);
        int iH4 = d0Var.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 0) {
            int iE = d0Var.e();
            int iH5 = h(d0Var);
            d0Var.q(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            d0Var.i(bArr, 0, iH5);
            a2 a2VarE = new a2.b().S(this.f46114e).e0(com.google.android.exoplayer2.util.y.A).I(this.f46130u).H(this.f46129t).f0(this.f46127r).T(Collections.singletonList(bArr)).V(this.f46110a).E();
            if (!a2VarE.equals(this.f46115f)) {
                this.f46115f = a2VarE;
                this.f46128s = 1024000000 / ((long) a2VarE.A);
                this.f46113d.d(a2VarE);
            }
        } else {
            d0Var.s(((int) a(d0Var)) - h(d0Var));
        }
        i(d0Var);
        boolean zG2 = d0Var.g();
        this.f46125p = zG2;
        this.f46126q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f46126q = a(d0Var);
            } else {
                do {
                    zG = d0Var.g();
                    this.f46126q = (this.f46126q << 8) + ((long) d0Var.h(8));
                } while (zG);
            }
        }
        if (d0Var.g()) {
            d0Var.s(8);
        }
    }

    private void m(int i10) {
        this.f46111b.O(i10);
        this.f46112c.o(this.f46111b.d());
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f46116g = 0;
        this.f46120k = com.google.android.exoplayer2.j.f46377b;
        this.f46121l = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) throws ParserException {
        com.google.android.exoplayer2.util.a.k(this.f46113d);
        while (e0Var.a() > 0) {
            int i10 = this.f46116g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iG = e0Var.G();
                    if ((iG & 224) == 224) {
                        this.f46119j = iG;
                        this.f46116g = 2;
                    } else if (iG != 86) {
                        this.f46116g = 0;
                    }
                } else if (i10 == 2) {
                    int iG2 = ((this.f46119j & (-225)) << 8) | e0Var.G();
                    this.f46118i = iG2;
                    if (iG2 > this.f46111b.d().length) {
                        m(this.f46118i);
                    }
                    this.f46117h = 0;
                    this.f46116g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(e0Var.a(), this.f46118i - this.f46117h);
                    e0Var.k(this.f46112c.f51383a, this.f46117h, iMin);
                    int i11 = this.f46117h + iMin;
                    this.f46117h = i11;
                    if (i11 == this.f46118i) {
                        this.f46112c.q(0);
                        g(this.f46112c);
                        this.f46116g = 0;
                    }
                }
            } else if (e0Var.G() == 86) {
                this.f46116g = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f46120k = j10;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f46113d = mVar.b(eVar.c(), 1);
        this.f46114e = eVar.b();
    }
}
