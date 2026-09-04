package org.apache.commons.codec.binary;

import okio.Utf8;

/* JADX INFO: compiled from: Base32.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends g {
    private static final byte[] A = {13, 10};
    private static final byte[] B = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, -1, com.google.common.base.a.D, com.google.common.base.a.E, com.google.common.base.a.F, com.google.common.base.a.G, com.google.common.base.a.H, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, com.google.common.base.a.f56668u, 19, com.google.common.base.a.f56671x, com.google.common.base.a.f56672y, com.google.common.base.a.f56673z, com.google.common.base.a.A, com.google.common.base.a.B, com.google.common.base.a.C};
    private static final byte[] C = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, org.apache.tools.tar.c.N, org.apache.tools.tar.c.O, 77, 78, 79, 80, 81, 82, org.apache.tools.tar.c.P, 84, 85, 86, 87, org.apache.tools.tar.c.R, 89, 90, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M};
    private static final byte[] D = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, com.google.common.base.a.f56668u, 19, com.google.common.base.a.f56671x, com.google.common.base.a.f56672y, com.google.common.base.a.f56673z, com.google.common.base.a.A, com.google.common.base.a.B, com.google.common.base.a.C, com.google.common.base.a.D, com.google.common.base.a.E, com.google.common.base.a.F, com.google.common.base.a.G, com.google.common.base.a.H, 31, 32};
    private static final byte[] E = {org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, org.apache.tools.tar.c.N, org.apache.tools.tar.c.O, 77, 78, 79, 80, 81, 82, org.apache.tools.tar.c.P, 84, 85, 86};
    private static final int F = 31;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f132860x = 5;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f132861y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f132862z = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f132863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f132864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final byte[] f132865t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f132866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final byte[] f132867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final byte[] f132868w;

    public a() {
        this(false);
    }

    public a(int i10) {
        this(i10, A);
    }

    public a(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public a(int i10, byte[] bArr, boolean z10) {
        super(5, 8, i10, bArr == null ? 0 : bArr.length);
        if (z10) {
            this.f132867v = E;
            this.f132865t = D;
        } else {
            this.f132867v = C;
            this.f132865t = B;
        }
        if (i10 <= 0) {
            this.f132866u = 8;
            this.f132868w = null;
        } else {
            if (bArr == null) {
                throw new IllegalArgumentException("lineLength " + i10 + " > 0, but lineSeparator is null");
            }
            if (c(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + l.o(bArr) + "]");
            }
            this.f132866u = bArr.length + 8;
            byte[] bArr2 = new byte[bArr.length];
            this.f132868w = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.f132864s = this.f132866u - 1;
    }

    public a(boolean z10) {
        this(0, null, z10);
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // org.apache.commons.codec.binary.g
    void d(byte[] bArr, int i10, int i11) {
        byte b10;
        if (this.f132892i) {
        }
        ?? r10 = 1;
        if (i11 < 0) {
            this.f132892i = true;
        }
        int i12 = 0;
        int i13 = i10;
        while (i12 < i11) {
            int i14 = i13 + 1;
            byte b11 = bArr[i13];
            if (b11 == 61) {
                this.f132892i = r10;
                break;
            }
            i(this.f132864s);
            if (b11 >= 0) {
                byte[] bArr2 = this.f132865t;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i15 = (this.f132894k + r10) % 8;
                    this.f132894k = i15;
                    long j10 = (this.f132863r << 5) + ((long) b10);
                    this.f132863r = j10;
                    if (i15 == 0) {
                        byte[] bArr3 = this.f132889f;
                        int i16 = this.f132890g;
                        int i17 = i16 + 1;
                        bArr3[i16] = (byte) ((j10 >> 32) & 255);
                        int i18 = i17 + 1;
                        bArr3[i17] = (byte) ((j10 >> 24) & 255);
                        int i19 = i18 + 1;
                        bArr3[i18] = (byte) ((j10 >> 16) & 255);
                        int i20 = i19 + 1;
                        bArr3[i19] = (byte) ((j10 >> 8) & 255);
                        this.f132890g = i20 + 1;
                        bArr3[i20] = (byte) (j10 & 255);
                    }
                }
            }
            i12++;
            i13 = i14;
            r10 = 1;
        }
        if (!this.f132892i || this.f132894k < 2) {
            return;
        }
        i(this.f132864s);
        switch (this.f132894k) {
            case 2:
                byte[] bArr4 = this.f132889f;
                int i21 = this.f132890g;
                this.f132890g = i21 + 1;
                bArr4[i21] = (byte) ((this.f132863r >> 2) & 255);
                break;
            case 3:
                byte[] bArr5 = this.f132889f;
                int i22 = this.f132890g;
                this.f132890g = i22 + 1;
                bArr5[i22] = (byte) ((this.f132863r >> 7) & 255);
                break;
            case 4:
                long j11 = this.f132863r >> 4;
                this.f132863r = j11;
                byte[] bArr6 = this.f132889f;
                int i23 = this.f132890g;
                int i24 = i23 + 1;
                bArr6[i23] = (byte) ((j11 >> 8) & 255);
                this.f132890g = i24 + 1;
                bArr6[i24] = (byte) (j11 & 255);
                break;
            case 5:
                long j12 = this.f132863r >> 1;
                this.f132863r = j12;
                byte[] bArr7 = this.f132889f;
                int i25 = this.f132890g;
                int i26 = i25 + 1;
                bArr7[i25] = (byte) ((j12 >> 16) & 255);
                int i27 = i26 + 1;
                bArr7[i26] = (byte) ((j12 >> 8) & 255);
                this.f132890g = i27 + 1;
                bArr7[i27] = (byte) (j12 & 255);
                break;
            case 6:
                long j13 = this.f132863r >> 6;
                this.f132863r = j13;
                byte[] bArr8 = this.f132889f;
                int i28 = this.f132890g;
                int i29 = i28 + 1;
                bArr8[i28] = (byte) ((j13 >> 16) & 255);
                int i30 = i29 + 1;
                bArr8[i29] = (byte) ((j13 >> 8) & 255);
                this.f132890g = i30 + 1;
                bArr8[i30] = (byte) (j13 & 255);
                break;
            case 7:
                long j14 = this.f132863r >> 3;
                this.f132863r = j14;
                byte[] bArr9 = this.f132889f;
                int i31 = this.f132890g;
                int i32 = i31 + 1;
                bArr9[i31] = (byte) ((j14 >> 24) & 255);
                int i33 = i32 + 1;
                bArr9[i32] = (byte) ((j14 >> 16) & 255);
                int i34 = i33 + 1;
                bArr9[i33] = (byte) ((j14 >> 8) & 255);
                this.f132890g = i34 + 1;
                bArr9[i34] = (byte) (j14 & 255);
                break;
        }
    }

    @Override // org.apache.commons.codec.binary.g
    void f(byte[] bArr, int i10, int i11) {
        if (this.f132892i) {
            return;
        }
        if (i11 >= 0) {
            int i12 = i10;
            int i13 = 0;
            while (i13 < i11) {
                i(this.f132866u);
                int i14 = (this.f132894k + 1) % 5;
                this.f132894k = i14;
                int i15 = i12 + 1;
                int i16 = bArr[i12];
                if (i16 < 0) {
                    i16 += 256;
                }
                long j10 = (this.f132863r << 8) + ((long) i16);
                this.f132863r = j10;
                if (i14 == 0) {
                    byte[] bArr2 = this.f132889f;
                    int i17 = this.f132890g;
                    int i18 = i17 + 1;
                    byte[] bArr3 = this.f132867v;
                    bArr2[i17] = bArr3[((int) (j10 >> 35)) & 31];
                    int i19 = i18 + 1;
                    bArr2[i18] = bArr3[((int) (j10 >> 30)) & 31];
                    int i20 = i19 + 1;
                    bArr2[i19] = bArr3[((int) (j10 >> 25)) & 31];
                    int i21 = i20 + 1;
                    bArr2[i20] = bArr3[((int) (j10 >> 20)) & 31];
                    int i22 = i21 + 1;
                    bArr2[i21] = bArr3[((int) (j10 >> 15)) & 31];
                    int i23 = i22 + 1;
                    bArr2[i22] = bArr3[((int) (j10 >> 10)) & 31];
                    int i24 = i23 + 1;
                    bArr2[i23] = bArr3[((int) (j10 >> 5)) & 31];
                    int i25 = i24 + 1;
                    this.f132890g = i25;
                    bArr2[i24] = bArr3[((int) j10) & 31];
                    int i26 = this.f132893j + 8;
                    this.f132893j = i26;
                    int i27 = this.f132887d;
                    if (i27 > 0 && i27 <= i26) {
                        byte[] bArr4 = this.f132868w;
                        System.arraycopy(bArr4, 0, bArr2, i25, bArr4.length);
                        this.f132890g += this.f132868w.length;
                        this.f132893j = 0;
                    }
                }
                i13++;
                i12 = i15;
            }
            return;
        }
        this.f132892i = true;
        if (this.f132894k == 0 && this.f132887d == 0) {
            return;
        }
        i(this.f132866u);
        int i28 = this.f132890g;
        int i29 = this.f132894k;
        if (i29 == 1) {
            byte[] bArr5 = this.f132889f;
            int i30 = i28 + 1;
            byte[] bArr6 = this.f132867v;
            long j11 = this.f132863r;
            bArr5[i28] = bArr6[((int) (j11 >> 3)) & 31];
            int i31 = i30 + 1;
            bArr5[i30] = bArr6[((int) (j11 << 2)) & 31];
            int i32 = i31 + 1;
            bArr5[i31] = 61;
            int i33 = i32 + 1;
            bArr5[i32] = 61;
            int i34 = i33 + 1;
            bArr5[i33] = 61;
            int i35 = i34 + 1;
            bArr5[i34] = 61;
            int i36 = i35 + 1;
            bArr5[i35] = 61;
            this.f132890g = i36 + 1;
            bArr5[i36] = 61;
        } else if (i29 == 2) {
            byte[] bArr7 = this.f132889f;
            int i37 = i28 + 1;
            byte[] bArr8 = this.f132867v;
            long j12 = this.f132863r;
            bArr7[i28] = bArr8[((int) (j12 >> 11)) & 31];
            int i38 = i37 + 1;
            bArr7[i37] = bArr8[((int) (j12 >> 6)) & 31];
            int i39 = i38 + 1;
            bArr7[i38] = bArr8[((int) (j12 >> 1)) & 31];
            int i40 = i39 + 1;
            bArr7[i39] = bArr8[((int) (j12 << 4)) & 31];
            int i41 = i40 + 1;
            bArr7[i40] = 61;
            int i42 = i41 + 1;
            bArr7[i41] = 61;
            int i43 = i42 + 1;
            bArr7[i42] = 61;
            this.f132890g = i43 + 1;
            bArr7[i43] = 61;
        } else if (i29 == 3) {
            byte[] bArr9 = this.f132889f;
            int i44 = i28 + 1;
            byte[] bArr10 = this.f132867v;
            long j13 = this.f132863r;
            bArr9[i28] = bArr10[((int) (j13 >> 19)) & 31];
            int i45 = i44 + 1;
            bArr9[i44] = bArr10[((int) (j13 >> 14)) & 31];
            int i46 = i45 + 1;
            bArr9[i45] = bArr10[((int) (j13 >> 9)) & 31];
            int i47 = i46 + 1;
            bArr9[i46] = bArr10[((int) (j13 >> 4)) & 31];
            int i48 = i47 + 1;
            bArr9[i47] = bArr10[((int) (j13 << 1)) & 31];
            int i49 = i48 + 1;
            bArr9[i48] = 61;
            int i50 = i49 + 1;
            bArr9[i49] = 61;
            this.f132890g = i50 + 1;
            bArr9[i50] = 61;
        } else if (i29 == 4) {
            byte[] bArr11 = this.f132889f;
            int i51 = i28 + 1;
            byte[] bArr12 = this.f132867v;
            long j14 = this.f132863r;
            bArr11[i28] = bArr12[((int) (j14 >> 27)) & 31];
            int i52 = i51 + 1;
            bArr11[i51] = bArr12[((int) (j14 >> 22)) & 31];
            int i53 = i52 + 1;
            bArr11[i52] = bArr12[((int) (j14 >> 17)) & 31];
            int i54 = i53 + 1;
            bArr11[i53] = bArr12[((int) (j14 >> 12)) & 31];
            int i55 = i54 + 1;
            bArr11[i54] = bArr12[((int) (j14 >> 7)) & 31];
            int i56 = i55 + 1;
            bArr11[i55] = bArr12[((int) (j14 >> 2)) & 31];
            int i57 = i56 + 1;
            bArr11[i56] = bArr12[((int) (j14 << 3)) & 31];
            this.f132890g = i57 + 1;
            bArr11[i57] = 61;
        }
        int i58 = this.f132893j;
        int i59 = this.f132890g;
        int i60 = i58 + (i59 - i28);
        this.f132893j = i60;
        if (this.f132887d <= 0 || i60 <= 0) {
            return;
        }
        byte[] bArr13 = this.f132868w;
        System.arraycopy(bArr13, 0, this.f132889f, i59, bArr13.length);
        this.f132890g += this.f132868w.length;
    }

    @Override // org.apache.commons.codec.binary.g
    public boolean m(byte b10) {
        if (b10 >= 0) {
            byte[] bArr = this.f132865t;
            if (b10 < bArr.length && bArr[b10] != -1) {
                return true;
            }
        }
        return false;
    }
}
