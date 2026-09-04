package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: compiled from: Oscillator.java */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f17748i = "Oscillator";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f17749j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f17750k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f17751l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f17752m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f17753n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f17754o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f17755p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f17756q = 7;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double[] f17759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f17760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    k f17761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f17762f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float[] f17757a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double[] f17758b = new double[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    double f17763g = 6.283185307179586d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17764h = false;

    public void a(double d10, float f10) {
        int length = this.f17757a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f17758b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f17758b = Arrays.copyOf(this.f17758b, length);
        this.f17757a = Arrays.copyOf(this.f17757a, length);
        this.f17759c = new double[length];
        double[] dArr = this.f17758b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f17758b[iBinarySearch] = d10;
        this.f17757a[iBinarySearch] = f10;
        this.f17764h = false;
    }

    double b(double d10) {
        if (d10 <= 0.0d) {
            d10 = 1.0E-5d;
        } else if (d10 >= 1.0d) {
            d10 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f17758b, d10);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i10 = (-iBinarySearch) - 1;
        float[] fArr = this.f17757a;
        float f10 = fArr[i10];
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        double d11 = f10 - f11;
        double[] dArr = this.f17758b;
        double d12 = dArr[i10];
        double d13 = dArr[i11];
        double d14 = d11 / (d12 - d13);
        return (((double) f11) - (d14 * d13)) + (d10 * d14);
    }

    double c(double d10) {
        if (d10 < 0.0d) {
            d10 = 0.0d;
        } else if (d10 > 1.0d) {
            d10 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f17758b, d10);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i10 = (-iBinarySearch) - 1;
        float[] fArr = this.f17757a;
        float f10 = fArr[i10];
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        double d11 = f10 - f11;
        double[] dArr = this.f17758b;
        double d12 = dArr[i10];
        double d13 = dArr[i11];
        double d14 = d11 / (d12 - d13);
        return this.f17759c[i11] + ((((double) f11) - (d14 * d13)) * (d10 - d13)) + ((d14 * ((d10 * d10) - (d13 * d13))) / 2.0d);
    }

    public double d(double d10, double d11, double d12) {
        double dC = d11 + c(d10);
        double dB = b(d10) + d12;
        switch (this.f17762f) {
            case 1:
                return 0.0d;
            case 2:
                return dB * 4.0d * Math.signum((((dC * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dB * 2.0d;
            case 4:
                return (-dB) * 2.0d;
            case 5:
                double d13 = this.f17763g;
                return (-d13) * dB * Math.sin(d13 * dC);
            case 6:
                return dB * 4.0d * ((((dC * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f17761e.f(dC % 1.0d, 0);
            default:
                double d14 = this.f17763g;
                return dB * d14 * Math.cos(d14 * dC);
        }
    }

    public double e(double d10, double d11) {
        double dAbs;
        double dC = c(d10) + d11;
        switch (this.f17762f) {
            case 1:
                return Math.signum(0.5d - (dC % 1.0d));
            case 2:
                dAbs = Math.abs((((dC * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dC * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dC * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f17763g * (d11 + dC));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dC * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f17761e.c(dC % 1.0d, 0);
            default:
                return Math.sin(this.f17763g * dC);
        }
        return 1.0d - dAbs;
    }

    public void f() {
        int i10 = 0;
        double d10 = 0.0d;
        while (true) {
            float[] fArr = this.f17757a;
            if (i10 >= fArr.length) {
                break;
            }
            d10 += (double) fArr[i10];
            i10++;
        }
        double d11 = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr2 = this.f17757a;
            if (i11 >= fArr2.length) {
                break;
            }
            int i12 = i11 - 1;
            float f10 = (fArr2[i12] + fArr2[i11]) / 2.0f;
            double[] dArr = this.f17758b;
            d11 += (dArr[i11] - dArr[i12]) * ((double) f10);
            i11++;
        }
        int i13 = 0;
        while (true) {
            float[] fArr3 = this.f17757a;
            if (i13 >= fArr3.length) {
                break;
            }
            fArr3[i13] = (float) (((double) fArr3[i13]) * (d10 / d11));
            i13++;
        }
        this.f17759c[0] = 0.0d;
        int i14 = 1;
        while (true) {
            float[] fArr4 = this.f17757a;
            if (i14 >= fArr4.length) {
                this.f17764h = true;
                return;
            }
            int i15 = i14 - 1;
            float f11 = (fArr4[i15] + fArr4[i14]) / 2.0f;
            double[] dArr2 = this.f17758b;
            double d12 = dArr2[i14] - dArr2[i15];
            double[] dArr3 = this.f17759c;
            dArr3[i14] = dArr3[i15] + (d12 * ((double) f11));
            i14++;
        }
    }

    public void g(int i10, String str) {
        this.f17762f = i10;
        this.f17760d = str;
        if (str != null) {
            this.f17761e = k.i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f17758b) + " period=" + Arrays.toString(this.f17757a);
    }
}
