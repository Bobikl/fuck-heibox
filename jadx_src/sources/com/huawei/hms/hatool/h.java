package com.huawei.hms.hatool;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f60941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60942b = 0;

    public h(int i10) {
        this.f60941a = null;
        this.f60941a = new byte[i10];
    }

    public void a(byte[] bArr, int i10) {
        if (i10 <= 0) {
            return;
        }
        byte[] bArr2 = this.f60941a;
        int length = bArr2.length;
        int i11 = this.f60942b;
        if (length - i11 >= i10) {
            System.arraycopy(bArr, 0, bArr2, i11, i10);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i10) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i11);
            System.arraycopy(bArr, 0, bArr3, this.f60942b, i10);
            this.f60941a = bArr3;
        }
        this.f60942b += i10;
    }

    public byte[] a() {
        int i10 = this.f60942b;
        if (i10 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f60941a, 0, bArr, 0, i10);
        return bArr;
    }

    public int b() {
        return this.f60942b;
    }
}
