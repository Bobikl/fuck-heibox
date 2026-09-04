package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: compiled from: ChunkIndex.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f44865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f44866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f44867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f44868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f44869i;

    public e(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f44865e = iArr;
        this.f44866f = jArr;
        this.f44867g = jArr2;
        this.f44868h = jArr3;
        int length = iArr.length;
        this.f44864d = length;
        if (length > 0) {
            this.f44869i = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f44869i = 0L;
        }
    }

    public int a(long j10) {
        return u0.j(this.f44868h, j10, true, true);
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        int iA = a(j10);
        c0 c0Var = new c0(this.f44868h[iA], this.f44866f[iA]);
        if (c0Var.f44855a >= j10 || iA == this.f44864d - 1) {
            return new b0.a(c0Var);
        }
        int i10 = iA + 1;
        return new b0.a(c0Var, new c0(this.f44868h[i10], this.f44866f[i10]));
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f44869i;
    }

    public String toString() {
        int i10 = this.f44864d;
        String string = Arrays.toString(this.f44865e);
        String string2 = Arrays.toString(this.f44866f);
        String string3 = Arrays.toString(this.f44868h);
        String string4 = Arrays.toString(this.f44867g);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 71 + String.valueOf(string2).length() + String.valueOf(string3).length() + String.valueOf(string4).length());
        sb2.append("ChunkIndex(length=");
        sb2.append(i10);
        sb2.append(", sizes=");
        sb2.append(string);
        sb2.append(", offsets=");
        sb2.append(string2);
        sb2.append(", timeUs=");
        sb2.append(string3);
        sb2.append(", durationsUs=");
        sb2.append(string4);
        sb2.append(")");
        return sb2.toString();
    }
}
