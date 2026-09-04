package androidx.core.content.res;

import androidx.annotation.n0;

/* JADX INFO: compiled from: ViewingConditions.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final r f20603k = k(b.f20555c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f20604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f20605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f20606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f20607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f20608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f20609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f20610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f20611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f20612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f20613j;

    private r(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f20609f = f10;
        this.f20604a = f11;
        this.f20605b = f12;
        this.f20606c = f13;
        this.f20607d = f14;
        this.f20608e = f15;
        this.f20610g = fArr;
        this.f20611h = f16;
        this.f20612i = f17;
        this.f20613j = f18;
    }

    @n0
    static r k(@n0 float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = b.f20553a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = f14 + (fArr3[1] * f15);
        float f17 = fArr[2];
        float f18 = f16 + (fArr3[2] * f17);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[0] * f13) + (fArr4[1] * f15) + (fArr4[2] * f17);
        float[] fArr5 = fArr2[2];
        float f20 = (f13 * fArr5[0]) + (f15 * fArr5[1]) + (f17 * fArr5[2]);
        float f21 = (f12 / 10.0f) + 0.8f;
        float fD = ((double) f21) >= 0.9d ? b.d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        float fExp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp, (((100.0f / f20) * fExp) + 1.0f) - fExp};
        float f22 = 1.0f / ((5.0f * f10) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float fCbrt = (f23 * f10) + (0.1f * f24 * f24 * ((float) Math.cbrt(((double) f10) * 5.0d)));
        float fH = b.h(f11) / fArr[1];
        double d11 = fH;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f20)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f18)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f19)) / 100.0d, 0.42d), fPow2};
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[1];
        return new r(fH, ((f26 * 2.0f) + ((f27 * 400.0f) / (f27 + 27.13f)) + (((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f)) * fPow, fPow, fPow, fD, f21, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.f20604a;
    }

    float b() {
        return this.f20607d;
    }

    float c() {
        return this.f20611h;
    }

    float d() {
        return this.f20612i;
    }

    float e() {
        return this.f20609f;
    }

    float f() {
        return this.f20605b;
    }

    float g() {
        return this.f20608e;
    }

    float h() {
        return this.f20606c;
    }

    @n0
    float[] i() {
        return this.f20610g;
    }

    float j() {
        return this.f20613j;
    }
}
