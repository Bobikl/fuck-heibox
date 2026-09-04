package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: TrackSampleTable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f45587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f45589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f45590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f45592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f45593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f45594h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        com.google.android.exoplayer2.util.a.a(iArr.length == jArr2.length);
        com.google.android.exoplayer2.util.a.a(jArr.length == jArr2.length);
        com.google.android.exoplayer2.util.a.a(iArr2.length == jArr2.length);
        this.f45587a = oVar;
        this.f45589c = jArr;
        this.f45590d = iArr;
        this.f45591e = i10;
        this.f45592f = jArr2;
        this.f45593g = iArr2;
        this.f45594h = j10;
        this.f45588b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iJ = u0.j(this.f45592f, j10, true, false); iJ >= 0; iJ--) {
            if ((this.f45593g[iJ] & 1) != 0) {
                return iJ;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iF = u0.f(this.f45592f, j10, true, false); iF < this.f45592f.length; iF++) {
            if ((this.f45593g[iF] & 1) != 0) {
                return iF;
            }
        }
        return -1;
    }
}
