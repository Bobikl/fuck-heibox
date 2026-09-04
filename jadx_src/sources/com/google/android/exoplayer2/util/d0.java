package com.google.android.exoplayer2.util;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: ParsableBitArray.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f51383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51386d;

    public d0() {
        this.f51383a = u0.f51541f;
    }

    public d0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public d0(byte[] bArr, int i10) {
        this.f51383a = bArr;
        this.f51386d = i10;
    }

    private void a() {
        int i10;
        int i11 = this.f51384b;
        a.i(i11 >= 0 && (i11 < (i10 = this.f51386d) || (i11 == i10 && this.f51385c == 0)));
    }

    public int b() {
        return ((this.f51386d - this.f51384b) * 8) - this.f51385c;
    }

    public void c() {
        if (this.f51385c == 0) {
            return;
        }
        this.f51385c = 0;
        this.f51384b++;
        a();
    }

    public int d() {
        a.i(this.f51385c == 0);
        return this.f51384b;
    }

    public int e() {
        return (this.f51384b * 8) + this.f51385c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.f51385c, i11);
        int i12 = this.f51385c;
        int i13 = (8 - i12) - iMin;
        int i14 = (androidx.core.view.q0.f21790f >> i12) | ((1 << i13) - 1);
        byte[] bArr = this.f51383a;
        int i15 = this.f51384b;
        byte b10 = (byte) (i14 & bArr[i15]);
        bArr[i15] = b10;
        int i16 = i11 - iMin;
        bArr[i15] = (byte) (b10 | ((i10 >>> i16) << i13));
        int i17 = i15 + 1;
        while (i16 > 8) {
            this.f51383a[i17] = (byte) (i10 >>> (i16 - 8));
            i16 -= 8;
            i17++;
        }
        int i18 = 8 - i16;
        byte[] bArr2 = this.f51383a;
        byte b11 = (byte) (bArr2[i17] & ((1 << i18) - 1));
        bArr2[i17] = b11;
        bArr2[i17] = (byte) (((i10 & ((1 << i16) - 1)) << i18) | b11);
        s(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f51383a[this.f51384b] & (128 >> this.f51385c)) != 0;
        r();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f51385c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f51385c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f51385c = i13;
            byte[] bArr = this.f51383a;
            int i14 = this.f51384b;
            this.f51384b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f51383a;
        int i15 = this.f51384b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f51385c = 0;
            this.f51384b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f51383a;
            int i13 = this.f51384b;
            int i14 = i13 + 1;
            this.f51384b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f51385c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.f51385c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f51383a;
            int i18 = this.f51384b;
            this.f51384b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f51385c = i17 - 8;
        }
        int i19 = this.f51385c + i16;
        this.f51385c = i19;
        byte[] bArr4 = this.f51383a;
        int i20 = this.f51384b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f51385c = 0;
            this.f51384b = i20 + 1;
        }
        a();
    }

    public long j(int i10) {
        return i10 <= 32 ? u0.y1(h(i10)) : u0.x1(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        a.i(this.f51385c == 0);
        System.arraycopy(this.f51383a, this.f51384b, bArr, i10, i11);
        this.f51384b += i11;
        a();
    }

    public String l(int i10) {
        return m(i10, com.google.common.base.c.f56721c);
    }

    public String m(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void n(e0 e0Var) {
        p(e0Var.d(), e0Var.f());
        q(e0Var.e() * 8);
    }

    public void o(byte[] bArr) {
        p(bArr, bArr.length);
    }

    public void p(byte[] bArr, int i10) {
        this.f51383a = bArr;
        this.f51384b = 0;
        this.f51385c = 0;
        this.f51386d = i10;
    }

    public void q(int i10) {
        int i11 = i10 / 8;
        this.f51384b = i11;
        this.f51385c = i10 - (i11 * 8);
        a();
    }

    public void r() {
        int i10 = this.f51385c + 1;
        this.f51385c = i10;
        if (i10 == 8) {
            this.f51385c = 0;
            this.f51384b++;
        }
        a();
    }

    public void s(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f51384b + i11;
        this.f51384b = i12;
        int i13 = this.f51385c + (i10 - (i11 * 8));
        this.f51385c = i13;
        if (i13 > 7) {
            this.f51384b = i12 + 1;
            this.f51385c = i13 - 8;
        }
        a();
    }

    public void t(int i10) {
        a.i(this.f51385c == 0);
        this.f51384b += i10;
        a();
    }
}
