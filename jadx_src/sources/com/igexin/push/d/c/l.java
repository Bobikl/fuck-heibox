package com.igexin.push.d.c;

import com.google.common.primitives.SignedBytes;

/* JADX INFO: loaded from: classes.dex */
public class l extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f63869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f63871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f63873e;

    public l() {
        this.f63827i = 37;
    }

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
        byte b10 = bArr[0];
        int i10 = 1;
        this.f63869a = (b10 & SignedBytes.f59068a) != 0;
        boolean z10 = (b10 & 128) != 0;
        this.f63870b = z10;
        if (z10) {
            this.f63871c = a(b10);
            int iC = com.igexin.a.a.b.e.c(bArr, 1);
            i10 = 1 + iC + 2;
            try {
                this.f63872d = new String(bArr, 3, iC, this.f63871c);
            } catch (Exception unused) {
            }
        }
        if (bArr.length > i10) {
            this.f63873e = com.igexin.a.a.b.e.e(bArr, i10);
        }
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        int i10;
        int length;
        byte bA = this.f63869a ? (byte) 64 : (byte) 0;
        byte[] bytes = null;
        if (this.f63870b) {
            byte b10 = (byte) (bA | 128);
            i10 = 3;
            try {
                bytes = this.f63872d.getBytes(this.f63871c);
                length = bytes.length;
                i10 = 3 + length;
            } catch (Exception unused) {
                length = 0;
            }
            bA = (byte) (b10 | a(this.f63871c));
        } else {
            i10 = 1;
            length = 0;
        }
        byte[] bArr = new byte[i10 + 8];
        int iC = com.igexin.a.a.b.e.c(bA, bArr, 0);
        if (this.f63870b) {
            iC = com.igexin.a.a.b.e.b(length, bArr, iC);
            if (bytes != null) {
                iC += com.igexin.a.a.b.e.a(bytes, 0, bArr, iC, length);
            }
        }
        com.igexin.a.a.b.e.a(this.f63873e, bArr, iC);
        return bArr;
    }
}
