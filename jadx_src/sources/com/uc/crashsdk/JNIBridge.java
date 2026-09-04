package com.uc.crashsdk;

import android.os.Looper;
import android.os.Process;
import com.uc.crashsdk.export.LogType;
import java.io.File;
import java.util.Locale;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class JNIBridge {
    private static int addCachedInfo(String str, String str2) {
        return a.b(str, str2);
    }

    private static int addDumpFile(String str, String str2, boolean z10, boolean z11, int i10, boolean z12) {
        return a.a(str, str2, z10, z11, i10, z12);
    }

    private static void addHeaderInfo(String str, String str2) {
        a.a(str, str2);
    }

    public static long cmd(int i10) {
        return nativeCmd(i10, 0L, null, null);
    }

    public static long cmd(int i10, String str) {
        return nativeCmd(i10, 0L, str, null);
    }

    private static int createCachedInfo(String str, int i10, int i11) {
        return a.a(str, i10, i11);
    }

    private static boolean generateCustomLog(String str, String str2, long j10, String str3, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return e.a(stringBuffer, str2, j10, a.c(str3), a.c(str4), a.c(str5), str6);
    }

    protected static String getCallbackInfo(String str, boolean z10) {
        return a.a(str, z10);
    }

    private static String getDatasForClientJavaLog(int i10, String str) {
        boolean zEquals = "$all$".equals(str);
        if (i10 == 1) {
            return zEquals ? a.h() : a.a(str);
        }
        if (i10 == 2) {
            return zEquals ? a.j() : a.a(str, true);
        }
        if (i10 == 3) {
            return zEquals ? a.l() : a.b(str);
        }
        if (i10 == 4) {
            return e.d(str) ? "1" : "0";
        }
        return null;
    }

    private static String getJavaStackTrace(Thread thread, int i10) {
        if (i10 != 0 && i10 == Process.myPid()) {
            thread = Looper.getMainLooper().getThread();
        }
        if (thread != null) {
            return e.a(thread.getStackTrace(), "getJavaStackTrace").toString();
        }
        return null;
    }

    public static native boolean nativeAddCachedInfo(String str, String str2);

    public static native int nativeAddCallbackInfo(String str, int i10, long j10, int i11);

    public static native int nativeAddDumpFile(String str, String str2, boolean z10, boolean z11, int i10, boolean z12);

    public static native void nativeAddHeaderInfo(String str, String str2);

    public static native boolean nativeChangeState(String str, String str2, boolean z10);

    public static native void nativeClientCloseConnection(long j10);

    public static native long nativeClientCreateConnection(String str, String str2, String str3, int i10);

    public static native int nativeClientWriteData(long j10, String str);

    public static native void nativeCloseFile(int i10);

    public static native long nativeCmd(int i10, long j10, String str, Object[] objArr);

    public static native void nativeCrash(int i10, int i11);

    public static native int nativeCreateCachedInfo(String str, int i10, int i11);

    public static native String nativeDumpThreads(String str, long j10);

    public static native int nativeGenerateUnexpLog(long j10, int i10);

    public static native String nativeGet(int i10, long j10, String str);

    public static native String nativeGetCallbackInfo(String str, long j10, int i10, boolean z10);

    public static native boolean nativeIsCrashing();

    public static native boolean nativeLockFile(int i10, boolean z10);

    public static native int nativeLog(int i10, String str, String str2);

    public static native int nativeOpenFile(String str);

    public static native long nativeSet(int i10, long j10, String str, Object[] objArr);

    public static native void nativeSetForeground(boolean z10);

    private static void onCrashLogGenerated(String str, String str2, String str3, boolean z10) {
        boolean zEquals = e.h().equals(str2);
        boolean zEquals2 = LogType.NATIVE_TYPE.equals(str3);
        if (!e.F()) {
            if (zEquals && zEquals2) {
                try {
                    f.c(true);
                } catch (Throwable th2) {
                    com.uc.crashsdk.a.g.a(th2);
                }
            }
            str = e.a(str);
        }
        d.a(str, str2, str3);
        if (e.F()) {
            return;
        }
        if (z10 || (!zEquals && g.s())) {
            e.a(false, false);
        } else if (zEquals) {
            e.b(zEquals2);
        }
    }

    private static void onCrashRestarting() {
        d.a(false);
        b.N();
    }

    private static void onKillProcess(String str, int i10, int i11) {
        String str2 = "onKillProcess. SIG: " + i11;
        if (e.a()) {
            com.uc.crashsdk.a.a.b("crashsdk", str2);
        } else {
            com.uc.crashsdk.a.a.a("crashsdk", str2);
        }
        StringBuilder sbF = e.f("onKillProcess");
        Locale locale = Locale.US;
        sbF.insert(0, String.format(locale, "State in disk: '%s'\n", b.p()));
        sbF.insert(0, String.format(locale, "SIG: %d, fg: %s, exiting: %s, main process: %s, time: %s\n", Integer.valueOf(i11), Boolean.valueOf(b.B()), Boolean.valueOf(b.u()), Boolean.valueOf(b.F()), e.n()));
        sbF.insert(0, String.format(locale, "Kill PID: %d (%s) by pid: %d (%s) tid: %d (%s)\n", Integer.valueOf(i10), e.a(i10), Integer.valueOf(Process.myPid()), e.a(Process.myPid()), Integer.valueOf(Process.myTid()), Thread.currentThread().getName()));
        String string = sbF.toString();
        if (e.a()) {
            com.uc.crashsdk.a.a.b("crashsdk", string);
        } else {
            com.uc.crashsdk.a.a.a("crashsdk", string);
        }
        if (b.L()) {
            return;
        }
        com.uc.crashsdk.a.g.a(new File(str), string.getBytes());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String onNativeEvent(int i10, long j10, Object[] objArr) {
        switch (i10) {
            case 1:
                return String.valueOf(Runtime.getRuntime().maxMemory());
            case 2:
                return e.d();
            case 3:
                if (objArr != null && objArr.length == 2) {
                    Object obj = objArr[0];
                    if (obj instanceof String) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof String) {
                            return e.a((String) obj, (String) obj2);
                        }
                    }
                }
                return null;
            case 4:
                return e.g();
            case 5:
                a.a(true);
                return null;
            case 6:
                return com.uc.crashsdk.a.g.d();
            case 7:
                com.uc.crashsdk.a.f.a(2, new com.uc.crashsdk.a.e(102), 8000L);
                e.r();
                return null;
            default:
                return null;
        }
    }

    private static int onPreClientCustomLog(String str, String str2, boolean z10) {
        g.a();
        e.a(false);
        if (e.a(str, str2, z10)) {
            return 0;
        }
        e.b(str, str2, z10);
        return 1;
    }

    private static int registerCurrentThread(String str, int i10) {
        return a.a(i10, str);
    }

    private static int registerInfoCallback(String str, int i10, long j10, int i11) {
        return a.a(str, i10, null, j10, i11);
    }

    public static long set(int i10, long j10) {
        return nativeSet(i10, j10, null, null);
    }

    public static long set(int i10, String str) {
        return nativeSet(i10, 0L, str, null);
    }

    public static long set(int i10, boolean z10) {
        return nativeSet(i10, z10 ? 1L : 0L, null, null);
    }
}
