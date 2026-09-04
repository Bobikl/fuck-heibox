package xyz.mylib.creator.encoder;

/* JADX INFO: compiled from: AnimatedGifEncoder.java */
/* JADX INFO: loaded from: classes5.dex */
public class e {
    protected static final int A = 6;
    protected static final int B = 64;
    protected static final int C = 2048;
    protected static final int D = 30;
    protected static final int E = 10;
    protected static final int F = 1024;
    protected static final int G = 8;
    protected static final int H = 256;
    protected static final int I = 18;
    protected static final int J = 262144;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final int f141486j = 256;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final int f141487k = 499;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int f141488l = 491;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f141489m = 487;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final int f141490n = 503;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final int f141491o = 1509;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected static final int f141492p = 255;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected static final int f141493q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final int f141494r = 100;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final int f141495s = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final int f141496t = 65536;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final int f141497u = 10;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final int f141498v = 1024;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final int f141499w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected static final int f141500x = 64;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final int f141501y = 65536;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final int f141502z = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f141503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f141504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f141505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f141506d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int[] f141508f = new int[256];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int[] f141509g = new int[256];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int[] f141510h = new int[256];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int[] f141511i = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int[][] f141507e = new int[256][];

    public e(byte[] bArr, int i10, int i11) {
        this.f141504b = bArr;
        this.f141505c = i10;
        this.f141506d = i11;
        for (int i12 = 0; i12 < 256; i12++) {
            this.f141507e[i12] = new int[]{i, i, i, 0};
            int i13 = (i12 << 12) / 256;
            this.f141510h[i12] = 256;
            this.f141509g[i12] = 0;
        }
    }

    protected void a(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i11 - i10;
        if (i15 < -1) {
            i15 = -1;
        }
        int i16 = i11 + i10;
        if (i16 > 256) {
            i16 = 256;
        }
        int i17 = i11 + 1;
        int i18 = i11 - 1;
        int i19 = 1;
        while (true) {
            if (i17 >= i16 && i18 <= i15) {
                return;
            }
            i19++;
            int i20 = this.f141511i[i19];
            if (i17 < i16) {
                int i21 = i17 + 1;
                int[] iArr = this.f141507e[i17];
                try {
                    int i22 = iArr[0];
                    iArr[0] = i22 - (((i22 - i12) * i20) / 262144);
                    int i23 = iArr[1];
                    iArr[1] = i23 - (((i23 - i13) * i20) / 262144);
                    int i24 = iArr[2];
                    iArr[2] = i24 - (((i24 - i14) * i20) / 262144);
                } catch (Exception unused) {
                }
                i17 = i21;
            }
            if (i18 > i15) {
                int i25 = i18 - 1;
                int[] iArr2 = this.f141507e[i18];
                try {
                    int i26 = iArr2[0];
                    iArr2[0] = i26 - (((i26 - i12) * i20) / 262144);
                    int i27 = iArr2[1];
                    iArr2[1] = i27 - (((i27 - i13) * i20) / 262144);
                    int i28 = iArr2[2];
                    iArr2[2] = i28 - ((i20 * (i28 - i14)) / 262144);
                } catch (Exception unused2) {
                }
                i18 = i25;
            }
        }
    }

    protected void b(int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.f141507e[i11];
        int i15 = iArr[0];
        iArr[0] = i15 - (((i15 - i12) * i10) / 1024);
        int i16 = iArr[1];
        iArr[1] = i16 - (((i16 - i13) * i10) / 1024);
        int i17 = iArr[2];
        iArr[2] = i17 - ((i10 * (i17 - i14)) / 1024);
    }

    public byte[] c() {
        byte[] bArr = new byte[768];
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[this.f141507e[i10][3]] = i10;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < 256) {
            int i13 = i12 + 1;
            int[] iArr2 = this.f141507e[iArr[i11]];
            bArr[i12] = (byte) iArr2[0];
            int i14 = i13 + 1;
            bArr[i13] = (byte) iArr2[1];
            bArr[i14] = (byte) iArr2[2];
            i11++;
            i12 = i14 + 1;
        }
        return bArr;
    }

    protected int d(int i10, int i11, int i12) {
        int i13 = Integer.MAX_VALUE;
        int i14 = -1;
        int i15 = -1;
        int i16 = Integer.MAX_VALUE;
        for (int i17 = 0; i17 < 256; i17++) {
            int[] iArr = this.f141507e[i17];
            int i18 = iArr[0] - i10;
            if (i18 < 0) {
                i18 = -i18;
            }
            int i19 = iArr[1] - i11;
            if (i19 < 0) {
                i19 = -i19;
            }
            int i20 = i18 + i19;
            int i21 = iArr[2] - i12;
            if (i21 < 0) {
                i21 = -i21;
            }
            int i22 = i20 + i21;
            if (i22 < i13) {
                i14 = i17;
                i13 = i22;
            }
            int[] iArr2 = this.f141509g;
            int i23 = i22 - (iArr2[i17] >> 12);
            if (i23 < i16) {
                i15 = i17;
                i16 = i23;
            }
            int[] iArr3 = this.f141510h;
            int i24 = iArr3[i17];
            int i25 = i24 >> 10;
            iArr3[i17] = i24 - i25;
            iArr2[i17] = iArr2[i17] + (i25 << 10);
        }
        int[] iArr4 = this.f141510h;
        iArr4[i14] = iArr4[i14] + 64;
        int[] iArr5 = this.f141509g;
        iArr5[i14] = iArr5[i14] - 65536;
        return i15;
    }

    public void e() {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < 256) {
            int[] iArr = this.f141507e[i10];
            int i13 = iArr[1];
            int i14 = i10 + 1;
            int i15 = i10;
            for (int i16 = i14; i16 < 256; i16++) {
                int i17 = this.f141507e[i16][1];
                if (i17 < i13) {
                    i15 = i16;
                    i13 = i17;
                }
            }
            int[] iArr2 = this.f141507e[i15];
            if (i10 != i15) {
                int i18 = iArr2[0];
                iArr2[0] = iArr[0];
                iArr[0] = i18;
                int i19 = iArr2[1];
                iArr2[1] = iArr[1];
                iArr[1] = i19;
                int i20 = iArr2[2];
                iArr2[2] = iArr[2];
                iArr[2] = i20;
                int i21 = iArr2[3];
                iArr2[3] = iArr[3];
                iArr[3] = i21;
            }
            if (i13 != i11) {
                this.f141508f[i11] = (i12 + i10) >> 1;
                while (true) {
                    i11++;
                    if (i11 >= i13) {
                        break;
                    } else {
                        this.f141508f[i11] = i10;
                    }
                }
                i12 = i10;
                i11 = i13;
            }
            i10 = i14;
        }
        this.f141508f[i11] = (i12 + 255) >> 1;
        for (int i22 = i11 + 1; i22 < 256; i22++) {
            this.f141508f[i22] = 255;
        }
    }

    public void f() {
        int i10;
        int i11 = this.f141505c;
        int i12 = 1509;
        if (i11 < 1509) {
            this.f141506d = 1;
        }
        int i13 = this.f141506d;
        this.f141503a = ((i13 - 1) / 3) + 30;
        byte[] bArr = this.f141504b;
        int i14 = i11 / (i13 * 3);
        int i15 = i14 / 100;
        for (int i16 = 0; i16 < 32; i16++) {
            this.f141511i[i16] = 1024 * (((1024 - (i16 * i16)) * 256) / 1024);
        }
        int i17 = this.f141505c;
        if (i17 < 1509) {
            i10 = 3;
        } else {
            if (i17 % 499 != 0) {
                i12 = bb.c.b.Pp;
            } else if (i17 % 491 != 0) {
                i12 = bb.c.b.rp;
            } else if (i17 % 487 != 0) {
                i12 = bb.c.b.fp;
            }
            i10 = i12;
        }
        int i18 = 2048;
        int i19 = 32;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1024;
        int i23 = i15;
        while (i20 < i14) {
            int i24 = (bArr[i21 + 0] & 255) << 4;
            int i25 = (bArr[i21 + 1] & 255) << 4;
            int i26 = (bArr[i21 + 2] & 255) << 4;
            int iD = d(i24, i25, i26);
            int i27 = i20;
            b(i22, iD, i24, i25, i26);
            if (i19 != 0) {
                a(i19, iD, i24, i25, i26);
            }
            int i28 = i21 + i10;
            if (i28 >= i11) {
                i28 -= this.f141505c;
            }
            i21 = i28;
            i20 = i27 + 1;
            if (i23 == 0) {
                i23 = 1;
            }
            if (i20 % i23 == 0) {
                i22 -= i22 / this.f141503a;
                i18 -= i18 / 30;
                int i29 = i18 >> 6;
                i19 = i29 <= 1 ? 0 : i29;
                for (int i30 = 0; i30 < i19; i30++) {
                    int i31 = i19 * i19;
                    this.f141511i[i30] = (((i31 - (i30 * i30)) * 256) / i31) * i22;
                }
            }
        }
    }

    public int g(int i10, int i11, int i12) {
        int i13 = this.f141508f[i11];
        int i14 = i13 - 1;
        int i15 = 1000;
        int i16 = -1;
        while (true) {
            if (i13 >= 256 && i14 < 0) {
                return i16;
            }
            if (i13 < 256) {
                int[] iArr = this.f141507e[i13];
                int i17 = iArr[1] - i11;
                if (i17 >= i15) {
                    i13 = 256;
                } else {
                    i13++;
                    if (i17 < 0) {
                        i17 = -i17;
                    }
                    int i18 = iArr[0] - i10;
                    if (i18 < 0) {
                        i18 = -i18;
                    }
                    int i19 = i17 + i18;
                    if (i19 < i15) {
                        int i20 = iArr[2] - i12;
                        if (i20 < 0) {
                            i20 = -i20;
                        }
                        int i21 = i19 + i20;
                        if (i21 < i15) {
                            i16 = iArr[3];
                            i15 = i21;
                        }
                    }
                }
            }
            if (i14 >= 0) {
                int[] iArr2 = this.f141507e[i14];
                int i22 = i11 - iArr2[1];
                if (i22 >= i15) {
                    i14 = -1;
                } else {
                    i14--;
                    if (i22 < 0) {
                        i22 = -i22;
                    }
                    int i23 = iArr2[0] - i10;
                    if (i23 < 0) {
                        i23 = -i23;
                    }
                    int i24 = i22 + i23;
                    if (i24 < i15) {
                        int i25 = iArr2[2] - i12;
                        if (i25 < 0) {
                            i25 = -i25;
                        }
                        int i26 = i25 + i24;
                        if (i26 < i15) {
                            i16 = iArr2[3];
                            i15 = i26;
                        }
                    }
                }
            }
        }
    }

    public byte[] h() {
        f();
        i();
        e();
        return c();
    }

    public void i() {
        for (int i10 = 0; i10 < 256; i10++) {
            int[] iArr = this.f141507e[i10];
            iArr[0] = iArr[0] >> 4;
            iArr[1] = iArr[1] >> 4;
            iArr[2] = iArr[2] >> 4;
            iArr[3] = i10;
        }
    }
}
