package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.n0;

/* JADX INFO: compiled from: PesReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w implements i0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f46155p = "PesReader";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f46156q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f46157r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f46158s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f46159t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f46160u = 9;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f46161v = 10;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f46162w = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f46163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.d0 f46164e = new com.google.android.exoplayer2.util.d0(new byte[10]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46165f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n0 f46167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f46168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f46169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f46170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f46171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f46172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f46173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f46174o;

    public w(m mVar) {
        this.f46163d = mVar;
    }

    private boolean d(com.google.android.exoplayer2.util.e0 e0Var, @p0 byte[] bArr, int i10) {
        int iMin = Math.min(e0Var.a(), i10 - this.f46166g);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            e0Var.T(iMin);
        } else {
            e0Var.k(bArr, this.f46166g, iMin);
        }
        int i11 = this.f46166g + iMin;
        this.f46166g = i11;
        return i11 == i10;
    }

    private boolean e() {
        this.f46164e.q(0);
        int iH = this.f46164e.h(24);
        if (iH != 1) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unexpected start code prefix: ");
            sb2.append(iH);
            com.google.android.exoplayer2.util.u.m(f46155p, sb2.toString());
            this.f46172m = -1;
            return false;
        }
        this.f46164e.s(8);
        int iH2 = this.f46164e.h(16);
        this.f46164e.s(5);
        this.f46173n = this.f46164e.g();
        this.f46164e.s(2);
        this.f46168i = this.f46164e.g();
        this.f46169j = this.f46164e.g();
        this.f46164e.s(6);
        int iH3 = this.f46164e.h(8);
        this.f46171l = iH3;
        if (iH2 == 0) {
            this.f46172m = -1;
        } else {
            int i10 = ((iH2 + 6) - 9) - iH3;
            this.f46172m = i10;
            if (i10 < 0) {
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("Found negative packet payload size: ");
                sb3.append(i10);
                com.google.android.exoplayer2.util.u.m(f46155p, sb3.toString());
                this.f46172m = -1;
            }
        }
        return true;
    }

    @mk.m({"timestampAdjuster"})
    private void f() {
        this.f46164e.q(0);
        this.f46174o = com.google.android.exoplayer2.j.f46377b;
        if (this.f46168i) {
            this.f46164e.s(4);
            long jH = ((long) this.f46164e.h(3)) << 30;
            this.f46164e.s(1);
            long jH2 = jH | ((long) (this.f46164e.h(15) << 15));
            this.f46164e.s(1);
            long jH3 = jH2 | ((long) this.f46164e.h(15));
            this.f46164e.s(1);
            if (!this.f46170k && this.f46169j) {
                this.f46164e.s(4);
                long jH4 = ((long) this.f46164e.h(3)) << 30;
                this.f46164e.s(1);
                long jH5 = jH4 | ((long) (this.f46164e.h(15) << 15));
                this.f46164e.s(1);
                long jH6 = jH5 | ((long) this.f46164e.h(15));
                this.f46164e.s(1);
                this.f46167h.b(jH6);
                this.f46170k = true;
            }
            this.f46174o = this.f46167h.b(jH3);
        }
    }

    private void g(int i10) {
        this.f46165f = i10;
        this.f46166g = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.i0
    public void a(n0 n0Var, com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        this.f46167h = n0Var;
        this.f46163d.f(mVar, eVar);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.i0
    public final void b() {
        this.f46165f = 0;
        this.f46166g = 0;
        this.f46170k = false;
        this.f46163d.b();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.i0
    public final void c(com.google.android.exoplayer2.util.e0 e0Var, int i10) throws ParserException {
        com.google.android.exoplayer2.util.a.k(this.f46167h);
        if ((i10 & 1) != 0) {
            int i11 = this.f46165f;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    com.google.android.exoplayer2.util.u.m(f46155p, "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    int i12 = this.f46172m;
                    if (i12 != -1) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i12);
                        sb2.append(" more bytes");
                        com.google.android.exoplayer2.util.u.m(f46155p, sb2.toString());
                    }
                    this.f46163d.d();
                }
            }
            g(1);
        }
        while (e0Var.a() > 0) {
            int i13 = this.f46165f;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        if (d(e0Var, this.f46164e.f51383a, Math.min(10, this.f46171l)) && d(e0Var, null, this.f46171l)) {
                            f();
                            i10 |= this.f46173n ? 4 : 0;
                            this.f46163d.e(this.f46174o, i10);
                            g(3);
                        }
                    } else {
                        if (i13 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = e0Var.a();
                        int i14 = this.f46172m;
                        int i15 = i14 != -1 ? iA - i14 : 0;
                        if (i15 > 0) {
                            iA -= i15;
                            e0Var.R(e0Var.e() + iA);
                        }
                        this.f46163d.c(e0Var);
                        int i16 = this.f46172m;
                        if (i16 != -1) {
                            int i17 = i16 - iA;
                            this.f46172m = i17;
                            if (i17 == 0) {
                                this.f46163d.d();
                                g(1);
                            }
                        }
                    }
                } else if (d(e0Var, this.f46164e.f51383a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                e0Var.T(e0Var.a());
            }
        }
    }
}
