package com.huawei.hmf.tasks.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f60182a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f60183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f60184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f60185e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f60186b = new ExecutorC0503a(0);

    /* JADX INFO: renamed from: com.huawei.hmf.tasks.a.a$a, reason: collision with other inner class name */
    public static final class ExecutorC0503a implements Executor {
        private ExecutorC0503a() {
        }

        /* synthetic */ ExecutorC0503a(byte b10) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f60183c = iAvailableProcessors;
        f60184d = iAvailableProcessors + 1;
        f60185e = (iAvailableProcessors * 2) + 1;
    }

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f60184d, f60185e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b() {
        return f60182a.f60186b;
    }
}
