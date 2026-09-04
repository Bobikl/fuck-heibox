package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.audio.q0;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: PsDurationReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f46180i = "PsDurationReader";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f46181j = 20000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46186e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f46182a = new n0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f46187f = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f46188g = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f46189h = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f46183b = new com.google.android.exoplayer2.util.e0();

    y() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f46183b.P(u0.f51541f);
        this.f46184c = true;
        lVar.o();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        int iMin = (int) Math.min(q0.f44202v, lVar.getLength());
        long j10 = 0;
        if (lVar.getPosition() != j10) {
            zVar.f46218a = j10;
            return 1;
        }
        this.f46183b.O(iMin);
        lVar.o();
        lVar.l(this.f46183b.d(), 0, iMin);
        this.f46187f = i(this.f46183b);
        this.f46185d = true;
        return 0;
    }

    private long i(com.google.android.exoplayer2.util.e0 e0Var) {
        int iF = e0Var.f();
        for (int iE = e0Var.e(); iE < iF - 3; iE++) {
            if (f(e0Var.d(), iE) == 442) {
                e0Var.S(iE + 4);
                long jL = l(e0Var);
                if (jL != com.google.android.exoplayer2.j.f46377b) {
                    return jL;
                }
            }
        }
        return com.google.android.exoplayer2.j.f46377b;
    }

    private int j(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        long length = lVar.getLength();
        int iMin = (int) Math.min(q0.f44202v, length);
        long j10 = length - ((long) iMin);
        if (lVar.getPosition() != j10) {
            zVar.f46218a = j10;
            return 1;
        }
        this.f46183b.O(iMin);
        lVar.o();
        lVar.l(this.f46183b.d(), 0, iMin);
        this.f46188g = k(this.f46183b);
        this.f46186e = true;
        return 0;
    }

    private long k(com.google.android.exoplayer2.util.e0 e0Var) {
        int iE = e0Var.e();
        for (int iF = e0Var.f() - 4; iF >= iE; iF--) {
            if (f(e0Var.d(), iF) == 442) {
                e0Var.S(iF + 4);
                long jL = l(e0Var);
                if (jL != com.google.android.exoplayer2.j.f46377b) {
                    return jL;
                }
            }
        }
        return com.google.android.exoplayer2.j.f46377b;
    }

    public static long l(com.google.android.exoplayer2.util.e0 e0Var) {
        int iE = e0Var.e();
        if (e0Var.a() < 9) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        byte[] bArr = new byte[9];
        e0Var.k(bArr, 0, 9);
        e0Var.S(iE);
        return !a(bArr) ? com.google.android.exoplayer2.j.f46377b : m(bArr);
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f46189h;
    }

    public n0 d() {
        return this.f46182a;
    }

    public boolean e() {
        return this.f46184c;
    }

    public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        if (!this.f46186e) {
            return j(lVar, zVar);
        }
        if (this.f46188g == com.google.android.exoplayer2.j.f46377b) {
            return b(lVar);
        }
        if (!this.f46185d) {
            return h(lVar, zVar);
        }
        long j10 = this.f46187f;
        if (j10 == com.google.android.exoplayer2.j.f46377b) {
            return b(lVar);
        }
        long jB = this.f46182a.b(this.f46188g) - this.f46182a.b(j10);
        this.f46189h = jB;
        if (jB < 0) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Invalid duration: ");
            sb2.append(jB);
            sb2.append(". Using TIME_UNSET instead.");
            com.google.android.exoplayer2.util.u.m(f46180i, sb2.toString());
            this.f46189h = com.google.android.exoplayer2.j.f46377b;
        }
        return b(lVar);
    }
}
