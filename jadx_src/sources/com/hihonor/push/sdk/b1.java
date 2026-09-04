package com.hihonor.push.sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b1 f60005d = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Executor f60006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ExecutorService f60007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f60008c = new Object();

    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static Executor a() {
        b1 b1Var = f60005d;
        if (b1Var.f60006a == null) {
            synchronized (b1Var.f60008c) {
                if (b1Var.f60006a == null) {
                    b1Var.f60006a = new a();
                }
            }
        }
        return b1Var.f60006a;
    }

    public static void a(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            a().execute(runnable);
        }
    }

    public static ExecutorService c() {
        return f60005d.b();
    }

    public final ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
