package com.google.android.exoplayer2.audio;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: Sonic.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f44221w = 65;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f44222x = 400;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f44223y = 4000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f44224z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f44225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f44227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f44228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f44229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f44230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f44231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f44232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f44233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f44234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f44235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f44236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f44237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f44238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f44239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f44240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f44241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f44242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f44243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44244t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f44245u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f44246v;

    public r0(int i10, int i11, float f10, float f11, int i12) {
        this.f44225a = i10;
        this.f44226b = i11;
        this.f44227c = f10;
        this.f44228d = f11;
        this.f44229e = i10 / i12;
        this.f44230f = i10 / 400;
        int i13 = i10 / 65;
        this.f44231g = i13;
        int i14 = i13 * 2;
        this.f44232h = i14;
        this.f44233i = new short[i14];
        this.f44234j = new short[i14 * i11];
        this.f44236l = new short[i14 * i11];
        this.f44238n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f44237m == i10) {
            return;
        }
        int i13 = this.f44225a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f44239o;
            if (i15 >= i16 - 1) {
                u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f44240p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f44241q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f44236l = f(this.f44236l, this.f44237m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f44226b;
                    if (i18 < i19) {
                        this.f44236l[(this.f44237m * i19) + i18] = n(this.f44238n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f44241q++;
                this.f44237m++;
            }
            int i20 = i11 + 1;
            this.f44240p = i20;
            if (i20 == i13) {
                this.f44240p = 0;
                com.google.android.exoplayer2.util.a.i(i12 == i14);
                this.f44241q = 0;
            }
            i15++;
        }
    }

    private void b(float f10) {
        int iW;
        int i10 = this.f44235k;
        if (i10 < this.f44232h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f44242r > 0) {
                iW = c(i11);
            } else {
                int iG = g(this.f44234j, i11);
                iW = ((double) f10) > 1.0d ? iG + w(this.f44234j, i11, f10, iG) : m(this.f44234j, i11, f10, iG);
            }
            i11 += iW;
        } while (this.f44232h + i11 <= i10);
        v(i11);
    }

    private int c(int i10) {
        int iMin = Math.min(this.f44232h, this.f44242r);
        d(this.f44234j, i10, iMin);
        this.f44242r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f44236l, this.f44237m, i11);
        this.f44236l = sArrF;
        int i12 = this.f44226b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f44237m * i12, i12 * i11);
        this.f44237m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f44232h / i11;
        int i13 = this.f44226b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f44233i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f44226b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f44225a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f44226b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f44230f, this.f44231g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f44233i, 0, this.f44230f / i12, this.f44231g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f44230f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f44231g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f44226b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f44233i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f44245u, this.f44246v) ? this.f44243s : iH;
        this.f44244t = this.f44245u;
        this.f44243s = iH;
        return i19;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f44226b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i14 * i11) {
                i16 = i11;
                i14 = iAbs;
            }
            if (iAbs * i15 > i17 * i11) {
                i15 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f44245u = i14 / i16;
        this.f44246v = i17 / i15;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f44242r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f44236l, this.f44237m, i13);
        this.f44236l = sArrF;
        int i14 = this.f44226b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f44237m * i14, i14 * i11);
        p(i12, this.f44226b, this.f44236l, this.f44237m + i11, sArr, i10 + i11, sArr, i10);
        this.f44237m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f44226b];
        int i13 = this.f44241q * i11;
        int i14 = this.f44240p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f44237m - i10;
        short[] sArrF = f(this.f44238n, this.f44239o, i11);
        this.f44238n = sArrF;
        short[] sArr = this.f44236l;
        int i12 = this.f44226b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f44239o * i12, i12 * i11);
        this.f44237m = i10;
        this.f44239o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f44243s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f44244t * 3;
    }

    private void r() {
        int i10 = this.f44237m;
        float f10 = this.f44227c;
        float f11 = this.f44228d;
        float f12 = f10 / f11;
        float f13 = this.f44229e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f44234j, 0, this.f44235k);
            this.f44235k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f44238n;
        int i11 = this.f44226b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f44239o - i10) * i11);
        this.f44239o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f44235k - i10;
        short[] sArr = this.f44234j;
        int i12 = this.f44226b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f44235k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f44242r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] sArrF = f(this.f44236l, this.f44237m, i12);
        this.f44236l = sArrF;
        p(i12, this.f44226b, sArrF, this.f44237m, sArr, i10, sArr, i10 + i11);
        this.f44237m += i12;
        return i12;
    }

    public void i() {
        this.f44235k = 0;
        this.f44237m = 0;
        this.f44239o = 0;
        this.f44240p = 0;
        this.f44241q = 0;
        this.f44242r = 0;
        this.f44243s = 0;
        this.f44244t = 0;
        this.f44245u = 0;
        this.f44246v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f44226b, this.f44237m);
        shortBuffer.put(this.f44236l, 0, this.f44226b * iMin);
        int i10 = this.f44237m - iMin;
        this.f44237m = i10;
        short[] sArr = this.f44236l;
        int i11 = this.f44226b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f44237m * this.f44226b * 2;
    }

    public int l() {
        return this.f44235k * this.f44226b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f44235k;
        float f10 = this.f44227c;
        float f11 = this.f44228d;
        int i12 = this.f44237m + ((int) ((((i11 / (f10 / f11)) + this.f44239o) / (this.f44229e * f11)) + 0.5f));
        this.f44234j = f(this.f44234j, i11, (this.f44232h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f44232h;
            int i14 = this.f44226b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f44234j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f44235k += i10 * 2;
        r();
        if (this.f44237m > i12) {
            this.f44237m = i12;
        }
        this.f44235k = 0;
        this.f44242r = 0;
        this.f44239o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f44226b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f44234j, this.f44235k, i11);
        this.f44234j = sArrF;
        shortBuffer.get(sArrF, this.f44235k * this.f44226b, ((i10 * i11) * 2) / 2);
        this.f44235k += i11;
        r();
    }
}
