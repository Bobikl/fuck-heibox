package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ThreadFactoryBuilder.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@s9.a
@o9.c
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    private String f59536a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private Boolean f59537b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private Integer f59538c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private Thread.UncaughtExceptionHandler f59539d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    private ThreadFactory f59540e = null;

    /* JADX INFO: compiled from: ThreadFactoryBuilder.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f59541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f59542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicLong f59543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Boolean f59544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f59545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f59546g;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f59541b = threadFactory;
            this.f59542c = str;
            this.f59543d = atomicLong;
            this.f59544e = bool;
            this.f59545f = num;
            this.f59546g = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f59541b.newThread(runnable);
            String str = this.f59542c;
            if (str != null) {
                AtomicLong atomicLong = this.f59543d;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(s1.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f59544e;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f59545f;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f59546g;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    private static ThreadFactory c(s1 s1Var) {
        String str = s1Var.f59536a;
        Boolean bool = s1Var.f59537b;
        Integer num = s1Var.f59538c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = s1Var.f59539d;
        ThreadFactory threadFactoryDefaultThreadFactory = s1Var.f59540e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    @s9.b
    public ThreadFactory b() {
        return c(this);
    }

    public s1 e(boolean z10) {
        this.f59537b = Boolean.valueOf(z10);
        return this;
    }

    public s1 f(String str) {
        d(str, 0);
        this.f59536a = str;
        return this;
    }

    public s1 g(int i10) {
        com.google.common.base.w.m(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        com.google.common.base.w.m(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f59538c = Integer.valueOf(i10);
        return this;
    }

    public s1 h(ThreadFactory threadFactory) {
        this.f59540e = (ThreadFactory) com.google.common.base.w.E(threadFactory);
        return this;
    }

    public s1 i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f59539d = (Thread.UncaughtExceptionHandler) com.google.common.base.w.E(uncaughtExceptionHandler);
        return this;
    }
}
