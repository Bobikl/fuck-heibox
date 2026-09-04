package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: TsDurationReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f45786j = "TsDurationReader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45787a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f45791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45792f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f45788b = new n0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f45793g = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f45794h = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f45795i = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f45789c = new com.google.android.exoplayer2.util.e0();

    f0(int i10) {
        this.f45787a = i10;
    }

    private int a(com.google.android.exoplayer2.extractor.l lVar) {
        this.f45789c.P(u0.f51541f);
        this.f45790d = true;
        lVar.o();
        return 0;
    }

    private int f(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar, int i10) throws IOException {
        int iMin = (int) Math.min(this.f45787a, lVar.getLength());
        long j10 = 0;
        if (lVar.getPosition() != j10) {
            zVar.f46218a = j10;
            return 1;
        }
        this.f45789c.O(iMin);
        lVar.o();
        lVar.l(this.f45789c.d(), 0, iMin);
        this.f45793g = g(this.f45789c, i10);
        this.f45791e = true;
        return 0;
    }

    private long g(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        int iF = e0Var.f();
        for (int iE = e0Var.e(); iE < iF; iE++) {
            if (e0Var.d()[iE] == 71) {
                long jC = j0.c(e0Var, iE, i10);
                if (jC != com.google.android.exoplayer2.j.f46377b) {
                    return jC;
                }
            }
        }
        return com.google.android.exoplayer2.j.f46377b;
    }

    private int h(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar, int i10) throws IOException {
        long length = lVar.getLength();
        int iMin = (int) Math.min(this.f45787a, length);
        long j10 = length - ((long) iMin);
        if (lVar.getPosition() != j10) {
            zVar.f46218a = j10;
            return 1;
        }
        this.f45789c.O(iMin);
        lVar.o();
        lVar.l(this.f45789c.d(), 0, iMin);
        this.f45794h = i(this.f45789c, i10);
        this.f45792f = true;
        return 0;
    }

    private long i(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        int iE = e0Var.e();
        int iF = e0Var.f();
        for (int i11 = iF - 188; i11 >= iE; i11--) {
            if (j0.b(e0Var.d(), iE, iF, i11)) {
                long jC = j0.c(e0Var, i11, i10);
                if (jC != com.google.android.exoplayer2.j.f46377b) {
                    return jC;
                }
            }
        }
        return com.google.android.exoplayer2.j.f46377b;
    }

    public long b() {
        return this.f45795i;
    }

    public n0 c() {
        return this.f45788b;
    }

    public boolean d() {
        return this.f45790d;
    }

    public int e(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar, int i10) throws IOException {
        if (i10 <= 0) {
            return a(lVar);
        }
        if (!this.f45792f) {
            return h(lVar, zVar, i10);
        }
        if (this.f45794h == com.google.android.exoplayer2.j.f46377b) {
            return a(lVar);
        }
        if (!this.f45791e) {
            return f(lVar, zVar, i10);
        }
        long j10 = this.f45793g;
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            return a(lVar);
        }
        long jB = this.f45788b.b(this.f45794h) - this.f45788b.b(j10);
        this.f45795i = jB;
        if (jB < 0) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Invalid duration: ");
            sb2.append(jB);
            sb2.append(". Using TIME_UNSET instead.");
            com.google.android.exoplayer2.util.u.m(f45786j, sb2.toString());
            this.f45795i = com.google.android.exoplayer2.j.f46377b;
        }
        return a(lVar);
    }
}
