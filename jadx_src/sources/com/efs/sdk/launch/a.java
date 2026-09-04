package com.efs.sdk.launch;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f42621a = "com.efs.sdk.launch.a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f42622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ThreadFactory f42623c = new ThreadFactory() { // from class: com.efs.sdk.launch.a.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicInteger f42624a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("LaunchThreadPoolExecutor" + this.f42624a.addAndGet(1));
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (f42622b == null) {
            synchronized (a.class) {
                if (f42622b == null) {
                    f42622b = new ScheduledThreadPoolExecutor(4, f42623c);
                }
            }
        }
        return f42622b;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
