package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: SpringStopEngine.java */
/* JADX INFO: loaded from: classes.dex */
public class p implements r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double f17787l = Double.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f17790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f17791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f17792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f17793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f17794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f17795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f17796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f17797j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f17788a = 0.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17789b = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17798k = 0;

    private void e(double d10) {
        double d11 = this.f17790c;
        double d12 = this.f17788a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f17796i)) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / ((double) iSqrt);
        int i10 = 0;
        while (i10 < iSqrt) {
            float f10 = this.f17794g;
            double d14 = this.f17791d;
            float f11 = this.f17795h;
            double d15 = d11;
            double d16 = ((-d11) * (((double) f10) - d14)) - (((double) f11) * d12);
            float f12 = this.f17796i;
            double d17 = d12;
            double d18 = ((double) f11) + (((d16 / ((double) f12)) * d13) / 2.0d);
            double d19 = ((((-((((double) f10) + ((d13 * d18) / 2.0d)) - d14)) * d15) - (d18 * d17)) / ((double) f12)) * d13;
            float f13 = (float) (((double) f11) + d19);
            this.f17795h = f13;
            float f14 = (float) (((double) f10) + ((((double) f11) + (d19 / 2.0d)) * d13));
            this.f17794g = f14;
            int i11 = this.f17798k;
            if (i11 > 0) {
                if (f14 < 0.0f && (i11 & 1) == 1) {
                    this.f17794g = -f14;
                    this.f17795h = -f13;
                }
                float f15 = this.f17794g;
                if (f15 > 1.0f && (i11 & 2) == 2) {
                    this.f17794g = 2.0f - f15;
                    this.f17795h = -this.f17795h;
                }
            }
            i10++;
            d11 = d15;
            d12 = d17;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float a() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float b(float f10) {
        return this.f17795h;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public String c(String str, float f10) {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public boolean d() {
        double d10 = ((double) this.f17794g) - this.f17791d;
        double d11 = this.f17790c;
        double d12 = this.f17795h;
        return Math.sqrt((((d12 * d12) * ((double) this.f17796i)) + ((d11 * d10) * d10)) / d11) <= ((double) this.f17797j);
    }

    public float f() {
        double d10 = this.f17790c;
        return ((float) (((-d10) * (((double) this.f17794g) - this.f17791d)) - (this.f17788a * ((double) this.f17795h)))) / this.f17796i;
    }

    void g(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float getInterpolation(float f10) {
        e(f10 - this.f17793f);
        this.f17793f = f10;
        return this.f17794g;
    }

    public void h(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        this.f17791d = f11;
        this.f17788a = f15;
        this.f17789b = false;
        this.f17794g = f10;
        this.f17792e = f12;
        this.f17790c = f14;
        this.f17796i = f13;
        this.f17797j = f16;
        this.f17798k = i10;
        this.f17793f = 0.0f;
    }
}
