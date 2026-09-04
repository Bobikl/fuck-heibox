package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: StopLogicEngine.java */
/* JADX INFO: loaded from: classes.dex */
public class s implements r {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f17801p = 1.0E-5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f17802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f17803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f17804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f17805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f17806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f17807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f17808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f17809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f17810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f17812k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f17814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f17815n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17813l = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17816o = false;

    private float e(float f10) {
        this.f17816o = false;
        float f11 = this.f17805d;
        if (f10 <= f11) {
            float f12 = this.f17802a;
            return (f12 * f10) + ((((this.f17803b - f12) * f10) * f10) / (f11 * 2.0f));
        }
        int i10 = this.f17811j;
        if (i10 == 1) {
            return this.f17808g;
        }
        float f13 = f10 - f11;
        float f14 = this.f17806e;
        if (f13 < f14) {
            float f15 = this.f17808g;
            float f16 = this.f17803b;
            return f15 + (f16 * f13) + ((((this.f17804c - f16) * f13) * f13) / (f14 * 2.0f));
        }
        if (i10 == 2) {
            return this.f17809h;
        }
        float f17 = f13 - f14;
        float f18 = this.f17807f;
        if (f17 > f18) {
            this.f17816o = true;
            return this.f17810i;
        }
        float f19 = this.f17809h;
        float f20 = this.f17804c;
        return (f19 + (f20 * f17)) - (((f20 * f17) * f17) / (f18 * 2.0f));
    }

    private void g(float f10, float f11, float f12, float f13, float f14) {
        this.f17816o = false;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        this.f17802a = f10;
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f17812k = "backward accelerate, decelerate";
                this.f17811j = 2;
                this.f17802a = f10;
                this.f17803b = fSqrt;
                this.f17804c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f17805d = f17;
                this.f17806e = fSqrt / f12;
                this.f17808g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f17809h = f11;
                this.f17810i = f11;
                return;
            }
            this.f17812k = "backward accelerate cruse decelerate";
            this.f17811j = 3;
            this.f17802a = f10;
            this.f17803b = f13;
            this.f17804c = f13;
            float f18 = (f13 - f10) / f12;
            this.f17805d = f18;
            float f19 = f13 / f12;
            this.f17807f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f17806e = ((f11 - f20) - f21) / f13;
            this.f17808g = f20;
            this.f17809h = f11 - f21;
            this.f17810i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f17812k = "hard stop";
            this.f17811j = 1;
            this.f17802a = f10;
            this.f17803b = 0.0f;
            this.f17808g = f11;
            this.f17805d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f17812k = "cruse decelerate";
            this.f17811j = 2;
            this.f17802a = f10;
            this.f17803b = f10;
            this.f17804c = 0.0f;
            this.f17808g = f22;
            this.f17809h = f11;
            this.f17805d = f23;
            this.f17806e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f12 * f11) + ((f10 * f10) / 2.0f));
        float f24 = (fSqrt2 - f10) / f12;
        this.f17805d = f24;
        float f25 = fSqrt2 / f12;
        this.f17806e = f25;
        if (fSqrt2 < f13) {
            this.f17812k = "accelerate decelerate";
            this.f17811j = 2;
            this.f17802a = f10;
            this.f17803b = fSqrt2;
            this.f17804c = 0.0f;
            this.f17805d = f24;
            this.f17806e = f25;
            this.f17808g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f17809h = f11;
            return;
        }
        this.f17812k = "accelerate cruse decelerate";
        this.f17811j = 3;
        this.f17802a = f10;
        this.f17803b = f13;
        this.f17804c = f13;
        float f26 = (f13 - f10) / f12;
        this.f17805d = f26;
        float f27 = f13 / f12;
        this.f17807f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f17806e = ((f11 - f28) - f29) / f13;
        this.f17808g = f28;
        this.f17809h = f11 - f29;
        this.f17810i = f11;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float a() {
        return this.f17813l ? -b(this.f17815n) : b(this.f17815n);
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float b(float f10) {
        float f11 = this.f17805d;
        if (f10 <= f11) {
            float f12 = this.f17802a;
            return f12 + (((this.f17803b - f12) * f10) / f11);
        }
        int i10 = this.f17811j;
        if (i10 == 1) {
            return 0.0f;
        }
        float f13 = f10 - f11;
        float f14 = this.f17806e;
        if (f13 < f14) {
            float f15 = this.f17803b;
            return f15 + (((this.f17804c - f15) * f13) / f14);
        }
        if (i10 == 2) {
            return this.f17809h;
        }
        float f16 = f13 - f14;
        float f17 = this.f17807f;
        if (f16 >= f17) {
            return this.f17810i;
        }
        float f18 = this.f17804c;
        return f18 - ((f16 * f18) / f17);
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public String c(String str, float f10) {
        String str2 = str + " ===== " + this.f17812k + "\n";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append(this.f17813l ? "backwards" : "forward ");
        sb2.append(" time = ");
        sb2.append(f10);
        sb2.append("  stages ");
        sb2.append(this.f17811j);
        sb2.append("\n");
        String str3 = sb2.toString() + str + " dur " + this.f17805d + " vel " + this.f17802a + " pos " + this.f17808g + "\n";
        if (this.f17811j > 1) {
            str3 = str3 + str + " dur " + this.f17806e + " vel " + this.f17803b + " pos " + this.f17809h + "\n";
        }
        if (this.f17811j > 2) {
            str3 = str3 + str + " dur " + this.f17807f + " vel " + this.f17804c + " pos " + this.f17810i + "\n";
        }
        float f11 = this.f17805d;
        if (f10 <= f11) {
            return str3 + str + "stage 0\n";
        }
        int i10 = this.f17811j;
        if (i10 == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f12 = f10 - f11;
        float f13 = this.f17806e;
        if (f12 < f13) {
            return str3 + str + " stage 1\n";
        }
        if (i10 == 2) {
            return str3 + str + "end stage 1\n";
        }
        if (f12 - f13 < this.f17807f) {
            return str3 + str + " stage 2\n";
        }
        return str3 + str + " end stage 2\n";
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public boolean d() {
        return a() < f17801p && Math.abs(this.f17810i - this.f17815n) < f17801p;
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f17816o = false;
        this.f17814m = f10;
        boolean z10 = f10 > f11;
        this.f17813l = z10;
        if (z10) {
            g(-f12, f10 - f11, f14, f15, f13);
        } else {
            g(f12, f11 - f10, f14, f15, f13);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float getInterpolation(float f10) {
        float fE = e(f10);
        this.f17815n = f10;
        return this.f17813l ? this.f17814m - fE : this.f17814m + fE;
    }
}
