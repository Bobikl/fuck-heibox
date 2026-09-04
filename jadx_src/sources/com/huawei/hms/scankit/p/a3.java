package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ErrorCorrection.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w4 f61520a = w4.f62512f;

    private int[] a(x4 x4Var) throws a {
        int iA = x4Var.a();
        int[] iArr = new int[iA];
        int i10 = 0;
        for (int i11 = 1; i11 < this.f61520a.b() && i10 < iA; i11++) {
            if (x4Var.a(i11) == 0) {
                iArr[i10] = this.f61520a.b(i11);
                i10++;
            }
        }
        if (i10 == iA) {
            return iArr;
        }
        throw a.a();
    }

    private int[] a(x4 x4Var, x4 x4Var2, int[] iArr) {
        int iA = x4Var2.a();
        int[] iArr2 = new int[iA];
        for (int i10 = 1; i10 <= iA; i10++) {
            iArr2[iA - i10] = this.f61520a.c(i10, x4Var2.b(i10));
        }
        x4 x4Var3 = new x4(this.f61520a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int iB = this.f61520a.b(iArr[i11]);
            iArr3[i11] = this.f61520a.c(this.f61520a.d(0, x4Var.a(iB)), this.f61520a.b(x4Var3.a(iB)));
        }
        return iArr3;
    }

    private x4[] a(x4 x4Var, x4 x4Var2, int i10) throws a {
        if (x4Var.a() >= x4Var2.a()) {
            x4Var2 = x4Var;
            x4Var = x4Var2;
        }
        x4 x4VarC = this.f61520a.c();
        x4 x4VarA = this.f61520a.a();
        while (x4Var.a() >= i10 / 2) {
            if (x4Var.b()) {
                throw a.a();
            }
            x4 x4VarC2 = this.f61520a.c();
            int iB = this.f61520a.b(x4Var.b(x4Var.a()));
            while (x4Var2.a() >= x4Var.a() && !x4Var2.b()) {
                int iA = x4Var2.a() - x4Var.a();
                int iC = this.f61520a.c(x4Var2.b(x4Var2.a()), iB);
                x4VarC2 = x4VarC2.a(this.f61520a.b(iA, iC));
                x4Var2 = x4Var2.c(x4Var.a(iA, iC));
            }
            x4 x4VarC3 = x4VarC2.b(x4VarA).c(x4VarC).c();
            x4 x4Var3 = x4Var2;
            x4Var2 = x4Var;
            x4Var = x4Var3;
            x4VarC = x4VarA;
            x4VarA = x4VarC3;
        }
        int iB2 = x4VarA.b(0);
        if (iB2 == 0) {
            throw a.a();
        }
        int iB3 = this.f61520a.b(iB2);
        return new x4[]{x4VarA.c(iB3), x4Var.c(iB3)};
    }

    public int a(int[] iArr, int i10, int[] iArr2) throws a {
        x4 x4Var = new x4(this.f61520a, iArr);
        int[] iArr3 = new int[i10];
        boolean z10 = false;
        for (int i11 = i10; i11 > 0; i11--) {
            int iA = x4Var.a(this.f61520a.a(i11));
            iArr3[i10 - i11] = iA;
            if (iA != 0) {
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        x4 x4VarA = this.f61520a.a();
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                int iA2 = this.f61520a.a((iArr.length - 1) - i12);
                w4 w4Var = this.f61520a;
                x4VarA = x4VarA.b(new x4(w4Var, new int[]{w4Var.d(0, iA2), 1}));
            }
        }
        x4[] x4VarArrA = a(this.f61520a.b(i10, 1), new x4(this.f61520a, iArr3), i10);
        x4 x4Var2 = x4VarArrA[0];
        x4 x4Var3 = x4VarArrA[1];
        int[] iArrA = a(x4Var2);
        int[] iArrA2 = a(x4Var3, x4Var2, iArrA);
        for (int i13 = 0; i13 < iArrA.length; i13++) {
            int length = (iArr.length - 1) - this.f61520a.c(iArrA[i13]);
            if (length < 0) {
                throw a.a();
            }
            iArr[length] = this.f61520a.d(iArr[length], iArrA2[i13]);
        }
        return iArrA.length;
    }
}
