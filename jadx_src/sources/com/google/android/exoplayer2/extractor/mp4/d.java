package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: FixedSampleSizeRechunker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f45420a = 8192;

    /* JADX INFO: compiled from: FixedSampleSizeRechunker.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f45421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f45422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f45423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f45424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f45425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f45426f;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f45421a = jArr;
            this.f45422b = iArr;
            this.f45423c = i10;
            this.f45424d = jArr2;
            this.f45425e = iArr2;
            this.f45426f = j10;
        }
    }

    private d() {
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int iM = 0;
        for (int i12 : iArr) {
            iM += u0.m(i12, i11);
        }
        long[] jArr2 = new long[iM];
        int[] iArr2 = new int[iM];
        long[] jArr3 = new long[iM];
        int[] iArr3 = new int[iM];
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            long j11 = jArr[i15];
            while (i16 > 0) {
                int iMin = Math.min(i11, i16);
                jArr2[i14] = j11;
                int i17 = i10 * iMin;
                iArr2[i14] = i17;
                iMax = Math.max(iMax, i17);
                jArr3[i14] = ((long) i13) * j10;
                iArr3[i14] = 1;
                j11 += (long) iArr2[i14];
                i13 += iMin;
                i16 -= iMin;
                i14++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j10 * ((long) i13));
    }
}
