package com.alibaba.sdk.android.utils.crashdefend;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: CrashDispatcher.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadFactory f38053a = new ThreadFactory() { // from class: com.alibaba.sdk.android.utils.crashdefend.f.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "safe_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f38054b;

    f() {
    }

    synchronized ExecutorService a() {
        if (this.f38054b == null) {
            this.f38054b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), this.f38053a);
        }
        return this.f38054b;
    }
}
