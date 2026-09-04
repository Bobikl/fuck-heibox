package com.ishumei.smantifraud.dfp;

import android.content.Context;
import android.util.Log;
import com.ishumei.smantifraud.SmAntiFraud;
import com.ishumei.smantifraud.l111l1111llIl.l111l11111lIl;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class SMSDK {
    private static final String TAG = "Smlog";

    static {
        try {
            System.loadLibrary("smsdk");
        } catch (Throwable th2) {
            synchronized (SmAntiFraud.class) {
                l111l11111lIl.l1111l111111Il = "libsmsdk.so load failed.;" + th2;
                Log.e(TAG, "libsmsdk.so load failed.", th2);
            }
        }
    }

    public static native synchronized boolean ma();

    public static String v1(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j10) {
        try {
            return w1(context, str, str2, str3, str4, str5, str6, str7, j10);
        } catch (Throwable th2) {
            return String.valueOf(th2);
        }
    }

    public static String v3(Context context, String str, String str2, String str3, String str4) {
        try {
            return w3(context, str, str2, str3, str4);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static native synchronized String w1(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j10);

    private static native synchronized String w3(Context context, String str, String str2, String str3, String str4);

    public static String x3(String str, String str2) throws IOException {
        try {
            return x4(str2, str);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }

    private static native synchronized String x4(String str, String str2);

    public static String x5(String str, String str2) throws IOException {
        try {
            return x6(str2, str);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }

    private static native synchronized String x6(String str, String str2);
}
