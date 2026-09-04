package io.flutter;

import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class Log {
    public static int ASSERT = 7;
    public static int DEBUG = 3;
    public static int ERROR = 6;
    public static int INFO = 4;
    public static int VERBOSE = 2;
    public static int WARN = 5;
    private static int logLevel = 3;

    public static void d(@n0 String str, @n0 String str2) {
    }

    public static void d(@n0 String str, @n0 String str2, @n0 Throwable th2) {
    }

    public static void e(@n0 String str, @n0 String str2) {
        android.util.Log.e(str, str2);
    }

    public static void e(@n0 String str, @n0 String str2, @n0 Throwable th2) {
        android.util.Log.e(str, str2, th2);
    }

    @n0
    public static String getStackTraceString(@p0 Throwable th2) {
        return android.util.Log.getStackTraceString(th2);
    }

    public static void i(@n0 String str, @n0 String str2) {
    }

    public static void i(@n0 String str, @n0 String str2, @n0 Throwable th2) {
    }

    public static void println(@n0 int i10, @n0 String str, @n0 String str2) {
    }

    public static void setLogLevel(int i10) {
        logLevel = i10;
    }

    public static void v(@n0 String str, @n0 String str2) {
    }

    public static void v(@n0 String str, @n0 String str2, @n0 Throwable th2) {
    }

    public static void w(@n0 String str, @n0 String str2) {
        android.util.Log.w(str, str2);
    }

    public static void w(@n0 String str, @n0 String str2, @n0 Throwable th2) {
        android.util.Log.w(str, str2, th2);
    }

    public static void wtf(@n0 String str, @n0 String str2) {
        android.util.Log.wtf(str, str2);
    }

    public static void wtf(@n0 String str, @n0 String str2, @n0 Throwable th2) {
        android.util.Log.wtf(str, str2, th2);
    }
}
