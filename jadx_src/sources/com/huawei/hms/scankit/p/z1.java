package com.huawei.hms.scankit.p;

import java.util.Formatter;

/* JADX INFO: compiled from: DetectionResult.java */
/* JADX INFO: loaded from: classes7.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f62607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2[] f62608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a0 f62609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62610d;

    z1(k kVar, a0 a0Var) {
        this.f62607a = kVar;
        int iA = kVar.a();
        this.f62610d = iA;
        this.f62609c = a0Var;
        this.f62608b = new a2[iA + 2];
    }

    private int a() {
        int iB = b();
        if (iB == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f62610d + 1; i10++) {
            x0[] x0VarArrB = this.f62608b[i10].b();
            for (int i11 = 0; i11 < x0VarArrB.length; i11++) {
                x0 x0Var = x0VarArrB[i11];
                if (x0Var != null && !x0Var.g()) {
                    a(i10, i11, x0VarArrB);
                }
            }
        }
        return iB;
    }

    private static int a(int i10, int i11, x0 x0Var) {
        if (x0Var == null || x0Var.g()) {
            return i11;
        }
        if (!x0Var.a(i10)) {
            return i11 + 1;
        }
        x0Var.b(i10);
        return 0;
    }

    private void a(int i10, int i11, x0[] x0VarArr) {
        x0 x0Var = x0VarArr[i11];
        x0[] x0VarArrB = this.f62608b[i10 - 1].b();
        a2 a2Var = this.f62608b[i10 + 1];
        x0[] x0VarArrB2 = a2Var != null ? a2Var.b() : x0VarArrB;
        x0[] x0VarArr2 = new x0[14];
        x0VarArr2[2] = x0VarArrB[i11];
        x0VarArr2[3] = x0VarArrB2[i11];
        if (i11 > 0) {
            int i12 = i11 - 1;
            x0VarArr2[0] = x0VarArr[i12];
            x0VarArr2[4] = x0VarArrB[i12];
            x0VarArr2[5] = x0VarArrB2[i12];
        }
        if (i11 > 1) {
            int i13 = i11 - 2;
            x0VarArr2[8] = x0VarArr[i13];
            x0VarArr2[10] = x0VarArrB[i13];
            x0VarArr2[11] = x0VarArrB2[i13];
        }
        if (i11 < x0VarArr.length - 1) {
            int i14 = i11 + 1;
            x0VarArr2[1] = x0VarArr[i14];
            x0VarArr2[6] = x0VarArrB[i14];
            x0VarArr2[7] = x0VarArrB2[i14];
        }
        if (i11 < x0VarArr.length - 2) {
            int i15 = i11 + 2;
            x0VarArr2[9] = x0VarArr[i15];
            x0VarArr2[12] = x0VarArrB[i15];
            x0VarArr2[13] = x0VarArrB2[i15];
        }
        for (int i16 = 0; i16 < 14 && !a(x0Var, x0VarArr2[i16]); i16++) {
        }
    }

    private void a(a2 a2Var) throws a {
        if (a2Var != null) {
            try {
                ((b2) a2Var).a(this.f62607a);
            } catch (ClassCastException unused) {
                throw a.a();
            }
        }
    }

    private static boolean a(x0 x0Var, x0 x0Var2) {
        if (x0Var2 == null || !x0Var2.g() || x0Var2.a() != x0Var.a()) {
            return false;
        }
        x0Var.b(x0Var2.c());
        return true;
    }

    private int b() {
        c();
        return d() + e();
    }

    private void c() {
        a2[] a2VarArr = this.f62608b;
        a2 a2Var = a2VarArr[0];
        if (a2Var == null || a2VarArr[this.f62610d + 1] == null) {
            return;
        }
        x0[] x0VarArrB = a2Var.b();
        x0[] x0VarArrB2 = this.f62608b[this.f62610d + 1].b();
        for (int i10 = 0; i10 < x0VarArrB.length; i10++) {
            x0 x0Var = x0VarArrB[i10];
            if (x0Var != null && x0VarArrB2[i10] != null && x0Var.c() == x0VarArrB2[i10].c()) {
                for (int i11 = 1; i11 <= this.f62610d; i11++) {
                    x0 x0Var2 = this.f62608b[i11].b()[i10];
                    if (x0Var2 != null) {
                        x0Var2.b(x0VarArrB[i10].c());
                        if (!x0Var2.g()) {
                            this.f62608b[i11].b()[i10] = null;
                        }
                    }
                }
            }
        }
    }

    private int d() {
        a2 a2Var = this.f62608b[0];
        if (a2Var == null) {
            return 0;
        }
        x0[] x0VarArrB = a2Var.b();
        int i10 = 0;
        for (int i11 = 0; i11 < x0VarArrB.length; i11++) {
            x0 x0Var = x0VarArrB[i11];
            if (x0Var != null) {
                int iC = x0Var.c();
                int iA = 0;
                for (int i12 = 1; i12 < this.f62610d + 1 && iA < 2; i12++) {
                    x0 x0Var2 = this.f62608b[i12].b()[i11];
                    if (x0Var2 != null) {
                        iA = a(iC, iA, x0Var2);
                        if (!x0Var2.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    private int e() {
        a2 a2Var = this.f62608b[this.f62610d + 1];
        if (a2Var == null) {
            return 0;
        }
        x0[] x0VarArrB = a2Var.b();
        int i10 = 0;
        for (int i11 = 0; i11 < x0VarArrB.length; i11++) {
            x0 x0Var = x0VarArrB[i11];
            if (x0Var != null) {
                int iC = x0Var.c();
                int iA = 0;
                for (int i12 = this.f62610d + 1; i12 > 0 && iA < 2; i12--) {
                    x0 x0Var2 = this.f62608b[i12].b()[i11];
                    if (x0Var2 != null) {
                        iA = a(iC, iA, x0Var2);
                        if (!x0Var2.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    a2 a(int i10) {
        return this.f62608b[i10];
    }

    void a(int i10, a2 a2Var) {
        this.f62608b[i10] = a2Var;
    }

    void a(a0 a0Var) {
        this.f62609c = a0Var;
    }

    int f() {
        return this.f62610d;
    }

    int g() {
        return this.f62607a.b();
    }

    int h() {
        return this.f62607a.c();
    }

    a0 i() {
        return this.f62609c;
    }

    a2[] j() throws a {
        a(this.f62608b[0]);
        a(this.f62608b[this.f62610d + 1]);
        int i10 = bb.c.b.Se;
        while (true) {
            int iA = a();
            if (iA <= 0 || iA >= i10) {
                break;
            }
            i10 = iA;
        }
        return this.f62608b;
    }

    public String toString() {
        a2[] a2VarArr = this.f62608b;
        a2 a2Var = a2VarArr[0];
        if (a2Var == null) {
            a2Var = a2VarArr[this.f62610d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < a2Var.b().length; i10++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i10));
                for (int i11 = 0; i11 < this.f62610d + 2; i11++) {
                    a2 a2Var2 = this.f62608b[i11];
                    if (a2Var2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        x0 x0Var = a2Var2.b()[i10];
                        if (x0Var == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(x0Var.c()), Integer.valueOf(x0Var.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
