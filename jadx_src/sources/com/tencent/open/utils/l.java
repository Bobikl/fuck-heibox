package com.tencent.open.utils;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f101189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HandlerThread f101190d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f101188b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f101187a = c();

    /* JADX INFO: compiled from: ProGuard */
    public static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Queue<Runnable> f101191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f101192b;

        private a() {
            this.f101191a = new LinkedList();
        }

        protected synchronized void a() {
            Runnable runnablePoll = this.f101191a.poll();
            this.f101192b = runnablePoll;
            if (runnablePoll != null) {
                l.f101187a.execute(runnablePoll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.f101191a.offer(new Runnable() { // from class: com.tencent.open.utils.l.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        a.this.a();
                    }
                }
            });
            if (this.f101192b == null) {
                a();
            }
        }
    }

    public static Handler a() {
        if (f101189c == null) {
            synchronized (l.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                f101190d = handlerThread;
                handlerThread.start();
                f101189c = new Handler(f101190d.getLooper());
            }
        }
        return f101189c;
    }

    public static void a(Runnable runnable) {
        try {
            f101187a.execute(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }

    public static Executor b() {
        return new a();
    }

    public static void b(Runnable runnable) {
        a().post(runnable);
    }

    private static Executor c() {
        return new ThreadPoolExecutor(0, 3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }
}
