package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: DetectorResult.java */
/* JADX INFO: loaded from: classes7.dex */
public class i2 implements Comparable<i2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f61919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f61920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f61921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f61922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f61923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f61924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f61925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f61926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f61927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f61928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f61929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f61930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float[] f61931m = new float[5];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f61932n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f61933o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f61934p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f61935q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f61936r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f61937s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f61938t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f61939u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f61940v = 0.0f;

    public i2(boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f61919a = f10;
        this.f61920b = f11;
        this.f61921c = f12;
        this.f61922d = f13;
        this.f61923e = f14;
        this.f61924f = f15;
        this.f61929k = f19;
        if (!z10) {
            this.f61927i = f18;
            this.f61928j = f17;
        } else {
            this.f61925g = f16;
            this.f61926h = f17;
            this.f61928j = f18;
        }
    }

    private float a(float f10, int i10, int i11) {
        float f11 = i10;
        if (f10 <= f11) {
            f10 = f11;
        }
        float f12 = i11 - 1;
        return f10 < f12 ? f10 : f12;
    }

    public float a() {
        return this.f61933o;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i2 i2Var) {
        return Float.compare((-i2Var.g()) + i2Var.h(), (-g()) + h());
    }

    public void a(float f10, float f11) {
        this.f61919a += f10;
        this.f61920b += f11;
        this.f61923e += f10;
        this.f61924f += f11;
    }

    public void a(int i10, int i11, float f10, float f11) {
        float f12 = this.f61919a + f10;
        this.f61919a = f12;
        float f13 = this.f61920b + f11;
        this.f61920b = f13;
        if (f12 < 0.0f) {
            this.f61921c += f12;
        }
        if (f13 < 0.0f) {
            this.f61922d += f13;
        }
        this.f61923e += f10;
        this.f61924f += f11;
        this.f61919a = a(f12, 0, i10);
        this.f61923e = a(this.f61923e, 0, i10);
        this.f61920b = a(this.f61920b, 0, i11);
        this.f61924f = a(this.f61924f, 0, i11);
        float f14 = this.f61919a;
        float f15 = i10 - f10;
        if (this.f61921c + f14 >= f15) {
            this.f61921c = (f15 - 1.0f) - f14;
        }
        float f16 = this.f61920b;
        float f17 = i11 - f11;
        if (this.f61922d + f16 >= f17) {
            this.f61922d = (f17 - 1.0f) - f16;
        }
    }

    public float b() {
        return this.f61932n;
    }

    public void b(float f10, float f11) {
        this.f61919a = 0.0f;
        this.f61920b = 0.0f;
        this.f61921c = f10;
        this.f61922d = f11;
        this.f61923e = f10 / 2.0f;
        this.f61924f = f11 / 2.0f;
        this.f61925g = f10;
        this.f61926h = f11;
        this.f61928j = 0.0f;
    }

    public float c() {
        return this.f61922d;
    }

    public float d() {
        return this.f61919a;
    }

    public float e() {
        return this.f61920b;
    }

    public float f() {
        return this.f61921c;
    }

    public float g() {
        return this.f61929k;
    }

    public float h() {
        return this.f61927i;
    }

    public float i() {
        return this.f61928j;
    }

    public float j() {
        return this.f61923e;
    }

    public float k() {
        return this.f61924f;
    }

    public float l() {
        return this.f61926h;
    }

    public float m() {
        return this.f61925g;
    }

    public float n() {
        return this.f61940v;
    }
}
