package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.l;
import java.io.IOException;

/* JADX INFO: compiled from: VarintReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f45251d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f45252e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f45253f = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f45254a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45256c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f45253f[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f45253f;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f45256c;
    }

    public long d(l lVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f45255b == 0) {
            if (!lVar.g(this.f45254a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f45254a[0] & 255);
            this.f45256c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f45255b = 1;
        }
        int i11 = this.f45256c;
        if (i11 > i10) {
            this.f45255b = 0;
            return -2L;
        }
        if (i11 != 1) {
            lVar.readFully(this.f45254a, 1, i11 - 1);
        }
        this.f45255b = 0;
        return a(this.f45254a, this.f45256c, z11);
    }

    public void e() {
        this.f45255b = 0;
        this.f45256c = 0;
    }
}
