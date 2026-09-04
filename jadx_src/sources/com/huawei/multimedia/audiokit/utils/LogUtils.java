package com.huawei.multimedia.audiokit.utils;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes7.dex */
public class LogUtils {
    public static final int DEBUG = 4;
    public static final int ERROR = 1;
    private static final String ERROR_MESSAGE = "log message error : ";
    public static final int INFO = 3;
    public static final int LOG_LEVEL = 6;
    public static final int VERBOSE = 5;
    public static final int WARN = 2;

    private LogUtils() {
    }

    public static void debug(String str, String str2) {
        Log.d(str, str2);
    }

    public static <T> void debug(String str, String str2, T... tArr) {
        if (str2 != null) {
            Log.d(str, getMessageString(str2, tArr));
        }
    }

    public static void error(String str, String str2) {
        Log.e(str, str2);
    }

    public static <T> void error(String str, String str2, T... tArr) {
        if (str2 != null) {
            Log.e(str, getMessageString(str2, tArr));
        }
    }

    private static <T> String getMessageString(String str, T[] tArr) {
        try {
            return String.format(Locale.ENGLISH, str.replaceAll("\\{\\}", "%s"), tArr);
        } catch (IllegalFormatException | PatternSyntaxException e10) {
            return ERROR_MESSAGE + e10.getMessage();
        }
    }

    public static void info(String str, String str2) {
        Log.i(str, str2);
    }

    public static <T> void info(String str, String str2, T... tArr) {
        if (str2 != null) {
            Log.i(str, getMessageString(str2, tArr));
        }
    }

    public static void verbose(String str, String str2) {
        Log.v(str, str2);
    }

    public static void warn(String str, String str2) {
        Log.w(str, str2);
    }
}
