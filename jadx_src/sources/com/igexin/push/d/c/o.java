package com.igexin.push.d.c;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f63883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f63884b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f63885c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63886d = "";

    public o() {
        this.f63827i = 9;
    }

    private String a(byte[] bArr, int i10, int i11) {
        try {
            return new String(bArr, i10, i11, "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
        this.f63883a = com.igexin.a.a.b.e.e(bArr, 0);
        int i10 = 8;
        if (bArr.length > 8) {
            int i11 = bArr[8] & 255;
            if (i11 > 0) {
                this.f63884b = a(bArr, 9, i11);
                i10 = i11 + 9;
            } else {
                i10 = 9;
            }
        }
        if (bArr.length > i10) {
            int i12 = i10 + 1;
            int i13 = bArr[i10] & 255;
            if (i13 > 0) {
                this.f63885c = a(bArr, i12, i13);
                i10 = i13 + i12;
            } else {
                i10 = i12;
            }
        }
        if (bArr.length > i10) {
            int i14 = i10 + 1;
            int i15 = bArr[i10] & 255;
            if (i15 > 0) {
                this.f63886d = a(bArr, i14, i15);
            }
        }
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        if (TextUtils.isEmpty(this.f63885c) || TextUtils.isEmpty(this.f63886d)) {
            byte[] bytes = this.f63884b.getBytes();
            byte[] bArr = new byte[bytes.length + 8 + 1];
            com.igexin.a.a.b.e.a(this.f63883a, bArr, 0);
            com.igexin.a.a.b.e.c(bytes.length, bArr, 8);
            System.arraycopy(bytes, 0, bArr, 9, bytes.length);
            return bArr;
        }
        byte[] bytes2 = this.f63884b.getBytes();
        byte[] bytes3 = this.f63885c.getBytes();
        byte[] bytes4 = this.f63886d.getBytes();
        byte[] bArr2 = new byte[bytes2.length + 8 + bytes3.length + bytes4.length + 3];
        com.igexin.a.a.b.e.a(this.f63883a, bArr2, 0);
        com.igexin.a.a.b.e.c(bytes2.length, bArr2, 8);
        System.arraycopy(bytes2, 0, bArr2, 9, bytes2.length);
        int length = 9 + bytes2.length;
        int i10 = length + 1;
        com.igexin.a.a.b.e.c(bytes3.length, bArr2, length);
        System.arraycopy(bytes3, 0, bArr2, i10, bytes3.length);
        int length2 = i10 + bytes3.length;
        com.igexin.a.a.b.e.c(bytes4.length, bArr2, length2);
        System.arraycopy(bytes4, 0, bArr2, length2 + 1, bytes4.length);
        return bArr2;
    }
}
