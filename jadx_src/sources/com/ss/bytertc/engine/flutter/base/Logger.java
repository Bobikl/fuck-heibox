package com.ss.bytertc.engine.flutter.base;

import android.util.Log;
import androidx.annotation.RestrictTo;
import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class Logger {
    private static final String TAG = "ByteRTCF";

    private Logger() {
    }

    public static void d(String str, String str2) {
        Log.d(TAG, Constants.ARRAY_TYPE + str + "] " + str2);
    }

    public static void d(String str, String str2, Throwable th2) {
        Log.d(TAG, Constants.ARRAY_TYPE + str + "] " + str2, th2);
    }

    public static void e(String str, String str2) {
        Log.e(TAG, Constants.ARRAY_TYPE + str + "] " + str2);
    }
}
