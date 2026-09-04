package anet.channel.strategy.utils;

import anet.channel.util.ALog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f29981a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f29982b = null;

    static ScheduledThreadPoolExecutor a() {
        if (f29982b == null) {
            synchronized (a.class) {
                if (f29982b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new b());
                    f29982b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                    f29982b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f29982b;
    }

    public static void a(Runnable runnable) {
        try {
            a().submit(runnable);
        } catch (Exception e10) {
            ALog.e(anet.channel.strategy.dispatch.a.TAG, "submit task failed", null, e10, new Object[0]);
        }
    }

    public static void a(Runnable runnable, long j10) {
        try {
            a().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            ALog.e(anet.channel.strategy.dispatch.a.TAG, "schedule task failed", null, e10, new Object[0]);
        }
    }
}
