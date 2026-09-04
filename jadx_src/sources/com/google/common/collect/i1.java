package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Hashing.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f58087a = -862048943;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f58088b = 461845907;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58089c = 1073741824;

    private i1() {
    }

    static int a(int i10, double d10) {
        int iMax = Math.max(i10, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d10 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i11 = iHighestOneBit << 1;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    static boolean b(int i10, int i11, double d10) {
        return ((double) i10) > d10 * ((double) i11) && i11 < 1073741824;
    }

    static int c(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * f58087a), 15)) * f58088b);
    }

    static int d(@CheckForNull Object obj) {
        return c(obj == null ? 0 : obj.hashCode());
    }
}
