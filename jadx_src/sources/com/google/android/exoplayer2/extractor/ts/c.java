package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: Ac3Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f45730m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45731n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45732o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f45733p = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.d0 f45734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final String f45736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f45742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a2 f45743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f45744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f45745l;

    public c() {
        this(null);
    }

    public c(@p0 String str) {
        com.google.android.exoplayer2.util.d0 d0Var = new com.google.android.exoplayer2.util.d0(new byte[128]);
        this.f45734a = d0Var;
        this.f45735b = new com.google.android.exoplayer2.util.e0(d0Var.f51383a);
        this.f45739f = 0;
        this.f45745l = com.google.android.exoplayer2.j.f46377b;
        this.f45736c = str;
    }

    private boolean a(com.google.android.exoplayer2.util.e0 e0Var, byte[] bArr, int i10) {
        int iMin = Math.min(e0Var.a(), i10 - this.f45740g);
        e0Var.k(bArr, this.f45740g, iMin);
        int i11 = this.f45740g + iMin;
        this.f45740g = i11;
        return i11 == i10;
    }

    @mk.m({"output"})
    private void g() {
        this.f45734a.q(0);
        com.google.android.exoplayer2.audio.b.C0371b c0371bE = com.google.android.exoplayer2.audio.b.e(this.f45734a);
        a2 a2Var = this.f45743j;
        if (a2Var == null || c0371bE.f44099d != a2Var.f43606z || c0371bE.f44098c != a2Var.A || !u0.c(c0371bE.f44096a, a2Var.f43593m)) {
            a2 a2VarE = new a2.b().S(this.f45737d).e0(c0371bE.f44096a).H(c0371bE.f44099d).f0(c0371bE.f44098c).V(this.f45736c).E();
            this.f45743j = a2VarE;
            this.f45738e.d(a2VarE);
        }
        this.f45744k = c0371bE.f44100e;
        this.f45742i = (((long) c0371bE.f44101f) * 1000000) / ((long) this.f45743j.A);
    }

    private boolean h(com.google.android.exoplayer2.util.e0 e0Var) {
        while (true) {
            if (e0Var.a() <= 0) {
                return false;
            }
            if (this.f45741h) {
                int iG = e0Var.G();
                if (iG == 119) {
                    this.f45741h = false;
                    return true;
                }
                this.f45741h = iG == 11;
            } else {
                this.f45741h = e0Var.G() == 11;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f45739f = 0;
        this.f45740g = 0;
        this.f45741h = false;
        this.f45745l = com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        com.google.android.exoplayer2.util.a.k(this.f45738e);
        while (e0Var.a() > 0) {
            int i10 = this.f45739f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(e0Var.a(), this.f45744k - this.f45740g);
                        this.f45738e.c(e0Var, iMin);
                        int i11 = this.f45740g + iMin;
                        this.f45740g = i11;
                        int i12 = this.f45744k;
                        if (i11 == i12) {
                            long j10 = this.f45745l;
                            if (j10 != com.google.android.exoplayer2.j.f46377b) {
                                this.f45738e.e(j10, 1, i12, 0, null);
                                this.f45745l += this.f45742i;
                            }
                            this.f45739f = 0;
                        }
                    }
                } else if (a(e0Var, this.f45735b.d(), 128)) {
                    g();
                    this.f45735b.S(0);
                    this.f45738e.c(this.f45735b, 128);
                    this.f45739f = 2;
                }
            } else if (h(e0Var)) {
                this.f45739f = 1;
                this.f45735b.d()[0] = 11;
                this.f45735b.d()[1] = 119;
                this.f45740g = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f45745l = j10;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f45737d = eVar.b();
        this.f45738e = mVar.b(eVar.c(), 1);
    }
}
