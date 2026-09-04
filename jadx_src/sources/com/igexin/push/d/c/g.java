package com.igexin.push.d.c;

import com.igexin.push.util.EncryptUtils;

/* JADX INFO: loaded from: classes.dex */
public class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f63851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f63852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f63853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63854d;

    public g() {
        this.f63827i = 96;
        this.f63828j = (byte) 4;
        this.f63829k = (byte) (this.f63829k | 16);
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
        try {
            this.f63853c = bArr[0];
            int i10 = bArr[1] & 255;
            this.f63851a = a(bArr, 2, i10);
            int i11 = 2 + i10;
            int i12 = i11 + 1;
            int i13 = bArr[i11] & 255;
            byte[] bArr2 = new byte[i13];
            this.f63852b = bArr2;
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            int i14 = i12 + i13;
            this.f63854d = a(bArr, i14 + 1, bArr[i14] & 255);
        } catch (Exception unused) {
        }
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        byte[] bytes = this.f63851a.getBytes();
        byte[] iv = EncryptUtils.getIV(com.igexin.a.a.b.e.b((int) (System.currentTimeMillis() / 1000)));
        byte[] socketAESKey = EncryptUtils.getSocketAESKey();
        byte[] bArr = new byte[bytes.length + 2 + 2 + socketAESKey.length + 1 + iv.length];
        int iC = com.igexin.a.a.b.e.c(0, bArr, 0);
        int iC2 = iC + com.igexin.a.a.b.e.c((byte) bytes.length, bArr, iC);
        int iA = iC2 + com.igexin.a.a.b.e.a(bytes, 0, bArr, iC2, bytes.length);
        int iB = iA + com.igexin.a.a.b.e.b((short) socketAESKey.length, bArr, iA);
        int iA2 = iB + com.igexin.a.a.b.e.a(socketAESKey, 0, bArr, iB, socketAESKey.length);
        com.igexin.a.a.b.e.a(iv, 0, bArr, iA2 + com.igexin.a.a.b.e.c((byte) iv.length, bArr, iA2), iv.length);
        return bArr;
    }
}
