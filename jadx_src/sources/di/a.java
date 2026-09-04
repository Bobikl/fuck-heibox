package di;

/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f118517a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @xh.e
    public static final double f118518b = Math.log(2.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @xh.e
    public static final double f118519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xh.e
    public static final double f118520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xh.e
    public static final double f118521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @xh.e
    public static final double f118522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @xh.e
    public static final double f118523g;

    static {
        double dUlp = Math.ulp(1.0d);
        f118519c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        f118520d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f118521e = dSqrt2;
        double d10 = 1;
        f118522f = d10 / dSqrt;
        f118523g = d10 / dSqrt2;
    }

    private a() {
    }
}
