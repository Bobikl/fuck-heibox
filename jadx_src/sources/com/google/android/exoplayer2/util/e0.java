package com.google.android.exoplayer2.util;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: compiled from: ParsableByteArray.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f51388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51390c;

    public e0() {
        this.f51388a = u0.f51541f;
    }

    public e0(int i10) {
        this.f51388a = new byte[i10];
        this.f51390c = i10;
    }

    public e0(byte[] bArr) {
        this.f51388a = bArr;
        this.f51390c = bArr.length;
    }

    public e0(byte[] bArr, int i10) {
        this.f51388a = bArr;
        this.f51390c = i10;
    }

    @androidx.annotation.p0
    public String A() {
        return l((char) 0);
    }

    public String B(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f51389b;
        int i12 = (i11 + i10) - 1;
        String strJ = u0.J(this.f51388a, i11, (i12 >= this.f51390c || this.f51388a[i12] != 0) ? i10 : i10 - 1);
        this.f51389b += i10;
        return strJ;
    }

    public short C() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f51389b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String D(int i10) {
        return E(i10, com.google.common.base.c.f56721c);
    }

    public String E(int i10, Charset charset) {
        String str = new String(this.f51388a, this.f51389b, i10, charset);
        this.f51389b += i10;
        return str;
    }

    public int F() {
        return (G() << 21) | (G() << 14) | (G() << 7) | G();
    }

    public int G() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        this.f51389b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int H() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f51389b = i11 + 1 + 2;
        return i12;
    }

    public long I() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
        this.f51389b = i13 + 1;
        return j11 | (((long) bArr[i13]) & 255);
    }

    public int J() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f51389b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int K() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(iO);
        throw new IllegalStateException(sb2.toString());
    }

    public long L() {
        long jZ = z();
        if (jZ >= 0) {
            return jZ;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(jZ);
        throw new IllegalStateException(sb2.toString());
    }

    public int M() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f51389b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public long N() {
        int i10;
        int i11;
        long j10 = this.f51388a[this.f51389b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("Invalid UTF-8 sequence first byte: ");
            sb2.append(j10);
            throw new NumberFormatException(sb2.toString());
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f51388a[this.f51389b + i10];
            if ((b10 & 192) != 128) {
                StringBuilder sb3 = new StringBuilder(62);
                sb3.append("Invalid UTF-8 sequence continuation byte: ");
                sb3.append(j10);
                throw new NumberFormatException(sb3.toString());
            }
            j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
        }
        this.f51389b += i11;
        return j10;
    }

    public void O(int i10) {
        Q(b() < i10 ? new byte[i10] : this.f51388a, i10);
    }

    public void P(byte[] bArr) {
        Q(bArr, bArr.length);
    }

    public void Q(byte[] bArr, int i10) {
        this.f51388a = bArr;
        this.f51390c = i10;
        this.f51389b = 0;
    }

    public void R(int i10) {
        a.a(i10 >= 0 && i10 <= this.f51388a.length);
        this.f51390c = i10;
    }

    public void S(int i10) {
        a.a(i10 >= 0 && i10 <= this.f51390c);
        this.f51389b = i10;
    }

    public void T(int i10) {
        S(this.f51389b + i10);
    }

    public int a() {
        return this.f51390c - this.f51389b;
    }

    public int b() {
        return this.f51388a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f51388a = Arrays.copyOf(this.f51388a, i10);
        }
    }

    public byte[] d() {
        return this.f51388a;
    }

    public int e() {
        return this.f51389b;
    }

    public int f() {
        return this.f51390c;
    }

    public char g() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int h() {
        return this.f51388a[this.f51389b] & 255;
    }

    public void i(d0 d0Var, int i10) {
        k(d0Var.f51383a, 0, i10);
        d0Var.q(0);
    }

    public void j(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.f51388a, this.f51389b, i10);
        this.f51389b += i10;
    }

    public void k(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f51388a, this.f51389b, bArr, i10, i11);
        this.f51389b += i11;
    }

    @androidx.annotation.p0
    public String l(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f51389b;
        while (i10 < this.f51390c && this.f51388a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f51388a;
        int i11 = this.f51389b;
        String strJ = u0.J(bArr, i11, i10 - i11);
        this.f51389b = i10;
        if (i10 < this.f51390c) {
            this.f51389b = i10 + 1;
        }
        return strJ;
    }

    public double m() {
        return Double.longBitsToDouble(z());
    }

    public float n() {
        return Float.intBitsToFloat(o());
    }

    public int o() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f51389b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public int p() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f51389b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    @androidx.annotation.p0
    public String q() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f51389b;
        while (i10 < this.f51390c && !u0.I0(this.f51388a[i10])) {
            i10++;
        }
        int i11 = this.f51389b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f51388a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f51389b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f51388a;
        int i12 = this.f51389b;
        String strJ = u0.J(bArr2, i12, i10 - i12);
        this.f51389b = i10;
        int i13 = this.f51390c;
        if (i10 == i13) {
            return strJ;
        }
        byte[] bArr3 = this.f51388a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f51389b = i14;
            if (i14 == i13) {
                return strJ;
            }
        }
        int i15 = this.f51389b;
        if (bArr3[i15] == 10) {
            this.f51389b = i15 + 1;
        }
        return strJ;
    }

    public int r() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f51389b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public int s() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        this.f51389b = i12 + 1;
        return ((bArr[i12] & 255) << 16) | i13;
    }

    public long t() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 48);
        this.f51389b = i17 + 1;
        return j15 | ((((long) bArr[i17]) & 255) << 56);
    }

    public short u() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f51389b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long v() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        this.f51389b = i13 + 1;
        return j11 | ((((long) bArr[i13]) & 255) << 24);
    }

    public int w() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        this.f51389b = i12 + 1;
        return ((bArr[i12] & 255) << 16) | i13;
    }

    public int x() {
        int iR = r();
        if (iR >= 0) {
            return iR;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(iR);
        throw new IllegalStateException(sb2.toString());
    }

    public int y() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f51389b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long z() {
        byte[] bArr = this.f51388a;
        int i10 = this.f51389b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.f51389b = i17 + 1;
        return j15 | (((long) bArr[i17]) & 255);
    }
}
