package com.alipay.mobile.android.verify.sdk;

/* JADX INFO: compiled from: CrashHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f39394a = Thread.getDefaultUncaughtExceptionHandler();

    public void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (th2 != null) {
            com.alipay.mobile.android.verify.logger.f.k("CrashHandler").k(th2, "uncaught exception", new Object[0]);
        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f39394a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
