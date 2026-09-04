package com.apm.lite;

/* JADX INFO: loaded from: classes6.dex */
public interface ICrashFilter {
    boolean onJavaCrashFilter(Throwable th2, Thread thread);

    boolean onNativeCrashFilter(String str, String str2);
}
