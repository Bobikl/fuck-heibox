package com.tencent.qimei.n;

import android.util.Log;
import com.tencent.qimei.log.IObservableLog;
import com.tencent.qimei.upload.BuildConfig;
import java.util.Locale;

/* JADX INFO: compiled from: ELog.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f101287a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f101288b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static IObservableLog f101289c;

    public static int a(StackTraceElement[] stackTraceElementArr, Class cls) {
        for (int i10 = 5; i10 < stackTraceElementArr.length; i10++) {
            String className = stackTraceElementArr[i10].getClassName();
            if (!(cls.equals(Log.class) && i10 < stackTraceElementArr.length - 1 && stackTraceElementArr[i10 + 1].getClassName().equals(Log.class.getName())) && className.equals(cls.getName())) {
                return i10 + 1;
            }
        }
        return -1;
    }

    public static void a(IObservableLog iObservableLog) {
        f101289c = iObservableLog;
    }

    public static void a(String str, int i10, String str2, Object... objArr) {
    }

    public static void a(String str, String str2, Object... objArr) {
        if (a()) {
            Log.e(BuildConfig.SDK_ID, c("Qimei-Core-Error: " + str + " " + str2, objArr));
        }
    }

    public static void a(String str, Object... objArr) {
    }

    public static void a(Throwable th2) {
        if (th2 != null) {
            if (a()) {
                th2.printStackTrace();
            } else {
                b(th2.getMessage(), new Object[0]);
            }
        }
    }

    public static synchronized void a(boolean z10) {
        Log.i(BuildConfig.SDK_ID, "beacon logAble: " + z10);
        f101287a = z10;
    }

    public static boolean a() {
        return d();
    }

    public static StackTraceElement b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int iA = a(stackTrace, a.class);
        if (iA == -1 && (iA = a(stackTrace, Log.class)) == -1) {
            return null;
        }
        return stackTrace[iA];
    }

    public static void b(String str, String str2, Object... objArr) {
        if (a()) {
            Log.i(BuildConfig.SDK_ID, c("Qimei-Core-Info: " + str + " " + str2, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
    }

    public static synchronized void b(boolean z10) {
        f101288b = z10;
    }

    public static String c() {
        StackTraceElement stackTraceElementB;
        if (!e() || (stackTraceElementB = b()) == null) {
            return "";
        }
        String fileName = stackTraceElementB.getFileName();
        String str = fileName != null ? fileName : "";
        String methodName = stackTraceElementB.getMethodName();
        if (methodName.contains("$")) {
            methodName = methodName.substring(methodName.indexOf("$") + 1, methodName.lastIndexOf("$") - 2);
        }
        return "(" + str + ":" + stackTraceElementB.getLineNumber() + ")" + methodName + " ";
    }

    public static String c(String str, Object... objArr) {
        String str2;
        String strC = c();
        if (str == null) {
            str2 = strC + "msg is null";
        } else if (objArr == null || objArr.length == 0) {
            str2 = strC + str;
        } else {
            str2 = strC + String.format(Locale.US, str, objArr);
        }
        IObservableLog iObservableLog = f101289c;
        if (iObservableLog != null) {
            iObservableLog.onLog(str2);
        }
        return str2;
    }

    public static void c(String str, String str2, Object... objArr) {
    }

    public static void d(String str, Object... objArr) {
    }

    public static synchronized boolean d() {
        return f101287a;
    }

    public static void e(String str, Object... objArr) {
    }

    public static synchronized boolean e() {
        return f101288b;
    }
}
