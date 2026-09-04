package com.umeng.message.proguard;

import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.umeng.message.common.UPLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f105773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ExecutorService f105774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ExecutorService f105775c;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f105776a;

        public a(Runnable runnable) {
            this.f105776a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Runnable runnable = this.f105776a;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th2) {
                UPLog.e("Executors", th2);
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.message.proguard.b$b, reason: collision with other inner class name */
    public static final class ThreadFactoryC1051b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f105777a = new AtomicInteger();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f105778b;

        ThreadFactoryC1051b(String str) {
            this.f105778b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f105778b + " " + this.f105777a.incrementAndGet());
        }
    }

    public static ScheduledFuture<?> a(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            return a().schedule(d(runnable), j10, timeUnit);
        } catch (Throwable th2) {
            UPLog.e("Executors", th2);
            return null;
        }
    }

    private static ScheduledThreadPoolExecutor a() {
        if (f105773a == null) {
            synchronized (b.class) {
                if (f105773a == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors(), 4)), new ThreadFactoryC1051b("pool"));
                    f105773a = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
                    f105773a.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f105773a;
    }

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            c().execute(d(runnable));
        } catch (Throwable th2) {
            UPLog.e("Executors", th2);
        }
    }

    private static ExecutorService b() {
        if (f105774b == null) {
            synchronized (b.class) {
                if (f105774b == null) {
                    f105774b = Executors.newSingleThreadExecutor(new ThreadFactoryC1051b(FilterGroup.TYPE_SINGLE));
                }
            }
        }
        return f105774b;
    }

    public static Future<?> b(Runnable runnable) {
        try {
            return b().submit(d(runnable));
        } catch (Throwable th2) {
            UPLog.e("Executors", th2);
            return null;
        }
    }

    private static ExecutorService c() {
        if (f105775c == null) {
            synchronized (b.class) {
                if (f105775c == null) {
                    f105775c = Executors.newSingleThreadExecutor(new ThreadFactoryC1051b("msg"));
                }
            }
        }
        return f105775c;
    }

    public static void c(Runnable runnable) {
        try {
            a().execute(d(runnable));
        } catch (Throwable th2) {
            UPLog.e("Executors", th2);
        }
    }

    private static Runnable d(Runnable runnable) {
        return new a(runnable);
    }
}
