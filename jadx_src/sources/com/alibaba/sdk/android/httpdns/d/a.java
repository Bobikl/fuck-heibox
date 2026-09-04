package com.alibaba.sdk.android.httpdns.d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f37919b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final ThreadFactory f27b = new ThreadFactory() { // from class: com.alibaba.sdk.android.httpdns.d.a.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "report_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    a() {
    }

    synchronized ExecutorService b() {
        if (this.f37919b == null) {
            this.f37919b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), this.f27b);
        }
        return this.f37919b;
    }
}
