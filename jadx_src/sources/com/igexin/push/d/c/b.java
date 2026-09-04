package com.igexin.push.d.c;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f63821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f63823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f63824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f63825g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f63826h = "UTF-8";

    public b() {
        this.f63827i = 25;
        this.f63828j = com.google.common.base.a.f56671x;
    }

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f63819a = com.igexin.a.a.b.e.c(bArr, 0);
        byte b10 = bArr[2];
        this.f63820b = b10 & 192;
        this.f63826h = a(b10);
        this.f63821c = com.igexin.a.a.b.e.e(bArr, 3);
        int i16 = bArr[11] & 255;
        try {
            this.f63822d = new String(bArr, 12, i16, this.f63826h);
            while (true) {
                int i17 = bArr[i10];
                i12 = i11 | (i17 & 127);
                if ((i17 & 128) == 0) {
                    break;
                }
                i11 = i12 << 7;
                i10++;
            }
            while (true) {
                int i18 = bArr[i13];
                i15 = i14 | (i18 & 127);
                if ((i18 & 128) == 0) {
                    break;
                }
                i14 = i15 << 7;
                i13++;
            }
        } catch (Exception unused) {
        }
        i10 = 12 + i16;
        i11 = 0;
        int i19 = i10 + 1;
        if (i12 > 0) {
            if (this.f63820b == 192) {
                byte[] bArr2 = new byte[i12];
                this.f63823e = bArr2;
                System.arraycopy(bArr, i19, bArr2, 0, i12);
            } else {
                try {
                    this.f63823e = new String(bArr, i19, i12, this.f63826h);
                } catch (Exception unused2) {
                }
            }
        }
        i13 = i19 + i12;
        i14 = 0;
        int i20 = i13 + 1;
        if (i15 > 0) {
            byte[] bArr3 = new byte[i15];
            this.f63824f = bArr3;
            System.arraycopy(bArr, i20, bArr3, 0, i15);
        }
        int i21 = i20 + i15;
        if (bArr.length > i21) {
            try {
                this.f63825g = new String(bArr, i21 + 1, bArr[i21] & 255, this.f63826h);
            } catch (Exception unused3) {
            }
        }
    }

    public final void b() {
        this.f63820b = 128;
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        byte[] bytes;
        byte[] bArr = null;
        try {
            byte[] bytes2 = this.f63822d.getBytes(this.f63826h);
            if ("".equals(this.f63823e)) {
                bytes = null;
            } else {
                bytes = this.f63820b == 192 ? (byte[]) this.f63823e : ((String) this.f63823e).getBytes(this.f63826h);
            }
            Object obj = this.f63824f;
            byte[] bArr2 = obj != null ? (byte[]) obj : null;
            byte[] bytes3 = this.f63825g.getBytes(this.f63826h);
            int length = bytes == null ? 0 : bytes.length;
            int length2 = bArr2 == null ? 0 : bArr2.length;
            byte[] bArrA = com.igexin.a.a.b.e.a(length);
            byte[] bArrA2 = com.igexin.a.a.b.e.a(length2);
            bArr = new byte[bytes2.length + 13 + bArrA.length + length + bArrA2.length + length2 + bytes3.length];
            int iB = com.igexin.a.a.b.e.b(this.f63819a, bArr, 0);
            int iC = iB + com.igexin.a.a.b.e.c(this.f63820b | a(this.f63826h), bArr, iB);
            int iA = iC + com.igexin.a.a.b.e.a(this.f63821c, bArr, iC);
            int iC2 = iA + com.igexin.a.a.b.e.c(bytes2.length, bArr, iA);
            int iA2 = iC2 + com.igexin.a.a.b.e.a(bytes2, 0, bArr, iC2, bytes2.length);
            int iA3 = iA2 + com.igexin.a.a.b.e.a(bArrA, 0, bArr, iA2, bArrA.length);
            if (length > 0) {
                iA3 += com.igexin.a.a.b.e.a(bytes, 0, bArr, iA3, length);
            }
            int iA4 = iA3 + com.igexin.a.a.b.e.a(bArrA2, 0, bArr, iA3, bArrA2.length);
            if (length2 > 0) {
                iA4 += com.igexin.a.a.b.e.a(bArr2, 0, bArr, iA4, length2);
            }
            com.igexin.a.a.b.e.a(bytes3, 0, bArr, iA4 + com.igexin.a.a.b.e.c(bytes3.length, bArr, iA4), bytes3.length);
        } catch (Exception unused) {
        }
        if (bArr != null && bArr.length >= com.igexin.push.config.l.M) {
            this.f63828j = (byte) (this.f63828j | 128);
        }
        return bArr;
    }
}
