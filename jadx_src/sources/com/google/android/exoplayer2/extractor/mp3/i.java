package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.p0;
import com.google.android.exoplayer2.audio.n0;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.c0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f45293j = "XingSeeker";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f45294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f45295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f45296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f45297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f45298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private final long[] f45299i;

    private i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    private i(long j10, int i10, long j11, long j12, @p0 long[] jArr) {
        this.f45294d = j10;
        this.f45295e = i10;
        this.f45296f = j11;
        this.f45299i = jArr;
        this.f45297g = j12;
        this.f45298h = j12 != -1 ? j10 + j12 : -1L;
    }

    @p0
    public static i a(long j10, long j11, n0.a aVar, e0 e0Var) {
        int iK;
        int i10 = aVar.f44189g;
        int i11 = aVar.f44186d;
        int iO = e0Var.o();
        if ((iO & 1) != 1 || (iK = e0Var.K()) == 0) {
            return null;
        }
        long jJ1 = u0.j1(iK, ((long) i10) * 1000000, i11);
        if ((iO & 6) != 6) {
            return new i(j11, aVar.f44185c, jJ1);
        }
        long jI = e0Var.I();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = e0Var.G();
        }
        if (j10 != -1) {
            long j12 = j11 + jI;
            if (j10 != j12) {
                StringBuilder sb2 = new StringBuilder(67);
                sb2.append("XING data size mismatch: ");
                sb2.append(j10);
                sb2.append(", ");
                sb2.append(j12);
                u.m(f45293j, sb2.toString());
            }
        }
        return new i(j11, aVar.f44185c, jJ1, jI, jArr);
    }

    private long b(int i10) {
        return (this.f45296f * ((long) i10)) / 100;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.g
    public long c(long j10) {
        long j11 = j10 - this.f45294d;
        if (!e() || j11 <= this.f45295e) {
            return 0L;
        }
        long[] jArr = (long[]) com.google.android.exoplayer2.util.a.k(this.f45299i);
        double d10 = (j11 * 256.0d) / this.f45297g;
        int iJ = u0.j(jArr, (long) d10, true, true);
        long jB = b(iJ);
        long j12 = jArr[iJ];
        int i10 = iJ + 1;
        long jB2 = b(i10);
        long j13 = iJ == 99 ? 256L : jArr[i10];
        return jB + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jB2 - jB));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        if (!e()) {
            return new b0.a(new c0(0L, this.f45294d + ((long) this.f45295e)));
        }
        long jT = u0.t(j10, 0L, this.f45296f);
        double d10 = (jT * 100.0d) / this.f45296f;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) com.google.android.exoplayer2.util.a.k(this.f45299i);
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        return new b0.a(new c0(jT, this.f45294d + u0.t(Math.round((d11 / 256.0d) * this.f45297g), this.f45295e, this.f45297g - 1)));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return this.f45299i != null;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.g
    public long h() {
        return this.f45298h;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f45296f;
    }
}
