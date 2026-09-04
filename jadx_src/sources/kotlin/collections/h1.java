package kotlin.collections;

import kotlin.k1;
import kotlin.o1;
import kotlin.s1;
import kotlin.x1;
import kotlin.y1;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h1 {
    @kotlin.s
    private static final int a(long[] jArr, int i10, int i11) {
        long jS = s1.s(jArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Long.compare(s1.s(jArr, i10) ^ Long.MIN_VALUE, jS ^ Long.MIN_VALUE) < 0) {
                i10++;
            }
            while (Long.compare(s1.s(jArr, i11) ^ Long.MIN_VALUE, jS ^ Long.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long jS2 = s1.s(jArr, i10);
                s1.B(jArr, i10, s1.s(jArr, i11));
                s1.B(jArr, i11, jS2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @kotlin.s
    private static final int b(byte[] bArr, int i10, int i11) {
        int i12;
        byte bS = k1.s(bArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                i12 = bS & 255;
                if (kotlin.jvm.internal.f0.t(k1.s(bArr, i10) & 255, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (kotlin.jvm.internal.f0.t(k1.s(bArr, i11) & 255, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte bS2 = k1.s(bArr, i10);
                k1.B(bArr, i10, k1.s(bArr, i11));
                k1.B(bArr, i11, bS2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @kotlin.s
    private static final int c(short[] sArr, int i10, int i11) {
        int i12;
        short s10 = y1.s(sArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int iS = y1.s(sArr, i10) & x1.f128661e;
                i12 = s10 & x1.f128661e;
                if (kotlin.jvm.internal.f0.t(iS, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (kotlin.jvm.internal.f0.t(y1.s(sArr, i11) & x1.f128661e, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short s11 = y1.s(sArr, i10);
                y1.B(sArr, i10, y1.s(sArr, i11));
                y1.B(sArr, i11, s11);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @kotlin.s
    private static final int d(int[] iArr, int i10, int i11) {
        int iS = o1.s(iArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Integer.compare(o1.s(iArr, i10) ^ Integer.MIN_VALUE, iS ^ Integer.MIN_VALUE) < 0) {
                i10++;
            }
            while (Integer.compare(o1.s(iArr, i11) ^ Integer.MIN_VALUE, iS ^ Integer.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int iS2 = o1.s(iArr, i10);
                o1.B(iArr, i10, o1.s(iArr, i11));
                o1.B(iArr, i11, iS2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @kotlin.s
    private static final void e(long[] jArr, int i10, int i11) {
        int iA = a(jArr, i10, i11);
        int i12 = iA - 1;
        if (i10 < i12) {
            e(jArr, i10, i12);
        }
        if (iA < i11) {
            e(jArr, iA, i11);
        }
    }

    @kotlin.s
    private static final void f(byte[] bArr, int i10, int i11) {
        int iB = b(bArr, i10, i11);
        int i12 = iB - 1;
        if (i10 < i12) {
            f(bArr, i10, i12);
        }
        if (iB < i11) {
            f(bArr, iB, i11);
        }
    }

    @kotlin.s
    private static final void g(short[] sArr, int i10, int i11) {
        int iC = c(sArr, i10, i11);
        int i12 = iC - 1;
        if (i10 < i12) {
            g(sArr, i10, i12);
        }
        if (iC < i11) {
            g(sArr, iC, i11);
        }
    }

    @kotlin.s
    private static final void h(int[] iArr, int i10, int i11) {
        int iD = d(iArr, i10, i11);
        int i12 = iD - 1;
        if (i10 < i12) {
            h(iArr, i10, i12);
        }
        if (iD < i11) {
            h(iArr, iD, i11);
        }
    }

    @kotlin.s
    public static final void i(@dl.d long[] array, int i10, int i11) {
        kotlin.jvm.internal.f0.p(array, "array");
        e(array, i10, i11 - 1);
    }

    @kotlin.s
    public static final void j(@dl.d byte[] array, int i10, int i11) {
        kotlin.jvm.internal.f0.p(array, "array");
        f(array, i10, i11 - 1);
    }

    @kotlin.s
    public static final void k(@dl.d short[] array, int i10, int i11) {
        kotlin.jvm.internal.f0.p(array, "array");
        g(array, i10, i11 - 1);
    }

    @kotlin.s
    public static final void l(@dl.d int[] array, int i10, int i11) {
        kotlin.jvm.internal.f0.p(array, "array");
        h(array, i10, i11 - 1);
    }
}
