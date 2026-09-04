package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: Ac4Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45770n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45771o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f45772p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.d0 f45773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final String f45775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f45782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a2 f45783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f45784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f45785m;

    public f() {
        this(null);
    }

    public f(@p0 String str) {
        com.google.android.exoplayer2.util.d0 d0Var = new com.google.android.exoplayer2.util.d0(new byte[16]);
        this.f45773a = d0Var;
        this.f45774b = new com.google.android.exoplayer2.util.e0(d0Var.f51383a);
        this.f45778f = 0;
        this.f45779g = 0;
        this.f45780h = false;
        this.f45781i = false;
        this.f45785m = com.google.android.exoplayer2.j.f46377b;
        this.f45775c = str;
    }

    private boolean a(com.google.android.exoplayer2.util.e0 e0Var, byte[] bArr, int i10) {
        int iMin = Math.min(e0Var.a(), i10 - this.f45779g);
        e0Var.k(bArr, this.f45779g, iMin);
        int i11 = this.f45779g + iMin;
        this.f45779g = i11;
        return i11 == i10;
    }

    @mk.m({"output"})
    private void g() {
        this.f45773a.q(0);
        com.google.android.exoplayer2.audio.c.b bVarD = com.google.android.exoplayer2.audio.c.d(this.f45773a);
        a2 a2Var = this.f45783k;
        if (a2Var == null || bVarD.f44111c != a2Var.f43606z || bVarD.f44110b != a2Var.A || !com.google.android.exoplayer2.util.y.O.equals(a2Var.f43593m)) {
            a2 a2VarE = new a2.b().S(this.f45776d).e0(com.google.android.exoplayer2.util.y.O).H(bVarD.f44111c).f0(bVarD.f44110b).V(this.f45775c).E();
            this.f45783k = a2VarE;
            this.f45777e.d(a2VarE);
        }
        this.f45784l = bVarD.f44112d;
        this.f45782j = (((long) bVarD.f44113e) * 1000000) / ((long) this.f45783k.A);
    }

    private boolean h(com.google.android.exoplayer2.util.e0 e0Var) {
        while (true) {
            if (e0Var.a() <= 0) {
                return false;
            }
            if (this.f45780h) {
                int iG = e0Var.G();
                this.f45780h = iG == 172;
                if (iG == 64 || iG == 65) {
                    this.f45781i = iG == 65;
                    return true;
                }
            } else {
                this.f45780h = e0Var.G() == 172;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f45778f = 0;
        this.f45779g = 0;
        this.f45780h = false;
        this.f45781i = false;
        this.f45785m = com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        com.google.android.exoplayer2.util.a.k(this.f45777e);
        while (e0Var.a() > 0) {
            int i10 = this.f45778f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(e0Var.a(), this.f45784l - this.f45779g);
                        this.f45777e.c(e0Var, iMin);
                        int i11 = this.f45779g + iMin;
                        this.f45779g = i11;
                        int i12 = this.f45784l;
                        if (i11 == i12) {
                            long j10 = this.f45785m;
                            if (j10 != com.google.android.exoplayer2.j.f46377b) {
                                this.f45777e.e(j10, 1, i12, 0, null);
                                this.f45785m += this.f45782j;
                            }
                            this.f45778f = 0;
                        }
                    }
                } else if (a(e0Var, this.f45774b.d(), 16)) {
                    g();
                    this.f45774b.S(0);
                    this.f45777e.c(this.f45774b, 16);
                    this.f45778f = 2;
                }
            } else if (h(e0Var)) {
                this.f45778f = 1;
                this.f45774b.d()[0] = -84;
                this.f45774b.d()[1] = (byte) (this.f45781i ? 65 : 64);
                this.f45779g = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f45785m = j10;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f45776d = eVar.b();
        this.f45777e = mVar.b(eVar.c(), 1);
    }
}
