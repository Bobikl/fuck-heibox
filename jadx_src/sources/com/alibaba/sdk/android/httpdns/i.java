package com.alibaba.sdk.android.httpdns;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ILogger f37964a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f37965c = -1;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static boolean f34c = false;

    public static void a(Throwable th2) {
        if (!f34c || th2 == null) {
            return;
        }
        th2.printStackTrace();
    }

    private static String c() {
        try {
            if (f37965c == -1) {
                int i10 = 0;
                for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                    if (stackTraceElement.getMethodName().equals("getTraceInfo")) {
                        f37965c = i10 + 1;
                        break;
                    }
                    i10++;
                }
            }
            StackTraceElement stackTraceElement2 = Thread.currentThread().getStackTrace()[f37965c + 1];
            return stackTraceElement2.getFileName() + ":" + stackTraceElement2.getLineNumber() + " - [" + stackTraceElement2.getMethodName() + "]";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static void d(String str) {
        if (f34c && str != null) {
            Log.d("HttpDnsSDK", Thread.currentThread().getId() + " - " + c() + " - " + str);
        }
        ILogger iLogger = f37964a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    public static void e(String str) {
        if (f34c && str != null) {
            Log.i("HttpDnsSDK", Thread.currentThread().getId() + " - " + c() + " - " + str);
        }
        ILogger iLogger = f37964a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    public static void f(String str) {
        if (f34c && str != null) {
            Log.e("HttpDnsSDK", Thread.currentThread().getId() + " - " + c() + " - " + str);
        }
        ILogger iLogger = f37964a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    static synchronized void setLogEnabled(boolean z10) {
        f34c = z10;
    }

    static void setLogger(ILogger iLogger) {
        f37964a = iLogger;
    }
}
