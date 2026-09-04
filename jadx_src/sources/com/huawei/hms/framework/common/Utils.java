package com.huawei.hms.framework.common;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public class Utils {
    private static final String TAG = "Utils";

    public static long getCurrentTime(boolean z10) {
        return z10 ? SystemClock.elapsedRealtime() : System.currentTimeMillis();
    }

    public static boolean is64Bit(Context context) {
        if (context == null) {
            Logger.e(TAG, "Null context, please check it.");
            return false;
        }
        if (context.getApplicationContext() != null) {
            context.getApplicationContext();
        }
        return Process.is64Bit();
    }
}
