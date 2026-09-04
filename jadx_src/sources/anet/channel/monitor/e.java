package anet.channel.monitor;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f29759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f29760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f29761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f29762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f29763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f29764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f29765h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29758a = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f29766i = 0.0d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f29767j = 0.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f29768k = 0.0d;

    e() {
    }

    public double a(double d10, double d11) {
        double d12 = d10 / d11;
        if (d12 < 8.0d) {
            if (this.f29758a != 0) {
                return this.f29768k;
            }
            this.f29768k = d12;
            return d12;
        }
        long j10 = this.f29758a;
        if (j10 == 0) {
            this.f29766i = d12;
            this.f29765h = d12;
            this.f29761d = d12 * 0.1d;
            this.f29760c = 0.02d * d12;
            this.f29762e = 0.1d * d12 * d12;
        } else if (j10 == 1) {
            this.f29767j = d12;
            this.f29765h = d12;
        } else {
            double d13 = this.f29767j;
            double d14 = d12 - d13;
            this.f29766i = d13;
            this.f29767j = d12;
            double d15 = d12 / 0.95d;
            this.f29759b = d15;
            this.f29764g = d15 - (this.f29765h * 0.95d);
            char c10 = 0;
            double dSqrt = Math.sqrt(this.f29761d);
            double d16 = this.f29764g;
            if (d16 >= 4.0d * dSqrt) {
                this.f29764g = (d16 * 0.75d) + (dSqrt * 2.0d);
                c10 = 1;
            } else if (d16 <= (-4.0d) * dSqrt) {
                this.f29764g = (dSqrt * (-1.0d)) + (d16 * 0.75d);
                c10 = 2;
            }
            double d17 = this.f29761d * 1.05d;
            double d18 = this.f29764g;
            double dMin = Math.min(Math.max(Math.abs(d17 - ((0.0025d * d18) * d18)), this.f29761d * 0.8d), this.f29761d * 1.25d);
            this.f29761d = dMin;
            double d19 = this.f29762e;
            double d20 = d19 / ((0.9025d * d19) + dMin);
            this.f29763f = d20;
            double d21 = this.f29765h + (1.0526315789473684d * d14) + (d20 * this.f29764g);
            this.f29765h = d21;
            if (c10 == 1) {
                this.f29765h = Math.min(d21, this.f29759b);
            } else if (c10 == 2) {
                this.f29765h = Math.max(d21, this.f29759b);
            }
            this.f29762e = (1.0d - (0.95d * this.f29763f)) * (this.f29762e + this.f29760c);
        }
        double d22 = this.f29765h;
        if (d22 < 0.0d) {
            double d23 = this.f29767j * 0.7d;
            this.f29768k = d23;
            this.f29765h = d23;
        } else {
            this.f29768k = d22;
        }
        return this.f29768k;
    }

    public void a() {
        this.f29758a = 0L;
        this.f29768k = 0.0d;
    }
}
