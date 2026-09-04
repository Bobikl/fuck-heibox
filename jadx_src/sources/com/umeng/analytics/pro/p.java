package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;

/* JADX INFO: compiled from: CrashHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public class p implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f104943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f104944b;

    public p() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f104943a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private void a(Throwable th2) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f104944b.a(th2);
        } else {
            this.f104944b.a(null);
        }
    }

    public void a(t tVar) {
        this.f104944b = tVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        a(th2);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f104943a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == Thread.getDefaultUncaughtExceptionHandler()) {
            return;
        }
        this.f104943a.uncaughtException(thread, th2);
    }
}
