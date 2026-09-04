package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: FormatInformation.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f62063c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{bb.c.f.xp, 16}, new int[]{bb.c.f.Kb, 17}, new int[]{bb.c.g.Ig, 18}, new int[]{bb.c.g.f33183x1, 19}, new int[]{bb.c.b.tx, 20}, new int[]{bb.c.b.f31080z8, 21}, new int[]{bb.c.d.lo, 22}, new int[]{2107, 23}, new int[]{bb.c.m.FL, 24}, new int[]{bb.c.m.gn, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{bb.c.k.Ps, 28}, new int[]{bb.c.k.f33527ed, 29}, new int[]{bb.c.m.f35157yf, 30}, new int[]{bb.c.m.f34668d1, 31}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b3 f62064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f62065b;

    private l3(int i10) {
        this.f62064a = b3.a((i10 >> 3) & 3);
        this.f62065b = (byte) (i10 & 7);
    }

    static l3 a(int i10, int i11) {
        l3 l3VarB = b(i10, i11);
        return l3VarB != null ? l3VarB : b(i10 ^ 21522, i11 ^ 21522);
    }

    private static l3 b(int i10, int i11) {
        int iC;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int[] iArr : f62063c) {
            int i14 = iArr[0];
            if (i14 == i10 || i14 == i11) {
                return new l3(iArr[1]);
            }
            int iC2 = c(i10, i14);
            if (iC2 < i12) {
                i13 = iArr[1];
                i12 = iC2;
            }
            if (i10 != i11 && (iC = c(i11, i14)) < i12) {
                i13 = iArr[1];
                i12 = iC;
            }
        }
        if (i12 <= 3) {
            return new l3(i13);
        }
        return null;
    }

    static int c(int i10, int i11) {
        return Integer.bitCount(i10 ^ i11);
    }

    byte a() {
        return this.f62065b;
    }

    b3 b() {
        return this.f62064a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return this.f62064a == l3Var.f62064a && this.f62065b == l3Var.f62065b;
    }

    public int hashCode() {
        return (this.f62064a.ordinal() << 3) | this.f62065b;
    }
}
