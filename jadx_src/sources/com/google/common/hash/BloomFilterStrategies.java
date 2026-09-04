package com.google.common.hash;

import com.google.common.base.w;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@h
public enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@t T t10, Funnel<? super T> funnel, int i10, a aVar) {
            long jB = aVar.b();
            long jC = Hashing.x().d(t10, funnel).c();
            int i11 = (int) jC;
            int i12 = (int) (jC >>> 32);
            for (int i13 = 1; i13 <= i10; i13++) {
                int i14 = (i13 * i12) + i11;
                if (i14 < 0) {
                    i14 = ~i14;
                }
                if (!aVar.e(((long) i14) % jB)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@t T t10, Funnel<? super T> funnel, int i10, a aVar) {
            long jB = aVar.b();
            long jC = Hashing.x().d(t10, funnel).c();
            int i11 = (int) jC;
            int i12 = (int) (jC >>> 32);
            boolean zH = false;
            for (int i13 = 1; i13 <= i10; i13++) {
                int i14 = (i13 * i12) + i11;
                if (i14 < 0) {
                    i14 = ~i14;
                }
                zH |= aVar.h(((long) i14) % jB);
            }
            return zH;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long lowerEight(byte[] bArr) {
            return Longs.j(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.j(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@t T t10, Funnel<? super T> funnel, int i10, a aVar) {
            long jB = aVar.b();
            byte[] bArrL = Hashing.x().d(t10, funnel).l();
            long jLowerEight = lowerEight(bArrL);
            long jUpperEight = upperEight(bArrL);
            for (int i11 = 0; i11 < i10; i11++) {
                if (!aVar.e((Long.MAX_VALUE & jLowerEight) % jB)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@t T t10, Funnel<? super T> funnel, int i10, a aVar) {
            long jB = aVar.b();
            byte[] bArrL = Hashing.x().d(t10, funnel).l();
            long jLowerEight = lowerEight(bArrL);
            long jUpperEight = upperEight(bArrL);
            boolean zH = false;
            for (int i11 = 0; i11 < i10; i11++) {
                zH |= aVar.h((Long.MAX_VALUE & jLowerEight) % jB);
                jLowerEight += jUpperEight;
            }
            return zH;
        }
    };

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f58459c = 6;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicLongArray f58460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f58461b;

        a(long j10) {
            w.e(j10 > 0, "data length is zero!");
            this.f58460a = new AtomicLongArray(Ints.d(LongMath.g(j10, 64L, RoundingMode.CEILING)));
            this.f58461b = LongAddables.a();
        }

        a(long[] jArr) {
            w.e(jArr.length > 0, "data length is zero!");
            this.f58460a = new AtomicLongArray(jArr);
            this.f58461b = LongAddables.a();
            long jBitCount = 0;
            for (long j10 : jArr) {
                jBitCount += (long) Long.bitCount(j10);
            }
            this.f58461b.add(jBitCount);
        }

        public static long[] i(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = atomicLongArray.get(i10);
            }
            return jArr;
        }

        long a() {
            return this.f58461b.sum();
        }

        long b() {
            return ((long) this.f58460a.length()) * 64;
        }

        a c() {
            return new a(i(this.f58460a));
        }

        int d() {
            return this.f58460a.length();
        }

        boolean e(long j10) {
            return ((1 << ((int) j10)) & this.f58460a.get((int) (j10 >>> 6))) != 0;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(i(this.f58460a), i(((a) obj).f58460a));
            }
            return false;
        }

        void f(a aVar) {
            w.m(this.f58460a.length() == aVar.f58460a.length(), "BitArrays must be of equal length (%s != %s)", this.f58460a.length(), aVar.f58460a.length());
            for (int i10 = 0; i10 < this.f58460a.length(); i10++) {
                g(i10, aVar.f58460a.get(i10));
            }
        }

        void g(int i10, long j10) {
            long j11;
            long j12;
            boolean z10;
            while (true) {
                j11 = this.f58460a.get(i10);
                j12 = j11 | j10;
                if (j11 == j12) {
                    z10 = false;
                    break;
                } else if (this.f58460a.compareAndSet(i10, j11, j12)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                this.f58461b.add(Long.bitCount(j12) - Long.bitCount(j11));
            }
        }

        boolean h(long j10) {
            long j11;
            long j12;
            if (e(j10)) {
                return false;
            }
            int i10 = (int) (j10 >>> 6);
            long j13 = 1 << ((int) j10);
            do {
                j11 = this.f58460a.get(i10);
                j12 = j11 | j13;
                if (j11 == j12) {
                    return false;
                }
            } while (!this.f58460a.compareAndSet(i10, j11, j12));
            this.f58461b.a();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(i(this.f58460a));
        }
    }
}
