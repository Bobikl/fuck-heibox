package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.p0;
import com.google.android.exoplayer2.audio.n0;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.c0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: VbriSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f45288h = "VbriSeeker";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f45289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f45290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f45291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f45292g;

    private h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f45289d = jArr;
        this.f45290e = jArr2;
        this.f45291f = j10;
        this.f45292g = j11;
    }

    @p0
    public static h a(long j10, long j11, n0.a aVar, e0 e0Var) {
        int iG;
        e0Var.T(10);
        int iO = e0Var.o();
        if (iO <= 0) {
            return null;
        }
        int i10 = aVar.f44186d;
        long jJ1 = u0.j1(iO, 1000000 * ((long) (i10 >= 32000 ? bb.c.b.f30708ij : bb.c.b.f30606e8)), i10);
        int iM = e0Var.M();
        int iM2 = e0Var.M();
        int iM3 = e0Var.M();
        e0Var.T(2);
        long j12 = j11 + ((long) aVar.f44185c);
        long[] jArr = new long[iM];
        long[] jArr2 = new long[iM];
        int i11 = 0;
        long j13 = j11;
        while (i11 < iM) {
            int i12 = iM2;
            long j14 = j12;
            jArr[i11] = (((long) i11) * jJ1) / ((long) iM);
            jArr2[i11] = Math.max(j13, j14);
            if (iM3 == 1) {
                iG = e0Var.G();
            } else if (iM3 == 2) {
                iG = e0Var.M();
            } else if (iM3 == 3) {
                iG = e0Var.J();
            } else {
                if (iM3 != 4) {
                    return null;
                }
                iG = e0Var.K();
            }
            j13 += (long) (iG * i12);
            i11++;
            j12 = j14;
            iM2 = i12;
        }
        if (j10 != -1 && j10 != j13) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("VBRI data size mismatch: ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j13);
            u.m(f45288h, sb2.toString());
        }
        return new h(jArr, jArr2, jJ1, j13);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.g
    public long c(long j10) {
        return this.f45289d[u0.j(this.f45290e, j10, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        int iJ = u0.j(this.f45289d, j10, true, true);
        c0 c0Var = new c0(this.f45289d[iJ], this.f45290e[iJ]);
        if (c0Var.f44855a >= j10 || iJ == this.f45289d.length - 1) {
            return new b0.a(c0Var);
        }
        int i10 = iJ + 1;
        return new b0.a(c0Var, new c0(this.f45289d[i10], this.f45290e[i10]));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.g
    public long h() {
        return this.f45292g;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f45291f;
    }
}
