package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: DtsReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f45908l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f45909m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45910n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45911o = 18;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final String f45913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45915d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f45919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a2 f45920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45921j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45912a = new com.google.android.exoplayer2.util.e0(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45916e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f45922k = com.google.android.exoplayer2.j.f46377b;

    public k(@p0 String str) {
        this.f45913b = str;
    }

    private boolean a(com.google.android.exoplayer2.util.e0 e0Var, byte[] bArr, int i10) {
        int iMin = Math.min(e0Var.a(), i10 - this.f45917f);
        e0Var.k(bArr, this.f45917f, iMin);
        int i11 = this.f45917f + iMin;
        this.f45917f = i11;
        return i11 == i10;
    }

    @mk.m({"output"})
    private void g() {
        byte[] bArrD = this.f45912a.d();
        if (this.f45920i == null) {
            a2 a2VarG = com.google.android.exoplayer2.audio.j0.g(bArrD, this.f45914c, this.f45913b, null);
            this.f45920i = a2VarG;
            this.f45915d.d(a2VarG);
        }
        this.f45921j = com.google.android.exoplayer2.audio.j0.a(bArrD);
        this.f45919h = (int) ((((long) com.google.android.exoplayer2.audio.j0.f(bArrD)) * 1000000) / ((long) this.f45920i.A));
    }

    private boolean h(com.google.android.exoplayer2.util.e0 e0Var) {
        while (e0Var.a() > 0) {
            int i10 = this.f45918g << 8;
            this.f45918g = i10;
            int iG = i10 | e0Var.G();
            this.f45918g = iG;
            if (com.google.android.exoplayer2.audio.j0.d(iG)) {
                byte[] bArrD = this.f45912a.d();
                int i11 = this.f45918g;
                bArrD[0] = (byte) ((i11 >> 24) & 255);
                bArrD[1] = (byte) ((i11 >> 16) & 255);
                bArrD[2] = (byte) ((i11 >> 8) & 255);
                bArrD[3] = (byte) (i11 & 255);
                this.f45917f = 4;
                this.f45918g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f45916e = 0;
        this.f45917f = 0;
        this.f45918g = 0;
        this.f45922k = com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        com.google.android.exoplayer2.util.a.k(this.f45915d);
        while (e0Var.a() > 0) {
            int i10 = this.f45916e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(e0Var.a(), this.f45921j - this.f45917f);
                    this.f45915d.c(e0Var, iMin);
                    int i11 = this.f45917f + iMin;
                    this.f45917f = i11;
                    int i12 = this.f45921j;
                    if (i11 == i12) {
                        long j10 = this.f45922k;
                        if (j10 != com.google.android.exoplayer2.j.f46377b) {
                            this.f45915d.e(j10, 1, i12, 0, null);
                            this.f45922k += this.f45919h;
                        }
                        this.f45916e = 0;
                    }
                } else if (a(e0Var, this.f45912a.d(), 18)) {
                    g();
                    this.f45912a.S(0);
                    this.f45915d.c(this.f45912a, 18);
                    this.f45916e = 2;
                }
            } else if (h(e0Var)) {
                this.f45916e = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f45922k = j10;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f45914c = eVar.b();
        this.f45915d = mVar.b(eVar.c(), 1);
    }
}
