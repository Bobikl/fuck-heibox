package com.huawei.hms.feature.dynamic;

import com.huawei.hms.common.util.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60705a = "ExecutorsManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f60706b = 60;

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f60707a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60708b;

        /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.c$a$a, reason: collision with other inner class name */
        public class C0506a implements Thread.UncaughtExceptionHandler {
            public C0506a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                Logger.e(c.f60705a, thread.getName() + " : " + th2.getMessage());
            }
        }

        public a(String str) {
            this.f60708b = str + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f60708b + this.f60707a.getAndIncrement());
            thread.setUncaughtExceptionHandler(new C0506a());
            return thread;
        }
    }

    public static ExecutorService a(int i10, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
