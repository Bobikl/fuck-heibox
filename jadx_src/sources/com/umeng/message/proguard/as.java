package com.umeng.message.proguard;

import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class as extends at {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f105746g = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, org.apache.tools.tar.c.N, org.apache.tools.tar.c.O, 77, 78, 79, 80, 81, 82, org.apache.tools.tar.c.P, 84, 85, 86, 87, org.apache.tools.tar.c.R, 89, 90, 97, 98, 99, 100, 101, 102, org.apache.tools.tar.c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, org.apache.tools.tar.c.Q, 121, 122, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 43, 47};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f105747h = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, com.google.common.base.a.f56668u, 19, com.google.common.base.a.f56671x, com.google.common.base.a.f56672y, com.google.common.base.a.f56673z, com.google.common.base.a.A, com.google.common.base.a.B, com.google.common.base.a.C, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, com.google.common.base.a.D, com.google.common.base.a.E, com.google.common.base.a.F, com.google.common.base.a.G, com.google.common.base.a.H, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f105751l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f105750k = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f105749j = 4 - 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f105748i = f105746g;

    public static String a(byte[] bArr) {
        return new String(f(bArr));
    }

    public static byte[] a(String str) {
        return super.b(str);
    }

    public static byte[] b(byte[] bArr) {
        return f(bArr);
    }

    private static byte[] f(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        as asVar = new as();
        long jC = super.c(bArr);
        if (jC <= 2147483647L) {
            return super.d(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + jC + ") than the specified maximum size of 2147483647");
    }

    @Override // com.umeng.message.proguard.at
    final void a(byte[] bArr, int i10, int i11) {
        if (this.f105755d) {
            return;
        }
        if (i11 >= 0) {
            int i12 = 0;
            while (i12 < i11) {
                a(this.f105750k);
                int i13 = (this.f105757f + 1) % 3;
                this.f105757f = i13;
                int i14 = i10 + 1;
                int i15 = bArr[i10];
                if (i15 < 0) {
                    i15 += 256;
                }
                int i16 = (this.f105751l << 8) + i15;
                this.f105751l = i16;
                if (i13 == 0) {
                    byte[] bArr2 = this.f105753b;
                    int i17 = this.f105754c;
                    int i18 = i17 + 1;
                    byte[] bArr3 = this.f105748i;
                    bArr2[i17] = bArr3[(i16 >> 18) & 63];
                    int i19 = i18 + 1;
                    bArr2[i18] = bArr3[(i16 >> 12) & 63];
                    int i20 = i19 + 1;
                    bArr2[i19] = bArr3[(i16 >> 6) & 63];
                    this.f105754c = i20 + 1;
                    bArr2[i20] = bArr3[i16 & 63];
                    this.f105756e += 4;
                }
                i12++;
                i10 = i14;
            }
            return;
        }
        this.f105755d = true;
        if (this.f105757f == 0) {
            return;
        }
        a(this.f105750k);
        int i21 = this.f105754c;
        int i22 = this.f105757f;
        if (i22 == 1) {
            byte[] bArr4 = this.f105753b;
            int i23 = i21 + 1;
            byte[] bArr5 = this.f105748i;
            int i24 = this.f105751l;
            bArr4[i21] = bArr5[(i24 >> 2) & 63];
            int i25 = i23 + 1;
            this.f105754c = i25;
            bArr4[i23] = bArr5[(i24 << 4) & 63];
            if (bArr5 == f105746g) {
                int i26 = i25 + 1;
                bArr4[i25] = 61;
                this.f105754c = i26 + 1;
                bArr4[i26] = 61;
            }
        } else if (i22 == 2) {
            byte[] bArr6 = this.f105753b;
            int i27 = i21 + 1;
            byte[] bArr7 = this.f105748i;
            int i28 = this.f105751l;
            bArr6[i21] = bArr7[(i28 >> 10) & 63];
            int i29 = i27 + 1;
            bArr6[i27] = bArr7[(i28 >> 4) & 63];
            int i30 = i29 + 1;
            this.f105754c = i30;
            bArr6[i29] = bArr7[(i28 << 2) & 63];
            if (bArr7 == f105746g) {
                this.f105754c = i30 + 1;
                bArr6[i30] = 61;
            }
        }
        this.f105756e += this.f105754c - i21;
    }

    @Override // com.umeng.message.proguard.at
    final void b(byte[] bArr, int i10, int i11) {
        byte b10;
        if (this.f105755d) {
            return;
        }
        if (i11 < 0) {
            this.f105755d = true;
        }
        int i12 = 0;
        while (i12 < i11) {
            a(this.f105749j);
            int i13 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 == 61) {
                this.f105755d = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr2 = f105747h;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i14 = (this.f105757f + 1) % 4;
                    this.f105757f = i14;
                    int i15 = (this.f105751l << 6) + b10;
                    this.f105751l = i15;
                    if (i14 == 0) {
                        byte[] bArr3 = this.f105753b;
                        int i16 = this.f105754c;
                        int i17 = i16 + 1;
                        bArr3[i16] = (byte) ((i15 >> 16) & 255);
                        int i18 = i17 + 1;
                        bArr3[i17] = (byte) ((i15 >> 8) & 255);
                        this.f105754c = i18 + 1;
                        bArr3[i18] = (byte) (i15 & 255);
                    }
                }
            }
            i12++;
            i10 = i13;
        }
        if (!this.f105755d || this.f105757f == 0) {
            return;
        }
        a(this.f105749j);
        int i19 = this.f105757f;
        if (i19 == 2) {
            int i20 = this.f105751l >> 4;
            this.f105751l = i20;
            byte[] bArr4 = this.f105753b;
            int i21 = this.f105754c;
            this.f105754c = i21 + 1;
            bArr4[i21] = (byte) (i20 & 255);
            return;
        }
        if (i19 != 3) {
            return;
        }
        int i22 = this.f105751l >> 2;
        this.f105751l = i22;
        byte[] bArr5 = this.f105753b;
        int i23 = this.f105754c;
        int i24 = i23 + 1;
        bArr5[i23] = (byte) ((i22 >> 8) & 255);
        this.f105754c = i24 + 1;
        bArr5[i24] = (byte) (i22 & 255);
    }

    @Override // com.umeng.message.proguard.at
    public final /* bridge */ /* synthetic */ byte[] b(String str) {
        return super.b(str);
    }

    @Override // com.umeng.message.proguard.at
    public final /* bridge */ /* synthetic */ long c(byte[] bArr) {
        return super.c(bArr);
    }

    @Override // com.umeng.message.proguard.at
    public final /* bridge */ /* synthetic */ byte[] d(byte[] bArr) {
        return super.d(bArr);
    }

    @Override // com.umeng.message.proguard.at
    public final /* bridge */ /* synthetic */ byte[] e(byte[] bArr) {
        return super.e(bArr);
    }
}
