package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

/* JADX INFO: compiled from: TimeUtils.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int f21251a = 19;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21252b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21253c = 3600;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21254d = 86400;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f21255e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f21256f = new char[24];

    private g0() {
    }

    private static int a(int i10, int i11, boolean z10, int i12) {
        if (i10 > 99 || (z10 && i12 >= 3)) {
            return i11 + 3;
        }
        if (i10 > 9 || (z10 && i12 >= 2)) {
            return i11 + 2;
        }
        if (z10 || i10 > 0) {
            return i11 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void b(long j10, long j11, PrintWriter printWriter) {
        if (j10 == 0) {
            printWriter.print("--");
        } else {
            d(j10 - j11, printWriter, 0);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void c(long j10, PrintWriter printWriter) {
        d(j10, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void d(long j10, PrintWriter printWriter, int i10) {
        synchronized (f21255e) {
            printWriter.print(new String(f21256f, 0, f(j10, i10)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void e(long j10, StringBuilder sb2) {
        synchronized (f21255e) {
            sb2.append(f21256f, 0, f(j10, 0));
        }
    }

    private static int f(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = j10;
        if (f21256f.length < i10) {
            f21256f = new char[i10];
        }
        char[] cArr = f21256f;
        if (j11 == 0) {
            int i16 = i10 - 1;
            while (i16 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j11 > 0) {
            c10 = '+';
        } else {
            c10 = '-';
            j11 = -j11;
        }
        int i17 = (int) (j11 % 1000);
        int iFloor = (int) Math.floor(j11 / 1000);
        if (iFloor > 86400) {
            i11 = iFloor / 86400;
            iFloor -= 86400 * i11;
        } else {
            i11 = 0;
        }
        if (iFloor > 3600) {
            i12 = iFloor / 3600;
            iFloor -= i12 * 3600;
        } else {
            i12 = 0;
        }
        if (iFloor > 60) {
            int i18 = iFloor / 60;
            i13 = iFloor - (i18 * 60);
            i14 = i18;
        } else {
            i13 = iFloor;
            i14 = 0;
        }
        if (i10 != 0) {
            int iA = a(i11, 1, false, 0);
            int iA2 = iA + a(i12, 1, iA > 0, 2);
            int iA3 = iA2 + a(i14, 1, iA2 > 0, 2);
            int iA4 = iA3 + a(i13, 1, iA3 > 0, 2);
            i15 = 0;
            for (int iA5 = iA4 + a(i17, 2, true, iA4 > 0 ? 3 : 0) + 1; iA5 < i10; iA5++) {
                cArr[i15] = ' ';
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c10;
        int i19 = i15 + 1;
        boolean z10 = i10 != 0;
        int iG = g(cArr, i11, 'd', i19, false, 0);
        int iG2 = g(cArr, i12, 'h', iG, iG != i19, z10 ? 2 : 0);
        int iG3 = g(cArr, i14, 'm', iG2, iG2 != i19, z10 ? 2 : 0);
        int iG4 = g(cArr, i13, 's', iG3, iG3 != i19, z10 ? 2 : 0);
        int iG5 = g(cArr, i17, 'm', iG4, true, (!z10 || iG4 == i19) ? 0 : 3);
        cArr[iG5] = 's';
        return iG5 + 1;
    }

    private static int g(char[] cArr, int i10, char c10, int i11, boolean z10, int i12) {
        int i13;
        if (!z10 && i10 <= 0) {
            return i11;
        }
        if ((!z10 || i12 < 3) && i10 <= 99) {
            i13 = i11;
        } else {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        }
        if ((z10 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        int i16 = i13 + 1;
        cArr[i16] = c10;
        return i16 + 1;
    }
}
