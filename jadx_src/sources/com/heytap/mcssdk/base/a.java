package com.heytap.mcssdk.base;

import java.math.BigInteger;
import okio.Utf8;
import org.apache.commons.codec.binary.l;
import org.apache.tools.tar.c;

/* JADX INFO: compiled from: Base64.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends b {
    static final byte[] A = {13, 10};
    private static final byte[] B = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, c.N, c.O, 77, 78, 79, 80, 81, 82, c.P, 84, 85, 86, 87, c.R, 89, 90, 97, 98, 99, 100, 101, 102, c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, c.Q, 121, 122, c.F, c.G, c.H, c.I, c.J, c.K, c.L, c.M, 56, 57, 43, 47};
    private static final byte[] C = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, c.N, c.O, 77, 78, 79, 80, 81, 82, c.P, 84, 85, 86, 87, c.R, 89, 90, 97, 98, 99, 100, 101, 102, c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, c.Q, 121, 122, c.F, c.G, c.H, c.I, c.J, c.K, c.L, c.M, 56, 57, 45, 95};
    private static final byte[] D = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, c.J, c.K, c.L, c.M, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, com.google.common.base.a.f56668u, 19, com.google.common.base.a.f56671x, com.google.common.base.a.f56672y, com.google.common.base.a.f56673z, com.google.common.base.a.A, com.google.common.base.a.B, com.google.common.base.a.C, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, com.google.common.base.a.D, com.google.common.base.a.E, com.google.common.base.a.F, com.google.common.base.a.G, com.google.common.base.a.H, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, c.F, c.G, c.H, c.I};
    private static final int E = 63;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f59877x = 6;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f59878y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f59879z = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final byte[] f59880r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final byte[] f59881s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final byte[] f59882t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f59883u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f59884v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f59885w;

    public a() {
        this(0);
    }

    public a(int i10) {
        this(i10, A);
    }

    public a(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public a(int i10, byte[] bArr, boolean z10) {
        super(3, 4, i10, bArr == null ? 0 : bArr.length);
        this.f59881s = D;
        if (bArr == null) {
            this.f59884v = 4;
            this.f59882t = null;
        } else {
            if (c(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + l.o(bArr) + "]");
            }
            if (i10 > 0) {
                this.f59884v = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f59882t = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f59884v = 4;
                this.f59882t = null;
            }
        }
        this.f59883u = this.f59884v - 1;
        this.f59880r = z10 ? C : B;
    }

    public a(boolean z10) {
        this(76, A, z10);
    }

    public static byte[] A(byte[] bArr) {
        return x(bArr, true);
    }

    public static String B(byte[] bArr) {
        return l.o(x(bArr, false));
    }

    public static byte[] C(byte[] bArr) {
        return y(bArr, false, true);
    }

    public static String D(byte[] bArr) {
        return l.o(y(bArr, false, true));
    }

    public static byte[] E(BigInteger bigInteger) {
        if (bigInteger != null) {
            return x(K(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    public static boolean F(byte[] bArr) {
        return I(bArr);
    }

    public static boolean G(byte b10) {
        if (b10 != 61) {
            if (b10 >= 0) {
                byte[] bArr = D;
                if (b10 >= bArr.length || bArr[b10] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean H(String str) {
        return I(l.g(str));
    }

    public static boolean I(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!G(bArr[i10]) && !b.p(bArr[i10])) {
                return false;
            }
        }
        return true;
    }

    static byte[] K(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i10 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i10 = 0;
        }
        int i11 = iBitLength / 8;
        int i12 = i11 - length;
        byte[] bArr = new byte[i11];
        System.arraycopy(byteArray, i10, bArr, i12, length);
        return bArr;
    }

    public static byte[] t(String str) {
        return new a().e(str);
    }

    public static byte[] u(byte[] bArr) {
        return new a().decode(bArr);
    }

    public static BigInteger v(byte[] bArr) {
        return new BigInteger(1, u(bArr));
    }

    public static byte[] w(byte[] bArr) {
        return x(bArr, false);
    }

    public static byte[] x(byte[] bArr, boolean z10) {
        return y(bArr, z10, false);
    }

    public static byte[] y(byte[] bArr, boolean z10, boolean z11) {
        return z(bArr, z10, z11, Integer.MAX_VALUE);
    }

    public static byte[] z(byte[] bArr, boolean z10, boolean z11, int i10) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = z10 ? new a(z11) : new a(0, A, z11);
        long jK = aVar.k(bArr);
        if (jK <= i10) {
            return aVar.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + jK + ") than the specified maximum size of " + i10);
    }

    public boolean J() {
        return this.f59880r == C;
    }

    @Override // com.heytap.mcssdk.base.b
    void d(byte[] bArr, int i10, int i11) {
        byte b10;
        if (this.f59900i) {
            return;
        }
        if (i11 < 0) {
            this.f59900i = true;
        }
        int i12 = 0;
        while (i12 < i11) {
            i(this.f59883u);
            int i13 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 == 61) {
                this.f59900i = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr2 = D;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i14 = (this.f59902k + 1) % 4;
                    this.f59902k = i14;
                    int i15 = (this.f59885w << 6) + b10;
                    this.f59885w = i15;
                    if (i14 == 0) {
                        byte[] bArr3 = this.f59897f;
                        int i16 = this.f59898g;
                        int i17 = i16 + 1;
                        bArr3[i16] = (byte) ((i15 >> 16) & 255);
                        int i18 = i17 + 1;
                        bArr3[i17] = (byte) ((i15 >> 8) & 255);
                        this.f59898g = i18 + 1;
                        bArr3[i18] = (byte) (i15 & 255);
                    }
                }
            }
            i12++;
            i10 = i13;
        }
        if (!this.f59900i || this.f59902k == 0) {
            return;
        }
        i(this.f59883u);
        int i19 = this.f59902k;
        if (i19 == 2) {
            int i20 = this.f59885w >> 4;
            this.f59885w = i20;
            byte[] bArr4 = this.f59897f;
            int i21 = this.f59898g;
            this.f59898g = i21 + 1;
            bArr4[i21] = (byte) (i20 & 255);
            return;
        }
        if (i19 != 3) {
            return;
        }
        int i22 = this.f59885w >> 2;
        this.f59885w = i22;
        byte[] bArr5 = this.f59897f;
        int i23 = this.f59898g;
        int i24 = i23 + 1;
        bArr5[i23] = (byte) ((i22 >> 8) & 255);
        this.f59898g = i24 + 1;
        bArr5[i24] = (byte) (i22 & 255);
    }

    @Override // com.heytap.mcssdk.base.b
    void f(byte[] bArr, int i10, int i11) {
        if (this.f59900i) {
            return;
        }
        if (i11 >= 0) {
            int i12 = 0;
            while (i12 < i11) {
                i(this.f59884v);
                int i13 = (this.f59902k + 1) % 3;
                this.f59902k = i13;
                int i14 = i10 + 1;
                int i15 = bArr[i10];
                if (i15 < 0) {
                    i15 += 256;
                }
                int i16 = (this.f59885w << 8) + i15;
                this.f59885w = i16;
                if (i13 == 0) {
                    byte[] bArr2 = this.f59897f;
                    int i17 = this.f59898g;
                    int i18 = i17 + 1;
                    byte[] bArr3 = this.f59880r;
                    bArr2[i17] = bArr3[(i16 >> 18) & 63];
                    int i19 = i18 + 1;
                    bArr2[i18] = bArr3[(i16 >> 12) & 63];
                    int i20 = i19 + 1;
                    bArr2[i19] = bArr3[(i16 >> 6) & 63];
                    int i21 = i20 + 1;
                    this.f59898g = i21;
                    bArr2[i20] = bArr3[i16 & 63];
                    int i22 = this.f59901j + 4;
                    this.f59901j = i22;
                    int i23 = this.f59895d;
                    if (i23 > 0 && i23 <= i22) {
                        byte[] bArr4 = this.f59882t;
                        System.arraycopy(bArr4, 0, bArr2, i21, bArr4.length);
                        this.f59898g += this.f59882t.length;
                        this.f59901j = 0;
                    }
                }
                i12++;
                i10 = i14;
            }
            return;
        }
        this.f59900i = true;
        if (this.f59902k == 0 && this.f59895d == 0) {
            return;
        }
        i(this.f59884v);
        int i24 = this.f59898g;
        int i25 = this.f59902k;
        if (i25 == 1) {
            byte[] bArr5 = this.f59897f;
            int i26 = i24 + 1;
            byte[] bArr6 = this.f59880r;
            int i27 = this.f59885w;
            bArr5[i24] = bArr6[(i27 >> 2) & 63];
            int i28 = i26 + 1;
            this.f59898g = i28;
            bArr5[i26] = bArr6[(i27 << 4) & 63];
            if (bArr6 == B) {
                int i29 = i28 + 1;
                bArr5[i28] = 61;
                this.f59898g = i29 + 1;
                bArr5[i29] = 61;
            }
        } else if (i25 == 2) {
            byte[] bArr7 = this.f59897f;
            int i30 = i24 + 1;
            byte[] bArr8 = this.f59880r;
            int i31 = this.f59885w;
            bArr7[i24] = bArr8[(i31 >> 10) & 63];
            int i32 = i30 + 1;
            bArr7[i30] = bArr8[(i31 >> 4) & 63];
            int i33 = i32 + 1;
            this.f59898g = i33;
            bArr7[i32] = bArr8[(i31 << 2) & 63];
            if (bArr8 == B) {
                this.f59898g = i33 + 1;
                bArr7[i33] = 61;
            }
        }
        int i34 = this.f59901j;
        int i35 = this.f59898g;
        int i36 = i34 + (i35 - i24);
        this.f59901j = i36;
        if (this.f59895d <= 0 || i36 <= 0) {
            return;
        }
        byte[] bArr9 = this.f59882t;
        System.arraycopy(bArr9, 0, this.f59897f, i35, bArr9.length);
        this.f59898g += this.f59882t.length;
    }

    @Override // com.heytap.mcssdk.base.b
    protected boolean m(byte b10) {
        if (b10 >= 0) {
            byte[] bArr = this.f59881s;
            if (b10 < bArr.length && bArr[b10] != -1) {
                return true;
            }
        }
        return false;
    }
}
