package anet.channel.detect;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f29666a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExceptionDetector f29667b = new ExceptionDetector();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static k f29668c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f29669d = new AtomicBoolean(false);

    public static void a() {
        try {
            if (f29669d.compareAndSet(false, true)) {
                ALog.i("awcn.NetworkDetector", "registerListener", null, new Object[0]);
                f29666a.b();
                f29667b.a();
                f29668c.a();
            }
        } catch (Exception e10) {
            ALog.e("awcn.NetworkDetector", "[registerListener]error", null, e10, new Object[0]);
        }
    }

    public static void a(RequestStatistic requestStatistic) {
        if (f29669d.get()) {
            f29667b.a(requestStatistic);
        }
    }
}
