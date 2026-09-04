package anet.channel.monitor;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f29770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f29771c = 40.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f29769a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29772d = true;

    public int a() {
        return 0;
    }

    public boolean a(double d10) {
        return d10 < 40.0d;
    }

    protected final boolean b() {
        if (!this.f29772d) {
            return false;
        }
        if (System.currentTimeMillis() - this.f29770b <= a() * 1000) {
            return true;
        }
        this.f29772d = false;
        return false;
    }
}
