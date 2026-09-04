package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: IndexSeekMap.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f46214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f46215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f46216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f46217g;

    public y(long[] jArr, long[] jArr2, long j10) {
        com.google.android.exoplayer2.util.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f46217g = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f46214d = jArr;
            this.f46215e = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f46214d = jArr3;
            long[] jArr4 = new long[i10];
            this.f46215e = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f46216f = j10;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        if (!this.f46217g) {
            return new b0.a(c0.f44854c);
        }
        int iJ = u0.j(this.f46215e, j10, true, true);
        c0 c0Var = new c0(this.f46215e[iJ], this.f46214d[iJ]);
        if (c0Var.f44855a == j10 || iJ == this.f46215e.length - 1) {
            return new b0.a(c0Var);
        }
        int i10 = iJ + 1;
        return new b0.a(c0Var, new c0(this.f46215e[i10], this.f46214d[i10]));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return this.f46217g;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f46216f;
    }
}
