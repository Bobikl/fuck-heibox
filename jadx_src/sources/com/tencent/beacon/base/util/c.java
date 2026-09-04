package com.tencent.beacon.base.util;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: ELog.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f98948a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static BeaconLogger f98949b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f98950c = false;

    private c() {
    }

    private static int a(StackTraceElement[] stackTraceElementArr, Class cls) {
        for (int i10 = 5; i10 < stackTraceElementArr.length; i10++) {
            String className = stackTraceElementArr[i10].getClassName();
            if (!(cls.equals(Log.class) && i10 < stackTraceElementArr.length - 1 && stackTraceElementArr[i10 + 1].getClassName().equals(Log.class.getName())) && className.equals(cls.getName())) {
                return i10 + 1;
            }
        }
        return -1;
    }

    public static BeaconLogger a() {
        return f98949b;
    }

    public static void a(BeaconLogger beaconLogger) {
        f98949b = beaconLogger;
    }

    public static void a(String str, int i10, String str2, Object... objArr) {
        if (d()) {
            BeaconLogger beaconLogger = f98949b;
            if (beaconLogger == null) {
                Log.d("beacon", c(str + " step: " + i10 + ". " + str2, objArr));
                return;
            }
            beaconLogger.d("beacon", c(str + " step: " + i10 + ". " + str2, objArr));
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        if (d()) {
            BeaconLogger beaconLogger = f98949b;
            if (beaconLogger == null) {
                Log.d("beacon", c(str + " " + str2, objArr));
                return;
            }
            beaconLogger.d("beacon", c(str + " " + str2, objArr));
        }
    }

    public static void a(String str, Object... objArr) {
        if (d()) {
            BeaconLogger beaconLogger = f98949b;
            if (beaconLogger == null) {
                Log.d("beacon", c(str, objArr));
            } else {
                beaconLogger.d("beacon", c(str, objArr));
            }
        }
    }

    public static void a(Throwable th2) {
        if (th2 == null || !d()) {
            return;
        }
        BeaconLogger beaconLogger = f98949b;
        if (beaconLogger == null) {
            th2.printStackTrace();
        } else {
            beaconLogger.printStackTrace(th2);
        }
    }

    public static synchronized void a(boolean z10) {
        Log.i("beacon", "beacon logAble: " + z10);
        f98950c = z10;
    }

    public static void b(String str, Object... objArr) {
        if (d()) {
            BeaconLogger beaconLogger = f98949b;
            if (beaconLogger == null) {
                Log.e("beacon", c(str, objArr));
            } else {
                beaconLogger.e("beacon", c(str, objArr));
            }
        }
    }

    public static synchronized void b(boolean z10) {
        f98948a = z10;
    }

    public static synchronized boolean b() {
        return f98950c;
    }

    public static String c(String str, Object... objArr) {
        String strF = f();
        if (str == null) {
            return strF + "msg is null";
        }
        if (objArr == null || objArr.length == 0) {
            return strF + str;
        }
        return strF + String.format(Locale.US, str, objArr);
    }

    public static synchronized boolean c() {
        return f98948a;
    }

    public static void d(String str, Object... objArr) {
        if (d()) {
            BeaconLogger beaconLogger = f98949b;
            if (beaconLogger == null) {
                Log.i("beacon", c(str, objArr));
            } else {
                beaconLogger.i("beacon", c(str, objArr));
            }
        }
    }

    private static boolean d() {
        return b();
    }

    private static StackTraceElement e() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int iA = a(stackTrace, c.class);
        if (iA == -1 && (iA = a(stackTrace, Log.class)) == -1) {
            return null;
        }
        return stackTrace[iA];
    }

    public static void e(String str, Object... objArr) {
        if (d()) {
            BeaconLogger beaconLogger = f98949b;
            if (beaconLogger == null) {
                Log.w("beacon", c(str, objArr));
            } else {
                beaconLogger.w("beacon", c(str, objArr));
            }
        }
    }

    private static String f() {
        StackTraceElement stackTraceElementE;
        if (!c() || (stackTraceElementE = e()) == null) {
            return "";
        }
        String fileName = stackTraceElementE.getFileName();
        String str = fileName != null ? fileName : "";
        String methodName = stackTraceElementE.getMethodName();
        if (methodName.contains("$")) {
            methodName = methodName.substring(methodName.indexOf("$") + 1, methodName.lastIndexOf("$") - 2);
        }
        return "(" + str + ":" + stackTraceElementE.getLineNumber() + ")" + methodName + " ";
    }
}
