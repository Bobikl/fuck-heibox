package di;

import kotlin.e2;
import kotlin.q;
import kotlin.u0;
import org.apache.tools.ant.util.s0;
import sh.f;

/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class d extends c {
    @u0(version = "1.2")
    @f
    private static final double A(double d10) {
        return Math.cos(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double A0(double d10, double d11) {
        return Math.nextAfter(d10, d11);
    }

    @u0(version = "1.2")
    @f
    private static final float B(float f10) {
        return (float) Math.cos(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float B0(float f10, float f11) {
        return Math.nextAfter(f10, f11);
    }

    @u0(version = "1.2")
    @f
    private static final double C(double d10) {
        return Math.cosh(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double C0(double d10) {
        return Math.nextUp(d10);
    }

    @u0(version = "1.2")
    @f
    private static final float D(float f10) {
        return (float) Math.cosh(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float D0(float f10) {
        return Math.nextUp(f10);
    }

    @u0(version = "1.2")
    @f
    private static final double E(double d10) {
        return Math.exp(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double E0(double d10, double d11) {
        return Math.pow(d10, d11);
    }

    @u0(version = "1.2")
    @f
    private static final float F(float f10) {
        return (float) Math.exp(f10);
    }

    @u0(version = "1.2")
    @f
    private static final double F0(double d10, int i10) {
        return Math.pow(d10, i10);
    }

    @u0(version = "1.2")
    @f
    private static final double G(double d10) {
        return Math.expm1(d10);
    }

    @u0(version = "1.2")
    @f
    private static final float G0(float f10, float f11) {
        return (float) Math.pow(f10, f11);
    }

    @u0(version = "1.2")
    @f
    private static final float H(float f10) {
        return (float) Math.expm1(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float H0(float f10, int i10) {
        return (float) Math.pow(f10, i10);
    }

    @u0(version = "1.2")
    @f
    private static final double I(double d10) {
        return Math.floor(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double I0(double d10) {
        return Math.rint(d10);
    }

    @u0(version = "1.2")
    @f
    private static final float J(float f10) {
        return (float) Math.floor(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float J0(float f10) {
        return (float) Math.rint(f10);
    }

    private static final double K(double d10) {
        return Math.abs(d10);
    }

    @u0(version = "1.2")
    public static final int K0(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    private static final float L(float f10) {
        return Math.abs(f10);
    }

    @u0(version = "1.2")
    public static final int L0(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    private static final int M(int i10) {
        return Math.abs(i10);
    }

    @u0(version = "1.2")
    public static final long M0(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    private static final long N(long j10) {
        return Math.abs(j10);
    }

    @u0(version = "1.2")
    public static final long N0(float f10) {
        return M0(f10);
    }

    @u0(version = "1.2")
    @f
    public static /* synthetic */ void O(double d10) {
    }

    @u0(version = "1.2")
    @f
    private static final double O0(double d10) {
        return Math.signum(d10);
    }

    @u0(version = "1.2")
    @f
    public static /* synthetic */ void P(float f10) {
    }

    @u0(version = "1.2")
    @f
    private static final float P0(float f10) {
        return Math.signum(f10);
    }

    @u0(version = "1.2")
    @f
    public static /* synthetic */ void Q(int i10) {
    }

    @u0(version = "1.2")
    @f
    private static final double Q0(double d10) {
        return Math.sin(d10);
    }

    @u0(version = "1.2")
    @f
    public static /* synthetic */ void R(long j10) {
    }

    @u0(version = "1.2")
    @f
    private static final float R0(float f10) {
        return (float) Math.sin(f10);
    }

    private static final double S(double d10) {
        return Math.signum(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double S0(double d10) {
        return Math.sinh(d10);
    }

    private static final float T(float f10) {
        return Math.signum(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float T0(float f10) {
        return (float) Math.sinh(f10);
    }

    public static final int U(int i10) {
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    @u0(version = "1.2")
    @f
    private static final double U0(double d10) {
        return Math.sqrt(d10);
    }

    public static final int V(long j10) {
        if (j10 < 0) {
            return -1;
        }
        return j10 > 0 ? 1 : 0;
    }

    @u0(version = "1.2")
    @f
    private static final float V0(float f10) {
        return (float) Math.sqrt(f10);
    }

    @u0(version = "1.2")
    @f
    public static /* synthetic */ void W(double d10) {
    }

    @u0(version = "1.2")
    @f
    private static final double W0(double d10) {
        return Math.tan(d10);
    }

    @u0(version = "1.2")
    @f
    public static /* synthetic */ void X(float f10) {
    }

    @u0(version = "1.2")
    @f
    private static final float X0(float f10) {
        return (float) Math.tan(f10);
    }

    @u0(version = "1.2")
    public static /* synthetic */ void Y(int i10) {
    }

    @u0(version = "1.2")
    @f
    private static final double Y0(double d10) {
        return Math.tanh(d10);
    }

    @u0(version = "1.2")
    public static /* synthetic */ void Z(long j10) {
    }

    @u0(version = "1.2")
    @f
    private static final float Z0(float f10) {
        return (float) Math.tanh(f10);
    }

    private static final double a0(double d10) {
        return Math.ulp(d10);
    }

    @u0(version = "1.2")
    public static final double a1(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            return d10;
        }
        return d10 > 0.0d ? Math.floor(d10) : Math.ceil(d10);
    }

    private static final float b0(float f10) {
        return Math.ulp(f10);
    }

    @u0(version = "1.2")
    public static final float b1(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            return f10;
        }
        return (float) (f10 > 0.0f ? Math.floor(f10) : Math.ceil(f10));
    }

    @u0(version = "1.2")
    @f
    private static final double c(double d10, double d11) {
        return Math.IEEEremainder(d10, d11);
    }

    @u0(version = "1.2")
    @f
    public static /* synthetic */ void c0(double d10) {
    }

    @u0(version = "1.2")
    @f
    private static final double c1(double d10, double d11) {
        return Math.copySign(d10, d11);
    }

    @u0(version = "1.2")
    @f
    private static final float d(float f10, float f11) {
        return (float) Math.IEEEremainder(f10, f11);
    }

    @u0(version = "1.2")
    @f
    public static /* synthetic */ void d0(float f10) {
    }

    @u0(version = "1.2")
    @f
    private static final double d1(double d10, int i10) {
        return Math.copySign(d10, i10);
    }

    @u0(version = "1.2")
    @f
    private static final double e(double d10) {
        return Math.abs(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double e0(double d10, double d11) {
        return Math.hypot(d10, d11);
    }

    @u0(version = "1.2")
    @f
    private static final float e1(float f10, float f11) {
        return Math.copySign(f10, f11);
    }

    @u0(version = "1.2")
    @f
    private static final float f(float f10) {
        return Math.abs(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float f0(float f10, float f11) {
        return (float) Math.hypot(f10, f11);
    }

    @u0(version = "1.2")
    @f
    private static final float f1(float f10, int i10) {
        return Math.copySign(f10, i10);
    }

    @u0(version = "1.2")
    @f
    private static final int g(int i10) {
        return Math.abs(i10);
    }

    @u0(version = "1.2")
    @f
    private static final double g0(double d10) {
        return Math.log(d10);
    }

    @u0(version = "1.2")
    @f
    private static final long h(long j10) {
        return Math.abs(j10);
    }

    @u0(version = "1.2")
    @f
    private static final float h0(float f10) {
        return (float) Math.log(f10);
    }

    @u0(version = "1.2")
    @f
    private static final double i(double d10) {
        return Math.acos(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double i0(double d10) {
        return Math.log1p(d10);
    }

    @u0(version = "1.2")
    @f
    private static final float j(float f10) {
        return (float) Math.acos(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float j0(float f10) {
        return (float) Math.log1p(f10);
    }

    @u0(version = "1.2")
    public static final double k(double d10) {
        if (d10 < 1.0d) {
            return Double.NaN;
        }
        if (d10 > a.f118522f) {
            return Math.log(d10) + a.f118518b;
        }
        double d11 = 1;
        double d12 = d10 - d11;
        if (d12 >= a.f118521e) {
            return Math.log(d10 + Math.sqrt((d10 * d10) - d11));
        }
        double dSqrt = Math.sqrt(d12);
        if (dSqrt >= a.f118520d) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / ((double) 12);
        }
        return dSqrt * Math.sqrt(2.0d);
    }

    @u0(version = "1.2")
    public static final double k0(double d10, double d11) {
        if (d11 <= 0.0d) {
            return Double.NaN;
        }
        if (d11 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d10) / Math.log(d11);
    }

    @u0(version = "1.2")
    @f
    private static final float l(float f10) {
        return (float) k(f10);
    }

    @u0(version = "1.2")
    public static final float l0(float f10, float f11) {
        if (f11 <= 0.0f) {
            return Float.NaN;
        }
        if (f11 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f10) / Math.log(f11));
    }

    @u0(version = "1.2")
    @f
    private static final double m(double d10) {
        return Math.asin(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double m0(double d10) {
        return Math.log10(d10);
    }

    @u0(version = "1.2")
    @f
    private static final float n(float f10) {
        return (float) Math.asin(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float n0(float f10) {
        return (float) Math.log10(f10);
    }

    @u0(version = "1.2")
    public static final double o(double d10) {
        double d11 = a.f118521e;
        if (d10 < d11) {
            if (d10 <= (-d11)) {
                return -o(-d10);
            }
            return Math.abs(d10) >= a.f118520d ? d10 - (((d10 * d10) * d10) / ((double) 6)) : d10;
        }
        if (d10 <= a.f118523g) {
            return Math.log(d10 + Math.sqrt((d10 * d10) + ((double) 1)));
        }
        if (d10 > a.f118522f) {
            return Math.log(d10) + a.f118518b;
        }
        double d12 = d10 * ((double) 2);
        return Math.log(d12 + (((double) 1) / d12));
    }

    @u0(version = "1.2")
    public static final double o0(double d10) {
        return Math.log(d10) / a.f118518b;
    }

    @u0(version = "1.2")
    @f
    private static final float p(float f10) {
        return (float) o(f10);
    }

    @u0(version = "1.2")
    public static final float p0(float f10) {
        return (float) (Math.log(f10) / a.f118518b);
    }

    @u0(version = "1.2")
    @f
    private static final double q(double d10) {
        return Math.atan(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double q0(double d10, double d11) {
        return Math.max(d10, d11);
    }

    @u0(version = "1.2")
    @f
    private static final float r(float f10) {
        return (float) Math.atan(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float r0(float f10, float f11) {
        return Math.max(f10, f11);
    }

    @u0(version = "1.2")
    @f
    private static final double s(double d10, double d11) {
        return Math.atan2(d10, d11);
    }

    @u0(version = "1.2")
    @f
    private static final int s0(int i10, int i11) {
        return Math.max(i10, i11);
    }

    @u0(version = "1.2")
    @f
    private static final float t(float f10, float f11) {
        return (float) Math.atan2(f10, f11);
    }

    @u0(version = "1.2")
    @f
    private static final long t0(long j10, long j11) {
        return Math.max(j10, j11);
    }

    @u0(version = "1.2")
    public static final double u(double d10) {
        if (Math.abs(d10) < a.f118521e) {
            return Math.abs(d10) > a.f118520d ? d10 + (((d10 * d10) * d10) / ((double) 3)) : d10;
        }
        double d11 = 1;
        return Math.log((d11 + d10) / (d11 - d10)) / ((double) 2);
    }

    @u0(version = "1.2")
    @f
    private static final double u0(double d10, double d11) {
        return Math.min(d10, d11);
    }

    @u0(version = "1.2")
    @f
    private static final float v(float f10) {
        return (float) u(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float v0(float f10, float f11) {
        return Math.min(f10, f11);
    }

    @u0(version = s0.f136934y)
    @e2(markerClass = {q.class})
    @f
    private static final double w(double d10) {
        return Math.cbrt(d10);
    }

    @u0(version = "1.2")
    @f
    private static final int w0(int i10, int i11) {
        return Math.min(i10, i11);
    }

    @u0(version = s0.f136934y)
    @e2(markerClass = {q.class})
    @f
    private static final float x(float f10) {
        return (float) Math.cbrt(f10);
    }

    @u0(version = "1.2")
    @f
    private static final long x0(long j10, long j11) {
        return Math.min(j10, j11);
    }

    @u0(version = "1.2")
    @f
    private static final double y(double d10) {
        return Math.ceil(d10);
    }

    @u0(version = "1.2")
    @f
    private static final double y0(double d10) {
        return Math.nextAfter(d10, Double.NEGATIVE_INFINITY);
    }

    @u0(version = "1.2")
    @f
    private static final float z(float f10) {
        return (float) Math.ceil(f10);
    }

    @u0(version = "1.2")
    @f
    private static final float z0(float f10) {
        return Math.nextAfter(f10, Double.NEGATIVE_INFINITY);
    }
}
