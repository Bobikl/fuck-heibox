package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.n0;

/* JADX INFO: compiled from: MpegAudioReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f46131m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f46132n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f46133o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f46134p = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f46135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0.a f46136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final String f46137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f46138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f46142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f46143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f46144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f46145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f46146l;

    public t() {
        this(null);
    }

    public t(@p0 String str) {
        this.f46140f = 0;
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(4);
        this.f46135a = e0Var;
        e0Var.d()[0] = -1;
        this.f46136b = new n0.a();
        this.f46146l = com.google.android.exoplayer2.j.f46377b;
        this.f46137c = str;
    }

    private void a(com.google.android.exoplayer2.util.e0 e0Var) {
        byte[] bArrD = e0Var.d();
        int iF = e0Var.f();
        for (int iE = e0Var.e(); iE < iF; iE++) {
            byte b10 = bArrD[iE];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f46143i && (b10 & 224) == 224;
            this.f46143i = z10;
            if (z11) {
                e0Var.S(iE + 1);
                this.f46143i = false;
                this.f46135a.d()[1] = bArrD[iE];
                this.f46141g = 2;
                this.f46140f = 1;
                return;
            }
        }
        e0Var.S(iF);
    }

    @mk.m({"output"})
    private void g(com.google.android.exoplayer2.util.e0 e0Var) {
        int iMin = Math.min(e0Var.a(), this.f46145k - this.f46141g);
        this.f46138d.c(e0Var, iMin);
        int i10 = this.f46141g + iMin;
        this.f46141g = i10;
        int i11 = this.f46145k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f46146l;
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f46138d.e(j10, 1, i11, 0, null);
            this.f46146l += this.f46144j;
        }
        this.f46141g = 0;
        this.f46140f = 0;
    }

    @mk.m({"output"})
    private void h(com.google.android.exoplayer2.util.e0 e0Var) {
        int iMin = Math.min(e0Var.a(), 4 - this.f46141g);
        e0Var.k(this.f46135a.d(), this.f46141g, iMin);
        int i10 = this.f46141g + iMin;
        this.f46141g = i10;
        if (i10 < 4) {
            return;
        }
        this.f46135a.S(0);
        if (!this.f46136b.a(this.f46135a.o())) {
            this.f46141g = 0;
            this.f46140f = 1;
            return;
        }
        n0.a aVar = this.f46136b;
        this.f46145k = aVar.f44185c;
        if (!this.f46142h) {
            this.f46144j = (((long) aVar.f44189g) * 1000000) / ((long) aVar.f44186d);
            this.f46138d.d(new a2.b().S(this.f46139e).e0(this.f46136b.f44184b).W(4096).H(this.f46136b.f44187e).f0(this.f46136b.f44186d).V(this.f46137c).E());
            this.f46142h = true;
        }
        this.f46135a.S(0);
        this.f46138d.c(this.f46135a, 4);
        this.f46140f = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f46140f = 0;
        this.f46141g = 0;
        this.f46143i = false;
        this.f46146l = com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        com.google.android.exoplayer2.util.a.k(this.f46138d);
        while (e0Var.a() > 0) {
            int i10 = this.f46140f;
            if (i10 == 0) {
                a(e0Var);
            } else if (i10 == 1) {
                h(e0Var);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(e0Var);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f46146l = j10;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f46139e = eVar.b();
        this.f46138d = mVar.b(eVar.c(), 1);
    }
}
