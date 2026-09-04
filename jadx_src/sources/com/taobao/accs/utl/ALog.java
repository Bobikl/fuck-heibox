package com.taobao.accs.utl;

import android.util.Log;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class ALog {
    public static volatile boolean isPrintLog = true;
    private static final String preTag = "NAccs.";
    private static volatile ILog sLog;

    /* JADX INFO: compiled from: Taobao */
    public interface ILog {
        void d(String str, String str2);

        void e(String str, String str2);

        void e(String str, String str2, Throwable th2);

        void i(String str, String str2);

        boolean isPrintLog(int i10);

        boolean isValid();

        void setLogLevel(int i10);

        void w(String str, String str2);

        void w(String str, String str2, Throwable th2);
    }

    /* JADX INFO: compiled from: Taobao */
    public enum Level {
        V,
        D,
        I,
        W,
        E,
        L
    }

    private static String buildLogMsg(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        if (objArr != null) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb2.append(" ");
                sb2.append(formatKv(objArr[i10], objArr[i11]));
                i10 = i11 + 1;
            }
            if (i10 == objArr.length - 1) {
                sb2.append(" ");
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    private static String buildLogTag(String str) {
        return preTag + str;
    }

    public static void d(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            String strBuildLogTag = buildLogTag(str);
            String strBuildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.d(strBuildLogTag, strBuildLogMsg);
            } else {
                Log.d(strBuildLogTag, strBuildLogMsg);
            }
        }
    }

    public static void e(String str, String str2, Throwable th2, Object... objArr) {
        if (isPrintLog()) {
            String strBuildLogTag = buildLogTag(str);
            String strBuildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.e(strBuildLogTag, strBuildLogMsg, th2);
            } else {
                Log.e(strBuildLogTag, strBuildLogMsg, th2);
            }
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            String strBuildLogTag = buildLogTag(str);
            String strBuildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.e(strBuildLogTag, strBuildLogMsg);
            } else {
                Log.e(strBuildLogTag, strBuildLogMsg);
            }
        }
    }

    private static String formatKv(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb2.append(obj);
        sb2.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb2.append(obj2);
        return sb2.toString();
    }

    public static void i(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            String strBuildLogTag = buildLogTag(str);
            String strBuildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.i(strBuildLogTag, strBuildLogMsg);
            } else {
                Log.i(strBuildLogTag, strBuildLogMsg);
            }
        }
    }

    public static boolean isPrintLog() {
        ILog iLog = sLog;
        return iLog != null ? iLog.isPrintLog(4) : isPrintLog;
    }

    public static boolean isPrintLog(Level level) {
        ILog iLog = sLog;
        return iLog != null ? iLog.isPrintLog(4) : isPrintLog;
    }

    public static void setLog(ILog iLog) {
        if (iLog == null || !iLog.isValid()) {
            return;
        }
        sLog = iLog;
    }

    public static void setPrintLog(boolean z10) {
        isPrintLog = z10;
    }

    public static void v(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            Log.v(buildLogTag(str), buildLogMsg(str2, objArr));
        }
    }

    public static void w(String str, String str2, Throwable th2, Object... objArr) {
        if (isPrintLog()) {
            String strBuildLogTag = buildLogTag(str);
            String strBuildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.w(strBuildLogTag, strBuildLogMsg, th2);
            } else {
                Log.w(strBuildLogTag, strBuildLogMsg, th2);
            }
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            String strBuildLogTag = buildLogTag(str);
            String strBuildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.w(strBuildLogTag, strBuildLogMsg);
            } else {
                Log.w(strBuildLogTag, strBuildLogMsg);
            }
        }
    }
}
