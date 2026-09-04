package org.apache.tools.bzip2;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: CBZip2InputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends InputStream implements org.apache.tools.bzip2.a {
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 4;
    private static final int G = 5;
    private static final int H = 6;
    private static final int I = 7;
    private a A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f137158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f137160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f137161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f137162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f137163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f137164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputStream f137165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f137166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f137167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f137168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f137169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f137170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f137171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f137172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f137173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f137174s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f137175t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f137176u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f137177v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f137178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f137179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f137180y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private char f137181z;

    /* JADX INFO: compiled from: CBZip2InputStream.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean[] f137182a = new boolean[256];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f137183b = new byte[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f137184c = new byte[org.apache.tools.bzip2.a.f137133y3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final byte[] f137185d = new byte[org.apache.tools.bzip2.a.f137133y3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int[] f137186e = new int[256];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int[][] f137187f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int[][] f137188g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int[][] f137189h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final int[] f137190i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final int[] f137191j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final char[] f137192k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final char[][] f137193l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final byte[] f137194m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int[] f137195n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        byte[] f137196o;

        a(int i10) {
            Class cls = Integer.TYPE;
            this.f137187f = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.f137188g = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.f137189h = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.f137190i = new int[6];
            this.f137191j = new int[257];
            this.f137192k = new char[256];
            this.f137193l = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
            this.f137194m = new byte[6];
            this.f137196o = new byte[i10 * 100000];
        }

        final int[] a(int i10) {
            int[] iArr = this.f137195n;
            if (iArr != null && iArr.length >= i10) {
                return iArr;
            }
            int[] iArr2 = new int[i10];
            this.f137195n = iArr2;
            return iArr2;
        }
    }

    public c(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public c(InputStream inputStream, boolean z10) throws IOException {
        this.f137163h = new e();
        this.f137167l = -1;
        this.f137168m = 1;
        this.f137165j = inputStream;
        this.f137166k = z10;
        n(true);
        o();
        t();
    }

    private void A() throws IOException {
        if (this.f137177v >= this.f137181z) {
            this.f137176u++;
            this.f137173r = 0;
            x();
        } else {
            int i10 = this.f137174s;
            this.f137167l = i10;
            this.f137163h.e(i10);
            this.f137177v++;
            this.f137168m = 7;
        }
    }

    private void C() throws IOException {
        int i10 = this.f137176u;
        if (i10 > this.f137157b) {
            g();
            o();
            t();
            return;
        }
        this.f137175t = this.f137174s;
        a aVar = this.A;
        byte[] bArr = aVar.f137196o;
        int i11 = this.f137180y;
        int i12 = bArr[i11] & 255;
        this.f137180y = aVar.f137195n[i11];
        int i13 = this.f137178w;
        if (i13 == 0) {
            int[] iArr = org.apache.tools.bzip2.a.A3;
            int i14 = this.f137179x;
            this.f137178w = iArr[i14] - 1;
            int i15 = i14 + 1;
            this.f137179x = i15;
            if (i15 == 512) {
                this.f137179x = 0;
            }
        } else {
            this.f137178w = i13 - 1;
        }
        int i16 = i12 ^ (this.f137178w == 1 ? 1 : 0);
        this.f137174s = i16;
        this.f137176u = i10 + 1;
        this.f137167l = i16;
        this.f137168m = 3;
        this.f137163h.e(i16);
    }

    private void I() throws IOException {
        if (this.f137174s != this.f137175t) {
            this.f137168m = 2;
            this.f137173r = 1;
            C();
            return;
        }
        int i10 = this.f137173r + 1;
        this.f137173r = i10;
        if (i10 < 4) {
            this.f137168m = 2;
            C();
            return;
        }
        a aVar = this.A;
        byte[] bArr = aVar.f137196o;
        int i11 = this.f137180y;
        char c10 = (char) (bArr[i11] & 255);
        this.f137181z = c10;
        this.f137180y = aVar.f137195n[i11];
        int i12 = this.f137178w;
        if (i12 == 0) {
            int[] iArr = org.apache.tools.bzip2.a.A3;
            int i13 = this.f137179x;
            this.f137178w = iArr[i13] - 1;
            int i14 = i13 + 1;
            this.f137179x = i14;
            if (i14 == 512) {
                this.f137179x = 0;
            }
        } else {
            this.f137178w = i12 - 1;
        }
        this.f137177v = 0;
        this.f137168m = 4;
        if (this.f137178w == 1) {
            this.f137181z = (char) (c10 ^ 1);
        }
        J();
    }

    private void J() throws IOException {
        if (this.f137177v < this.f137181z) {
            int i10 = this.f137174s;
            this.f137167l = i10;
            this.f137163h.e(i10);
            this.f137177v++;
            return;
        }
        this.f137168m = 2;
        this.f137176u++;
        this.f137173r = 0;
        C();
    }

    private boolean a() throws IOException {
        int i10 = this.f137162g;
        int i11 = this.f137161f;
        if (i10 < 1) {
            int i12 = this.f137165j.read();
            if (i12 < 0) {
                throw new IOException("unexpected end of stream");
            }
            i11 = (i11 << 8) | i12;
            i10 += 8;
            this.f137161f = i11;
        }
        int i13 = i10 - 1;
        this.f137162g = i13;
        return ((i11 >> i13) & 1) != 0;
    }

    private int b() throws IOException {
        return d(8) | (((((d(8) << 8) | d(8)) << 8) | d(8)) << 8);
    }

    private char c() throws IOException {
        return (char) d(8);
    }

    private int d(int i10) throws IOException {
        int i11 = this.f137162g;
        int i12 = this.f137161f;
        if (i11 < i10) {
            InputStream inputStream = this.f137165j;
            do {
                int i13 = inputStream.read();
                if (i13 < 0) {
                    throw new IOException("unexpected end of stream");
                }
                i12 = (i12 << 8) | i13;
                i11 += 8;
            } while (i11 < i10);
            this.f137161f = i12;
        }
        int i14 = i11 - i10;
        this.f137162g = i14;
        return ((1 << i10) - 1) & (i12 >> i14);
    }

    private boolean e() throws IOException {
        int iB = b();
        this.f137170o = iB;
        this.f137168m = 0;
        this.A = null;
        if (iB != this.f137172q) {
            s();
        }
        return (this.f137166k && n(false)) ? false : true;
    }

    private void f(int i10, int i11) {
        a aVar = this.A;
        char[][] cArr = aVar.f137193l;
        int[] iArr = aVar.f137190i;
        int[][] iArr2 = aVar.f137187f;
        int[][] iArr3 = aVar.f137188g;
        int[][] iArr4 = aVar.f137189h;
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = ' ';
            char[] cArr2 = cArr[i12];
            int i13 = i10;
            char c11 = 0;
            while (true) {
                i13--;
                if (i13 >= 0) {
                    char c12 = cArr2[i13];
                    if (c12 > c11) {
                        c11 = c12;
                    }
                    if (c12 < c10) {
                        c10 = c12;
                    }
                }
            }
            m(iArr2[i12], iArr3[i12], iArr4[i12], cArr[i12], c10, c11, i10);
            iArr[i12] = c10;
        }
    }

    private void g() {
        int iA = this.f137163h.a();
        this.f137171p = iA;
        int i10 = this.f137169n;
        if (i10 != iA) {
            int i11 = this.f137170o;
            this.f137172q = ((i11 >>> 31) | (i11 << 1)) ^ i10;
            s();
        }
        int i12 = this.f137172q;
        this.f137172q = ((i12 >>> 31) | (i12 << 1)) ^ this.f137171p;
    }

    private void i() throws IOException {
        int i10;
        char c10;
        int i11;
        this = this;
        this.f137158c = this.d(24);
        r();
        InputStream inputStream = this.f137165j;
        a aVar = this.A;
        byte[] bArr = aVar.f137196o;
        int[] iArr = aVar.f137186e;
        byte[] bArr2 = aVar.f137184c;
        byte[] bArr3 = aVar.f137183b;
        char[] cArr = aVar.f137192k;
        int[] iArr2 = aVar.f137190i;
        int[][] iArr3 = aVar.f137187f;
        int[][] iArr4 = aVar.f137188g;
        int[][] iArr5 = aVar.f137189h;
        int i12 = this.f137159d * 100000;
        int i13 = 256;
        while (true) {
            i13--;
            if (i13 < 0) {
                break;
            }
            cArr[i13] = (char) i13;
            iArr[i13] = 0;
        }
        int i14 = this.f137164i + 1;
        int iK = this.k(0);
        int i15 = this.f137161f;
        int i16 = this.f137162g;
        int i17 = bArr2[0] & 255;
        int[] iArr6 = iArr4[i17];
        int[] iArr7 = iArr3[i17];
        int[] iArr8 = iArr5[i17];
        int i18 = 0;
        int i19 = i16;
        int i20 = iK;
        int i21 = 49;
        int i22 = -1;
        int i23 = iArr2[i17];
        int i24 = i15;
        while (i20 != i14) {
            i14 = i14;
            int i25 = i24;
            if (i20 == 0 || i20 == 1) {
                byte[] bArr4 = bArr3;
                int i26 = i12;
                int i27 = 1;
                int i28 = -1;
                while (true) {
                    if (i20 == 0) {
                        i28 += i27;
                    } else {
                        if (i20 != 1) {
                            int[][] iArr9 = iArr5;
                            byte[] bArr5 = bArr2;
                            byte b10 = bArr4[cArr[0]];
                            int i29 = b10 & 255;
                            iArr[i29] = iArr[i29] + i28 + 1;
                            while (true) {
                                int i30 = i28 - 1;
                                if (i28 < 0) {
                                    break;
                                }
                                i22++;
                                bArr[i22] = b10;
                                i28 = i30;
                            }
                            i12 = i26;
                            if (i22 >= i12) {
                                throw new IOException("block overrun");
                            }
                            i24 = i25;
                            bArr3 = bArr4;
                            iArr5 = iArr9;
                            bArr2 = bArr5;
                            break;
                        }
                        i28 += i27 << 1;
                    }
                    if (i21 == 0) {
                        i18++;
                        int i31 = bArr2[i18] & 255;
                        iArr6 = iArr4[i31];
                        iArr7 = iArr3[i31];
                        iArr8 = iArr5[i31];
                        i10 = iArr2[i31];
                        i21 = 49;
                    } else {
                        i21--;
                        i10 = i23;
                    }
                    int i32 = i19;
                    while (i32 < i10) {
                        int i33 = inputStream.read();
                        if (i33 < 0) {
                            throw new IOException("unexpected end of stream");
                        }
                        i25 = (i25 << 8) | i33;
                        i32 += 8;
                    }
                    int i34 = i32 - i10;
                    int[][] iArr10 = iArr5;
                    i19 = i34;
                    int i35 = (i25 >> i34) & ((1 << i10) - 1);
                    int i36 = i10;
                    while (i35 > iArr7[i36]) {
                        int i37 = i36 + 1;
                        byte[] bArr6 = bArr2;
                        int i38 = i19;
                        while (i38 < 1) {
                            int i39 = inputStream.read();
                            if (i39 < 0) {
                                throw new IOException("unexpected end of stream");
                            }
                            i25 = (i25 << 8) | i39;
                            i38 += 8;
                        }
                        i19 = i38 - 1;
                        i35 = (i35 << 1) | ((i25 >> i19) & 1);
                        i36 = i37;
                        bArr2 = bArr6;
                    }
                    i20 = iArr8[i35 - iArr6[i36]];
                    i27 <<= 1;
                    i23 = i10;
                    iArr5 = iArr10;
                }
            } else {
                i22++;
                if (i22 >= i12) {
                    throw new IOException("block overrun");
                }
                int i40 = i20 - 1;
                char c11 = cArr[i40];
                int i41 = i12;
                byte b11 = bArr3[c11];
                byte[] bArr7 = bArr3;
                int i42 = b11 & 255;
                iArr[i42] = iArr[i42] + 1;
                bArr[i22] = b11;
                if (i20 <= 16) {
                    while (i40 > 0) {
                        int i43 = i40 - 1;
                        cArr[i40] = cArr[i43];
                        i40 = i43;
                    }
                    c10 = 0;
                } else {
                    c10 = 0;
                    System.arraycopy(cArr, 0, cArr, 1, i40);
                }
                cArr[c10] = c11;
                if (i21 == 0) {
                    i18++;
                    int i44 = bArr2[i18] & 255;
                    int[] iArr11 = iArr4[i44];
                    int[] iArr12 = iArr3[i44];
                    int[] iArr13 = iArr5[i44];
                    i11 = iArr2[i44];
                    iArr6 = iArr11;
                    iArr7 = iArr12;
                    iArr8 = iArr13;
                    i21 = 49;
                } else {
                    i21--;
                    i11 = i23;
                }
                int i45 = i19;
                while (i45 < i11) {
                    int i46 = inputStream.read();
                    if (i46 < 0) {
                        throw new IOException("unexpected end of stream");
                    }
                    i25 = (i25 << 8) | i46;
                    i45 += 8;
                }
                int i47 = i45 - i11;
                int i48 = 1;
                int i49 = (i25 >> i47) & ((1 << i11) - 1);
                i19 = i47;
                int i50 = i11;
                while (i49 > iArr7[i50]) {
                    i50++;
                    int i51 = i19;
                    while (i51 < i48) {
                        int i52 = inputStream.read();
                        if (i52 < 0) {
                            throw new IOException("unexpected end of stream");
                        }
                        i25 = (i25 << 8) | i52;
                        i51 += 8;
                        i48 = 1;
                    }
                    i19 = i51 - 1;
                    i49 = (i49 << 1) | ((i25 >> i19) & 1);
                    i48 = 1;
                }
                i20 = iArr8[i49 - iArr6[i50]];
                i23 = i11;
                i24 = i25;
                i12 = i41;
                bArr3 = bArr7;
            }
        }
        this.f137157b = i22;
        this.f137162g = i19;
        this.f137161f = i24;
    }

    private int k(int i10) throws IOException {
        InputStream inputStream = this.f137165j;
        a aVar = this.A;
        int i11 = aVar.f137184c[i10] & 255;
        int[] iArr = aVar.f137187f[i11];
        int i12 = aVar.f137190i[i11];
        int iD = d(i12);
        int i13 = this.f137162g;
        int i14 = this.f137161f;
        while (iD > iArr[i12]) {
            i12++;
            while (i13 < 1) {
                int i15 = inputStream.read();
                if (i15 < 0) {
                    throw new IOException("unexpected end of stream");
                }
                i14 = (i14 << 8) | i15;
                i13 += 8;
            }
            i13--;
            iD = (iD << 1) | (1 & (i14 >> i13));
        }
        this.f137162g = i13;
        this.f137161f = i14;
        return aVar.f137189h[i11][iD - aVar.f137188g[i11][i12]];
    }

    private static void m(int[] iArr, int[] iArr2, int[] iArr3, char[] cArr, int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        for (int i15 = i10; i15 <= i11; i15++) {
            for (int i16 = 0; i16 < i12; i16++) {
                if (cArr[i16] == i15) {
                    iArr3[i14] = i16;
                    i14++;
                }
            }
        }
        int i17 = 23;
        while (true) {
            i17--;
            if (i17 <= 0) {
                break;
            }
            iArr2[i17] = 0;
            iArr[i17] = 0;
        }
        for (int i18 = 0; i18 < i12; i18++) {
            int i19 = cArr[i18] + 1;
            iArr2[i19] = iArr2[i19] + 1;
        }
        int i20 = iArr2[0];
        for (int i21 = 1; i21 < 23; i21++) {
            i20 += iArr2[i21];
            iArr2[i21] = i20;
        }
        int i22 = iArr2[i10];
        int i23 = i10;
        while (i23 <= i11) {
            int i24 = i23 + 1;
            int i25 = iArr2[i24];
            int i26 = i13 + (i25 - i22);
            iArr[i23] = i26 - 1;
            i13 = i26 << 1;
            i23 = i24;
            i22 = i25;
        }
        for (int i27 = i10 + 1; i27 <= i11; i27++) {
            iArr2[i27] = ((iArr[i27 - 1] + 1) << 1) - iArr2[i27];
        }
    }

    private boolean n(boolean z10) throws IOException {
        InputStream inputStream = this.f137165j;
        if (inputStream == null) {
            throw new IOException("No InputStream");
        }
        if (!z10) {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            int i11 = this.f137165j.read();
            if (i10 != 66 || i11 != 90) {
                throw new IOException("Garbage after a valid BZip2 stream");
            }
        } else if (inputStream.available() == 0) {
            throw new IOException("Empty InputStream");
        }
        if (this.f137165j.read() != 104) {
            throw new IOException(z10 ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream");
        }
        int i12 = this.f137165j.read();
        if (i12 < 49 || i12 > 57) {
            throw new IOException("Stream is not BZip2 formatted: illegal blocksize " + ((char) i12));
        }
        this.f137159d = i12 - 48;
        this.f137162g = 0;
        this.f137172q = 0;
        return true;
    }

    private void o() throws IOException {
        do {
            char c10 = c();
            char c11 = c();
            char c12 = c();
            char c13 = c();
            char c14 = c();
            char c15 = c();
            if (c10 != 23 || c11 != 'r' || c12 != 'E' || c13 != '8' || c14 != 'P' || c15 != 144) {
                if (c10 != '1' || c11 != 'A' || c12 != 'Y' || c13 != '&' || c14 != 'S' || c15 != 'Y') {
                    this.f137168m = 0;
                    throw new IOException("bad block header");
                }
                this.f137169n = b();
                this.f137160e = d(1) == 1;
                if (this.A == null) {
                    this.A = new a(this.f137159d);
                }
                i();
                this.f137163h.c();
                this.f137168m = 1;
                return;
            }
        } while (!e());
    }

    private void p() {
        a aVar = this.A;
        boolean[] zArr = aVar.f137182a;
        byte[] bArr = aVar.f137183b;
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (zArr[i11]) {
                bArr[i10] = (byte) i11;
                i10++;
            }
        }
        this.f137164i = i10;
    }

    private int q() throws IOException {
        int i10 = this.f137167l;
        switch (this.f137168m) {
            case 0:
                return -1;
            case 1:
                throw new IllegalStateException();
            case 2:
                throw new IllegalStateException();
            case 3:
                I();
                return i10;
            case 4:
                J();
                return i10;
            case 5:
                throw new IllegalStateException();
            case 6:
                z();
                return i10;
            case 7:
                A();
                return i10;
            default:
                throw new IllegalStateException();
        }
    }

    private void r() throws IOException {
        a aVar = this.A;
        boolean[] zArr = aVar.f137182a;
        byte[] bArr = aVar.f137194m;
        byte[] bArr2 = aVar.f137184c;
        byte[] bArr3 = aVar.f137185d;
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            if (a()) {
                i10 |= 1 << i11;
            }
        }
        int i12 = 256;
        while (true) {
            i12--;
            if (i12 < 0) {
                break;
            } else {
                zArr[i12] = false;
            }
        }
        for (int i13 = 0; i13 < 16; i13++) {
            if (((1 << i13) & i10) != 0) {
                int i14 = i13 << 4;
                for (int i15 = 0; i15 < 16; i15++) {
                    if (a()) {
                        zArr[i14 + i15] = true;
                    }
                }
            }
        }
        p();
        int i16 = this.f137164i + 2;
        int iD = d(3);
        int iD2 = d(15);
        for (int i17 = 0; i17 < iD2; i17++) {
            int i18 = 0;
            while (a()) {
                i18++;
            }
            bArr3[i17] = (byte) i18;
        }
        int i19 = iD;
        while (true) {
            i19--;
            if (i19 < 0) {
                break;
            } else {
                bArr[i19] = (byte) i19;
            }
        }
        for (int i20 = 0; i20 < iD2; i20++) {
            int i21 = bArr3[i20] & 255;
            byte b10 = bArr[i21];
            while (i21 > 0) {
                bArr[i21] = bArr[i21 - 1];
                i21--;
            }
            bArr[0] = b10;
            bArr2[i20] = b10;
        }
        char[][] cArr = aVar.f137193l;
        for (int i22 = 0; i22 < iD; i22++) {
            int iD3 = d(5);
            char[] cArr2 = cArr[i22];
            for (int i23 = 0; i23 < i16; i23++) {
                while (a()) {
                    iD3 += a() ? -1 : 1;
                }
                cArr2[i23] = (char) iD3;
            }
        }
        f(i16, iD);
    }

    private static void s() {
        System.err.println("BZip2 CRC error");
    }

    private void t() throws IOException {
        a aVar = this.A;
        if (aVar == null) {
            return;
        }
        int[] iArr = aVar.f137191j;
        int[] iArrA = aVar.a(this.f137157b + 1);
        a aVar2 = this.A;
        byte[] bArr = aVar2.f137196o;
        iArr[0] = 0;
        System.arraycopy(aVar2.f137186e, 0, iArr, 1, 256);
        int i10 = iArr[0];
        for (int i11 = 1; i11 <= 256; i11++) {
            i10 += iArr[i11];
            iArr[i11] = i10;
        }
        int i12 = this.f137157b;
        for (int i13 = 0; i13 <= i12; i13++) {
            int i14 = bArr[i13] & 255;
            int i15 = iArr[i14];
            iArr[i14] = i15 + 1;
            iArrA[i15] = i13;
        }
        int i16 = this.f137158c;
        if (i16 < 0 || i16 >= iArrA.length) {
            throw new IOException("stream corrupted");
        }
        this.f137180y = iArrA[i16];
        this.f137173r = 0;
        this.f137176u = 0;
        this.f137174s = 256;
        if (!this.f137160e) {
            x();
            return;
        }
        this.f137178w = 0;
        this.f137179x = 0;
        C();
    }

    private void x() throws IOException {
        int i10 = this.f137176u;
        if (i10 > this.f137157b) {
            this.f137168m = 5;
            g();
            o();
            t();
            return;
        }
        this.f137175t = this.f137174s;
        a aVar = this.A;
        byte[] bArr = aVar.f137196o;
        int i11 = this.f137180y;
        int i12 = bArr[i11] & 255;
        this.f137174s = i12;
        this.f137180y = aVar.f137195n[i11];
        this.f137176u = i10 + 1;
        this.f137167l = i12;
        this.f137168m = 6;
        this.f137163h.e(i12);
    }

    private void z() throws IOException {
        if (this.f137174s != this.f137175t) {
            this.f137173r = 1;
            x();
            return;
        }
        int i10 = this.f137173r + 1;
        this.f137173r = i10;
        if (i10 < 4) {
            x();
            return;
        }
        a aVar = this.A;
        byte[] bArr = aVar.f137196o;
        int i11 = this.f137180y;
        this.f137181z = (char) (bArr[i11] & 255);
        this.f137180y = aVar.f137195n[i11];
        this.f137177v = 0;
        A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f137165j;
        if (inputStream != null) {
            try {
                if (inputStream != System.in) {
                    inputStream.close();
                }
            } finally {
                this.A = null;
                this.f137165j = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f137165j != null) {
            return q();
        }
        throw new IOException("stream closed");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("offs(" + i10 + ") < 0.");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("len(" + i11 + ") < 0.");
        }
        int i12 = i10 + i11;
        if (i12 > bArr.length) {
            throw new IndexOutOfBoundsException("offs(" + i10 + ") + len(" + i11 + ") > dest.length(" + bArr.length + ").");
        }
        if (this.f137165j == null) {
            throw new IOException("stream closed");
        }
        int i13 = i10;
        while (i13 < i12) {
            int iQ = q();
            if (iQ < 0) {
                break;
            }
            bArr[i13] = (byte) iQ;
            i13++;
        }
        if (i13 == i10) {
            return -1;
        }
        return i13 - i10;
    }
}
