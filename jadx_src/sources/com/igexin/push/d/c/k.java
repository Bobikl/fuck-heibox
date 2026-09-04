package com.igexin.push.d.c;

import com.google.common.primitives.SignedBytes;

/* JADX INFO: loaded from: classes.dex */
public class k extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f63864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f63866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f63868e;

    public k() {
        this.f63827i = 5;
    }

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
        byte b10 = bArr[0];
        int i10 = 1;
        this.f63864a = (b10 & SignedBytes.f59068a) != 0;
        boolean z10 = (b10 & 128) != 0;
        this.f63865b = z10;
        if (z10) {
            this.f63866c = a(b10);
            int iC = com.igexin.a.a.b.e.c(bArr, 1);
            i10 = 1 + iC + 2;
            try {
                this.f63867d = new String(bArr, 3, iC, this.f63866c);
            } catch (Exception unused) {
            }
        }
        if (bArr.length > i10) {
            this.f63868e = com.igexin.a.a.b.e.e(bArr, i10);
            com.igexin.a.a.c.b.a("LoginResult|session = " + this.f63868e, new Object[0]);
        }
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        int i10;
        int length;
        byte bA = this.f63864a ? (byte) 64 : (byte) 0;
        byte[] bytes = null;
        if (this.f63865b) {
            byte b10 = (byte) (bA | 128);
            i10 = 3;
            try {
                bytes = this.f63867d.getBytes(this.f63866c);
                length = bytes.length;
                i10 = 3 + length;
            } catch (Exception unused) {
                length = 0;
            }
            bA = (byte) (b10 | a(this.f63866c));
        } else {
            i10 = 1;
            length = 0;
        }
        byte[] bArr = new byte[i10 + 8];
        int iC = com.igexin.a.a.b.e.c(bA, bArr, 0);
        if (this.f63865b) {
            iC = com.igexin.a.a.b.e.b(length, bArr, iC);
            if (bytes != null) {
                iC += com.igexin.a.a.b.e.a(bytes, 0, bArr, iC, length);
            }
        }
        com.igexin.a.a.b.e.a(this.f63868e, bArr, iC);
        return bArr;
    }
}
