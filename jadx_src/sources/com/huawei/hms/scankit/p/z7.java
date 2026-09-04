package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Version.java */
/* JADX INFO: loaded from: classes7.dex */
public final class z7 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[][] f62621h = {new int[]{1, 10, 10, 8, 8, 5, 1, 3}, new int[]{2, 12, 12, 10, 10, 7, 1, 5}, new int[]{3, 14, 14, 12, 12, 10, 1, 8}, new int[]{4, 16, 16, 14, 14, 12, 1, 12}, new int[]{5, 18, 18, 16, 16, 14, 1, 18}, new int[]{6, 20, 20, 18, 18, 18, 1, 22}, new int[]{7, 22, 22, 20, 20, 20, 1, 30}, new int[]{8, 24, 24, 22, 22, 24, 1, 36}, new int[]{9, 26, 26, 24, 24, 28, 1, 44}, new int[]{10, 32, 32, 14, 14, 36, 1, 62}, new int[]{11, 36, 36, 16, 16, 42, 1, 86}, new int[]{12, 40, 40, 18, 18, 48, 1, 114}, new int[]{13, 44, 44, 20, 20, 56, 1, 144}, new int[]{14, 48, 48, 22, 22, 68, 1, bb.c.b.f30918s0}, new int[]{15, 52, 52, 24, 24, 42, 2, 102}, new int[]{16, 64, 64, 14, 14, 56, 2, 140}, new int[]{17, 72, 72, 16, 16, 36, 4, 92}, new int[]{18, 80, 80, 18, 18, 48, 4, 114}, new int[]{19, 88, 88, 20, 20, 56, 4, 144}, new int[]{20, 96, 96, 22, 22, 68, 4, bb.c.b.f30918s0}, new int[]{21, 104, 104, 24, 24, 56, 6, 136}, new int[]{22, 120, 120, 18, 18, 68, 6, bb.c.b.f30940t0}, new int[]{23, 132, 132, 20, 20, 62, 8, 163}, new int[]{24, 144, 144, 22, 22, 62, 8, 156, 2, 155}, new int[]{25, 8, 18, 6, 16, 7, 1, 5}, new int[]{26, 8, 32, 6, 14, 11, 1, 10}, new int[]{27, 12, 26, 10, 24, 14, 1, 16}, new int[]{28, 12, 36, 10, 16, 18, 1, 22}, new int[]{29, 16, 36, 14, 16, 24, 1, 32}, new int[]{30, 16, 48, 14, 22, 28, 1, 49}};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final z7[] f62622i = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f62628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f62629g;

    /* JADX INFO: compiled from: Version.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f62631b;

        private b(int i10, int i11) {
            this.f62630a = i10;
            this.f62631b = i11;
        }

        int a() {
            return this.f62630a;
        }

        int b() {
            return this.f62631b;
        }
    }

    /* JADX INFO: compiled from: Version.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f62633b;

        private c(int i10, b bVar) {
            this.f62632a = i10;
            this.f62633b = new b[]{bVar};
        }

        private c(int i10, b bVar, b bVar2) {
            this.f62632a = i10;
            this.f62633b = new b[]{bVar, bVar2};
        }

        b[] a() {
            return this.f62633b;
        }

        int b() {
            return this.f62632a;
        }
    }

    private z7(int i10, int i11, int i12, int i13, int i14, c cVar) {
        this.f62623a = i10;
        this.f62624b = i11;
        this.f62625c = i12;
        this.f62626d = i13;
        this.f62627e = i14;
        this.f62628f = cVar;
        int iB = cVar.b();
        int iA = 0;
        for (b bVar : cVar.a()) {
            iA += bVar.a() * (bVar.b() + iB);
        }
        this.f62629g = iA;
    }

    public static z7 a(int i10, int i11) throws com.huawei.hms.scankit.p.a {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        for (z7 z7Var : f62622i) {
            if (z7Var.f62624b == i10 && z7Var.f62625c == i11) {
                return z7Var;
            }
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static z7[] a() {
        z7[] z7VarArr = new z7[f62621h.length];
        int i10 = 0;
        while (true) {
            int[][] iArr = f62621h;
            if (i10 >= iArr.length) {
                return z7VarArr;
            }
            int[] iArr2 = iArr[i10];
            if (i10 == 23) {
                z7VarArr[i10] = new z7(iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[4], new c(iArr2[5], new b(iArr2[6], iArr2[7]), new b(iArr2[8], iArr2[9])));
            } else {
                z7VarArr[i10] = new z7(iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[4], new c(iArr2[5], new b(iArr2[6], iArr2[7])));
            }
            i10++;
        }
    }

    public int b() {
        return this.f62627e;
    }

    public int c() {
        return this.f62626d;
    }

    c d() {
        return this.f62628f;
    }

    public int e() {
        return this.f62625c;
    }

    public int f() {
        return this.f62624b;
    }

    public int g() {
        return this.f62629g;
    }

    public int h() {
        return this.f62623a;
    }

    public String toString() {
        return String.valueOf(this.f62623a);
    }
}
