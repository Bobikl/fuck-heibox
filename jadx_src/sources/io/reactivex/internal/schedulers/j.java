package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.s0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: SchedulerPoolFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f123721a = "rx2.purge-enabled";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f123722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f123723c = "rx2.purge-period-seconds";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final AtomicReference<ScheduledExecutorService> f123725e = new AtomicReference<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Map<ScheduledThreadPoolExecutor, Object> f123726f = new ConcurrentHashMap();

    /* JADX INFO: compiled from: SchedulerPoolFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f123727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f123728b;

        a() {
        }

        void a(Properties properties) {
            if (properties.containsKey(j.f123721a)) {
                this.f123727a = Boolean.parseBoolean(properties.getProperty(j.f123721a));
            } else {
                this.f123727a = true;
            }
            if (!this.f123727a || !properties.containsKey(j.f123723c)) {
                this.f123728b = 1;
                return;
            }
            try {
                this.f123728b = Integer.parseInt(properties.getProperty(j.f123723c));
            } catch (NumberFormatException unused) {
                this.f123728b = 1;
            }
        }
    }

    /* JADX INFO: compiled from: SchedulerPoolFactory.java */
    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(j.f123726f.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    j.f123726f.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        aVar.a(properties);
        f123722b = aVar.f123727a;
        f123724d = aVar.f123728b;
        c();
    }

    private j() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        d(f123722b, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void b() {
        ScheduledExecutorService andSet = f123725e.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        f123726f.clear();
    }

    public static void c() {
        e(f123722b);
    }

    static void d(boolean z10, ScheduledExecutorService scheduledExecutorService) {
        if (z10 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f123726f.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void e(boolean z10) {
        if (!z10) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f123725e;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (s0.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                b bVar = new b();
                int i10 = f123724d;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(bVar, i10, i10, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
