package com.google.common.primitives;

import com.google.common.base.w;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@b
@o9.b
public final class UnsignedInts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f59078a = 4294967295L;

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                if (i11 != i12) {
                    return UnsignedInts.b(i11, i12);
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    private UnsignedInts() {
    }

    public static int a(long j10) {
        w.p((j10 >> 32) == 0, "out of range: %s", j10);
        return (int) j10;
    }

    public static int b(int i10, int i11) {
        return Ints.e(e(i10), e(i11));
    }

    @s9.a
    public static int c(String str) {
        f fVarA = f.a(str);
        try {
            return k(fVarA.f59088a, fVarA.f59089b);
        } catch (NumberFormatException e10) {
            String strValueOf = String.valueOf(str);
            NumberFormatException numberFormatException = new NumberFormatException(strValueOf.length() != 0 ? "Error parsing value: ".concat(strValueOf) : new String("Error parsing value: "));
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }

    public static int d(int i10, int i11) {
        return (int) (r(i10) / r(i11));
    }

    static int e(int i10) {
        return i10 ^ Integer.MIN_VALUE;
    }

    public static String f(String str, int... iArr) {
        w.E(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iArr.length * 5);
        sb2.append(s(iArr[0]));
        for (int i10 = 1; i10 < iArr.length; i10++) {
            sb2.append(str);
            sb2.append(s(iArr[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<int[]> g() {
        return LexicographicalComparator.INSTANCE;
    }

    public static int h(int... iArr) {
        w.d(iArr.length > 0);
        int iE = e(iArr[0]);
        for (int i10 = 1; i10 < iArr.length; i10++) {
            int iE2 = e(iArr[i10]);
            if (iE2 > iE) {
                iE = iE2;
            }
        }
        return e(iE);
    }

    public static int i(int... iArr) {
        w.d(iArr.length > 0);
        int iE = e(iArr[0]);
        for (int i10 = 1; i10 < iArr.length; i10++) {
            int iE2 = e(iArr[i10]);
            if (iE2 < iE) {
                iE = iE2;
            }
        }
        return e(iE);
    }

    @s9.a
    public static int j(String str) {
        return k(str, 10);
    }

    @s9.a
    public static int k(String str, int i10) {
        w.E(str);
        long j10 = Long.parseLong(str, i10);
        if ((4294967295L & j10) == j10) {
            return (int) j10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 69);
        sb2.append("Input ");
        sb2.append(str);
        sb2.append(" in base ");
        sb2.append(i10);
        sb2.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb2.toString());
    }

    public static int l(int i10, int i11) {
        return (int) (r(i10) % r(i11));
    }

    public static int m(long j10) {
        if (j10 <= 0) {
            return 0;
        }
        if (j10 >= 4294967296L) {
            return -1;
        }
        return (int) j10;
    }

    public static void n(int[] iArr) {
        w.E(iArr);
        o(iArr, 0, iArr.length);
    }

    public static void o(int[] iArr, int i10, int i11) {
        w.E(iArr);
        w.f0(i10, i11, iArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            iArr[i12] = e(iArr[i12]);
        }
        Arrays.sort(iArr, i10, i11);
        while (i10 < i11) {
            iArr[i10] = e(iArr[i10]);
            i10++;
        }
    }

    public static void p(int[] iArr) {
        w.E(iArr);
        q(iArr, 0, iArr.length);
    }

    public static void q(int[] iArr, int i10, int i11) {
        w.E(iArr);
        w.f0(i10, i11, iArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            iArr[i12] = Integer.MAX_VALUE ^ iArr[i12];
        }
        Arrays.sort(iArr, i10, i11);
        while (i10 < i11) {
            iArr[i10] = iArr[i10] ^ Integer.MAX_VALUE;
            i10++;
        }
    }

    public static long r(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public static String s(int i10) {
        return t(i10, 10);
    }

    public static String t(int i10, int i11) {
        return Long.toString(((long) i10) & 4294967295L, i11);
    }
}
