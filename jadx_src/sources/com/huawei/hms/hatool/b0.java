package com.huawei.hms.hatool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b0 f60887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b0 f60888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static b0 f60889d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f60890a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f60891a;

        public a(Runnable runnable) {
            this.f60891a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f60891a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    v.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final AtomicInteger f60892d = new AtomicInteger(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadGroup f60893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f60894b = new AtomicInteger(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f60895c;

        b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f60893a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f60895c = "FormalHASDK-base-" + f60892d.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.f60893a, runnable, this.f60895c + this.f60894b.getAndIncrement(), 0L);
        }
    }

    static {
        new b0();
        new b0();
        f60887b = new b0();
        f60888c = new b0();
        f60889d = new b0();
    }

    private b0() {
    }

    public static b0 a() {
        return f60889d;
    }

    public static b0 b() {
        return f60888c;
    }

    public static b0 c() {
        return f60887b;
    }

    public void a(g gVar) {
        try {
            this.f60890a.execute(new a(gVar));
        } catch (RejectedExecutionException unused) {
            v.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
