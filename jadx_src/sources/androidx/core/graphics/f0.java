package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.j1;
import java.util.Objects;

/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f20713a = 95.047d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f20714b = 100.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f20715c = 108.883d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double f20716d = 0.008856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double f20717e = 903.3d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f20718f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f20719g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<double[]> f20720h = new ThreadLocal<>();

    /* JADX INFO: compiled from: ColorUtils.java */
    @androidx.annotation.w0(26)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static Color a(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float fAlpha = color.alpha();
            float fAlpha2 = color2.alpha() * (1.0f - fAlpha);
            int componentCount = color2.getComponentCount() - 1;
            float f10 = fAlpha + fAlpha2;
            components2[componentCount] = f10;
            if (f10 > 0.0f) {
                fAlpha /= f10;
                fAlpha2 /= f10;
            }
            for (int i10 = 0; i10 < componentCount; i10++) {
                components2[i10] = (components[i10] * fAlpha) + (components2[i10] * fAlpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    private f0() {
    }

    private static double A(double d10) {
        return d10 > f20716d ? Math.pow(d10, 0.3333333333333333d) : ((d10 * f20717e) + 16.0d) / 116.0d;
    }

    @androidx.annotation.l
    public static int B(@androidx.annotation.l int i10, @androidx.annotation.f0(from = 0, to = 255) int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    @androidx.annotation.l
    public static int a(@androidx.annotation.n0 float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fAbs = (1.0f - Math.abs((f12 * 2.0f) - 1.0f)) * f11;
        float f13 = f12 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f10 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f10) / 60) {
            case 0:
                iRound = Math.round((fAbs + f13) * 255.0f);
                iRound2 = Math.round((fAbs2 + f13) * 255.0f);
                iRound3 = Math.round(f13 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f13) * 255.0f);
                iRound2 = Math.round((fAbs + f13) * 255.0f);
                iRound3 = Math.round(f13 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f13 * 255.0f);
                iRound2 = Math.round((fAbs + f13) * 255.0f);
                iRound3 = Math.round((fAbs2 + f13) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f13 * 255.0f);
                iRound2 = Math.round((fAbs2 + f13) * 255.0f);
                iRound3 = Math.round((fAbs + f13) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f13) * 255.0f);
                iRound2 = Math.round(f13 * 255.0f);
                iRound3 = Math.round((fAbs + f13) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f13) * 255.0f);
                iRound2 = Math.round(f13 * 255.0f);
                iRound3 = Math.round((fAbs2 + f13) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(x(iRound, 0, 255), x(iRound2, 0, 255), x(iRound3, 0, 255));
    }

    @androidx.annotation.l
    public static int b(@androidx.annotation.x(from = 0.0d, to = 100.0d) double d10, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d11, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d12) {
        double[] dArrZ = z();
        c(d10, d11, d12, dArrZ);
        return g(dArrZ[0], dArrZ[1], dArrZ[2]);
    }

    public static void c(@androidx.annotation.x(from = 0.0d, to = 100.0d) double d10, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d11, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d12, @androidx.annotation.n0 double[] dArr) {
        double d13 = (d10 + 16.0d) / 116.0d;
        double d14 = (d11 / 500.0d) + d13;
        double d15 = d13 - (d12 / 200.0d);
        double dPow = Math.pow(d14, 3.0d);
        if (dPow <= f20716d) {
            dPow = ((d14 * 116.0d) - 16.0d) / f20717e;
        }
        double dPow2 = d10 > 7.9996247999999985d ? Math.pow(d13, 3.0d) : d10 / f20717e;
        double dPow3 = Math.pow(d15, 3.0d);
        if (dPow3 <= f20716d) {
            dPow3 = ((d15 * 116.0d) - 16.0d) / f20717e;
        }
        dArr[0] = dPow * f20713a;
        dArr[1] = dPow2 * 100.0d;
        dArr[2] = dPow3 * f20715c;
    }

    public static void d(@androidx.annotation.f0(from = 0, to = 255) int i10, @androidx.annotation.f0(from = 0, to = 255) int i11, @androidx.annotation.f0(from = 0, to = 255) int i12, @androidx.annotation.n0 float[] fArr) {
        float f10;
        float fAbs;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float f13 = i12 / 255.0f;
        float fMax = Math.max(f11, Math.max(f12, f13));
        float fMin = Math.min(f11, Math.min(f12, f13));
        float f14 = fMax - fMin;
        float f15 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f10 = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f11) {
                f10 = ((f12 - f13) / f14) % 6.0f;
            } else {
                f10 = fMax == f12 ? ((f13 - f11) / f14) + 2.0f : 4.0f + ((f11 - f12) / f14);
            }
            fAbs = f14 / (1.0f - Math.abs((2.0f * f15) - 1.0f));
        }
        float f16 = (f10 * 60.0f) % 360.0f;
        if (f16 < 0.0f) {
            f16 += 360.0f;
        }
        fArr[0] = w(f16, 0.0f, 360.0f);
        fArr[1] = w(fAbs, 0.0f, 1.0f);
        fArr[2] = w(f15, 0.0f, 1.0f);
    }

    public static void e(@androidx.annotation.f0(from = 0, to = 255) int i10, @androidx.annotation.f0(from = 0, to = 255) int i11, @androidx.annotation.f0(from = 0, to = 255) int i12, @androidx.annotation.n0 double[] dArr) {
        f(i10, i11, i12, dArr);
        h(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void f(@androidx.annotation.f0(from = 0, to = 255) int i10, @androidx.annotation.f0(from = 0, to = 255) int i11, @androidx.annotation.f0(from = 0, to = 255) int i12, @androidx.annotation.n0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = ((double) i10) / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) i11) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) i12) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    @androidx.annotation.l
    public static int g(@androidx.annotation.x(from = 0.0d, to = f20713a) double d10, @androidx.annotation.x(from = 0.0d, to = 100.0d) double d11, @androidx.annotation.x(from = 0.0d, to = f20715c) double d12) {
        double d13 = (((3.2406d * d10) + ((-1.5372d) * d11)) + ((-0.4986d) * d12)) / 100.0d;
        double d14 = ((((-0.9689d) * d10) + (1.8758d * d11)) + (0.0415d * d12)) / 100.0d;
        double d15 = (((0.0557d * d10) + ((-0.204d) * d11)) + (1.057d * d12)) / 100.0d;
        return Color.rgb(x((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d), 0, 255));
    }

    public static void h(@androidx.annotation.x(from = 0.0d, to = f20713a) double d10, @androidx.annotation.x(from = 0.0d, to = 100.0d) double d11, @androidx.annotation.x(from = 0.0d, to = f20715c) double d12, @androidx.annotation.n0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dA = A(d10 / f20713a);
        double dA2 = A(d11 / 100.0d);
        double dA3 = A(d12 / f20715c);
        dArr[0] = Math.max(0.0d, (116.0d * dA2) - 16.0d);
        dArr[1] = (dA - dA2) * 500.0d;
        dArr[2] = (dA2 - dA3) * 200.0d;
    }

    @androidx.annotation.l
    public static int i(@androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public static void j(@androidx.annotation.n0 float[] fArr, @androidx.annotation.n0 float[] fArr2, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @androidx.annotation.n0 float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f11 = 1.0f - f10;
        fArr3[0] = o(fArr[0], fArr2[0], f10);
        fArr3[1] = (fArr[1] * f11) + (fArr2[1] * f10);
        fArr3[2] = (fArr[2] * f11) + (fArr2[2] * f10);
    }

    public static void k(@androidx.annotation.n0 double[] dArr, @androidx.annotation.n0 double[] dArr2, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) double d10, @androidx.annotation.n0 double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d11 = 1.0d - d10;
        dArr3[0] = (dArr[0] * d11) + (dArr2[0] * d10);
        dArr3[1] = (dArr[1] * d11) + (dArr2[1] * d10);
        dArr3[2] = (dArr[2] * d11) + (dArr2[2] * d10);
    }

    public static double l(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        if (Color.alpha(i10) < 255) {
            i10 = t(i10, i11);
        }
        double dM = m(i10) + 0.05d;
        double dM2 = m(i11) + 0.05d;
        return Math.max(dM, dM2) / Math.min(dM, dM2);
    }

    @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public static double m(@androidx.annotation.l int i10) {
        double[] dArrZ = z();
        r(i10, dArrZ);
        return dArrZ[1] / 100.0d;
    }

    public static int n(@androidx.annotation.l int i10, @androidx.annotation.l int i11, float f10) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        double d10 = f10;
        if (l(B(i10, 255), i11) < d10) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (l(B(i10, i15), i11) < d10) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    @j1
    static float o(float f10, float f11, float f12) {
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > f10) {
                f10 += 360.0f;
            } else {
                f11 += 360.0f;
            }
        }
        return (f10 + ((f11 - f10) * f12)) % 360.0f;
    }

    public static void p(@androidx.annotation.l int i10, @androidx.annotation.n0 float[] fArr) {
        d(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    public static void q(@androidx.annotation.l int i10, @androidx.annotation.n0 double[] dArr) {
        e(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static void r(@androidx.annotation.l int i10, @androidx.annotation.n0 double[] dArr) {
        f(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    private static int s(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    public static int t(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int iS = s(iAlpha2, iAlpha);
        return Color.argb(iS, v(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, iS), v(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, iS), v(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, iS));
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(26)
    public static Color u(@androidx.annotation.n0 Color color, @androidx.annotation.n0 Color color2) {
        return a.a(color, color2);
    }

    private static int v(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    private static float w(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : Math.min(f10, f12);
    }

    private static int x(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : Math.min(i10, i12);
    }

    public static double y(@androidx.annotation.n0 double[] dArr, @androidx.annotation.n0 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    private static double[] z() {
        ThreadLocal<double[]> threadLocal = f20720h;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }
}
