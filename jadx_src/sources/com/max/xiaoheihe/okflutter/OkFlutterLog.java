package com.max.xiaoheihe.okflutter;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes13.dex */
public class OkFlutterLog {
    public static int ASSERT = 7;
    public static int DEBUG = 3;
    public static int ERROR = 6;
    public static int INFO = 4;
    public static int VERBOSE = 2;
    public static int WARN = 5;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int logLevel = 3;
    private static boolean sEnableDebugLogging = false;
    public static long startTime;

    public static void d(@n0 String str, @n0 String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 47738, new Class[]{String.class, String.class}, Void.TYPE).isSupported && logLevel <= 3) {
            Log.d(str, str2);
        }
    }

    public static void d(@n0 String str, @n0 String str2, @n0 Throwable th2) {
    }

    public static void e(@n0 String str, @n0 String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 47741, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.e(str, str2);
    }

    public static void e(@n0 String str, @n0 String str2, @n0 Throwable th2) {
        if (PatchProxy.proxy(new Object[]{str, str2, th2}, null, changeQuickRedirect, true, 47742, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.e(str, str2, th2);
    }

    @n0
    public static String getStackTraceString(@p0 Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, 47745, new Class[]{Throwable.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Log.getStackTraceString(th2);
    }

    public static void i(@n0 String str, @n0 String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 47736, new Class[]{String.class, String.class}, Void.TYPE).isSupported && logLevel <= 4) {
            Log.i(str, str2);
        }
    }

    public static void i(@n0 String str, @n0 String str2, @n0 Throwable th2) {
        if (!PatchProxy.proxy(new Object[]{str, str2, th2}, null, changeQuickRedirect, true, 47737, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE).isSupported && logLevel <= 4) {
            Log.i(str, str2, th2);
        }
    }

    public static boolean isDebugLoggingEnabled() {
        return sEnableDebugLogging;
    }

    public static void println(@n0 int i10, @n0 String str, @n0 String str2) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10), str, str2}, null, changeQuickRedirect, true, 47733, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE).isSupported && logLevel <= i10) {
            Log.println(i10, str, str2);
        }
    }

    public static void setLogLevel(int i10) {
        logLevel = i10;
    }

    public static void v(@n0 String str, @n0 String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 47734, new Class[]{String.class, String.class}, Void.TYPE).isSupported && logLevel <= 2) {
            Log.v(str, str2);
        }
    }

    public static void v(@n0 String str, @n0 String str2, @n0 Throwable th2) {
        if (!PatchProxy.proxy(new Object[]{str, str2, th2}, null, changeQuickRedirect, true, 47735, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE).isSupported && logLevel <= 2) {
            Log.v(str, str2, th2);
        }
    }

    public static void w(@n0 String str, @n0 String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 47739, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.w(str, str2);
    }

    public static void w(@n0 String str, @n0 String str2, @n0 Throwable th2) {
        if (PatchProxy.proxy(new Object[]{str, str2, th2}, null, changeQuickRedirect, true, 47740, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.w(str, str2, th2);
    }

    public static void wtf(@n0 String str, @n0 String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 47743, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.wtf(str, str2);
    }

    public static void wtf(@n0 String str, @n0 String str2, @n0 Throwable th2) {
        if (PatchProxy.proxy(new Object[]{str, str2, th2}, null, changeQuickRedirect, true, 47744, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.wtf(str, str2, th2);
    }
}
