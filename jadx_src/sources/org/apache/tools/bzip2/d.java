package org.apache.tools.bzip2;

import androidx.core.view.o;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: CBZip2OutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends OutputStream implements org.apache.tools.bzip2.a {
    private static final int[] A = {1, 4, 13, 40, 121, bb.c.b.f30509a4, bb.c.b.f30546bi, bb.c.d.dn, bb.c.k.uB, 29524, 88573, 265720, 797161, 2391484};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f137197q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f137198r = 9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final int f137199s = 2097152;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final int f137200t = -2097153;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final int f137201u = 15;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final int f137202v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final int f137203w = 20;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected static final int f137204x = 10;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final int f137205y = 30;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final int f137206z = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f137208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f137210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f137211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f137212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f137213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f137214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f137215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f137216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f137217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f137218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f137219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f137220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private OutputStream f137221p;

    /* JADX INFO: compiled from: CBZip2OutputStream.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean[] f137222a = new boolean[256];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f137223b = new byte[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int[] f137224c = new int[258];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final byte[] f137225d = new byte[org.apache.tools.bzip2.a.f137133y3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f137226e = new byte[org.apache.tools.bzip2.a.f137133y3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final byte[] f137227f = new byte[256];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final byte[][] f137228g = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 6, 258);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int[][] f137229h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final int[] f137230i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final short[] f137231j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final int[][] f137232k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final byte[] f137233l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final boolean[] f137234m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int[] f137235n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int[] f137236o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final int[] f137237p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final byte[] f137238q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final int[] f137239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final char[] f137240s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f137241t;

        a(int i10) {
            Class cls = Integer.TYPE;
            this.f137229h = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.f137230i = new int[6];
            this.f137231j = new short[6];
            this.f137232k = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.f137233l = new byte[6];
            this.f137234m = new boolean[16];
            this.f137235n = new int[bb.c.b.f30507a2];
            this.f137236o = new int[bb.c.b.W6];
            this.f137237p = new int[bb.c.b.W6];
            int i11 = i10 * 100000;
            this.f137238q = new byte[i11 + 1 + 20];
            this.f137239r = new int[i11];
            this.f137240s = new char[i11 * 2];
        }
    }

    public d(OutputStream outputStream) throws IOException {
        this(outputStream, 9);
    }

    public d(OutputStream outputStream, int i10) throws IOException {
        this.f137211f = new e();
        this.f137214i = -1;
        this.f137215j = 0;
        if (i10 < 1) {
            throw new IllegalArgumentException("blockSize(" + i10 + ") < 1");
        }
        if (i10 <= 9) {
            this.f137208c = i10;
            this.f137221p = outputStream;
            this.f137218m = (i10 * 100000) - 20;
            r();
            return;
        }
        throw new IllegalArgumentException("blockSize(" + i10 + ") > 9");
    }

    private int A(int i10, int i11) {
        byte[] bArr;
        int i12;
        d dVar = this;
        a aVar = dVar.f137219n;
        int[][] iArr = aVar.f137229h;
        int[] iArr2 = aVar.f137230i;
        short[] sArr = aVar.f137231j;
        char[] cArr = aVar.f137240s;
        byte[] bArr2 = aVar.f137225d;
        byte[][] bArr3 = aVar.f137228g;
        int i13 = 0;
        byte[] bArr4 = bArr3[0];
        byte[] bArr5 = bArr3[1];
        byte[] bArr6 = bArr3[2];
        byte[] bArr7 = bArr3[3];
        int i14 = 4;
        byte[] bArr8 = bArr3[4];
        byte[] bArr9 = bArr3[5];
        int i15 = dVar.f137213h;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            int i18 = i10;
            while (true) {
                i18--;
                if (i18 < 0) {
                    break;
                }
                iArr2[i18] = i13;
                int[] iArr3 = iArr[i18];
                int i19 = i11;
                while (true) {
                    i19--;
                    if (i19 >= 0) {
                        iArr3[i19] = i13;
                    }
                }
            }
            int i20 = i13;
            i17 = i20;
            while (i20 < dVar.f137213h) {
                int i21 = i20;
                int iMin = Math.min((i20 + 50) - 1, i15 - 1);
                if (i10 == 6) {
                    int i22 = i21;
                    short s10 = 0;
                    short s11 = 0;
                    short s12 = 0;
                    short s13 = 0;
                    short s14 = 0;
                    short s15 = 0;
                    while (i22 <= iMin) {
                        char c10 = cArr[i22];
                        int i23 = i15;
                        short s16 = (short) (s10 + (bArr4[c10] & 255));
                        byte[] bArr10 = bArr4;
                        short s17 = (short) (s11 + (bArr5[c10] & 255));
                        short s18 = (short) (s12 + (bArr6[c10] & 255));
                        short s19 = (short) (s13 + (bArr7[c10] & 255));
                        short s20 = (short) (s14 + (bArr8[c10] & 255));
                        i22++;
                        s15 = (short) (s15 + (bArr9[c10] & 255));
                        s14 = s20;
                        bArr4 = bArr10;
                        s13 = s19;
                        s12 = s18;
                        s11 = s17;
                        s10 = s16;
                        i15 = i23;
                    }
                    bArr = bArr4;
                    i12 = i15;
                    sArr[0] = s10;
                    sArr[1] = s11;
                    sArr[2] = s12;
                    sArr[3] = s13;
                    sArr[4] = s14;
                    sArr[5] = s15;
                } else {
                    bArr = bArr4;
                    i12 = i15;
                    int i24 = i10;
                    while (true) {
                        i24--;
                        if (i24 < 0) {
                            break;
                        }
                        sArr[i24] = 0;
                    }
                    for (int i25 = i21; i25 <= iMin; i25++) {
                        char c11 = cArr[i25];
                        int i26 = i10;
                        while (true) {
                            i26--;
                            if (i26 >= 0) {
                                sArr[i26] = (short) (sArr[i26] + (bArr3[i26][c11] & 255));
                            }
                        }
                    }
                }
                short s21 = 999999999;
                int i27 = i10;
                int i28 = -1;
                while (true) {
                    i27--;
                    if (i27 < 0) {
                        break;
                    }
                    byte[] bArr11 = bArr5;
                    short s22 = sArr[i27];
                    if (s22 < s21) {
                        s21 = s22;
                        i28 = i27;
                    }
                    bArr5 = bArr11;
                }
                byte[] bArr12 = bArr5;
                iArr2[i28] = iArr2[i28] + 1;
                bArr2[i17] = (byte) i28;
                i17++;
                int[] iArr4 = iArr[i28];
                for (int i29 = i21; i29 <= iMin; i29++) {
                    char c12 = cArr[i29];
                    iArr4[c12] = iArr4[c12] + 1;
                }
                i20 = iMin + 1;
                bArr5 = bArr12;
                i15 = i12;
                bArr4 = bArr;
            }
            byte[] bArr13 = bArr4;
            byte[] bArr14 = bArr5;
            int i30 = i15;
            int i31 = 0;
            while (i31 < i10) {
                p(bArr3[i31], iArr[i31], dVar.f137219n, i11, 20);
                i31++;
                dVar = this;
            }
            i16++;
            i13 = 0;
            dVar = this;
            i14 = 4;
            bArr5 = bArr14;
            i15 = i30;
            bArr4 = bArr13;
        }
        return i17;
    }

    private void C(int i10, int i11) {
        a aVar = this.f137219n;
        byte[] bArr = aVar.f137233l;
        while (true) {
            i10--;
            if (i10 < 0) {
                break;
            } else {
                bArr[i10] = (byte) i10;
            }
        }
        for (int i12 = 0; i12 < i11; i12++) {
            byte b10 = aVar.f137225d[i12];
            byte b11 = bArr[0];
            int i13 = 0;
            while (b10 != b11) {
                i13++;
                byte b12 = bArr[i13];
                bArr[i13] = b11;
                b11 = b12;
            }
            bArr[0] = b11;
            aVar.f137226e[i12] = (byte) i13;
        }
    }

    private void I(int i10, int i11) {
        a aVar = this.f137219n;
        int[][] iArr = aVar.f137232k;
        byte[][] bArr = aVar.f137228g;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 32;
            byte[] bArr2 = bArr[i12];
            int i14 = i11;
            int i15 = 0;
            while (true) {
                i14--;
                if (i14 >= 0) {
                    int i16 = bArr2[i14] & 255;
                    if (i16 > i15) {
                        i15 = i16;
                    }
                    if (i16 < i13) {
                        i13 = i16;
                    }
                }
            }
            o(iArr[i12], bArr[i12], i13, i15, i11);
        }
    }

    private void J() throws IOException {
        a aVar = this.f137219n;
        boolean[] zArr = aVar.f137222a;
        boolean[] zArr2 = aVar.f137234m;
        int i10 = 16;
        while (true) {
            i10--;
            if (i10 < 0) {
                break;
            }
            zArr2[i10] = false;
            int i11 = i10 * 16;
            int i12 = 16;
            while (true) {
                i12--;
                if (i12 >= 0) {
                    if (zArr[i11 + i12]) {
                        zArr2[i10] = true;
                    }
                }
            }
        }
        for (int i13 = 0; i13 < 16; i13++) {
            e(1, zArr2[i13] ? 1 : 0);
        }
        OutputStream outputStream = this.f137221p;
        int i14 = this.f137210e;
        int i15 = this.f137209d;
        for (int i16 = 0; i16 < 16; i16++) {
            if (zArr2[i16]) {
                int i17 = i16 * 16;
                for (int i18 = 0; i18 < 16; i18++) {
                    while (i14 >= 8) {
                        outputStream.write(i15 >> 24);
                        i15 <<= 8;
                        i14 -= 8;
                    }
                    if (zArr[i17 + i18]) {
                        i15 |= 1 << ((32 - i14) - 1);
                    }
                    i14++;
                }
            }
        }
        this.f137209d = i15;
        this.f137210e = i14;
    }

    private void K(int i10, int i11) throws IOException {
        e(3, i10);
        e(15, i11);
        OutputStream outputStream = this.f137221p;
        byte[] bArr = this.f137219n.f137226e;
        int i12 = this.f137210e;
        int i13 = this.f137209d;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = bArr[i14] & 255;
            for (int i16 = 0; i16 < i15; i16++) {
                while (i12 >= 8) {
                    outputStream.write(i13 >> 24);
                    i13 <<= 8;
                    i12 -= 8;
                }
                i13 |= 1 << ((32 - i12) - 1);
                i12++;
            }
            while (i12 >= 8) {
                outputStream.write(i13 >> 24);
                i13 <<= 8;
                i12 -= 8;
            }
            i12++;
        }
        this.f137209d = i13;
        this.f137210e = i12;
    }

    private void L(int i10, int i11) throws IOException {
        byte[][] bArr = this.f137219n.f137228g;
        OutputStream outputStream = this.f137221p;
        int i12 = this.f137210e;
        int i13 = this.f137209d;
        for (int i14 = 0; i14 < i10; i14++) {
            byte[] bArr2 = bArr[i14];
            int i15 = bArr2[0] & 255;
            while (i12 >= 8) {
                outputStream.write(i13 >> 24);
                i13 <<= 8;
                i12 -= 8;
            }
            i13 |= i15 << ((32 - i12) - 5);
            i12 += 5;
            for (int i16 = 0; i16 < i11; i16++) {
                int i17 = bArr2[i16] & 255;
                while (i15 < i17) {
                    while (i12 >= 8) {
                        outputStream.write(i13 >> 24);
                        i13 <<= 8;
                        i12 -= 8;
                    }
                    i13 |= 2 << ((32 - i12) - 2);
                    i12 += 2;
                    i15++;
                }
                while (i15 > i17) {
                    while (i12 >= 8) {
                        outputStream.write(i13 >> 24);
                        i13 <<= 8;
                        i12 -= 8;
                    }
                    i13 |= 3 << ((32 - i12) - 2);
                    i12 += 2;
                    i15--;
                }
                while (i12 >= 8) {
                    outputStream.write(i13 >> 24);
                    i13 <<= 8;
                    i12 -= 8;
                }
                i12++;
            }
        }
        this.f137209d = i13;
        this.f137210e = i12;
    }

    private void M() throws IOException {
        a aVar = this.f137219n;
        byte[][] bArr = aVar.f137228g;
        int[][] iArr = aVar.f137232k;
        OutputStream outputStream = this.f137221p;
        byte[] bArr2 = aVar.f137225d;
        char[] cArr = aVar.f137240s;
        int i10 = this.f137213h;
        int i11 = this.f137210e;
        int i12 = this.f137209d;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int iMin = Math.min((i13 + 50) - 1, i10 - 1);
            int i15 = bArr2[i14] & 255;
            int[] iArr2 = iArr[i15];
            byte[] bArr3 = bArr[i15];
            while (i13 <= iMin) {
                char c10 = cArr[i13];
                while (i11 >= 8) {
                    outputStream.write(i12 >> 24);
                    i12 <<= 8;
                    i11 -= 8;
                }
                int i16 = bArr3[c10] & 255;
                i12 |= iArr2[c10] << ((32 - i11) - i16);
                i11 += i16;
                i13++;
            }
            i13 = iMin + 1;
            i14++;
        }
        this.f137209d = i12;
        this.f137210e = i11;
    }

    private void N(int i10) throws IOException {
        int i11 = this.f137214i;
        if (i11 == -1) {
            this.f137214i = i10 & 255;
            this.f137215j++;
            return;
        }
        int i12 = i10 & 255;
        if (i11 != i12) {
            O();
            this.f137215j = 1;
            this.f137214i = i12;
            return;
        }
        int i13 = this.f137215j + 1;
        this.f137215j = i13;
        if (i13 > 254) {
            O();
            this.f137214i = -1;
            this.f137215j = 0;
        }
    }

    private void O() throws IOException {
        int i10 = this.f137207b;
        if (i10 >= this.f137218m) {
            g();
            s();
            O();
            return;
        }
        int i11 = this.f137214i;
        a aVar = this.f137219n;
        aVar.f137222a[i11] = true;
        byte b10 = (byte) i11;
        int i12 = this.f137215j;
        this.f137211f.f(i11, i12);
        byte[] bArr = aVar.f137238q;
        if (i12 == 1) {
            bArr[i10 + 2] = b10;
            this.f137207b = i10 + 1;
            return;
        }
        if (i12 == 2) {
            int i13 = i10 + 2;
            bArr[i13] = b10;
            bArr[i10 + 3] = b10;
            this.f137207b = i13;
            return;
        }
        if (i12 == 3) {
            bArr[i10 + 2] = b10;
            int i14 = i10 + 3;
            bArr[i14] = b10;
            bArr[i10 + 4] = b10;
            this.f137207b = i14;
            return;
        }
        int i15 = i12 - 4;
        aVar.f137222a[i15] = true;
        bArr[i10 + 2] = b10;
        bArr[i10 + 3] = b10;
        bArr[i10 + 4] = b10;
        int i16 = i10 + 5;
        bArr[i16] = b10;
        bArr[i10 + 6] = (byte) i15;
        this.f137207b = i16;
    }

    private void a() {
        this.f137220o.a(this.f137219n, this.f137207b);
    }

    private void b() throws IOException {
        while (this.f137210e > 0) {
            this.f137221p.write(this.f137209d >> 24);
            this.f137209d <<= 8;
            this.f137210e -= 8;
        }
    }

    private void c(int i10) throws IOException {
        e(8, (i10 >> 24) & 255);
        e(8, (i10 >> 16) & 255);
        e(8, (i10 >> 8) & 255);
        e(8, i10 & 255);
    }

    private void d(int i10) throws IOException {
        e(8, i10);
    }

    private void e(int i10, int i11) throws IOException {
        OutputStream outputStream = this.f137221p;
        int i12 = this.f137210e;
        int i13 = this.f137209d;
        while (i12 >= 8) {
            outputStream.write(i13 >> 24);
            i13 <<= 8;
            i12 -= 8;
        }
        this.f137209d = (i11 << ((32 - i12) - i10)) | i13;
        this.f137210e = i12 + i10;
    }

    public static int f(long j10) {
        if (j10 > 0) {
            return (int) Math.min((j10 / 132000) + 1, 9L);
        }
        return 9;
    }

    private void g() throws IOException {
        int iA = this.f137211f.a();
        this.f137216k = iA;
        int i10 = this.f137217l;
        this.f137217l = iA ^ ((i10 >>> 31) | (i10 << 1));
        if (this.f137207b == -1) {
            return;
        }
        a();
        d(49);
        d(65);
        d(89);
        d(38);
        d(83);
        d(89);
        c(this.f137216k);
        e(1, 0);
        t();
    }

    private void i() throws IOException {
        d(23);
        d(114);
        d(69);
        d(56);
        d(80);
        d(144);
        c(this.f137217l);
        b();
    }

    private void m() {
        int i10 = this.f137207b;
        a aVar = this.f137219n;
        boolean[] zArr = aVar.f137222a;
        byte[] bArr = aVar.f137238q;
        int[] iArr = aVar.f137239r;
        char[] cArr = aVar.f137240s;
        int[] iArr2 = aVar.f137224c;
        byte[] bArr2 = aVar.f137223b;
        byte[] bArr3 = aVar.f137227f;
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            if (zArr[i12]) {
                bArr2[i12] = (byte) i11;
                i11++;
            }
        }
        this.f137212g = i11;
        int i13 = i11 + 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            iArr2[i14] = 0;
        }
        while (true) {
            i11--;
            if (i11 < 0) {
                break;
            } else {
                bArr3[i11] = (byte) i11;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 <= i10; i17++) {
            byte b10 = bArr2[bArr[iArr[i17]] & 255];
            byte b11 = bArr3[0];
            int i18 = 0;
            while (b10 != b11) {
                i18++;
                byte b12 = bArr3[i18];
                bArr3[i18] = b11;
                b11 = b12;
            }
            bArr3[0] = b11;
            if (i18 == 0) {
                i15++;
            } else {
                if (i15 > 0) {
                    int i19 = i15 - 1;
                    while (true) {
                        if ((i19 & 1) == 0) {
                            cArr[i16] = 0;
                            i16++;
                            iArr2[0] = iArr2[0] + 1;
                        } else {
                            cArr[i16] = 1;
                            i16++;
                            iArr2[1] = iArr2[1] + 1;
                        }
                        if (i19 < 2) {
                            break;
                        } else {
                            i19 = (i19 - 2) >> 1;
                        }
                    }
                    i15 = 0;
                }
                int i20 = i18 + 1;
                cArr[i16] = (char) i20;
                i16++;
                iArr2[i20] = iArr2[i20] + 1;
            }
        }
        if (i15 > 0) {
            int i21 = i15 - 1;
            while (true) {
                if ((i21 & 1) == 0) {
                    cArr[i16] = 0;
                    i16++;
                    iArr2[0] = iArr2[0] + 1;
                } else {
                    cArr[i16] = 1;
                    i16++;
                    iArr2[1] = iArr2[1] + 1;
                }
                if (i21 < 2) {
                    break;
                } else {
                    i21 = (i21 - 2) >> 1;
                }
            }
        }
        cArr[i16] = (char) i13;
        iArr2[i13] = iArr2[i13] + 1;
        this.f137213h = i16 + 1;
    }

    private static void o(int[] iArr, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 <= i11) {
            for (int i14 = 0; i14 < i12; i14++) {
                if ((bArr[i14] & 255) == i10) {
                    iArr[i14] = i13;
                    i13++;
                }
            }
            i13 <<= 1;
            i10++;
        }
    }

    private static void p(byte[] bArr, int[] iArr, a aVar, int i10, int i11) {
        int[] iArr2 = aVar.f137235n;
        int[] iArr3 = aVar.f137236o;
        int[] iArr4 = aVar.f137237p;
        int i12 = i10;
        while (true) {
            i12--;
            int i13 = 1;
            if (i12 < 0) {
                break;
            }
            int i14 = i12 + 1;
            int i15 = iArr[i12];
            if (i15 != 0) {
                i13 = i15;
            }
            iArr3[i14] = i13 << 8;
        }
        boolean z10 = true;
        while (z10) {
            iArr2[0] = 0;
            iArr3[0] = 0;
            iArr4[0] = -2;
            int i16 = 0;
            for (int i17 = 1; i17 <= i10; i17++) {
                iArr4[i17] = -1;
                i16++;
                iArr2[i16] = i17;
                int i18 = i16;
                while (true) {
                    int i19 = iArr3[i17];
                    int i20 = i18 >> 1;
                    int i21 = iArr2[i20];
                    if (i19 < iArr3[i21]) {
                        iArr2[i18] = i21;
                        i18 = i20;
                    }
                }
                iArr2[i18] = i17;
            }
            int i22 = i10;
            while (i16 > 1) {
                int i23 = iArr2[1];
                int i24 = iArr2[i16];
                iArr2[1] = i24;
                int i25 = i16 - 1;
                int i26 = 1;
                while (true) {
                    int i27 = i26 << 1;
                    if (i27 > i25) {
                        break;
                    }
                    if (i27 < i25) {
                        int i28 = i27 + 1;
                        if (iArr3[iArr2[i28]] < iArr3[iArr2[i27]]) {
                            i27 = i28;
                        }
                    }
                    int i29 = iArr3[i24];
                    int i30 = iArr2[i27];
                    if (i29 < iArr3[i30]) {
                        break;
                    }
                    iArr2[i26] = i30;
                    i26 = i27;
                }
                iArr2[i26] = i24;
                int i31 = iArr2[1];
                int i32 = iArr2[i25];
                iArr2[1] = i32;
                int i33 = i25 - 1;
                int i34 = 1;
                while (true) {
                    int i35 = i34 << 1;
                    if (i35 > i33) {
                        break;
                    }
                    if (i35 < i33) {
                        int i36 = i35 + 1;
                        if (iArr3[iArr2[i36]] < iArr3[iArr2[i35]]) {
                            i35 = i36;
                        }
                    }
                    int i37 = iArr3[i32];
                    int i38 = iArr2[i35];
                    if (i37 < iArr3[i38]) {
                        break;
                    }
                    iArr2[i34] = i38;
                    i34 = i35;
                }
                iArr2[i34] = i32;
                i22++;
                iArr4[i31] = i22;
                iArr4[i23] = i22;
                int i39 = iArr3[i23];
                int i40 = iArr3[i31];
                int i41 = (i39 & o.f21773u) + (i40 & o.f21773u);
                int i42 = i39 & 255;
                int i43 = i40 & 255;
                if (i42 <= i43) {
                    i42 = i43;
                }
                iArr3[i22] = (i42 + 1) | i41;
                iArr4[i22] = -1;
                i16 = i33 + 1;
                iArr2[i16] = i22;
                int i44 = iArr3[i22];
                int i45 = i16;
                while (true) {
                    int i46 = i45 >> 1;
                    int i47 = iArr2[i46];
                    if (i44 < iArr3[i47]) {
                        iArr2[i45] = i47;
                        i45 = i46;
                    }
                }
                iArr2[i45] = i22;
            }
            z10 = false;
            for (int i48 = 1; i48 <= i10; i48++) {
                int i49 = i48;
                int i50 = 0;
                while (true) {
                    i49 = iArr4[i49];
                    if (i49 < 0) {
                        break;
                    } else {
                        i50++;
                    }
                }
                bArr[i48 - 1] = (byte) i50;
                if (i50 > i11) {
                    z10 = true;
                }
            }
            if (z10) {
                for (int i51 = 1; i51 < i10; i51++) {
                    iArr3[i51] = (((iArr3[i51] >> 8) >> 1) + 1) << 8;
                }
            }
        }
    }

    protected static void q(char[] cArr, int[] iArr, int i10, int i11) {
        int[] iArr2 = new int[bb.c.b.W6];
        int[] iArr3 = new int[bb.c.b.W6];
        int[] iArr4 = new int[bb.c.b.W6];
        int i12 = i10;
        while (true) {
            i12--;
            int i13 = 1;
            if (i12 < 0) {
                break;
            }
            int i14 = i12 + 1;
            int i15 = iArr[i12];
            if (i15 != 0) {
                i13 = i15;
            }
            iArr3[i14] = i13 << 8;
        }
        boolean z10 = true;
        while (z10) {
            iArr2[0] = 0;
            iArr3[0] = 0;
            iArr4[0] = -2;
            int i16 = 0;
            for (int i17 = 1; i17 <= i10; i17++) {
                iArr4[i17] = -1;
                i16++;
                iArr2[i16] = i17;
                int i18 = i16;
                while (true) {
                    int i19 = iArr3[i17];
                    int i20 = i18 >> 1;
                    int i21 = iArr2[i20];
                    if (i19 < iArr3[i21]) {
                        iArr2[i18] = i21;
                        i18 = i20;
                    }
                }
                iArr2[i18] = i17;
            }
            int i22 = i10;
            while (i16 > 1) {
                int i23 = iArr2[1];
                int i24 = iArr2[i16];
                iArr2[1] = i24;
                int i25 = i16 - 1;
                int i26 = 1;
                while (true) {
                    int i27 = i26 << 1;
                    if (i27 > i25) {
                        break;
                    }
                    if (i27 < i25) {
                        int i28 = i27 + 1;
                        if (iArr3[iArr2[i28]] < iArr3[iArr2[i27]]) {
                            i27 = i28;
                        }
                    }
                    int i29 = iArr3[i24];
                    int i30 = iArr2[i27];
                    if (i29 < iArr3[i30]) {
                        break;
                    }
                    iArr2[i26] = i30;
                    i26 = i27;
                }
                iArr2[i26] = i24;
                int i31 = iArr2[1];
                int i32 = iArr2[i25];
                iArr2[1] = i32;
                int i33 = i25 - 1;
                int i34 = 1;
                while (true) {
                    int i35 = i34 << 1;
                    if (i35 > i33) {
                        break;
                    }
                    if (i35 < i33) {
                        int i36 = i35 + 1;
                        if (iArr3[iArr2[i36]] < iArr3[iArr2[i35]]) {
                            i35 = i36;
                        }
                    }
                    int i37 = iArr3[i32];
                    int i38 = iArr2[i35];
                    if (i37 < iArr3[i38]) {
                        break;
                    }
                    iArr2[i34] = i38;
                    i34 = i35;
                }
                iArr2[i34] = i32;
                i22++;
                iArr4[i31] = i22;
                iArr4[i23] = i22;
                int i39 = iArr3[i23];
                int i40 = iArr3[i31];
                int i41 = (i39 & o.f21773u) + (i40 & o.f21773u);
                int i42 = i39 & 255;
                int i43 = i40 & 255;
                if (i42 <= i43) {
                    i42 = i43;
                }
                iArr3[i22] = (i42 + 1) | i41;
                iArr4[i22] = -1;
                i16 = i33 + 1;
                iArr2[i16] = i22;
                int i44 = iArr3[i22];
                int i45 = i16;
                while (true) {
                    int i46 = i45 >> 1;
                    int i47 = iArr2[i46];
                    if (i44 < iArr3[i47]) {
                        iArr2[i45] = i47;
                        i45 = i46;
                    }
                }
                iArr2[i45] = i22;
            }
            z10 = false;
            for (int i48 = 1; i48 <= i10; i48++) {
                int i49 = i48;
                int i50 = 0;
                while (true) {
                    i49 = iArr4[i49];
                    if (i49 < 0) {
                        break;
                    } else {
                        i50++;
                    }
                }
                cArr[i48 - 1] = (char) i50;
                if (i50 > i11) {
                    z10 = true;
                }
            }
            if (z10) {
                for (int i51 = 1; i51 < i10; i51++) {
                    iArr3[i51] = (((iArr3[i51] >> 8) >> 1) + 1) << 8;
                }
            }
        }
    }

    private void r() throws IOException {
        this.f137219n = new a(this.f137208c);
        this.f137220o = new b(this.f137219n);
        d(104);
        d(this.f137208c + 48);
        this.f137217l = 0;
        s();
    }

    private void s() {
        this.f137211f.c();
        this.f137207b = -1;
        boolean[] zArr = this.f137219n.f137222a;
        int i10 = 256;
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            } else {
                zArr[i10] = false;
            }
        }
    }

    private void t() throws IOException {
        e(24, this.f137219n.f137241t);
        m();
        x();
    }

    private void x() throws IOException {
        byte[][] bArr = this.f137219n.f137228g;
        int i10 = 2;
        int i11 = this.f137212g + 2;
        int i12 = 6;
        while (true) {
            i12--;
            if (i12 < 0) {
                break;
            }
            byte[] bArr2 = bArr[i12];
            int i13 = i11;
            while (true) {
                i13--;
                if (i13 >= 0) {
                    bArr2[i13] = 15;
                }
            }
        }
        int i14 = this.f137213h;
        if (i14 >= 200) {
            if (i14 < 600) {
                i10 = 3;
            } else if (i14 < 1200) {
                i10 = 4;
            } else {
                i10 = i14 < 2400 ? 5 : 6;
            }
        }
        z(i10, i11);
        int iA = A(i10, i11);
        C(i10, iA);
        I(i10, i11);
        J();
        K(i10, iA);
        L(i10, i11);
        M();
    }

    private void z(int i10, int i11) {
        a aVar = this.f137219n;
        byte[][] bArr = aVar.f137228g;
        int[] iArr = aVar.f137224c;
        int i12 = this.f137213h;
        int i13 = 0;
        for (int i14 = i10; i14 > 0; i14--) {
            int i15 = i12 / i14;
            int i16 = i13 - 1;
            int i17 = 0;
            while (i17 < i15 && i16 < i11 - 1) {
                i16++;
                i17 += iArr[i16];
            }
            if (i16 > i13 && i14 != i10 && i14 != 1 && (1 & (i10 - i14)) != 0) {
                i17 -= iArr[i16];
                i16--;
            }
            byte[] bArr2 = bArr[i14 - 1];
            int i18 = i11;
            while (true) {
                i18--;
                if (i18 >= 0) {
                    if (i18 < i13 || i18 > i16) {
                        bArr2[i18] = 15;
                    } else {
                        bArr2[i18] = 0;
                    }
                }
            }
            i13 = i16 + 1;
            i12 -= i17;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f137221p;
        if (outputStream != null) {
            k();
            outputStream.close();
        }
    }

    protected void finalize() throws Throwable {
        k();
        super.finalize();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f137221p;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k() throws IOException {
        if (this.f137221p != null) {
            try {
                if (this.f137215j > 0) {
                    O();
                }
                this.f137214i = -1;
                g();
                i();
            } finally {
                this.f137221p = null;
                this.f137219n = null;
                this.f137220o = null;
            }
        }
    }

    public final int n() {
        return this.f137208c;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        if (this.f137221p == null) {
            throw new IOException("closed");
        }
        N(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("offs(" + i10 + ") < 0.");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("len(" + i11 + ") < 0.");
        }
        int i12 = i10 + i11;
        if (i12 <= bArr.length) {
            if (this.f137221p == null) {
                throw new IOException("stream closed");
            }
            while (i10 < i12) {
                N(bArr[i10]);
                i10++;
            }
            return;
        }
        throw new IndexOutOfBoundsException("offs(" + i10 + ") + len(" + i11 + ") > buf.length(" + bArr.length + ").");
    }
}
