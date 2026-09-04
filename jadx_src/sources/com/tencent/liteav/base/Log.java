package com.tencent.liteav.base;

import com.meituan.robust.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final String sDeprecatedTagPrefix = "cr.";
    private static final String sTagPrefix = "cr_";
    private static final boolean useChromiumLog = true;

    private Log() {
    }

    public static void d(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(3, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    public static void e(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(6, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    private static String formatLog(String str, Throwable th2, Object... objArr) {
        if (objArr != null) {
            return ((th2 != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr);
        }
        return str;
    }

    private static String formatLogWithStack(String str, Throwable th2, Object... objArr) {
        return Constants.ARRAY_TYPE + getCallOrigin() + "] " + formatLog(str, th2, objArr);
    }

    private static String getCallOrigin() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Log.class.getName();
        int i10 = 0;
        while (i10 < stackTrace.length) {
            if (stackTrace[i10].getClassName().equals(name)) {
                i10 += 3;
                break;
            }
            i10++;
        }
        return stackTrace[i10].getFileName() + ":" + stackTrace[i10].getLineNumber();
    }

    public static String getStackTraceString(Throwable th2) {
        return android.util.Log.getStackTraceString(th2);
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static void i(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(4, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    private static boolean isDebug() {
        return true;
    }

    public static boolean isLoggable(String str, int i10) {
        if (isDebug() || i10 > 4) {
            return android.util.Log.isLoggable(str, i10);
        }
        return false;
    }

    private static native void nativeWriteLogToNative(int i10, String str, String str2);

    public static String normalizeTag(String str) {
        if (str.startsWith(sTagPrefix)) {
            return str;
        }
        return sTagPrefix + str.substring(str.startsWith(sDeprecatedTagPrefix) ? 3 : 0, str.length());
    }

    public static void v(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(2, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    public static void w(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(5, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    public static void wtf(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(7, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }
}
