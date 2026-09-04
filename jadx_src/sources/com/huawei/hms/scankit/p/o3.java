package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: GenericGF.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o3 f62190h = new o3(bb.c.e.f31756dc, 4096, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o3 f62191i = new o3(1033, 1024, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o3 f62192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o3 f62193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o3 f62194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o3 f62195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o3 f62196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o3 f62197o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f62198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f62199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p3 f62200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p3 f62201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f62203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f62204g;

    static {
        o3 o3Var = new o3(67, 64, 1);
        f62192j = o3Var;
        f62193k = new o3(19, 16, 1);
        f62194l = new o3(bb.c.b.f31074z2, 256, 0);
        o3 o3Var2 = new o3(301, 256, 1);
        f62195m = o3Var2;
        f62196n = o3Var2;
        f62197o = o3Var;
    }

    public o3(int i10, int i11, int i12) {
        this.f62203f = i10;
        this.f62202e = i11;
        this.f62204g = i12;
        this.f62198a = new int[i11];
        this.f62199b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f62198a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f62199b[this.f62198a[i15]] = i15;
        }
        this.f62200c = new p3(this, new int[]{0});
        this.f62201d = new p3(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public int a() {
        return this.f62204g;
    }

    int a(int i10) {
        if (w7.a(this.f62198a, i10)) {
            return this.f62198a[i10];
        }
        return -1;
    }

    int b(int i10) {
        if (i10 != 0) {
            return this.f62198a[(this.f62202e - this.f62199b[i10]) - 1];
        }
        try {
            throw new ArithmeticException();
        } catch (Exception e10) {
            throw e10;
        }
    }

    p3 b() {
        return this.f62201d;
    }

    p3 b(int i10, int i11) throws Exception {
        if (i10 < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        }
        if (i11 == 0) {
            return this.f62200c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new p3(this, iArr);
    }

    public int c() {
        return this.f62202e;
    }

    int c(int i10) {
        if (i10 != 0) {
            return this.f62199b[i10];
        }
        try {
            throw new IllegalArgumentException();
        } catch (Exception e10) {
            throw e10;
        }
    }

    int c(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f62198a;
        int[] iArr2 = this.f62199b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f62202e - 1)];
    }

    p3 d() {
        return this.f62200c;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f62203f) + ',' + this.f62202e + ')';
    }
}
