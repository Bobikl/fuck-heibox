package com.loper7.date_time_picker.number_picker;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: Scroller.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    private static final int A = 250;
    private static final int B = 0;
    private static final int C = 1;
    private static final float E = 0.35f;
    private static final float F = 0.5f;
    private static final float G = 1.0f;
    private static final float H = 0.175f;
    private static final float I = 0.35000002f;
    private static final int J = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Interpolator f64587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f64588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f64589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f64590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f64591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f64592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f64593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f64594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f64595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f64596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f64597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f64598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f64599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f64600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f64601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f64602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f64603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f64604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f64605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f64606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f64607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f64608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f64609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f64610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f64611y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f64612z;
    private static float D = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final float[] K = new float[101];
    private static final float[] L = new float[101];

    /* JADX INFO: renamed from: com.loper7.date_time_picker.number_picker.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Scroller.java */
    public static class InterpolatorC0518a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final float f64613a = 8.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float f64614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f64615c;

        static {
            float fA = 1.0f / a(1.0f);
            f64614b = fA;
            f64615c = 1.0f - (fA * a(1.0f));
        }

        InterpolatorC0518a() {
        }

        private static float a(float f10) {
            float f11 = f10 * 8.0f;
            return f11 < 1.0f ? f11 - (1.0f - ((float) Math.exp(-f11))) : ((1.0f - ((float) Math.exp(1.0f - f11))) * 0.63212055f) + 0.36787945f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float fA = f64614b * a(f10);
            return fA > 0.0f ? fA + f64615c : fA;
        }
    }

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20 = 0.0f;
        float f21 = 0.0f;
        for (int i10 = 0; i10 < 100; i10++) {
            float f22 = i10 / 100.0f;
            float f23 = 1.0f;
            while (true) {
                f10 = 2.0f;
                f11 = ((f23 - f20) / 2.0f) + f20;
                f12 = 3.0f;
                f13 = 1.0f - f11;
                f14 = f11 * 3.0f * f13;
                f15 = f11 * f11 * f11;
                float f24 = (((f13 * H) + (f11 * I)) * f14) + f15;
                if (Math.abs(f24 - f22) < 1.0E-5d) {
                    break;
                } else if (f24 > f22) {
                    f23 = f11;
                } else {
                    f20 = f11;
                }
            }
            K[i10] = (f14 * ((f13 * 0.5f) + f11)) + f15;
            float f25 = 1.0f;
            while (true) {
                f16 = ((f25 - f21) / f10) + f21;
                f17 = 1.0f - f16;
                f18 = f16 * f12 * f17;
                f19 = f16 * f16 * f16;
                float f26 = (((f17 * 0.5f) + f16) * f18) + f19;
                if (Math.abs(f26 - f22) < 1.0E-5d) {
                    break;
                }
                if (f26 > f22) {
                    f25 = f16;
                } else {
                    f21 = f16;
                }
                f10 = 2.0f;
                f12 = 3.0f;
            }
            L[i10] = (f18 * ((f17 * H) + (f16 * I))) + f19;
        }
        float[] fArr = K;
        L[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, Interpolator interpolator) {
        this(context, interpolator, context.getApplicationInfo().targetSdkVersion >= 11);
    }

    public a(Context context, Interpolator interpolator, boolean z10) {
        this.f64609w = ViewConfiguration.getScrollFriction();
        this.f64604r = true;
        if (interpolator == null) {
            this.f64587a = new InterpolatorC0518a();
        } else {
            this.f64587a = interpolator;
        }
        this.f64611y = context.getResources().getDisplayMetrics().density * 160.0f;
        this.f64610x = b(ViewConfiguration.getScrollFriction());
        this.f64605s = z10;
        this.f64612z = b(0.84f);
    }

    private float b(float f10) {
        return this.f64611y * 386.0878f * f10;
    }

    private double m(float f10) {
        return Math.log((Math.abs(f10) * E) / (this.f64609w * this.f64612z));
    }

    private double n(float f10) {
        double dM = m(f10);
        float f11 = D;
        return ((double) (this.f64609w * this.f64612z)) * Math.exp((((double) f11) / (((double) f11) - 1.0d)) * dM);
    }

    private int o(float f10) {
        return (int) (Math.exp(m(f10) / (((double) D) - 1.0d)) * 1000.0d);
    }

    public void a() {
        this.f64597k = this.f64591e;
        this.f64598l = this.f64592f;
        this.f64604r = true;
    }

    public boolean c() {
        if (this.f64604r) {
            return false;
        }
        int iCurrentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f64599m);
        int i10 = this.f64600n;
        if (iCurrentAnimationTimeMillis < i10) {
            int i11 = this.f64588b;
            if (i11 == 0) {
                float interpolation = this.f64587a.getInterpolation(iCurrentAnimationTimeMillis * this.f64601o);
                this.f64597k = this.f64589c + Math.round(this.f64602p * interpolation);
                this.f64598l = this.f64590d + Math.round(interpolation * this.f64603q);
            } else if (i11 == 1) {
                float f10 = iCurrentAnimationTimeMillis / i10;
                int i12 = (int) (f10 * 100.0f);
                float f11 = 1.0f;
                float f12 = 0.0f;
                if (i12 < 100) {
                    float f13 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = K;
                    float f14 = fArr[i12];
                    f12 = (fArr[i13] - f14) / ((i13 / 100.0f) - f13);
                    f11 = f14 + ((f10 - f13) * f12);
                }
                this.f64607u = ((f12 * this.f64608v) / i10) * 1000.0f;
                int i14 = this.f64589c;
                int iRound = i14 + Math.round((this.f64591e - i14) * f11);
                this.f64597k = iRound;
                int iMin = Math.min(iRound, this.f64594h);
                this.f64597k = iMin;
                this.f64597k = Math.max(iMin, this.f64593g);
                int i15 = this.f64590d;
                int iRound2 = i15 + Math.round(f11 * (this.f64592f - i15));
                this.f64598l = iRound2;
                int iMin2 = Math.min(iRound2, this.f64596j);
                this.f64598l = iMin2;
                int iMax = Math.max(iMin2, this.f64595i);
                this.f64598l = iMax;
                if (this.f64597k == this.f64591e && iMax == this.f64592f) {
                    this.f64604r = true;
                }
            }
        } else {
            this.f64597k = this.f64591e;
            this.f64598l = this.f64592f;
            this.f64604r = true;
        }
        return true;
    }

    public void d(int i10) {
        int iY = y() + i10;
        this.f64600n = iY;
        this.f64601o = 1.0f / iY;
        this.f64604r = false;
    }

    public void e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f64605s && !this.f64604r) {
            float fG = g();
            float f10 = this.f64591e - this.f64589c;
            float f11 = this.f64592f - this.f64590d;
            float fHypot = (float) Math.hypot(f10, f11);
            float f12 = (f10 / fHypot) * fG;
            float f13 = (f11 / fHypot) * fG;
            float f14 = i12;
            if (Math.signum(f14) == Math.signum(f12)) {
                float f15 = i13;
                if (Math.signum(f15) == Math.signum(f13)) {
                    i12 = (int) (f14 + f12);
                    i13 = (int) (f15 + f13);
                }
            }
        }
        this.f64588b = 1;
        this.f64604r = false;
        float fHypot2 = (float) Math.hypot(i12, i13);
        this.f64606t = fHypot2;
        this.f64600n = o(fHypot2);
        this.f64599m = AnimationUtils.currentAnimationTimeMillis();
        this.f64589c = i10;
        this.f64590d = i11;
        float f16 = fHypot2 == 0.0f ? 1.0f : i12 / fHypot2;
        float f17 = fHypot2 != 0.0f ? i13 / fHypot2 : 1.0f;
        double dN = n(fHypot2);
        this.f64608v = (int) (((double) Math.signum(fHypot2)) * dN);
        this.f64593g = i14;
        this.f64594h = i15;
        this.f64595i = i16;
        this.f64596j = i17;
        int iRound = i10 + ((int) Math.round(((double) f16) * dN));
        this.f64591e = iRound;
        int iMin = Math.min(iRound, this.f64594h);
        this.f64591e = iMin;
        this.f64591e = Math.max(iMin, this.f64593g);
        int iRound2 = i11 + ((int) Math.round(dN * ((double) f17)));
        this.f64592f = iRound2;
        int iMin2 = Math.min(iRound2, this.f64596j);
        this.f64592f = iMin2;
        this.f64592f = Math.max(iMin2, this.f64595i);
    }

    public final void f(boolean z10) {
        this.f64604r = z10;
    }

    public float g() {
        return this.f64588b == 1 ? this.f64607u : this.f64606t - ((this.f64610x * y()) / 2000.0f);
    }

    public final int h() {
        return this.f64597k;
    }

    public final int i() {
        return this.f64598l;
    }

    public final int j() {
        return this.f64600n;
    }

    public final int k() {
        return this.f64591e;
    }

    public final int l() {
        return this.f64592f;
    }

    public final int p() {
        return this.f64589c;
    }

    public final int q() {
        return this.f64590d;
    }

    public final boolean r() {
        return this.f64604r;
    }

    public boolean s(float f10, float f11) {
        return !this.f64604r && Math.signum(f10) == Math.signum((float) (this.f64591e - this.f64589c)) && Math.signum(f11) == Math.signum((float) (this.f64592f - this.f64590d));
    }

    public void t(int i10) {
        this.f64591e = i10;
        this.f64602p = i10 - this.f64589c;
        this.f64604r = false;
    }

    public void u(int i10) {
        this.f64592f = i10;
        this.f64603q = i10 - this.f64590d;
        this.f64604r = false;
    }

    public final void v(float f10) {
        this.f64610x = b(f10);
        this.f64609w = f10;
    }

    public void w(int i10, int i11, int i12, int i13) {
        x(i10, i11, i12, i13, 250);
    }

    public void x(int i10, int i11, int i12, int i13, int i14) {
        this.f64588b = 0;
        this.f64604r = false;
        this.f64600n = i14;
        this.f64599m = AnimationUtils.currentAnimationTimeMillis();
        this.f64589c = i10;
        this.f64590d = i11;
        this.f64591e = i10 + i12;
        this.f64592f = i11 + i13;
        this.f64602p = i12;
        this.f64603q = i13;
        this.f64601o = 1.0f / this.f64600n;
    }

    public int y() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.f64599m);
    }
}
