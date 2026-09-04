package androidx.core.content.res;

import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.graphics.f0;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: CamColor.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f20540j = 0.2f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f20541k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f20542l = 0.4f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f20543m = 0.01f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f20544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f20545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f20546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f20547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f20548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f20549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f20550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f20551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f20552i;

    a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f20544a = f10;
        this.f20545b = f11;
        this.f20546c = f12;
        this.f20547d = f13;
        this.f20548e = f14;
        this.f20549f = f15;
        this.f20550g = f16;
        this.f20551h = f17;
        this.f20552i = f18;
    }

    @p0
    private static a b(@x(from = 0.0d, to = 360.0d) float f10, @x(from = 0.0d, to = v.f124981d, toInclusive = false) float f11, @x(from = 0.0d, to = 100.0d) float f12) {
        float f13 = 1000.0f;
        float f14 = 0.0f;
        a aVar = null;
        float f15 = 100.0f;
        float f16 = 1000.0f;
        while (Math.abs(f14 - f15) > 0.01f) {
            float f17 = ((f15 - f14) / 2.0f) + f14;
            int iS = e(f17, f11, f10).s();
            float fB = b.b(iS);
            float fAbs = Math.abs(f12 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iS);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f10));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f13 = fAbs;
                    f16 = fA;
                }
            }
            if (f13 == 0.0f && f16 == 0.0f) {
                break;
            }
            if (fB < f12) {
                f14 = f17;
            } else {
                f15 = f17;
            }
        }
        return aVar;
    }

    @n0
    static a c(@androidx.annotation.l int i10) {
        return d(i10, r.f20603k);
    }

    @n0
    static a d(@androidx.annotation.l int i10, @n0 r rVar) {
        float[] fArrF = b.f(i10);
        float[][] fArr = b.f20553a;
        float f10 = fArrF[0];
        float[] fArr2 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArrF[1];
        float f13 = f11 + (fArr2[1] * f12);
        float f14 = fArrF[2];
        float f15 = f13 + (fArr2[2] * f14);
        float[] fArr3 = fArr[1];
        float f16 = (fArr3[0] * f10) + (fArr3[1] * f12) + (fArr3[2] * f14);
        float[] fArr4 = fArr[2];
        float f17 = (f10 * fArr4[0]) + (f12 * fArr4[1]) + (f14 * fArr4[2]);
        float f18 = rVar.i()[0] * f15;
        float f19 = rVar.i()[1] * f16;
        float f20 = rVar.i()[2] * f17;
        float fPow = (float) Math.pow(((double) (rVar.c() * Math.abs(f18))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (rVar.c() * Math.abs(f19))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (rVar.c() * Math.abs(f20))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f21 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d10)) / 11.0f;
        float f22 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = (((fSignum * 20.0f) + f23) + (21.0f * fSignum3)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = fAtan2;
        float f27 = (3.1415927f * f26) / 180.0f;
        float fPow4 = ((float) Math.pow((f25 * rVar.f()) / rVar.a(), rVar.b() * rVar.j())) * 100.0f;
        float fD = rVar.d() * (4.0f / rVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (rVar.a() + 4.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, rVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f26) < 20.14d ? 360.0f + f26 : f26)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rVar.g()) * rVar.h()) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fD2 = fSqrt * rVar.d();
        float fSqrt2 = ((float) Math.sqrt((fPow5 * rVar.b()) / (rVar.a() + 4.0f))) * 50.0f;
        float f28 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD2) + 1.0f)) * 43.85965f;
        double d11 = f27;
        return new a(f26, fSqrt, fPow4, fD, fD2, fSqrt2, f28, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    @n0
    private static a e(@x(from = 0.0d, to = 100.0d) float f10, @x(from = 0.0d, to = v.f124981d, toInclusive = false) float f11, @x(from = 0.0d, to = 360.0d) float f12) {
        return f(f10, f11, f12, r.f20603k);
    }

    @n0
    private static a f(@x(from = 0.0d, to = 100.0d) float f10, @x(from = 0.0d, to = v.f124981d, toInclusive = false) float f11, @x(from = 0.0d, to = 360.0d) float f12, r rVar) {
        double d10 = ((double) f10) / 100.0d;
        float fB = (4.0f / rVar.b()) * ((float) Math.sqrt(d10)) * (rVar.a() + 4.0f) * rVar.d();
        float fD = f11 * rVar.d();
        float fSqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(d10))) * rVar.b()) / (rVar.a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, fB, fD, fSqrt, f13, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    static int p(@x(from = 0.0d, to = 360.0d) float f10, @x(from = 0.0d, to = v.f124981d, toInclusive = false) float f11, @x(from = 0.0d, to = 100.0d) float f12) {
        return q(f10, f11, f12, r.f20603k);
    }

    @androidx.annotation.l
    static int q(@x(from = 0.0d, to = 360.0d) float f10, @x(from = 0.0d, to = v.f124981d, toInclusive = false) float f11, @x(from = 0.0d, to = 100.0d) float f12, @n0 r rVar) {
        if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return b.a(f12);
        }
        float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        a aVar = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            a aVarB = b(fMin, f14, f12);
            if (z10) {
                if (aVarB != null) {
                    return aVarB.r(rVar);
                }
                z10 = false;
            } else if (aVarB == null) {
                f11 = f14;
            } else {
                f13 = f14;
                aVar = aVarB;
            }
            f14 = ((f11 - f13) / 2.0f) + f13;
        }
        return aVar == null ? b.a(f12) : aVar.r(rVar);
    }

    float a(@n0 a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    @x(from = v.f124982e, fromInclusive = false, to = v.f124981d, toInclusive = false)
    float g() {
        return this.f20551h;
    }

    @x(from = v.f124982e, fromInclusive = false, to = v.f124981d, toInclusive = false)
    float h() {
        return this.f20552i;
    }

    @x(from = 0.0d, to = v.f124981d, toInclusive = false)
    float i() {
        return this.f20545b;
    }

    @x(from = 0.0d, to = 360.0d, toInclusive = false)
    float j() {
        return this.f20544a;
    }

    @x(from = 0.0d, to = 100.0d)
    float k() {
        return this.f20546c;
    }

    @x(from = 0.0d, to = 100.0d)
    float l() {
        return this.f20550g;
    }

    @x(from = 0.0d, to = v.f124981d, toInclusive = false)
    float m() {
        return this.f20548e;
    }

    @x(from = 0.0d, to = v.f124981d, toInclusive = false)
    float n() {
        return this.f20547d;
    }

    @x(from = 0.0d, to = v.f124981d, toInclusive = false)
    float o() {
        return this.f20549f;
    }

    @androidx.annotation.l
    int r(@n0 r rVar) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, rVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = rVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) rVar.b())) / ((double) rVar.j())));
        float fG = fCos * 3846.1538f * rVar.g() * rVar.h();
        float f10 = fA / rVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f11 = (((0.305f + f10) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f12 = fCos2 * f11;
        float f13 = f11 * fSin;
        float f14 = f10 * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f15) * (100.0f / rVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f16) * (100.0f / rVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f17) * (100.0f / rVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17)))), 2.380952380952381d));
        float f18 = fSignum / rVar.i()[0];
        float f19 = fSignum2 / rVar.i()[1];
        float f20 = fSignum3 / rVar.i()[2];
        float[][] fArr = b.f20554b;
        float[] fArr2 = fArr[0];
        float f21 = (fArr2[0] * f18) + (fArr2[1] * f19) + (fArr2[2] * f20);
        float[] fArr3 = fArr[1];
        float f22 = (fArr3[0] * f18) + (fArr3[1] * f19) + (fArr3[2] * f20);
        float[] fArr4 = fArr[2];
        return f0.g(f21, f22, (f18 * fArr4[0]) + (f19 * fArr4[1]) + (f20 * fArr4[2]));
    }

    @androidx.annotation.l
    int s() {
        return r(r.f20603k);
    }
}
