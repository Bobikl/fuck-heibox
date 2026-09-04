package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: FormatInformation.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f62096c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{bb.c.f.xp, 16}, new int[]{bb.c.f.Kb, 17}, new int[]{bb.c.g.Ig, 18}, new int[]{bb.c.g.f33183x1, 19}, new int[]{bb.c.b.tx, 20}, new int[]{bb.c.b.f31080z8, 21}, new int[]{bb.c.d.lo, 22}, new int[]{2107, 23}, new int[]{bb.c.m.FL, 24}, new int[]{bb.c.m.gn, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{bb.c.k.Ps, 28}, new int[]{bb.c.k.f33527ed, 29}, new int[]{bb.c.m.f35157yf, 30}, new int[]{bb.c.m.f34668d1, 31}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c3 f62097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f62098b;

    private m3(int i10) {
        this.f62097a = c3.a((i10 >> 3) & 3);
        this.f62098b = (byte) (i10 & 7);
    }

    static m3 a(int i10, int i11) {
        m3 m3VarB = b(i10, i11);
        return m3VarB != null ? m3VarB : b(i10 ^ 21522, i11 ^ 21522);
    }

    private static m3 b(int i10, int i11) {
        int iC;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int[] iArr : f62096c) {
            int i14 = iArr[0];
            if (i14 == i10 || i14 == i11) {
                return new m3(iArr[1]);
            }
            int iC2 = c(i10, i14);
            if (iC2 < i12) {
                i13 = iArr[1];
                i12 = iC2;
            }
            if (i11 != i10 && (iC = c(i11, i14)) < i12) {
                i13 = iArr[1];
                i12 = iC;
            }
        }
        if (i12 <= 3) {
            return new m3(i13);
        }
        return null;
    }

    static int c(int i10, int i11) {
        return Integer.bitCount(i10 ^ i11);
    }

    c3 a() {
        return this.f62097a;
    }

    byte b() {
        return this.f62098b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return this.f62097a == m3Var.f62097a && this.f62098b == m3Var.f62098b;
    }

    public int hashCode() {
        return (this.f62097a.ordinal() << 3) | this.f62098b;
    }
}
