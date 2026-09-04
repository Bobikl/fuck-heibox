package com.umeng.socialize.a;

import android.os.AsyncTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: UMExecutor.java */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f106102a = "UMExecutor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f106103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ExecutorService f106104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadFactory f106105d = new ThreadFactory() { // from class: com.umeng.socialize.a.j.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f106106a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Azx-" + this.f106106a.incrementAndGet());
        }
    };

    /* JADX INFO: compiled from: UMExecutor.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f106107a;

        public a(Runnable runnable) {
            this.f106107a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Runnable runnable = this.f106107a;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th2) {
                m.d(j.f106102a, "error:", th2.getMessage());
            }
        }
    }

    public static Future<?> a(Runnable runnable) {
        try {
            return b().submit(d(runnable));
        } catch (Throwable th2) {
            m.d(f106102a, "submitSingleTask error:", th2.getMessage());
            return null;
        }
    }

    private static ScheduledThreadPoolExecutor a() {
        if (f106103b == null) {
            synchronized (j.class) {
                if (f106103b == null) {
                    f106103b = new ScheduledThreadPoolExecutor(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors(), 4)), f106105d);
                    f106103b.setKeepAliveTime(3L, TimeUnit.SECONDS);
                    f106103b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f106103b;
    }

    @SafeVarargs
    public static <Params, Progress, Result> void a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        if (asyncTask == null) {
            return;
        }
        try {
            asyncTask.executeOnExecutor(a(), paramsArr);
        } catch (Throwable th2) {
            m.d(f106102a, "executeOnExecutor error:", th2.getMessage());
        }
    }

    public static void a(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            a().schedule(runnable, j10, timeUnit);
        } catch (Throwable th2) {
            m.d(f106102a, "schedule error:", th2.getMessage());
        }
    }

    private static ExecutorService b() {
        if (f106104c == null) {
            synchronized (j.class) {
                if (f106104c == null) {
                    f106104c = Executors.newSingleThreadExecutor(f106105d);
                }
            }
        }
        return f106104c;
    }

    public static void b(Runnable runnable) {
        try {
            a().execute(d(runnable));
        } catch (Throwable th2) {
            m.d(f106102a, "execute error:", th2.getMessage());
        }
    }

    public static Future<?> c(Runnable runnable) {
        try {
            return a().submit(d(runnable));
        } catch (Throwable th2) {
            m.d(f106102a, "submit error:", th2.getMessage());
            return null;
        }
    }

    private static Runnable d(Runnable runnable) {
        return new a(runnable);
    }
}
