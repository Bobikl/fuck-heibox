package com.bun.miitmdid;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static BlockingQueue<Runnable> f42127d = new ArrayBlockingQueue(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ThreadFactory f42128e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f42124a = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f42126c = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f42125b = 6000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ThreadPoolExecutor f42129f = new ThreadPoolExecutor(f42124a, f42126c, f42125b, TimeUnit.SECONDS, f42127d, f42128e);

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f42130a = new AtomicInteger();

        @Override // java.util.concurrent.ThreadFactory
        public native Thread newThread(Runnable runnable);
    }

    public static native void a(Runnable runnable);
}
