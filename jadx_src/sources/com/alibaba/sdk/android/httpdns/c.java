package com.alibaba.sdk.android.httpdns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f37913a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ThreadFactory f22a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final TimeUnit f23a;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f23a = timeUnit;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.alibaba.sdk.android.httpdns.c.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("httpdns worker");
                thread.setDaemon(false);
                thread.setUncaughtExceptionHandler(new k());
                return thread;
            }
        };
        f22a = threadFactory;
        f37913a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, timeUnit, new SynchronousQueue(), threadFactory);
    }

    public static ExecutorService a() {
        return f37913a;
    }
}
