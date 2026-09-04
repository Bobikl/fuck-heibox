package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: PerspectiveTransform.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f61671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f61672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f61673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f61674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f61675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f61676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f61677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f61678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f61679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f61680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f61681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f61682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f61683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f61684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f61685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f61686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f61687q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f61688r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f61689s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f61690t = 0.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f61691u = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f61692v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f61693w = 0.0f;

    public d6(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f61671a = f10;
        this.f61672b = f13;
        this.f61673c = f16;
        this.f61674d = f11;
        this.f61675e = f14;
        this.f61676f = f17;
        this.f61677g = f12;
        this.f61678h = f15;
        this.f61679i = f18;
        this.f61680j = f10;
        this.f61681k = f11;
        this.f61682l = f12;
        this.f61683m = f13;
        this.f61684n = f14;
        this.f61685o = f15;
        this.f61686p = f16;
        this.f61687q = f17;
        this.f61688r = f18;
    }

    public static d6 a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return b(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }

    public static d6 a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return b(f18, f19, f20, f21, f22, f23, f24, f25).a(a(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static d6 b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new d6(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new d6((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    d6 a() {
        float f10 = this.f61675e;
        float f11 = this.f61679i;
        float f12 = this.f61676f;
        float f13 = this.f61678h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f61677g;
        float f16 = this.f61674d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f61673c;
        float f20 = this.f61672b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f61671a;
        return new d6(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    d6 a(d6 d6Var) {
        float f10 = this.f61671a;
        float f11 = d6Var.f61671a;
        float f12 = this.f61674d;
        float f13 = d6Var.f61672b;
        float f14 = this.f61677g;
        float f15 = d6Var.f61673c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = d6Var.f61674d;
        float f18 = d6Var.f61675e;
        float f19 = d6Var.f61676f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = d6Var.f61677g;
        float f22 = d6Var.f61678h;
        float f23 = d6Var.f61679i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f61672b;
        float f26 = this.f61675e;
        float f27 = this.f61678h;
        float f28 = (f25 * f11) + (f26 * f13) + (f27 * f15);
        float f29 = (f25 * f17) + (f26 * f18) + (f27 * f19);
        float f30 = (f27 * f23) + (f25 * f21) + (f26 * f22);
        float f31 = this.f61673c;
        float f32 = this.f61676f;
        float f33 = (f11 * f31) + (f13 * f32);
        float f34 = this.f61679i;
        return new d6(f16, f20, f24, f28, f29, f30, (f15 * f34) + f33, (f17 * f31) + (f18 * f32) + (f19 * f34), (f31 * f21) + (f32 * f22) + (f34 * f23));
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        this.f61680j = f10;
        this.f61681k = f11;
        this.f61682l = f12;
        this.f61683m = f13;
        this.f61684n = f14;
        this.f61685o = f15;
        this.f61686p = f16;
        this.f61687q = f17;
        this.f61688r = f18;
        this.f61689s = f19;
        this.f61690t = f20;
        this.f61691u = f21;
        this.f61692v = f22;
        this.f61693w = f23;
    }

    public void a(float[] fArr) {
        int length = fArr.length;
        float f10 = this.f61671a;
        float f11 = this.f61672b;
        float f12 = this.f61673c;
        float f13 = this.f61674d;
        float f14 = this.f61675e;
        float f15 = this.f61676f;
        float f16 = this.f61677g;
        float f17 = this.f61678h;
        float f18 = this.f61679i;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }

    public void b(float[] fArr) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f10 = fArr[i10];
            int i11 = i10 + 1;
            float f11 = fArr[i11];
            float f12 = (this.f61690t * f10) + (this.f61691u * f11) + (this.f61692v * f10 * f10) + (this.f61693w * f11 * f11) + 1.0f;
            fArr[i10] = (((((this.f61680j * f10) + (this.f61681k * f11)) + ((this.f61682l * f10) * f10)) + ((this.f61683m * f11) * f11)) + this.f61684n) / f12;
            fArr[i11] = (((((this.f61685o * f10) + (this.f61686p * f11)) + ((this.f61687q * f10) * f10)) + ((this.f61688r * f11) * f11)) + this.f61689s) / f12;
        }
    }
}
