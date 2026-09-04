package anet.channel.thread;

import anet.channel.util.ALog;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class ThreadPoolExecutorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f29983a = new ScheduledThreadPoolExecutor(1, new b("AWCN Scheduler"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f29984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ThreadPoolExecutor f29985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ThreadPoolExecutor f29986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ThreadPoolExecutor f29987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ThreadPoolExecutor f29988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ThreadPoolExecutor f29989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ThreadPoolExecutor f29990h;

    /* JADX INFO: compiled from: Taobao */
    public static class Priority {
        public static int HIGH = 0;
        public static int LOW = 9;
        public static int NORMAL = 1;
    }

    /* JADX INFO: compiled from: Taobao */
    public static class a implements Comparable<a>, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f29991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f29993c;

        public a(Runnable runnable, int i10) {
            this.f29991a = null;
            this.f29992b = 0;
            this.f29993c = System.currentTimeMillis();
            this.f29991a = runnable;
            this.f29992b = i10;
            this.f29993c = System.currentTimeMillis();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int i10 = this.f29992b;
            int i11 = aVar.f29992b;
            return i10 != i11 ? i10 - i11 : (int) (aVar.f29993c - this.f29993c);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29991a.run();
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AtomicInteger f29994a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f29995b;

        b(String str) {
            this.f29995b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f29995b + this.f29994a.incrementAndGet());
            ALog.i("awcn.ThreadPoolExecutorFactory", "thread created!", null, "name", thread.getName());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f29984b = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingDeque(), new b("AWCN Worker(H)"));
        f29985c = new anet.channel.thread.a(16, 16, 60L, timeUnit, new PriorityBlockingQueue(), new b("AWCN Worker(M)"));
        f29986d = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingDeque(), new b("AWCN Worker(L)"));
        f29987e = new ThreadPoolExecutor(32, 32, 60L, timeUnit, new LinkedBlockingDeque(), new b("AWCN Worker(Backup)"));
        f29988f = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new b("AWCN Detector"));
        f29989g = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new b("AWCN HR"));
        f29990h = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new b("AWCN Cookie"));
        f29984b.allowCoreThreadTimeOut(true);
        f29985c.allowCoreThreadTimeOut(true);
        f29986d.allowCoreThreadTimeOut(true);
        f29987e.allowCoreThreadTimeOut(true);
        f29988f.allowCoreThreadTimeOut(true);
        f29989g.allowCoreThreadTimeOut(true);
        f29990h.allowCoreThreadTimeOut(true);
    }

    public static void removeScheduleTask(Runnable runnable) {
        f29983a.remove(runnable);
    }

    public static synchronized void setNormalExecutorPoolSize(int i10) {
        if (i10 < 6) {
            i10 = 6;
        }
        f29985c.setCorePoolSize(i10);
        f29985c.setMaximumPoolSize(i10);
    }

    public static Future<?> submitBackupTask(Runnable runnable) {
        return f29987e.submit(runnable);
    }

    public static Future<?> submitCookieMonitor(Runnable runnable) {
        return f29990h.submit(runnable);
    }

    public static Future<?> submitDetectTask(Runnable runnable) {
        return f29988f.submit(runnable);
    }

    public static Future<?> submitHRTask(Runnable runnable) {
        return f29989g.submit(runnable);
    }

    public static Future<?> submitPriorityTask(Runnable runnable, int i10) {
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.ThreadPoolExecutorFactory", "submit priority task", null, "priority", Integer.valueOf(i10));
        }
        if (i10 < Priority.HIGH || i10 > Priority.LOW) {
            i10 = Priority.LOW;
        }
        if (i10 == Priority.HIGH) {
            return f29984b.submit(runnable);
        }
        return i10 == Priority.LOW ? f29986d.submit(runnable) : f29985c.submit(new a(runnable, i10));
    }

    public static Future<?> submitScheduledTask(Runnable runnable) {
        return f29983a.submit(runnable);
    }

    public static Future<?> submitScheduledTask(Runnable runnable, long j10, TimeUnit timeUnit) {
        return f29983a.schedule(runnable, j10, timeUnit);
    }
}
