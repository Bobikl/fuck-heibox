package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: ShuffleOrder.java */
/* JADX INFO: loaded from: classes7.dex */
public interface f1 {

    /* JADX INFO: compiled from: ShuffleOrder.java */
    public static class a implements f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f48006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f48007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f48008c;

        public a(int i10) {
            this(i10, new Random());
        }

        public a(int i10, long j10) {
            this(i10, new Random(j10));
        }

        private a(int i10, Random random) {
            this(h(i10, random), random);
        }

        public a(int[] iArr, long j10) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j10));
        }

        private a(int[] iArr, Random random) {
            this.f48007b = iArr;
            this.f48006a = random;
            this.f48008c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f48008c[iArr[i10]] = i10;
            }
        }

        private static int[] h(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int a(int i10) {
            int i11 = this.f48008c[i10] - 1;
            if (i11 >= 0) {
                return this.f48007b[i11];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int b(int i10) {
            int i11 = this.f48008c[i10] + 1;
            int[] iArr = this.f48007b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int c() {
            int[] iArr = this.f48007b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public f1 d() {
            return new a(0, new Random(this.f48006a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int e() {
            int[] iArr = this.f48007b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public f1 f(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f48007b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f48007b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f48006a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // com.google.android.exoplayer2.source.f1
        public f1 g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f48006a.nextInt(this.f48007b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f48006a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f48007b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f48007b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f48006a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int getLength() {
            return this.f48007b.length;
        }
    }

    /* JADX INFO: compiled from: ShuffleOrder.java */
    public static final class b implements f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48009a;

        public b(int i10) {
            this.f48009a = i10;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int a(int i10) {
            int i11 = i10 - 1;
            if (i11 >= 0) {
                return i11;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int b(int i10) {
            int i11 = i10 + 1;
            if (i11 < this.f48009a) {
                return i11;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int c() {
            int i10 = this.f48009a;
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public f1 d() {
            return new b(0);
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int e() {
            return this.f48009a > 0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.source.f1
        public f1 f(int i10, int i11) {
            return new b((this.f48009a - i11) + i10);
        }

        @Override // com.google.android.exoplayer2.source.f1
        public f1 g(int i10, int i11) {
            return new b(this.f48009a + i11);
        }

        @Override // com.google.android.exoplayer2.source.f1
        public int getLength() {
            return this.f48009a;
        }
    }

    int a(int i10);

    int b(int i10);

    int c();

    f1 d();

    int e();

    f1 f(int i10, int i11);

    f1 g(int i10, int i11);

    int getLength();
}
