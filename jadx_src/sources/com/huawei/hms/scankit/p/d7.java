package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: SymbolInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public class d7 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final d7[] f61694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static d7[] f61695j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f61696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f61701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f61702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f61703h;

    static {
        d7[] d7VarArr = {new d7(false, 3, 5, 8, 8, 1), new d7(false, 5, 7, 10, 10, 1), new d7(true, 5, 7, 16, 6, 1), new d7(false, 8, 10, 12, 12, 1), new d7(true, 10, 11, 14, 6, 2), new d7(false, 12, 12, 14, 14, 1), new d7(true, 16, 14, 24, 10, 1), new d7(false, 18, 14, 16, 16, 1), new d7(false, 22, 18, 18, 18, 1), new d7(true, 22, 18, 16, 10, 2), new d7(false, 30, 20, 20, 20, 1), new d7(true, 32, 24, 16, 14, 2), new d7(false, 36, 24, 22, 22, 1), new d7(false, 44, 28, 24, 24, 1), new d7(true, 49, 28, 22, 14, 2), new d7(false, 62, 36, 14, 14, 4), new d7(false, 86, 42, 16, 16, 4), new d7(false, 114, 48, 18, 18, 4), new d7(false, 144, 56, 20, 20, 4), new d7(false, bb.c.b.f30918s0, 68, 22, 22, 4), new d7(false, 204, 84, 24, 24, 4, 102, 42), new d7(false, bb.c.b.f30964u2, 112, 14, 14, 16, 140, 56), new d7(false, bb.c.b.f30602e4, 144, 16, 16, 16, 92, 36), new d7(false, bb.c.b.O5, 192, 18, 18, 16, 114, 48), new d7(false, bb.c.b.f30606e8, 224, 20, 20, 16, 144, 56), new d7(false, 696, bb.c.b.f30784m2, 22, 22, 16, bb.c.b.f30918s0, 68), new d7(false, bb.c.b.Kc, bb.c.b.f31053y3, 24, 24, 16, 136, 56), new d7(false, 1050, bb.c.b.S4, 18, 18, 36, bb.c.b.f30940t0, 68), new d7(false, bb.c.b.em, bb.c.b.C6, 20, 20, 36, 163, 62), new i1()};
        f61694i = d7VarArr;
        f61695j = d7VarArr;
    }

    public d7(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    d7(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f61696a = z10;
        this.f61697b = i10;
        this.f61698c = i11;
        this.f61699d = i12;
        this.f61700e = i13;
        this.f61701f = i14;
        this.f61702g = i15;
        this.f61703h = i16;
    }

    public static d7 a(int i10, e7 e7Var, l2 l2Var, l2 l2Var2, boolean z10) throws Exception {
        for (d7 d7Var : f61695j) {
            if (!(e7Var == e7.FORCE_SQUARE && d7Var.f61696a) && ((e7Var != e7.FORCE_RECTANGLE || d7Var.f61696a) && ((l2Var == null || (d7Var.h() >= l2Var.b() && d7Var.g() >= l2Var.a())) && ((l2Var2 == null || (d7Var.h() <= l2Var2.b() && d7Var.g() <= l2Var2.a())) && i10 <= d7Var.f61697b)))) {
                return d7Var;
            }
        }
        if (!z10) {
            return null;
        }
        try {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i10);
        } catch (Exception e10) {
            throw e10;
        }
    }

    private int c() throws Exception {
        int i10 = this.f61701f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                try {
                    throw new IllegalStateException("Cannot handle this number of data regions");
                } catch (Exception e10) {
                    throw e10;
                }
            }
        }
        return i11;
    }

    private int i() throws Exception {
        int i10 = this.f61701f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        try {
            throw new IllegalStateException("Cannot handle this number of data regions");
        } catch (Exception e10) {
            throw e10;
        }
    }

    public final int a() {
        return this.f61697b;
    }

    public int a(int i10) {
        return this.f61702g;
    }

    public final int b() {
        return this.f61698c;
    }

    public final int b(int i10) {
        return this.f61703h;
    }

    public int d() {
        return this.f61697b / this.f61702g;
    }

    public final int e() {
        return i() * this.f61700e;
    }

    public final int f() {
        return c() * this.f61699d;
    }

    public final int g() {
        return e() + (i() * 2);
    }

    public final int h() {
        return f() + (c() * 2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f61696a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f61699d);
        sb2.append('x');
        sb2.append(this.f61700e);
        sb2.append(", symbol size ");
        sb2.append(h());
        sb2.append('x');
        sb2.append(g());
        sb2.append(", symbol data size ");
        sb2.append(f());
        sb2.append('x');
        sb2.append(e());
        sb2.append(", codewords ");
        sb2.append(this.f61697b);
        sb2.append('+');
        sb2.append(this.f61698c);
        return sb2.toString();
    }
}
