package anet.channel.util;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class ALog {
    private static Object LOG_BREAK;
    private static boolean canUseTlog;
    private static boolean isPrintLog;
    private static volatile ILog log;
    public static Logcat logcat;

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
    public static class Level {
        public static final int D = 1;
        public static final int E = 4;
        public static final int I = 2;
        public static final int N = 5;
        public static final int V = 0;
        public static final int W = 3;
    }

    /* JADX INFO: compiled from: Taobao */
    public static class Logcat implements ILog {
        int defaultLevel = 1;

        @Override // anet.channel.util.ALog.ILog
        public void d(String str, String str2) {
            Log.d(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        public void e(String str, String str2) {
            Log.e(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        public void e(String str, String str2, Throwable th2) {
            Log.e(str, str2, th2);
        }

        @Override // anet.channel.util.ALog.ILog
        public void i(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isPrintLog(int i10) {
            return i10 >= this.defaultLevel;
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isValid() {
            return true;
        }

        @Override // anet.channel.util.ALog.ILog
        public void setLogLevel(int i10) {
            if (i10 < 0 || i10 > 5) {
                this.defaultLevel = 5;
            } else {
                this.defaultLevel = i10;
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void w(String str, String str2) {
            Log.w(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        public void w(String str, String str2, Throwable th2) {
            Log.w(str, str2, th2);
        }
    }

    static {
        Logcat logcat2 = new Logcat();
        logcat = logcat2;
        log = logcat2;
        LOG_BREAK = "|";
        isPrintLog = true;
        canUseTlog = true;
    }

    private static String buildLogMsg(String str, String str2, Object... objArr) {
        if (str == null && str2 == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(64);
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(LOG_BREAK);
            sb2.append("[seq:");
            sb2.append(str2);
            sb2.append("]");
        }
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
                Object obj = objArr[i10];
                if (obj == null) {
                    obj = "";
                }
                sb2.append(obj);
                sb2.append(":");
                Object obj2 = objArr[i11];
                if (obj2 == null) {
                    obj2 = "";
                }
                sb2.append(obj2);
                i10 += 2;
            }
            if (i10 < objArr.length) {
                sb2.append(" ");
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    private static String buildLogTag(String str) {
        return str;
    }

    public static void d(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(1) || log == null) {
            return;
        }
        log.d(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    public static void e(String str, String str2, String str3, Throwable th2, Object... objArr) {
        if (!isPrintLog(4) || log == null) {
            return;
        }
        log.e(buildLogTag(str), buildLogMsg(str2, str3, objArr), th2);
    }

    public static void e(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(4) || log == null) {
            return;
        }
        log.e(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    public static ILog getLog() {
        return log;
    }

    public static void i(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(2) || log == null) {
            return;
        }
        log.i(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    public static boolean isPrintLog(int i10) {
        if (isPrintLog && log != null) {
            return log.isPrintLog(i10);
        }
        return false;
    }

    public static void setLevel(int i10) {
        if (log != null) {
            log.setLogLevel(i10);
        }
    }

    public static void setLog(ILog iLog) {
        if (iLog == null) {
            return;
        }
        if ((canUseTlog || !iLog.getClass().getSimpleName().toLowerCase().contains("tlog")) && iLog.isValid()) {
            log = iLog;
        }
    }

    public static void setPrintLog(boolean z10) {
        isPrintLog = z10;
    }

    @Deprecated
    public static void setUseTlog(boolean z10) {
        if (z10) {
            canUseTlog = true;
        } else {
            canUseTlog = false;
            log = logcat;
        }
    }

    public static void w(String str, String str2, String str3, Throwable th2, Object... objArr) {
        if (!isPrintLog(3) || log == null) {
            return;
        }
        log.w(buildLogTag(str), buildLogMsg(str2, str3, objArr), th2);
    }

    public static void w(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(3) || log == null) {
            return;
        }
        log.w(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }
}
