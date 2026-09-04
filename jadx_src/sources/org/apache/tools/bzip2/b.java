package org.apache.tools.bzip2;

import java.util.BitSet;

/* JADX INFO: compiled from: BlockSort.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f137135m = 1000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f137136n = 100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f137137o = 1000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f137138p = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f137139q = {1, 4, 13, 40, 121, bb.c.b.f30509a4, bb.c.b.f30546bi, bb.c.d.dn, bb.c.k.uB, 29524, 88573, 265720, 797161, 2391484};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f137140r = 20;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f137141s = 10;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f137142t = 30;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f137143u = 2097152;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f137144v = -2097153;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f137145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f137147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f137148d = new int[1000];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f137149e = new int[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f137150f = new int[1000];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f137151g = new int[256];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f137152h = new int[256];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f137153i = new boolean[256];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f137154j = new int[65537];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final char[] f137155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f137156l;

    b(d.a aVar) {
        this.f137155k = aVar.f137240s;
    }

    private void b(int[] iArr, int[] iArr2, int i10, int i11) {
        int i12;
        int i13;
        char c10 = 0;
        h(0, i10, i11);
        long j10 = 0;
        int i14 = 1;
        long j11 = 0;
        int i15 = 1;
        while (i15 > 0) {
            i15--;
            int[] iArrG = g(i15);
            int i16 = iArrG[c10];
            int i17 = iArrG[i14];
            if (i17 - i16 < 10) {
                c(iArr, iArr2, i16, i17);
            } else {
                j11 = ((j11 * 7621) + 1) % 32768;
                long j12 = j11 % 3;
                if (j12 == j10) {
                    i12 = iArr2[iArr[i16]];
                } else {
                    i12 = j12 == 1 ? iArr2[iArr[(i16 + i17) >>> i14]] : iArr2[iArr[i17]];
                }
                long j13 = i12;
                int i18 = i17;
                int i19 = i18;
                int i20 = i16;
                int i21 = i20;
                while (true) {
                    if (i21 <= i18) {
                        int i22 = iArr2[iArr[i21]] - ((int) j13);
                        if (i22 == 0) {
                            i(iArr, i21, i20);
                            i20++;
                        } else if (i22 > 0) {
                        }
                        i21++;
                    }
                    i13 = i19;
                    while (i21 <= i18) {
                        int i23 = iArr2[iArr[i18]] - ((int) j13);
                        if (i23 == 0) {
                            i(iArr, i18, i13);
                            i13--;
                            i18--;
                        } else if (i23 < 0) {
                            break;
                        } else {
                            i18--;
                        }
                    }
                    if (i21 > i18) {
                        break;
                    }
                    i(iArr, i21, i18);
                    i21++;
                    i18--;
                    i19 = i13;
                    i14 = 1;
                }
                if (i13 < i20) {
                    c10 = 0;
                    j10 = 0;
                    i14 = 1;
                } else {
                    int iF = f(i20 - i16, i21 - i20);
                    j(iArr, i16, i21 - iF, iF);
                    int i24 = i17 - i13;
                    int i25 = i13 - i18;
                    int iF2 = f(i24, i25);
                    j(iArr, i18 + 1, (i17 - iF2) + 1, iF2);
                    int i26 = ((i21 + i16) - i20) - 1;
                    int i27 = (i17 - i25) + 1;
                    if (i26 - i16 > i17 - i27) {
                        int i28 = i15 + 1;
                        h(i15, i16, i26);
                        h(i28, i27, i17);
                        i15 = i28 + 1;
                    } else {
                        int i29 = i15 + 1;
                        h(i15, i27, i17);
                        h(i29, i16, i26);
                        i15 = i29 + 1;
                    }
                    i14 = 1;
                    c10 = 0;
                    j10 = 0;
                }
            }
        }
    }

    private void c(int[] iArr, int[] iArr2, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 - i10 > 3) {
            for (int i12 = i11 - 4; i12 >= i10; i12--) {
                int i13 = iArr[i12];
                int i14 = iArr2[i13];
                int i15 = i12 + 4;
                while (i15 <= i11) {
                    int i16 = iArr[i15];
                    if (i14 <= iArr2[i16]) {
                        break;
                    }
                    iArr[i15 - 4] = i16;
                    i15 += 4;
                }
                iArr[i15 - 4] = i13;
            }
        }
        for (int i17 = i11 - 1; i17 >= i10; i17--) {
            int i18 = iArr[i17];
            int i19 = iArr2[i18];
            int i20 = i17 + 1;
            while (i20 <= i11) {
                int i21 = iArr[i20];
                if (i19 <= iArr2[i21]) {
                    break;
                }
                iArr[i20 - 1] = i21;
                i20++;
            }
            iArr[i20 - 1] = i18;
        }
    }

    private int f(int i10, int i11) {
        return i10 < i11 ? i10 : i11;
    }

    private int[] g(int i10) {
        return new int[]{this.f137148d[i10], this.f137149e[i10]};
    }

    private void h(int i10, int i11, int i12) {
        this.f137148d[i10] = i11;
        this.f137149e[i10] = i12;
    }

    private void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }

    private void j(int[] iArr, int i10, int i11, int i12) {
        while (i12 > 0) {
            i(iArr, i10, i11);
            i10++;
            i11++;
            i12--;
        }
    }

    private int[] k() {
        if (this.f137156l == null) {
            this.f137156l = new int[this.f137155k.length / 2];
        }
        return this.f137156l;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6 A[EDGE_INSN: B:49:0x00a6->B:28:0x00a6 BREAK  A[LOOP:1: B:11:0x004c->B:27:0x00a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[EDGE_INSN: B:54:0x008e->B:25:0x008e BREAK  A[LOOP:2: B:18:0x006d->B:24:0x008b], SYNTHETIC] */
    private void l(d.a aVar, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr = this.f137148d;
        int[] iArr2 = this.f137149e;
        int[] iArr3 = this.f137150f;
        int[] iArr4 = aVar.f137239r;
        byte[] bArr = aVar.f137238q;
        iArr[0] = i10;
        iArr2[0] = i11;
        iArr3[0] = i12;
        int i18 = 1;
        int i19 = 1;
        while (true) {
            int i20 = i19 - 1;
            if (i20 < 0) {
                return;
            }
            int i21 = iArr[i20];
            int i22 = iArr2[i20];
            int i23 = iArr3[i20];
            if (i22 - i21 < 20 || i23 > 10) {
                i14 = i18;
                if (m(aVar, i21, i22, i23, i13)) {
                    return;
                }
            } else {
                int i24 = i23 + 1;
                int iO = o(bArr[iArr4[i21] + i24], bArr[iArr4[i22] + i24], bArr[iArr4[(i21 + i22) >>> i18] + i24]) & 255;
                int i25 = i21;
                int i26 = i25;
                int i27 = i22;
                int i28 = i27;
                while (true) {
                    if (i25 > i27) {
                        i15 = i28;
                        while (i25 <= i27) {
                            i16 = iArr4[i27];
                            i17 = (bArr[i16 + i24] & 255) - iO;
                            if (i17 == 0) {
                                if (i17 > 0) {
                                    break;
                                    break;
                                }
                                i27--;
                            } else {
                                iArr4[i27] = iArr4[i15];
                                iArr4[i15] = i16;
                                i15--;
                                i27--;
                            }
                        }
                        if (i25 <= i27) {
                            break;
                            break;
                        }
                        int i29 = iArr4[i25];
                        iArr4[i25] = iArr4[i27];
                        iArr4[i27] = i29;
                        i27--;
                        i25++;
                        i28 = i15;
                    } else {
                        int i30 = iArr4[i25];
                        int i31 = (bArr[i30 + i24] & 255) - iO;
                        if (i31 != 0) {
                            if (i31 >= 0) {
                                i15 = i28;
                                while (i25 <= i27) {
                                    i16 = iArr4[i27];
                                    i17 = (bArr[i16 + i24] & 255) - iO;
                                    if (i17 == 0) {
                                        if (i17 > 0) {
                                            break;
                                        } else {
                                            i27--;
                                        }
                                    } else {
                                        iArr4[i27] = iArr4[i15];
                                        iArr4[i15] = i16;
                                        i15--;
                                        i27--;
                                    }
                                }
                                if (i25 <= i27) {
                                    break;
                                }
                                int i210 = iArr4[i25];
                                iArr4[i25] = iArr4[i27];
                                iArr4[i27] = i210;
                                i27--;
                                i25++;
                                i28 = i15;
                            } else {
                                i25++;
                            }
                        } else {
                            iArr4[i25] = iArr4[i26];
                            iArr4[i26] = i30;
                            i26++;
                            i25++;
                        }
                    }
                    i18 = i14;
                }
                if (i15 < i26) {
                    iArr[i20] = i21;
                    iArr2[i20] = i22;
                    iArr3[i20] = i24;
                    i19 = i20 + 1;
                    i14 = 1;
                } else {
                    int i32 = i26 - i21;
                    int i33 = i25 - i26;
                    if (i32 >= i33) {
                        i32 = i33;
                    }
                    p(iArr4, i21, i25 - i32, i32);
                    int i34 = i22 - i15;
                    int i35 = i15 - i27;
                    if (i34 >= i35) {
                        i34 = i35;
                    }
                    i14 = 1;
                    p(iArr4, i25, (i22 - i34) + 1, i34);
                    int i36 = ((i25 + i21) - i26) - 1;
                    int i37 = (i22 - i35) + 1;
                    iArr[i20] = i21;
                    iArr2[i20] = i36;
                    iArr3[i20] = i23;
                    int i38 = i20 + 1;
                    iArr[i38] = i36 + 1;
                    iArr2[i38] = i37 - 1;
                    iArr3[i38] = i24;
                    int i39 = i38 + 1;
                    iArr[i39] = i37;
                    iArr2[i39] = i22;
                    iArr3[i39] = i23;
                    i20 = i39 + 1;
                }
                i18 = i14;
            }
            i19 = i20;
            i18 = i14;
        }
    }

    private boolean m(d.a aVar, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = (i11 - i10) + 1;
        if (i19 < 2) {
            return this.f137147c && this.f137145a > this.f137146b;
        }
        int i20 = 0;
        while (f137139q[i20] < i19) {
            i20++;
        }
        int[] iArr = aVar.f137239r;
        char[] cArr = this.f137155k;
        byte[] bArr = aVar.f137238q;
        int i21 = i13 + 1;
        boolean z10 = this.f137147c;
        int i22 = this.f137146b;
        int i23 = this.f137145a;
        loop1: while (true) {
            i20--;
            if (i20 < 0) {
                break;
            }
            int i24 = f137139q[i20];
            int i25 = i10 + i24;
            int i26 = i25 - 1;
            while (i25 <= i11) {
                int i27 = 3;
                while (i25 <= i11) {
                    int i28 = i27 - 1;
                    if (i28 < 0) {
                        break;
                    }
                    int i29 = iArr[i25];
                    int i30 = i29 + i12;
                    int i31 = i25;
                    boolean z11 = false;
                    int i32 = 0;
                    while (true) {
                        if (z11) {
                            iArr[i31] = i32;
                            i18 = i31 - i24;
                            if (i18 <= i26) {
                                i17 = i20;
                                i15 = i24;
                                i14 = i26;
                                i16 = i28;
                                break;
                            }
                            i31 = i18;
                        } else {
                            z11 = true;
                        }
                        int i33 = iArr[i31 - i24];
                        int i34 = i33 + i12;
                        byte b10 = bArr[i34 + 1];
                        byte b11 = bArr[i30 + 1];
                        if (b10 == b11) {
                            byte b12 = bArr[i34 + 2];
                            byte b13 = bArr[i30 + 2];
                            if (b12 == b13) {
                                byte b14 = bArr[i34 + 3];
                                byte b15 = bArr[i30 + 3];
                                if (b14 == b15) {
                                    byte b16 = bArr[i34 + 4];
                                    byte b17 = bArr[i30 + 4];
                                    if (b16 == b17) {
                                        byte b18 = bArr[i34 + 5];
                                        byte b19 = bArr[i30 + 5];
                                        if (b18 == b19) {
                                            int i35 = i34 + 6;
                                            byte b20 = bArr[i35];
                                            int i36 = i30 + 6;
                                            i17 = i20;
                                            byte b21 = bArr[i36];
                                            if (b20 == b21) {
                                                int i37 = i13;
                                                while (true) {
                                                    if (i37 > 0) {
                                                        int i38 = i37 - 4;
                                                        int i39 = i35 + 1;
                                                        byte b22 = bArr[i39];
                                                        int i40 = i36 + 1;
                                                        i15 = i24;
                                                        byte b23 = bArr[i40];
                                                        if (b22 == b23) {
                                                            char c10 = cArr[i35];
                                                            char c11 = cArr[i36];
                                                            if (c10 == c11) {
                                                                int i41 = i35 + 2;
                                                                byte b24 = bArr[i41];
                                                                int i42 = i36 + 2;
                                                                i14 = i26;
                                                                byte b25 = bArr[i42];
                                                                if (b24 == b25) {
                                                                    char c12 = cArr[i39];
                                                                    char c13 = cArr[i40];
                                                                    if (c12 == c13) {
                                                                        int i43 = i35 + 3;
                                                                        byte b26 = bArr[i43];
                                                                        int i44 = i36 + 3;
                                                                        i16 = i28;
                                                                        byte b27 = bArr[i44];
                                                                        if (b26 == b27) {
                                                                            char c14 = cArr[i41];
                                                                            char c15 = cArr[i42];
                                                                            if (c14 == c15) {
                                                                                int i45 = i35 + 4;
                                                                                byte b28 = bArr[i45];
                                                                                i36 += 4;
                                                                                byte b29 = bArr[i36];
                                                                                if (b28 == b29) {
                                                                                    char c16 = cArr[i43];
                                                                                    char c17 = cArr[i44];
                                                                                    if (c16 == c17) {
                                                                                        if (i45 >= i21) {
                                                                                            i45 -= i21;
                                                                                        }
                                                                                        i35 = i45;
                                                                                        if (i36 >= i21) {
                                                                                            i36 -= i21;
                                                                                        }
                                                                                        i23++;
                                                                                        i37 = i38;
                                                                                        i28 = i16;
                                                                                        i24 = i15;
                                                                                        i26 = i14;
                                                                                    } else if (c16 > c17) {
                                                                                        i32 = i33;
                                                                                        i20 = i17;
                                                                                        i28 = i16;
                                                                                        i24 = i15;
                                                                                        i26 = i14;
                                                                                    }
                                                                                } else if ((b28 & 255) > (b29 & 255)) {
                                                                                    i32 = i33;
                                                                                    i20 = i17;
                                                                                    i28 = i16;
                                                                                    i24 = i15;
                                                                                    i26 = i14;
                                                                                }
                                                                            } else if (c14 > c15) {
                                                                                i32 = i33;
                                                                                i20 = i17;
                                                                                i28 = i16;
                                                                                i24 = i15;
                                                                                i26 = i14;
                                                                            }
                                                                        } else if ((b26 & 255) > (b27 & 255)) {
                                                                            i32 = i33;
                                                                            i20 = i17;
                                                                            i28 = i16;
                                                                            i24 = i15;
                                                                            i26 = i14;
                                                                        }
                                                                    } else {
                                                                        i16 = i28;
                                                                        if (c12 > c13) {
                                                                            i32 = i33;
                                                                            i20 = i17;
                                                                            i28 = i16;
                                                                            i24 = i15;
                                                                            i26 = i14;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i16 = i28;
                                                                    if ((b24 & 255) > (b25 & 255)) {
                                                                        i32 = i33;
                                                                        i20 = i17;
                                                                        i28 = i16;
                                                                        i24 = i15;
                                                                        i26 = i14;
                                                                    }
                                                                }
                                                            } else {
                                                                i14 = i26;
                                                                i16 = i28;
                                                                if (c10 > c11) {
                                                                    i32 = i33;
                                                                    i20 = i17;
                                                                    i28 = i16;
                                                                    i24 = i15;
                                                                    i26 = i14;
                                                                }
                                                            }
                                                        } else {
                                                            i14 = i26;
                                                            i16 = i28;
                                                            if ((b22 & 255) > (b23 & 255)) {
                                                                i32 = i33;
                                                                i20 = i17;
                                                                i28 = i16;
                                                                i24 = i15;
                                                                i26 = i14;
                                                            }
                                                        }
                                                    } else {
                                                        i15 = i24;
                                                        i14 = i26;
                                                        i16 = i28;
                                                    }
                                                    i18 = i31;
                                                    break;
                                                }
                                            }
                                            i15 = i24;
                                            i14 = i26;
                                            i16 = i28;
                                            if ((b20 & 255) <= (b21 & 255)) {
                                                i18 = i31;
                                                break;
                                                break;
                                            }
                                            i32 = i33;
                                            i20 = i17;
                                            i28 = i16;
                                            i24 = i15;
                                            i26 = i14;
                                        } else {
                                            i17 = i20;
                                            i15 = i24;
                                            i14 = i26;
                                            i16 = i28;
                                            if ((b18 & 255) <= (b19 & 255)) {
                                                i18 = i31;
                                                break;
                                                break;
                                            }
                                            i32 = i33;
                                            i20 = i17;
                                            i28 = i16;
                                            i24 = i15;
                                            i26 = i14;
                                        }
                                    } else {
                                        i17 = i20;
                                        i15 = i24;
                                        i14 = i26;
                                        i16 = i28;
                                        if ((b16 & 255) <= (b17 & 255)) {
                                            i18 = i31;
                                            break;
                                            break;
                                        }
                                        i32 = i33;
                                        i20 = i17;
                                        i28 = i16;
                                        i24 = i15;
                                        i26 = i14;
                                    }
                                } else {
                                    i17 = i20;
                                    i15 = i24;
                                    i14 = i26;
                                    i16 = i28;
                                    if ((b14 & 255) <= (b15 & 255)) {
                                        i18 = i31;
                                        break;
                                        break;
                                    }
                                    i32 = i33;
                                    i20 = i17;
                                    i28 = i16;
                                    i24 = i15;
                                    i26 = i14;
                                }
                            } else {
                                i17 = i20;
                                i15 = i24;
                                i14 = i26;
                                i16 = i28;
                                if ((b12 & 255) <= (b13 & 255)) {
                                    i18 = i31;
                                    break;
                                    break;
                                }
                                i32 = i33;
                                i20 = i17;
                                i28 = i16;
                                i24 = i15;
                                i26 = i14;
                            }
                        } else {
                            i17 = i20;
                            i15 = i24;
                            i14 = i26;
                            i16 = i28;
                            if ((b10 & 255) <= (b11 & 255)) {
                                i18 = i31;
                                break;
                                break;
                            }
                            i32 = i33;
                            i20 = i17;
                            i28 = i16;
                            i24 = i15;
                            i26 = i14;
                        }
                    }
                    iArr[i18] = i29;
                    i25++;
                    i20 = i17;
                    i27 = i16;
                    i24 = i15;
                    i26 = i14;
                }
                int i46 = i20;
                int i47 = i24;
                int i48 = i26;
                if (z10 && i25 <= i11 && i23 > i22) {
                    break loop1;
                }
                i20 = i46;
                i24 = i47;
                i26 = i48;
            }
        }
        this.f137145a = i23;
        return z10 && i23 > i22;
    }

    private static byte o(byte b10, byte b11, byte b12) {
        if (b10 < b11) {
            if (b11 >= b12) {
                if (b10 >= b12) {
                    return b10;
                }
                return b12;
            }
            return b11;
        }
        if (b11 <= b12) {
            if (b10 <= b12) {
                return b10;
            }
            return b12;
        }
        return b11;
    }

    private static void p(int[] iArr, int i10, int i11, int i12) {
        int i13 = i12 + i10;
        while (i10 < i13) {
            int i14 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i14;
            i11++;
            i10++;
        }
    }

    void a(d.a aVar, int i10) {
        this.f137146b = i10 * 30;
        this.f137145a = 0;
        this.f137147c = true;
        if (i10 + 1 < 10000) {
            d(aVar, i10);
        } else {
            n(aVar, i10);
            if (this.f137147c && this.f137145a > this.f137146b) {
                d(aVar, i10);
            }
        }
        int[] iArr = aVar.f137239r;
        aVar.f137241t = -1;
        for (int i11 = 0; i11 <= i10; i11++) {
            if (iArr[i11] == 0) {
                aVar.f137241t = i11;
                return;
            }
        }
    }

    final void d(d.a aVar, int i10) {
        byte[] bArr = aVar.f137238q;
        int i11 = i10 + 1;
        bArr[0] = bArr[i11];
        e(aVar.f137239r, bArr, i11);
        for (int i12 = 0; i12 < i11; i12++) {
            int[] iArr = aVar.f137239r;
            iArr[i12] = iArr[i12] - 1;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int[] iArr2 = aVar.f137239r;
            if (iArr2[i13] == -1) {
                iArr2[i13] = i10;
                return;
            }
        }
    }

    final void e(int[] iArr, byte[] bArr, int i10) {
        int i11;
        int[] iArr2 = new int[257];
        int[] iArrK = k();
        for (int i12 = 0; i12 < i10; i12++) {
            iArrK[i12] = 0;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = bArr[i13] & 255;
            iArr2[i14] = iArr2[i14] + 1;
        }
        for (int i15 = 1; i15 < 257; i15++) {
            iArr2[i15] = iArr2[i15] + iArr2[i15 - 1];
        }
        for (int i16 = 0; i16 < i10; i16++) {
            int i17 = bArr[i16] & 255;
            int i18 = iArr2[i17] - 1;
            iArr2[i17] = i18;
            iArr[i18] = i16;
        }
        BitSet bitSet = new BitSet(i10 + 64);
        for (int i19 = 0; i19 < 256; i19++) {
            bitSet.set(iArr2[i19]);
        }
        for (int i20 = 0; i20 < 32; i20++) {
            int i21 = (i20 * 2) + i10;
            bitSet.set(i21);
            bitSet.clear(i21 + 1);
        }
        int i22 = 1;
        do {
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                if (bitSet.get(i24)) {
                    i23 = i24;
                }
                int i25 = iArr[i24] - i22;
                if (i25 < 0) {
                    i25 += i10;
                }
                iArrK[i25] = i23;
            }
            int iNextSetBit = -1;
            i11 = 0;
            while (true) {
                int iNextClearBit = bitSet.nextClearBit(iNextSetBit + 1);
                int i26 = iNextClearBit - 1;
                if (i26 >= i10 || (iNextSetBit = bitSet.nextSetBit(iNextClearBit + 1) - 1) >= i10) {
                    break;
                }
                if (iNextSetBit > i26) {
                    i11 += (iNextSetBit - i26) + 1;
                    b(iArr, iArrK, i26, iNextSetBit);
                    int i27 = -1;
                    while (i26 <= iNextSetBit) {
                        int i28 = iArrK[iArr[i26]];
                        if (i27 != i28) {
                            bitSet.set(i26);
                            i27 = i28;
                        }
                        i26++;
                    }
                }
            }
            i22 *= 2;
            if (i22 > i10) {
                return;
            }
        } while (i11 != 0);
    }

    final void n(d.a aVar, int i10) {
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int[] iArr2 = this.f137151g;
        int[] iArr3 = this.f137152h;
        boolean[] zArr = this.f137153i;
        int[] iArr4 = this.f137154j;
        byte[] bArr = aVar.f137238q;
        int[] iArr5 = aVar.f137239r;
        char[] cArr = this.f137155k;
        int i16 = this.f137146b;
        boolean z10 = this.f137147c;
        int i17 = 65537;
        while (true) {
            i17--;
            if (i17 < 0) {
                break;
            } else {
                iArr4[i17] = 0;
            }
        }
        for (int i18 = 0; i18 < 20; i18++) {
            bArr[i10 + i18 + 2] = bArr[(i18 % (i10 + 1)) + 1];
        }
        int i19 = i10 + 20 + 1;
        while (true) {
            i19--;
            if (i19 < 0) {
                break;
            } else {
                cArr[i19] = 0;
            }
        }
        int i20 = i10 + 1;
        byte b10 = bArr[i20];
        bArr[0] = b10;
        int i21 = 255;
        int i22 = b10 & 255;
        int i23 = 0;
        while (i23 <= i10) {
            i23++;
            int i24 = bArr[i23] & 255;
            int i25 = (i22 << 8) + i24;
            iArr4[i25] = iArr4[i25] + 1;
            i22 = i24;
        }
        for (int i26 = 1; i26 <= 65536; i26++) {
            iArr4[i26] = iArr4[i26] + iArr4[i26 - 1];
        }
        boolean z11 = true;
        int i27 = bArr[1] & 255;
        int i28 = 0;
        while (i28 < i10) {
            int i29 = bArr[i28 + 2] & 255;
            int i30 = (i27 << 8) + i29;
            int i31 = iArr4[i30] - 1;
            iArr4[i30] = i31;
            iArr5[i31] = i28;
            i28++;
            i27 = i29;
            z11 = true;
        }
        int i32 = ((bArr[i20] & 255) << 8) + (bArr[z11 ? 1 : 0] & 255);
        int i33 = iArr4[i32] - 1;
        iArr4[i32] = i33;
        iArr5[i33] = i10;
        int i34 = 256;
        while (true) {
            i34--;
            if (i34 < 0) {
                break;
            }
            zArr[i34] = false;
            iArr2[i34] = i34;
        }
        int i35 = bb.c.b.f30509a4;
        while (i35 != 1) {
            i35 /= 3;
            int i36 = i35;
            while (i36 <= i21) {
                int i37 = iArr2[i36];
                int i38 = iArr4[(i37 + 1) << 8] - iArr4[i37 << 8];
                int i39 = i35 - 1;
                int i40 = iArr2[i36 - i35];
                int i41 = i36;
                while (true) {
                    i15 = i16;
                    if (iArr4[(i40 + 1) << 8] - iArr4[i40 << 8] <= i38) {
                        break;
                    }
                    iArr2[i41] = i40;
                    int i42 = i41 - i35;
                    if (i42 <= i39) {
                        i41 = i42;
                        break;
                    } else {
                        i40 = iArr2[i42 - i35];
                        i41 = i42;
                        i16 = i15;
                    }
                }
                iArr2[i41] = i37;
                i36++;
                i16 = i15;
                i21 = 255;
            }
        }
        int i43 = i16;
        int i44 = 0;
        while (i44 <= i21) {
            int i45 = iArr2[i44];
            int i46 = 0;
            while (i46 <= i21) {
                int i47 = (i45 << 8) + i46;
                int i48 = iArr4[i47];
                if ((i48 & 2097152) != 2097152) {
                    int i49 = i48 & f137144v;
                    int i50 = (iArr4[i47 + 1] & f137144v) - 1;
                    if (i50 > i49) {
                        i14 = 2097152;
                        i11 = i46;
                        i12 = i43;
                        iArr = iArr2;
                        i13 = i44;
                        l(aVar, i49, i50, 2, i10);
                        if (z10 && this.f137145a > i12) {
                            return;
                        }
                    } else {
                        i11 = i46;
                        i12 = i43;
                        i14 = 2097152;
                        iArr = iArr2;
                        i13 = i44;
                    }
                    iArr4[i47] = i48 | i14;
                } else {
                    i11 = i46;
                    i12 = i43;
                    iArr = iArr2;
                    i13 = i44;
                }
                i46 = i11 + 1;
                i44 = i13;
                iArr2 = iArr;
                i21 = 255;
                i43 = i12;
            }
            int i51 = i43;
            int[] iArr6 = iArr2;
            int i52 = i44;
            int i53 = 0;
            for (int i54 = i21; i53 <= i54; i54 = 255) {
                iArr3[i53] = iArr4[(i53 << 8) + i45] & f137144v;
                i53++;
            }
            int i55 = i45 << 8;
            int i56 = iArr4[i55] & f137144v;
            int i57 = (i45 + 1) << 8;
            int i58 = iArr4[i57] & f137144v;
            while (i56 < i58) {
                int i59 = iArr5[i56];
                int i60 = i58;
                int i61 = bArr[i59] & 255;
                if (!zArr[i61]) {
                    iArr5[iArr3[i61]] = i59 == 0 ? i10 : i59 - 1;
                    iArr3[i61] = iArr3[i61] + 1;
                }
                i56++;
                i58 = i60;
            }
            int i62 = 256;
            while (true) {
                i62--;
                if (i62 < 0) {
                    break;
                }
                int i63 = (i62 << 8) + i45;
                iArr4[i63] = iArr4[i63] | 2097152;
            }
            zArr[i45] = true;
            if (i52 < 255) {
                int i64 = iArr4[i55] & f137144v;
                int i65 = (f137144v & iArr4[i57]) - i64;
                int i66 = 0;
                while ((i65 >> i66) > 65534) {
                    i66++;
                }
                int i67 = 0;
                while (i67 < i65) {
                    int i68 = iArr5[i64 + i67];
                    char c10 = (char) (i67 >> i66);
                    cArr[i68] = c10;
                    int i69 = i64;
                    if (i68 < 20) {
                        cArr[i68 + i10 + 1] = c10;
                    }
                    i67++;
                    i64 = i69;
                }
            }
            i44 = i52 + 1;
            iArr2 = iArr6;
            i21 = 255;
            i43 = i51;
        }
    }
}
