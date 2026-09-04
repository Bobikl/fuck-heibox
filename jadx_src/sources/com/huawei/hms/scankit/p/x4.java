package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ModulusPoly.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w4 f62548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f62549b;

    x4(w4 w4Var, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f62548a = w4Var;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f62549b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f62549b = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.f62549b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    int a() {
        return this.f62549b.length - 1;
    }

    int a(int i10) {
        if (i10 == 0) {
            return b(0);
        }
        if (i10 == 1) {
            int iA = 0;
            for (int i11 : this.f62549b) {
                iA = this.f62548a.a(iA, i11);
            }
            return iA;
        }
        int[] iArr = this.f62549b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i12 = 1; i12 < length; i12++) {
            w4 w4Var = this.f62548a;
            iA2 = w4Var.a(w4Var.c(i10, iA2), this.f62549b[i12]);
        }
        return iA2;
    }

    x4 a(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f62548a.c();
        }
        int length = this.f62549b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f62548a.c(this.f62549b[i12], i11);
        }
        return new x4(this.f62548a, iArr);
    }

    x4 a(x4 x4Var) {
        if (!this.f62548a.equals(x4Var.f62548a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (b()) {
            return x4Var;
        }
        if (x4Var.b()) {
            return this;
        }
        int[] iArr = this.f62549b;
        int[] iArr2 = x4Var.f62549b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = this.f62548a.a(iArr2[i10 - length], iArr[i10]);
        }
        return new x4(this.f62548a, iArr3);
    }

    int b(int i10) {
        int[] iArr = this.f62549b;
        return iArr[(iArr.length - 1) - i10];
    }

    x4 b(x4 x4Var) {
        if (!this.f62548a.equals(x4Var.f62548a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (b() || x4Var.b()) {
            return this.f62548a.c();
        }
        int[] iArr = this.f62549b;
        int length = iArr.length;
        int[] iArr2 = x4Var.f62549b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                w4 w4Var = this.f62548a;
                iArr3[i13] = w4Var.a(iArr3[i13], w4Var.c(i11, iArr2[i12]));
            }
        }
        return new x4(this.f62548a, iArr3);
    }

    boolean b() {
        return this.f62549b[0] == 0;
    }

    x4 c() {
        int length = this.f62549b.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f62548a.d(0, this.f62549b[i10]);
        }
        return new x4(this.f62548a, iArr);
    }

    x4 c(int i10) {
        if (i10 == 0) {
            return this.f62548a.c();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f62549b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f62548a.c(this.f62549b[i11], i10);
        }
        return new x4(this.f62548a, iArr);
    }

    x4 c(x4 x4Var) {
        if (this.f62548a.equals(x4Var.f62548a)) {
            return x4Var.b() ? this : a(x4Var.c());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(a() * 8);
        for (int iA = a(); iA >= 0; iA--) {
            int iB = b(iA);
            if (iB != 0) {
                if (iB < 0) {
                    sb2.append(" - ");
                    iB = -iB;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iA == 0 || iB != 1) {
                    sb2.append(iB);
                }
                if (iA != 0) {
                    if (iA == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iA);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
