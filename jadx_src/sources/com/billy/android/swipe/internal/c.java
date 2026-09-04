package com.billy.android.swipe.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: SwipeUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f40495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f40496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f40497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f40498d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f40499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f40500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Executor f40501g;

    /* JADX INFO: compiled from: SwipeUtil.java */
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f40502b = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "SmartSwipe #" + this.f40502b.getAndIncrement());
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f40495a = iAvailableProcessors;
        int iMax = Math.max(2, iAvailableProcessors - 1);
        f40496b = iMax;
        int i10 = iAvailableProcessors + 1;
        f40497c = i10;
        a aVar = new a();
        f40499e = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f40500f = linkedBlockingQueue;
        f40501g = new ThreadPoolExecutor(iMax, i10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }

    public static int a(int i10) {
        return (i10 & 3) != 0 ? (i10 ^ 3) & 3 : (i10 ^ 12) & 12;
    }

    public static void b(Runnable runnable) {
        f40501g.execute(runnable);
    }
}
