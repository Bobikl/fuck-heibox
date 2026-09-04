package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ReedSolomonDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o3 f62228a;

    public p6(o3 o3Var) {
        this.f62228a = o3Var;
    }

    private int[] a(p3 p3Var) throws a {
        int iB = p3Var.b();
        int i10 = 0;
        if (iB == 1) {
            return new int[]{p3Var.b(1)};
        }
        int[] iArr = new int[iB];
        for (int i11 = 1; i11 < this.f62228a.c() && i10 < iB; i11++) {
            if (p3Var.a(i11) == 0) {
                iArr[i10] = this.f62228a.b(i11);
                i10++;
            }
        }
        if (i10 == iB) {
            return iArr;
        }
        throw a.a("Error locator degree does not match number of roots");
    }

    private int[] a(p3 p3Var, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int iB = this.f62228a.b(iArr[i10]);
            int iC = 1;
            for (int i11 = 0; i11 < length; i11++) {
                if (i10 != i11) {
                    int iC2 = this.f62228a.c(iArr[i11], iB);
                    iC = this.f62228a.c(iC, (iC2 & 1) == 0 ? iC2 | 1 : iC2 & (-2));
                }
            }
            iArr2[i10] = this.f62228a.c(p3Var.a(iB), this.f62228a.b(iC));
            if (this.f62228a.a() != 0) {
                iArr2[i10] = this.f62228a.c(iArr2[i10], iB);
            }
        }
        return iArr2;
    }

    private p3[] a(p3 p3Var, p3 p3Var2, int i10) throws Exception {
        if (p3Var.b() >= p3Var2.b()) {
            p3Var2 = p3Var;
            p3Var = p3Var2;
        }
        p3 p3VarD = this.f62228a.d();
        p3 p3VarB = this.f62228a.b();
        while (p3Var.b() >= i10 / 2) {
            if (p3Var.c()) {
                throw a.a("r_{i-1} was zero");
            }
            p3 p3VarD2 = this.f62228a.d();
            int iB = this.f62228a.b(p3Var.b(p3Var.b()));
            while (p3Var2.b() >= p3Var.b() && !p3Var2.c()) {
                int iB2 = p3Var2.b() - p3Var.b();
                int iC = this.f62228a.c(p3Var2.b(p3Var2.b()), iB);
                p3VarD2 = p3VarD2.a(this.f62228a.b(iB2, iC));
                p3Var2 = p3Var2.a(p3Var.a(iB2, iC));
            }
            p3 p3VarA = p3VarD2.c(p3VarB).a(p3VarD);
            if (p3Var2.b() >= p3Var.b()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            p3 p3Var3 = p3Var2;
            p3Var2 = p3Var;
            p3Var = p3Var3;
            p3VarD = p3VarB;
            p3VarB = p3VarA;
        }
        int iB3 = p3VarB.b(0);
        if (iB3 == 0) {
            throw a.a("sigmaTilde(0) was zero");
        }
        int iB4 = this.f62228a.b(iB3);
        return new p3[]{p3VarB.c(iB4), p3Var.c(iB4)};
    }

    public void a(int[] iArr, int i10) throws Exception {
        p3 p3Var = new p3(this.f62228a, iArr);
        int[] iArr2 = new int[i10];
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            o3 o3Var = this.f62228a;
            int iA = p3Var.a(o3Var.a(o3Var.a() + i11));
            iArr2[(i10 - 1) - i11] = iA;
            if (iA != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        p3[] p3VarArrA = a(this.f62228a.b(i10, 1), new p3(this.f62228a, iArr2), i10);
        p3 p3Var2 = p3VarArrA[0];
        p3 p3Var3 = p3VarArrA[1];
        int[] iArrA = a(p3Var2);
        int[] iArrA2 = a(p3Var3, iArrA);
        for (int i12 = 0; i12 < iArrA.length; i12++) {
            int length = (iArr.length - 1) - this.f62228a.c(iArrA[i12]);
            if (length < 0) {
                throw a.a("Bad error location");
            }
            iArr[length] = o3.a(iArr[length], iArrA2[i12]);
        }
    }
}
