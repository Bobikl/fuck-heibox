package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ModulusGF.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w4 f62512f = new w4(bb.c.b.Te, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f62513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f62514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x4 f62515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x4 f62516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62517e;

    private w4(int i10, int i11) {
        this.f62517e = i10;
        this.f62513a = new int[i10];
        this.f62514b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f62513a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f62514b[this.f62513a[i14]] = i14;
        }
        this.f62515c = new x4(this, new int[]{0});
        this.f62516d = new x4(this, new int[]{1});
    }

    int a(int i10) {
        return this.f62513a[i10];
    }

    int a(int i10, int i11) {
        return (i10 + i11) % this.f62517e;
    }

    x4 a() {
        return this.f62516d;
    }

    int b() {
        return this.f62517e;
    }

    int b(int i10) {
        if (i10 != 0) {
            return this.f62513a[(this.f62517e - this.f62514b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    x4 b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f62515c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new x4(this, iArr);
    }

    int c(int i10) {
        if (i10 != 0) {
            return this.f62514b[i10];
        }
        throw new IllegalArgumentException();
    }

    int c(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return 0;
        }
        int[] iArr = this.f62513a;
        int[] iArr2 = this.f62514b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f62517e - 1)];
    }

    x4 c() {
        return this.f62515c;
    }

    int d(int i10, int i11) {
        int i12 = this.f62517e;
        return ((i10 + i12) - i11) % i12;
    }
}
