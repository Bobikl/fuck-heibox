package com.tencent.qcloud.core.logger;

import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class QCloudLogger {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final List<LogAdapter> logAdapters;
    private static final AndroidLogcatAdapter logcatAdapter;

    static {
        ArrayList arrayList = new ArrayList();
        logAdapters = arrayList;
        AndroidLogcatAdapter androidLogcatAdapter = new AndroidLogcatAdapter();
        logcatAdapter = androidLogcatAdapter;
        arrayList.add(androidLogcatAdapter);
    }

    private QCloudLogger() {
    }

    public static void addAdapter(LogAdapter logAdapter) {
        if (logAdapter != null) {
            synchronized (LogAdapter.class) {
                boolean z10 = false;
                Iterator<LogAdapter> it = logAdapters.iterator();
                while (it.hasNext()) {
                    if (it.next().getClass().equals(logAdapter.getClass())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    logAdapters.add(logAdapter);
                }
            }
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        print(3, str, null, str2, objArr);
    }

    public static void d(String str, Throwable th2, String str2, Object... objArr) {
        print(3, str, th2, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        print(6, str, null, str2, objArr);
    }

    public static void e(String str, Throwable th2, String str2, Object... objArr) {
        print(6, str, th2, str2, objArr);
    }

    public static <T extends LogAdapter> T getAdapter(Class<T> cls) {
        synchronized (LogAdapter.class) {
            Iterator<LogAdapter> it = logAdapters.iterator();
            while (it.hasNext()) {
                T t10 = (T) it.next();
                if (t10.getClass().equals(cls)) {
                    return t10;
                }
            }
            return null;
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        print(4, str, null, str2, objArr);
    }

    public static void i(String str, Throwable th2, String str2, Object... objArr) {
        print(4, str, th2, str2, objArr);
    }

    public static boolean isLoggableOnLogcat(int i10, String str) {
        return logcatAdapter.isLoggable(i10, str);
    }

    private static void print(int i10, String str, @p0 Throwable th2, String str2, Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    str2 = String.format(str2, objArr);
                }
            } catch (Exception unused) {
                str2 = str2 + ": !!!! Log format exception: ";
            }
        }
        synchronized (LogAdapter.class) {
            for (LogAdapter logAdapter : logAdapters) {
                if (logAdapter.isLoggable(i10, str)) {
                    logAdapter.log(i10, str, str2, th2);
                }
            }
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        print(2, str, null, str2, objArr);
    }

    public static void v(String str, Throwable th2, String str2, Object... objArr) {
        print(2, str, th2, str2, objArr);
    }

    public static void w(String str, String str2, Object... objArr) {
        print(5, str, null, str2, objArr);
    }

    public static void w(String str, Throwable th2, String str2, Object... objArr) {
        print(5, str, th2, str2, objArr);
    }
}
