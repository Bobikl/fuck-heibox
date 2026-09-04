package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f29738a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static long f29739b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static long f29740c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static long f29741d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static long f29742e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static long f29743f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static double f29744g = 0.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static double f29745h = 0.0d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static double f29746i = 0.0d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static double f29747j = 40.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile boolean f29748k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f29751n;

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static b f29752a = new b(null);

        a() {
        }
    }

    private b() {
        this.f29749l = 5;
        this.f29750m = 0;
        this.f29751n = new e();
        NetworkStatusHelper.addStatusChangeListener(new c(this));
    }

    /* synthetic */ b(c cVar) {
        this();
    }

    public static b a() {
        return a.f29752a;
    }

    static /* synthetic */ int b(b bVar) {
        int i10 = bVar.f29750m;
        bVar.f29750m = i10 + 1;
        return i10;
    }

    public void a(long j10, long j11, long j12) {
        if (f29748k) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.BandWidthSampler", "onDataReceived", null, "mRequestStartTime", Long.valueOf(j10), "mRequestFinishedTime", Long.valueOf(j11), "mRequestDataSize", Long.valueOf(j12));
            }
            if (j12 <= 3000 || j10 >= j11) {
                return;
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new d(this, j12, j11, j10));
        }
    }

    public int b() {
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            return 1;
        }
        return this.f29749l;
    }

    public double c() {
        return f29746i;
    }

    public synchronized void d() {
        try {
            ALog.i("awcn.BandWidthSampler", "[startNetworkMeter]", null, "NetworkStatus", NetworkStatusHelper.getStatus());
            if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
                f29748k = false;
            } else {
                f29748k = true;
            }
        } catch (Exception e10) {
            ALog.w("awcn.BandWidthSampler", "startNetworkMeter fail.", null, e10, new Object[0]);
        }
    }

    public void e() {
        f29748k = false;
    }
}
