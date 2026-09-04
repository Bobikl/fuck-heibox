package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.c0;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f45262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f45263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f45264f;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f45262d = jArr;
        this.f45263e = jArr2;
        this.f45264f = j10 == com.google.android.exoplayer2.j.f46377b ? u0.U0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, MlltFrame mlltFrame, long j11) {
        int length = mlltFrame.f46923f.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (mlltFrame.f46921d + mlltFrame.f46923f[i12]);
            j12 += (long) (mlltFrame.f46922e + mlltFrame.f46924g[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        int iJ = u0.j(jArr, j10, true, true);
        long j11 = jArr[iJ];
        long j12 = jArr2[iJ];
        int i10 = iJ + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.g
    public long c(long j10) {
        return u0.U0(((Long) b(j10, this.f45262d, this.f45263e).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        Pair<Long, Long> pairB = b(u0.B1(u0.t(j10, 0L, this.f45264f)), this.f45263e, this.f45262d);
        return new b0.a(new c0(u0.U0(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.g
    public long h() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f45264f;
    }
}
