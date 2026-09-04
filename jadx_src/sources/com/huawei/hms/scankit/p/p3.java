package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: GenericGFPoly.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o3 f62223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f62224b;

    p3(o3 o3Var, int[] iArr) throws Exception {
        if (iArr.length == 0) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        }
        this.f62223a = o3Var;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f62224b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f62224b = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.f62224b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    int a(int i10) {
        if (i10 == 0) {
            return b(0);
        }
        if (i10 == 1) {
            int iA = 0;
            for (int i11 : this.f62224b) {
                iA = o3.a(iA, i11);
            }
            return iA;
        }
        int[] iArr = this.f62224b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i12 = 1; i12 < length; i12++) {
            iA2 = o3.a(this.f62223a.c(i10, iA2), this.f62224b[i12]);
        }
        return iA2;
    }

    p3 a(int i10, int i11) throws Exception {
        if (i10 < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        }
        if (i11 == 0) {
            return this.f62223a.d();
        }
        int length = this.f62224b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f62223a.c(this.f62224b[i12], i11);
        }
        return new p3(this.f62223a, iArr);
    }

    p3 a(p3 p3Var) throws Exception {
        if (!this.f62223a.equals(p3Var.f62223a)) {
            try {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            } catch (Exception e10) {
                throw e10;
            }
        }
        if (c()) {
            return p3Var;
        }
        if (p3Var.c()) {
            return this;
        }
        int[] iArr = this.f62224b;
        int[] iArr2 = p3Var.f62224b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = o3.a(iArr2[i10 - length], iArr[i10]);
        }
        return new p3(this.f62223a, iArr3);
    }

    int[] a() {
        return this.f62224b;
    }

    int b() {
        return this.f62224b.length - 1;
    }

    int b(int i10) {
        int[] iArr = this.f62224b;
        return iArr[(iArr.length - 1) - i10];
    }

    p3[] b(p3 p3Var) throws Exception {
        if (!this.f62223a.equals(p3Var.f62223a)) {
            try {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            } catch (Exception e10) {
                throw e10;
            }
        }
        if (p3Var.c()) {
            try {
                throw new IllegalArgumentException("Divide by 0");
            } catch (Exception e11) {
                throw e11;
            }
        }
        p3 p3VarD = this.f62223a.d();
        int iB = this.f62223a.b(p3Var.b(p3Var.b()));
        p3 p3VarA = this;
        while (p3VarA.b() >= p3Var.b() && !p3VarA.c()) {
            int iB2 = p3VarA.b() - p3Var.b();
            int iC = this.f62223a.c(p3VarA.b(p3VarA.b()), iB);
            p3 p3VarA2 = p3Var.a(iB2, iC);
            p3VarD = p3VarD.a(this.f62223a.b(iB2, iC));
            p3VarA = p3VarA.a(p3VarA2);
        }
        return new p3[]{p3VarD, p3VarA};
    }

    p3 c(int i10) {
        if (i10 == 0) {
            return this.f62223a.d();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f62224b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f62223a.c(this.f62224b[i11], i10);
        }
        return new p3(this.f62223a, iArr);
    }

    p3 c(p3 p3Var) throws Exception {
        if (!this.f62223a.equals(p3Var.f62223a)) {
            try {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            } catch (Exception e10) {
                throw e10;
            }
        }
        if (c() || p3Var.c()) {
            return this.f62223a.d();
        }
        int[] iArr = this.f62224b;
        int length = iArr.length;
        int[] iArr2 = p3Var.f62224b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = o3.a(iArr3[i13], this.f62223a.c(i11, iArr2[i12]));
            }
        }
        return new p3(this.f62223a, iArr3);
    }

    boolean c() {
        return this.f62224b[0] == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(b() * 8);
        for (int iB = b(); iB >= 0; iB--) {
            int iB2 = b(iB);
            if (iB2 != 0) {
                if (iB2 < 0) {
                    sb2.append(" - ");
                    iB2 = -iB2;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iB == 0 || iB2 != 1) {
                    int iC = this.f62223a.c(iB2);
                    if (iC == 0) {
                        sb2.append('1');
                    } else if (iC == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(iC);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iB);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
