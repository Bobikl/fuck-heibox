package i0;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ContainerHelpers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final int[] f119206a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final long[] f119207b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final Object[] f119208c = new Object[0];

    public static final int a(@dl.d int[] array, int i10, int i11) {
        f0.p(array, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = array[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final int b(@dl.d long[] array, int i10, long j10) {
        f0.p(array, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = array[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final boolean c(@dl.e Object obj, @dl.e Object obj2) {
        return f0.g(obj, obj2);
    }

    public static final int d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    public static final int e(int i10) {
        return d(i10 * 4) / 4;
    }

    public static final int f(int i10) {
        return d(i10 * 8) / 8;
    }
}
