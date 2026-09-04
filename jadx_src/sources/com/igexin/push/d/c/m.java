package com.igexin.push.d.c;

/* JADX INFO: loaded from: classes.dex */
public class m extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f63874m = "com.igexin.push.d.c.m";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f63877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f63879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f63880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f63881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f63882h = "UTF-8";

    public m() {
        this.f63827i = 26;
    }

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f63875a = com.igexin.a.a.b.e.c(bArr, 0);
        byte b10 = bArr[2];
        this.f63876b = b10 & 192;
        this.f63882h = a(b10);
        this.f63877c = com.igexin.a.a.b.e.e(bArr, 3);
        int i16 = bArr[11] & 255;
        try {
            this.f63878d = new String(bArr, 12, i16, this.f63882h);
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
            this.f63878d = "";
        }
        i10 = 12 + i16;
        i11 = 0;
        int i19 = i10 + 1;
        if (i12 > 0) {
            if (this.f63876b == 192) {
                byte[] bArr2 = new byte[i12];
                this.f63879e = bArr2;
                System.arraycopy(bArr, i19, bArr2, 0, i12);
            } else {
                try {
                    this.f63879e = new String(bArr, i19, i12, this.f63882h);
                } catch (Exception unused2) {
                }
            }
        }
        i13 = i19 + i12;
        i14 = 0;
        int i20 = i13 + 1;
        if (i15 > 0) {
            byte[] bArr3 = new byte[i15];
            this.f63880f = bArr3;
            System.arraycopy(bArr, i20, bArr3, 0, i15);
        }
        int i21 = i20 + i15;
        if (bArr.length > i21) {
            try {
                this.f63881g = new String(bArr, i21 + 1, bArr[i21] & 255, this.f63882h);
            } catch (Exception unused3) {
            }
        }
    }

    public final boolean b() {
        return this.f63876b == 128;
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        byte[] bytes;
        byte[] bArr = null;
        try {
            byte[] bytes2 = this.f63878d.getBytes(this.f63882h);
            byte[] bytes3 = this.f63881g.getBytes(this.f63882h);
            if ("".equals(this.f63879e)) {
                bytes = null;
            } else {
                bytes = this.f63876b == 192 ? (byte[]) this.f63879e : ((String) this.f63879e).getBytes(this.f63882h);
            }
            Object obj = this.f63880f;
            byte[] bArr2 = obj != null ? (byte[]) obj : null;
            int length = bytes == null ? 0 : bytes.length;
            int length2 = bArr2 == null ? 0 : bArr2.length;
            byte[] bArrA = com.igexin.a.a.b.e.a(length);
            byte[] bArrA2 = com.igexin.a.a.b.e.a(length2);
            bArr = new byte[bytes2.length + 13 + bArrA.length + length + bArrA2.length + length2 + bytes3.length];
            int iB = com.igexin.a.a.b.e.b(this.f63875a, bArr, 0);
            int iC = iB + com.igexin.a.a.b.e.c(this.f63876b | a(this.f63882h), bArr, iB);
            int iA = iC + com.igexin.a.a.b.e.a(this.f63877c, bArr, iC);
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
        return bArr;
    }

    public final void d() {
        this.f63876b = 128;
    }
}
