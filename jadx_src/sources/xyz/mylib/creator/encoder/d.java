package xyz.mylib.creator.encoder;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: AnimatedGifEncoder.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f141460x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f141461y = 12;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f141462z = 5003;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f141463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f141464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f141465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f141466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f141467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f141468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f141469g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f141471i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f141478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f141479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f141480r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f141484v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f141470h = 12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f141472j = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int[] f141473k = new int[5003];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int[] f141474l = new int[5003];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f141475m = 5003;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f141476n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f141477o = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f141481s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f141482t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int[] f141483u = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, bb.c.d.f31516s, 4095, 8191, 16383, 32767, 65535};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    byte[] f141485w = new byte[256];

    d(int i10, int i11, byte[] bArr, int i12) {
        this.f141463a = i10;
        this.f141464b = i11;
        this.f141465c = bArr;
        this.f141466d = Math.max(2, i12);
    }

    private int h() {
        int i10 = this.f141467e;
        if (i10 == 0) {
            return -1;
        }
        this.f141467e = i10 - 1;
        byte[] bArr = this.f141465c;
        int i11 = this.f141468f;
        this.f141468f = i11 + 1;
        return bArr[i11] & 255;
    }

    final int a(int i10) {
        return (1 << i10) - 1;
    }

    void b(byte b10, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f141485w;
        int i10 = this.f141484v;
        int i11 = i10 + 1;
        this.f141484v = i11;
        bArr[i10] = b10;
        if (i11 >= 254) {
            g(outputStream);
        }
    }

    void c(OutputStream outputStream) throws IOException {
        d(this.f141475m);
        int i10 = this.f141479q;
        this.f141476n = i10 + 2;
        this.f141477o = true;
        i(i10, outputStream);
    }

    void d(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f141473k[i11] = -1;
        }
    }

    void e(int i10, OutputStream outputStream) throws IOException {
        this.f141478p = i10;
        int i11 = 0;
        this.f141477o = false;
        this.f141469g = i10;
        this.f141471i = a(i10);
        int i12 = 1 << (i10 - 1);
        this.f141479q = i12;
        this.f141480r = i12 + 1;
        this.f141476n = i12 + 2;
        this.f141484v = 0;
        int iH = h();
        for (int i13 = this.f141475m; i13 < 65536; i13 *= 2) {
            i11++;
        }
        int i14 = 8 - i11;
        int i15 = this.f141475m;
        d(i15);
        i(this.f141479q, outputStream);
        while (true) {
            int iH2 = h();
            if (iH2 == -1) {
                i(iH, outputStream);
                i(this.f141480r, outputStream);
                return;
            }
            int i16 = (iH2 << this.f141470h) + iH;
            int i17 = (iH2 << i14) ^ iH;
            int i18 = this.f141473k[i17];
            if (i18 == i16) {
                iH = this.f141474l[i17];
            } else {
                if (i18 >= 0) {
                    int i19 = i15 - i17;
                    if (i17 == 0) {
                        i19 = 1;
                    }
                    while (true) {
                        i17 -= i19;
                        if (i17 < 0) {
                            i17 += i15;
                        }
                        int i20 = this.f141473k[i17];
                        if (i20 == i16) {
                            iH = this.f141474l[i17];
                        } else if (i20 < 0) {
                        }
                    }
                }
                i(iH, outputStream);
                int i21 = this.f141476n;
                if (i21 < this.f141472j) {
                    int[] iArr = this.f141474l;
                    this.f141476n = i21 + 1;
                    iArr[i17] = i21;
                    this.f141473k[i17] = i16;
                } else {
                    c(outputStream);
                }
                iH = iH2;
            }
        }
    }

    void f(OutputStream outputStream) throws IOException {
        outputStream.write(this.f141466d);
        this.f141467e = this.f141463a * this.f141464b;
        this.f141468f = 0;
        e(this.f141466d + 1, outputStream);
        outputStream.write(0);
    }

    void g(OutputStream outputStream) throws IOException {
        int i10 = this.f141484v;
        if (i10 > 0) {
            outputStream.write(i10);
            outputStream.write(this.f141485w, 0, this.f141484v);
            this.f141484v = 0;
        }
    }

    void i(int i10, OutputStream outputStream) throws IOException {
        int i11 = this.f141481s;
        int[] iArr = this.f141483u;
        int i12 = this.f141482t;
        int i13 = i11 & iArr[i12];
        this.f141481s = i13;
        if (i12 > 0) {
            this.f141481s = i13 | (i10 << i12);
        } else {
            this.f141481s = i10;
        }
        this.f141482t = i12 + this.f141469g;
        while (this.f141482t >= 8) {
            b((byte) (this.f141481s & 255), outputStream);
            this.f141481s >>= 8;
            this.f141482t -= 8;
        }
        if (this.f141476n > this.f141471i || this.f141477o) {
            if (this.f141477o) {
                int i14 = this.f141478p;
                this.f141469g = i14;
                this.f141471i = a(i14);
                this.f141477o = false;
            } else {
                int i15 = this.f141469g + 1;
                this.f141469g = i15;
                if (i15 == this.f141470h) {
                    this.f141471i = this.f141472j;
                } else {
                    this.f141471i = a(i15);
                }
            }
        }
        if (i10 == this.f141480r) {
            while (this.f141482t > 0) {
                b((byte) (this.f141481s & 255), outputStream);
                this.f141481s >>= 8;
                this.f141482t -= 8;
            }
            g(outputStream);
        }
    }
}
