package com.sina.weibo.sdk.b;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static boolean f96818ai = false;

    public static void a(String str, String str2) {
        if (f96818ai) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.d(str, (stackTraceElement.getFileName() + "(" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ": " + str2);
        }
    }

    public static void b(String str, String str2) {
        if (f96818ai) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.e(str, (stackTraceElement.getFileName() + "(" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ": " + str2);
        }
    }

    public static void setLoggerEnable(boolean z10) {
        f96818ai = z10;
    }
}
