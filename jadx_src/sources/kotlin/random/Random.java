package kotlin.random;

import fi.l;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.u0;
import sh.m;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public abstract class Random {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final Default f125033b = new Default(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Random f125034c = m.f139400a.b();

    /* JADX INFO: compiled from: Random.kt */
    public static final class Default extends Random implements Serializable {

        /* JADX INFO: compiled from: Random.kt */
        public static final class Serialized implements Serializable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.d
            public static final Serialized f125035b = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object a() {
                return Random.f125033b;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(u uVar) {
            this();
        }

        private final Object r() {
            return Serialized.f125035b;
        }

        @Override // kotlin.random.Random
        public int b(int i10) {
            return Random.f125034c.b(i10);
        }

        @Override // kotlin.random.Random
        public boolean c() {
            return Random.f125034c.c();
        }

        @Override // kotlin.random.Random
        @dl.d
        public byte[] d(int i10) {
            return Random.f125034c.d(i10);
        }

        @Override // kotlin.random.Random
        @dl.d
        public byte[] e(@dl.d byte[] array) {
            f0.p(array, "array");
            return Random.f125034c.e(array);
        }

        @Override // kotlin.random.Random
        @dl.d
        public byte[] f(@dl.d byte[] array, int i10, int i11) {
            f0.p(array, "array");
            return Random.f125034c.f(array, i10, i11);
        }

        @Override // kotlin.random.Random
        public double h() {
            return Random.f125034c.h();
        }

        @Override // kotlin.random.Random
        public double i(double d10) {
            return Random.f125034c.i(d10);
        }

        @Override // kotlin.random.Random
        public double j(double d10, double d11) {
            return Random.f125034c.j(d10, d11);
        }

        @Override // kotlin.random.Random
        public float k() {
            return Random.f125034c.k();
        }

        @Override // kotlin.random.Random
        public int l() {
            return Random.f125034c.l();
        }

        @Override // kotlin.random.Random
        public int m(int i10) {
            return Random.f125034c.m(i10);
        }

        @Override // kotlin.random.Random
        public int n(int i10, int i11) {
            return Random.f125034c.n(i10, i11);
        }

        @Override // kotlin.random.Random
        public long o() {
            return Random.f125034c.o();
        }

        @Override // kotlin.random.Random
        public long p(long j10) {
            return Random.f125034c.p(j10);
        }

        @Override // kotlin.random.Random
        public long q(long j10, long j11) {
            return Random.f125034c.q(j10, j11);
        }
    }

    public static /* synthetic */ byte[] g(Random random, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return random.f(bArr, i10, i11);
    }

    public abstract int b(int i10);

    public boolean c() {
        return b(1) != 0;
    }

    @dl.d
    public byte[] d(int i10) {
        return e(new byte[i10]);
    }

    @dl.d
    public byte[] e(@dl.d byte[] array) {
        f0.p(array, "array");
        return f(array, 0, array.length);
    }

    @dl.d
    public byte[] f(@dl.d byte[] array, int i10, int i11) {
        f0.p(array, "array");
        if (!(new l(0, array.length).s(i10) && new l(0, array.length).s(i11))) {
            throw new IllegalArgumentException(("fromIndex (" + i10 + ") or toIndex (" + i11 + ") are out of range: 0.." + array.length + lg.a.f131414g).toString());
        }
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("fromIndex (" + i10 + ") must be not greater than toIndex (" + i11 + ").").toString());
        }
        int i12 = (i11 - i10) / 4;
        for (int i13 = 0; i13 < i12; i13++) {
            int iL = l();
            array[i10] = (byte) iL;
            array[i10 + 1] = (byte) (iL >>> 8);
            array[i10 + 2] = (byte) (iL >>> 16);
            array[i10 + 3] = (byte) (iL >>> 24);
            i10 += 4;
        }
        int i14 = i11 - i10;
        int iB = b(i14 * 8);
        for (int i15 = 0; i15 < i14; i15++) {
            array[i10 + i15] = (byte) (iB >>> (i15 * 8));
        }
        return array;
    }

    public double h() {
        return c.d(b(26), b(27));
    }

    public double i(double d10) {
        return j(0.0d, d10);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public double j(double d10, double d11) {
        double dH;
        d.d(d10, d11);
        double d12 = d11 - d10;
        if (Double.isInfinite(d12)) {
            if ((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true) {
                if ((Double.isInfinite(d11) || Double.isNaN(d11)) ? false : true) {
                    double d13 = 2;
                    double dH2 = h() * ((d11 / d13) - (d10 / d13));
                    dH = d10 + dH2 + dH2;
                } else {
                    dH = d10 + (h() * d12);
                }
            } else {
                dH = d10 + (h() * d12);
            }
        } else {
            dH = d10 + (h() * d12);
        }
        return dH >= d11 ? Math.nextAfter(d11, Double.NEGATIVE_INFINITY) : dH;
    }

    public float k() {
        return b(24) / 1.6777216E7f;
    }

    public int l() {
        return b(32);
    }

    public int m(int i10) {
        return n(0, i10);
    }

    public int n(int i10, int i11) {
        int iL;
        int i12;
        int iB;
        int iL2;
        boolean z10;
        d.e(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iB = b(d.g(i13));
            } else {
                do {
                    iL = l() >>> 1;
                    i12 = iL % i13;
                } while ((iL - i12) + (i13 - 1) < 0);
                iB = i12;
            }
            return i10 + iB;
        }
        do {
            iL2 = l();
            z10 = false;
            if (i10 <= iL2 && iL2 < i11) {
                z10 = true;
            }
        } while (!z10);
        return iL2;
    }

    public long o() {
        return (((long) l()) << 32) + ((long) l());
    }

    public long p(long j10) {
        return q(0L, j10);
    }

    public long q(long j10, long j11) {
        long jO;
        boolean z10;
        long jO2;
        long j12;
        long jB;
        int iL;
        d.f(j10, j11);
        long j13 = j11 - j10;
        if (j13 <= 0) {
            do {
                jO = o();
                z10 = false;
                if (j10 <= jO && jO < j11) {
                    z10 = true;
                }
            } while (!z10);
            return jO;
        }
        if (((-j13) & j13) == j13) {
            int i10 = (int) j13;
            int i11 = (int) (j13 >>> 32);
            if (i10 != 0) {
                iL = b(d.g(i10));
            } else if (i11 == 1) {
                iL = l();
            } else {
                jB = (((long) b(d.g(i11))) << 32) + (((long) l()) & KeyboardMap.kValueMask);
            }
            jB = ((long) iL) & KeyboardMap.kValueMask;
        } else {
            do {
                jO2 = o() >>> 1;
                j12 = jO2 % j13;
            } while ((jO2 - j12) + (j13 - 1) < 0);
            jB = j12;
        }
        return j10 + jB;
    }
}
