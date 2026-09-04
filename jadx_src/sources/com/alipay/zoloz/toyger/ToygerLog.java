package com.alipay.zoloz.toyger;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerLog {
    public static final String DIAGNOSE = "diagnose";
    private static final String TAG = "Toyger";
    private static final String TAG_PREFIX = "Toyger_";
    private static ToygerLogger sTargetLogger = new AndroidLogger();

    public static final class AndroidLogger extends ToygerLogger {
        private AndroidLogger() {
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int debug(String str, String str2) {
            return Log.d(str, str2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int error(String str, String str2) {
            return Log.e(str, str2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        protected String getStackTraceString(Throwable th2) {
            return Log.getStackTraceString(th2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int info(String str, String str2) {
            return Log.i(str, str2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int verbose(String str, String str2) {
            return Log.v(str, str2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int warn(String str, String str2) {
            return Log.w(str, str2);
        }
    }

    private ToygerLog() {
    }

    public static void d(String str) {
        sTargetLogger.d(TAG, str);
    }

    public static void d(String str, String str2) {
        sTargetLogger.d(TAG_PREFIX + str, str2);
    }

    public static void e(String str) {
        sTargetLogger.e(TAG, str);
    }

    public static void e(String str, String str2) {
        sTargetLogger.e(TAG_PREFIX + str, str2);
    }

    public static void e(String str, String str2, Throwable th2) {
        sTargetLogger.e(TAG_PREFIX + str, str2, th2);
    }

    public static void e(String str, Throwable th2) {
        sTargetLogger.e(TAG_PREFIX + str, th2);
    }

    public static void e(Throwable th2) {
        sTargetLogger.e(TAG, th2);
    }

    public static void i(String str) {
        sTargetLogger.i(TAG, str);
    }

    public static void i(String str, String str2) {
        sTargetLogger.i(TAG_PREFIX + str, str2);
    }

    public static void setLogger(ToygerLogger toygerLogger) {
        sTargetLogger = toygerLogger;
    }

    public static void v(String str) {
        sTargetLogger.v(TAG, str);
    }

    public static void v(String str, String str2) {
        sTargetLogger.v(TAG_PREFIX + str, str2);
    }

    public static void w(String str) {
        sTargetLogger.w(TAG, str);
    }

    public static void w(String str, String str2) {
        sTargetLogger.w(TAG_PREFIX + str, str2);
    }

    public static void w(String str, String str2, Throwable th2) {
        sTargetLogger.w(TAG_PREFIX + str, str2, th2);
    }

    public static void w(String str, Throwable th2) {
        sTargetLogger.w(TAG_PREFIX + str, th2);
    }

    public static void w(Throwable th2) {
        sTargetLogger.w(TAG, th2);
    }
}
