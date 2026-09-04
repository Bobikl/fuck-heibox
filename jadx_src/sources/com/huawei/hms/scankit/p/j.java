package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: BarcodeMatrix.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l[] f61958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f61961d;

    j(int i10, int i11) {
        this.f61958a = new l[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            this.f61958a[i12] = new l(((i11 + 4) * 17) + 1);
        }
        this.f61961d = i11 * 17;
        this.f61960c = i10;
        this.f61959b = -1;
    }

    l a() {
        try {
            int i10 = this.f61959b;
            if (i10 >= 0) {
                l[] lVarArr = this.f61958a;
                if (i10 < lVarArr.length) {
                    return lVarArr[i10];
                }
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public byte[][] a(int i10, int i11) {
        int i12 = this.f61960c * i11;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12, this.f61961d * i10);
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f61958a[i13 / i11].a(i10);
        }
        return bArr;
    }

    void b() {
        this.f61959b++;
    }
}
