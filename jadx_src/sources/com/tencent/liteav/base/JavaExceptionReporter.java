package com.tencent.liteav.base;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("base::android")
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final Thread.UncaughtExceptionHandler mParent;

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z10) {
        this.mParent = uncaughtExceptionHandler;
        this.mCrashAfterReport = z10;
    }

    private static void installHandler(boolean z10) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z10));
    }

    public static void reportStackTrace(String str) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (!this.mHandlingException) {
            this.mHandlingException = true;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mParent;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
