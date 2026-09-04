package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: BarcodeRow.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f62046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62047b = 0;

    l(int i10) {
        this.f62046a = new byte[i10];
    }

    private void a(int i10, boolean z10) {
        try {
            if (!w7.a(this.f62046a, i10)) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f62046a[i10] = z10 ? (byte) 1 : (byte) 0;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f62047b;
            this.f62047b = i12 + 1;
            a(i12, z10);
        }
    }

    byte[] a(int i10) {
        int length = this.f62046a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f62046a[i11 / i10];
        }
        return bArr;
    }
}
