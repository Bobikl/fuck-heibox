package com.huawei.hms.scankit.p;

import java.util.Arrays;

/* JADX INFO: compiled from: BitMatrix.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f62306d;

    public s(int i10) {
        this(i10, i10);
    }

    public s(int i10, int i11) throws Exception {
        if (i10 < 1 || i11 < 1) {
            try {
                throw new IllegalArgumentException("Both dimensions must be greater than 0");
            } catch (Exception e10) {
                throw e10;
            }
        }
        this.f62303a = i10;
        this.f62304b = i11;
        int i12 = (i10 + 31) / 32;
        this.f62305c = i12;
        this.f62306d = new int[i12 * i11];
    }

    public s(int i10, int i11, int i12, int[] iArr) {
        this.f62303a = i10;
        this.f62304b = i11;
        this.f62305c = i12;
        this.f62306d = iArr;
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f62304b * (this.f62303a + 1));
        for (int i10 = 0; i10 < this.f62304b; i10++) {
            for (int i11 = 0; i11 < this.f62303a; i11++) {
                sb2.append(b(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public r a(int i10, r rVar) {
        if (rVar == null || rVar.e() < this.f62303a) {
            rVar = new r(this.f62303a);
        } else {
            rVar.a();
        }
        int i11 = i10 * this.f62305c;
        for (int i12 = 0; i12 < this.f62305c; i12++) {
            rVar.b(i12 * 32, this.f62306d[i11 + i12]);
        }
        return rVar;
    }

    public String a(String str, String str2) {
        return a(str, str2, "\n");
    }

    public void a() {
        int length = this.f62306d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f62306d[i10] = 0;
        }
    }

    public void a(int i10, int i11) {
        int i12 = (i11 * this.f62305c) + (i10 / 32);
        if (w7.a(this.f62306d, i12)) {
            int[] iArr = this.f62306d;
            iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
        }
    }

    public void a(int i10, int i11, int i12, int i13) throws Exception {
        if (i11 < 0 || i10 < 0) {
            try {
                throw new IllegalArgumentException("Left and top must be nonnegative");
            } catch (Exception e10) {
                throw e10;
            }
        }
        if (i13 < 1 || i12 < 1) {
            try {
                throw new IllegalArgumentException("Height and width must be at least 1");
            } catch (Exception e11) {
                throw e11;
            }
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f62304b || i14 > this.f62303a) {
            try {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            } catch (Exception e12) {
                throw e12;
            }
        }
        while (i11 < i15) {
            int i16 = this.f62305c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f62306d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s clone() {
        return new s(this.f62303a, this.f62304b, this.f62305c, (int[]) this.f62306d.clone());
    }

    public void b(int i10, r rVar) {
        int[] iArrD = rVar.d();
        int[] iArr = this.f62306d;
        int i11 = this.f62305c;
        System.arraycopy(iArrD, 0, iArr, i10 * i11, i11);
    }

    public boolean b(int i10, int i11) {
        int i12 = (i11 * this.f62305c) + (i10 / 32);
        return w7.a(this.f62306d, i12) && ((this.f62306d[i12] >>> (i10 & 31)) & 1) != 0;
    }

    public int c() {
        return this.f62304b;
    }

    public void c(int i10, int i11) {
        int i12 = (i11 * this.f62305c) + (i10 / 32);
        if (w7.a(this.f62306d, i12)) {
            int[] iArr = this.f62306d;
            iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
        }
    }

    public s d() {
        int[] iArr = new int[this.f62306d.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f62306d;
            if (i10 >= iArr2.length) {
                return new s(this.f62303a, this.f62304b, this.f62305c, iArr);
            }
            iArr[i10] = ~iArr2[i10];
            i10++;
        }
    }

    public int e() {
        return this.f62303a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f62303a == sVar.f62303a && this.f62304b == sVar.f62304b && this.f62305c == sVar.f62305c && Arrays.equals(this.f62306d, sVar.f62306d);
    }

    public void f() {
        int iE = e();
        int iC = c();
        r rVar = new r(iE);
        r rVar2 = new r(iE);
        for (int i10 = 0; i10 < (iC + 1) / 2; i10++) {
            rVar = a(i10, rVar);
            int i11 = (iC - 1) - i10;
            rVar2 = a(i11, rVar2);
            rVar.h();
            rVar2.h();
            b(i10, rVar2);
            b(i11, rVar);
        }
    }

    public int hashCode() {
        int i10 = this.f62303a;
        return (((((((i10 * 31) + i10) * 31) + this.f62304b) * 31) + this.f62305c) * 31) + Arrays.hashCode(this.f62306d);
    }

    public String toString() {
        return a("X ", "  ");
    }
}
